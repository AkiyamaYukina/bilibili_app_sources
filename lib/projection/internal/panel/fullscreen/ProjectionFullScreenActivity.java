package com.bilibili.lib.projection.internal.panel.fullscreen;

import Me0.InterfaceC2650f;
import Ne0.C2728g;
import Ne0.U;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.text.T0;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.control.NewBubbleHelper;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.engine.IEngineDeviceChange;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.search.C5323b;
import com.bilibili.lib.projection.internal.search.J;
import com.bilibili.lib.projection.internal.search.ProjectionSearchFragment;
import com.bilibili.lib.projection.internal.utils.PanelState;
import com.bilibili.lib.projection.internal.widget.ProjectionTitleWidget;
import com.bilibili.lib.projection.internal.widget.e;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionDeviceSwitchFullScreenWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionGlobalLinkModeFullScreenWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionSpeedFullScreenWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiPlayControlWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget;
import com.bilibili.lib.projection.internal.widget.halfscreen.ProjectionDeviceNameWidget;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.common.bili.laser.action.DialogActivity;
import com.common.bili.laser.api.LaserClient;
import com.opensource.svgaplayer.SVGAImageView;
import he0.C7435d;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import ke0.InterfaceC7755c;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionFullScreenActivity.class */
public final class ProjectionFullScreenActivity extends BaseAppCompatActivity implements InterfaceC5317a, IEngineDeviceChange, J {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f63352c1 = ViewConfiguration.getDoubleTapTimeout() + 100;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public Bundle f63353B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f63354C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final e.a f63355D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f63356E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63357F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final LinkedList<ProjectionDialogFragment> f63358G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f63359H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63360I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ViewGroup f63361J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.widget.e f63362K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ProjectionDeviceSwitchFullScreenWidget f63363L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ProjectionSpeedFullScreenWidget f63364M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public View f63365N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ProjectionGlobalLinkModeFullScreenWidget f63366O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ViewGroup f63367P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ViewGroup f63368Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ViewGroup f63369R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ViewGroup f63370S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f63371T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public ProjectionOperationConfig.ControlPageConfig f63372U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @Nullable
    public ProjectionOperationConfig.ThirdProjBubbleConfig f63373V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f63374W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @Nullable
    public ProjectionTitleWidget f63375X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiTvControlWidget f63376X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f63377Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiPlayControlWidget f63378Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f63379Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @NotNull
    public final b f63380Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public NewBubbleHelper f63381a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63382a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public final c f63383b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public C2728g f63384c0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f63385p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiTopBarWidget f63386r0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiDeviceInfoWidget f63387v0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionFullScreenActivity$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63388a;

