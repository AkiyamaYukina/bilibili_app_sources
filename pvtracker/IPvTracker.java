package com.bilibili.pvtracker;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pvtracker/IPvTracker.class */
public interface IPvTracker {
    default boolean appendEndExtra() {
        return false;
    }

    String getPvEventId();

    Bundle getPvExtra();

    @Nullable
    default String getUniqueKey() {
        return null;
    }

    default boolean shouldReport() {
        return true;
    }
}
