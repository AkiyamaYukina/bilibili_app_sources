package com.bilibili.ship.theseus.playlist.di.episode.ugc;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2.class */
final class PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private Object L$0;
    Object L$1;
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RestrictionLayerVo $endLimit;
        final boolean $hitsExp;
        final boolean $tabPagerAreaHasLayerShowing;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RestrictionLayerVo restrictionLayerVo, g gVar, boolean z6, boolean z7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$endLimit = restrictionLayerVo;
            this.this$0 = gVar;
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
                defpackage.a.b("[theseus-playlist-PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$1-invokeSuspend] ", "Handling video forbidden, endLimit: " + this.$endLimit + ", coverUrl: " + this.this$0.f95558e.f104046l, "PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$1-invokeSuspend");
                g gVar = this.this$0;
                G g7 = gVar.f95555b;
                RestrictionLayerVo restrictionLayerVo = this.$endLimit;
                String str = gVar.f95558e.f104046l;
                StateFlow<Boolean> stateFlowFlowOf = (!this.$hitsExp || this.$tabPagerAreaHasLayerShowing) ? FlowKt.flowOf(Boxing.boxBoolean(false)) : gVar.f95560g.f99159m;
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RestrictionLayerVo $endLimit;
        final boolean $hitsExp;
        final boolean $tabPagerAreaHasLayerShowing;
        Object L$0;
        Object L$1;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z6, boolean z7, RestrictionLayerVo restrictionLayerVo, g gVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$hitsExp = z6;
            this.$tabPagerAreaHasLayerShowing = z7;
            this.$endLimit = restrictionLayerVo;
            this.this$0 = gVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$hitsExp, this.$tabPagerAreaHasLayerShowing, this.$endLimit, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.screenstate.c cVar;
            g gVar;
            Throwable th;
            g gVar2;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$hitsExp && !this.$tabPagerAreaHasLayerShowing) {
                    BLog.i("PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$2-invokeSuspend", "[theseus-playlist-PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$2-invokeSuspend] hitsExp and pager area does not have layer showing, auto invoke charging plus operation.");
                    TextVo textVo = (TextVo) CollectionsKt.firstOrNull(this.$endLimit.f102672f);
                    if (textVo != null) {
                        g gVar3 = this.this$0;
                        s sVar = textVo.f102713j;
                        s sVarA = sVar;
                        if (sVar instanceof ChargingPlusOperationAction) {
                            sVarA = ChargingPlusOperationAction.a((ChargingPlusOperationAction) sVar, "auto", null, 5);
                        }
                        if (sVarA != null) {
                            gVar3.h.a(sVarA);
                            ReportVo reportVoL = textVo.l();
                            if (reportVoL != null) {
                                String strB = reportVoL.b();
                                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                mapCreateMapBuilder.putAll(reportVoL.c());
                                mapCreateMapBuilder.put("is_auto", "1");
                                C8043a c8043a = gVar3.f95570r;
                                mapCreateMapBuilder.put("track_id", c8043a.a().f123882d);
                                mapCreateMapBuilder.put("up_mid", String.valueOf(gVar3.f95568p.f()));
                                mapCreateMapBuilder.put(GameCardButton.extraAvid, gVar3.f95569q.b());
                                mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
                                Unit unit = Unit.INSTANCE;
                                PageReportService.g(gVar3.f95567o, strB, MapsKt.build(mapCreateMapBuilder), 4);
                            }
                            cVar = gVar3.f95563k;
                            cVar.j(gVar3, true);
                            try {
                                BLog.i("PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$2-invokeSuspend", "[theseus-playlist-PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2$2-invokeSuspend] Orientation locked.");
                                this.L$0 = cVar;
                                this.L$1 = gVar3;
                                this.label = 1;
                                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                gVar2 = gVar3;
                                cVar2 = cVar;
                            } catch (Throwable th2) {
                                gVar = gVar3;
                                th = th2;
                                cVar.j(gVar, false);
                                throw th;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar2 = (g) this.L$1;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar3 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            gVar = gVar2;
            cVar = cVar3;
            try {
                ResultKt.throwOnFailure(obj);
                cVar2 = cVar3;
            } catch (Throwable th3) {
                th = th3;
                cVar.j(gVar, false);
                throw th;
            }
            gVar = gVar2;
            cVar = cVar2;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2(g gVar, Continuation<? super PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2 playlistUGCRestrictionLayerDriver$handleVideoForbidden$2 = new PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2(this.this$0, continuation);
        playlistUGCRestrictionLayerDriver$handleVideoForbidden$2.L$0 = obj;
        return playlistUGCRestrictionLayerDriver$handleVideoForbidden$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCRestrictionLayerDriver$handleVideoForbidden$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
