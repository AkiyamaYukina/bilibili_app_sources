package com.bilibili.pegasus.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.feed.PegasusExposeConfig;
import com.bilibili.lib.homepage.splash.BaseMainViewModel;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lp0.C7879b;
import mp0.C8026a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent.class */
@StabilityInferred(parameters = 0)
public final class ExposeComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public bY.c<RecyclerView> f75752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75753l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BaseMainViewModel.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75754m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new e(this), new f(this), new g(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75755n = new ViewModelLazy(Reflection.getOrCreateKotlinClass(r.class), new h(this), new i(this), new j(this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final String f75756o = "PegasusExposePlugin";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$a.class */
    public static final class a implements eY.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f75758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RecyclerView f75759c;

        public a(ExposeComponent exposeComponent, Rect rect, RecyclerView recyclerView) {
            this.f75757a = exposeComponent;
            this.f75758b = rect;
            this.f75759c = recyclerView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Rect a() {
            Resources resources;
            ExposeComponent exposeComponent = this.f75757a;
            Integer num = (Integer) ((BaseMainViewModel) exposeComponent.f75753l.getValue()).getAppbarOffset().getValue();
            int iIntValue = num != null ? num.intValue() : 0;
            Rect rect = this.f75758b;
            RecyclerView recyclerView = this.f75759c;
            int width = recyclerView.getWidth();
            int height = recyclerView.getHeight();
            Context context = exposeComponent.getContext();
            rect.set(0, 0, width, (height - ((context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166100))) - iIntValue);
            return this.f75758b;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75760a;

        public b(ExposeComponent exposeComponent) {
            this.f75760a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75760a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75761a;

        public c(ExposeComponent exposeComponent) {
            this.f75761a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75761a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75762a;

        public d(ExposeComponent exposeComponent) {
            this.f75762a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75762a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$e.class */
    public static final class e implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75763a;

        public e(ExposeComponent exposeComponent) {
            this.f75763a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75763a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$f.class */
    public static final class f implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75764a;

        public f(ExposeComponent exposeComponent) {
            this.f75764a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75764a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$g.class */
    public static final class g implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75765a;

        public g(ExposeComponent exposeComponent) {
            this.f75765a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75765a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$h.class */
    public static final class h implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75766a;

        public h(ExposeComponent exposeComponent) {
            this.f75766a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75766a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$i.class */
    public static final class i implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75767a;

        public i(ExposeComponent exposeComponent) {
            this.f75767a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75767a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$j.class */
    public static final class j implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExposeComponent f75768a;

        public j(ExposeComponent exposeComponent) {
            this.f75768a = exposeComponent;
        }

        public final Object invoke() {
            return this.f75768a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ExposeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$1$1.class */
        public static final class C04791 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ExposeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04791(ExposeComponent exposeComponent, Continuation<? super C04791> continuation) {
                super(2, continuation);
                this.this$0 = exposeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04791 c04791 = new C04791(this.this$0, continuation);
                c04791.L$0 = obj;
                return c04791;
            }

            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return create(num, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Integer num = (Integer) this.L$0;
                bY.c<RecyclerView> cVar = this.this$0.f75752k;
                if (cVar != null) {
                    cVar.h();
                }
                BLog.d(this.this$0.f75756o, "appbarOffset " + num);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ExposeComponent exposeComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = exposeComponent;
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowLiveDataConversions.a(((BaseMainViewModel) this.this$0.f75753l.getValue()).getAppbarOffset()));
                C04791 c04791 = new C04791(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, c04791, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ExposeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ExposeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposeComponent exposeComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = exposeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6828a c6828a = (C6828a) this.L$0;
                bY.c<RecyclerView> cVar = this.this$0.f75752k;
                if (cVar != null) {
                    cVar.f(c6828a != null ? c6828a.p() : 0.5f);
                }
                bY.c<RecyclerView> cVar2 = this.this$0.f75752k;
                if (cVar2 != null) {
                    cVar2.g(c6828a != null ? c6828a.q() : 0.8f);
                }
                bY.c<RecyclerView> cVar3 = this.this$0.f75752k;
                if (cVar3 != null) {
                    float fN = 0.8f;
                    if (c6828a != null) {
                        fN = c6828a.n();
                    }
                    cVar3.e(fN);
                }
                bY.c<RecyclerView> cVar4 = this.this$0.f75752k;
                if (cVar4 != null) {
                    boolean supportReportExposeDuration = PegasusExposeConfig.INSTANCE.getSupportReportExposeDuration();
                    j4.t.a("setSupportTimeExpose:", "[Expose]ExposeClient", supportReportExposeDuration);
                    cVar4.k = supportReportExposeDuration;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ExposeComponent exposeComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = exposeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<C6828a> stateFlow = ((PegasusViewModel) this.this$0.f75754m.getValue()).f79027t;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ExposeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Action, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ExposeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposeComponent exposeComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = exposeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Action action, Continuation<? super Unit> continuation) {
                return create(action, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Action) this.L$0) instanceof C7879b) {
                    if (C5636q.f77118a) {
                        C5636q.f77118a = false;
                        return Unit.INSTANCE;
                    }
                    bY.c<RecyclerView> cVar = this.this$0.f75752k;
                    if (cVar != null) {
                        cVar.b();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ExposeComponent exposeComponent, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = exposeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75754m.getValue()).f79014f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ExposeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C8026a, Continuation<? super Unit>, Object> {
            int label;
            final ExposeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposeComponent exposeComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = exposeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(C8026a c8026a, Continuation<? super Unit> continuation) {
                return create(c8026a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                bY.c<RecyclerView> cVar = this.this$0.f75752k;
                if (cVar != null) {
                    cVar.i();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ExposeComponent exposeComponent, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = exposeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<C8026a> flow = ((PegasusViewModel) this.this$0.f75754m.getValue()).f79021n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ExposeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            boolean Z$1;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z6;
                anonymousClass1.Z$1 = z7;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0 && this.Z$1);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.ExposeComponent$onViewCreated$5$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/ExposeComponent$onViewCreated$5$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ExposeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ExposeComponent exposeComponent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = exposeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
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
                    bY.c<RecyclerView> cVar = this.this$0.f75752k;
                    if (cVar != null) {
                        cVar.d = true;
                        cVar.h();
                    }
                } else {
                    bY.c<RecyclerView> cVar2 = this.this$0.f75752k;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ExposeComponent exposeComponent, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = exposeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowCombine(this.this$0.getPageVisibleStateFlow(), ((r) this.this$0.f75755n.getValue()).f77125b, new AnonymousClass1(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    @NotNull
    public final String getComponentName() {
        return this.f75756o;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [cY.c, java.lang.Object] */
    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        LifecycleCoroutineScope lifecycleScope3;
        LifecycleCoroutineScope lifecycleScope4;
        LifecycleCoroutineScope lifecycleScope5;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        a aVar = new a(this, new Rect(), recyclerView);
        bY.d dVar = new bY.d(new eY.c(recyclerView));
        dVar.b(0.5f);
        bY.a aVar2 = dVar.b;
        aVar2.b = aVar;
        aVar2.e = true;
        aVar2.g = new Object();
        this.f75752k = dVar.a();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner != null && (lifecycleScope5 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
            BuildersKt.launch$default(lifecycleScope5, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        if (viewLifecycleOwner2 != null && (lifecycleScope4 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
            BuildersKt.launch$default(lifecycleScope4, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        if (viewLifecycleOwner3 != null && (lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3)) != null) {
            BuildersKt.launch$default(lifecycleScope3, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        if (viewLifecycleOwner4 != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4)) != null) {
            BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        if (viewLifecycleOwner5 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        if (((Boolean) ((r) this.f75755n.getValue()).f77125b.getValue()).booleanValue()) {
            if (!z6) {
                bY.c<RecyclerView> cVar = this.f75752k;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            }
            bY.c<RecyclerView> cVar2 = this.f75752k;
            if (cVar2 != null) {
                cVar2.d = true;
                cVar2.h();
            }
        }
    }
}
