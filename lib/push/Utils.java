package com.bilibili.lib.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.tribe.runtime.TribeApi;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/Utils.class */
public class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f64231a = "0123456789ABCDEF".toCharArray();

    public static boolean a(char c7) {
        return (c7 >= 'A' && c7 <= 'Z') || (c7 >= 'a' && c7 <= 'z') || ((c7 >= '0' && c7 <= '9') || "-_.~".indexOf(c7) != -1);
    }

    @Nullable
    public static String b(String str) {
        StringBuilder sb = null;
        if (str == null) {
            str = null;
        } else {
            int length = str.length();
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    int i8 = i7;
                    while (i8 < length && a(str.charAt(i8))) {
                        i8++;
                    }
                    if (i8 != length) {
                        StringBuilder sb2 = sb;
                        if (sb == null) {
                            sb2 = new StringBuilder();
                        }
                        if (i8 > i7) {
                            sb2.append((CharSequence) str, i7, i8);
                        }
                        int i9 = i8 + 1;
                        while (i9 < length && !a(str.charAt(i9))) {
                            i9++;
                        }
                        try {
                            byte[] bytes = str.substring(i8, i9).getBytes(Charset.forName("UTF-8"));
                            int length2 = bytes.length;
                            int i10 = 0;
                            while (true) {
                                sb = sb2;
                                i7 = i9;
                                if (i10 < length2) {
                                    byte b7 = bytes[i10];
                                    sb2.append('%');
                                    char[] cArr = f64231a;
                                    sb2.append(cArr[(b7 & 240) >> 4]);
                                    sb2.append(cArr[b7 & 15]);
                                    i10++;
                                }
                            }
                        } catch (Exception e7) {
                            throw new AssertionError(e7);
                        }
                    } else if (i7 != 0) {
                        sb.append((CharSequence) str, i7, length);
                        str = sb.toString();
                    }
                } else if (sb != null) {
                    str = sb.toString();
                }
            }
        }
        return str;
    }

    @Nullable
    public static <T> T constructNewInstance(@NonNull String str) {
        Class<?> clsLoadClass;
        try {
            try {
                clsLoadClass = TribeApi.getBundles().e().loadClass(str);
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                return null;
            } catch (InstantiationException e8) {
                e8.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException e9) {
            clsLoadClass = null;
        }
        if (clsLoadClass != null) {
            return (T) clsLoadClass.newInstance();
        }
        return null;
    }

    public static boolean isActiveNetwork(@NonNull Context context) {
        boolean z6;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            z6 = false;
            if (activeNetworkInfo != null) {
                z6 = false;
                if (activeNetworkInfo.isConnected()) {
                    z6 = true;
                }
            }
        } catch (Exception e7) {
            z6 = false;
        }
        return z6;
    }

    public static String md5(String str) {
        return md5(str.getBytes());
    }

    public static String md5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[bArrDigest.length * 2];
            int length = bArrDigest.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i7 >= length) {
                    return new String(cArr).toLowerCase();
                }
                byte b7 = bArrDigest[i7];
                char[] cArr2 = f64231a;
                cArr[i9] = cArr2[(b7 >>> 4) & 15];
                i8 = i9 + 2;
                cArr[i9 + 1] = cArr2[b7 & 15];
                i7++;
            }
        } catch (NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static String r(@NonNull Map<String, String> map, @Nullable String str) {
        Map<String, String> treeMap = map;
        if (!(map instanceof SortedMap)) {
            treeMap = new TreeMap(map);
        }
        StringBuilder sb = new StringBuilder(256);
        Iterator<Map.Entry<String, String>> it = treeMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!TextUtils.isEmpty(key)) {
                sb.append(b(key));
                sb.append("=");
                String value = next.getValue();
                sb.append(value != null ? b(value) : "");
                sb.append("&");
            }
        }
        int length = sb.length();
        if (length > 0) {
            sb.deleteCharAt(length - 1);
        }
        if (length == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            return sb.toString();
        }
        String string = sb.toString();
        StringBuilder sbA = C0.d.a(string, "&sign=");
        sbA.append(md5(string + str));
        return sbA.toString();
    }

    public static String rawParams(@NonNull Map<String, String> map) {
        Map<String, String> treeMap = map;
        if (!(map instanceof SortedMap)) {
            treeMap = new TreeMap(map);
        }
        StringBuilder sb = new StringBuilder(256);
        Iterator<Map.Entry<String, String>> it = treeMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if (!TextUtils.isEmpty(key)) {
                sb.append(b(key));
                sb.append("=");
                String value = next.getValue();
                sb.append(value != null ? b(value) : "");
                sb.append("&");
            }
        }
        int length = sb.length();
        if (length > 0) {
            sb.deleteCharAt(length - 1);
        }
        return length == 0 ? "" : sb.toString();
    }

    public static void toggleComponentAvailability(@NonNull Context context, boolean z6, @NonNull Class<?>[] clsArr) {
        if (clsArr.length == 0) {
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (z6) {
                for (Class<?> cls : clsArr) {
                    packageManager.setComponentEnabledSetting(new ComponentName(context, cls), 1, 1);
                }
                return;
            }
            for (Class<?> cls2 : clsArr) {
                packageManager.setComponentEnabledSetting(new ComponentName(context, cls2), 2, 1);
            }
        } catch (Exception e7) {
        }
    }
}
