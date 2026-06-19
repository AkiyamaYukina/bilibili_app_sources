package com.bilibili.lib.projection.commonburid;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastEventTrackingManager.class */
public final class CastEventTrackingManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CastEventTrackingManager f62993c = new CastEventTrackingManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f62994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CastCommonParameters f62995b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/commonburid/CastEventTrackingManager$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CastEventTrackingManager instance() {
            return CastEventTrackingManager.f62993c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackClick$default(CastEventTrackingManager castEventTrackingManager, String str, Map map, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        castEventTrackingManager.trackClick(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackShow$default(CastEventTrackingManager castEventTrackingManager, String str, Map map, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        castEventTrackingManager.trackShow(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000b, B:14:0x0022, B:19:0x0031, B:12:0x001d), top: B:27:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> a() {
        /*
            r4 = this;
            r0 = r4
            monitor-enter(r0)
            r0 = r4
            com.bilibili.lib.projection.commonburid.CastCommonParameters r0 = r0.commonParams()     // Catch: java.lang.Throwable -> L19
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1d
            r0 = r5
            java.util.Map r0 = r0.toMap()     // Catch: java.lang.Throwable -> L19
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L21
            goto L1d
        L19:
            r5 = move-exception
            goto L43
        L1d:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch: java.lang.Throwable -> L19
            r5 = r0
        L21:
            r0 = r4
            boolean r0 = r0.f62994a     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L2e
            java.lang.String r0 = "1"
            r6 = r0
            goto L31
        L2e:
            java.lang.String r0 = "0"
            r6 = r0
        L31:
            r0 = r5
            java.lang.String r1 = "is_cast_with_bili_connect"
            r2 = r6
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)     // Catch: java.lang.Throwable -> L19
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)     // Catch: java.lang.Throwable -> L19
            java.util.Map r0 = kotlin.collections.MapsKt.plus(r0, r1)     // Catch: java.lang.Throwable -> L19
            r5 = r0
            r0 = r4
            monitor-exit(r0)
            r0 = r5
            return r0
        L43:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.commonburid.CastEventTrackingManager.a():java.util.Map");
    }

    @Nullable
    public final CastCommonParameters commonParams() {
        CastCommonParameters castCommonParameters;
        synchronized (this) {
            castCommonParameters = this.f62995b;
        }
        return castCommonParameters;
    }

    public final void trackClick(@NotNull String str, @NotNull Map<String, String> map) {
        Neurons.reportClick(false, str, MapsKt.plus(a(), map));
    }

    public final void trackShow(@NotNull String str, @NotNull Map<String, String> map) {
        Neurons.reportExposure$default(false, str, MapsKt.plus(a(), map), (List) null, 8, (Object) null);
    }

    public final void updateCastBiliConnect(boolean z6) {
        synchronized (this) {
            this.f62994a = z6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0009, B:8:0x0013, B:10:0x001c, B:13:0x002b, B:15:0x0034, B:17:0x003d, B:19:0x0045, B:20:0x0050), top: B:28:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateCommonParams(@org.jetbrains.annotations.NotNull com.bilibili.lib.projection.commonburid.CastCommonParameters r4) {
        /*
            r3 = this;
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            com.bilibili.lib.projection.commonburid.CastCommonParameters r0 = r0.f62995b     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L50
            ie0.c r0 = ie0.C7564c.f121625a     // Catch: java.lang.Throwable -> L27
            r5 = r0
            boolean r0 = ie0.C7564c.l()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L50
            r0 = r3
            com.bilibili.lib.projection.commonburid.CastCommonParameters r0 = r0.f62995b     // Catch: java.lang.Throwable -> L27
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2b
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.getContentId()     // Catch: java.lang.Throwable -> L27
            r0.updateContentId(r1)     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r4 = move-exception
            goto L58
        L2b:
            r0 = r3
            com.bilibili.lib.projection.commonburid.CastCommonParameters r0 = r0.f62995b     // Catch: java.lang.Throwable -> L27
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L3c
            r0 = r5
            r1 = r4
            com.bilibili.lib.projection.commonburid.CastContentType r1 = r1.getContentType()     // Catch: java.lang.Throwable -> L27
            r0.updateContentType(r1)     // Catch: java.lang.Throwable -> L27
        L3c:
            r0 = r3
            com.bilibili.lib.projection.commonburid.CastCommonParameters r0 = r0.f62995b     // Catch: java.lang.Throwable -> L27
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L55
            r0 = r5
            r1 = r4
            com.bilibili.lib.projection.commonburid.CastEnterSource r1 = r1.getEnterSource()     // Catch: java.lang.Throwable -> L27
            r0.updateEnterSource(r1)     // Catch: java.lang.Throwable -> L27
            goto L55
        L50:
            r0 = r3
            r1 = r4
            r0.f62995b = r1     // Catch: java.lang.Throwable -> L27
        L55:
            r0 = r3
            monitor-exit(r0)
            return
        L58:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.commonburid.CastEventTrackingManager.updateCommonParams(com.bilibili.lib.projection.commonburid.CastCommonParameters):void");
    }
}
