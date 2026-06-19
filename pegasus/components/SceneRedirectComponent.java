package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.room.ui.roomv3.gift.view.panel.bag.LiveGiftBagPanel;
import com.bilibili.bililive.room.ui.roomv3.gift.view.panel.base.LiveBaseCommonGiftItemPanel;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.AutoJumpType;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusVisibleService;
import com.bilibili.pegasus.PegasusVisibleServiceKt;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.teenagersmode.c;
import dp0.C6828a;
import kotlin.Pair;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent.class */
@StabilityInferred(parameters = 0)
public final class SceneRedirectComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final n0 f75876o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public com.bilibili.bplus.im.pblink.n f75878q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75872k = "scene_redirect_component";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f75873l = EnvironmentManager.getInstance().isFirstStart();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75874m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f75875n = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final a f75877p = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent$a.class */
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SceneRedirectComponent f75879a;

        public a(SceneRedirectComponent sceneRedirectComponent) {
            this.f75879a = sceneRedirectComponent;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            MutableLiveData mutableLiveDataB;
            Lifecycle lifecycle;
            if (event == Lifecycle.Event.ON_DESTROY) {
                BLog.i("SceneUriJumpHandlerV2", "destroy remove scene obj");
                SceneRedirectComponent sceneRedirectComponent = this.f75879a;
                Fragment fragment = sceneRedirectComponent.getFragment();
                if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                }
                u00.f fVar = (u00.f) BLRouter.INSTANCE.get(u00.f.class, "HomePageJumpService");
                if (fVar == null || (mutableLiveDataB = fVar.b()) == null) {
                    return;
                }
                mutableLiveDataB.removeObserver(sceneRedirectComponent.f75876o);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SceneRedirectComponent f75880a;

        public b(SceneRedirectComponent sceneRedirectComponent) {
            this.f75880a = sceneRedirectComponent;
        }

        public final Object invoke() {
            return this.f75880a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SceneRedirectComponent f75881a;

        public c(SceneRedirectComponent sceneRedirectComponent) {
            this.f75881a = sceneRedirectComponent;
        }

        public final Object invoke() {
            return this.f75881a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SceneRedirectComponent f75882a;

        public d(SceneRedirectComponent sceneRedirectComponent) {
            this.f75882a = sceneRedirectComponent;
        }

        public final Object invoke() {
            return this.f75882a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.SceneRedirectComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SceneRedirectComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.SceneRedirectComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/SceneRedirectComponent$onViewCreated$1$1.class */
        public static final class C04851 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final SceneRedirectComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04851(SceneRedirectComponent sceneRedirectComponent, Continuation<? super C04851> continuation) {
                super(2, continuation);
                this.this$0 = sceneRedirectComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04851 c04851 = new C04851(this.this$0, continuation);
                c04851.L$0 = obj;
                return c04851;
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Lifecycle lifecycle;
                MutableLiveData mutableLiveDataB;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6828a c6828a = (C6828a) this.L$0;
                String strI = c6828a != null ? c6828a.I() : null;
                if (strI == null || StringsKt.isBlank(strI)) {
                    return Unit.INSTANCE;
                }
                boolean zIsFirstStart = EnvironmentManager.getInstance().isFirstStart();
                boolean z6 = com.bilibili.pegasus.request.b.f78805b;
                int i7 = com.bilibili.pegasus.request.b.f78808e;
                p0.f77112a = System.currentTimeMillis();
                p0.b("get_url", MapsKt.mapOf(new Pair[]{TuplesKt.to("scene_url", strI), TuplesKt.to("clipboard_state", String.valueOf(p0.a())), TuplesKt.to("is_first_start", zIsFirstStart ? "1" : "2"), TuplesKt.to("is_first_request", z6 ? "1" : "2"), TuplesKt.to("device_type", String.valueOf(i7))}));
                if (EnvironmentManager.getInstance().isFirstStart() && com.bilibili.pegasus.request.h.a()) {
                    SceneRedirectComponent sceneRedirectComponent = this.this$0;
                    sceneRedirectComponent.f75875n = strI;
                    u00.f fVar = (u00.f) BLRouter.INSTANCE.get(u00.f.class, "HomePageJumpService");
                    if (fVar != null && (mutableLiveDataB = fVar.b()) != null) {
                        mutableLiveDataB.observeForever(sceneRedirectComponent.f75876o);
                    }
                    Fragment fragment = sceneRedirectComponent.getFragment();
                    if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                        lifecycle.addObserver(sceneRedirectComponent.f75877p);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SceneRedirectComponent sceneRedirectComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sceneRedirectComponent;
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
                StateFlow<C6828a> stateFlow = ((PegasusViewModel) this.this$0.f75874m.getValue()).f79027t;
                C04851 c04851 = new C04851(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c04851, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.pegasus.components.n0] */
    public SceneRedirectComponent() {
        final int i7 = 0;
        this.f75876o = new Observer(this, i7) { // from class: com.bilibili.pegasus.components.n0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77094b;

            {
                this.f77093a = i7;
                this.f77094b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Object obj2 = this.f77094b;
                switch (this.f77093a) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        bilibili.live.app.service.resolver.c.a(iIntValue, "sceneStatusOb:", "SceneUriJumpHandlerV2");
                        final SceneRedirectComponent sceneRedirectComponent = (SceneRedirectComponent) obj2;
                        if (iIntValue == 2) {
                            sceneRedirectComponent.d(TriggerType.NONE);
                            sceneRedirectComponent.c(false);
                            break;
                        } else if (iIntValue == 3) {
                            if (StringsKt.isBlank(sceneRedirectComponent.f75875n)) {
                                sceneRedirectComponent.c(false);
                            } else if (sceneRedirectComponent.isPageVisible() && !MainDialogManager.isDialogShowing()) {
                                sceneRedirectComponent.b(TriggerType.NONE);
                            } else if (sceneRedirectComponent.isPageVisible() && MainDialogManager.isDialogShowing()) {
                                MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_scene_redirect", new MainDialogManager.IDialogInterface(sceneRedirectComponent) { // from class: com.bilibili.pegasus.components.o0

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final SceneRedirectComponent f77106a;

                                    {
                                        this.f77106a = sceneRedirectComponent;
                                    }

                                    public final void onShow() {
                                        if (this.f77106a.b(TriggerType.DIALOG_MANAGER)) {
                                            return;
                                        }
                                        MainDialogManager.showNextDialog("pegasus_scene_redirect", false);
                                    }
                                }, 1050), sceneRedirectComponent.getContext());
                            } else {
                                com.bilibili.bplus.im.pblink.n nVar = new com.bilibili.bplus.im.pblink.n(sceneRedirectComponent, 2);
                                if (!sceneRedirectComponent.isPageVisible()) {
                                    sceneRedirectComponent.f75878q = nVar;
                                } else {
                                    nVar.invoke();
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        String str = (String) obj;
                        int i8 = LiveGiftBagPanel.w;
                        if (str != null) {
                            ((LiveBaseCommonGiftItemPanel) ((LiveGiftBagPanel) obj2)).n = str;
                            break;
                        }
                        break;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.bilibili.pegasus.components.TriggerType r10) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.SceneRedirectComponent.b(com.bilibili.pegasus.components.TriggerType):boolean");
    }

    public final void c(boolean z6) {
        Lifecycle lifecycle;
        MutableLiveData mutableLiveDataB;
        PegasusVisibleService pegasusVisibleService;
        if (z6 && (pegasusVisibleService = PegasusVisibleServiceKt.getPegasusVisibleService()) != null) {
            pegasusVisibleService.onAutoJump(AutoJumpType.SCENE_REDIRECT, this.f75875n);
        }
        Neurons.report$default(false, 0, "main.GrowthHacker.fromAdvertiseLink.other", MapsKt.mapOf(new Pair[]{TuplesKt.to("link", this.f75875n), TuplesKt.to("state", z6 ? "1" : "0"), TuplesKt.to("flag", BiliContext.isForeground() ? "fore" : "back")}), (String) null, 0, 48, (Object) null);
        u00.f fVar = (u00.f) BLRouter.INSTANCE.get(u00.f.class, "HomePageJumpService");
        if (fVar != null) {
            fVar.a(z6);
        }
        if (fVar != null && (mutableLiveDataB = fVar.b()) != null) {
            mutableLiveDataB.removeObserver(this.f75876o);
        }
        Fragment fragment = getFragment();
        if (fragment == null || (lifecycle = fragment.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this.f75877p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(TriggerType triggerType) {
        MutableLiveData activityFromSplash;
        Boolean bool;
        String str = this.f75875n;
        boolean zIsPageVisible = isPageVisible();
        FragmentActivity activity = getActivity();
        SplashViewModel splashViewModel = activity != null ? (SplashViewModel) R0.k.a(activity, SplashViewModel.class) : null;
        p0.b("jump_failed", MapsKt.mapOf(new Pair[]{TuplesKt.to("scene_url", str), TuplesKt.to("clipboard_state", String.valueOf(p0.a())), TuplesKt.to("is_page_visible", zIsPageVisible ? "1" : "2"), TuplesKt.to("is_from_launcher", (splashViewModel == null || (activityFromSplash = splashViewModel.getActivityFromSplash()) == null || (bool = (Boolean) activityFromSplash.getValue()) == null) ? false : bool.booleanValue() ? "1" : "2"), TuplesKt.to("is_teens_dialog_showing", c.C1213c.f110575a.f110558c ? "1" : "2"), TuplesKt.to("isVisibleFromSplash", PegasusVisibleState.getVisibleFromSplash-impl(getVisibleState-XRWi58s()) ? "1" : "2"), TuplesKt.to("isVisibleInLifecycle", PegasusVisibleState.getVisibleInLifecycle-impl(getVisibleState-XRWi58s()) ? "1" : "2"), TuplesKt.to("isSelectedInViewPager", PegasusVisibleState.getVisibleInViewPager-impl(getVisibleState-XRWi58s()) ? "1" : "2"), TuplesKt.to("process_url_duration", p0.f77112a != 0 ? String.valueOf(System.currentTimeMillis() - p0.f77112a) : CaptureSchema.OLD_INVALID_ID_STRING), TuplesKt.to("trigger_type", String.valueOf(triggerType.getValue()))}));
    }

    public final boolean getComponentEnable() {
        return this.f75873l;
    }

    @NotNull
    public final String getComponentName() {
        return this.f75872k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        com.bilibili.bplus.im.pblink.n nVar = this.f75878q;
        if (nVar == null || !z6) {
            return;
        }
        nVar.invoke();
        this.f75878q = null;
    }
}
