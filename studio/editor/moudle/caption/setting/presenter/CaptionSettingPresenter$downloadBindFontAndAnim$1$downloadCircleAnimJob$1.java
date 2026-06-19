package com.bilibili.studio.editor.moudle.caption.setting.presenter;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/presenter/CaptionSettingPresenter$downloadBindFontAndAnim$1$downloadCircleAnimJob$1.class */
public final class CaptionSettingPresenter$downloadBindFontAndAnim$1$downloadCircleAnimJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final long $circleAnimId;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionSettingPresenter$downloadBindFontAndAnim$1$downloadCircleAnimJob$1(e eVar, long j7, Continuation<? super CaptionSettingPresenter$downloadBindFontAndAnim$1$downloadCircleAnimJob$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$circleAnimId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptionSettingPresenter$downloadBindFontAndAnim$1$downloadCircleAnimJob$1(this.this$0, this.$circleAnimId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            e eVar = this.this$0;
            long j7 = this.$circleAnimId;
            this.label = 1;
            Object objA = e.a(eVar, j7, 2, this);
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
        return obj;
    }
}
