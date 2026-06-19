package com.bilibili.ship.theseus.cheese.player.module;

import android.content.Context;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1.class */
public final class CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BackActionRepository $backActionRepository;
    final Context $context;
    final String $from;
    final AbsFunctionWidgetService $functionWidgetService;
    final IFunctionContainer.LayoutParams $layoutParams;
    final com.bilibili.ship.theseus.keel.player.h $player;
    final int $quality;
    private Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1(Context context, com.bilibili.ship.theseus.keel.player.h hVar, BackActionRepository backActionRepository, AbsFunctionWidgetService absFunctionWidgetService, IFunctionContainer.LayoutParams layoutParams, String str, int i7, Continuation<? super CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$player = hVar;
        this.$backActionRepository = backActionRepository;
        this.$functionWidgetService = absFunctionWidgetService;
        this.$layoutParams = layoutParams;
        this.$from = str;
        this.$quality = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1 cheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1 = new CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1(this.$context, this.$player, this.$backActionRepository, this.$functionWidgetService, this.$layoutParams, this.$from, this.$quality, continuation);
        cheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1.L$0 = obj;
        return cheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        com.bilibili.ship.theseus.keel.player.h hVar;
        com.bilibili.player.tangram.basic.d dVar;
        com.bilibili.player.tangram.basic.d dVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            Vr0.b bVar = new Vr0.b(this.$context);
            com.bilibili.ship.theseus.keel.player.h hVar2 = this.$player;
            BackActionRepository backActionRepository = this.$backActionRepository;
            AbsFunctionWidgetService absFunctionWidgetService = this.$functionWidgetService;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            String str = this.$from;
            int i8 = this.$quality;
            hVar2.h(coroutineScope3);
            try {
                CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1 cheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1 = new CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1(absFunctionWidgetService, bVar, layoutParams, str, i8, null);
                this.L$0 = hVar2;
                this.L$1 = coroutineScope3;
                this.label = 1;
                if (backActionRepository.a(cheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope3;
                dVar2 = hVar2;
            } catch (Throwable th) {
                th = th;
                coroutineScope = coroutineScope3;
                hVar = hVar2;
                hVar.i(coroutineScope);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$1;
            com.bilibili.player.tangram.basic.d dVar3 = (com.bilibili.player.tangram.basic.d) this.L$0;
            coroutineScope = coroutineScope2;
            dVar = dVar3;
            try {
                ResultKt.throwOnFailure(obj);
                dVar2 = dVar3;
            } catch (Throwable th2) {
                th = th2;
                hVar = dVar == true ? 1 : 0;
                hVar.i(coroutineScope);
                throw th;
            }
        }
        coroutineScope = coroutineScope2;
        dVar = dVar2 == true ? 1 : 0;
        Unit unit = Unit.INSTANCE;
        dVar2.i(coroutineScope2);
        return Unit.INSTANCE;
    }
}
