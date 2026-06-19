package com.bilibili.ship.theseus.ugc.castscreen;

import Ld.c;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.player.history.MediaHistoryHelper;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import cq0.C6748a;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCEpisodeGlobalLinkService.class */
@StabilityInferred(parameters = 1)
public final class UGCEpisodeGlobalLinkService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.castscreen.UGCEpisodeGlobalLinkService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/UGCEpisodeGlobalLinkService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusCastScreenRepository $castScreenRepo;
        final Av0.a $ep;
        final UGCCastScreenService $ugcCastService;
        final UGCPlaybackRepository $ugcPlaybackRepository;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusCastScreenRepository theseusCastScreenRepository, Av0.a aVar, UGCCastScreenService uGCCastScreenService, UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$castScreenRepo = theseusCastScreenRepository;
            this.$ep = aVar;
            this.$ugcCastService = uGCCastScreenService;
            this.$ugcPlaybackRepository = uGCPlaybackRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$castScreenRepo, this.$ep, this.$ugcCastService, this.$ugcPlaybackRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ProjectionClient.a clientState;
            IProjectionPlayableItem iProjectionPlayableItemA;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ProjectionClient projectionClientA = this.$castScreenRepo.a();
            IProjectionItem rawItem = (projectionClientA == null || (clientState = projectionClientA.getClientState()) == null || (iProjectionPlayableItemA = clientState.a()) == null) ? null : iProjectionPlayableItemA.getRawItem();
            ProjectionItemData projectionItemData = rawItem instanceof ProjectionItemData ? (ProjectionItemData) rawItem : null;
            boolean z6 = projectionItemData != null && projectionItemData.f63475b == this.$ep.f590a;
            ProjectionClient projectionClientA2 = this.$castScreenRepo.a();
            if ((projectionClientA2 != null && projectionClientA2.isGlobalLinkMode()) || z6) {
                Pair pair = projectionItemData != null ? TuplesKt.to(Boxing.boxLong(projectionItemData.f63475b), Boxing.boxLong(projectionItemData.f63477d)) : TuplesKt.to(Boxing.boxLong(this.$ep.f590a), Boxing.boxLong(this.$ep.f591b));
                long jLongValue = ((Number) pair.component1()).longValue();
                long jLongValue2 = ((Number) pair.component2()).longValue();
                ProjectionClient projectionClientA3 = this.$castScreenRepo.a();
                Boolean boolBoxBoolean = null;
                if (projectionClientA3 != null) {
                    boolBoxBoolean = Boxing.boxBoolean(projectionClientA3.isGlobalLinkMode());
                }
                StringBuilder sb = new StringBuilder("ugc retain cast screen global link:");
                sb.append(boolBoxBoolean);
                sb.append(", isSameVideo:");
                sb.append(z6);
                sb.append(", avid:");
                sb.append(jLongValue);
                defpackage.a.b("[theseus-ugc-UGCEpisodeGlobalLinkService$1-invokeSuspend] ", c.a(sb, jLongValue2, ", cid:"), "UGCEpisodeGlobalLinkService$1-invokeSuspend");
                UGCCastScreenService uGCCastScreenService = this.$ugcCastService;
                uGCCastScreenService.getClass();
                defpackage.a.b("[theseus-ugc-UGCCastScreenService-tryRetainCastScreen] ", "return to cast state cid: " + jLongValue2, "UGCCastScreenService-tryRetainCastScreen");
                uGCCastScreenService.b(MediaHistoryHelper.Companion.getInstance().read(new C6748a(jLongValue2)) != null ? r0.getProgress() : 0L, z6, false);
                this.$ugcPlaybackRepository.e(jLongValue, jLongValue2);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public UGCEpisodeGlobalLinkService(@NotNull CoroutineScope coroutineScope, @NotNull Av0.a aVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull UGCCastScreenService uGCCastScreenService, @NotNull UGCPlaybackRepository uGCPlaybackRepository) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(theseusCastScreenRepository, aVar, uGCCastScreenService, uGCPlaybackRepository, null), 3, (Object) null);
    }
}
