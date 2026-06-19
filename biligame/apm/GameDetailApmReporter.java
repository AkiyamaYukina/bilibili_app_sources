package com.bilibili.biligame.apm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.utils.ABTestUtil;
import com.bilibili.biligame.utils.NumberExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/apm/GameDetailApmReporter.class */
@StabilityInferred(parameters = 0)
public final class GameDetailApmReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f62173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f62174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f62175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f62176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f62177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f62178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f62179g;
    public static long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f62180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f62181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f62182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f62183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f62184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f62185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f62186o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f62188q;

    @NotNull
    public static final GameDetailApmReporter INSTANCE = new GameDetailApmReporter();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f62187p = new LinkedHashMap();
    public static final int $stable = 8;

    public final void cancel() {
        reset();
        f62186o = true;
    }

    public final boolean getTabDelayEnable() {
        return f62188q;
    }

    public final void onPageCreate() {
        reset();
        f62173a = System.currentTimeMillis();
    }

    public final void reportBindViewEnd() {
        if (f62185n) {
            return;
        }
        f62185n = true;
        h = System.currentTimeMillis() - f62174b;
    }

    public final void reportContentInflateStart() {
        if (f62184m) {
            return;
        }
        f62178f = System.currentTimeMillis();
    }

    public final void reportGameContentNetwork() {
        if (f62184m) {
            return;
        }
        f62181j = System.currentTimeMillis() - f62176d;
    }

    public final void reportGameInfoNetwork() {
        if (f62184m) {
            return;
        }
        f62180i = System.currentTimeMillis() - f62176d;
    }

    public final void reportGameModuleNetwork() {
        if (f62184m) {
            return;
        }
        f62182k = System.currentTimeMillis() - f62176d;
    }

    public final void reportLoadEnd() {
        if (f62184m || f62183l) {
            return;
        }
        f62183l = true;
        if (!ABTestUtil.INSTANCE.isDetailPrefetchEnable()) {
            f62177e = System.currentTimeMillis() - f62176d;
        } else if (f62173a > 0) {
            f62177e = System.currentTimeMillis() - f62173a;
        }
    }

    public final void reportLoadStart() {
        if (f62184m) {
            return;
        }
        f62176d = System.currentTimeMillis();
    }

    public final void reportPageRenderEnd() {
        if (f62186o) {
            return;
        }
        f62186o = true;
        f62175c = System.currentTimeMillis() - f62174b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = f62173a;
        Map<String, String> map = f62187p;
        map.put("page_total_cost", String.valueOf(jCurrentTimeMillis - j7));
        map.put("page_inflate_cost", String.valueOf(f62179g));
        map.put("page_bind_view_cost", String.valueOf(h));
        map.put("page_render_cost", String.valueOf(f62175c));
        map.put("load_total_cost", String.valueOf(f62177e));
        map.put("detail_prefetch_enable", NumberExtensionsKt.toIntString(Boolean.valueOf(ABTestUtil.INSTANCE.isDetailPrefetchEnable())));
        map.put("detail_tab_delay_enable", NumberExtensionsKt.toIntString(Boolean.valueOf(f62188q)));
        map.put("game_info_network_cost", String.valueOf(f62180i));
        map.put("game_content_network_cost", String.valueOf(f62181j));
        map.put("game_module_network_cost", String.valueOf(f62182k));
        if (Config.isDebuggable()) {
            Objects.toString(map);
        } else {
            ReporterV3.reportSystem("game-ball.game-detail.render.sys", map);
        }
    }

    public final void reportPageRenderStart() {
        if (f62184m) {
            return;
        }
        f62184m = true;
        f62179g = System.currentTimeMillis() - f62178f;
        f62174b = System.currentTimeMillis();
    }

    public final void reset() {
        f62176d = 0L;
        f62180i = 0L;
        f62181j = 0L;
        f62182k = 0L;
        f62177e = 0L;
        f62173a = 0L;
        f62174b = 0L;
        f62175c = 0L;
        f62178f = 0L;
        f62179g = 0L;
        h = 0L;
        f62183l = false;
        f62184m = false;
        f62185n = false;
        f62186o = false;
        ((LinkedHashMap) f62187p).clear();
    }

    public final void setReportExtend(@Nullable Map<String, String> map) {
        if (map != null) {
            f62187p.putAll(map);
        }
    }

    public final void setTabDelayEnable(boolean z6) {
        f62188q = z6;
    }
}
