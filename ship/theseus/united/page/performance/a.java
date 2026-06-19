package com.bilibili.ship.theseus.united.page.performance;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.thread.HandlerThreads;
import ii1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PerformanceTracerImpl f102235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1080a f102236b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.performance.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/a$a.class */
    public static final class C1080a implements ii1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f102237a;

        public C1080a(a aVar) {
            this.f102237a = aVar;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void a(a.a aVar) {
            String str = aVar.a;
            int iHashCode = str.hashCode();
            long j7 = aVar.c;
            a aVar2 = this.f102237a;
            switch (iHashCode) {
                case -2053930362:
                    if (str.equals("startUgcBusinessService")) {
                        aVar2.f102235a.c(PerformanceTracerImpl.Entry.ON_START_BUSINESS_SERVICES.attach(j7));
                        break;
                    }
                    break;
                case -1052018037:
                    if (str.equals("set_media_item")) {
                        aVar2.f102235a.c(PerformanceTracerImpl.Entry.ON_SET_MEDIA_ITEM.attach(j7).setExtras(aVar.b));
                        break;
                    }
                    break;
                case -121099845:
                    if (str.equals("end_resolve_play_url")) {
                        aVar2.f102235a.c(PerformanceTracerImpl.Entry.ON_END_RESOLVE_PLAY_URL.attach(j7));
                        break;
                    }
                    break;
                case -43348716:
                    if (str.equals("start_resolve_play_url")) {
                        aVar2.f102235a.c(PerformanceTracerImpl.Entry.ON_START_RESOLVE_PLAY_URL.attach(j7));
                        break;
                    }
                    break;
                case 682917534:
                    if (str.equals("resolve_play_url_fire")) {
                        aVar2.f102235a.c(PerformanceTracerImpl.Entry.ON_RESOLVE_PLAY_URL_FIRE.attach(j7));
                        break;
                    }
                    break;
            }
        }
    }

    public a() {
        PerformanceTracerImpl performanceTracerImpl = new PerformanceTracerImpl();
        this.f102235a = performanceTracerImpl;
        this.f102236b = new C1080a(this);
        if (performanceTracerImpl.c != null) {
            BLog.w("Watch dog is already working! Make sure it was ended correctly.");
            return;
        }
        tv.danmaku.bili.videopage.common.performance.b bVar = new tv.danmaku.bili.videopage.common.performance.b(HandlerThreads.getHandler(0));
        performanceTracerImpl.c = bVar;
        bVar.a = false;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        bVar.b = jElapsedRealtime;
        bVar.c = jElapsedRealtime;
        performanceTracerImpl.b = PerformanceTracerImpl.Entry.values().length;
        performanceTracerImpl.d = false;
    }

    public final void a(@Nullable Object obj, @NotNull String str) {
        PerformanceTracerImpl performanceTracerImpl = this.f102235a;
        if (obj != null) {
            performanceTracerImpl.a.put(str, obj);
        } else {
            performanceTracerImpl.getClass();
        }
    }

    public final void b(@NotNull PerformanceTracerImpl.Entry entry) {
        this.f102235a.b(entry);
    }

    public final void c(@NotNull PerformanceTracerImpl.Entry entry) {
        this.f102235a.c(entry);
    }
}
