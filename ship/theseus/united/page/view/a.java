package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.Arc;
import com.bapis.bilibili.app.viewunite.v1.Rights;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f104037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f104038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f104039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f104040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f104041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f104042g;

    @NotNull
    public final MutableStateFlow<String> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f104043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f104044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final q f104045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f104046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f104047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f104048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f104049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f104050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f104051q;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull ViewReply viewReply) {
        q qVar;
        this.f104036a = coroutineScope;
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(Long.valueOf(viewReply.getArc().getAid()));
        this.f104037b = MutableStateFlow;
        this.f104038c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.f104039d = MutableStateFlow2;
        this.f104040e = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Long> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0L);
        this.f104041f = MutableStateFlow3;
        this.f104042g = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow("");
        this.h = MutableStateFlow4;
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0);
        this.f104043i = MutableStateFlow5;
        this.f104044j = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Long> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0L);
        this.f104048n = MutableStateFlow6;
        this.f104049o = FlowKt.asStateFlow(MutableStateFlow6);
        if (!viewReply.hasArc()) {
            this.f104051q = 0;
            return;
        }
        Arc arc = viewReply.getArc();
        MutableStateFlow2.setValue(arc.getBvid());
        MutableStateFlow3.setValue(Long.valueOf(arc.getCid()));
        MutableStateFlow5.setValue(Integer.valueOf(arc.getCopyright()));
        MutableStateFlow6.setValue(Long.valueOf(arc.getDuration()));
        if (arc.hasRight()) {
            Rights right = arc.getRight();
            qVar = new q(right.getOnlyVipDownload(), right.getNoReprint(), right.getDownload(), right.getIsChargingPay());
        } else {
            qVar = null;
        }
        this.f104045k = qVar;
        this.f104047m = arc.getTypeId();
        this.f104046l = arc.getCover();
        MutableStateFlow.setValue(Long.valueOf(arc.getAid()));
        MutableStateFlow4.setValue(arc.getTitle());
        this.f104051q = arc.getState();
    }

    public final long a() {
        return ((Number) this.f104037b.getValue()).longValue();
    }

    @NotNull
    public final String b() {
        return String.valueOf(((Number) this.f104037b.getValue()).longValue());
    }

    public final long c() {
        return ((Number) this.f104041f.getValue()).longValue();
    }

    @NotNull
    public final String d() {
        return String.valueOf(((Number) this.f104041f.getValue()).longValue());
    }

    public final boolean e() {
        MutableStateFlow<Integer> mutableStateFlow = this.f104043i;
        boolean z6 = true;
        if (((Number) mutableStateFlow.getValue()).intValue() != 1) {
            z6 = ((Number) mutableStateFlow.getValue()).intValue() == 3;
        }
        return z6;
    }

    @NotNull
    public final String f() {
        return (String) this.h.getValue();
    }

    public final long g() {
        return ((Number) this.f104048n.getValue()).longValue();
    }
}
