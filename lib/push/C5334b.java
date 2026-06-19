package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bilibili.droid.ProcessUtils;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.bilibili.lib.push.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/b.class */
public final class C5334b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile C5338f f64236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile BPushConfig f64237b;

    public static void a(Context context, ClearTrigger clearTrigger) {
        if (c().getPushParams().clearReddot()) {
            BPushLog.i("RedDotHelper", "clearRedDot process = " + ProcessUtils.myProcName());
            if (ProcessUtils.isMainProcess()) {
                BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new RedDotHelper$clearRedDot$1(context, clearTrigger, null), 3, (Object) null);
            }
        }
    }

    public static C5338f b() {
        if (f64236a == null) {
            synchronized (C5334b.class) {
                try {
                    if (f64236a == null) {
                        throw new RuntimeException("Must call init before using BPush");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f64236a;
    }

    public static BPushConfig c() {
        BPushConfig bPushConfig;
        synchronized (BPushConfig.class) {
            try {
                bPushConfig = f64237b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bPushConfig;
    }
}
