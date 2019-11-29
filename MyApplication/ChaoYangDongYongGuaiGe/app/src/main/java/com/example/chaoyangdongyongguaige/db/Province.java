package com.example.chaoyangdongyongguaige.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;
    private String privinceName;
    private int provinCode;

    public void setId(int id){
        this.id=id;
    }
    public void setPrivinceName(String privinceName){
        this.privinceName=privinceName;
    }
    public void setPrivinceCode(int provinCode){
        this.provinCode=provinCode;
    }

    public int getId(){
        return this.id;
    }
    public String getPrivinceName(){
        return privinceName;
    }
    public int getProvinCode(){
        return provinCode;
    }
}
