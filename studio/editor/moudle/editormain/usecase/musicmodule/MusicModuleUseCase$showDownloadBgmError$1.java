package com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule;

import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/musicmodule/MusicModuleUseCase$showDownloadBgmError$1.class */
final class MusicModuleUseCase$showDownloadBgmError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MusicModuleUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicModuleUseCase$showDownloadBgmError$1(MusicModuleUseCase musicModuleUseCase, Continuation<? super MusicModuleUseCase$showDownloadBgmError$1> continuation) {
        super(2, continuation);
        this.this$0 = musicModuleUseCase;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicModuleUseCase$showDownloadBgmError$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ToastHelper.showToastShort(BiliContext.application(), 2131849101);
        this.this$0.f107198g.r();
        return Unit.INSTANCE;
    }
}
