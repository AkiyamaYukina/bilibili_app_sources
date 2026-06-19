package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.G0;
import com.bilibili.droid.ToastHelper;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.ship.theseus.cheese.biz.intro.selection.a;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6984c;
import eu0.C6985d;
import eu0.C6986e;
import eu0.C6998q;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/f.class */
public final /* synthetic */ class C6121f implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.selection.e f90399a;

    /* JADX WARN: Type inference failed for: r4v2, types: [com.bilibili.ship.theseus.cheese.biz.intro.selection.d] */
    @Override // nv0.h
    public final void a(nv0.m mVar) {
        C7004w c7004wA = C6984c.a(mVar.f124400a.getPugvSeasonSelection().getNav());
        com.bilibili.ship.theseus.cheese.biz.intro.selection.e eVar = this.f90399a;
        List<C6985d> list = eVar.f90079j;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new a.b((C6985d) obj, new Function0(eVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.selection.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f90069a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f90070b;

                {
                    this.f90069a = eVar;
                    this.f90070b = i7;
                }

                public final Object invoke() {
                    Object obj2;
                    e eVar2 = this.f90069a;
                    List<C6985d> list2 = eVar2.f90079j;
                    int i8 = this.f90070b;
                    Pair pair = TuplesKt.to("class_type", C6986e.a((C6985d) CollectionsKt.getOrNull(list2, i8)));
                    Pair pair2 = TuplesKt.to("pay_type", C6986e.b((C6985d) CollectionsKt.getOrNull(eVar2.f90079j, i8)));
                    C6985d c6985d = (C6985d) CollectionsKt.getOrNull(eVar2.f90079j, i8);
                    if (c6985d == null || c6985d.f117506a != 2) {
                        obj2 = "0";
                        if (c6985d != null) {
                            obj2 = "0";
                            if (c6985d.f117516l) {
                                obj2 = "1";
                            }
                        }
                    } else {
                        obj2 = "0";
                    }
                    PageReportService.g(eVar2.f90074d, "pugv.detail.selections.single-ep.click", MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("if_video_source", obj2)}), 4);
                    C6985d c6985d2 = (C6985d) CollectionsKt.getOrNull(eVar2.f90079j, i8);
                    if (c6985d2 != null && !c6985d2.f117525u) {
                        C6998q c6998q = c6985d2.f117507b;
                        StringBuilder sbA = z4.c.a(i8, "selectionService onClickItem pos: ", ", jump liveRoom: ", ", liveInfoStatus: ", c6998q.f117565c);
                        int i9 = c6998q.f117564b;
                        sbA.append(i9);
                        sbA.append(", subtitle: ");
                        String str = c6985d2.f117513i;
                        bilibili.live.app.service.resolver.b.a(sbA, str, "CheeseSeasonSelectionService");
                        if (i9 == 1) {
                            if (str.length() > 0) {
                                ToastHelper.showToastShort(eVar2.f90075e, str);
                            }
                        } else if (i9 == 2) {
                            if (c6998q.f117565c) {
                                BuildersKt.launch$default(eVar2.f90071a, (CoroutineContext) null, (CoroutineStart) null, new CheeseSeasonSelectionService$gotoLiveRoom$1(eVar2, c6998q.f117563a, null), 3, (Object) null);
                            } else if (str.length() > 0) {
                                ToastHelper.showToastShort(eVar2.f90075e, str);
                            }
                        } else if (i9 == 3) {
                            if (str.length() > 0) {
                                ToastHelper.showToastShort(eVar2.f90075e, str);
                            }
                        } else if (c6985d2.f117517m) {
                            eVar2.h.a(c6985d2);
                        } else if (str.length() > 0) {
                            ToastHelper.showToastShort(eVar2.f90075e, str);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }, new com.bilibili.biligame.compose.widget.G(eVar, i7, 1)));
            i7++;
        }
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.selection.a(StateFlowKt.MutableStateFlow(new a.c(arrayList, c7004wA.f117590b, new G0(eVar, 1), eVar.f90073c.f90695y, CompoundPlayStateProviderKt.b(eVar.f90076f), eVar.f90078i.f100021b))), 0, (Function1) null, 6));
    }
}
