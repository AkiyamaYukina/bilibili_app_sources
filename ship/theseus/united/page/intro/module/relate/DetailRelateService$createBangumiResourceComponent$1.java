package com.bilibili.ship.theseus.united.page.intro.module.relate;

import java.util.HashMap;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createBangumiResourceComponent$1.class */
final class DetailRelateService$createBangumiResourceComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final o0 $card;
    final RelateBangumiResourceCard $resourceCard;
    final com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.f $resourceVm;
    int label;
    final DetailRelateService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createBangumiResourceComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createBangumiResourceComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final o0 $card;
        final RelateBangumiResourceCard $resourceCard;
        final com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.f $resourceVm;
        private Object L$0;
        int label;
        final DetailRelateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createBangumiResourceComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createBangumiResourceComponent$1$1$1.class */
        public static final class C10301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final o0 $card;
            final RelateBangumiResourceCard $resourceCard;
            final com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.f $resourceVm;
            int label;
            final DetailRelateService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createBangumiResourceComponent$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createBangumiResourceComponent$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DetailRelateService f100923a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final o0 f100924b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final RelateBangumiResourceCard f100925c;

                public a(DetailRelateService detailRelateService, o0 o0Var, RelateBangumiResourceCard relateBangumiResourceCard) {
                    this.f100923a = detailRelateService;
                    this.f100924b = o0Var;
                    this.f100925c = relateBangumiResourceCard;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    Object objInvoke;
                    o0 o0Var = this.f100924b;
                    DetailRelateService detailRelateService = this.f100923a;
                    detailRelateService.o(o0Var, "card", new HashMap<>());
                    Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2 = detailRelateService.f100888x;
                    if (function2 != null) {
                        objInvoke = function2.invoke(this.f100925c.a(), continuation);
                        if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objInvoke = Unit.INSTANCE;
                        }
                    } else {
                        objInvoke = Unit.INSTANCE;
                    }
                    return objInvoke;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10301(com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.f fVar, DetailRelateService detailRelateService, o0 o0Var, RelateBangumiResourceCard relateBangumiResourceCard, Continuation<? super C10301> continuation) {
                super(2, continuation);
                this.$resourceVm = fVar;
                this.this$0 = detailRelateService;
                this.$card = o0Var;
                this.$resourceCard = relateBangumiResourceCard;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10301(this.$resourceVm, this.this$0, this.$card, this.$resourceCard, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<Unit> mutableSharedFlow = this.$resourceVm.f101143n;
                    a aVar = new a(this.this$0, this.$card, this.$resourceCard);
                    this.label = 1;
                    if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.f fVar, DetailRelateService detailRelateService, o0 o0Var, RelateBangumiResourceCard relateBangumiResourceCard, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$resourceVm = fVar;
            this.this$0 = detailRelateService;
            this.$card = o0Var;
            this.$resourceCard = relateBangumiResourceCard;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resourceVm, this.this$0, this.$card, this.$resourceCard, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C10301(this.$resourceVm, this.this$0, this.$card, this.$resourceCard, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createBangumiResourceComponent$1(com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.f fVar, DetailRelateService detailRelateService, o0 o0Var, RelateBangumiResourceCard relateBangumiResourceCard, Continuation<? super DetailRelateService$createBangumiResourceComponent$1> continuation) {
        super(1, continuation);
        this.$resourceVm = fVar;
        this.this$0 = detailRelateService;
        this.$card = o0Var;
        this.$resourceCard = relateBangumiResourceCard;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DetailRelateService$createBangumiResourceComponent$1(this.$resourceVm, this.this$0, this.$card, this.$resourceCard, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resourceVm, this.this$0, this.$card, this.$resourceCard, null);
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
