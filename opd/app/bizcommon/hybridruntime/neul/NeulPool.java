package com.bilibili.opd.app.bizcommon.hybridruntime.neul;

import Am0.c;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.analytics.C;
import com.alibaba.fastjson.TypeReference;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulPool.class */
public final class NeulPool {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Lazy<NeulPool> f73574l = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Am0.b(0));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final Object f73575m = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f73579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f73580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f73581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f73582g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f73583i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, HybridWebViewV2> f73576a = new HashMap<>(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashSet<HybridWebViewV2> f73577b = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<String, HybridWebViewV2> f73578c = new HashMap<>(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f73584j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f73585k = LazyKt.lazy(new c(0));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulPool$ArkMapping.class */
    @Keep
    public static final class ArkMapping {

        @NotNull
        private List<String> mapping;

        @NotNull
        private String targetUrl;

        public ArkMapping() {
            this(null, null, 3, null);
        }

        public ArkMapping(@NotNull String str, @NotNull List<String> list) {
            this.targetUrl = str;
            this.mapping = list;
        }

        public /* synthetic */ ArkMapping(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ArkMapping copy$default(ArkMapping arkMapping, String str, List list, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = arkMapping.targetUrl;
            }
            if ((i7 & 2) != 0) {
                list = arkMapping.mapping;
            }
            return arkMapping.copy(str, list);
        }

        @NotNull
        public final String component1() {
            return this.targetUrl;
        }

        @NotNull
        public final List<String> component2() {
            return this.mapping;
        }

        @NotNull
        public final ArkMapping copy(@NotNull String str, @NotNull List<String> list) {
            return new ArkMapping(str, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArkMapping)) {
                return false;
            }
            ArkMapping arkMapping = (ArkMapping) obj;
            return Intrinsics.areEqual(this.targetUrl, arkMapping.targetUrl) && Intrinsics.areEqual(this.mapping, arkMapping.mapping);
        }

        @NotNull
        public final List<String> getMapping() {
            return this.mapping;
        }

        @NotNull
        public final String getTargetUrl() {
            return this.targetUrl;
        }

        public int hashCode() {
            return this.mapping.hashCode() + (this.targetUrl.hashCode() * 31);
        }

        public final void setMapping(@NotNull List<String> list) {
            this.mapping = list;
        }

        public final void setTargetUrl(@NotNull String str) {
            this.targetUrl = str;
        }

        @NotNull
        public String toString() {
            return C.a("ArkMapping(targetUrl=", this.targetUrl, ", mapping=", ")", this.mapping);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulPool$a.class */
    public static final class a {
        @NotNull
        public static NeulPool a() {
            return (NeulPool) NeulPool.f73574l.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulPool$b.class */
    public static final class b extends TypeReference<ArrayList<ArkMapping>> {
    }

    public final Pair<String, HybridWebViewV2> a(String str, String str2) {
        HybridWebViewV2 hybridWebViewV2;
        try {
            for (ArkMapping arkMapping : (List) this.f73585k.getValue()) {
                if (arkMapping.getMapping().contains(str2) && (hybridWebViewV2 = this.f73576a.get(arkMapping.getTargetUrl())) != null) {
                    BLog.d("Neul", str + " ark page ->" + str2 + " resume-> " + arkMapping.getTargetUrl() + " ->" + hybridWebViewV2);
                    return TuplesKt.to(arkMapping.getTargetUrl(), hybridWebViewV2);
                }
            }
            return null;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
