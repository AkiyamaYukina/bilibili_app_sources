package com.bilibili.search2.result.all;

import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.MossException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$searchOGVAggregateQuest$2.class */
final class SearchResultAllViewModel$searchOGVAggregateQuest$2 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.ogv.aggregate.v>, Continuation<? super Unit>, Object> {
    final com.bilibili.search2.result.ogv.aggregate.a $params;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$searchOGVAggregateQuest$2(com.bilibili.search2.result.ogv.aggregate.a aVar, Continuation<? super SearchResultAllViewModel$searchOGVAggregateQuest$2> continuation) {
        super(2, continuation);
        this.$params = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$searchOGVAggregateQuest$2 searchResultAllViewModel$searchOGVAggregateQuest$2 = new SearchResultAllViewModel$searchOGVAggregateQuest$2(this.$params, continuation);
        searchResultAllViewModel$searchOGVAggregateQuest$2.L$0 = obj;
        return searchResultAllViewModel$searchOGVAggregateQuest$2;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.ogv.aggregate.v> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0104: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:50:0x0104 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0131: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:54:0x0131 */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        FlowCollector flowCollector3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (MossException e7) {
            q4.M.b("searchOGVAggregateQuest error: ", e7.toPrintString(), flowCollector2.getClass().getSimpleName());
            this.L$0 = null;
            this.label = 4;
            if (flowCollector2.emit((Object) null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } catch (BusinessException e8) {
            q4.M.b("searchOGVAggregateQuest error: ", e8.toPrintString(), flowCollector.getClass().getSimpleName());
            this.L$0 = null;
            this.label = 3;
            if (flowCollector.emit((Object) null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector3 = (FlowCollector) this.L$0;
            com.bilibili.search2.result.ogv.aggregate.u uVar = com.bilibili.search2.result.ogv.aggregate.u.f88427a;
            com.bilibili.search2.result.ogv.aggregate.a aVar = this.$params;
            this.L$0 = flowCollector3;
            this.label = 1;
            Object objB = uVar.b(aVar, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i7 != 3 && i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            flowCollector3 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        com.bilibili.search2.result.ogv.aggregate.v vVar = (com.bilibili.search2.result.ogv.aggregate.v) obj;
        if (vVar != null) {
            this.L$0 = flowCollector3;
            this.label = 2;
            if (flowCollector3.emit(vVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
