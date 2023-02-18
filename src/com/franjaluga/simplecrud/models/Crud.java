package com.franjaluga.simplecrud.models;

import java.util.List;

public interface Crud {

    void addData( String data );
    List<String> Nombres();
    String getPorId( Integer id );

    void deleteDataById( int id );

    void updateById( int id, String data );


}
