package com.bilibili.pegasus.components.interest;

import F3.C1799o2;
import F3.C1807p2;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestTipsCloseType;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGuide;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.pegasus.interest.reporter.InterestFrom;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import dp0.C6828a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7781d;
import lp0.C7879b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin.class */
@StabilityInferred(parameters = 0)
public final class LowActiveInterestChoosePlugin extends BasePegasusComponent {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Job f76280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f76281o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public v f76284r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f76277k = "PegasusLowActiveInterestChoosePlugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76278l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bilibili.pegasus.components.r.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76279m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new e(this), new f(this), new g(this));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f76282p = LazyKt.lazy(new C1799o2(8));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f76283q = LazyKt.lazy(new C1807p2(6));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f76285a;

        static {
            int[] iArr = new int[InterestErrorType.values().length];
            try {
                iArr[InterestErrorType.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[InterestErrorType.RESPONSE_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[InterestErrorType.RESPONSE_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f76285a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePlugin f76286a;

        public b(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin) {
            this.f76286a = lowActiveInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76286a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePlugin f76287a;

        public c(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin) {
            this.f76287a = lowActiveInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76287a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePlugin f76288a;

        public d(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin) {
            this.f76288a = lowActiveInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76288a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$e.class */
    public static final class e implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePlugin f76289a;

        public e(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin) {
            this.f76289a = lowActiveInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76289a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$f.class */
    public static final class f implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePlugin f76290a;

        public f(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin) {
            this.f76290a = lowActiveInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76290a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$g.class */
    public static final class g implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LowActiveInterestChoosePlugin f76291a;

        public g(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin) {
            this.f76291a = lowActiveInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76291a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final LowActiveInterestChoosePlugin this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$onViewCreated$1$1.class */
        public static final class C04881 extends SuspendLambda implements Function2<InterestChoose, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final LowActiveInterestChoosePlugin this$0;

            /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$onViewCreated$1$1$1.class */
            public static final class C04891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final InterestChoose $interestInfo;
                int label;
                final LowActiveInterestChoosePlugin this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04891(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, InterestChoose interestChoose, Continuation<? super C04891> continuation) {
                    super(2, continuation);
                    this.this$0 = lowActiveInterestChoosePlugin;
                    this.$interestInfo = interestChoose;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C04891(this.this$0, this.$interestInfo, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Fp0.a.f6386a = true;
                        Gp0.a.b(InterestEvent.ENTER, null, null, InterestFrom.LOW, 6);
                        LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin = this.this$0;
                        InterestChoose interestChoose = this.$interestInfo;
                        this.label = 1;
                        if (lowActiveInterestChoosePlugin.e(interestChoose, this) == coroutine_suspended) {
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
            public C04881(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super C04881> continuation) {
                super(2, continuation);
                this.this$0 = lowActiveInterestChoosePlugin;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04881 c04881 = new C04881(this.this$0, continuation);
                c04881.L$0 = obj;
                return c04881;
            }

            public final Object invoke(InterestChoose interestChoose, Continuation<? super Unit> continuation) {
                return create(interestChoose, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InterestChoose interestChoose = (InterestChoose) this.L$0;
                if (interestChoose == null) {
                    return Unit.INSTANCE;
                }
                BLog.i("[Interest]LowActiveInterestChoosePlugin", "get low active interest");
                com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ENTER, 1, null, null, null, "tianma", 28);
                boolean z6 = C7781d.i(interestChoose) && !Fp0.a.f6387b;
                if (Fp0.a.f6387b) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.FREQ_LIMIT, null, InterestFrom.LOW, 4);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.COLD_START_FREQ_LIMIT, null, null, "tianma", 24);
                } else if (z6) {
                    Gp0.a.b(InterestEvent.VALID_RESPONSE, null, null, InterestFrom.LOW, 6);
                    this.this$0.f76281o = interestChoose.B();
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.VALID_RESPONSE, 1, null, this.this$0.f76281o, null, "tianma", 20);
                } else {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.RESPONSE_INVALID, null, InterestFrom.LOW, 4);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DATA_VALIDATION_ERROR, null, null, "tianma", 24);
                }
                if (z6) {
                    MutableStateFlow<Boolean> mutableStateFlow = ((com.bilibili.pegasus.components.r) this.this$0.f76278l.getValue()).f77124a;
                    if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                        mutableStateFlow.setValue(Boolean.FALSE);
                    }
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0.getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new C04891(this.this$0, interestChoose, null), 3, (Object) null);
                } else {
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.FINISH, 1, null, null, null, "tianma", 28);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lowActiveInterestChoosePlugin;
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
                StateFlow<InterestChoose> stateFlow = this.this$0.c().f79029v;
                C04881 c04881 = new C04881(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04881, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final LowActiveInterestChoosePlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = lowActiveInterestChoosePlugin;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            InterestChooseGuide interestChooseGuideW;
            Context context;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<C6828a> stateFlow = this.this$0.c().f79027t;
                LowActiveInterestChoosePlugin$onViewCreated$2$guide$1 lowActiveInterestChoosePlugin$onViewCreated$2$guide$1 = new LowActiveInterestChoosePlugin$onViewCreated$2$guide$1(null);
                this.label = 1;
                Object objFirst = FlowKt.first(stateFlow, lowActiveInterestChoosePlugin$onViewCreated$2$guide$1, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C6828a c6828a = (C6828a) obj;
            if (c6828a == null || (interestChooseGuideW = c6828a.w()) == null) {
                return Unit.INSTANCE;
            }
            com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ENTER, 1, null, null, null, "tianma", 28);
            if (Fp0.a.f6387b) {
                Gp0.a.a(InterestEvent.ERROR, InterestErrorType.FREQ_LIMIT, MapsKt.mapOf(TuplesKt.to("tips", "1")), InterestFrom.LOW);
                com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.COLD_START_FREQ_LIMIT, null, null, "tianma", 24);
                com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.FINISH, 1, null, null, null, "tianma", 28);
                return Unit.INSTANCE;
            }
            BLog.i("[Interest]LowActiveInterestChoosePlugin", "onViewCreated, receiveGuide");
            LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin = this.this$0;
            Fragment fragment = lowActiveInterestChoosePlugin.getFragment();
            if (fragment != null && (context = fragment.getContext()) != null) {
                lowActiveInterestChoosePlugin.f76280n = BuildersKt.launch$default(LifecycleKt.getCoroutineScope(fragment.getLifecycle()), (CoroutineContext) null, (CoroutineStart) null, new LowActiveInterestChoosePlugin$showInterestTips$1(context, fragment, interestChooseGuideW, lowActiveInterestChoosePlugin, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin.b(com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final PegasusViewModel c() {
        return (PegasusViewModel) this.f76279m.getValue();
    }

    public final void d(boolean z6, kp0.f fVar, boolean z7) {
        WindowSizeClass windowSizeClassWindowSize;
        WindowSizeClass windowSizeClassWindowSize2;
        InterestEvent interestEvent = InterestEvent.FINISH;
        Map mapA = com.bilibili.ad.adview.videodetail.merchandise.y.a(z7 ? 1 : 0, CaptureSchema.JUMP_PARAMS_EXTRA);
        InterestFrom interestFrom = InterestFrom.LOW;
        Gp0.a.b(interestEvent, null, mapA, interestFrom, 2);
        com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.FINISH, 1, null, null, null, "tianma", 28);
        ((com.bilibili.pegasus.components.r) this.f76278l.getValue()).I0();
        PegasusViewModel pegasusViewModelC = c();
        pegasusViewModelC.getClass();
        pegasusViewModelC.z(pegasusViewModelC, new C7879b(false));
        BLog.i("[Interest]LowActiveInterestChoosePlugin", "reset, close = " + z6);
        if (!z6 && fVar != null) {
            fVar.a();
        }
        if (z7) {
            c().M0(fVar);
        } else {
            Gp0.a.b(InterestEvent.BEFORE_PEGASUS_REQUEST, null, null, interestFrom, 6);
            com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.PRE_TIANMA_REQUEST, 1, null, null, null, "tianma", 28);
            PegasusViewModel pegasusViewModelC2 = c();
            PegasusFlush pegasusFlush = z6 ? PegasusFlush.INTEREST : PegasusFlush.NORMAL;
            FragmentActivity activity = getActivity();
            int windowSizeType = (activity == null || (windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize2);
            FragmentActivity activity2 = getActivity();
            PegasusViewModel.K0(pegasusViewModelC2, true, pegasusFlush, null, null, fVar, null, windowSizeType, (activity2 == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity2)) == null) ? 1 : KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize), null, 1836);
        }
        MutableLiveData<Integer> mutableLiveData = Ao0.a.f371a;
        BLog.i("[Interest]LowActiveInterestChoosePlugin", "notifyInterestChoseFinish, currentStatus = " + mutableLiveData.getValue());
        Integer value = mutableLiveData.getValue();
        if (value == null || value.intValue() != 1) {
            mutableLiveData.setValue(1);
        }
        if (((Fp0.b) this.f76283q.getValue()) != null) {
            Fp0.b.a(false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.bilibili.pegasus.data.interestchoose.InterestChoose r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin.e(com.bilibili.pegasus.data.interestchoose.InterestChoose, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.bilibili.pegasus.data.interestchoose.InterestChoose r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin.f(com.bilibili.pegasus.data.interestchoose.InterestChoose, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$1
            if (r0 == 0) goto L29
            r0 = r6
            com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$1 r0 = (com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r6 = r0
            goto L33
        L29:
            com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$1 r0 = new com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L33:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L61
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r6 = r0
            goto L8e
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$2 r0 = new com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin$waitSplashVisible$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r1)
            r9 = r0
            r0 = r9
            r6 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L8e
            r0 = r10
            return r0
        L8e:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L9f
            r0 = r6
            boolean r0 = r0.booleanValue()
            r8 = r0
            goto La1
        L9f:
            r0 = 0
            r8 = r0
        La1:
            r0 = r8
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.LowActiveInterestChoosePlugin.g(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean getComponentEnable() {
        return true;
    }

    @NotNull
    public final String getComponentName() {
        return this.f76277k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8027onVisibleStateChanged9haIX0A(int i7, int i8) {
        super.onVisibleStateChanged-9haIX0A(i7, i8);
        if (PegasusVisibleState.getVisibleFromSplash-impl(i8)) {
            v vVar = this.f76284r;
            if (vVar != null) {
                vVar.invoke();
            }
            this.f76284r = null;
        }
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        if (z6) {
            return;
        }
        BLog.i("[Interest]LowActiveInterestChoosePlugin", "onVisibleStateChangedSimplified, cancel tips");
        Job job = this.f76280n;
        if (job != null && job.isActive()) {
            com.bilibili.pegasus.components.interest.e.x(InterestTipsCloseType.SWITCH);
        }
        Job job2 = this.f76280n;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f76280n = null;
    }
}
