package com.bilibili.ship.theseus.ogv.pay.sponsor;

import androidx.activity.ComponentActivity;
import com.bilibili.app.comm.supermenu.SuperMenu;
import com.bilibili.app.comm.supermenu.core.ShareMenuBuilder;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.ogv.pub.payment.pay.sponsor.SponsorCheckResult;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorResult;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/OgvSponsorPageResultService$goToSponsorResultPage$1.class */
public final class OgvSponsorPageResultService$goToSponsorResultPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvSeason $season;
    final long $seasonId;
    final int $seasonType;
    final SponsorCheckResult $sponsorResponse;
    int label;
    final OgvSponsorPageResultService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSponsorPageResultService$goToSponsorResultPage$1(OgvSponsorPageResultService ogvSponsorPageResultService, SponsorCheckResult sponsorCheckResult, long j7, int i7, OgvSeason ogvSeason, Continuation<? super OgvSponsorPageResultService$goToSponsorResultPage$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvSponsorPageResultService;
        this.$sponsorResponse = sponsorCheckResult;
        this.$seasonId = j7;
        this.$seasonType = i7;
        this.$season = ogvSeason;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvSponsorPageResultService$goToSponsorResultPage$1(this.this$0, this.$sponsorResponse, this.$seasonId, this.$seasonType, this.$season, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.pub.sponsor.a aVar = com.bilibili.ogv.pub.sponsor.a.f71803a;
            ComponentActivity componentActivity = this.this$0.f94225b;
            BangumiSponsorResult bangumiSponsorResultC = this.$sponsorResponse.c(this.$seasonType, this.$seasonId);
            this.label = 1;
            Object objA = aVar.a(componentActivity, bangumiSponsorResultC, "united.player-video-detail.bp.failure.show", "united.player-video-detail.bp.success.show", this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        SuperMenu superMenuWith = SuperMenu.with(this.this$0.f94225b);
        this.this$0.getClass();
        MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
        SuperMenu superMenuPrimaryTitle = superMenuWith.primaryTitle(mainCommonService != null ? mainCommonService.getSuperMenuTitle("pgcbp") : null);
        ShareMenuBuilder shareMenuBuilder = new ShareMenuBuilder(this.this$0.f94225b);
        String[] strArrThirdPartPlatforms = ShareMenuBuilder.thirdPartPlatforms();
        SuperMenu superMenuAddMenus = superMenuPrimaryTitle.addMenus(shareMenuBuilder.addItems((String[]) Arrays.copyOf(strArrThirdPartPlatforms, strArrThirdPartPlatforms.length)).hasActionMenu(false).build());
        ComponentActivity componentActivity2 = this.this$0.f94225b;
        OgvSeason ogvSeason = this.$season;
        superMenuAddMenus.shareCallback(new c(componentActivity2, ogvSeason.f94465r, ogvSeason.f94453e, ogvSeason.f94463p)).scene("pgcbp").show();
        return Unit.INSTANCE;
    }
}
