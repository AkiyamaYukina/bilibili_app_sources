package com.bilibili.ogv.operation2.viptask;

import UR0.e;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleRegistry;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f71012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f71014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Group f71015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Group f71016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f71017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ProgressBar f71018g;

    @NotNull
    public InterfaceC0437a h = InterfaceC0437a.c.f71024a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f71019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f71020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f71021k;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/a$a.class */
    public interface InterfaceC0437a {

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/a$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0438a implements InterfaceC0437a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0438a f71022a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0438a);
            }

            public final int hashCode() {
                return 1435647191;
            }

            @NotNull
            public final String toString() {
                return "Completed";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.a$a$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/a$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements InterfaceC0437a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f71023a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -104162115;
            }

            @NotNull
            public final String toString() {
                return "Countdown";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.a$a$c */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/a$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements InterfaceC0437a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f71024a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -44496039;
            }

            @NotNull
            public final String toString() {
                return "Stopped";
            }
        }

        default boolean a() {
            return Intrinsics.areEqual(this, C0438a.f71022a) || Intrinsics.areEqual(this, c.f71024a);
        }
    }

    public a(@NotNull View view, @NotNull String str, @NotNull LifecycleRegistry lifecycleRegistry) {
        this.f71012a = view;
        this.f71013b = str;
        this.f71014c = lifecycleRegistry;
        this.f71015d = (Group) view.findViewById(2131302385);
        this.f71016e = (Group) view.findViewById(2131302383);
        this.f71017f = (TextView) view.findViewById(2131313938);
        this.f71018g = (ProgressBar) view.findViewById(2131309301);
        view.setOnClickListener(new e(this, 3));
    }

    public static final void a(a aVar, Throwable th) {
        aVar.getClass();
        if (!com.bilibili.ogv.infra.util.e.a(th)) {
            com.bilibili.ogv.infra.util.e.b(th);
        }
        if (th instanceof BiliApiException) {
            ToastHelper.showToastShort(aVar.f71012a.getContext(), th.getMessage());
        }
    }

    public static ArrayMap b() {
        BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
        VipUserInfo vipInfo = biliAccountInfo.getVipInfo();
        String strValueOf = vipInfo != null ? String.valueOf(vipInfo.getVipStatus()) : null;
        String str = strValueOf;
        if (strValueOf == null) {
            str = "";
        }
        Pair pair = TuplesKt.to("vip_status", str);
        VipUserInfo vipInfo2 = biliAccountInfo.getVipInfo();
        String strValueOf2 = vipInfo2 != null ? String.valueOf(vipInfo2.getVipType()) : null;
        String str2 = strValueOf2;
        if (strValueOf2 == null) {
            str2 = "";
        }
        Pair pair2 = TuplesKt.to("vip_type", str2);
        VipUserInfo vipInfo3 = biliAccountInfo.getVipInfo();
        String strValueOf3 = null;
        if (vipInfo3 != null) {
            strValueOf3 = String.valueOf(vipInfo3.getEndTime());
        }
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        return ArrayMapKt.arrayMapOf(pair, pair2, TuplesKt.to("vip_due_date", strValueOf3));
    }

    public final void c(int i7, @Nullable String str) {
        InterfaceC0437a interfaceC0437a = this.h;
        InterfaceC0437a.c cVar = InterfaceC0437a.c.f71024a;
        if (Intrinsics.areEqual(interfaceC0437a, cVar)) {
            this.f71020j = i7;
            this.f71019i = i7;
            this.h = InterfaceC0437a.b.f71023a;
            if (i7 <= 0) {
                this.f71012a.setVisibility(8);
                this.h = cVar;
                return;
            }
            this.f71018g.setMax(i7);
            this.f71018g.setProgress(0);
            this.f71012a.setVisibility(0);
            this.f71016e.setVisibility(8);
            this.f71015d.setVisibility(0);
            Neurons.reportExposure$default(false, C8770a.a(new StringBuilder("pgc."), this.f71013b, ".task-timer.start.show"), b(), (List) null, 8, (Object) null);
            if (this.f71019i <= 0 || this.h.a()) {
                return;
            }
            Job job = this.f71021k;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f71021k = BuildersKt.launch$default(LifecycleKt.getCoroutineScope(this.f71014c), (CoroutineContext) null, (CoroutineStart) null, new BangumiTabVipPendantViewHelper$startCountdown$1(this, str, null), 3, (Object) null);
        }
    }
}
