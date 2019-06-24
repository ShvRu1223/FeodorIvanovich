package com.course.sss.Encryption;

import javax.activation.DataHandler;

public class MainDataEncrypter implements DataEncryptor {
    @Override
    public String scrypt(String text) {
        return scryptLow(text);
    }

    private String scryptLow(String text){
        return null;
    }

    private String scryptMed(String text){
        return null;
    }
}
