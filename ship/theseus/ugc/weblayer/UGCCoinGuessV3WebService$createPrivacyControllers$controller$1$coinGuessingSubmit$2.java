package com.bilibili.ship.theseus.ugc.weblayer;

import bi0.AbstractC5109a;
import com.bilibili.bus.Violet;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2.class */
public final class UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.united.page.weblayer.i $context;
    final com.bilibili.playerbizcommonv2.web.coinguess.e $input;
    int label;
    final z this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.playerbizcommonv2.web.coinguess.e $input;
        final String $logSummary;
        int label;
        final z this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(z zVar, com.bilibili.playerbizcommonv2.web.coinguess.e eVar, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = zVar;
            this.$input = eVar;
            this.$logSummary = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$input, this.$logSummary, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = r9
                int r0 = r0.label
                if (r0 != 0) goto L9f
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                com.bilibili.ship.theseus.ugc.weblayer.z r0 = r0.this$0
                r14 = r0
                r0 = r9
                com.bilibili.playerbizcommonv2.web.coinguess.e r0 = r0.$input
                r15 = r0
                r0 = r9
                java.lang.String r0 = r0.$logSummary
                r13 = r0
                r0 = r14
                lv0.a r0 = r0.f98716c
                lv0.a$a r0 = r0.c()
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L52
                r0 = r10
                lv0.a$a$a r0 = r0.f123395a
                long r0 = r0.f123397a
                r11 = r0
                r0 = r11
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r10 = r0
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L44
                goto L46
            L44:
                r0 = 0
                r10 = r0
            L46:
                r0 = r10
                if (r0 == 0) goto L52
                r0 = r10
                long r0 = r0.longValue()
                r11 = r0
                goto L5b
            L52:
                r0 = r14
                com.bilibili.ship.theseus.united.page.view.a r0 = r0.f98717d
                long r0 = r0.a()
                r11 = r0
            L5b:
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L6d
                java.lang.String r0 = "showCoinGuessShare skipped reason=invalid_aid "
                r1 = r13
                java.lang.String r2 = "UGCCoinGuessV3Web"
                R9.v.a(r0, r1, r2)
                goto L9b
            L6d:
                java.lang.String r0 = " "
                r1 = r13
                java.lang.String r2 = "UGCCoinGuessV3Web"
                r3 = r11
                java.lang.String r4 = "showCoinGuessShare aid="
                java.lang.String r5 = " quizId="
                r6 = r15
                java.lang.String r6 = r6.f82217a
                java.lang.StringBuilder r3 = com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(r3, r4, r5, r6)
                com.bilibili.app.dialogmanager2.b.b(r0, r1, r2, r3)
                r0 = r14
                mv0.a r0 = r0.f98718e
                r10 = r0
                r0 = r11
                r1 = r10
                mv0.b r1 = r1.a()
                java.lang.String r1 = r1.f123880b
                r2 = r10
                mv0.b r2 = r2.a()
                java.lang.String r2 = r2.f123881c
                kntr.common.share.biz.guess.P.a(r0, r1, r2)
            L9b:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L9f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2(com.bilibili.playerbizcommonv2.web.coinguess.e eVar, z zVar, com.bilibili.ship.theseus.united.page.weblayer.i iVar, Continuation<? super UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2> continuation) {
        super(2, continuation);
        this.$input = eVar;
        this.this$0 = zVar;
        this.$context = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCCoinGuessV3WebService$createPrivacyControllers$controller$1$coinGuessingSubmit$2(this.$input, this.this$0, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String strB = com.bilibili.playerbizcommonv2.web.coinguess.f.b(this.$input);
        defpackage.a.b("coinGuessingSubmit received ", strB, "UGCCoinGuessV3Web");
        Violet violet = Violet.INSTANCE;
        com.bilibili.playerbizcommonv2.web.coinguess.e eVar = this.$input;
        violet.sendMsg(new AbstractC5109a.b(eVar.f82217a, eVar.f82218b, eVar.f82219c));
        VideoDetailStateChange.Request request = new VideoDetailStateChange.Request();
        com.bilibili.playerbizcommonv2.web.coinguess.e eVar2 = this.$input;
        VideoDetailStateChange.QuizState quizState = new VideoDetailStateChange.QuizState();
        quizState.setQuizId(eVar2.f82217a);
        quizState.setMyOption(Boxing.boxInt(eVar2.f82218b));
        quizState.setCoinCount(Boxing.boxInt(eVar2.f82219c));
        quizState.setDm(eVar2.f82220d);
        request.setQuizState(quizState);
        IRemoteHandler remoteHandler = this.this$0.f98715b.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.onVideoDetailStateChanged(request);
        }
        defpackage.a.b("coinGuessingSubmit dispatched ", strB, "UGCCoinGuessV3Web");
        this.$context.a("submit_success", "coinGuessingSubmit", strB);
        z zVar = this.this$0;
        com.bilibili.playerbizcommonv2.web.coinguess.e eVar3 = this.$input;
        zVar.getClass();
        PageReportService.g(zVar.f98719f, "community.public-community.coin-guess.submit.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("quiz_id", eVar3.f82217a), TuplesKt.to("coins", String.valueOf(eVar3.f82219c))}), 4);
        bilibili.live.app.service.resolver.b.a(new StringBuilder("coinGuessingSubmit report click "), strB, "UGCCoinGuessV3Web");
        BuildersKt.launch$default(this.this$0.f98714a, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$input, strB, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
