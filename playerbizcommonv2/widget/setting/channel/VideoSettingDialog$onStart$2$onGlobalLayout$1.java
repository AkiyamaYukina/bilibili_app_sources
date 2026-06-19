package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDialog$onStart$2$onGlobalLayout$1.class */
public final class VideoSettingDialog$onStart$2$onGlobalLayout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final VideoSettingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingDialog$onStart$2$onGlobalLayout$1(VideoSettingDialog videoSettingDialog, Continuation<? super VideoSettingDialog$onStart$2$onGlobalLayout$1> continuation) {
        super(2, continuation);
        this.this$0 = videoSettingDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoSettingDialog$onStart$2$onGlobalLayout$1(this.this$0, continuation);
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
            if (DelayKt.delay(400L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Vq0.a aVar = new Vq0.a(this.this$0.getContext());
        aVar.setTargetPosition(this.this$0.f83212d);
        RecyclerView recyclerView = this.this$0.f83214f;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(aVar);
        }
        return Unit.INSTANCE;
    }
}
