package edu.rapa.iot.dullegilapp;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private static final String TAG = "MainActivity";

    private NfcAdapter mAdapter;
    private PendingIntent pIntent;
    private IntentFilter[] mFilters;
    private String[][] mTechLists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = NfcAdapter.getDefaultAdapter(this);
        if(mAdapter == null){
            System.out.println("지원하지 않는 기기입니다.");
            finish();
        }

        mTechLists = new String[][] { new String[] { NfcA.class.getName() }};
        getNfcData(getIntent());
        
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "onNewIntent");

        setIntent(intent);
        getNfcData(intent);

    }

    private void getNfcData(Intent intent) {

        if(intent != null){
            System.out.println("getNfcData() call!!!");
            String action = intent.getAction();

            System.out.println(action);
            if (NfcAdapter.ACTION_NDEF_DISCOVERED.equals(action)
                    || NfcAdapter.ACTION_TECH_DISCOVERED.equals(action)
                    || NfcAdapter.ACTION_TAG_DISCOVERED.equals(action)) {

                Parcelable[] rawMsgs =
                        intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);

                NdefMessage[] msgs;
                if(rawMsgs != null){
                    msgs = new NdefMessage[rawMsgs.length];
                    for(int i=0; i<rawMsgs.length; i++){
                        msgs[i] = (NdefMessage) rawMsgs[i];
                    }

                } else{
                    byte[] empty = new byte[] {};
                    NdefRecord record = new NdefRecord(NdefRecord.TNF_UNKNOWN,
                            empty, empty, empty);
                    NdefMessage msg = new NdefMessage(new NdefRecord[] { record });
                    msgs = new NdefMessage[] { msg };
                }

                doAction(msgs);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        pIntent = PendingIntent.getActivity(this, 0, i, 0);

        IntentFilter filter = new IntentFilter(NfcAdapter.ACTION_NDEF_DISCOVERED);

        try{
            filter.addDataType("*/*");
        } catch(IntentFilter.MalformedMimeTypeException e){
            e.printStackTrace();
        }

        mFilters = new IntentFilter[] { filter};
        mAdapter.enableForegroundDispatch(this, pIntent, mFilters, mTechLists);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mAdapter.disableForegroundDispatch(this);
    }

    private void doAction(NdefMessage[] msgs) {
        String payload = new String(msgs[0].getRecords()[0].getPayload());
        System.out.println("payload: " + payload);

        if(payload.equals("stamp")){
            Toast.makeText(this, "NFC READ, message: " + payload, Toast.LENGTH_SHORT).show();
        }

    }



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
