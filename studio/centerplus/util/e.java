package com.bilibili.studio.centerplus.util;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f105289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f105290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f105291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f105292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f105293e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final d f105294f;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.studio.centerplus.util.d] */
    public e(@NotNull final com.bilibili.studio.centerplus.model.b bVar) {
        this.f105294f = new Runnable(this, bVar) { // from class: com.bilibili.studio.centerplus.util.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f105287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.studio.centerplus.model.b f105288b;

            {
                this.f105287a = this;
                this.f105288b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f105287a;
                com.bilibili.studio.centerplus.model.b bVar2 = this.f105288b;
                eVar.getClass();
                BLog.ifmt("CenterPlusRepository", com.bilibili.app.comm.bh.x5.b.a("modStateInspectTask...isRunning = ", eVar.f105289a), new Object[0]);
                while (eVar.f105289a) {
                    try {
                        eVar.f105292d++;
                        BLog.ifmt("CenterPlusRepository", "modStateInspectTask...inspectCount = " + eVar.f105292d + ", inspectMaxCount = " + eVar.f105291c, new Object[0]);
                    } catch (Exception e7) {
                        BLog.wfmt("CenterPlusRepository", O4.d.a("modStateInspectTask...e = ", e7.fillInStackTrace()), new Object[0]);
                    }
                    if (eVar.f105292d > eVar.f105291c) {
                        eVar.a();
                        return;
                    }
                    BLog.ifmt("CenterPlusRepository", "modStateInspectTask...inspectEnable = " + eVar.f105293e, new Object[0]);
                    if (!eVar.f105293e.get()) {
                        eVar.a();
                        return;
                    } else {
                        if (((Boolean) bVar2.invoke()).booleanValue()) {
                            eVar.a();
                            return;
                        }
                        Thread.sleep(eVar.f105290b);
                    }
                }
            }
        };
    }

    public final void a() {
        BLog.ifmt("CenterPlusRepository", "stopInspect", new Object[0]);
        this.f105289a = false;
    }
}
