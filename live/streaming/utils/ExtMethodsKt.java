package com.bilibili.live.streaming.utils;

import Th.k;
import Th.m;
import android.os.Handler;
import android.os.Looper;
import com.bilibili.live.streaming.log.LivePusherLog;
import java.util.concurrent.FutureTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/ExtMethodsKt.class */
public final class ExtMethodsKt {

    @NotNull
    private static final String TAG = "ExtMethods";

    public static final void fastInvoke(@NotNull Handler handler, @NotNull Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), handler.getLooper())) {
            function0.invoke();
            return;
        }
        try {
            FutureTask futureTask = new FutureTask(new m(function0, 1), null);
            handler.postAtFrontOfQueue(futureTask);
            futureTask.get();
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "Handler.invoke", e7);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public static final String getKtMessage(@NotNull Throwable th) {
        String message = th.getMessage();
        String str = message;
        if (message == null) {
            str = "(null)";
        }
        return str;
    }

    public static final void invoke(@NotNull Handler handler, @NotNull Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), handler.getLooper())) {
            function0.invoke();
            return;
        }
        try {
            FutureTask futureTask = new FutureTask(new k(function0, 2), null);
            handler.post(futureTask);
            futureTask.get();
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "Handler.invoke", e7);
            Unit unit = Unit.INSTANCE;
        }
    }
}
