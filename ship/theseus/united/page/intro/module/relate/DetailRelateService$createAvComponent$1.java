package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createAvComponent$1.class */
final class DetailRelateService$createAvComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> $bindView;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createAvComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createAvComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> $bindView;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createAvComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createAvComponent$1$1$1.class */
        public static final class C10291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> $bindView;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10291(Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef, Continuation<? super C10291> continuation) {
                super(2, continuation);
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10291(this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    this.$bindView.element = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bindView = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C10291(this.$bindView, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createAvComponent$1(Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef, Continuation<? super DetailRelateService$createAvComponent$1> continuation) {
        super(1, continuation);
        this.$bindView = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DetailRelateService$createAvComponent$1(this.$bindView, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindView, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
