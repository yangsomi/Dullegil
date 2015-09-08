package edu.rapa.iot.dullegilapp.dao;

import java.util.ArrayList;

import edu.rapa.iot.dullegilapp.model.NFCTag;


/**
 * Created by skplanet on 2015-09-07.
 */

public class NfcDAO implements INfcDAO{
    @Override
    public int count() {
        return 0;
    }

    @Override
    public boolean create_nfc(NFCTag nfcTag) {
        return false;
    }

    @Override
    public boolean delete_nfc(int nfcNumber) {
        return false;
    }

    @Override
    public ArrayList<NFCTag> select_all_nfc() {
        return null;
    }

    @Override
    public NFCTag select_nfc(int nfcNumber) {
        return null;
    }

    @Override
    public boolean update_nfc(NFCTag nfcTag) {
        return false;
    }
}
