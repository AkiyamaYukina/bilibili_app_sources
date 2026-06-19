package com.bilibili.search2.result.base;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/VerticalSearchResultViewModel$makeVerticalSearchFlow$1.class */
final class VerticalSearchResultViewModel$makeVerticalSearchFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super q>, Continuation<? super Unit>, Object> {
    final x $searchParams;
    private Object L$0;
    Object L$1;
    int label;
    final y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSearchResultViewModel$makeVerticalSearchFlow$1(y yVar, x xVar, Continuation<? super VerticalSearchResultViewModel$makeVerticalSearchFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = yVar;
        this.$searchParams = xVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerticalSearchResultViewModel$makeVerticalSearchFlow$1 verticalSearchResultViewModel$makeVerticalSearchFlow$1 = new VerticalSearchResultViewModel$makeVerticalSearchFlow$1(this.this$0, this.$searchParams, continuation);
        verticalSearchResultViewModel$makeVerticalSearchFlow$1.L$0 = obj;
        return verticalSearchResultViewModel$makeVerticalSearchFlow$1;
    }

    public final Object invoke(FlowCollector<? super q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x027e: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:87:0x0272 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x02b8: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:91:0x029d */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0255: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:79:0x023f */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.VerticalSearchResultViewModel$makeVerticalSearchFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
