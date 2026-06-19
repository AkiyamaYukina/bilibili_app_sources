package com.bilibili.ship.theseus.ugc.playlimited;

import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ChargingPlusOperationAction;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$handleVideoForbidden$2.class */
final class UGCEpisodeRestrictionLayerService$handleVideoForbidden$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RestrictionLayerVo $endLimit;
        final boolean $hitsExp;
        final boolean $tabPagerAreaHasLayerShowing;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RestrictionLayerVo restrictionLayerVo, a aVar, boolean z6, boolean z7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$endLimit = restrictionLayerVo;
            this.this$0 = aVar;
            this.$hitsExp = z6;
            this.$tabPagerAreaHasLayerShowing = z7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$endLimit, this.this$0, this.$hitsExp, this.$tabPagerAreaHasLayerShowing, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                defpackage.a.b("[theseus-ugc-UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$1-invokeSuspend] ", "Handling video forbidden, endLimit: " + this.$endLimit + ", coverUrl: " + this.this$0.f98371e.f104046l, "UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$1-invokeSuspend");
                a aVar = this.this$0;
                G g7 = aVar.f98368b;
                RestrictionLayerVo restrictionLayerVo = this.$endLimit;
                String str = aVar.f98371e.f104046l;
                StateFlow<Boolean> stateFlowFlowOf = (!this.$hitsExp || this.$tabPagerAreaHasLayerShowing) ? FlowKt.flowOf(Boxing.boxBoolean(false)) : aVar.h.f99159m;
                this.label = 1;
                if (G.c(g7, restrictionLayerVo, true, false, str, false, stateFlowFlowOf, this, 20) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RestrictionLayerVo $endLimit;
        final boolean $hitsExp;
        final boolean $tabPagerAreaHasLayerShowing;
        Object L$0;
        Object L$1;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z6, boolean z7, RestrictionLayerVo restrictionLayerVo, a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$hitsExp = z6;
            this.$tabPagerAreaHasLayerShowing = z7;
            this.$endLimit = restrictionLayerVo;
            this.this$0 = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$hitsExp, this.$tabPagerAreaHasLayerShowing, this.$endLimit, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar;
            a aVar2;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
            a aVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$hitsExp && !this.$tabPagerAreaHasLayerShowing) {
                    BLog.i("UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$2-invokeSuspend", "[theseus-ugc-UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$2-invokeSuspend] hitsExp and pager area does not have layer showing, auto invoke charging plus operation.");
                    TextVo textVo = (TextVo) CollectionsKt.firstOrNull(this.$endLimit.f102672f);
                    if (textVo != null) {
                        aVar = this.this$0;
                        s sVar = textVo.f102713j;
                        s sVarA = sVar;
                        if (sVar instanceof ChargingPlusOperationAction) {
                            sVarA = ChargingPlusOperationAction.a((ChargingPlusOperationAction) sVar, "auto", null, 5);
                        }
                        if (sVarA != null) {
                            aVar.f98374i.a(sVarA);
                        }
                        ReportVo reportVoL = textVo.l();
                        if (reportVoL != null) {
                            PageReportService pageReportService = aVar.f98380o;
                            String strB = reportVoL.b();
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.putAll(reportVoL.c());
                            mapCreateMapBuilder.put("is_auto", "1");
                            C8043a c8043a = aVar.f98383r;
                            mapCreateMapBuilder.put("track_id", c8043a.a().f123882d);
                            mapCreateMapBuilder.put("up_mid", String.valueOf(aVar.f98381p.f()));
                            mapCreateMapBuilder.put(GameCardButton.extraAvid, aVar.f98382q.b());
                            mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
                            String str = aVar.f98384s.f98946j;
                            String str2 = str;
                            if (str == null) {
                                str2 = "";
                            }
                            mapCreateMapBuilder.put("ad_track_id", str2);
                            Unit unit = Unit.INSTANCE;
                            PageReportService.g(pageReportService, strB, MapsKt.build(mapCreateMapBuilder), 4);
                        }
                        cVar = aVar.f98376k;
                        cVar.j(aVar, true);
                        try {
                            BLog.i("UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$2-invokeSuspend", "[theseus-ugc-UGCEpisodeRestrictionLayerService$handleVideoForbidden$2$2-invokeSuspend] Orientation locked.");
                            this.L$0 = cVar;
                            this.L$1 = aVar;
                            this.label = 1;
                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar2 = aVar;
                            cVar2 = cVar;
                        } catch (Throwable th) {
                            th = th;
                            cVar.j(aVar, false);
                            throw th;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) this.L$1;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar3 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            aVar3 = aVar2;
            cVar = cVar3;
            try {
                ResultKt.throwOnFailure(obj);
                cVar2 = cVar3;
            } catch (Throwable th2) {
                aVar = aVar3;
                th = th2;
                cVar.j(aVar, false);
                throw th;
            }
            aVar3 = aVar2;
            cVar = cVar2;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEpisodeRestrictionLayerService$handleVideoForbidden$2(a aVar, Continuation<? super UGCEpisodeRestrictionLayerService$handleVideoForbidden$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEpisodeRestrictionLayerService$handleVideoForbidden$2 uGCEpisodeRestrictionLayerService$handleVideoForbidden$2 = new UGCEpisodeRestrictionLayerService$handleVideoForbidden$2(this.this$0, continuation);
        uGCEpisodeRestrictionLayerService$handleVideoForbidden$2.L$0 = obj;
        return uGCEpisodeRestrictionLayerService$handleVideoForbidden$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$handleVideoForbidden$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
