package com.OA;

public class Clien {

    public static void main(String[] args) {
        DataBaseService dbs = new Adapter();
        dbs.encrypt("password");
    }

}