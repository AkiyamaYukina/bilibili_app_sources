package com.bilibili.pegasus.components.customreporter;

import android.os.SystemClock;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/g.class */
public final class g implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long[] jArr = f.f75941a;
        Lazy lazy = l.f75948a;
        jArr[7] = SystemClock.uptimeMillis();
    }
}
