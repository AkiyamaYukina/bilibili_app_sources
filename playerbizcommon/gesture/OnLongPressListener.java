package com.bilibili.playerbizcommon.gesture;

import android.view.MotionEvent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/gesture/OnLongPressListener.class */
public interface OnLongPressListener {
    boolean onLongPress(@Nullable MotionEvent motionEvent);

    default void onLongPressEnd(@Nullable MotionEvent motionEvent) {
    }
}
