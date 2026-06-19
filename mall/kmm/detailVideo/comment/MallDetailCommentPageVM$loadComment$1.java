package com.bilibili.mall.kmm.detailVideo.comment;

import Yg0.C3128b;
import Zg0.C3174a;
import com.bilibili.mall.kmm.detailVideo.comment.api.b;
import com.bilibili.mall.kmm.detailVideo.comment.vm.MallDetailCommentFooterStatus;
import com.bilibili.mall.kmm.detailVideo.comment.vm.MallDetailCommentLoadStatus;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/MallDetailCommentPageVM$loadComment$1.class */
public final class MallDetailCommentPageVM$loadComment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<C3174a, Unit> $callback;
    final Map<String, Object> $params;
    int label;
    final MallDetailCommentPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MallDetailCommentPageVM$loadComment$1(MallDetailCommentPageVM mallDetailCommentPageVM, Map<String, ? extends Object> map, Function1<? super C3174a, Unit> function1, Continuation<? super MallDetailCommentPageVM$loadComment$1> continuation) {
        super(2, continuation);
        this.this$0 = mallDetailCommentPageVM;
        this.$params = map;
        this.$callback = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallDetailCommentPageVM$loadComment$1(this.this$0, this.$params, this.$callback, continuation);
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
                b bVar = (b) this.this$0.f65606c.getValue();
                Map<String, Object> map = this.$params;
                this.label = 1;
                Object objA = bVar.a(map, this);
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
            C3128b c3128b = (C3128b) obj;
            C3174a c3174a = new C3174a(c3128b);
            MallDetailCommentPageVM mallDetailCommentPageVM = this.this$0;
            int i8 = mallDetailCommentPageVM.f65609f;
            c3174a.f29622d = i8;
            c3174a.f29621c = "按热度";
            if (i8 == 2) {
                c3174a.f29621c = "按时间";
            }
            int i9 = mallDetailCommentPageVM.f65610g;
            c3174a.f29620b = i9;
            if (((int) c3128b.f28777c) == 0) {
                c3174a.f29623e = MallDetailCommentLoadStatus.EMPTY;
                this.$callback.invoke(c3174a);
                return Unit.INSTANCE;
            }
            c3174a.f29623e = MallDetailCommentLoadStatus.SUCCESS;
            mallDetailCommentPageVM.f65610g = i9 + 1;
            if (Intrinsics.areEqual(c3128b.f28779e, Boxing.boxBoolean(true))) {
                c3174a.f29624f = MallDetailCommentFooterStatus.IDLE;
            } else {
                c3174a.f29624f = MallDetailCommentFooterStatus.END;
            }
            this.$callback.invoke(c3174a);
            return Unit.INSTANCE;
        } catch (CancellationException e7) {
            throw e7;
        } catch (Exception e8) {
            C3174a c3174a2 = new C3174a(null);
            c3174a2.f29623e = MallDetailCommentLoadStatus.ERROR;
            c3174a2.f29624f = MallDetailCommentFooterStatus.ERROR;
            int i10 = this.this$0.f65609f;
            c3174a2.f29622d = i10;
            c3174a2.f29621c = "按热度";
            if (i10 == 2) {
                c3174a2.f29621c = "按时间";
            }
            this.$callback.invoke(c3174a2);
            return Unit.INSTANCE;
        }
    }
}
