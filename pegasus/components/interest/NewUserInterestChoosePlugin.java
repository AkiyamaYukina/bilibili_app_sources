package com.bilibili.pegasus.components.interest;

import F3.C1815q2;
import Mh.a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.module.account.LoginInterestExperiment;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin;
import com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryInterestChoose$1;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.pegasus.interest.reporter.InterestFrom;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
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
import lp0.C7879b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.Q;
import tv.danmaku.android.log.BLog;
import zh0.C9195b;
import zh0.InterfaceC9194a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin.class */
@StabilityInferred(parameters = 0)
public final class NewUserInterestChoosePlugin extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Mh.b f76294k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public DialogFragment f76300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f76301r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public NewUserInterestChoosePlugin$tryInterestChoose$1.a f76304u;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76295l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f76296m = "[Interest]NewUserInterestChoosePlugin";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f76297n = z.a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f76298o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bilibili.pegasus.components.cny.a.class), new e(this), new f(this), new g(this));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f76299p = LazyKt.lazy(new C1815q2(6));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f76302s = LazyKt.lazy(new Co.A(8));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final x f76303t = new PassportObserver(this) { // from class: com.bilibili.pegasus.components.interest.x

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76988a;

        {
            this.f76988a = this;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.c] */
        /* JADX WARN: Type inference failed for: r0v23, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.c] */
        /* JADX WARN: Type inference failed for: r0v31, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.c] */
        /* JADX WARN: Type inference failed for: r0v34, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.c] */
        public final void onChange(Topic topic) throws NoWhenBranchMatchedException {
            Topic topic2 = Topic.SIGN_IN;
            if (topic == topic2) {
                NewUserInterestChoosePlugin newUserInterestChoosePlugin = this.f76988a;
                BiliAccounts.get(newUserInterestChoosePlugin.getContext()).unsubscribe(newUserInterestChoosePlugin.f76303t, new Topic[]{topic2});
                InterfaceC9194a interfaceC9194a = C9195b.f130326a;
                if (interfaceC9194a == null || newUserInterestChoosePlugin.f76300q == null) {
                    return;
                }
                LoginInterestExperiment loginInterestExperimentF = interfaceC9194a.f();
                boolean zB = interfaceC9194a.b();
                com.bilibili.ad.adview.pegasus.banner.adinline.i.b("dismissFlag = ", loginInterestExperimentF.name(), ", isNewUser = ", "[Interest]NewUserInterestChoosePlugin", zB);
                int i7 = NewUserInterestChoosePlugin.a.f76305a[loginInterestExperimentF.ordinal()];
                if (i7 == 1) {
                    ?? r02 = newUserInterestChoosePlugin.f76300q;
                    if (r02 != 0) {
                        r02.c1(InterestPageCloseReason.LOGIN_POPUP.getReason());
                    }
                    ?? r03 = newUserInterestChoosePlugin.f76300q;
                    if (r03 != 0) {
                        r03.kc(InterestPageCloseReason.LOGIN_POPUP);
                    }
                } else if (i7 != 2) {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!zB) {
                    ?? r04 = newUserInterestChoosePlugin.f76300q;
                    if (r04 != 0) {
                        r04.c1(InterestPageCloseReason.LOGIN_POPUP.getReason());
                    }
                    ?? r05 = newUserInterestChoosePlugin.f76300q;
                    if (r05 != 0) {
                        r05.kc(InterestPageCloseReason.LOGIN_POPUP);
                    }
                }
                newUserInterestChoosePlugin.f76300q = null;
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f76305a;

        static {
            int[] iArr = new int[LoginInterestExperiment.values().length];
            try {
                iArr[LoginInterestExperiment.DismissInterest.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[LoginInterestExperiment.DismissInterestForOld.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[LoginInterestExperiment.Control.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f76305a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76306a;

        public b(NewUserInterestChoosePlugin newUserInterestChoosePlugin) {
            this.f76306a = newUserInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76306a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76307a;

        public c(NewUserInterestChoosePlugin newUserInterestChoosePlugin) {
            this.f76307a = newUserInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76307a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76308a;

        public d(NewUserInterestChoosePlugin newUserInterestChoosePlugin) {
            this.f76308a = newUserInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76308a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$e.class */
    public static final class e implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76309a;

        public e(NewUserInterestChoosePlugin newUserInterestChoosePlugin) {
            this.f76309a = newUserInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76309a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$f.class */
    public static final class f implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76310a;

        public f(NewUserInterestChoosePlugin newUserInterestChoosePlugin) {
            this.f76310a = newUserInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76310a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$g.class */
    public static final class g implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76311a;

        public g(NewUserInterestChoosePlugin newUserInterestChoosePlugin) {
            this.f76311a = newUserInterestChoosePlugin;
        }

        public final Object invoke() {
            return this.f76311a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NewUserInterestChoosePlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NewUserInterestChoosePlugin newUserInterestChoosePlugin, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = newUserInterestChoosePlugin;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            this.this$0.f76294k.a(a.a.a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bilibili.pegasus.components.interest.x] */
    public NewUserInterestChoosePlugin(@NotNull Mh.b bVar) {
        this.f76294k = bVar;
    }

    public final Rg0.c b() {
        return (Rg0.c) this.f76299p.getValue();
    }

    public final void c(boolean z6, @Nullable kp0.f fVar) {
        Context context;
        u00.q qVar;
        InterestEvent interestEvent = InterestEvent.FINISH;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "0"));
        InterestFrom interestFrom = InterestFrom.NEW;
        Gp0.a.b(interestEvent, null, mapMapOf, interestFrom, 2);
        com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.FINISH, 1, null, null, null, "interest", 28);
        ViewModelLazy viewModelLazy = this.f76295l;
        PegasusViewModel pegasusViewModel = (PegasusViewModel) viewModelLazy.getValue();
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new C7879b(false));
        this.f76300q = null;
        Q.a("reset, close = ", " from = ", "[Interest]NewUserInterestChoosePlugin", z6, Fp0.a.f6386a);
        if (!z6 && fVar != null) {
            fVar.a();
        }
        Gp0.a.b(InterestEvent.BEFORE_PEGASUS_REQUEST, null, null, interestFrom, 6);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope((PegasusViewModel) viewModelLazy.getValue()), (CoroutineContext) null, (CoroutineStart) null, new NewUserInterestChoosePlugin$launchFromInterest$1(this, z6, fVar, null), 3, (Object) null);
        Fragment fragment = getFragment();
        if (fragment != null && (context = fragment.getContext()) != null && (qVar = (u00.q) BLRouter.get$default(BLRouter.INSTANCE, u00.q.class, (String) null, 2, (Object) null)) != null) {
            qVar.a(context);
        }
        MutableLiveData<Integer> mutableLiveData = Ao0.a.f371a;
        BLog.i("[Interest]NewUserInterestChoosePlugin", "notifyInterestChoseFinish, currentStatus = " + mutableLiveData.getValue());
        Integer value = mutableLiveData.getValue();
        if (value == null || value.intValue() != 1) {
            mutableLiveData.setValue(1);
        }
        if (((Fp0.b) this.f76302s.getValue()) != null) {
            Fp0.b.a(false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.data.interestchoose.InterestChoose r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin.e(com.bilibili.pegasus.data.interestchoose.InterestChoose):void");
    }

    public final boolean getComponentEnable() {
        return this.f76297n;
    }

    @NotNull
    public final String getComponentName() {
        return this.f76296m;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && z.a()) {
            BiliAccounts.get(getContext()).subscribe(this.f76303t, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
            BLog.i("[Interest]NewUserInterestChoosePlugin", "This is first time to request.");
            Gp0.a.b(InterestEvent.WAIT, null, null, InterestFrom.NEW, 6);
            com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.WAIT, 1, null, null, null, "interest", 28);
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireFragment()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(getContext()).unsubscribe(this.f76303t, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.bilibili.pegasus.components.interest.w] */
    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            if (viewLifecycleOwner != null) {
                com.bilibili.pegasus.components.newuser.growth.july2025.b.a(viewLifecycleOwner, activity, this.f76294k, b(), new Function0(this) { // from class: com.bilibili.pegasus.components.interest.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final NewUserInterestChoosePlugin f76987a;

                    {
                        this.f76987a = this;
                    }

                    public final Object invoke() {
                        NewUserInterestChoosePlugin newUserInterestChoosePlugin = this.f76987a;
                        newUserInterestChoosePlugin.getClass();
                        Fp0.a.f6386a = false;
                        if (Fp0.a.f6387b) {
                            Gp0.a.b(InterestEvent.ERROR, InterestErrorType.FREQ_LIMIT, null, InterestFrom.NEW, 4);
                            e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.COLD_START_FREQ_LIMIT, null, null, "interest", 24);
                            newUserInterestChoosePlugin.c(false, null);
                        } else {
                            Gp0.a.b(InterestEvent.ENTER, null, null, InterestFrom.NEW, 6);
                            e.b(InterestChainProcess.ENTER, 1, null, null, null, "interest", 28);
                            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(newUserInterestChoosePlugin.getRequireFragment()), (CoroutineContext) null, (CoroutineStart) null, new NewUserInterestChoosePlugin$tryInterestChoose$1(newUserInterestChoosePlugin, null), 3, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            if (viewLifecycleOwner2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) == null) {
                return;
            }
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new NewUserInterestChoosePlugin$onViewCreated$1$2(this, null), 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8029onVisibleStateChanged9haIX0A(int i7, int i8) {
        super.onVisibleStateChanged-9haIX0A(i7, i8);
        if (PegasusVisibleState.getVisibleFromSplash-impl(i8)) {
            NewUserInterestChoosePlugin$tryInterestChoose$1.a aVar = this.f76304u;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f76304u = null;
        }
    }
}
