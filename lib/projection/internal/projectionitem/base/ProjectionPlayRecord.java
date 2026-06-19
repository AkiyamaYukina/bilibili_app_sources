package com.bilibili.lib.projection.internal.projectionitem.base;

import android.os.Parcelable;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/ProjectionPlayRecord.class */
public interface ProjectionPlayRecord extends Parcelable {
    @NotNull
    IProjectionPlayableItem f();

    @NotNull
    DeviceSnapshot getDevice();
}
