package edu.rapa.iot.dullegilapp.dao;

import java.util.ArrayList;

import edu.rapa.iot.dullegilapp.model.Stamp;


/**
 * Created by skplanet on 2015-09-07.
 */
public class StampDAO implements IStampDAO{
    @Override
    public boolean create_stamp(int stampId, int userId) {
        return false;
    }

    @Override
    public boolean delete_stamp(int stampId, int userId) {
        return false;
    }

    @Override
    public ArrayList<Stamp> select_all_stamp(int userId) {
        return null;
    }

    @Override
    public boolean select_stamp(int stampId, int userId) {
        return false;
    }

    @Override
    public boolean update_stamp(int stampId, int userId) {
        return false;
    }
}
