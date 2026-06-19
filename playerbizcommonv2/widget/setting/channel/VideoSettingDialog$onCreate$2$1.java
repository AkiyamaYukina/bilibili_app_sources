package com.bilibili.playerbizcommonv2.widget.setting.channel;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDialog$onCreate$2$1.class */
public final class VideoSettingDialog$onCreate$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RunningUIComponent $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingDialog$onCreate$2$1(RunningUIComponent runningUIComponent, Continuation<? super VideoSettingDialog$onCreate$2$1> continuation) {
        super(2, continuation);
        this.$it = runningUIComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoSettingDialog$onCreate$2$1(this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            RunningUIComponent runningUIComponent = this.$it;
            this.label = 1;
            if (runningUIComponent.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
