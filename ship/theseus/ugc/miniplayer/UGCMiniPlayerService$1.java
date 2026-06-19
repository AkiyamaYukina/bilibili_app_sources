package com.bilibili.ship.theseus.ugc.miniplayer;

import androidx.activity.ComponentActivity;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.base.resolver.ArchiveInfo;
import com.bilibili.app.gemini.base.resolver.PlayerResolveExtraInfosUtilKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import com.bilibili.ship.theseus.united.page.miniplayer.f;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import mv0.C8043a;
import tb0.d;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import uu0.InterfaceC8767a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/miniplayer/UGCMiniPlayerService$1.class */
final class UGCMiniPlayerService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.miniplayer.UGCMiniPlayerService$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/miniplayer/UGCMiniPlayerService$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<b.InterfaceC1071b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(b.InterfaceC1071b interfaceC1071b, Continuation<? super Unit> continuation) {
            return create(interfaceC1071b, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            GeminiCommonPlayableParams geminiCommonPlayableParamsF;
            ArchiveInfo archiveInfo;
            ExtraInfo extraInfo;
            int i7 = 1;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            b.InterfaceC1071b interfaceC1071b = (b.InterfaceC1071b) this.L$0;
            a aVar = this.this$0;
            aVar.getClass();
            defpackage.a.b("[theseus-ugc-UGCMiniPlayerService-tryStartMiniPlayerPlay] ", "tryStartMiniPlayerPlay, " + interfaceC1071b, "UGCMiniPlayerService-tryStartMiniPlayerPlay");
            j jVarJ = aVar.f97973c.j();
            if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                ArrayList arrayList = new ArrayList();
                boolean zIsEmpty = aVar.f97976f.isEmpty();
                PageReportService pageReportService = aVar.f97979j;
                C8043a c8043a = aVar.f97981l;
                if (zIsEmpty) {
                    Iterator<T> it = aVar.f97977g.iterator();
                    while (true) {
                        interfaceC1071b = interfaceC1071b;
                        if (!it.hasNext()) {
                            break;
                        }
                        Av0.a aVar2 = (Av0.a) it.next();
                        if (geminiCommonPlayableParamsF.getCid() == aVar2.f591b) {
                            arrayList.add(geminiCommonPlayableParamsF);
                        } else {
                            int i8 = c8043a.a().f123885g;
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.putAll(pageReportService.f102492e);
                            Unit unit = Unit.INSTANCE;
                            arrayList.add(Av0.b.a(aVar2, geminiCommonPlayableParamsF, i8, MapsKt.build(mapCreateMapBuilder)));
                        }
                    }
                } else {
                    Iterator<T> it2 = aVar.f97976f.iterator();
                    while (it2.hasNext()) {
                        Iterator<T> it3 = ((C6353o) it2.next()).h.iterator();
                        while (it3.hasNext()) {
                            for (C6355q c6355q : ((Z) it3.next()).f101648d) {
                                if (((ArrayList) c6355q.f101689j).size() != i7) {
                                    for (Av0.a aVar3 : c6355q.f101689j) {
                                        if (geminiCommonPlayableParamsF.getCid() == aVar3.f591b) {
                                            arrayList.add(geminiCommonPlayableParamsF);
                                        } else {
                                            int i9 = c8043a.a().f123885g;
                                            Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                                            mapCreateMapBuilder2.putAll(pageReportService.f102492e);
                                            Unit unit2 = Unit.INSTANCE;
                                            arrayList.add(Av0.b.a(aVar3, geminiCommonPlayableParamsF, i9, MapsKt.build(mapCreateMapBuilder2)));
                                        }
                                    }
                                } else if (geminiCommonPlayableParamsF.getCid() == c6355q.f101683c) {
                                    arrayList.add(geminiCommonPlayableParamsF);
                                } else {
                                    int i10 = c8043a.a().f123885g;
                                    Map mapCreateMapBuilder3 = MapsKt.createMapBuilder();
                                    mapCreateMapBuilder3.putAll(pageReportService.f102492e);
                                    Unit unit3 = Unit.INSTANCE;
                                    arrayList.add(C6354p.b(c6355q, geminiCommonPlayableParamsF, i10, MapsKt.build(mapCreateMapBuilder3)));
                                }
                                i7 = 1;
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    BLog.i("UGCMiniPlayerService-tryStartMiniPlayerPlay", "[theseus-ugc-UGCMiniPlayerService-tryStartMiniPlayerPlay] empty play list, turn on mini player failed!!");
                } else {
                    UGCAnyModel uGCAnyModel = (UGCAnyModel) aVar.f97984o.f96908b.getValue();
                    if ((uGCAnyModel != null ? com.bilibili.ship.theseus.ugc.play.b.a(uGCAnyModel) : null) == null) {
                        MediaResource mediaResource = aVar.f97982m.getMediaResource();
                        if (mediaResource == null) {
                            BLog.w("UGCMiniPlayerHelper$Companion-ensureFakeDurationForPreview", "[theseus-ugc-UGCMiniPlayerHelper$Companion-ensureFakeDurationForPreview] current media resource is null.", (Throwable) null);
                        } else {
                            ExtraInfo extraInfo2 = mediaResource.getExtraInfo();
                            if (extraInfo2 != null && (archiveInfo = PlayerResolveExtraInfosUtilKt.getArchiveInfo(extraInfo2)) != null && (extraInfo = mediaResource.getExtraInfo()) != null) {
                                extraInfo.setTag-pIAwiHE(tb0.a.a.a, new d(archiveInfo.b, archiveInfo.c));
                            }
                        }
                    }
                    int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(aVar.f97972b);
                    Iterator it4 = arrayList.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        if (Intrinsics.areEqual(((GeminiCommonPlayableParams) it4.next()).id(), geminiCommonPlayableParamsF.id())) {
                            break;
                        }
                        i11++;
                    }
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(i11, 0);
                    int i12 = interfaceC1071b.isPlaying() ? 4 : 5;
                    boolean zA = interfaceC1071b.a();
                    InterfaceC8767a interfaceC8767a = (InterfaceC8767a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC8767a.class, (String) null, 2, (Object) null);
                    long jLongValue = ((Number) aVar.f97983n.f101573d.getValue()).longValue();
                    if (interfaceC8767a != null) {
                        interfaceC8767a.a(true, true, zA, i12, iPrepareForShare, iCoerceAtLeast, arrayList, null, jLongValue > 0 ? "8" : null, jLongValue > 0 ? String.valueOf(jLongValue) : null);
                    }
                    boolean z6 = interfaceC1071b instanceof b.InterfaceC1071b.C1072b;
                    ComponentActivity componentActivity = aVar.f97974d;
                    if (z6) {
                        BLRouter.routeTo(new RouteRequest.Builder("bilibili://home").build(), componentActivity);
                    }
                    aVar.h.f();
                    if (interfaceC1071b.b()) {
                        componentActivity.finish();
                    } else if (!componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
                        C7893a.C1318a c1318aC = aVar.f97980k.c();
                        f fVar = aVar.f97978i;
                        fVar.c(c1318aC);
                        fVar.a();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCMiniPlayerService$1(a aVar, Continuation<? super UGCMiniPlayerService$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCMiniPlayerService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.this$0;
            SharedFlow<b.InterfaceC1071b> sharedFlow = aVar.f97975e.f102064u;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
