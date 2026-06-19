package com.bilibili.playerbizcommonv2.widget.setting.channel;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingSelectComponent$bind$2;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingSelectComponent$bind$2$invokeSuspend$$inlined$awaitCancel$1.class */
public final class VideoSettingSelectComponent$bind$2$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final VideoSettingSelectComponent$bind$2.a $itemDivider$inlined;
    final RecyclerView $recyclerView$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingSelectComponent$bind$2$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, RecyclerView recyclerView, VideoSettingSelectComponent$bind$2.a aVar) {
        super(2, continuation);
        this.$recyclerView$inlined = recyclerView;
        this.$itemDivider$inlined = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoSettingSelectComponent$bind$2$invokeSuspend$$inlined$awaitCancel$1(continuation, this.$recyclerView$inlined, this.$itemDivider$inlined);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$recyclerView$inlined.removeItemDecoration(this.$itemDivider$inlined);
            throw th;
        }
    }
}
