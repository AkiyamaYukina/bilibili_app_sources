package com.bilibili.ship.theseus.ogv.intro.role;

import com.bilibili.community.follow.FollowUpperRepository$flowOfFollowUpper$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$buildRoleVm$1.class */
public final class CreateOgvRoleUIComponent$buildRoleVm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Role $data;
    final k $vm;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent$buildRoleVm$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$buildRoleVm$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final k $vm;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$vm = kVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$vm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$vm.f93486g.setValue(Boolean.valueOf(Intrinsics.areEqual((Boolean) this.L$0, Boxing.boxBoolean(true))));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvRoleUIComponent$buildRoleVm$1(Role role, k kVar, Continuation<? super CreateOgvRoleUIComponent$buildRoleVm$1> continuation) {
        super(2, continuation);
        this.$data = role;
        this.$vm = kVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateOgvRoleUIComponent$buildRoleVm$1(this.$data, this.$vm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$data.f93429b;
            com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
            FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r02 = new FollowUpperRepository$flowOfFollowUpper$.inlined.map.1(com.bilibili.community.follow.f.c.b(com.bilibili.community.follow.f.f(j7)));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$vm, null);
            this.label = 1;
            if (FlowKt.collectLatest(r02, anonymousClass1, this) == coroutine_suspended) {
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
