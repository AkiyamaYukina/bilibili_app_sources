package com.bilibili.search2.result.ogv.aggregate;

import android.content.Context;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import rp0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/b.class */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f88324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f88325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f88326d;

    public /* synthetic */ b(Object obj, int i7, Object obj2, Object obj3) {
        this.f88323a = i7;
        this.f88324b = obj;
        this.f88325c = obj2;
        this.f88326d = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v12, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.ogv.aggregate.d, dt0.f] */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        switch (this.f88323a) {
            case 0:
                Map map = (Map) this.f88326d;
                EpisodeNew episodeNew = (EpisodeNew) obj;
                ((Integer) obj2).getClass();
                ?? r02 = (d) this.f88324b;
                if (episodeNew != null) {
                    String param = episodeNew.getParam();
                    if (param != null) {
                        if (StringsKt.isBlank(param)) {
                            param = null;
                        }
                        if (param != null) {
                            ((SearchBangumiItem) r02.getData()).clickEpisode(episodeNew.getParam());
                        }
                    }
                }
                com.bilibili.search2.result.bangumi.t.b(r02.itemView.getContext(), (SearchBangumiItem) r02.getData(), episodeNew, r02.f88332b, (String) this.f88325c, map, r02.q0((BaseSearchItem) r02.getData()), d.s0((SearchBangumiItem) r02.getData()), r02.t0((SearchBangumiItem) r02.getData()));
                r02.clickWithRefreshStatus();
                return Unit.INSTANCE;
            default:
                Context context = (Context) this.f88324b;
                PegasusInlineSwitchState pegasusInlineSwitchState = (PegasusInlineSwitchState) obj;
                PromoToast.showBottomToast(context, context.getResources().getString(2131841462) + ((String) obj2));
                int i7 = 2;
                InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.INLINE_THREE_POINT, (String) null, PegasusInlineConfigKt.isAutoPlayEnable(pegasusInlineSwitchState), 2, (Object) null);
                ((IPegasusInlineConfig) this.f88325c).setInlineSwitchState(pegasusInlineSwitchState, true, false);
                PegasusInlineSwitchState pegasusInlineSwitchState2 = PegasusInlineSwitchState.WIFI_ONLY;
                InterfaceC5583b interfaceC5583b = (InterfaceC5583b) this.f88326d;
                if (pegasusInlineSwitchState == pegasusInlineSwitchState2) {
                    interfaceC5583b.a(true);
                } else if (pegasusInlineSwitchState == PegasusInlineSwitchState.ALL_NETWORK) {
                    interfaceC5583b.a(false);
                }
                BasePegasusPlayerData data = interfaceC5583b.getData();
                Pair pair = TuplesKt.to("from_type", data != null ? data.getFromType() : null);
                BasePegasusPlayerData data2 = interfaceC5583b.getData();
                Pair pair2 = TuplesKt.to("goto", data2 != null ? data2.getCardGoto() : null);
                BasePegasusPlayerData data3 = interfaceC5583b.getData();
                String param2 = null;
                if (data3 != null) {
                    param2 = data3.getParam();
                }
                Pair pair3 = TuplesKt.to("param", param2);
                int i8 = d.a.f126833a[pegasusInlineSwitchState.ordinal()];
                if (i8 == 1) {
                    i7 = 1;
                } else if (i8 != 2) {
                    i7 = 3;
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                Neurons.reportClick(false, "tm.recommend.three-point.option-network.click", MapsKt.mutableMapOf(new Pair[]{pair, pair2, pair3, TuplesKt.to("inline_switch", String.valueOf(i7))}));
                return Unit.INSTANCE;
        }
    }
}
