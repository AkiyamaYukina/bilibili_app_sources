package com.bilibili.lib.tribe.core.internal.report;

import Ef0.InterfaceC1646e;
import Ff0.C1885b;
import androidx.compose.ui.text.font.Font;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.tribe.runtime.TribeApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/report/a.class */
public final class a implements ReporterService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Pair<String, Map<String, String>>> f64655a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC1646e f64656b;

    @Override // com.bilibili.lib.tribe.core.internal.report.ReporterService
    public final void a(@NotNull InterfaceC1646e interfaceC1646e) {
        synchronized (this) {
            this.f64656b = interfaceC1646e;
            for (Pair pair : (ArrayList) this.f64655a) {
                interfaceC1646e.report((String) pair.getFirst(), (Map) pair.getSecond());
            }
            ((ArrayList) this.f64655a).clear();
        }
    }

    public final void c(int i7, long j7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("actionName", str), TuplesKt.to("bundleName", str2), TuplesKt.to("bundleVersionCode", String.valueOf(j7)), TuplesKt.to("bundleVersionName", str3), TuplesKt.to("bundleType", str4), TuplesKt.to(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(i7)), TuplesKt.to("costMillis", String.valueOf(j8)), TuplesKt.to(Constant.IN_KEY_SESSION_ID, C1885b.f6130a)});
        if (str5 != null) {
            mapMutableMapOf.put("message", str5);
        }
        if (str6 != null) {
            mapMutableMapOf.put("sourceFrom", str6);
        }
        if (str7 != null) {
            mapMutableMapOf.put("uninstallReason", str7);
        }
        if (str8 != null) {
            mapMutableMapOf.put("stage", str8);
        }
        e("tribe.runtime.bundle.action", mapMutableMapOf);
    }

    public final void d(boolean z6, long j7, long j8, long j9, long j10, @Nullable String str) {
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(ThirdPartyExtraBuilder.KEY_RESULT, z6 ? "0" : "1"), TuplesKt.to("initMillis", String.valueOf(j7)), TuplesKt.to("installStashMillis", String.valueOf(j8)), TuplesKt.to("loadAndActivateMillis", String.valueOf(j9)), TuplesKt.to("insertResMillis", String.valueOf(j10))});
        if (str != null) {
            mapMutableMapOf.put("message", str);
        }
        e("tribe.runtime.init", mapMutableMapOf);
    }

    public final void e(String str, Map<String, String> map) {
        synchronized (this) {
            map.put("tribeVersion", String.valueOf(TribeApi.getBundles().g().getVersionCode()));
            InterfaceC1646e interfaceC1646e = this.f64656b;
            if (interfaceC1646e != null) {
                interfaceC1646e.report(str, map);
            } else {
                ((ArrayList) this.f64655a).add(TuplesKt.to(str, map));
            }
        }
    }

    public final void f(int i7, @NotNull String str, @NotNull List list) {
        e("tribe.runtime.timeout", MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("actionName", str), TuplesKt.to("timeoutMillis", String.valueOf(Font.MaximumAsyncTimeoutMillis)), TuplesKt.to("submittedCount", String.valueOf(i7)), TuplesKt.to("timedOutCount", String.valueOf(((ArrayList) list).size())), TuplesKt.to("timedOutTargets", CollectionsKt.p(list, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62)), TuplesKt.to(Constant.IN_KEY_SESSION_ID, C1885b.f6130a)}));
    }
}
