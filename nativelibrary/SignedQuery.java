package com.bilibili.nativelibrary;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/nativelibrary/SignedQuery.class */
public final class SignedQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f67335a = "0123456789ABCDEF".toCharArray();
    public final String rawParams;
    public final String sign;

    public SignedQuery(String str, String str2) {
        this.rawParams = str;
        this.sign = str2;
    }

    private static boolean a(char c7, String str) {
        return (c7 >= 'A' && c7 <= 'Z') || (c7 >= 'a' && c7 <= 'z') || !((c7 < '0' || c7 > '9') && "-_.~".indexOf(c7) == -1 && (str == null || str.indexOf(c7) == -1));
    }

    public static String b(String str, String str2) {
        StringBuilder sb = null;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7;
            while (i8 < length && a(str.charAt(i8), str2)) {
                i8++;
            }
            if (i8 == length) {
                if (i7 == 0) {
                    return str;
                }
                sb.append((CharSequence) str, i7, length);
                return sb.toString();
            }
            StringBuilder sb2 = sb;
            if (sb == null) {
                sb2 = new StringBuilder();
            }
            if (i8 > i7) {
                sb2.append((CharSequence) str, i7, i8);
            }
            int i9 = i8 + 1;
            while (i9 < length && !a(str.charAt(i9), str2)) {
                i9++;
            }
            try {
                byte[] bytes = str.substring(i8, i9).getBytes("UTF-8");
                int length2 = bytes.length;
                int i10 = 0;
                while (true) {
                    sb = sb2;
                    i7 = i9;
                    if (i10 < length2) {
                        sb2.append('%');
                        char[] cArr = f67335a;
                        sb2.append(cArr[(bytes[i10] & 240) >> 4]);
                        sb2.append(cArr[bytes[i10] & 15]);
                        i10++;
                    }
                }
            } catch (UnsupportedEncodingException e7) {
                throw new AssertionError(e7);
            }
        }
        if (sb != null) {
            str = sb.toString();
        }
        return str;
    }

    public static String r(Map<String, String> map) {
        Map<String, String> treeMap = map;
        if (!(map instanceof SortedMap)) {
            treeMap = new TreeMap(map);
        }
        StringBuilder sb = new StringBuilder(256);
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                sb.append(urlEncode(key));
                sb.append("=");
                String value = entry.getValue();
                sb.append(value == null ? "" : urlEncode(value));
                sb.append("&");
            }
        }
        int length = sb.length();
        if (length > 0) {
            sb.deleteCharAt(length - 1);
        }
        return length == 0 ? null : sb.toString();
    }

    public static String urlEncode(String str) {
        return b(str, null);
    }

    public String toString() {
        String str = this.rawParams;
        if (str == null) {
            return "";
        }
        if (this.sign == null) {
            return str;
        }
        return this.rawParams + "&sign=" + this.sign;
    }
}
