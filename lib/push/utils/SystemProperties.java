package com.bilibili.lib.push.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/utils/SystemProperties.class */
public class SystemProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f64262a;

    static {
        Class<?> clsLoadClass;
        Method method;
        try {
            clsLoadClass = Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException e7) {
            try {
                clsLoadClass = ClassLoader.getSystemClassLoader().loadClass("android.os.SystemProperties");
            } catch (ClassNotFoundException e8) {
                clsLoadClass = null;
            }
        }
        if (clsLoadClass == null) {
            method = null;
        } else {
            try {
                method = clsLoadClass.getMethod("get", String.class);
            } catch (Exception e9) {
                method = null;
            }
        }
        f64262a = method;
    }

    @NonNull
    public static String get(String str) {
        Method method = f64262a;
        if (method == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(null, str);
            return objInvoke == null ? "" : trimToEmpty(objInvoke.toString());
        } catch (Exception e7) {
            return "";
        }
    }

    public static String get(String str, String str2) {
        Method method = f64262a;
        if (method != null) {
            try {
                String strTrimToEmpty = trimToEmpty((String) method.invoke(null, str));
                return TextUtils.isEmpty(strTrimToEmpty) ? str2 : strTrimToEmpty;
            } catch (Exception e7) {
            }
        }
        return str2;
    }

    public static String trimToEmpty(String str) {
        return str == null ? "" : str.trim();
    }
}
