package com.bilibili.playset.note;

import H3.G;
import H3.H;
import H3.I;
import H3.J;
import H3.K;
import H3.L;
import H3.M;
import H3.N;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import ns0.InterfaceC8135c;
import ns0.q;
import ns0.r;
import ns0.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/e.class */
@StabilityInferred(parameters = 0)
public final class e extends ViewModel implements InterfaceC8135c<RspNoteList> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC8135c<RspNoteList> f85162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85163b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f85164c = LazyKt.lazy(new G(9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f85165d = LazyKt.lazy(new H(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f85166e = LazyKt.lazy(new I(6));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f85167f = LazyKt.lazy(new J(8));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f85168g = LazyKt.lazy(new K(6));

    @NotNull
    public final Lazy h = LazyKt.lazy(new L(8));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f85169i = LazyKt.lazy(new M(7));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f85170j = LazyKt.lazy(new N(7));

    public e(@NotNull InterfaceC8135c<RspNoteList> interfaceC8135c) {
        this.f85162a = interfaceC8135c;
    }

    @Override // ns0.InterfaceC8135c
    public final void A(int i7, @NotNull r rVar) {
        this.f85162a.A(i7, rVar);
    }

    @Override // ns0.InterfaceC8135c
    public final void k0(int i7, @NotNull s sVar) {
        this.f85162a.k0(i7, sVar);
    }

    @Override // ns0.InterfaceC8135c
    public final void s0(@NotNull long[] jArr, @NotNull q qVar) {
        this.f85162a.s0(jArr, qVar);
    }
}
