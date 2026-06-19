package com.bilibili.lib.tf;

import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfTrack.class */
public abstract class TfTrack {
    @AnyThread
    public abstract void trackActivate(@Nullable TfActivateEvent tfActivateEvent);

    @TfThread
    public abstract void trackNetwork(@Nullable ByteBuffer byteBuffer);

    @AnyThread
    public abstract void trackSwitch(@Nullable TfSwitchEvent tfSwitchEvent);

    @AnyThread
    public abstract void trackTransform(@Nullable TfTransformEvent tfTransformEvent);
}
