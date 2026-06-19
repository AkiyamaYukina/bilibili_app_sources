package com.bilibili.player.tangram.basic;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$receiveSeekingActions$2.class */
final class ResolveAndPlayPlayable$receiveSeekingActions$2 extends SuspendLambda implements Function2<ResolveAndPlayPlayable.b, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ResolveAndPlayPlayable<e> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$receiveSeekingActions$2(ResolveAndPlayPlayable<e> resolveAndPlayPlayable, Continuation<? super ResolveAndPlayPlayable$receiveSeekingActions$2> continuation) {
        super(2, continuation);
        this.this$0 = resolveAndPlayPlayable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResolveAndPlayPlayable$receiveSeekingActions$2 resolveAndPlayPlayable$receiveSeekingActions$2 = new ResolveAndPlayPlayable$receiveSeekingActions$2(this.this$0, continuation);
        resolveAndPlayPlayable$receiveSeekingActions$2.L$0 = obj;
        return resolveAndPlayPlayable$receiveSeekingActions$2;
    }

    public final Object invoke(ResolveAndPlayPlayable.b bVar, Continuation<? super Unit> continuation) {
        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResolveAndPlayPlayable.b bVar;
        ResolveAndPlayPlayable.b bVar2;
        boolean zBooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            bVar = (ResolveAndPlayPlayable.b) this.L$0;
            defpackage.a.b("[tangram-basic-ResolveAndPlayPlayable$receiveSeekingActions$2-invokeSuspend] ", C4496a.a("Received seeking request: ", Duration.toString-impl(bVar.f79311b)), "ResolveAndPlayPlayable$receiveSeekingActions$2-invokeSuspend");
            try {
                ResolveAndPlayPlayable<e> resolveAndPlayPlayable = this.this$0;
                this.L$0 = bVar;
                this.label = 1;
                Object objH0 = resolveAndPlayPlayable.h0();
                boolean z6 = objH0 instanceof ResolveAndPlayPlayable.c.C0510c;
                boolean z7 = bVar.f79312c;
                long j7 = bVar.f79311b;
                if (z6) {
                    obj = ((ResolveAndPlayPlayable.c.C0510c) objH0).f79314a.c(j7, z7, this);
                } else {
                    resolveAndPlayPlayable.f79304c.setValue(Duration.box-impl(j7));
                    resolveAndPlayPlayable.f79305d = z7;
                    obj = Boxing.boxBoolean(true);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (CancellationException e7) {
                bVar2 = bVar;
                zBooleanValue = false;
                bVar = bVar2;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (ResolveAndPlayPlayable.b) this.L$0;
            bVar2 = bVar;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException e8) {
                zBooleanValue = false;
                bVar = bVar2;
            }
        }
        bVar2 = bVar;
        zBooleanValue = ((Boolean) obj).booleanValue();
        bVar.f79310a.complete(Boolean.valueOf(zBooleanValue));
        return Unit.INSTANCE;
    }
}
