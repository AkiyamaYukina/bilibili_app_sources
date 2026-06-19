package com.bilibili.pegasus.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4847Y;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.droid.StringFormatter;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent.class */
@StabilityInferred(parameters = 0)
public final class FollowModeComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75773k = "PegasusFollowModePlugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75774l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f75775m = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$a.class */
    public static final class a implements Lh.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowModeComponent f75776a;

        public a(FollowModeComponent followModeComponent) {
            this.f75776a = followModeComponent;
        }

        public final void a(boolean z6) {
            FollowModeComponent followModeComponent = this.f75776a;
            if (z6) {
                View view = followModeComponent.getView();
                if (view != null) {
                    followModeComponent.d(view.getContext());
                    return;
                }
                return;
            }
            PegasusHeaderManager headerManager = followModeComponent.getHeaderManager();
            if (headerManager != null) {
                headerManager.removeHeader("PegasusFollowModePlugin");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowModeComponent f75777a;

        public b(FollowModeComponent followModeComponent) {
            this.f75777a = followModeComponent;
        }

        public final Object invoke() {
            return this.f75777a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowModeComponent f75778a;

        public c(FollowModeComponent followModeComponent) {
            this.f75778a = followModeComponent;
        }

        public final Object invoke() {
            return this.f75778a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowModeComponent f75779a;

        public d(FollowModeComponent followModeComponent) {
            this.f75779a = followModeComponent;
        }

        public final Object invoke() {
            return this.f75779a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.FollowModeComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FollowModeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.FollowModeComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$onViewCreated$1$1.class */
        public static final class C04801 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final FollowModeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04801(FollowModeComponent followModeComponent, Continuation<? super C04801> continuation) {
                super(2, continuation);
                this.this$0 = followModeComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04801 c04801 = new C04801(this.this$0, continuation);
                c04801.L$0 = obj;
                return c04801;
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    Method dump skipped, instruction units count: 398
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.FollowModeComponent.AnonymousClass1.C04801.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FollowModeComponent followModeComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = followModeComponent;
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
                StateFlow<C6828a> stateFlow = ((PegasusViewModel) this.this$0.f75774l.getValue()).f79027t;
                C04801 c04801 = new C04801(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04801, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.FollowModeComponent$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FollowModeComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.FollowModeComponent$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FollowModeComponent f75782a;

            public a(FollowModeComponent followModeComponent) {
                this.f75782a = followModeComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Action action = (Action) obj;
                if ((action instanceof com.bilibili.pegasus.vm.m) && !((com.bilibili.pegasus.vm.m) action).f79069b) {
                    FollowModeComponent followModeComponent = this.f75782a;
                    followModeComponent.getClass();
                    if (Lh.n.e()) {
                        Lh.n.e = Boolean.FALSE;
                        Lh.n.c().setBoolean("pref_pegasus_recommend_setting_is_open", false);
                    }
                    if (Lh.n.f()) {
                        PegasusHeaderManager headerManager = followModeComponent.getHeaderManager();
                        if (headerManager != null) {
                            headerManager.removeHeader("PegasusFollowModePlugin");
                        }
                        Context context = followModeComponent.getContext();
                        if (context != null) {
                            PromoToast.showMidToast(context.getApplicationContext(), StringFormatter.format(context.getString(2131845347), new Object[]{(String) ((LinkedHashMap) Lh.n.a()).get("recommend_pegasus_settint_key_title_normal")}));
                        }
                    }
                    Lh.n.h();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FollowModeComponent followModeComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = followModeComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75774l.getValue()).f79014f;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    public static View c(View view) {
        if (view.getId() == 16908290) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        for (View view2 : ViewGroupKt.getChildren((ViewGroup) view)) {
            if (c(view2) != null) {
                return view2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$1
            if (r0 == 0) goto L25
            r0 = r7
            com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$1 r0 = (com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L2f
        L25:
            com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$1 r0 = new com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L2f:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L59
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L4f
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lbc
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L59:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Lc3
            r0 = 1
            r1 = r10
            boolean r1 = com.bilibili.app.comm.list.widget.utils.ListExtentionsKt.isViewAlive(r1)
            if (r0 != r1) goto Lc3
            r0 = r6
            com.bilibili.pegasus.PegasusHeaderManager r0 = r0.getHeaderManager()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L86
            r0 = r10
            java.lang.String r1 = "PegasusFollowModePlugin"
            r0.removeHeader(r1)
        L86:
            r0 = r6
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            android.view.View r0 = r0.requireView()
            android.view.View r0 = r0.getRootView()
            android.view.View r0 = c(r0)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L9e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9e:
            com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2 r0 = new com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2
            r1 = r0
            r2 = r6
            r3 = r10
            r4 = 0
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r7
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r9
            if (r0 != r1) goto Lbc
            r0 = r9
            return r0
        Lbc:
            Lh.n.h()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lc3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.FollowModeComponent.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d(Context context) {
        PegasusHeaderManager headerManager = getHeaderManager();
        if (headerManager == null || !headerManager.hasHeader("PegasusFollowModePlugin")) {
            C4847Y c4847yInflate = C4847Y.inflate(LayoutInflater.from(context));
            c4847yInflate.f53939b.setOnClickListener(new Ug.a(context, 1));
            String str = Lh.n.f;
            if (str == null || StringsKt.isBlank(str)) {
                Lh.n.f = Lh.n.b().optString("recommend_pegasus_top_bar_title", "");
            }
            c4847yInflate.f53940c.setText(Lh.n.f);
            PegasusHeaderManager headerManager2 = getHeaderManager();
            if (headerManager2 != null) {
                headerManager2.addHeader(c4847yInflate.f53938a, "PegasusFollowModePlugin");
            }
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75773k;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        ArrayList arrayList = (ArrayList) Lh.n.c;
        int iIndexOf = arrayList.indexOf(this.f75775m);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
        }
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        if (Lh.n.f()) {
            d(view.getContext());
        } else {
            PegasusHeaderManager headerManager = getHeaderManager();
            if (headerManager != null) {
                headerManager.removeHeader("PegasusFollowModePlugin");
            }
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        ((ArrayList) Lh.n.c).add(this.f75775m);
    }
}
