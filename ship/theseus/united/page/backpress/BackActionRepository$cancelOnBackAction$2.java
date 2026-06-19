package com.bilibili.ship.theseus.united.page.backpress;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/backpress/BackActionRepository$cancelOnBackAction$2.class */
public final class BackActionRepository$cancelOnBackAction$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Continuation<? super Unit>, Object> $task;
    private Object L$0;
    int label;
    final BackActionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackActionRepository$cancelOnBackAction$2(BackActionRepository backActionRepository, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super BackActionRepository$cancelOnBackAction$2> continuation) {
        super(2, continuation);
        this.this$0 = backActionRepository;
        this.$task = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Job job, boolean z6) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        return true;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackActionRepository$cancelOnBackAction$2 backActionRepository$cancelOnBackAction$2 = new BackActionRepository$cancelOnBackAction$2(this.this$0, this.$task, continuation);
        backActionRepository$cancelOnBackAction$2.L$0 = obj;
        return backActionRepository$cancelOnBackAction$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        BackActionRepository.a aVar;
        BackActionRepository.a aVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BackActionRepository.a aVar3 = (BackActionRepository.a) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                aVar = aVar3;
                this.this$0.f99046a.remove(aVar);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                aVar2 = aVar3;
                th = th;
                this.this$0.f99046a.remove(aVar2);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final Job jobLaunch$default = BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new BackActionRepository$cancelOnBackAction$2$job$1(this.$task, null), 3, (Object) null);
        aVar = new BackActionRepository.a(new Function1(jobLaunch$default) { // from class: com.bilibili.ship.theseus.united.page.backpress.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Job f99050a;

            {
                this.f99050a = jobLaunch$default;
            }

            public final Object invoke(Object obj2) {
                return Boolean.valueOf(BackActionRepository$cancelOnBackAction$2.invokeSuspend$lambda$0(this.f99050a, ((Boolean) obj2).booleanValue()));
            }
        });
        this.this$0.f99046a.add(aVar);
        try {
            this.L$0 = aVar;
            this.label = 1;
            if (jobLaunch$default.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.this$0.f99046a.remove(aVar);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            this.this$0.f99046a.remove(aVar2);
            throw th;
        }
    }
}
