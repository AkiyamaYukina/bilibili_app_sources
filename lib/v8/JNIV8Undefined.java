package com.bilibili.lib.v8;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIV8Undefined.class */
public class JNIV8Undefined {
    private static volatile JNIV8Undefined instance;

    @Keep
    private JNIV8Undefined() {
    }

    public static JNIV8Undefined GetInstance() {
        JNIV8Undefined jNIV8Undefined;
        synchronized (JNIV8Undefined.class) {
            try {
                if (instance == null) {
                    instance = new JNIV8Undefined();
                }
                jNIV8Undefined = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jNIV8Undefined;
    }
}
