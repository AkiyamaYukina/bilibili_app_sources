package com.bilibili.ship.theseus.cheese.player.module;

import Vr0.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1.class */
public final class CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final String $from;
    final AbsFunctionWidgetService $functionWidgetService;
    final IFunctionContainer.LayoutParams $layoutParams;
    final int $quality;
    final Vr0.b $widget;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1(AbsFunctionWidgetService absFunctionWidgetService, Vr0.b bVar, IFunctionContainer.LayoutParams layoutParams, String str, int i7, Continuation<? super CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1> continuation) {
        super(1, continuation);
        this.$functionWidgetService = absFunctionWidgetService;
        this.$widget = bVar;
        this.$layoutParams = layoutParams;
        this.$from = str;
        this.$quality = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbsFunctionWidgetService absFunctionWidgetService, String str, int i7, FunctionWidgetToken functionWidgetToken) {
        absFunctionWidgetService.updateFunctionWidgetConfiguration(functionWidgetToken, new b.a(str, "9", String.valueOf(i7), "player.player.vip-intro.show.player", null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1(this.$functionWidgetService, this.$widget, this.$layoutParams, this.$from, this.$quality, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final AbsFunctionWidgetService absFunctionWidgetService = this.$functionWidgetService;
            Vr0.b bVar = this.$widget;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            final String str = this.$from;
            final int i8 = this.$quality;
            Function1 function1 = new Function1(absFunctionWidgetService, str, i8) { // from class: com.bilibili.ship.theseus.cheese.player.module.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AbsFunctionWidgetService f90669a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f90670b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f90671c;

                {
                    this.f90669a = absFunctionWidgetService;
                    this.f90670b = str;
                    this.f90671c = i8;
                }

                public final Object invoke(Object obj2) {
                    return CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1$1$1.invokeSuspend$lambda$0(this.f90669a, this.f90670b, this.f90671c, (FunctionWidgetToken) obj2);
                }
            };
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget(absFunctionWidgetService, bVar, layoutParams, function1, this) == coroutine_suspended) {
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
