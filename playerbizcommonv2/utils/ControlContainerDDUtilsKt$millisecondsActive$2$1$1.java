package com.bilibili.playerbizcommonv2.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/ControlContainerDDUtilsKt$millisecondsActive$2$1$1.class */
public final class ControlContainerDDUtilsKt$millisecondsActive$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $onClick;
    final IControlContainerService $service;
    final View $this_millisecondsActive;
    final boolean $vibrator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlContainerDDUtilsKt$millisecondsActive$2$1$1(View view, boolean z6, Function0<Unit> function0, IControlContainerService iControlContainerService, Continuation<? super ControlContainerDDUtilsKt$millisecondsActive$2$1$1> continuation) {
        super(2, continuation);
        this.$this_millisecondsActive = view;
        this.$vibrator = z6;
        this.$onClick = function0;
        this.$service = iControlContainerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ControlContainerDDUtilsKt$millisecondsActive$2$1$1(this.$this_millisecondsActive, this.$vibrator, this.$onClick, this.$service, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        float f7 = 1.0f;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$this_millisecondsActive.setAlpha(1.0f);
            if (this.$vibrator) {
                Context context = this.$this_millisecondsActive.getContext();
                Lazy lazy = p.f81943a;
                Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                if (Build.VERSION.SDK_INT < 26) {
                    vibrator.vibrate(30L);
                } else {
                    vibrator.vibrate(VibrationEffect.createOneShot(30L, 64));
                }
            }
            this.$onClick.invoke();
            this.label = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        View view = this.$this_millisecondsActive;
        if (!this.$service.isShowing()) {
            f7 = 0.5f;
        }
        view.setAlpha(f7);
        return Unit.INSTANCE;
    }
}