        static {
            int[] iArr = new int[PanelState.values().length];
            try {
                iArr[PanelState.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PanelState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PanelState.DISCONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f63388a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionFullScreenActivity$b.class */
    public static final class b implements InterfaceC2650f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenActivity f63389a;

        public b(ProjectionFullScreenActivity projectionFullScreenActivity) {
            this.f63389a = projectionFullScreenActivity;
        }

        @Override // Me0.InterfaceC2650f
        public final void a() {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            com.bilibili.lib.projection.internal.device.a aVarS;
            com.bilibili.lib.projection.internal.device.a aVarS2;
            InterfaceC7845m client;
            ProjectionFullScreenActivity projectionFullScreenActivity = this.f63389a;
            InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
            String id = null;
            IProjectionItem iProjectionItemN = (interfaceC7845m2 == null || (aVarS2 = interfaceC7845m2.s()) == null || (client = aVarS2.getClient()) == null) ? null : client.n(true);
            StandardProjectionItem standardProjectionItem = iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null;
            InterfaceC7845m interfaceC7845m3 = projectionFullScreenActivity.f63357F;
            ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
            ProjectionOperationConfig.ThirdProjBubbleConfig thirdProjBubbleConfig = projectionFullScreenActivity.f63373V;
            if (thirdProjBubbleConfig != null) {
                id = thirdProjBubbleConfig.getId();
            }
            reporter.j(standardProjectionItem, device, 2, id, projectionFullScreenActivity.f63374W ? "1" : "0");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionFullScreenActivity$c.class */
    public static final class c implements com.bilibili.lib.projection.internal.widget.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenActivity f63390a;

        public c(ProjectionFullScreenActivity projectionFullScreenActivity) {
            this.f63390a = projectionFullScreenActivity;
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void a() {
            this.f63390a.finish();
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void c(boolean z6) {
            ProjectionFullScreenActivity projectionFullScreenActivity = this.f63390a;
            if (z6) {
                ProjectionTitleWidget projectionTitleWidget = projectionFullScreenActivity.f63375X;
                if (projectionTitleWidget != null) {
                    SVGAImageView sVGAImageView = projectionTitleWidget.f63852e;
                    if (sVGAImageView != null) {
                        sVGAImageView.setVisibility(8);
                    }
                    BiliImageView biliImageView = projectionTitleWidget.f63851d;
                    if (biliImageView != null) {
                        biliImageView.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            ProjectionTitleWidget projectionTitleWidget2 = projectionFullScreenActivity.f63375X;
            if (projectionTitleWidget2 != null) {
                BiliImageView biliImageView2 = projectionTitleWidget2.f63851d;
                if (biliImageView2 != null) {
                    biliImageView2.setVisibility(8);
                }
                SVGAImageView sVGAImageView2 = projectionTitleWidget2.f63852e;
                if (sVGAImageView2 != null) {
                    sVGAImageView2.setVisibility(0);
                }
            }
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void d() {
            SVGAImageView sVGAImageView;
            BiliImageView biliImageView;
            ProjectionFullScreenActivity projectionFullScreenActivity = this.f63390a;
            ProjectionTitleWidget projectionTitleWidget = projectionFullScreenActivity.f63375X;
            if (projectionTitleWidget != null && (biliImageView = projectionTitleWidget.f63851d) != null) {
                biliImageView.setVisibility(8);
            }
            ProjectionTitleWidget projectionTitleWidget2 = projectionFullScreenActivity.f63375X;
            if (projectionTitleWidget2 == null || (sVGAImageView = projectionTitleWidget2.f63852e) == null) {
                return;
            }
            sVGAImageView.setVisibility(0);
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void e() {
            ProjectionFullScreenActivity projectionFullScreenActivity = this.f63390a;
            ProjectionOperationConfig.ControlPageConfig controlPageConfig = projectionFullScreenActivity.f63372U;
            String url = controlPageConfig != null ? controlPageConfig.getUrl() : null;
            ProjectionOperationConfig.ControlPageConfig controlPageConfig2 = projectionFullScreenActivity.f63372U;
            if (controlPageConfig2 != null) {
                com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                String id = controlPageConfig2.getId();
                String title = controlPageConfig2.getTitle();
                String url2 = controlPageConfig2.getUrl();
                ProjectionDeviceInternal projectionDeviceInternal = projectionFullScreenActivity.f63360I;
                aVar.getClass();
                he0.j.c("player.player.activity-banner.0.click", projectionDeviceInternal, null, aVar.f63524a, new x60.c(id, title, url2), 4);
            }
            Lazy lazy = he0.e.f120842a;
            if (url == null || StringsKt.isBlank(url)) {
                return;
            }
            BLRouter.routeTo(RouteRequestKt.toRouteRequest(url), projectionFullScreenActivity);
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void f() {
            int i7 = ProjectionFullScreenActivity.f63352c1;
            ProjectionFullScreenActivity projectionFullScreenActivity = this.f63390a;
            projectionFullScreenActivity.U6();
            InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
            if (interfaceC7845m != null) {
                com.bilibili.lib.projection.internal.reporter.a reporter = interfaceC7845m.getReporter();
                IProjectionItem iProjectionItemN = interfaceC7845m.n(true);
                reporter.M(iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null, projectionFullScreenActivity.f63360I, interfaceC7845m.isGlobalLinkMode(), 2);
                interfaceC7845m.stop();
                ProjectionClient.stopGlobalLink$default(interfaceC7845m, false, 1, null);
            }
            if (projectionFullScreenActivity.isFinishing()) {
                return;
            }
            projectionFullScreenActivity.finish();
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void g(ProjectionDeviceNameWidget projectionDeviceNameWidget) {
            if (projectionDeviceNameWidget != null) {
                projectionDeviceNameWidget.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                projectionDeviceNameWidget.setSingleLine(true);
                projectionDeviceNameWidget.setFocusable(true);
                projectionDeviceNameWidget.setFocusableInTouchMode(true);
                projectionDeviceNameWidget.setMarqueeRepeatLimit(-1);
                projectionDeviceNameWidget.setHorizontallyScrolling(true);
                projectionDeviceNameWidget.setTextSize(14.0f);
                projectionDeviceNameWidget.setSelected(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionFullScreenActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionFullScreenActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ProjectionFullScreenActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionFullScreenActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionFullScreenActivity$onCreate$1$1.class */
        public static final class C03511 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final ProjectionFullScreenActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03511(ProjectionFullScreenActivity projectionFullScreenActivity, Continuation<? super C03511> continuation) {
                super(2, continuation);
                this.this$0 = projectionFullScreenActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03511(this.this$0, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScreenAdjustUtilsKt.correctOrientation(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProjectionFullScreenActivity projectionFullScreenActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = projectionFullScreenActivity;
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
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0);
                C03511 c03511 = new C03511(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03511, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.lib.projection.internal.widget.e$a, java.lang.Object] */
    public ProjectionFullScreenActivity() {
        ?? obj = new Object();
        obj.f63914a = false;
        this.f63355D = obj;
        this.f63358G = new LinkedList<>();
        this.f63377Y = true;
        this.f63379Z = new CompositeDisposable();
        this.f63380Z0 = new b(this);
        this.f63383b1 = new c(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void P6(ProjectionFullScreenActivity projectionFullScreenActivity, PanelState panelState) throws NoWhenBranchMatchedException {
        projectionFullScreenActivity.getClass();
        int i7 = a.f63388a[panelState.ordinal()];
        if (i7 == 1) {
            ViewGroup viewGroup = projectionFullScreenActivity.f63370S;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecoveryDisconnectGroup");
                viewGroup2 = null;
            }
            viewGroup2.setVisibility(8);
            ViewGroup viewGroup3 = projectionFullScreenActivity.f63369R;
            ViewGroup viewGroup4 = viewGroup3;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecoveryLoadingGroup");
                viewGroup4 = null;
            }
            viewGroup4.setVisibility(8);
            ViewGroup viewGroup5 = projectionFullScreenActivity.f63367P;
            ViewGroup viewGroup6 = viewGroup5;
            if (viewGroup5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOperationSectionGroup");
                viewGroup6 = null;
            }
            viewGroup6.setVisibility(0);
            ViewGroup viewGroup7 = projectionFullScreenActivity.f63368Q;
            if (viewGroup7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomSectionGroup");
                viewGroup7 = null;
            }
            viewGroup7.setVisibility(0);
            return;
        }
        if (i7 == 2) {
            ViewGroup viewGroup8 = projectionFullScreenActivity.f63370S;
            ViewGroup viewGroup9 = viewGroup8;
            if (viewGroup8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecoveryDisconnectGroup");
                viewGroup9 = null;
            }
            viewGroup9.setVisibility(8);
            ViewGroup viewGroup10 = projectionFullScreenActivity.f63369R;
            ViewGroup viewGroup11 = viewGroup10;
            if (viewGroup10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecoveryLoadingGroup");
                viewGroup11 = null;
            }
            viewGroup11.setVisibility(0);
            ViewGroup viewGroup12 = projectionFullScreenActivity.f63367P;
            ViewGroup viewGroup13 = viewGroup12;
            if (viewGroup12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOperationSectionGroup");
                viewGroup13 = null;
            }
            viewGroup13.setVisibility(8);
            ViewGroup viewGroup14 = projectionFullScreenActivity.f63368Q;
            if (viewGroup14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomSectionGroup");
                viewGroup14 = null;
            }
            viewGroup14.setVisibility(8);
            return;
        }
        if (i7 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup viewGroup15 = projectionFullScreenActivity.f63370S;
        ViewGroup viewGroup16 = viewGroup15;
        if (viewGroup15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecoveryDisconnectGroup");
            viewGroup16 = null;
        }
        viewGroup16.setVisibility(0);
        ViewGroup viewGroup17 = projectionFullScreenActivity.f63369R;
        ViewGroup viewGroup18 = viewGroup17;
        if (viewGroup17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecoveryLoadingGroup");
            viewGroup18 = null;
        }
        viewGroup18.setVisibility(8);
        ViewGroup viewGroup19 = projectionFullScreenActivity.f63367P;
        ViewGroup viewGroup20 = viewGroup19;
        if (viewGroup19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOperationSectionGroup");
            viewGroup20 = null;
        }
        viewGroup20.setVisibility(8);
        ViewGroup viewGroup21 = projectionFullScreenActivity.f63368Q;
        if (viewGroup21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomSectionGroup");
            viewGroup21 = null;
        }
        viewGroup21.setVisibility(8);
    }

    public static final void Q6(ProjectionFullScreenActivity projectionFullScreenActivity) {
        if (projectionFullScreenActivity.isFinishing() || projectionFullScreenActivity.isDestroyed()) {
            return;
        }
        FragmentManager supportFragmentManager = projectionFullScreenActivity.getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("ProjectionSearchFragment");
        Fragment fragmentA = fragmentFindFragmentByTag;
        if (fragmentFindFragmentByTag == null) {
            fragmentA = ProjectionSearchFragment.a.a(projectionFullScreenActivity.f63356E, true, 0, 0, true, false, C7435d.f120838c, true, 32);
        }
        if (fragmentA instanceof ProjectionSearchFragment) {
            ProjectionSearchFragment projectionSearchFragment = (ProjectionSearchFragment) fragmentA;
            projectionSearchFragment.f63611S1 = projectionFullScreenActivity;
            if (projectionSearchFragment.isAdded()) {
                return;
            }
            projectionSearchFragment.showNow(supportFragmentManager, "ProjectionSearchFragment");
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    @Nullable
    public final InterfaceC7845m M6() {
        return this.f63357F;
    }

    @Override // com.bilibili.lib.projection.internal.engine.IEngineDeviceChange
    public final void O8(boolean z6) {
        if (z6) {
            NewBubbleHelper.f63022m.onNext(NewBubbleHelper.NeedShowNewBubble.BACK_TO_FOREEND);
        } else {
            S6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R6(View view) {
        if (view == 0) {
            return;
        }
        if ((view instanceof InterfaceC7755c) && this.f63357F != null) {
            InterfaceC7755c interfaceC7755c = (InterfaceC7755c) view;
            interfaceC7755c.setPanelContext(this);
            interfaceC7755c.i(this.f63357F);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                R6(viewGroup.getChildAt(i7));
            }
        }
    }

    public final void S6() {
        C2728g c2728g = this.f63384c0;
        if (c2728g != null) {
            c2728g.dismiss();
        }
        this.f63384c0 = null;
    }

    public final void T6() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j7 = jUptimeMillis;
        if (jUptimeMillis - this.f63359H < f63352c1) {
            ProjectionDeviceInternal projectionDeviceInternal = this.f63360I;
            if ((projectionDeviceInternal != null ? projectionDeviceInternal.getPlayerState() : null) == ProjectionDeviceInternal.PlayerState.PLAYING) {
                ProjectionDeviceInternal projectionDeviceInternal2 = this.f63360I;
                if (projectionDeviceInternal2 != null) {
                    projectionDeviceInternal2.pause();
                }
            } else {
                ProjectionDeviceInternal projectionDeviceInternal3 = this.f63360I;
                if (projectionDeviceInternal3 != null) {
                    projectionDeviceInternal3.resume();
                }
            }
            j7 = 0;
        }
        this.f63359H = j7;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    public final void Td(@NotNull ProjectionDialogFragment projectionDialogFragment) {
        if (projectionDialogFragment.jf()) {
            ProjectionTitleWidget projectionTitleWidget = this.f63375X;
            if (projectionTitleWidget != null) {
                projectionTitleWidget.setVisibility(8);
            }
        } else {
            ProjectionTitleWidget projectionTitleWidget2 = this.f63375X;
            if (projectionTitleWidget2 != null) {
                projectionTitleWidget2.setVisibility(0);
            }
        }
        this.f63358G.remove(projectionDialogFragment);
    }

    public final void U6() {
        com.bilibili.lib.projection.internal.widget.e eVar;
        com.bilibili.lib.projection.internal.widget.e eVar2 = this.f63362K;
        if (eVar2 == null || !eVar2.isShowing() || (eVar = this.f63362K) == null) {
            return;
        }
        eVar.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V6(View view) {
        InterfaceC7845m interfaceC7845m;
        if (view == 0) {
            return;
        }
        if ((view instanceof InterfaceC7755c) && (interfaceC7845m = this.f63357F) != null) {
            ((InterfaceC7755c) view).b(interfaceC7845m);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                V6(viewGroup.getChildAt(i7));
            }
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    @Nullable
    public final View Y4() {
        ViewGroup viewGroup = this.f63361J;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            viewGroup2 = null;
        }
        return viewGroup2.findViewById(2131309459);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        InterfaceC7845m interfaceC7845m = this.f63357F;
        if ((interfaceC7845m != null ? interfaceC7845m.onKeyEvent(keyEvent) : false) || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f63358G.isEmpty()) {
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // com.bilibili.lib.projection.internal.search.J
    public final void k() {
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        BLog.i("ProjectionFullScreenActivity", "onBackPressed");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Group group;
        io.reactivex.rxjava3.subjects.a aVarF;
        Disposable disposableSubscribe;
        Group group2;
        ProjectionTitleWidget projectionTitleWidget;
        io.reactivex.rxjava3.subjects.a aVarF2;
        Observable observableSwitchMap;
        Disposable disposableSubscribe2;
        io.reactivex.rxjava3.subjects.a aVarF3;
        Observable observableSwitchMap2;
        Disposable disposableSubscribe3;
        InterfaceC7845m interfaceC7845m;
        View view;
        io.reactivex.rxjava3.subjects.a aVarF4;
        Observable observableSwitchMap3;
        Disposable disposableSubscribe4;
        View view2;
        io.reactivex.rxjava3.subjects.a aVarF5;
        Observable observableSwitchMap4;
        Disposable disposableSubscribe5;
        Bundle extras;
        ScreenAdjustUtilsKt.correctOrientation(this);
        super.onCreate(bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        C5323b.f63716a.b(this);
        new WeakReference(this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.f63353B = extras.getBundle("bundle_fun_controller");
        }
        Bundle bundle2 = this.f63353B;
        this.f63385p0 = bundle2 != null ? bundle2.getBoolean("bundle_new_ui_control", false) : false;
        Bundle bundle3 = this.f63353B;
        this.f63356E = bundle3 != null ? bundle3.getInt("bundle_client_id", 0) : 0;
        j4.t.a("ProjectionFullScreenActivity, isNewUiControl: ", "ProjectionFullScreenActivity", this.f63385p0);
        boolean z6 = this.f63385p0;
        CompositeDisposable compositeDisposable = this.f63379Z;
        if (z6) {
            View viewInflate = View.inflate(this, 2131492943, null);
            setContentView(viewInflate);
            this.f63361J = (ViewGroup) viewInflate.findViewById(2131306968);
            this.f63386r0 = (ProjectionNewUiTopBarWidget) viewInflate.findViewById(2131307873);
            this.f63387v0 = (ProjectionNewUiDeviceInfoWidget) viewInflate.findViewById(2131307870);
            this.f63376X0 = (ProjectionNewUiTvControlWidget) viewInflate.findViewById(2131307874);
            this.f63378Y0 = (ProjectionNewUiPlayControlWidget) viewInflate.findViewById(2131307871);
            InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(this.f63356E);
            this.f63357F = interfaceC7845mH;
            if (interfaceC7845mH != null) {
                interfaceC7845mH.r();
            }
            ScreenAdjustUtilsKt.collectWindowSize$default(this, false, new C5320d(viewInflate, 0), 1, (Object) null);
            ViewGroup viewGroup = this.f63361J;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                viewGroup2 = null;
            }
            R6(viewGroup2);
            NewBubbleHelper newBubbleHelper = new NewBubbleHelper(this.f63356E);
            newBubbleHelper.f63032j = new h(this);
            newBubbleHelper.f63025b = "2";
            this.f63381a0 = newBubbleHelper;
            ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget = this.f63386r0;
            if (projectionNewUiTopBarWidget != null) {
                projectionNewUiTopBarWidget.setClickAction(new i(this));
            }
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget = this.f63387v0;
            if (projectionNewUiDeviceInfoWidget != null) {
                projectionNewUiDeviceInfoWidget.setClickAction(new j(this));
            }
            ProjectionNewUiTvControlWidget projectionNewUiTvControlWidget = this.f63376X0;
            if (projectionNewUiTvControlWidget != null) {
                projectionNewUiTvControlWidget.setClickAction(new k(this));
            }
            ViewGroup viewGroup3 = this.f63361J;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                viewGroup3 = null;
            }
            viewGroup3.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.n(this));
            InterfaceC7845m interfaceC7845m2 = this.f63357F;
            if (interfaceC7845m2 != null && (aVarF5 = interfaceC7845m2.f()) != null && (observableSwitchMap4 = aVarF5.switchMap(new l(this))) != null && (disposableSubscribe5 = observableSwitchMap4.subscribe(new m(this))) != null) {
                compositeDisposable.add(disposableSubscribe5);
            }
            InterfaceC7845m interfaceC7845m3 = this.f63357F;
            boolean zIsGlobalLinkMode = interfaceC7845m3 != null ? interfaceC7845m3.isGlobalLinkMode() : false;
            this.f63371T = zIsGlobalLinkMode;
            if (zIsGlobalLinkMode) {
                ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget2 = this.f63387v0;
                if (projectionNewUiDeviceInfoWidget2 != null) {
                    projectionNewUiDeviceInfoWidget2.setSwitchDeviceVisible(false);
                }
                ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget2 = this.f63386r0;
                if (projectionNewUiTopBarWidget2 != null && (view2 = projectionNewUiTopBarWidget2.f64013b) != null) {
                    CommonDialogUtilsKt.setVisibility(view2, false);
                }
                InterfaceC7845m interfaceC7845m4 = this.f63357F;
                if (interfaceC7845m4 != null && (aVarF4 = interfaceC7845m4.f()) != null && (observableSwitchMap3 = aVarF4.switchMap(f.f63414a)) != null && (disposableSubscribe4 = observableSwitchMap3.subscribe(new g(this))) != null) {
                    compositeDisposable.add(disposableSubscribe4);
                }
            } else {
                ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget3 = this.f63386r0;
                if (projectionNewUiTopBarWidget3 != null && (view = projectionNewUiTopBarWidget3.f64013b) != null) {
                    CommonDialogUtilsKt.setVisibility(view, true);
                }
                ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget3 = this.f63387v0;
                if (projectionNewUiDeviceInfoWidget3 != null) {
                    projectionNewUiDeviceInfoWidget3.setSwitchDeviceVisible(true);
                }
                ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget4 = this.f63387v0;
                if (projectionNewUiDeviceInfoWidget4 != null) {
                    projectionNewUiDeviceInfoWidget4.setBiLinkHighlight(false);
                }
            }
            NewBubbleHelper newBubbleHelper2 = this.f63381a0;
            if (newBubbleHelper2 != null) {
                newBubbleHelper2.b();
            }
        } else {
            setContentView(2131492942);
            Bundle bundle4 = this.f63353B;
            this.f63355D.f63914a = bundle4 != null ? bundle4.getBoolean("bundle_need_show_bubble", false) : false;
            Bundle bundle5 = this.f63353B;
            if (bundle5 != null) {
                bundle5.getInt("bundle_need_show_bubble_type", -1);
            }
            Bundle bundle6 = this.f63353B;
            this.f63377Y = bundle6 != null ? bundle6.getBoolean("bundle_dynamic_icon_need_show", true) : true;
            ProjectionTitleWidget projectionTitleWidget2 = (ProjectionTitleWidget) findViewById(2131309612);
            this.f63375X = projectionTitleWidget2;
            if (projectionTitleWidget2 != null) {
                projectionTitleWidget2.setActionCallback(this.f63383b1);
            }
            ProjectionTitleWidget projectionTitleWidget3 = this.f63375X;
            if (projectionTitleWidget3 != null) {
                projectionTitleWidget3.setHalf(false);
            }
            ViewGroup viewGroup4 = (ViewGroup) findViewById(2131306968);
            this.f63361J = viewGroup4;
            ViewGroup viewGroup5 = viewGroup4;
            if (viewGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                viewGroup5 = null;
            }
            viewGroup5.setOnClickListener(new XO.d(this, 2));
            this.f63367P = (ViewGroup) findViewById(2131309419);
            this.f63368Q = (ViewGroup) findViewById(2131309418);
            this.f63369R = (ViewGroup) findViewById(2131297514);
            this.f63370S = (ViewGroup) findViewById(2131297513);
            C7564c c7564c = C7564c.f121625a;
            compositeDisposable.add(C7564c.f121647x.subscribe(new o(this)));
            InterfaceC7845m interfaceC7845mH2 = c7564c.h(this.f63356E);
            this.f63357F = interfaceC7845mH2;
            this.f63371T = interfaceC7845mH2 != null ? interfaceC7845mH2.isGlobalLinkMode() : false;
            this.f63366O = (ProjectionGlobalLinkModeFullScreenWidget) findViewById(2131309470);
            InterfaceC7845m interfaceC7845m5 = this.f63357F;
            if (interfaceC7845m5 != null) {
                interfaceC7845m5.r();
            }
            InterfaceC7845m interfaceC7845m6 = this.f63357F;
            if (interfaceC7845m6 != null && (aVarF3 = interfaceC7845m6.f()) != null && (observableSwitchMap2 = aVarF3.switchMap(new p(this))) != null && (disposableSubscribe3 = observableSwitchMap2.subscribe(new T0(this))) != null) {
                compositeDisposable.add(disposableSubscribe3);
            }
            TextView textView = (TextView) findViewById(2131300166);
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDisconnectButton");
                textView2 = null;
            }
            textView2.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.l(this, 1));
            if (this.f63371T) {
                ProjectionTitleWidget projectionTitleWidget4 = this.f63375X;
                if (projectionTitleWidget4 != null) {
                    projectionTitleWidget4.k(false);
                }
                InterfaceC7845m interfaceC7845m7 = this.f63357F;
                if (interfaceC7845m7 != null && (aVarF2 = interfaceC7845m7.f()) != null && (observableSwitchMap = aVarF2.switchMap(q.f63430a)) != null && (disposableSubscribe2 = observableSwitchMap.subscribe(new r(this))) != null) {
                    compositeDisposable.add(disposableSubscribe2);
                }
            } else {
                ProjectionTitleWidget projectionTitleWidget5 = this.f63375X;
                if (projectionTitleWidget5 != null) {
                    projectionTitleWidget5.k(true);
                }
            }
            ViewGroup viewGroup6 = this.f63361J;
            ViewGroup viewGroup7 = viewGroup6;
            if (viewGroup6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                viewGroup7 = null;
            }
            R6(viewGroup7);
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget = (ProjectionDeviceSwitchFullScreenWidget) findViewById(2131309466);
            this.f63363L = projectionDeviceSwitchFullScreenWidget;
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget2 = projectionDeviceSwitchFullScreenWidget;
            if (projectionDeviceSwitchFullScreenWidget == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwitchWidget");
                projectionDeviceSwitchFullScreenWidget2 = null;
            }
            projectionDeviceSwitchFullScreenWidget2.setDeviceSwitchFullScreenCallback(this.f63380Z0);
            this.f63364M = (ProjectionSpeedFullScreenWidget) findViewById(2131309461);
            View viewInflate2 = View.inflate(this, 2131496562, null);
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget3 = this.f63363L;
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget4 = projectionDeviceSwitchFullScreenWidget3;
            if (projectionDeviceSwitchFullScreenWidget3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwitchWidget");
                projectionDeviceSwitchFullScreenWidget4 = null;
            }
            com.bilibili.lib.projection.internal.widget.e eVar = new com.bilibili.lib.projection.internal.widget.e(viewInflate2, projectionDeviceSwitchFullScreenWidget4, 2, 0);
            eVar.setFocusable(false);
            eVar.setTouchInterceptor(new View.OnTouchListener(this) { // from class: com.bilibili.lib.projection.internal.panel.fullscreen.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionFullScreenActivity f63407a;

                {
                    this.f63407a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    ProjectionFullScreenActivity projectionFullScreenActivity = this.f63407a;
                    int i7 = ProjectionFullScreenActivity.f63352c1;
                    projectionFullScreenActivity.U6();
                    InterfaceC7845m interfaceC7845m8 = projectionFullScreenActivity.f63357F;
                    if (interfaceC7845m8 == null) {
                        return true;
                    }
                    InterfaceC7845m.h(interfaceC7845m8, view3.getContext(), false, true, false, 10);
                    return true;
                }
            });
            eVar.f63908b = new n(this, eVar);
            this.f63362K = eVar;
            this.f63365N = findViewById(2131309491);
            this.f63366O = (ProjectionGlobalLinkModeFullScreenWidget) findViewById(2131309470);
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget5 = (ProjectionDeviceSwitchFullScreenWidget) findViewById(2131309466);
            this.f63363L = projectionDeviceSwitchFullScreenWidget5;
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget6 = projectionDeviceSwitchFullScreenWidget5;
            if (projectionDeviceSwitchFullScreenWidget5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSwitchWidget");
                projectionDeviceSwitchFullScreenWidget6 = null;
            }
            projectionDeviceSwitchFullScreenWidget6.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.panel.fullscreen.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionFullScreenActivity f63408a;

                {
                    this.f63408a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    final ProjectionFullScreenActivity projectionFullScreenActivity = this.f63408a;
                    int i7 = ProjectionFullScreenActivity.f63352c1;
                    final Context context = view3.getContext();
                    if (context != null) {
                        final int i8 = 0;
                        HandlerThreads.post(0, new Runnable(i8, projectionFullScreenActivity, context) { // from class: com.bilibili.lib.projection.internal.panel.fullscreen.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f63411a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f63412b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Object f63413c;

                            {
                                this.f63411a = i8;
                                this.f63412b = projectionFullScreenActivity;
                                this.f63413c = context;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (this.f63411a) {
                                    case 0:
                                        ProjectionFullScreenActivity projectionFullScreenActivity2 = (ProjectionFullScreenActivity) this.f63412b;
                                        Context context2 = (Context) this.f63413c;
                                        int i9 = ProjectionFullScreenActivity.f63352c1;
                                        projectionFullScreenActivity2.U6();
                                        InterfaceC7845m interfaceC7845m8 = projectionFullScreenActivity2.f63357F;
                                        if (interfaceC7845m8 != null) {
                                            InterfaceC7845m.h(interfaceC7845m8, context2, false, true, false, 10);
                                        }
                                        break;
                                    default:
                                        String str = (String) this.f63412b;
                                        String str2 = (String) this.f63413c;
                                        try {
                                            int i10 = DialogActivity.x;
                                            Context context3 = LaserClient.getContext();
                                            Bundle bundle7 = new Bundle();
                                            bundle7.putString("title", str);
                                            bundle7.putString("detail", str2);
                                            context3.startActivity(new Intent().setClassName(LaserClient.getContext(), "com.common.bili.laser.action.DialogActivity").putExtras(bundle7).setFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE));
                                        } catch (Exception e7) {
                                            nL0.g.a.w("laser", C4496a.a("showToast: fail ", e7.getMessage()));
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            });
            Lazy lazy = he0.e.f120842a;
            InterfaceC7845m interfaceC7845m8 = this.f63357F;
            ProjectionOperationConfig projectionOperationConfigB = he0.e.b(String.valueOf(he0.e.f(interfaceC7845m8 != null ? interfaceC7845m8.getConfig() : null)));
            if (projectionOperationConfigB != null) {
                this.f63372U = projectionOperationConfigB.getProjPage();
                this.f63373V = projectionOperationConfigB.getThirdProjBubble();
            }
            ProjectionOperationConfig.ControlPageConfig controlPageConfig = this.f63372U;
            String staticPic = controlPageConfig != null ? controlPageConfig.getStaticPic() : null;
            ProjectionOperationConfig.ControlPageConfig controlPageConfig2 = this.f63372U;
            String dynamicPic = controlPageConfig2 != null ? controlPageConfig2.getDynamicPic() : null;
            ProjectionOperationConfig.ControlPageConfig controlPageConfig3 = this.f63372U;
            int repeat = 1;
            if (controlPageConfig3 != null) {
                repeat = controlPageConfig3.getRepeat();
            }
            if (!this.f63371T) {
                if ((staticPic == null || StringsKt.isBlank(staticPic)) && (dynamicPic == null || StringsKt.isBlank(dynamicPic))) {
                    BLog.i("ProjectionFullScreenActivity", "pic url empty");
                } else {
                    ProjectionTitleWidget projectionTitleWidget6 = this.f63375X;
                    if (projectionTitleWidget6 != null) {
                        projectionTitleWidget6.setSVGAClearAfterStop(false);
                        projectionTitleWidget6.setStaticImage(staticPic);
                    }
                    ProjectionOperationConfig.ControlPageConfig controlPageConfig4 = this.f63372U;
                    if (controlPageConfig4 != null) {
                        C7564c.f121634k.r(controlPageConfig4.getId(), controlPageConfig4.getTitle(), controlPageConfig4.getUrl(), this.f63360I);
                    }
                    if (this.f63377Y) {
                        ProjectionTitleWidget projectionTitleWidget7 = this.f63375X;
                        if (projectionTitleWidget7 != null) {
                            projectionTitleWidget7.j(repeat, dynamicPic);
                        }
                    } else if (staticPic != null && !StringsKt.isBlank(staticPic) && (projectionTitleWidget = this.f63375X) != null) {
                        SVGAImageView sVGAImageView = projectionTitleWidget.f63852e;
                        if (sVGAImageView != null) {
                            sVGAImageView.setVisibility(8);
                        }
                        BiliImageView biliImageView = projectionTitleWidget.f63851d;
                        if (biliImageView != null) {
                            biliImageView.setVisibility(0);
                        }
                    }
                }
            }
            InterfaceC7845m interfaceC7845m9 = this.f63357F;
            if (Intrinsics.areEqual(interfaceC7845m9 != null ? Boolean.valueOf(interfaceC7845m9.isGlobalLinkMode()) : null, Boolean.TRUE)) {
                View view3 = this.f63365N;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProjectionIconTitleDiliver");
                    view3 = null;
                }
                view3.setVisibility(0);
                ProjectionTitleWidget projectionTitleWidget8 = this.f63375X;
                if (projectionTitleWidget8 != null && (group2 = projectionTitleWidget8.f63854g) != null) {
                    group2.setVisibility(8);
                }
            } else {
                View view4 = this.f63365N;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProjectionIconTitleDiliver");
                    view4 = null;
                }
                view4.setVisibility(8);
                ProjectionTitleWidget projectionTitleWidget9 = this.f63375X;
                if (projectionTitleWidget9 != null && (group = projectionTitleWidget9.f63854g) != null) {
                    group.setVisibility(4);
                }
            }
            InterfaceC7845m interfaceC7845m10 = this.f63357F;
            if (interfaceC7845m10 != null && (aVarF = interfaceC7845m10.f()) != null && (disposableSubscribe = aVarF.subscribe(new t(this))) != null) {
                compositeDisposable.add(disposableSubscribe);
            }
        }
        if (getResources().getConfiguration().smallestScreenWidthDp >= 600 && (interfaceC7845m = this.f63357F) != null) {
            interfaceC7845m.l(new WeakReference<>(this));
        }
        ProjectionNewUiPlayControlWidget projectionNewUiPlayControlWidget = this.f63378Y0;
        if (projectionNewUiPlayControlWidget != null) {
            int i7 = U.f17139a;
            int i8 = U.f17140b;
            ProjectionSeekBarWidget projectionSeekBarWidget = projectionNewUiPlayControlWidget.f63990c;
            if (projectionSeekBarWidget != null) {
                projectionSeekBarWidget.setMax(i8);
            }
            ProjectionSeekBarWidget projectionSeekBarWidget2 = projectionNewUiPlayControlWidget.f63990c;
            if (projectionSeekBarWidget2 != null) {
                projectionSeekBarWidget2.setProgress(i7);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        NewBubbleHelper newBubbleHelper;
        InterfaceC7845m interfaceC7845m;
        ViewGroup viewGroup = null;
        if (getResources().getConfiguration().smallestScreenWidthDp >= 600 && (interfaceC7845m = this.f63357F) != null) {
            interfaceC7845m.l(null);
        }
        U6();
        synchronized (C5323b.f63716a) {
            C5323b.f63717b.remove(this);
        }
        if (this.f63385p0 && (newBubbleHelper = this.f63381a0) != null) {
            newBubbleHelper.f63032j = null;
            CompositeDisposable compositeDisposable = newBubbleHelper.f63024a;
            if (compositeDisposable != null) {
                compositeDisposable.dispose();
            }
            newBubbleHelper.f63024a = null;
        }
        ViewGroup viewGroup2 = this.f63361J;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        } else {
            viewGroup = viewGroup2;
        }
        V6(viewGroup);
        InterfaceC7845m interfaceC7845m2 = this.f63357F;
        if (interfaceC7845m2 != null) {
            interfaceC7845m2.g();
        }
        this.f63379Z.dispose();
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBar(this, getResources().getColor(R$color.Ba0_u));
        getWindow().clearFlags(1024);
        View viewFindViewById = findViewById(2131313663);
        while (true) {
            View view = viewFindViewById;
            if (view == null || view.getId() == 16908290) {
                break;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipToPadding(true);
                viewGroup.setClipChildren(true);
            }
            viewFindViewById = (View) view.getParent();
        }
        NotchCompat.blockDisplayCutout(getWindow());
        if (!NotchCompat.hasDisplayCutout(getWindow()) || Build.VERSION.SDK_INT >= 28 || RomUtils.isSamsungRom()) {
            return;
        }
        getWindow().clearFlags(1024);
        getWindow().setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
        int color = getResources().getColor(R$color.Ba0_u);
        ViewGroup viewGroup2 = (ViewGroup) getWindow().getDecorView();
        View viewFindViewById2 = findViewById(2131297221);
        View view2 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            view2 = new View(this);
            view2.setId(2131297221);
            viewGroup2.addView(view2, new ViewGroup.LayoutParams(-1, StatusBarCompat.getStatusBarHeight(this)));
        }
        view2.setBackgroundColor(color);
        view2.setVisibility(0);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        NewBubbleHelper newBubbleHelper;
        io.reactivex.rxjava3.subjects.a<Boolean> aVar;
        super.onResume();
        if (!this.f63385p0 || (newBubbleHelper = this.f63381a0) == null || (aVar = newBubbleHelper.f63034l) == null) {
            return;
        }
        aVar.onNext(Boolean.TRUE);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (this.f63354C) {
            return;
        }
        e.a aVar = this.f63355D;
        if (aVar.f63914a) {
            aVar.f63914a = Ie0.d.e(2);
            com.bilibili.lib.projection.internal.widget.e eVar = this.f63362K;
            if (eVar == null || eVar.f63907a) {
                return;
            }
            eVar.f63907a = true;
            eVar.c(0L, 40, 0, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showPanel(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionFullScreenActivity.showPanel(java.lang.String):void");
    }
}
