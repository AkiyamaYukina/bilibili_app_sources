package com.bilibili.ship.theseus.ugc;

import Vr0.b;
import com.bilibili.ship.theseus.united.page.videoquality.A0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1.class */
public final class UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final CoroutineScope $$this$launch;
    final String $from;
    final AbsFunctionWidgetService $functionWidgetService;
    final IFunctionContainer.LayoutParams $layoutParams;
    final int $quality;
    final A0 $vipViewMaterialRepository;
    final Vr0.b $widget;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1(AbsFunctionWidgetService absFunctionWidgetService, Vr0.b bVar, IFunctionContainer.LayoutParams layoutParams, A0 a02, CoroutineScope coroutineScope, String str, int i7, Continuation<? super UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1> continuation) {
        super(1, continuation);
        this.$functionWidgetService = absFunctionWidgetService;
        this.$widget = bVar;
        this.$layoutParams = layoutParams;
        this.$vipViewMaterialRepository = a02;
        this.$$this$launch = coroutineScope;
        this.$from = str;
        this.$quality = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbsFunctionWidgetService absFunctionWidgetService, A0 a02, CoroutineScope coroutineScope, String str, int i7, FunctionWidgetToken functionWidgetToken) {
        absFunctionWidgetService.updateFunctionWidgetConfiguration(functionWidgetToken, invokeSuspend$lambda$0$getConfig(str, i7, (b.C0134b) a02.f103694f.getValue()));
        if (((Boolean) a02.f103693e.getValue()).booleanValue() && ((b.C0134b) a02.f103694f.getValue()) == null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1(a02, functionWidgetToken, absFunctionWidgetService, str, i7, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.a invokeSuspend$lambda$0$getConfig(String str, int i7, b.C0134b c0134b) {
        return new b.a(str, "9", String.valueOf(i7), "player.player.vip-intro.click.player", c0134b);
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1(this.$functionWidgetService, this.$widget, this.$layoutParams, this.$vipViewMaterialRepository, this.$$this$launch, this.$from, this.$quality, continuation);
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
            final A0 a02 = this.$vipViewMaterialRepository;
            final CoroutineScope coroutineScope = this.$$this$launch;
            final String str = this.$from;
            final int i8 = this.$quality;
            Function1 function1 = new Function1(absFunctionWidgetService, a02, coroutineScope, str, i8) { // from class: com.bilibili.ship.theseus.ugc.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AbsFunctionWidgetService f98387a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final A0 f98388b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CoroutineScope f98389c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f98390d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f98391e;

                {
                    this.f98387a = absFunctionWidgetService;
                    this.f98388b = a02;
                    this.f98389c = coroutineScope;
                    this.f98390d = str;
                    this.f98391e = i8;
                }

                public final Object invoke(Object obj2) {
                    CoroutineScope coroutineScope2 = this.f98389c;
                    String str2 = this.f98390d;
                    return UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1.invokeSuspend$lambda$0(this.f98387a, this.f98388b, coroutineScope2, str2, this.f98391e, (FunctionWidgetToken) obj2);
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
