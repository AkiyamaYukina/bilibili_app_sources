package com.bilibili.studio.videoeditor.generalrender.parsexml.base;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/parsexml/base/ThreadUtils.class */
@Deprecated
public final class ThreadUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f109658a = new Handler(Looper.getMainLooper());

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f109658a.post(runnable);
        }
    }
}
