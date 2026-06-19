package com.bilibili.topix.compose.create;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$updateTopicDesc$1.class */
final class TopicCreateViewModel$updateTopicDesc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final androidx.compose.ui.text.input.G $desc;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$updateTopicDesc$1(TopicCreateViewModel topicCreateViewModel, androidx.compose.ui.text.input.G g7, Continuation<? super TopicCreateViewModel$updateTopicDesc$1> continuation) {
        super(2, continuation);
        this.this$0 = topicCreateViewModel;
        this.$desc = g7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicCreateViewModel$updateTopicDesc$1(this.this$0, this.$desc, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            androidx.compose.ui.text.input.G gI02 = TopicCreateViewModel.I0(this.this$0, this.$desc, ((C) this.this$0.f112485d.getValue()).f112455d.f112476e);
            double dK0 = TopicCreateViewModel.K0(this.this$0, gI02.f45498a.getText());
            MutableStateFlow<C> mutableStateFlow = this.this$0.f112485d;
            C c7 = (C) mutableStateFlow.getValue();
            I i8 = ((C) this.this$0.f112485d.getValue()).f112455d;
            C cA = C.a(c7, null, null, new I(gI02, i8.f112473b, i8.f112474c, dK0, i8.f112476e), null, null, false, null, 247);
            this.label = 1;
            if (mutableStateFlow.emit(cA, this) == coroutine_suspended) {
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
