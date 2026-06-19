package com.bilibili.pegasus.components.interestv2;

import A50.o;
import A50.p;
import A50.r;
import F3.N5;
import F3.O5;
import F3.R5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.components.interest.z;
import com.bilibili.pegasus.components.interestv2.host.AndroidInterestChooseSession;
import com.bilibili.pegasus.components.interestv2.host.g;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.interest.v2.entry.j;
import u00.q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2.class */
@StabilityInferred(parameters = 0)
public final class NewUserInterestChoosePluginV2 extends BasePegasusComponent {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public AndroidInterestChooseSession f77015q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77009k = "[Interest]NewUserInterestChoosePluginV2";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f77010l = z.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77011m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77012n = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.bilibili.pegasus.components.cny.a.class), new d(this), new e(this), new f(this));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f77013o = LazyKt.lazy(new N5(6));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f77014p = LazyKt.lazy(new O5(9));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.components.interestv2.c f77016r = new com.bilibili.pegasus.components.interestv2.c(new o(this, 4), new p(this, 3));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePluginV2 f77017a;

        public a(NewUserInterestChoosePluginV2 newUserInterestChoosePluginV2) {
            this.f77017a = newUserInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77017a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePluginV2 f77018a;

        public b(NewUserInterestChoosePluginV2 newUserInterestChoosePluginV2) {
            this.f77018a = newUserInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77018a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePluginV2 f77019a;

        public c(NewUserInterestChoosePluginV2 newUserInterestChoosePluginV2) {
            this.f77019a = newUserInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77019a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$d.class */
    public static final class d implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePluginV2 f77020a;

        public d(NewUserInterestChoosePluginV2 newUserInterestChoosePluginV2) {
            this.f77020a = newUserInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77020a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$e.class */
    public static final class e implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePluginV2 f77021a;

        public e(NewUserInterestChoosePluginV2 newUserInterestChoosePluginV2) {
            this.f77021a = newUserInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77021a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$f.class */
    public static final class f implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePluginV2 f77022a;

        public f(NewUserInterestChoosePluginV2 newUserInterestChoosePluginV2) {
            this.f77022a = newUserInterestChoosePluginV2;
        }

        public final Object invoke() {
            return this.f77022a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interestv2.NewUserInterestChoosePluginV2$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/NewUserInterestChoosePluginV2$onViewCreated$2.class */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, NewUserInterestChoosePluginV2.class, "notifyLoginExperimentInterestDismiss", "notifyLoginExperimentInterestDismiss()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m8065invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8065invoke() {
            Context context;
            q qVar;
            Fragment fragment = ((NewUserInterestChoosePluginV2) ((CallableReference) this).receiver).getFragment();
            if (fragment == null || (context = fragment.getContext()) == null || (qVar = (q) BLRouter.get$default(BLRouter.INSTANCE, q.class, (String) null, 2, (Object) null)) == null) {
                return;
            }
            qVar.a(context);
        }
    }

    public final boolean getComponentEnable() {
        return this.f77010l;
    }

    @NotNull
    public final String getComponentName() {
        return this.f77009k;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bilibili.pegasus.components.interestv2.c cVar = this.f77016r;
        cVar.getClass();
        if (bundle == null && z.a()) {
            BiliAccounts.get(((NewUserInterestChoosePluginV2) cVar.f77024a.b).getContext()).subscribe(cVar.f77026c, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        }
    }

    public final void onDestroy() {
        com.bilibili.pegasus.components.interestv2.c cVar = this.f77016r;
        BiliAccounts.get(((NewUserInterestChoosePluginV2) cVar.f77024a.b).getContext()).unsubscribe(cVar.f77026c, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        super.onDestroy();
    }

    public final void onDestroyView() throws Exception {
        AndroidInterestChooseSession androidInterestChooseSession = this.f77015q;
        if (androidInterestChooseSession != null) {
            androidInterestChooseSession.b();
        }
        this.f77015q = null;
        super.onDestroyView();
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AndroidInterestChooseSession androidInterestChooseSession = new AndroidInterestChooseSession(this, activity, LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (PegasusViewModel) this.f77011m.getValue(), (com.bilibili.pegasus.components.cny.a) this.f77012n.getValue(), (Rg0.c) this.f77013o.getValue(), (Fp0.b) this.f77014p.getValue(), new g(new R5(11), true, true, true), new com.bilibili.pegasus.components.interestv2.host.c(null, new AnonymousClass2(this), new r(this, 3), new YP0.a(2), null, null, null, 113));
        this.f77015q = androidInterestChooseSession;
        androidInterestChooseSession.a(getVisibleState-XRWi58s());
        BLog.i("[Interest]NewUserInterestChoosePluginV2", "startInterestChoose");
        AndroidInterestChooseSession androidInterestChooseSession2 = this.f77015q;
        if (androidInterestChooseSession2 != null) {
            if (androidInterestChooseSession2.f77032f.b.a(0, ((com.bilibili.pegasus.components.cny.a) this.f77012n.getValue()).I0(), new j((EnvironmentManager.getInstance().isFirstStart() && com.bilibili.pegasus.request.b.f78804a) ? 1L : 0L, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE, MsaHelper.getOaid(), EnvironmentManager.getInstance().isFirstStart()), false)) {
                return;
            }
        }
        BLog.i("[Interest]NewUserInterestChoosePluginV2", "skip startInterestChoose, entry rejected");
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8064onVisibleStateChanged9haIX0A(int i7, int i8) {
        super.onVisibleStateChanged-9haIX0A(i7, i8);
        AndroidInterestChooseSession androidInterestChooseSession = this.f77015q;
        if (androidInterestChooseSession != null) {
            androidInterestChooseSession.f77033g = i8;
            androidInterestChooseSession.c();
        }
    }
}
