package com.bilibili.playerbizcommonv2.widget.subtitle;

import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiFuncWidgetHelper$showMultiAudioIntroWidget$1.class */
final class SubtitleAndAiFuncWidgetHelper$showMultiAudioIntroWidget$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
    final Context $context;
    final q0 $displayMode;
    final AbsFunctionWidgetService $functionWidgetService;
    final ScreenModeType $screenModeType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiFuncWidgetHelper$showMultiAudioIntroWidget$1(com.bilibili.playerbizcommonv2.service.ai.a aVar, Context context, q0 q0Var, AbsFunctionWidgetService absFunctionWidgetService, ScreenModeType screenModeType, Continuation<? super SubtitleAndAiFuncWidgetHelper$showMultiAudioIntroWidget$1> continuation) {
        super(2, continuation);
        this.$aiService = aVar;
        this.$context = context;
        this.$displayMode = q0Var;
        this.$functionWidgetService = absFunctionWidgetService;
        this.$screenModeType = screenModeType;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleAndAiFuncWidgetHelper$showMultiAudioIntroWidget$1(this.$aiService, this.$context, this.$displayMode, this.$functionWidgetService, this.$screenModeType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.playerbizcommonv2.service.ai.a aVar = this.$aiService;
            Context context = this.$context;
            this.label = 1;
            Object objH = aVar.H(context, this);
            obj = objH;
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        if (annotatedString != null) {
            B b7 = new B(annotatedString, this.$displayMode);
            AbsFunctionWidgetService absFunctionWidgetService = this.$functionWidgetService;
            RightInsetWithShadowFunctionWidget.a aVar2 = RightInsetWithShadowFunctionWidget.Companion;
            ScreenModeType screenModeType = this.$screenModeType;
            aVar2.getClass();
            absFunctionWidgetService.showWidget(C.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType), b7);
        }
        return Unit.INSTANCE;
    }
}
