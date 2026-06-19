package com.bilibili.lib.tf.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.bilibili.lib.tf.TfActivateEvent;
import com.bilibili.lib.tf.TfSwitchEvent;
import com.bilibili.lib.tf.TfThread;
import com.bilibili.lib.tf.TfTrack;
import com.bilibili.lib.tf.TfTransformEvent;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/internal/InternalTrack.class */
public class InternalTrack {

    @Nullable
    private TfTrack track;

    public InternalTrack(@Nullable TfTrack tfTrack) {
        this.track = tfTrack;
    }

    @AnyThread
    private void trackNativeActivate(@Nullable TfActivateEvent tfActivateEvent) {
        TfTrack tfTrack = this.track;
        if (tfTrack == null || tfActivateEvent == null) {
            return;
        }
        try {
            tfTrack.trackActivate(tfActivateEvent);
        } catch (Throwable th) {
        }
    }

    @TfThread
    private void trackNativeNetwork(@Nullable ByteBuffer byteBuffer) {
        TfTrack tfTrack = this.track;
        if (tfTrack == null || byteBuffer == null) {
            return;
        }
        try {
            tfTrack.trackNetwork(byteBuffer);
        } catch (Throwable th) {
        }
    }

    @AnyThread
    private void trackNativeSwitch(@Nullable TfSwitchEvent tfSwitchEvent) {
        TfTrack tfTrack = this.track;
        if (tfTrack == null || tfSwitchEvent == null) {
            return;
        }
        try {
            tfTrack.trackSwitch(tfSwitchEvent);
        } catch (Throwable th) {
        }
    }

    @AnyThread
    private void trackNativeTransform(@Nullable TfTransformEvent tfTransformEvent) {
        TfTrack tfTrack = this.track;
        if (tfTrack == null || tfTransformEvent == null) {
            return;
        }
        try {
            tfTrack.trackTransform(tfTransformEvent);
        } catch (Throwable th) {
        }
    }
}
