package com.bilibili.ship.theseus.ugc;

import android.content.Context;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.videoquality.A0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1.class */
public final class UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BackActionRepository $backActionRepository;
    final Context $context;
    final String $from;
    final AbsFunctionWidgetService $functionWidgetService;
    final IFunctionContainer.LayoutParams $layoutParams;
    final com.bilibili.ship.theseus.keel.player.h $player;
    final int $quality;
    final A0 $vipViewMaterialRepository;
    private Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1(Context context, com.bilibili.ship.theseus.keel.player.h hVar, BackActionRepository backActionRepository, AbsFunctionWidgetService absFunctionWidgetService, IFunctionContainer.LayoutParams layoutParams, A0 a02, String str, int i7, Continuation<? super UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$player = hVar;
        this.$backActionRepository = backActionRepository;
        this.$functionWidgetService = absFunctionWidgetService;
        this.$layoutParams = layoutParams;
        this.$vipViewMaterialRepository = a02;
        this.$from = str;
        this.$quality = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1 uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1 = new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1(this.$context, this.$player, this.$backActionRepository, this.$functionWidgetService, this.$layoutParams, this.$vipViewMaterialRepository, this.$from, this.$quality, continuation);
        uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1.L$0 = obj;
        return uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.bilibili.player.tangram.basic.d] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        com.bilibili.ship.theseus.keel.player.h hVar;
        Throwable th;
        ?? r15;
        CoroutineScope coroutineScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Vr0.b bVar = new Vr0.b(this.$context);
            hVar = this.$player;
            BackActionRepository backActionRepository = this.$backActionRepository;
            AbsFunctionWidgetService absFunctionWidgetService = this.$functionWidgetService;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            A0 a02 = this.$vipViewMaterialRepository;
            String str = this.$from;
            int i8 = this.$quality;
            hVar.h(coroutineScope);
            try {
                UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1 uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1 = new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1(absFunctionWidgetService, bVar, layoutParams, a02, coroutineScope, str, i8, null);
                this.L$0 = hVar;
                this.L$1 = coroutineScope;
                this.label = 1;
                if (backActionRepository.a(uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r15 = hVar;
            } catch (Throwable th2) {
                th = th2;
                hVar.i(coroutineScope);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$1;
            ?? r152 = (com.bilibili.player.tangram.basic.d) this.L$0;
            coroutineScope2 = coroutineScope3;
            hVar = r152 == true ? 1 : 0;
            try {
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
                r15 = r152;
            } catch (Throwable th3) {
                th = th3;
                coroutineScope = coroutineScope2;
                hVar.i(coroutineScope);
                throw th;
            }
        }
        coroutineScope2 = coroutineScope;
        hVar = r15 == true ? 1 : 0;
        Unit unit = Unit.INSTANCE;
        r15.i(coroutineScope);
        return Unit.INSTANCE;
    }
}
