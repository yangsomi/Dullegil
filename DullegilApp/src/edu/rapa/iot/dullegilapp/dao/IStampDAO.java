package edu.rapa.iot.dullegilapp.dao;

import java.util.ArrayList;

import edu.rapa.iot.dullegilapp.model.Stamp;


/**
 * Created by skplanet on 2015-09-07.
 */
public interface IStampDAO {
    boolean create_stamp(int stampId, int userId);
    boolean delete_stamp(int stampId, int userId);
    ArrayList<Stamp> select_all_stamp(int userId);
    boolean select_stamp(int stampId, int userId);
    boolean update_stamp(int stampId, int userId);

}
