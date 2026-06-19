package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.SequentialPCSPlayable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$runPlayable$2.class */
final class SequentialPCSPlayable$runPlayable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final v $playable;
    private Object L$0;
    int label;
    final SequentialPCSPlayable this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPlayable$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$runPlayable$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final v $playable;
        Object L$0;
        int label;
        final SequentialPCSPlayable this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SequentialPCSPlayable sequentialPCSPlayable, v vVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sequentialPCSPlayable;
            this.$playable = vVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$playable, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws Throwable {
            SequentialPCSPlayable.a next;
            Job job;
            Job job2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                job2 = (Job) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    job = job2;
                    th = th;
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            ArrayList<SequentialPCSPlayable.a> arrayList = this.this$0.f79433d;
            v vVar = this.$playable;
            Iterator<SequentialPCSPlayable.a> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                next.getClass();
                if (vVar == null) {
                    break;
                }
            }
            SequentialPCSPlayable.a aVar = next;
            job = aVar != null ? aVar.f79434a : null;
            if (job == null) {
                v vVar2 = this.$playable;
                this.label = 2;
                if (vVar2.D(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
            try {
                this.L$0 = job;
                this.label = 1;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job2 = job;
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayable$runPlayable$2(SequentialPCSPlayable sequentialPCSPlayable, v vVar, Continuation<? super SequentialPCSPlayable$runPlayable$2> continuation) {
        super(2, continuation);
        this.this$0 = sequentialPCSPlayable;
        this.$playable = vVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequentialPCSPlayable$runPlayable$2 sequentialPCSPlayable$runPlayable$2 = new SequentialPCSPlayable$runPlayable$2(this.this$0, this.$playable, continuation);
        sequentialPCSPlayable$runPlayable$2.L$0 = obj;
        return sequentialPCSPlayable$runPlayable$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.this$0, this.$playable, null), 1, (Object) null);
    }
}
