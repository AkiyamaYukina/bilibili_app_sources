package com.bilibili.lib.videoupload.speeddetect;

import android.net.NetworkInfo;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import kotlin.Deprecated;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/d.class */
public final class d implements ConnectivityMonitor.OnNetworkChangedListener {
    @Deprecated(message = "Deprecated in Java")
    public final void onChanged(int i7) {
    }

    public final void onChanged(int i7, int i8, NetworkInfo networkInfo) {
        super.onChanged(i7, i8, networkInfo);
        UploadLineSpeedDetect.c();
    }
}
