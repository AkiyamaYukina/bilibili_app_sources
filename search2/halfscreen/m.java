package com.bilibili.search2.halfscreen;

import Ns0.b;
import Ns0.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.ViewModel;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.halfscreen.b;
import com.bilibili.search2.halfscreen.g;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.ogv.a;
import com.bilibili.search2.main.ogv.d;
import com.bilibili.search2.main.ogv.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/m.class */
@StabilityInferred(parameters = 0)
public final class m extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<h> f86609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<h> f86610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Channel<b> f86611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<b> f86612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f86613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f86614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public d.b f86615g;

    @NotNull
    public a h;

    public m() {
        MutableStateFlow<h> MutableStateFlow = StateFlowKt.MutableStateFlow(new h(false, d.a.f86868a, f.a.f86884a, a.C0582a.f86856a, null, 0, 0.0f, false));
        this.f86609a = MutableStateFlow;
        this.f86610b = FlowKt.asStateFlow(MutableStateFlow);
        Channel<b> channelChannel$default = ChannelKt.Channel$default(-2, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.f86611c = channelChannel$default;
        this.f86612d = FlowKt.receiveAsFlow(channelChannel$default);
        this.h = new a(0, 0);
    }

    public final com.bilibili.search2.main.ogv.d I0(com.bilibili.search2.main.ogv.d dVar) {
        int i7;
        if (!(dVar instanceof d.b)) {
            return dVar;
        }
        d.b bVar = (d.b) dVar;
        int width = bVar.f86869a.getWidth();
        int height = bVar.f86869a.getHeight();
        a aVar = this.h;
        int i8 = aVar.f86555a;
        int iCoerceIn = (width <= 0 || height <= 0 || i8 <= 0 || (i7 = aVar.f86556b) <= 0) ? 0 : RangesKt.coerceIn((int) ((width * i7) / i8), 0, height);
        Integer numValueOf = iCoerceIn <= 0 ? null : Integer.valueOf(RangesKt.coerceAtLeast(height - iCoerceIn, 0));
        int i9 = bVar.f86870b;
        return numValueOf != null ? d.b.a(bVar, RangesKt.coerceIn(i9, 0, numValueOf.intValue()), null, null, 13) : d.b.a(bVar, RangesKt.coerceAtLeast(i9, 0), null, null, 13);
    }

    public final void J0(@NotNull g gVar) {
        int i7;
        com.bilibili.search2.main.ogv.d dVarA;
        boolean z6 = gVar instanceof g.d;
        Channel<b> channel = this.f86611c;
        MutableStateFlow<h> mutableStateFlow = this.f86609a;
        if (z6) {
            Ns0.b bVar = ((g.d) gVar).f86570a;
            if (bVar instanceof b.c) {
                ChannelResult.box-impl(channel.trySend-JP2dKIU(b.d.f86560a));
                return;
            }
            if (bVar instanceof b.d) {
                boolean z7 = ((h) mutableStateFlow.getValue()).f86582a;
                b.d dVar = (b.d) bVar;
                boolean z8 = dVar.f17435a == 2;
                if (z8 && !z7) {
                    String str = this.f86613e;
                    boolean z9 = Xs0.b.f28321a;
                    Neurons.reportClick(false, "search.search-result.search-float.full-screen.click", W.a("query", str, "switch_type", "1"));
                }
                h hVar = (h) mutableStateFlow.getValue();
                int i8 = dVar.f17435a;
                mutableStateFlow.setValue(h.a(hVar, z8, null, null, null, null, 0, 0.0f, i8 == 3, SearchBangumiItem.TYPE_FULLNET_MOVIE));
                if (i8 == 2) {
                    channel.trySend-JP2dKIU(b.C0578b.f86558a);
                    return;
                }
                return;
            }
            return;
        }
        if (gVar instanceof g.e) {
            SearchPageStateModel.DisplayPage displayPage = ((g.e) gVar).f86571a;
            SearchPageStateModel.DisplayPage displayPage2 = SearchPageStateModel.DisplayPage.DISCOVER;
            if (displayPage == displayPage2 || displayPage == SearchPageStateModel.DisplayPage.SUGGEST) {
                if (!((h) mutableStateFlow.getValue()).f86582a) {
                    String str2 = displayPage == displayPage2 ? "2" : "3";
                    String str3 = this.f86613e;
                    boolean z10 = Xs0.b.f28321a;
                    Neurons.reportClick(false, "search.search-result.search-float.full-screen.click", W.a("query", str3, "switch_type", str2));
                }
                channel.trySend-JP2dKIU(new b.c(f.b.f17442a));
                return;
            }
            return;
        }
        if (gVar instanceof g.m) {
            String str4 = ((h) mutableStateFlow.getValue()).f86582a ? "2" : "1";
            String str5 = this.f86613e;
            boolean z11 = Xs0.b.f28321a;
            Neurons.reportClick(false, "search.search-result.search-float.close.click", W.a("query", str5, "float_type", str4));
            mutableStateFlow.setValue(h.a((h) mutableStateFlow.getValue(), false, null, null, null, null, 0, 0.0f, true, SearchBangumiItem.TYPE_FULLNET_BANGUMI));
            channel.trySend-JP2dKIU(new b.c(f.a.f17441a));
            return;
        }
        if (gVar instanceof g.C0579g) {
            com.bilibili.search2.main.ogv.d dVar2 = ((g.C0579g) gVar).f86573a;
            if (dVar2 instanceof d.b) {
                com.bilibili.search2.main.ogv.d dVar3 = ((h) mutableStateFlow.getValue()).f86583b;
                d.b bVar2 = dVar3 instanceof d.b ? (d.b) dVar3 : null;
                if (bVar2 == null) {
                    dVarA = dVar2;
                } else {
                    d.b bVar3 = (d.b) dVar2;
                    dVarA = !Intrinsics.areEqual(bVar2.f86869a, bVar3.f86869a) ? dVar2 : d.b.a(bVar3, bVar2.f86870b, null, null, 13);
                }
            } else {
                dVarA = dVar2;
            }
            mutableStateFlow.setValue(h.a((h) mutableStateFlow.getValue(), false, I0(dVarA), null, null, null, 0, 0.0f, false, 253));
            return;
        }
        if (gVar instanceof g.h) {
            com.bilibili.search2.main.ogv.d dVar4 = ((h) mutableStateFlow.getValue()).f86583b;
            if (dVar4 instanceof d.b) {
                d.b bVar4 = (d.b) dVar4;
                int i9 = bVar4.f86870b;
                int i10 = ((g.h) gVar).f86574a;
                int width = bVar4.f86869a.getWidth();
                int height = bVar4.f86869a.getHeight();
                a aVar = this.h;
                int i11 = aVar.f86555a;
                int iCoerceIn = (width <= 0 || height <= 0 || i11 <= 0 || (i7 = aVar.f86556b) <= 0) ? 0 : RangesKt.coerceIn((int) ((width * i7) / i11), 0, height);
                mutableStateFlow.setValue(h.a((h) mutableStateFlow.getValue(), false, d.b.a(bVar4, (int) RangesKt.coerceIn(((long) i9) + ((long) i10), 0L, (iCoerceIn <= 0 ? null : Integer.valueOf(RangesKt.coerceAtLeast(height - iCoerceIn, 0))) != null ? r13.intValue() : 2147483647L), null, null, 13), null, null, null, 0, 0.0f, false, 253));
                return;
            }
            return;
        }
        if (gVar instanceof g.j) {
            g.j jVar = (g.j) gVar;
            this.h = new a(jVar.f86576a, jVar.f86577b);
            com.bilibili.search2.main.ogv.d dVar5 = ((h) mutableStateFlow.getValue()).f86583b;
            com.bilibili.search2.main.ogv.d dVarI0 = I0(dVar5);
            if (Intrinsics.areEqual(dVarI0, dVar5)) {
                return;
            }
            mutableStateFlow.setValue(h.a((h) mutableStateFlow.getValue(), false, dVarI0, null, null, null, 0, 0.0f, false, 253));
            return;
        }
        if (gVar instanceof g.i) {
            mutableStateFlow.setValue(h.a((h) mutableStateFlow.getValue(), false, null, ((g.i) gVar).f86575a, null, null, 0, 0.0f, false, 251));
            return;
        }
        if (gVar instanceof g.b) {
            mutableStateFlow.setValue(h.a((h) mutableStateFlow.getValue(), false, null, null, ((g.b) gVar).f86568a, null, 0, 0.0f, false, 247));
            return;
        }
        if (gVar instanceof g.k) {
            this.f86613e = ((g.k) gVar).f86578a;
            return;
        }
        if (gVar instanceof g.l) {
            com.bilibili.search2.main.ogv.d dVar6 = ((h) mutableStateFlow.getValue()).f86583b;
            d.b bVar5 = null;
            if (dVar6 instanceof d.b) {
                bVar5 = (d.b) dVar6;
            }
            this.f86615g = bVar5;
            return;
        }
        if (gVar instanceof g.c) {
            this.f86615g = null;
            return;
        }
        if (gVar instanceof g.n) {
            this.f86614f = ((g.n) gVar).f86581a;
            return;
        }
        if (gVar instanceof g.a) {
            h hVar2 = (h) mutableStateFlow.getValue();
            g.a aVar2 = (g.a) gVar;
            int i12 = aVar2.f86566a;
            float f7 = aVar2.f86567b;
            mutableStateFlow.setValue(h.a(hVar2, false, null, null, null, f7 < 0.0f ? null : Dp.m3878boximpl(Dp.m3880constructorimpl(((this.f86614f - 16.0f) * RangesKt.coerceIn(f7, 0.0f, 1.0f)) + 16.0f)), i12, f7, false, 143));
            return;
        }
        if (!(gVar instanceof g.f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((h) mutableStateFlow.getValue()).f86582a) {
            channel.trySend-JP2dKIU(new b.a(((g.f) gVar).f86572a));
        }
    }
}
