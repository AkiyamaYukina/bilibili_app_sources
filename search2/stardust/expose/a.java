package com.bilibili.search2.stardust.expose;

import Hx.m;
import S3.o;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.app.comm.list.widget.utils.D;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KProperty<Object>[] f88740a = {new MutablePropertyReference0Impl(a.class, "discoverPageKeyboardShowDelayReportMs", "getDiscoverPageKeyboardShowDelayReportMs()J", 1), new MutablePropertyReference0Impl(a.class, "discoverPageKeyboardCloseDelayReportMs", "getDiscoverPageKeyboardCloseDelayReportMs()J", 1)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f88741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f88742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final D f88743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final D f88744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f88745f;

    static {
        Lazy lazy = LazyKt.lazy(new m(6));
        f88741b = lazy;
        Lazy lazy2 = LazyKt.lazy(new o(3));
        f88742c = lazy2;
        f88743d = new D("sp_search_discover_page_keyboard_show_delay_report_ms", Long.valueOf(((Number) lazy.getValue()).longValue()));
        f88744e = new D("sp_search_discover_page_keyboard_close_delay_report_ms", Long.valueOf(((Number) lazy2.getValue()).longValue()));
    }

    public static final void a(long j7, long j8) {
        if (f88745f) {
            return;
        }
        f88745f = true;
        StringBuilder sbA = z.a(j7, "saveKeyboardDelayConfig, expand = ", " ms, close = ");
        sbA.append(j8);
        sbA.append(" ms");
        BLog.i("[Search]ExposeConfig", sbA.toString());
        KProperty<Object>[] kPropertyArr = f88740a;
        KProperty<Object> kProperty = kPropertyArr[0];
        f88743d.b(Long.valueOf(j7));
        KProperty<Object> kProperty2 = kPropertyArr[1];
        f88744e.b(Long.valueOf(j8));
    }
}
