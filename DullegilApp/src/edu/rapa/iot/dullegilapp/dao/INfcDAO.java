package edu.rapa.iot.dullegilapp.dao;

import java.util.ArrayList;

import edu.rapa.iot.dullegilapp.model.NFCTag;


/**
 * Created by skplanet on 2015-09-07.
 */
public interface INfcDAO {
    int count();
    boolean create_nfc(NFCTag nfcTag);
    boolean delete_nfc(int nfcNumber);
    ArrayList<NFCTag> select_all_nfc();
    NFCTag select_nfc(int nfcNumber);
    boolean update_nfc(NFCTag nfcTag);
}
