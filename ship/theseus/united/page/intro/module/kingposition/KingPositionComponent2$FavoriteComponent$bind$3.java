package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.widget.LinearLayout;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3.class */
public final class KingPositionComponent2$FavoriteComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final LinearLayout $favoriteLayout;
    private Object L$0;
    int label;
    final KingPositionComponent2.FavoriteComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$FavoriteComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LinearLayout $favoriteLayout;
        int label;
        final KingPositionComponent2.FavoriteComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$FavoriteComponent$bind$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionComponent2.FavoriteComponent f100270a;

            public a(KingPositionComponent2.FavoriteComponent favoriteComponent) {
                this.f100270a = favoriteComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f100270a.f100262b.emit(KingPositionComponent2.c.a.f100306b, continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LinearLayout linearLayout, KingPositionComponent2.FavoriteComponent favoriteComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$favoriteLayout = linearLayout;
            this.this$0 = favoriteComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$favoriteLayout, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$favoriteLayout);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$FavoriteComponent$bind$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LinearLayout $favoriteLayout;
        int label;
        final KingPositionComponent2.FavoriteComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$FavoriteComponent$bind$3$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KingPositionComponent2.FavoriteComponent f100271a;

            public a(KingPositionComponent2.FavoriteComponent favoriteComponent) {
                this.f100271a = favoriteComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objEmit = this.f100271a.f100262b.emit(KingPositionComponent2.c.b.f100307b, continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LinearLayout linearLayout, KingPositionComponent2.FavoriteComponent favoriteComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$favoriteLayout = linearLayout;
            this.this$0 = favoriteComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$favoriteLayout, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowB = UIComponentExtKt.b(this.$favoriteLayout);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowB.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$FavoriteComponent$bind$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LinearLayout $favoriteLayout;
        int label;
        final KingPositionComponent2.FavoriteComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2$FavoriteComponent$bind$3$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$FavoriteComponent$bind$3$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<KingPositionService.a, Continuation<? super Unit>, Object> {
            final LinearLayout $favoriteLayout;
            Object L$0;
            int label;
            final KingPositionComponent2.FavoriteComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(KingPositionComponent2.FavoriteComponent favoriteComponent, LinearLayout linearLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = favoriteComponent;
                this.$favoriteLayout = linearLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$favoriteLayout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(KingPositionService.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((KingPositionService.a) this.L$0).f100406c) {
                        MutableSharedFlow<KingPositionComponent2.c> mutableSharedFlow = this.this$0.f100262b;
                        KingPositionComponent2.c.e eVar = new KingPositionComponent2.c.e(this.$favoriteLayout);
                        this.label = 1;
                        if (mutableSharedFlow.emit(eVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
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
        public AnonymousClass3(KingPositionComponent2.FavoriteComponent favoriteComponent, LinearLayout linearLayout, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = favoriteComponent;
            this.$favoriteLayout = linearLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$favoriteLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                KingPositionComponent2.FavoriteComponent favoriteComponent = this.this$0;
                StateFlow<KingPositionService.a> stateFlow = favoriteComponent.f100263c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(favoriteComponent, this.$favoriteLayout, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public KingPositionComponent2$FavoriteComponent$bind$3(KingPositionComponent2.FavoriteComponent favoriteComponent, LinearLayout linearLayout, Continuation<? super KingPositionComponent2$FavoriteComponent$bind$3> continuation) {
        super(2, continuation);
        this.this$0 = favoriteComponent;
        this.$favoriteLayout = linearLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KingPositionComponent2$FavoriteComponent$bind$3 kingPositionComponent2$FavoriteComponent$bind$3 = new KingPositionComponent2$FavoriteComponent$bind$3(this.this$0, this.$favoriteLayout, continuation);
        kingPositionComponent2$FavoriteComponent$bind$3.L$0 = obj;
        return kingPositionComponent2$FavoriteComponent$bind$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$favoriteLayout, this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$favoriteLayout, this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$favoriteLayout, null), 3, (Object) null);
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
            this.this$0.f100261a.f100416d.element = null;
            throw th;
        }
    }
}
