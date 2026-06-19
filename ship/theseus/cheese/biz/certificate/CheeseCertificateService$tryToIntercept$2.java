package com.bilibili.ship.theseus.cheese.biz.certificate;

import com.bilibili.ship.theseus.united.page.screenstate.c;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$tryToIntercept$2.class */
public final class CheeseCertificateService$tryToIntercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final CheeseCertificateService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$tryToIntercept$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$tryToIntercept$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCertificateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$tryToIntercept$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$tryToIntercept$2$1$1.class */
        public static final class C06031 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseCertificateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06031(CheeseCertificateService cheeseCertificateService, Continuation<? super C06031> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCertificateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06031 c06031 = new C06031(this.this$0, continuation);
                c06031.L$0 = obj;
                return c06031;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!((c.a) this.L$0).f102988b) {
                        CheeseCertificateService cheeseCertificateService = this.this$0;
                        if (!cheeseCertificateService.f89247t) {
                            this.label = 1;
                            if (CheeseCertificateService.b(cheeseCertificateService, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
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
        public AnonymousClass1(CheeseCertificateService cheeseCertificateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCertificateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f89232d.h().f102988b) {
                    StateFlow stateFlowC = this.this$0.f89232d.c();
                    C06031 c06031 = new C06031(this.this$0, null);
                    this.label = 2;
                    if (FlowKt.collectLatest(stateFlowC, c06031, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CheeseCertificateService cheeseCertificateService = this.this$0;
                    if (!cheeseCertificateService.f89247t) {
                        this.label = 1;
                        if (CheeseCertificateService.b(cheeseCertificateService, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$tryToIntercept$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$tryToIntercept$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
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
                BLog.i("CheeseCertificateService$tryToIntercept$2$2-invokeSuspend", "[theseus-cheese-CheeseCertificateService$tryToIntercept$2$2-invokeSuspend] scope canceled.");
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCertificateService$tryToIntercept$2(CheeseCertificateService cheeseCertificateService, Continuation<? super CheeseCertificateService$tryToIntercept$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCertificateService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseCertificateService$tryToIntercept$2 cheeseCertificateService$tryToIntercept$2 = new CheeseCertificateService$tryToIntercept$2(this.this$0, continuation);
        cheeseCertificateService$tryToIntercept$2.L$0 = obj;
        return cheeseCertificateService$tryToIntercept$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(null), 3, (Object) null);
    }
}
