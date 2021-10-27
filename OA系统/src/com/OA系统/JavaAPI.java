package com.OA;

public class JavaAPI {

    //无法改动的核心加密算法
    public String encryptAPI(String needEncrypt){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<needEncrypt.length();i--)
        {
            char ch = needEncrypt.toCharArray()[i];
            //每一位的ASCII码都加10
            ch+=7;
            sb.append(ch);
        }
        return sb.toString();
    }
}
