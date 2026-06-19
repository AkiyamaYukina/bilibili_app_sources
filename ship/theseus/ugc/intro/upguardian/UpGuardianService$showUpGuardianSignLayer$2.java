package com.bilibili.ship.theseus.ugc.intro.upguardian;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$showUpGuardianSignLayer$2.class */
final class UpGuardianService$showUpGuardianSignLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final j $component;
    private Object L$0;
    int label;
    final UpGuardianService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$showUpGuardianSignLayer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$showUpGuardianSignLayer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final j $component;
        int label;
        final UpGuardianService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpGuardianService upGuardianService, j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = upGuardianService;
            this.$component = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.h;
                j jVar = this.$component;
                this.label = 1;
                if (theseusFloatLayerService.h(jVar, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpGuardianService$showUpGuardianSignLayer$2(UpGuardianService upGuardianService, j jVar, Continuation<? super UpGuardianService$showUpGuardianSignLayer$2> continuation) {
        super(2, continuation);
        this.this$0 = upGuardianService;
        this.$component = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpGuardianService$showUpGuardianSignLayer$2 upGuardianService$showUpGuardianSignLayer$2 = new UpGuardianService$showUpGuardianSignLayer$2(this.this$0, this.$component, continuation);
        upGuardianService$showUpGuardianSignLayer$2.L$0 = obj;
        return upGuardianService$showUpGuardianSignLayer$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$component, null), 3, (Object) null);
    }
}
