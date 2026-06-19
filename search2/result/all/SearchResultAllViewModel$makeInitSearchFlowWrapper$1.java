package com.bilibili.search2.result.all;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$makeInitSearchFlowWrapper$1.class */
final class SearchResultAllViewModel$makeInitSearchFlowWrapper$1 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.base.q>, Continuation<? super Unit>, Object> {
    final boolean $isWideScreen;
    final com.bilibili.search2.result.base.t $searchInitParams;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final SearchResultAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$makeInitSearchFlowWrapper$1(com.bilibili.search2.result.base.t tVar, SearchResultAllViewModel searchResultAllViewModel, boolean z6, Continuation<? super SearchResultAllViewModel$makeInitSearchFlowWrapper$1> continuation) {
        super(2, continuation);
        this.$searchInitParams = tVar;
        this.this$0 = searchResultAllViewModel;
        this.$isWideScreen = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$makeInitSearchFlowWrapper$1 searchResultAllViewModel$makeInitSearchFlowWrapper$1 = new SearchResultAllViewModel$makeInitSearchFlowWrapper$1(this.$searchInitParams, this.this$0, this.$isWideScreen, continuation);
        searchResultAllViewModel$makeInitSearchFlowWrapper$1.L$0 = obj;
        return searchResultAllViewModel$makeInitSearchFlowWrapper$1;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 27, insn: 0x0097: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r27 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:11:0x0097 */
    /* JADX WARN: Not initialized variable reg: 28, insn: 0x00a6: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r28 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:13:0x00a3 */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x00a3: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r29 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:13:0x00a3 */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x04db: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r29 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:114:0x04d7 */
    /* JADX WARN: Not initialized variable reg: 30, insn: 0x04cf: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r30 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:112:0x04cb */
    /* JADX WARN: Not initialized variable reg: 31, insn: 0x04cb: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r31 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:112:0x04cb */
    /* JADX WARN: Not initialized variable reg: 32, insn: 0x04d7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r32 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:114:0x04d7 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036a A[Catch: MossException -> 0x0376, BusinessException -> 0x037b, TRY_LEAVE, TryCatch #17 {MossException -> 0x0376, BusinessException -> 0x037b, blocks: (B:74:0x035d, B:76:0x036a, B:81:0x0380, B:83:0x03b9, B:85:0x03c5, B:90:0x03fb, B:90:0x03fb, B:91:0x03fe, B:87:0x03cf, B:87:0x03cf, B:89:0x03d5), top: B:216:0x035d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b9 A[Catch: MossException -> 0x0376, BusinessException -> 0x037b, TRY_ENTER, TRY_LEAVE, TryCatch #17 {MossException -> 0x0376, BusinessException -> 0x037b, blocks: (B:74:0x035d, B:76:0x036a, B:81:0x0380, B:83:0x03b9, B:85:0x03c5, B:90:0x03fb, B:90:0x03fb, B:91:0x03fe, B:87:0x03cf, B:87:0x03cf, B:89:0x03d5), top: B:216:0x035d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel$makeInitSearchFlowWrapper$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
