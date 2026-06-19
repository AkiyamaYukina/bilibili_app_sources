package com.bilibili.opd.app.bizcommon.context;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/b.class */
public interface b {
    boolean dispatchGenericMotionEvent(MotionEvent motionEvent);

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    boolean dispatchKeyShortcutEvent(KeyEvent keyEvent);

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    boolean dispatchTrackballEvent(MotionEvent motionEvent);

    boolean onKeyDown(int i7, KeyEvent keyEvent);
}
