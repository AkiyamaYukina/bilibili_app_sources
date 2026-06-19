package com.bilibili.ogvvega.protobuf;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/protobuf/OneofWrapper.class */
public final class OneofWrapper {
    private final int eventCase;

    @NotNull
    private final Object value;

    public OneofWrapper(int i7, @NotNull Object obj) {
        this.eventCase = i7;
        this.value = obj;
    }

    public final /* synthetic */ <T> T getActualValue() {
        T t7 = (T) getValue();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t7;
    }

    public final int getEventCase() {
        return this.eventCase;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }
}
