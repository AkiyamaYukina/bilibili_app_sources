package com.bilibili.ship.theseus.united.page.error;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPageErrorStateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f99574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f99575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<a> f99576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f99577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f99578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f99579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final FloatLayerManager f99580g = new FloatLayerManager();

    @NotNull
    public final FloatLayerManager h = new FloatLayerManager();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageErrorStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService$1$1.class */
        public static final class C09791 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPageErrorStateService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService$1$1$1.class */
            public static final class C09801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final a $it;
                private Object L$0;
                int label;
                final TheseusPageErrorStateService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService$1$1$1$1.class */
                public static final class C09811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final a $it;
                    int label;
                    final TheseusPageErrorStateService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09811(TheseusPageErrorStateService theseusPageErrorStateService, a aVar, Continuation<? super C09811> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusPageErrorStateService;
                        this.$it = aVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09811(this.this$0, this.$it, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FloatLayerManager floatLayerManager = this.this$0.f99580g;
                            ViewGroup viewGroup = this.$it.f99581a;
                            this.label = 1;
                            if (floatLayerManager.a(viewGroup, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final a $it;
                    int label;
                    final TheseusPageErrorStateService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(TheseusPageErrorStateService theseusPageErrorStateService, a aVar, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusPageErrorStateService;
                        this.$it = aVar;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.this$0, this.$it, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FloatLayerManager floatLayerManager = this.this$0.h;
                            ViewGroup viewGroup = this.$it.f99582b;
                            this.label = 1;
                            if (floatLayerManager.a(viewGroup, this) == coroutine_suspended) {
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
                public C09801(TheseusPageErrorStateService theseusPageErrorStateService, a aVar, Continuation<? super C09801> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusPageErrorStateService;
                    this.$it = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C09801 c09801 = new C09801(this.this$0, this.$it, continuation);
                    c09801.L$0 = obj;
                    return c09801;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09811(this.this$0, this.$it, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$it, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09791(TheseusPageErrorStateService theseusPageErrorStateService, Continuation<? super C09791> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageErrorStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09791 c09791 = new C09791(this.this$0, continuation);
                c09791.L$0 = obj;
                return c09791;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar != null) {
                        C09801 c09801 = new C09801(this.this$0, aVar, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c09801, this) == coroutine_suspended) {
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
        public AnonymousClass1(TheseusPageErrorStateService theseusPageErrorStateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageErrorStateService;
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
                TheseusPageErrorStateService theseusPageErrorStateService = this.this$0;
                Flow<a> flow = theseusPageErrorStateService.f99576c;
                C09791 c09791 = new C09791(theseusPageErrorStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09791, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPageErrorStateService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewGroup f99581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ViewGroup f99582b;

        public a(@NotNull ViewGroup viewGroup, @NotNull ViewGroup viewGroup2) {
            this.f99581a = viewGroup;
            this.f99582b = viewGroup2;
        }
    }

    @Inject
    public TheseusPageErrorStateService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull Activity activity, @NotNull Flow<a> flow, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull ActivityColorRepository activityColorRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar) {
        this.f99574a = context;
        this.f99575b = activity;
        this.f99576c = flow;
        this.f99577d = cVar;
        this.f99578e = activityColorRepository;
        this.f99579f = gVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0336  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.error.a r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService.a(com.bilibili.ship.theseus.united.page.error.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
