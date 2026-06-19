package com.bilibili.pegasus.components.interestv2;

import A50.j;
import F3.L5;
import F3.M5;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.components.interestv2.host.AndroidInterestChooseSession;
import com.bilibili.pegasus.components.r;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2.class */
@StabilityInferred(parameters = 0)
public final class LowActiveInterestChoosePluginV2 extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f76993k = "PegasusLowActiveInterestChoosePluginV2";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76994l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76995m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bilibili.pegasus.components.cny.a.class), new d(this), new e(this), new f(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76996n = new ViewModelLazy(Reflection.getOrCreateKotlinClass(r.class), new g(this), new h(this), new i(this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f76997o = LazyKt.lazy(new L5(7));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f76998p = LazyKt.lazy(new M5(6));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public AndroidInterestChooseSession f76999q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77000a;

        public a(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77000a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77000a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77001a;

        public b(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77001a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77001a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77002a;

        public c(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77002a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77002a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77003a;

        public d(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77003a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77003a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77004a;

        public e(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77004a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77004a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$f.class */
    public static final class f implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77005a;

        public f(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77005a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77005a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$g.class */
    public static final class g implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77006a;

        public g(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77006a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77006a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$h.class */
    public static final class h implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77007a;

        public h(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77007a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77007a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$i.class */
    public static final class i implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePluginV2 f77008a;

        public i(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2) {
            this.f77008a = lowActiveInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77008a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interestv2.LowActiveInterestChoosePluginV2$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final LowActiveInterestChoosePluginV2 this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interestv2.LowActiveInterestChoosePluginV2$onViewCreated$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/LowActiveInterestChoosePluginV2$onViewCreated$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final LowActiveInterestChoosePluginV2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = lowActiveInterestChoosePluginV2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(InterestChoose interestChoose, Continuation<? super Unit> continuation) {
                return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x04bb  */
            /* JADX WARN: Removed duplicated region for block: B:103:0x04c4  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0538  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0540  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x05fd  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x0647  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0653  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x04af A[EDGE_INSN: B:143:0x04af->B:100:0x04af BREAK  A[LOOP:5: B:79:0x037b->B:99:0x048f], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:74:0x034d  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x035e  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0385  */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Comparator] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 1683
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interestv2.LowActiveInterestChoosePluginV2.AnonymousClass5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LowActiveInterestChoosePluginV2 lowActiveInterestChoosePluginV2, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = lowActiveInterestChoosePluginV2;
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
                StateFlow<InterestChoose> stateFlow = ((PegasusViewModel) this.this$0.f76994l.getValue()).f79029v;
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

    @NotNull
    public final String getComponentName() {
        return this.f76993k;
    }

    public final void onDestroyView() throws Exception {
        AndroidInterestChooseSession androidInterestChooseSession = this.f76999q;
        if (androidInterestChooseSession != null) {
            androidInterestChooseSession.b();
        }
        this.f76999q = null;
        super.onDestroyView();
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AndroidInterestChooseSession androidInterestChooseSession = new AndroidInterestChooseSession(this, activity, LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (PegasusViewModel) this.f76994l.getValue(), (com.bilibili.pegasus.components.cny.a) this.f76995m.getValue(), (Rg0.c) this.f76997o.getValue(), (Fp0.b) this.f76998p.getValue(), new com.bilibili.pegasus.components.interestv2.host.g(0), new com.bilibili.pegasus.components.interestv2.host.c(new A50.g(this, 4), null, null, null, new com.bilibili.biligame.ui.feed.widget.bottomtip.d(this, 1), new PH.a(this, 1), new j(this, 5), 14));
        this.f76999q = androidInterestChooseSession;
        androidInterestChooseSession.a(getVisibleState-XRWi58s());
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8063onVisibleStateChanged9haIX0A(int i7, int i8) {
        super.onVisibleStateChanged-9haIX0A(i7, i8);
        AndroidInterestChooseSession androidInterestChooseSession = this.f76999q;
        if (androidInterestChooseSession != null) {
            androidInterestChooseSession.f77033g = i8;
            androidInterestChooseSession.c();
        }
    }
}
