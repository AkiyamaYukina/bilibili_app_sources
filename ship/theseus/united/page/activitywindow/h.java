package com.bilibili.ship.theseus.united.page.activitywindow;

import android.os.Build;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/h.class */
public final class h<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityWindowPropertyService f98867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowInsetsControllerCompat f98868b;

    public h(ActivityWindowPropertyService activityWindowPropertyService, WindowInsetsControllerCompat windowInsetsControllerCompat) {
        this.f98867a = activityWindowPropertyService;
        this.f98868b = windowInsetsControllerCompat;
    }

    public final Object emit(Object obj, Continuation continuation) {
        BLog.i("ActivityWindowPropertyService$hideWindowSysUi$2$1-emit", "[theseus-united-ActivityWindowPropertyService$hideWindowSysUi$2$1-emit] in hide system ui inset change");
        WindowCompat.setDecorFitsSystemWindows(this.f98867a.f98852i, false);
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        WindowInsetsControllerCompat windowInsetsControllerCompat = this.f98868b;
        windowInsetsControllerCompat.hide(iSystemBars);
        int systemBarsBehavior = windowInsetsControllerCompat.getSystemBarsBehavior();
        if (systemBarsBehavior != 2) {
            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-ActivityWindowPropertyService$hideWindowSysUi$2$1-emit] ", G.f.a(systemBarsBehavior, Build.VERSION.SDK_INT, "systemBarsBehavior is not BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE, it value = ", ", system version = "), "ActivityWindowPropertyService$hideWindowSysUi$2$1-emit", new Throwable());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
        }
        return Unit.INSTANCE;
    }
}
