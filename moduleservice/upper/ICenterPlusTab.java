package com.bilibili.moduleservice.upper;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/upper/ICenterPlusTab.class */
public interface ICenterPlusTab {
    boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent);

    boolean needToOpenCamera(@NotNull HashMap<String, Object> map);

    default boolean needToReOpenActivity(@Nullable Intent intent) {
        return false;
    }

    void onHide(boolean z6);

    boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent);

    void onShow();
}
