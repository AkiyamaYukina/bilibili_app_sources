package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.ship.theseus.ugc.intro.C6264a;
import com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService;
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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$1.class */
public final class UgcPartyInfoService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final c $button;
    final Ref.ObjectRef<e> $componentChanel;
    int label;
    final UgcPartyInfoService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c $button;
        final Ref.ObjectRef<e> $componentChanel;
        int label;
        final UgcPartyInfoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$1$1$1.class */
        public static final class C08631 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final c $button;
            final Ref.ObjectRef<e> $componentChanel;
            boolean Z$0;
            int label;
            final UgcPartyInfoService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08631(c cVar, UgcPartyInfoService ugcPartyInfoService, Ref.ObjectRef<e> objectRef, Continuation<? super C08631> continuation) {
                super(2, continuation);
                this.$button = cVar;
                this.this$0 = ugcPartyInfoService;
                this.$componentChanel = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08631 c08631 = new C08631(this.$button, this.this$0, this.$componentChanel, continuation);
                c08631.Z$0 = ((Boolean) obj).booleanValue();
                return c08631;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                c cVar = this.$button;
                UgcPartyInfoService ugcPartyInfoService = this.this$0;
                Ref.ObjectRef<e> objectRef = this.$componentChanel;
                b bVar = cVar.f97427e;
                cVar.f97423a = z6;
                int[] iArr = UgcPartyInfoService.a.f97412a;
                ReserveBizType reserveBizType = cVar.f97426d;
                if (iArr[reserveBizType.ordinal()] == 1) {
                    ugcPartyInfoService.f97408g.syncStandardCardStatus(reserveBizType.ordinal(), bVar.f97418a, bVar.f97422e, z6);
                }
                e eVar = (e) objectRef.element;
                if (eVar != null) {
                    eVar.a();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcPartyInfoService ugcPartyInfoService, c cVar, Ref.ObjectRef<e> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcPartyInfoService;
            this.$button = cVar;
            this.$componentChanel = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$button, this.$componentChanel, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcPartyInfoService ugcPartyInfoService = this.this$0;
                StateFlow<Boolean> stateFlow = ugcPartyInfoService.f97406e.f97444c;
                C08631 c08631 = new C08631(this.$button, ugcPartyInfoService, this.$componentChanel, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08631, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService$create$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c $button;
        final Ref.ObjectRef<e> $componentChanel;
        int label;
        final UgcPartyInfoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService$create$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$1$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6264a, Continuation<? super Unit>, Object> {
            final c $button;
            final Ref.ObjectRef<e> $componentChanel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(c cVar, Ref.ObjectRef<e> objectRef, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$button = cVar;
                this.$componentChanel = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$button, this.$componentChanel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6264a c6264a, Continuation<? super Unit> continuation) {
                return create(c6264a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6264a c6264a = (C6264a) this.L$0;
                c cVar = this.$button;
                final Ref.ObjectRef<e> objectRef = this.$componentChanel;
                int i7 = c6264a.f96935a;
                boolean z6 = cVar.f97423a;
                final boolean z7 = c6264a.f96937c;
                if (z6 != z7) {
                    b bVar = cVar.f97427e;
                    long j7 = bVar.f97422e;
                    long j8 = c6264a.f96936b;
                    if ((j7 == j8 && (8 == i7 || 7 == i7)) || (bVar.f97418a == j8 && cVar.f97426d.getValue() == i7)) {
                        cVar.f97423a = z7;
                        HandlerThreads.post(0, new Runnable(objectRef, z7) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.j

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Ref.ObjectRef f97445a;

                            {
                                this.f97445a = objectRef;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                e eVar = (e) this.f97445a.element;
                                if (eVar != null) {
                                    eVar.a();
                                }
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcPartyInfoService ugcPartyInfoService, c cVar, Ref.ObjectRef<e> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcPartyInfoService;
            this.$button = cVar;
            this.$componentChanel = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$button, this.$componentChanel, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<C6264a> sharedFlow = this.this$0.f97405d.f96933d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$button, this.$componentChanel, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService$create$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final c $button;
        final Ref.ObjectRef<e> $componentChanel;
        boolean Z$0;
        int label;
        final UgcPartyInfoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, UgcPartyInfoService ugcPartyInfoService, Ref.ObjectRef<e> objectRef, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$button = cVar;
            this.this$0 = ugcPartyInfoService;
            this.$componentChanel = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$button, this.this$0, this.$componentChanel, continuation);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                c cVar = this.$button;
                UgcPartyInfoService ugcPartyInfoService = this.this$0;
                Ref.ObjectRef<e> objectRef = this.$componentChanel;
                if (cVar.f97426d == ReserveBizType.BizTypeFavSeason && !cVar.f97423a) {
                    cVar.f97423a = true;
                    BuildersKt.launch$default(ugcPartyInfoService.f97402a, (CoroutineContext) null, (CoroutineStart) null, new UgcPartyInfoService$create$syncPlayerCardStatusFromFavorite$1(objectRef, null), 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcPartyInfoService$create$1(UgcPartyInfoService ugcPartyInfoService, c cVar, Ref.ObjectRef<e> objectRef, Continuation<? super UgcPartyInfoService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcPartyInfoService;
        this.$button = cVar;
        this.$componentChanel = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcPartyInfoService$create$1(this.this$0, this.$button, this.$componentChanel, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UgcPartyInfoService ugcPartyInfoService = this.this$0;
            BuildersKt.launch$default(ugcPartyInfoService.f97402a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(ugcPartyInfoService, this.$button, this.$componentChanel, null), 3, (Object) null);
            UgcPartyInfoService ugcPartyInfoService2 = this.this$0;
            BuildersKt.launch$default(ugcPartyInfoService2.f97402a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(ugcPartyInfoService2, this.$button, this.$componentChanel, null), 3, (Object) null);
            UgcPartyInfoService ugcPartyInfoService3 = this.this$0;
            StateFlow<Boolean> stateFlow = ugcPartyInfoService3.h.f101641b;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$button, ugcPartyInfoService3, this.$componentChanel, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass3, this) == coroutine_suspended) {
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
