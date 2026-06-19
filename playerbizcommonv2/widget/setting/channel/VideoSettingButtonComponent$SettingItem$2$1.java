package com.bilibili.playerbizcommonv2.widget.setting.channel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingButtonComponent$SettingItem$2$1.class */
public final class VideoSettingButtonComponent$SettingItem$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c $item;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSettingButtonComponent$SettingItem$2$1(c cVar, Continuation<? super VideoSettingButtonComponent$SettingItem$2$1> continuation) {
        super(2, continuation);
        this.$item = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSettingButtonComponent$SettingItem$2$1 videoSettingButtonComponent$SettingItem$2$1 = new VideoSettingButtonComponent$SettingItem$2$1(this.$item, continuation);
        videoSettingButtonComponent$SettingItem$2$1.L$0 = obj;
        return videoSettingButtonComponent$SettingItem$2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        SingleExposeEntry singleExposeEntry = this.$item.f83230g;
        if (singleExposeEntry != null) {
            singleExposeEntry.b(coroutineScope);
        }
        return Unit.INSTANCE;
    }
}
