package com.bilibili.search2.result.all;

import M3.T;
import androidx.compose.foundation.gestures.C3388d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/m.class */
@StabilityInferred(parameters = 0)
public final class C6059m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C6059m f87303a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static C6058l f87304b = new C6058l();

    public static void a(long j7, String str, Map map) {
        Long lValueOf = Long.valueOf(j7);
        if (j7 <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            map.put(str, String.valueOf(lValueOf.longValue()));
        }
    }

    public static void b(int i7, long j7, long j8, boolean z6) {
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "[recommendRequestTimeConsuming] {\"start_time\":", ",\"end_time\":");
        androidx.media3.common.G.a(i7, j8, ",\"flush\":", sbA);
        sbA.append(",\"status\":");
        sbA.append(z6);
        sbA.append(ReporterMap.RIGHT_BRACES);
        BLog.i("search", sbA.toString());
    }

    public static void c() {
        C6058l c6058l = f87304b;
        c6058l.getClass();
        KProperty<Object> kProperty = C6058l.f87297f[0];
        if (c6058l.f87298a.a().longValue() == 0) {
            return;
        }
        C3388d c3388d = new C3388d(1);
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("event_type", "main_fragment_time")});
        c3388d.invoke(mapMutableMapOf);
        BLog.i(C6059m.class.getSimpleName(), "report:" + mapMutableMapOf);
        Neurons.trackT$default(false, "main.search.show.track", mapMutableMapOf, 0, new T(5), 8, (Object) null);
    }
}
