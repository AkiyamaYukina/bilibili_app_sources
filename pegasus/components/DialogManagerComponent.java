package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mp0.C8028c;
import mp0.InterfaceC8027b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DialogManagerComponent.class */
@StabilityInferred(parameters = 0)
public final class DialogManagerComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75733k = "DialogManagerPlugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75734l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DialogManagerComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DialogManagerComponent f75735a;

        public a(DialogManagerComponent dialogManagerComponent) {
            this.f75735a = dialogManagerComponent;
        }

        public final Object invoke() {
            return this.f75735a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DialogManagerComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DialogManagerComponent f75736a;

        public b(DialogManagerComponent dialogManagerComponent) {
            this.f75736a = dialogManagerComponent;
        }

        public final Object invoke() {
            return this.f75736a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DialogManagerComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DialogManagerComponent f75737a;

        public c(DialogManagerComponent dialogManagerComponent) {
            this.f75737a = dialogManagerComponent;
        }

        public final Object invoke() {
            return this.f75737a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.DialogManagerComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DialogManagerComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DialogManagerComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.DialogManagerComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DialogManagerComponent$onViewCreated$1$1.class */
        public static final class C04771 extends SuspendLambda implements Function2<C8028c, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final DialogManagerComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04771(DialogManagerComponent dialogManagerComponent, Continuation<? super C04771> continuation) {
                super(2, continuation);
                this.this$0 = dialogManagerComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04771 c04771 = new C04771(this.this$0, continuation);
                c04771.L$0 = obj;
                return c04771;
            }

            public final Object invoke(C8028c c8028c, Continuation<? super Unit> continuation) {
                return create(c8028c, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C8028c c8028c = (C8028c) this.L$0;
                if ((MainDialogManager.isFirst() && !c8028c.f123831a.f123826a.isEmpty()) || !Intrinsics.areEqual(c8028c.f123833c, InterfaceC8027b.c.f123830a)) {
                    MainDialogManager.resume(this.this$0.getActivity());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DialogManagerComponent dialogManagerComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dialogManagerComponent;
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
                StateFlow<C8028c> stateFlow = ((PegasusViewModel) this.this$0.f75734l.getValue()).f79020m;
                C04771 c04771 = new C04771(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04771, this) == coroutine_suspended) {
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
        return this.f75733k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
