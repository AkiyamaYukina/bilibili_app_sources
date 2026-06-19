package com.bilibili.ship.theseus.united.page.performance;

import GS0.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliConfig;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.BootOpt;
import com.bilibili.ogv.infra.util.i;
import java.util.HashMap;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import th1.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/UnitedProfilerReporter.class */
@Singleton
@StabilityInferred(parameters = 1)
@Named("united_page")
public final class UnitedProfilerReporter implements th1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f102233b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102234a = BiliConfig.getBiliVersionCode();

    public static final void b(UnitedProfilerReporter unitedProfilerReporter, HashMap map) {
        unitedProfilerReporter.getClass();
        Neurons.trackT$default(false, "main.detail.ugc.show.verbose", map, 0, new k(unitedProfilerReporter, 5), 8, (Object) null);
        BootOpt bootOpt = BootOpt.INSTANCE;
        long jE = i.e((String) map.get("renderFirstFrameTime"));
        long jE2 = i.e((String) map.get("LayoutTime"));
        String str = (String) map.get("from_spmid");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        bootOpt.recordMainDetailUgcShowVerbose(jE, jE2, str2);
    }

    public static boolean c() {
        String str = (String) ConfigManager.Companion.config().get("videodetail.united_flash_trace_sample", "5");
        Integer intOrNull = StringsKt.toIntOrNull(str != null ? str : "5");
        return d.a(intOrNull != null ? intOrNull.intValue() : 5);
    }

    public final void a(@NotNull tv.danmaku.bili.videopage.common.performance.b bVar, @NotNull JSONObject jSONObject) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new UnitedProfilerReporter$reportPage$1(jSONObject, bVar, this, null), 2, (Object) null);
    }
}
