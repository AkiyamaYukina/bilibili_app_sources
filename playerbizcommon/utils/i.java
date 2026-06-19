package com.bilibili.playerbizcommon.utils;

import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/i.class */
public final class i {
    @RequiresApi(23)
    public static void a(int i7) {
        try {
            BLog.i("SyncBarrierUtils", "Remove barrier");
            MessageQueue queue = Looper.getMainLooper().getQueue();
            Method declaredMethod = MessageQueue.class.getDeclaredMethod("removeSyncBarrier", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(queue, Integer.valueOf(i7));
        } catch (Exception e7) {
            BLog.e("SyncBarrierUtils", "Remove barrier failed!!", e7);
        }
    }

    @RequiresApi(23)
    public static int b() {
        try {
            BLog.i("SyncBarrierUtils", "Add barrier");
            MessageQueue queue = Looper.getMainLooper().getQueue();
            Method declaredMethod = MessageQueue.class.getDeclaredMethod("postSyncBarrier", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(queue, null)).intValue();
        } catch (Exception e7) {
            BLog.e("SyncBarrierUtils", "Add barrier failed!!", e7);
            return -1;
        }
    }
}
