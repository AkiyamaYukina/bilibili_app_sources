package com.bilibili.ship.theseus.united.page.activitywindow;

import android.os.Build;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/c.class */
public final class c<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityWindowEdgeToEdgePropertyService f98860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowInsetsControllerCompat f98861b;

    public c(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, WindowInsetsControllerCompat windowInsetsControllerCompat) {
        this.f98860a = activityWindowEdgeToEdgePropertyService;
        this.f98861b = windowInsetsControllerCompat;
    }

    public final Object emit(Object obj, Continuation continuation) {
        BLog.i("ActivityWindowEdgeToEdgePropertyService$hideWindowSysUi$2$1-emit", "[theseus-united-ActivityWindowEdgeToEdgePropertyService$hideWindowSysUi$2$1-emit] edge-to-edge in hide system ui inset change");
        WindowCompat.setDecorFitsSystemWindows(this.f98860a.f98840i, false);
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f98861b;
        windowInsetsControllerCompat.hide(iSystemBars);
        int systemBarsBehavior = windowInsetsControllerCompat.getSystemBarsBehavior();
        if (systemBarsBehavior != 2) {
            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-ActivityWindowEdgeToEdgePropertyService$hideWindowSysUi$2$1-emit] ", G.f.a(systemBarsBehavior, Build.VERSION.SDK_INT, "systemBarsBehavior is not BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE, it value = ", ", system version = "), "ActivityWindowEdgeToEdgePropertyService$hideWindowSysUi$2$1-emit", new Throwable());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
        }
        return Unit.INSTANCE;
    }
}
