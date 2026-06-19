package com.bilibili.ship.theseus.ogv.report;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.gripper.container.bpush.i;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AutoPlayService f94401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f94402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f94403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94405e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/d$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f94406a;

        public a(d dVar) {
            this.f94406a = dVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            d dVar = this.f94406a;
            if (dVar.f94401a.h) {
                c cVar = dVar.f94403c;
                if (cVar.f94416c && !cVar.f94421i) {
                    cVar.f94421i = true;
                    Pair pair = TuplesKt.to("ep_id", cVar.f94414a);
                    Pair pair2 = TuplesKt.to("season_id", cVar.f94415b);
                    b bVar = dVar.f94402b;
                    Neurons.trackT$default(false, "ogv.pgc-video-detail.quit", MapsKt.hashMapOf(new Pair[]{pair, pair2, TuplesKt.to("fast_play", bVar.f94407a ? "1" : "0"), TuplesKt.to("view_data", cVar.f94417d ? "1" : "0"), TuplesKt.to("playview_data", cVar.f94418e ? "1" : "0"), TuplesKt.to("first_frame", cVar.f94419f ? "1" : "0"), TuplesKt.to("has_dialog", cVar.f94420g ? "1" : "0"), TuplesKt.to("is_background", cVar.h ? "1" : "0"), TuplesKt.to("dialog_type", cVar.f94422j), TuplesKt.to("from_spmid", bVar.f94410d), TuplesKt.to("params", bVar.h), TuplesKt.to("intent_action", bVar.f94413g), TuplesKt.to("intent_epid", bVar.f94411e), TuplesKt.to("intent_params", bVar.f94409c), TuplesKt.to("intent_seasonid", bVar.f94412f), TuplesKt.to("is_share", bVar.f94408b ? "1" : "0"), TuplesKt.to("is_unite_detail", "1")}), 0, new i(true), 8, (Object) null);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/d$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f94407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f94408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f94409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f94410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f94411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f94412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f94413g;

        @NotNull
        public final String h;

        public b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z6, boolean z7) {
            this.f94407a = z6;
            this.f94408b = z7;
            this.f94409c = str;
            this.f94410d = str2;
            this.f94411e = str3;
            this.f94412f = str4;
            this.f94413g = str5;
            this.h = str6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f94407a == bVar.f94407a && this.f94408b == bVar.f94408b && Intrinsics.areEqual(this.f94409c, bVar.f94409c) && Intrinsics.areEqual(this.f94410d, bVar.f94410d) && Intrinsics.areEqual(this.f94411e, bVar.f94411e) && Intrinsics.areEqual(this.f94412f, bVar.f94412f) && Intrinsics.areEqual(this.f94413g, bVar.f94413g) && Intrinsics.areEqual(this.h, bVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + E.a(E.a(E.a(E.a(E.a(z.a(Boolean.hashCode(this.f94407a) * 31, 31, this.f94408b), 31, this.f94409c), 31, this.f94410d), 31, this.f94411e), 31, this.f94412f), 31, this.f94413g);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(isFastPlay=");
            sb.append(this.f94407a);
            sb.append(", isShare=");
            sb.append(this.f94408b);
            sb.append(", intentExtraParams=");
            sb.append(this.f94409c);
            sb.append(", fromSpmid=");
            sb.append(this.f94410d);
            sb.append(", intentEpid=");
            sb.append(this.f94411e);
            sb.append(", intentSeasonid=");
            sb.append(this.f94412f);
            sb.append(", intentAction=");
            sb.append(this.f94413g);
            sb.append(", urlParams=");
            return C8770a.a(sb, this.h, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/d$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f94414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f94415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f94416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f94417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f94418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f94419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f94420g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f94421i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public String f94422j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bilibili.ship.theseus.ogv.report.d$c, java.lang.Object] */
    @Inject
    public d(@NotNull AutoPlayService autoPlayService, @NotNull b bVar, @NotNull Lifecycle lifecycle) {
        this.f94401a = autoPlayService;
        this.f94402b = bVar;
        ?? obj = new Object();
        obj.f94414a = "";
        obj.f94415b = "";
        obj.f94416c = false;
        obj.f94417d = false;
        obj.f94418e = false;
        obj.f94419f = false;
        obj.f94420g = false;
        obj.h = false;
        obj.f94421i = false;
        obj.f94422j = "";
        this.f94403c = obj;
        this.f94404d = true;
        lifecycle.addObserver(new a(this));
    }

    public final void a(@Nullable Long l7, @Nullable Long l8) {
        if (this.f94404d) {
            c cVar = this.f94403c;
            if (l7 != null && l7.longValue() != 0) {
                cVar.f94414a = String.valueOf(l7.longValue());
            }
            if (l8 == null || l8.longValue() == 0) {
                return;
            }
            cVar.f94415b = String.valueOf(l8.longValue());
        }
    }
}
