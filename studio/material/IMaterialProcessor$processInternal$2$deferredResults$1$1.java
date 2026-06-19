package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.ProcessorItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IMaterialProcessor$processInternal$2$deferredResults$1$1.class */
public final class IMaterialProcessor$processInternal$2$deferredResults$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
    final ProcessorItem $it;
    final SendChannel<h> $sendChannel;
    private Object L$0;
    int label;
    final IMaterialProcessor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IMaterialProcessor$processInternal$2$deferredResults$1$1(IMaterialProcessor<T> iMaterialProcessor, ProcessorItem processorItem, SendChannel<? super h> sendChannel, Continuation<? super IMaterialProcessor$processInternal$2$deferredResults$1$1> continuation) {
        super(2, continuation);
        this.this$0 = iMaterialProcessor;
        this.$it = processorItem;
        this.$sendChannel = sendChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope, SendChannel sendChannel, Ref.IntRef intRef, float f7, int i7, int i8) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new IMaterialProcessor$processInternal$2$deferredResults$1$1$1$1(i7, i8, sendChannel, f7, intRef, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IMaterialProcessor$processInternal$2$deferredResults$1$1 iMaterialProcessor$processInternal$2$deferredResults$1$1 = new IMaterialProcessor$processInternal$2$deferredResults$1$1(this.this$0, this.$it, this.$sendChannel, continuation);
        iMaterialProcessor$processInternal$2$deferredResults$1$1.L$0 = obj;
        return iMaterialProcessor$processInternal$2$deferredResults$1$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:6:0x0046, B:64:0x036e, B:9:0x0051, B:58:0x02cd, B:60:0x02db, B:10:0x0058, B:54:0x0283, B:12:0x0067, B:50:0x021c, B:14:0x0070, B:45:0x01b9, B:15:0x0077, B:41:0x0195, B:17:0x0086, B:33:0x012a, B:35:0x0137, B:37:0x0147, B:46:0x01c9, B:20:0x0097, B:29:0x00ce, B:23:0x00ac, B:25:0x00c2), top: B:71:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x036c  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.IMaterialProcessor$processInternal$2$deferredResults$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
