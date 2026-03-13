package org.anandi.SWEN20003.workshops.workshop9.q1;

import java.util.List;

public abstract class Encryptor {

    private final SecretKey key;

    public Encryptor() {
        this.key = createKey();
    }

    public abstract SecretKey createKey();

    public byte[] encrypt(List<String> lines) {
        int length = 0;
        for (String line : lines) {
            length += line.length();
        }

        byte[] result = new byte[length];

        int i = 0; // to keep track of the index of the result when we keep adding encrypted strings
        for (String line : lines) {
            byte[] encrypted = key.encrypt(line.getBytes());
            for (byte b : encrypted) {
                result[i++] = b;
            }
        }
        return result;
    }
}
