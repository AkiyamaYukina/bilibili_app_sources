package com.bilibili.playerbizcommonv2.danmaku.input.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigationevent.DirectNavigationEventInput;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.provider.UtilKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.bililive.biz.ILiveWalletService;
import com.bilibili.bililive.biz.dialog.LiveRechargeDialog;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.playerbizcommonv2.danmaku.helper.SoftKeyBoardHelper;
import com.bilibili.playerbizcommonv2.danmaku.input.InputPanelContainer;
import com.bilibili.upper.widget.videoplayer.CommonVideoView;
import com.mall.ui.page.create3.module.o;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8347a;
import rr0.ViewOnClickListenerC8544e;
import tv.danmaku.android.log.BLog;
import xr0.C9001a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/widget/h.class */
@StabilityInferred(parameters = 0)
public final class h extends ComponentDialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f81197n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.danmaku.input.a f81198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final com.bilibili.playerbizcommonv2.danmaku.input.c f81199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SoftKeyBoardHelper f81201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f81202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f81203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8544e> f81204g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InputPanelContainer f81205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public InputPanelContainer f81206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f81207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public PlayerInputPlaceholderView f81208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final g f81209m;

    public h(@NotNull com.bilibili.playerbizcommonv2.danmaku.input.a aVar, @NotNull final Context context, @Nullable com.bilibili.playerbizcommonv2.danmaku.input.c cVar, boolean z6) {
        super(context, 2131886241);
        this.f81198a = aVar;
        this.f81199b = cVar;
        this.f81200c = z6;
        final int i7 = 0;
        this.f81202e = LazyKt.lazy(new Function0(context, i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.widget.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81192a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f81193b;

            {
                this.f81192a = i7;
                this.f81193b = context;
            }

            public final Object invoke() {
                switch (this.f81192a) {
                    case 0:
                        return Integer.valueOf(StatusBarCompat.getStatusBarHeight((Context) this.f81193b));
                    case 1:
                        o oVar = (o) this.f81193b;
                        oVar.f.m.setValue(Boolean.TRUE);
                        oVar.f.l.setValue(Boolean.FALSE);
                        Intent intent = new Intent();
                        intent.putExtra("extra_hidden_buy_info_is_select", 1);
                        intent.putExtra("extra_transfer_model", oVar.e);
                        FragmentActivity fragmentActivity = oVar.d;
                        fragmentActivity.setResult(-1, intent);
                        o.m(fragmentActivity);
                        return Unit.INSTANCE;
                    case 2:
                        ((DirectNavigationEventInput) this.f81193b).backCompleted();
                        return Unit.INSTANCE;
                    default:
                        return (TextView) ((View) this.f81193b).findViewById(2131299519);
                }
            }
        });
        final int i8 = 0;
        this.f81203f = LazyKt.lazy(new Function0(context, i8) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.widget.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f81195b;

            {
                this.f81194a = i8;
                this.f81195b = context;
            }

            public final Object invoke() {
                switch (this.f81194a) {
                    case 0:
                        return Integer.valueOf(StatusBarCompat.getNavigationBarHeight((Context) this.f81195b));
                    case 1:
                        ((o) this.f81195b).f.l.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                    case 2:
                        CommonVideoView commonVideoView = (CommonVideoView) this.f81195b;
                        ImageView imageView = commonVideoView.f114697o;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        ImageView imageView2 = commonVideoView.f114699q;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                        View view = commonVideoView.f114698p;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    default:
                        return (TextView) ((View) this.f81195b).findViewById(2131299521);
                }
            }
        });
        this.f81209m = new g(this);
    }

    public final void j() {
        ViewOnClickListenerC8544e viewOnClickListenerC8544e;
        if (this.f81204g == null) {
            InputPanelContainer inputPanelContainer = this.f81205i;
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8544e> eVarE = null;
            if (inputPanelContainer != null) {
                com.bilibili.playerbizcommonv2.danmaku.input.d dVar = new com.bilibili.playerbizcommonv2.danmaku.input.d(this.f81198a);
                com.bilibili.playerbizcommonv2.danmaku.input.d.a(dVar, ViewOnClickListenerC8544e.class, null, 6);
                dVar.f80983d = true;
                eVarE = inputPanelContainer.e(dVar);
            }
            this.f81204g = eVarE;
            if (eVarE == null || (viewOnClickListenerC8544e = (ViewOnClickListenerC8544e) eVarE.a()) == null) {
                return;
            }
            viewOnClickListenerC8544e.f126975L = this.f81200c;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int k() {
        return C9001a.b(this.f81198a) ? 0 : Lh1.b.b(300.0f);
    }

    public final void l(WindowSizeClass windowSizeClass) {
        int i7 = 0;
        int iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        InputPanelContainer inputPanelContainer = this.f81206j;
        if (inputPanelContainer != null) {
            ViewGroup.LayoutParams layoutParams = inputPanelContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintMaxWidth = iDpToPx;
            if (iDpToPx == 0) {
                i7 = -1;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = i7;
            layoutParams2.matchConstraintMinHeight = k();
            inputPanelContainer.setLayoutParams(layoutParams2);
        }
        View view = this.h;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.matchConstraintMaxWidth = iDpToPx;
            view.setLayoutParams(layoutParams4);
        }
        BLog.i("PlayerInputDialog", "setContentMaxWidth: " + iDpToPx + " " + this.f81206j + " " + this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v61, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        InputPanelContainer panelContainer;
        super.onCreate(bundle);
        this.f81201d = new SoftKeyBoardHelper(this.f81209m, getContext());
        setCanceledOnTouchOutside(true);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131496631, (ViewGroup) null, false);
        setContentView(viewInflate);
        this.h = viewInflate.findViewById(2131321687);
        InputPanelContainer inputPanelContainer = (InputPanelContainer) viewInflate.findViewById(2131303716);
        this.f81205i = inputPanelContainer;
        if (inputPanelContainer != 0) {
            inputPanelContainer.setOnClickListener(new Object());
        }
        this.f81206j = (InputPanelContainer) viewInflate.findViewById(2131308636);
        this.f81207k = viewInflate.findViewById(2131308639);
        this.f81208l = (PlayerInputPlaceholderView) viewInflate.findViewById(2131303752);
        View viewFindViewById = viewInflate.findViewById(2131306968);
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            final int i7 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.widget.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f81188a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f81189b;

                {
                    this.f81188a = i7;
                    this.f81189b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    ILiveWalletService iLiveWalletService;
                    switch (this.f81188a) {
                        case 0:
                            ((h) this.f81189b).dismiss();
                            break;
                        default:
                            LiveRechargeDialog liveRechargeDialog = (LiveRechargeDialog) this.f81189b;
                            Kx.f fVar = liveRechargeDialog.j;
                            if (fVar != null) {
                                boolean z6 = liveRechargeDialog.k;
                                boolean z7 = liveRechargeDialog.l;
                                ju.e eVarG = fVar.a.g();
                                if (eVarG != null) {
                                    int i8 = fVar.b.b;
                                    LiveLog.Companion companion = LiveLog.Companion;
                                    String str2 = null;
                                    if (companion.isDebug()) {
                                        try {
                                            str = "onLiveRechargeDialogCancel isGold: " + z6 + " , isCheck: " + z7;
                                        } catch (Exception e7) {
                                            BLog.e("LiveLog", "getLogMessage", e7);
                                            str = null;
                                        }
                                        if (str == null) {
                                            str = "";
                                        }
                                        BLog.d("LiveWalletViewModel", str);
                                        LiveLogDelegate logDelegate = companion.getLogDelegate();
                                        if (logDelegate != null) {
                                            LiveLogDelegate.onLog$default(logDelegate, 4, "LiveWalletViewModel", str, (Throwable) null, 8, (Object) null);
                                        }
                                    } else if (companion.matchLevel(4) && companion.matchLevel(3)) {
                                        try {
                                            str2 = "onLiveRechargeDialogCancel isGold: " + z6 + " , isCheck: " + z7;
                                        } catch (Exception e8) {
                                            BLog.e("LiveLog", "getLogMessage", e8);
                                        }
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        LiveLogDelegate logDelegate2 = companion.getLogDelegate();
                                        if (logDelegate2 != null) {
                                            LiveLogDelegate.onLog$default(logDelegate2, 3, "LiveWalletViewModel", str2, (Throwable) null, 8, (Object) null);
                                        }
                                        BLog.i("LiveWalletViewModel", str2);
                                    }
                                    if (!z6 && z7 && (iLiveWalletService = eVarG.i) != null) {
                                        iLiveWalletService.stopTipRecharge(i8, 1);
                                    }
                                }
                            }
                            liveRechargeDialog.dismissDialog();
                            break;
                    }
                }
            });
        }
        if (this.f81200c) {
            PlayerInputPlaceholderView playerInputPlaceholderView = this.f81208l;
            if (playerInputPlaceholderView != null) {
                playerInputPlaceholderView.setBackgroundResource(2131100750);
            }
            InputPanelContainer inputPanelContainer2 = this.f81205i;
            if (inputPanelContainer2 != null) {
                inputPanelContainer2.setBackgroundResource(2131100750);
            }
        }
        if (C9001a.a(this.f81198a)) {
            InputPanelContainer inputPanelContainer3 = this.f81206j;
            if (inputPanelContainer3 != null) {
                inputPanelContainer3.setBackgroundColor(ResourcesCompat.getColor(getContext().getResources(), 2131100278, null));
            }
            View view = this.f81207k;
            if (view != null) {
                view.setBackgroundColor(ResourcesCompat.getColor(getContext().getResources(), 2131100278, null));
            }
        } else {
            InputPanelContainer inputPanelContainer4 = this.f81206j;
            if (inputPanelContainer4 != null) {
                inputPanelContainer4.setBackgroundColor(ResourcesCompat.getColor(getContext().getResources(), 2131100283, null));
            }
            View view2 = this.f81207k;
            if (view2 != null) {
                view2.setBackgroundColor(ResourcesCompat.getColor(getContext().getResources(), 2131100283, null));
            }
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.clearFlags(131080);
            window.setSoftInputMode(48);
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setDimAmount(0.0f);
        }
        j();
        Window window2 = getWindow();
        if (window2 != null) {
            if (C9001a.b(this.f81198a) || !C9001a.d(this.f81198a)) {
                if (NotchCompat.hasDisplayCutoutHardware(window2)) {
                    NotchCompat.immersiveDisplayCutout(window2);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowCompat.setDecorFitsSystemWindows(window2, false);
                    window2.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility() | 2310);
                    WindowInsetsController windowInsetsController = window2.getDecorView().getWindowInsetsController();
                    if (windowInsetsController != null) {
                        windowInsetsController.hide(WindowInsets.Type.systemBars());
                    }
                } else {
                    window2.getDecorView().setSystemUiVisibility(3846);
                }
            } else {
                WindowCompat.setDecorFitsSystemWindows(window2, false);
                window2.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT);
                window2.addFlags(Integer.MIN_VALUE);
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setNavigationBarColor(C9001a.a(this.f81198a) ? ResourcesCompat.getColor(getContext().getResources(), 2131100278, null) : ResourcesCompat.getColor(getContext().getResources(), 2131100283, null));
                }
            }
        }
        setOnShowListener(new DialogInterface.OnShowListener(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.widget.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f81190a;

            {
                this.f81190a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:152:0x03d0  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x03dd  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x03e5  */
            /* JADX WARN: Type inference failed for: r0v171 */
            /* JADX WARN: Type inference failed for: r0v172, types: [qr0.a] */
            /* JADX WARN: Type inference failed for: r0v201, types: [qr0.a] */
            /* JADX WARN: Type inference failed for: r1v20, types: [qr0.a] */
            /* JADX WARN: Type inference failed for: r1v23, types: [qr0.a] */
            /* JADX WARN: Type inference failed for: r7v43 */
            /* JADX WARN: Type inference failed for: r7v44 */
            /* JADX WARN: Type inference failed for: r7v48, types: [qr0.a] */
            /* JADX WARN: Type inference failed for: r7v70 */
            @Override // android.content.DialogInterface.OnShowListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onShow(android.content.DialogInterface r7) {
                /*
                    Method dump skipped, instruction units count: 1379
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.widget.c.onShow(android.content.DialogInterface):void");
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.widget.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f81191a;

            {
                this.f81191a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel;
                com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel2;
                h hVar = this.f81191a;
                InputPanelContainer inputPanelContainer5 = hVar.f81205i;
                if (inputPanelContainer5 != null && (stackTopPanel2 = inputPanelContainer5.getStackTopPanel()) != null) {
                    stackTopPanel2.p();
                }
                InputPanelContainer inputPanelContainer6 = hVar.f81206j;
                if (inputPanelContainer6 != null && (stackTopPanel = inputPanelContainer6.getStackTopPanel()) != null) {
                    stackTopPanel.p();
                }
                SoftKeyBoardHelper softKeyBoardHelper = hVar.f81201d;
                SoftKeyBoardHelper softKeyBoardHelper2 = softKeyBoardHelper;
                if (softKeyBoardHelper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSoftKeyBoardHelper");
                    softKeyBoardHelper2 = null;
                }
                softKeyBoardHelper2.stop();
                hVar.f81198a.g(false);
                InterfaceC8347a interfaceC8347aE = hVar.f81198a.e();
                com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8544e> eVar = hVar.f81204g;
                String strZ = null;
                if (eVar != null) {
                    ViewOnClickListenerC8544e viewOnClickListenerC8544e = (ViewOnClickListenerC8544e) eVar.a();
                    strZ = null;
                    if (viewOnClickListenerC8544e != null) {
                        strZ = viewOnClickListenerC8544e.z();
                    }
                }
                interfaceC8347aE.onInputWindowDismiss(strZ);
            }
        });
        if (this.f81199b == null || (panelContainer = this.f81198a.getPanelContainer()) == null) {
            return;
        }
        panelContainer.setOnInputPanelChangedListener(this.f81199b);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = UtilKt.findFragmentActivityOrNull(getContext());
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(fragmentActivityFindFragmentActivityOrNull);
        objectRef.element = windowSizeClassWindowSize;
        l(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlayerInputDialog$collectContentWidth$1(fragmentActivityFindFragmentActivityOrNull, objectRef, this, null), 3, (Object) null);
    }
}
