package com.bilibili.mall.kmm.detailVideo.comment;

import Yg0.C3127a;
import com.bilibili.mall.kmm.detailVideo.comment.api.d;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/comment/MallDetailCommentPageVM$thumbAction$1.class */
public final class MallDetailCommentPageVM$thumbAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isThumb;
    final C3127a $item;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final MallDetailCommentPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallDetailCommentPageVM$thumbAction$1(boolean z6, MallDetailCommentPageVM mallDetailCommentPageVM, C3127a c3127a, Continuation<? super MallDetailCommentPageVM$thumbAction$1> continuation) {
        super(2, continuation);
        this.$isThumb = z6;
        this.this$0 = mallDetailCommentPageVM;
        this.$item = c3127a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallDetailCommentPageVM$thumbAction$1(this.$isThumb, this.this$0, this.$item, continuation);
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
                int i8 = this.$isThumb ? 1 : 2;
                Object obj2 = this.this$0.f65605b.get("scene");
                String str = obj2 instanceof String ? (String) obj2 : null;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                Pair pair = TuplesKt.to("opType", Boxing.boxInt(i8));
                Object obj3 = this.$item.f28753f;
                if (obj3 == null) {
                    obj3 = "";
                }
                Pair pair2 = TuplesKt.to("subjectId", obj3);
                Integer num = this.$item.f28754g;
                Pair pair3 = TuplesKt.to("subjectType", Boxing.boxInt(num != null ? num.intValue() : 1));
                Pair pair4 = TuplesKt.to("scene", str2);
                Long l7 = this.$item.f28748a;
                Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, pair2, pair3, pair4, TuplesKt.to("ugcId", Boxing.boxLong(l7 != null ? l7.longValue() : 0L))});
                d dVar = (d) this.this$0.f65607d.getValue();
                this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                this.L$1 = SpillingKt.nullOutSpilledVariable(mapMutableMapOf);
                this.I$0 = i8;
                this.label = 1;
                if (dVar.a(mapMutableMapOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (CancellationException e7) {
            throw e7;
        } catch (Exception e8) {
            return Unit.INSTANCE;
        }
    }
}
