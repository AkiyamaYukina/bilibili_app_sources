package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import WQ.j0;
import android.view.View;
import com.bilibili.bplus.followinglist.service.M0;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5784d;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMBlockType;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/s.class */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f81468c;

    public /* synthetic */ s(int i7, Object obj, Object obj2) {
        this.f81466a = i7;
        this.f81467b = obj;
        this.f81468c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        Unit unit;
        M0 m0L;
        Object obj2 = this.f81467b;
        Object obj3 = this.f81468c;
        switch (this.f81466a) {
            case 0:
                MutableStateFlow mutableStateFlow = (MutableStateFlow) obj2;
                C5784d.b bVar = (C5784d.b) CollectionsKt.getOrNull((List) mutableStateFlow.getValue(), ((Integer) obj).intValue());
                if (bVar == null) {
                    unit = Unit.INSTANCE;
                } else {
                    DMBlockType.Companion.getClass();
                    DMBlockType dMBlockTypeA = DMBlockType.a.a(bVar.f81421c);
                    boolean z6 = bVar.f81422d;
                    boolean z7 = !z6;
                    x xVar = (x) obj3;
                    xVar.getClass();
                    if (dMBlockTypeA != null) {
                        int i7 = x.a.f81504a[dMBlockTypeA.ordinal()];
                        IInteractLayerService iInteractLayerService = xVar.f81483e;
                        if (i7 == 1) {
                            iInteractLayerService.setBlockFixed(z7, true);
                        } else if (i7 == 2) {
                            iInteractLayerService.setBlockScroll(z7, true);
                        } else if (i7 == 3) {
                            iInteractLayerService.setBlockColorful(z7, true);
                        } else if (i7 == 4) {
                            iInteractLayerService.setBlockSpecial(z7, true);
                        } else {
                            if (i7 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iInteractLayerService.setDanmakuFoldSwitchEnable(z6, true);
                        }
                        xVar.f81480b.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.type-block.player", new String[]{"type", dMBlockTypeA.reportType(), "state", r.a(z7)}));
                    }
                    mutableStateFlow.setValue(xVar.c());
                    unit = Unit.INSTANCE;
                }
                return unit;
            default:
                View view = (View) obj3;
                j0 j0Var = (WQ.H) obj;
                int i8 = mS.g.h;
                j0 j0Var2 = j0Var;
                boolean z8 = j0Var2.getExtend().r;
                j0Var2.getExtend().r = !z8;
                com.bilibili.bplus.followinglist.service.N n7 = ((KS.k) ((mS.g) obj2)).d;
                if (n7 != null && (m0L = n7.l()) != null) {
                    Pair pairN = j0Var.N();
                    j0 j0Var3 = j0Var;
                    Pair pair = TuplesKt.to("sub_module", j0Var3.getExtend().k);
                    Pair pair2 = TuplesKt.to("rid", String.valueOf(j0Var3.getExtend().q));
                    Pair pair3 = TuplesKt.to("button_name", mS.c.a(j0Var3, view.getContext()));
                    Pair pair4 = TuplesKt.to("action_type", !z8 ? "interaction_share" : "interaction_cancel_share");
                    int i9 = 2;
                    if (j0Var3.getExtend().u.a) {
                        i9 = 2;
                        if (!j0Var3.getExtend().u.b) {
                            i9 = 1;
                        }
                    }
                    m0L.f(j0Var, new Pair[]{pairN, pair, pair2, pair3, pair4, TuplesKt.to("button_type", Integer.valueOf(i9))});
                }
                return Unit.INSTANCE;
        }
    }
}
