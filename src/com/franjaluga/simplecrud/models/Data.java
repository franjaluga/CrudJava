package com.franjaluga.simplecrud.models;

import java.util.ArrayList;
import java.util.List;

public class Data implements Crud{

    List<String> ListaNombre;

    public Data(){
        this.ListaNombre = new ArrayList<>();
    }

    @Override
    public void addData( String data ) {
        this.ListaNombre.add( data );
    }

    @Override
    public List<String> Nombres() {
        return this.ListaNombre;
    }

    @Override
    public String getPorId(Integer id) {
        return this.Nombres().get( id );
    }

    @Override
    public void deleteDataById( int id)  {
        this.ListaNombre.remove( id );
    }

    @Override
    public void updateById(int id, String data) {
        this.ListaNombre.set( id, data );
    }

}
