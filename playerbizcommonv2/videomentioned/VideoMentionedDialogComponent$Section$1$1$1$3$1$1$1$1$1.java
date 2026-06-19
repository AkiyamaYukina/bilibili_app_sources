package com.bilibili.playerbizcommonv2.videomentioned;

import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/VideoMentionedDialogComponent$Section$1$1$1$3$1$1$1$1$1.class */
final class VideoMentionedDialogComponent$Section$1$1$1$3$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final UIComponent<Object> $component;
    final Object $entry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMentionedDialogComponent$Section$1$1$1$3$1$1$1$1$1(UIComponent<Object> uIComponent, Object obj, Continuation<? super VideoMentionedDialogComponent$Section$1$1$1$3$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$component = uIComponent;
        this.$entry = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.app.gemini.ui.UIComponent$ViewEntry, java.lang.Object] */
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoMentionedDialogComponent$Section$1$1$1$3$1$1$1$1$1(this.$component, this.$entry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.app.gemini.ui.UIComponent$ViewEntry, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UIComponent<Object> uIComponent = this.$component;
            ?? r02 = this.$entry;
            this.label = 1;
            if (uIComponent.bindToView((UIComponent.ViewEntry) r02, this) == coroutine_suspended) {
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
