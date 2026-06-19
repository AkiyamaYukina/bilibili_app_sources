package com.bilibili.lib.setup;

import com.bilibili.bililive.room.ui.guide.bubble.i;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/setup/SetupTrack.class */
public final class SetupTrack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SetupTrack f64389a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Mutex f64390b = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f64391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static i f64392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static d f64393e;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0023, B:12:0x002e, B:14:0x0054, B:22:0x006e, B:24:0x007c, B:26:0x0084, B:20:0x0068), top: B:33:0x0023 }] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.Nullable android.app.Activity r8) {
        /*
            boolean r0 = com.bilibili.lib.performance.EntryPointKt.getBootOptEnable()
            if (r0 == 0) goto L1d
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            r1 = 0
            r2 = 0
            com.bilibili.lib.setup.SetupTrack$sendEvent$1 r3 = new com.bilibili.lib.setup.SetupTrack$sendEvent$1
            r4 = r3
            r5 = r8
            r6 = 0
            r4.<init>(r5, r6)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            goto L8d
        L1d:
            com.bilibili.lib.setup.SetupTrack r0 = com.bilibili.lib.setup.SetupTrack.f64389a
            r11 = r0
            r0 = r11
            monitor-enter(r0)
            boolean r0 = com.bilibili.lib.setup.SetupTrack.f64391c     // Catch: java.lang.Throwable -> L64
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2e
            r0 = r11
            monitor-exit(r0)
            return
        L2e:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L64
            r12 = r0
            r0 = r12
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            com.bilibili.lib.setup.a r0 = new com.bilibili.lib.setup.a     // Catch: java.lang.Throwable -> L64
            r10 = r0
            r0 = r10
            r1 = r8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            r0 = r12
            r1 = r10
            java.util.Map r1 = r1.a()     // Catch: java.lang.Throwable -> L64
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L64
            com.bilibili.lib.setup.d r0 = com.bilibili.lib.setup.SetupTrack.f64393e     // Catch: java.lang.Throwable -> L64
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L68
            r0 = r8
            java.util.Map r0 = r0.a()     // Catch: java.lang.Throwable -> L64
            r10 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            if (r0 != 0) goto L6c
            goto L68
        L64:
            r8 = move-exception
            goto L8e
        L68:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch: java.lang.Throwable -> L64
            r8 = r0
        L6c:
            r0 = r12
            r1 = r8
            r0.putAll(r1)     // Catch: java.lang.Throwable -> L64
            com.bilibili.bililive.room.ui.guide.bubble.i r0 = com.bilibili.lib.setup.SetupTrack.f64392d     // Catch: java.lang.Throwable -> L64
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L83
            r0 = r8
            r1 = r12
            java.lang.Object r0 = r0.invoke(r1)     // Catch: java.lang.Throwable -> L64
        L83:
            r0 = 1
            com.bilibili.lib.setup.SetupTrack.f64391c = r0     // Catch: java.lang.Throwable -> L64
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L64
            r8 = r0
            r0 = r11
            monitor-exit(r0)
        L8d:
            return
        L8e:
            r0 = r11
            monitor-exit(r0)
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.setup.SetupTrack.a(android.app.Activity):void");
    }
}
