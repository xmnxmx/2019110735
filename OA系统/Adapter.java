package com.OA;

public class Adapter extends DataBaseService{

    @Override
    public void encrypt(String password) {
        System.out.println("原密码是： "+password);

        String encryption = new JavaAPI().encryptAPI(password);

        System.out.println("加密后密码： "+encryption);
    }

}