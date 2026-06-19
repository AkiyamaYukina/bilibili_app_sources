package com.bilibili.lib.projection.internal.device;

import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/device/DeviceSnapshot.class */
public interface DeviceSnapshot extends Parcelable {
    int e();

    @NotNull
    String getUuid();
}
