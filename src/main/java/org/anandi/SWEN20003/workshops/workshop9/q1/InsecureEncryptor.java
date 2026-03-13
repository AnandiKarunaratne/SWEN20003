package org.anandi.SWEN20003.workshops.workshop9.q1;

public class InsecureEncryptor extends Encryptor {

    @Override
    public SecretKey createKey() {
        return new ShortSecretKey();
    }
}
