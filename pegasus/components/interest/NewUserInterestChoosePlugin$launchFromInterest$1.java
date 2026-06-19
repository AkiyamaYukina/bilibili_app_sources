package com.bilibili.pegasus.components.interest;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$launchFromInterest$1.class */
final class NewUserInterestChoosePlugin$launchFromInterest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $closeFromConfirm;
    final kp0.f $interestRequestInfo;
    Object L$0;
    int label;
    final NewUserInterestChoosePlugin this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$launchFromInterest$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$launchFromInterest$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$launchFromInterest$1$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasePegasusComponent f76312a;

        public a(BasePegasusComponent basePegasusComponent) {
            this.f76312a = basePegasusComponent;
        }

        public final Object invoke() {
            return this.f76312a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$launchFromInterest$1$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasePegasusComponent f76313a;

        public b(BasePegasusComponent basePegasusComponent) {
            this.f76313a = basePegasusComponent;
        }

        public final Object invoke() {
            return this.f76313a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$launchFromInterest$1$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasePegasusComponent f76314a;

        public c(BasePegasusComponent basePegasusComponent) {
            this.f76314a = basePegasusComponent;
        }

        public final Object invoke() {
            return this.f76314a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserInterestChoosePlugin$launchFromInterest$1(NewUserInterestChoosePlugin newUserInterestChoosePlugin, boolean z6, kp0.f fVar, Continuation<? super NewUserInterestChoosePlugin$launchFromInterest$1> continuation) {
        super(2, continuation);
        this.this$0 = newUserInterestChoosePlugin;
        this.$closeFromConfirm = z6;
        this.$interestRequestInfo = fVar;
    }

    private static final com.bilibili.pegasus.components.cny.a invokeSuspend$lambda$0(Lazy<com.bilibili.pegasus.components.cny.a> lazy) {
        return (com.bilibili.pegasus.components.cny.a) lazy.getValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewUserInterestChoosePlugin$launchFromInterest$1(this.this$0, this.$closeFromConfirm, this.$interestRequestInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Lazy viewModelLazy;
        WindowSizeClass windowSizeClassWindowSize;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            NewUserInterestChoosePlugin newUserInterestChoosePlugin = this.this$0;
            viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bilibili.pegasus.components.cny.a.class), new a(newUserInterestChoosePlugin), new b(newUserInterestChoosePlugin), new c(newUserInterestChoosePlugin));
            MutableStateFlow<Boolean> mutableStateFlow = invokeSuspend$lambda$0(viewModelLazy).f75905a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.L$0 = viewModelLazy;
            this.label = 1;
            if (FlowKt.first(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewModelLazy = (Lazy) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        e.b(InterestChainProcess.PRE_TIANMA_REQUEST, 1, null, null, null, "interest", 28);
        PegasusViewModel pegasusViewModel = (PegasusViewModel) this.this$0.f76295l.getValue();
        PegasusFlush pegasusFlush = this.$closeFromConfirm ? PegasusFlush.INTEREST : PegasusFlush.NORMAL;
        String strI0 = invokeSuspend$lambda$0(viewModelLazy).I0();
        FragmentActivity activity = this.this$0.getActivity();
        int windowSizeType = (activity == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize);
        FragmentActivity activity2 = this.this$0.getActivity();
        int rawWindowSizeType = 1;
        if (activity2 != null) {
            WindowSizeClass windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(activity2);
            rawWindowSizeType = 1;
            if (windowSizeClassWindowSize2 != null) {
                rawWindowSizeType = KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize2);
            }
        }
        PegasusViewModel.K0(pegasusViewModel, true, pegasusFlush, null, null, this.$interestRequestInfo, strI0, windowSizeType, rawWindowSizeType, null, 1804);
        return Unit.INSTANCE;
    }
}
