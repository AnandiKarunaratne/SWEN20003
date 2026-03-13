package org.anandi.SWEN20003.workshops.workshop9.q1;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public abstract class SecretKey {

    private final byte[] key;

    public SecretKey(int n) {
        this.key = new byte[n];
        Random random = new Random();
        random.nextBytes(key);
    }

//    public byte[] encrypt(byte[] message) {
//        int m = message.length;
//        int k = key.length;
//        int j = 0;
//
//        byte[] result = new byte[m];
//
//        for (int i = 0; i < m; i++) {
//            result[i] = (byte) (message[i] ^ key[j]);
//            j++;
//            if (j == k) j = 0;
//        }
//
//        return result;
//    }

    public byte[] encrypt(byte[] message) {
        byte[] result = new byte[message.length];

        for (int i = 0; i < message.length; i++) {
            result[i] = (byte) (message[i] ^ key[i % key.length]);
        }
        return result;
    }

    public String decrypt(byte[] message) {
        return new String(encrypt(message), StandardCharsets.UTF_8);
    }
}
