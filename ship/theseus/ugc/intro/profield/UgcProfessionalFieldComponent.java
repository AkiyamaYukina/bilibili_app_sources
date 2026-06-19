package com.bilibili.ship.theseus.ugc.intro.profield;

import Fc.k;
import I.E;
import J3.C2348i0;
import Vu0.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pv0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent.class */
@StabilityInferred(parameters = 0)
public final class UgcProfessionalFieldComponent extends c<n<D>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f97114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97115g;

    @NotNull
    public final MutableSharedFlow<a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f97116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97117j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$a$a.class */
        @StabilityInferred(parameters = 1)
        public static abstract class AbstractC0841a extends a {

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$a$a$a.class */
            @StabilityInferred(parameters = 1)
            public static final class C0842a extends AbstractC0841a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C0842a f97118a = new AbstractC0841a();
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$a$a$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$a$a$b.class */
            @StabilityInferred(parameters = 1)
            public static final class b extends AbstractC0841a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final b f97119a = new AbstractC0841a();
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$a$a$c */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$a$a$c.class */
            @StabilityInferred(parameters = 1)
            public static final class c extends AbstractC0841a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @NotNull
                public static final c f97120a = new AbstractC0841a();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f97121a = new a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f97123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final UgcProfessionalFieldInfo.ViewType f97124c;

        public b(@NotNull String str, @NotNull String str2, @NotNull UgcProfessionalFieldInfo.ViewType viewType) {
            this.f97122a = str;
            this.f97123b = str2;
            this.f97124c = viewType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f97122a, bVar.f97122a) && Intrinsics.areEqual(this.f97123b, bVar.f97123b) && this.f97124c == bVar.f97124c;
        }

        public final int hashCode() {
            return this.f97124c.hashCode() + E.a(this.f97122a.hashCode() * 31, 31, this.f97123b);
        }

        @NotNull
        public final String toString() {
            return "State(title=" + this.f97122a + ", subtitle=" + this.f97123b + ", type=" + this.f97124c + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final UgcProfessionalFieldComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcProfessionalFieldComponent ugcProfessionalFieldComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = ugcProfessionalFieldComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final D $binding;
        final ConstraintLayout $root;
        final n<D> $viewEntry;
        private Object L$0;
        int label;
        final UgcProfessionalFieldComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int label;
            final UgcProfessionalFieldComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$1$1.class */
            public static final class C08431 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final ConstraintLayout $root;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08431(ConstraintLayout constraintLayout, Continuation<? super C08431> continuation) {
                    super(2, continuation);
                    this.$root = constraintLayout;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08431 c08431 = new C08431(this.$root, continuation);
                    c08431.I$0 = ((Number) obj).intValue();
                    return c08431;
                }

                public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                    return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int iDpToPx = DimenUtilsKt.dpToPx(this.I$0);
                    ConstraintLayout constraintLayout = this.$root;
                    constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcProfessionalFieldComponent ugcProfessionalFieldComponent, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcProfessionalFieldComponent;
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$root, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlow = this.this$0.f97115g;
                    C08431 c08431 = new C08431(this.$root, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08431, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final D $binding;
            final n<D> $viewEntry;
            int label;
            final UgcProfessionalFieldComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final n<D> $viewEntry;
                int label;
                final UgcProfessionalFieldComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UgcProfessionalFieldComponent ugcProfessionalFieldComponent, n<D> nVar, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcProfessionalFieldComponent;
                    this.$viewEntry = nVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$viewEntry, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.h.tryEmit(a.AbstractC0841a.b.f97119a);
                    this.this$0.a(this.$viewEntry);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(D d7, UgcProfessionalFieldComponent ugcProfessionalFieldComponent, n<D> nVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$binding = d7;
                this.this$0 = ugcProfessionalFieldComponent;
                this.$viewEntry = nVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$binding, this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = UIComponentExtKt.a(this.$binding.f25805e);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$viewEntry, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final D $binding;
            final n<D> $viewEntry;
            int label;
            final UgcProfessionalFieldComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$3$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$3$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final n<D> $viewEntry;
                int label;
                final UgcProfessionalFieldComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UgcProfessionalFieldComponent ugcProfessionalFieldComponent, n<D> nVar, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcProfessionalFieldComponent;
                    this.$viewEntry = nVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$viewEntry, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.h.tryEmit(a.AbstractC0841a.c.f97120a);
                    this.this$0.a(this.$viewEntry);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(D d7, UgcProfessionalFieldComponent ugcProfessionalFieldComponent, n<D> nVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$binding = d7;
                this.this$0 = ugcProfessionalFieldComponent;
                this.$viewEntry = nVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$binding, this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = UIComponentExtKt.a(this.$binding.f25806f);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$viewEntry, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final D $binding;
            final n<D> $viewEntry;
            int label;
            final UgcProfessionalFieldComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent$bindToView$9$4$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldComponent$bindToView$9$4$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final n<D> $viewEntry;
                int label;
                final UgcProfessionalFieldComponent this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UgcProfessionalFieldComponent ugcProfessionalFieldComponent, n<D> nVar, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcProfessionalFieldComponent;
                    this.$viewEntry = nVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$viewEntry, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.h.tryEmit(a.AbstractC0841a.C0842a.f97118a);
                    this.this$0.a(this.$viewEntry);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(D d7, UgcProfessionalFieldComponent ugcProfessionalFieldComponent, n<D> nVar, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$binding = d7;
                this.this$0 = ugcProfessionalFieldComponent;
                this.$viewEntry = nVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$binding, this.this$0, this.$viewEntry, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = UIComponentExtKt.a(this.$binding.f25803c);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$viewEntry, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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
        public AnonymousClass9(UgcProfessionalFieldComponent ugcProfessionalFieldComponent, ConstraintLayout constraintLayout, D d7, n<D> nVar, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = ugcProfessionalFieldComponent;
            this.$root = constraintLayout;
            this.$binding = d7;
            this.$viewEntry = nVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.this$0, this.$root, this.$binding, this.$viewEntry, continuation);
            anonymousClass9.L$0 = obj;
            return anonymousClass9;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, this.$viewEntry, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$binding, this.this$0, this.$viewEntry, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$binding, this.this$0, this.$viewEntry, null), 3, (Object) null);
        }
    }

    public UgcProfessionalFieldComponent(@NotNull b bVar, @NotNull StateFlow stateFlow, @NotNull com.bilibili.ship.theseus.ugc.intro.profield.a aVar, @NotNull C2348i0 c2348i0) {
        super(aVar, c2348i0);
        this.f97114f = bVar;
        this.f97115g = stateFlow;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.h = mutableSharedFlowMutableSharedFlow$default;
        this.f97116i = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f97117j = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new k(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // pv0.c
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.n<Vu0.D> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent.bindToView(com.bilibili.app.gemini.ui.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(D.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
