package com.bilibili.pegasus.components.interest.ui.v32.vm;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/vm/InterestChooseV32PageViewModel$dispatch$1.class */
public final class InterestChooseV32PageViewModel$dispatch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Actions $action;
    final Co0.a<Actions> $handler;
    private Object L$0;
    Object L$1;
    int label;
    final InterestChooseV32PageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterestChooseV32PageViewModel$dispatch$1(InterestChooseV32PageViewModel interestChooseV32PageViewModel, Actions actions, Co0.a<? super Actions> aVar, Continuation<? super InterestChooseV32PageViewModel$dispatch$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV32PageViewModel;
        this.$action = actions;
        this.$handler = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InterestChooseV32PageViewModel$dispatch$1 interestChooseV32PageViewModel$dispatch$1 = new InterestChooseV32PageViewModel$dispatch$1(this.this$0, this.$action, this.$handler, continuation);
        interestChooseV32PageViewModel$dispatch$1.L$0 = obj;
        return interestChooseV32PageViewModel$dispatch$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[Catch: Exception -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x004e, B:57:0x017c, B:59:0x0186, B:61:0x0195, B:63:0x019d, B:65:0x01be, B:67:0x01c6, B:68:0x01e5, B:20:0x006a, B:39:0x0116, B:42:0x012e, B:44:0x0141, B:48:0x0151, B:51:0x0156, B:53:0x0167, B:22:0x0079, B:31:0x00c2, B:33:0x00dc, B:25:0x008e, B:27:0x00b2), top: B:76:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151 A[Catch: Exception -> 0x0055, TRY_ENTER, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x004e, B:57:0x017c, B:59:0x0186, B:61:0x0195, B:63:0x019d, B:65:0x01be, B:67:0x01c6, B:68:0x01e5, B:20:0x006a, B:39:0x0116, B:42:0x012e, B:44:0x0141, B:48:0x0151, B:51:0x0156, B:53:0x0167, B:22:0x0079, B:31:0x00c2, B:33:0x00dc, B:25:0x008e, B:27:0x00b2), top: B:76:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186 A[Catch: Exception -> 0x0055, TRY_ENTER, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x004e, B:57:0x017c, B:59:0x0186, B:61:0x0195, B:63:0x019d, B:65:0x01be, B:67:0x01c6, B:68:0x01e5, B:20:0x006a, B:39:0x0116, B:42:0x012e, B:44:0x0141, B:48:0x0151, B:51:0x0156, B:53:0x0167, B:22:0x0079, B:31:0x00c2, B:33:0x00dc, B:25:0x008e, B:27:0x00b2), top: B:76:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d A[Catch: Exception -> 0x0055, TRY_ENTER, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x004e, B:57:0x017c, B:59:0x0186, B:61:0x0195, B:63:0x019d, B:65:0x01be, B:67:0x01c6, B:68:0x01e5, B:20:0x006a, B:39:0x0116, B:42:0x012e, B:44:0x0141, B:48:0x0151, B:51:0x0156, B:53:0x0167, B:22:0x0079, B:31:0x00c2, B:33:0x00dc, B:25:0x008e, B:27:0x00b2), top: B:76:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6 A[Catch: Exception -> 0x0055, TRY_ENTER, TryCatch #0 {Exception -> 0x0055, blocks: (B:16:0x004e, B:57:0x017c, B:59:0x0186, B:61:0x0195, B:63:0x019d, B:65:0x01be, B:67:0x01c6, B:68:0x01e5, B:20:0x006a, B:39:0x0116, B:42:0x012e, B:44:0x0141, B:48:0x0151, B:51:0x0156, B:53:0x0167, B:22:0x0079, B:31:0x00c2, B:33:0x00dc, B:25:0x008e, B:27:0x00b2), top: B:76:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel$dispatch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
