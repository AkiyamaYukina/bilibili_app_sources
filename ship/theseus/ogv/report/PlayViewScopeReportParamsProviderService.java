package com.bilibili.ship.theseus.ogv.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/PlayViewScopeReportParamsProviderService.class */
@StabilityInferred(parameters = 1)
public final class PlayViewScopeReportParamsProviderService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.report.PlayViewScopeReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/PlayViewScopeReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PageReportService $pageReportService;
        final PGCAnyModel $pgcAnyModel;
        final PlayViewUniteReply $playViewUniteReply;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageReportService pageReportService, PGCAnyModel pGCAnyModel, PlayViewUniteReply playViewUniteReply, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pageReportService = pageReportService;
            this.$pgcAnyModel = pGCAnyModel;
            this.$playViewUniteReply = playViewUniteReply;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$pageReportService, this.$pgcAnyModel, this.$playViewUniteReply, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageReportService pageReportService = this.$pageReportService;
                PGCAnyModel pGCAnyModel = this.$pgcAnyModel;
                PlayViewUniteReply playViewUniteReply = this.$playViewUniteReply;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("ep_id", String.valueOf(pGCAnyModel.getBusiness().getEpisodeInfo().getEpId()));
                mapCreateMapBuilder.put("ep_status", String.valueOf(pGCAnyModel.getBusiness().getEpisodeInfo().getEpStatus()));
                mapCreateMapBuilder.put("cid", String.valueOf(playViewUniteReply.getPlayArc().getCid()));
                mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(playViewUniteReply.getPlayArc().getAid()));
                mapCreateMapBuilder.put("season_id", String.valueOf(pGCAnyModel.getBusiness().getEpisodeInfo().getSeasonInfo().getSeasonId()));
                mapCreateMapBuilder.put("season_type", String.valueOf(pGCAnyModel.getBusiness().getEpisodeInfo().getSeasonInfo().getSeasonType()));
                mapCreateMapBuilder.put("season_status", String.valueOf(pGCAnyModel.getBusiness().getEpisodeInfo().getSeasonInfo().getSeasonStatus()));
                mapCreateMapBuilder.put("type", "4");
                Map<String, String> mapBuild = MapsKt.build(mapCreateMapBuilder);
                this.label = 1;
                if (pageReportService.e(mapBuild, this) == coroutine_suspended) {
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

    @Inject
    public PlayViewScopeReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull PGCAnyModel pGCAnyModel, @NotNull PlayViewUniteReply playViewUniteReply, @NotNull PageReportService pageReportService, @NotNull j jVar, @NotNull Map<String, String> map, @NotNull Mi1.a aVar) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(pageReportService, pGCAnyModel, playViewUniteReply, null), 3, (Object) null);
        GeminiCommonPlayableParams geminiCommonPlayableParamsF = jVar.f();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Map legacyExtra = jVar.f().getLegacyExtra();
        if (legacyExtra != null) {
            mapCreateMapBuilder.putAll(legacyExtra);
        }
        geminiCommonPlayableParamsF.setLegacyExtra(MapsKt.build(mapCreateMapBuilder));
        if (!map.isEmpty()) {
            if (jVar.f().getExtraJsonParams() == null) {
                jVar.f().setExtraJsonParams(new LinkedHashMap());
            }
            Map extraJsonParams = jVar.f().getExtraJsonParams();
            if (extraJsonParams != null) {
                extraJsonParams.putAll(map);
            }
        }
        aVar.c0(jVar.f().getReportCommonParams());
    }
}
