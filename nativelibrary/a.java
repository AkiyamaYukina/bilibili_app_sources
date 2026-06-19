package com.bilibili.nativelibrary;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/nativelibrary/a.class */
final class a {
    public static byte[] a(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKey, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e7) {
            throw new AssertionError(e7);
        }
    }

    public static byte[] b(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws GeneralSecurityException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKey, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e7) {
            throw new AssertionError(e7);
        }
    }
}
