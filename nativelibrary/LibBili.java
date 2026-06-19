package com.bilibili.nativelibrary;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/nativelibrary/LibBili.class */
public final class LibBili {
    public static final int ACCOUNT = 1;
    public static final int DEFAULT = 0;
    public static final int FAT = 3;
    public static final int PRE = 1;
    public static final int PROD = 0;
    public static final int UAT = 2;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/nativelibrary/LibBili$Env.class */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Env {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/nativelibrary/LibBili$Token.class */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Token {
    }

    static {
        cM0.c.a("bili");
    }

    private static native String a(String str);

    public static byte[] aesDecrypt(String str, byte[] bArr) throws InvalidKeyException, UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        try {
            return a.a(new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES"), b(str), bArr);
        } catch (UnsupportedEncodingException | Exception e7) {
            return bArr;
        }
    }

    public static byte[] aesEncrypt(String str, byte[] bArr) throws InvalidKeyException, UnsupportedEncodingException {
        byte[] bytes = str.getBytes("UTF-8");
        try {
            return a.b(new SecretKeySpec(Arrays.copyOf(bytes, 16), "AES"), b(str), bArr);
        } catch (UnsupportedEncodingException | Exception e7) {
            return bArr;
        }
    }

    private static native String ao(String str, int i7, int i8);

    private static native IvParameterSpec b(String str) throws InvalidKeyException;

    public static native void d(long j7, @NonNull Rt rt);

    @Nullable
    public static native byte[] dp(boolean z6);

    @Deprecated
    public static String getAppKey() {
        return getAppKey(Constant.SDK_OS);
    }

    public static String getAppKey(String str) {
        return a(str);
    }

    public static String getAppKey(String str, int i7, int i8) {
        return ao(str, i7, i8);
    }

    public static native int getCpuCount();

    @Deprecated
    public static native int getCpuId();

    public static native SignedQuery s(SortedMap<String, String> sortedMap);

    public static SignedQuery signQuery(Map<String, String> map) {
        return s(map == null ? new TreeMap() : new TreeMap(map));
    }

    public static SignedQuery signQuery(Map<String, String> map, int i7, int i8) {
        return so(map == null ? new TreeMap() : new TreeMap(map), i7, i8);
    }

    public static SignedQuery signQuery(Map<String, String> map, @NonNull byte[] bArr) {
        return so(map == null ? new TreeMap() : new TreeMap(map), bArr);
    }

    public static native SignedQuery so(SortedMap<String, String> sortedMap, int i7, int i8);

    public static native SignedQuery so(SortedMap<String, String> sortedMap, byte[] bArr);

    @Nullable
    public static byte[] st(@NonNull byte[] bArr, @Nullable Map<String, byte[]> map, @NonNull String str) {
        return st(bArr, (SortedMap<String, byte[]>) (map == null ? new TreeMap() : new TreeMap(map)), str);
    }

    @VisibleForTesting
    @Nullable
    public static native byte[] st(@NonNull byte[] bArr, @NonNull SortedMap<String, byte[]> sortedMap, @NonNull String str);
}
