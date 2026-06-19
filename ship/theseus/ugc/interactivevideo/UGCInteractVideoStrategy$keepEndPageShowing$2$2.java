package com.bilibili.ship.theseus.ugc.interactivevideo;

import com.bilibili.app.gemini.ugc.feature.endpage.GeminiEndPageRelatedLayoutMode;
import com.bilibili.app.gemini.ugc.feature.interactivevideo.InteractEndPageLandscapeWidget;
import com.bilibili.app.gemini.ugc.feature.interactivevideo.InteractEndPageThumbWidget;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/interactivevideo/UGCInteractVideoStrategy$keepEndPageShowing$2$2.class */
public final class UGCInteractVideoStrategy$keepEndPageShowing$2$2 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
    final IFunctionContainer.LayoutParams $layoutParams;
    final b $state;
    Object L$0;
    int label;
    final UGCInteractVideoStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCInteractVideoStrategy$keepEndPageShowing$2$2(UGCInteractVideoStrategy uGCInteractVideoStrategy, b bVar, IFunctionContainer.LayoutParams layoutParams, Continuation<? super UGCInteractVideoStrategy$keepEndPageShowing$2$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCInteractVideoStrategy;
        this.$state = bVar;
        this.$layoutParams = layoutParams;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCInteractVideoStrategy$keepEndPageShowing$2$2 uGCInteractVideoStrategy$keepEndPageShowing$2$2 = new UGCInteractVideoStrategy$keepEndPageShowing$2$2(this.this$0, this.$state, this.$layoutParams, continuation);
        uGCInteractVideoStrategy$keepEndPageShowing$2$2.L$0 = obj;
        return uGCInteractVideoStrategy$keepEndPageShowing$2$2;
    }

    public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = (a) this.L$0;
            if (this.this$0.f96920b.isFinishing() || this.this$0.f96920b.isChangingConfigurations()) {
                return Unit.INSTANCE;
            }
            boolean z6 = aVar.f96926a;
            GeminiEndPageRelatedLayoutMode geminiEndPageRelatedLayoutMode = aVar.f96927b;
            InteractEndPageLandscapeWidget interactEndPageLandscapeWidget = z6 ? new InteractEndPageLandscapeWidget(this.this$0.f96919a, this.$state, geminiEndPageRelatedLayoutMode) : new InteractEndPageThumbWidget(this.this$0.f96919a, this.$state, geminiEndPageRelatedLayoutMode);
            AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f96923e;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, interactEndPageLandscapeWidget, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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
