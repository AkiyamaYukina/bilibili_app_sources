package com.bilibili.pegasus.components.cny;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.cache.h;
import com.bilibili.app.comm.list.common.cache.i;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent.class */
@StabilityInferred(parameters = 0)
public final class CnyInfoLogicComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final KProperty<Object>[] f75898l = {new MutablePropertyReference0Impl(CnyInfoLogicComponent.class, "cnyInfoEver", "<v#0>", 0)};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75899k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bilibili.pegasus.components.cny.a.class), new a(this), new b(this), new c(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CnyInfoLogicComponent f75900a;

        public a(CnyInfoLogicComponent cnyInfoLogicComponent) {
            this.f75900a = cnyInfoLogicComponent;
        }

        public final Object invoke() {
            return this.f75900a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CnyInfoLogicComponent f75901a;

        public b(CnyInfoLogicComponent cnyInfoLogicComponent) {
            this.f75901a = cnyInfoLogicComponent;
        }

        public final Object invoke() {
            return this.f75901a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CnyInfoLogicComponent f75902a;

        public c(CnyInfoLogicComponent cnyInfoLogicComponent) {
            this.f75902a = cnyInfoLogicComponent;
        }

        public final Object invoke() {
            return this.f75902a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.cny.CnyInfoLogicComponent$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CnyInfoLogicComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.cny.CnyInfoLogicComponent$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$onCreate$1$1.class */
        public static final class C04871 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public C04871(Continuation<? super C04871> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04871 c04871 = new C04871(continuation);
                c04871.Z$0 = ((Boolean) obj).booleanValue();
                return c04871;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CnyInfoLogicComponent cnyInfoLogicComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cnyInfoLogicComponent;
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
                CnyInfoLogicComponent cnyInfoLogicComponent = this.this$0;
                KProperty<Object>[] kPropertyArr = CnyInfoLogicComponent.f75898l;
                StateFlow pageVisibleStateFlow = cnyInfoLogicComponent.getPageVisibleStateFlow();
                C04871 c04871 = new C04871(null);
                this.label = 1;
                if (FlowKt.first(pageVisibleStateFlow, c04871, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CnyInfoLogicComponent cnyInfoLogicComponent2 = this.this$0;
            KProperty<Object>[] kPropertyArr2 = CnyInfoLogicComponent.f75898l;
            ((com.bilibili.pegasus.components.cny.a) cnyInfoLogicComponent2.f75899k.getValue()).f75905a.setValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.cny.CnyInfoLogicComponent$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$onViewCreated$1.class */
    public static final class C55951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CnyInfoLogicComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.cny.CnyInfoLogicComponent$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/CnyInfoLogicComponent$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CnyInfoLogicComponent f75903a;

            public a(CnyInfoLogicComponent cnyInfoLogicComponent) {
                this.f75903a = cnyInfoLogicComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Action action = (Action) obj;
                if (action instanceof RefreshCompleteAction) {
                    String str = ((RefreshCompleteAction) action).getResponse().getRequestPram().f123316i;
                    KProperty<Object>[] kPropertyArr = CnyInfoLogicComponent.f75898l;
                    this.f75903a.getClass();
                    if (str != null) {
                        i iVarA = h.a(2, "cny_info_ever_v2", false);
                        KProperty<Object> kProperty = CnyInfoLogicComponent.f75898l[0];
                        iVarA.b(Boolean.TRUE);
                    }
                } else {
                    boolean z6 = action instanceof LoadMoreCompleteAction;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55951(CnyInfoLogicComponent cnyInfoLogicComponent, Continuation<? super C55951> continuation) {
            super(2, continuation);
            this.this$0 = cnyInfoLogicComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C55951(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Flow actionFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (actionFlow = viewModel.getActionFlow()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (actionFlow.collect(aVar, this) == coroutine_suspended) {
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

    @NotNull
    public final String getComponentName() {
        return "cny_info_login_component";
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        rV.b bVar = (rV.b) BLRouter.get$default(BLRouter.INSTANCE, rV.b.class, (String) null, 2, (Object) null);
        ViewModelLazy viewModelLazy = this.f75899k;
        if (bVar == null || Intrinsics.areEqual(bVar.b().getValue(), Boolean.FALSE)) {
            ((com.bilibili.pegasus.components.cny.a) viewModelLazy.getValue()).f75905a.setValue(Boolean.TRUE);
        } else {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope((com.bilibili.pegasus.components.cny.a) viewModelLazy.getValue()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView) {
        super/*com.bilibili.pegasus.PegasusComponent*/.onViewCreated(view, recyclerView);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((com.bilibili.pegasus.components.cny.a) this.f75899k.getValue()), (CoroutineContext) null, (CoroutineStart) null, new C55951(this, null), 3, (Object) null);
    }
}
