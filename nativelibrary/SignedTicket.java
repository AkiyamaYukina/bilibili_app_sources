package com.bilibili.nativelibrary;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/nativelibrary/SignedTicket.class */
public class SignedTicket {
    @Nullable
    public static byte[] r(@NonNull Map<String, byte[]> map) {
        if (!(map instanceof SortedMap)) {
            map = new TreeMap(map);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    byteArrayOutputStream.write(str.getBytes("UTF-8"));
                    byte[] bArr = map.get(str);
                    if (bArr != null) {
                        byteArrayOutputStream.write(bArr);
                    }
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
