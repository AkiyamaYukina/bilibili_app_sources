package com.bilibili.lib.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.PermissionRequestUtils;
import java.lang.ref.WeakReference;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/F.class */
public final /* synthetic */ class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f64744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f64745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.BooleanRef f64746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f64747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowManager f64748e;

    public /* synthetic */ F(WeakReference weakReference, x xVar, Ref.BooleanRef booleanRef, Context context, WindowManager windowManager) {
        this.f64744a = weakReference;
        this.f64745b = xVar;
        this.f64746c = booleanRef;
        this.f64747d = context;
        this.f64748e = windowManager;
    }

    public final Object invoke(Object obj) {
        WeakReference weakReference = this.f64744a;
        Context context = this.f64747d;
        final WindowManager windowManager = this.f64748e;
        Lifecycle.Event event = (Lifecycle.Event) obj;
        PermissionRequestUtils permissionRequestUtils = PermissionRequestUtils.INSTANCE;
        Activity activityFindTypedActivityOrNull = null;
        x xVar = EntryPointKt.getMemleakOptEnable() ? weakReference != null ? (x) weakReference.get() : null : this.f64745b;
        int i7 = PermissionRequestUtils.a.f64798a[event.ordinal()];
        if (i7 == 1) {
            Ref.BooleanRef booleanRef = this.f64746c;
            if (!booleanRef.element && xVar != null) {
                booleanRef.element = true;
                if (context != null) {
                    activityFindTypedActivityOrNull = ContextUtilKt.findTypedActivityOrNull(context, Activity.class);
                }
                if (activityFindTypedActivityOrNull != null) {
                    View viewFindViewById = activityFindTypedActivityOrNull.getWindow().getDecorView().findViewById(R.id.content);
                    if (viewFindViewById != null) {
                        final Activity activity = activityFindTypedActivityOrNull;
                        final x xVar2 = xVar;
                        viewFindViewById.post(new Runnable(activity, windowManager, xVar2) { // from class: com.bilibili.lib.ui.G

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Activity f64749a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final WindowManager f64750b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final x f64751c;

                            {
                                this.f64749a = activity;
                                this.f64750b = windowManager;
                                this.f64751c = xVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Activity activity2 = this.f64749a;
                                WindowManager windowManager2 = this.f64750b;
                                x xVar3 = this.f64751c;
                                PermissionRequestUtils permissionRequestUtils2 = PermissionRequestUtils.INSTANCE;
                                if (activity2.isFinishing() || activity2.isDestroyed()) {
                                    return;
                                }
                                PermissionRequestUtils.INSTANCE.getClass();
                                PermissionRequestUtils.c(windowManager2, xVar3);
                            }
                        });
                    }
                } else {
                    HandlerThreads.post(0, new Qp.c(1, windowManager, xVar));
                }
            }
        } else if (i7 == 2 && xVar != null && xVar.getParent() != null) {
            BLog.d("PermissionRequestUtils", "wm.removeViewImmediate");
            windowManager.removeViewImmediate(xVar);
        }
        return Unit.INSTANCE;
    }
}
