package com.bilibili.studio.videoeditor.util;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/c.class */
public final class C6630c {
    public static boolean a(Context context) {
        if (((AudioManager) context.getSystemService("audio")).isWiredHeadsetOn()) {
            return true;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getProfileConnectionState(1) == 2;
            }
            return false;
        } catch (SecurityException e7) {
            e7.printStackTrace();
            return false;
        }
    }
}
