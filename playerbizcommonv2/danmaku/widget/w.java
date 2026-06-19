package com.bilibili.playerbizcommonv2.danmaku.widget;

import By0.C1465j;
import WI0.ViewOnClickListenerC3022x0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.api.BiliConfig;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceResponse;
import com.bilibili.app.provider.UtilKt;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.playerbizcommon.utils.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import yr0.C9081b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w.class */
@StabilityInferred(parameters = 0)
public final class w extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f81702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<Er0.a> f81703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public JsbProxy f81704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public BiliWebViewConfigHolderV2 f81706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BiliWebView f81708g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ProgressBar f81709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f81710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f81711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f81714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public FrameLayout f81715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommon.utils.l f81716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f81717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final e f81718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final f f81719s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f81722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f81723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f81724e;

        public a(@NotNull String str, boolean z6, boolean z7, boolean z8, @NotNull Function0<Unit> function0) {
            this.f81720a = str;
            this.f81721b = z6;
            this.f81722c = z7;
            this.f81723d = z8;
            this.f81724e = function0;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends BiliWebViewConfigHolderV2.BiliWebViewClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final c f81725b;

        public b(@NotNull BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2, @NotNull c cVar) {
            super(biliWebViewConfigHolderV2);
            this.f81725b = cVar;
        }

        public final boolean customOverrideUrlLoading(@Nullable BiliWebView biliWebView, @Nullable String str) {
            return false;
        }

        public final void onPageFinished(@Nullable BiliWebView biliWebView, @Nullable String str) {
            super.onPageFinished(biliWebView, str);
            this.f81725b.a();
        }

        public final void onReceivedError(@Nullable BiliWebView biliWebView, int i7, @Nullable String str, @Nullable String str2) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, i7, str, str2);
            this.f81725b.b(true);
        }

        public final void onReceivedError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f81725b.b(true);
        }

        public final void onReceivedHttpError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedHttpError(biliWebView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f81725b.b(true);
        }

        public final void onShowWarningWhenPageFinished(@Nullable Uri uri) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$c.class */
    public interface c {
        void a();

        void b(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$d.class */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f81726a;

        public d(w wVar) {
            this.f81726a = wVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            w wVar = this.f81726a;
            FrameLayout frameLayout = wVar.f81715o;
            wVar.f81717q = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
            FrameLayout frameLayout2 = this.f81726a.f81715o;
            if (frameLayout2 == null || (viewTreeObserver = frameLayout2.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$e.class */
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f81727a;

        public e(w wVar) {
            this.f81727a = wVar;
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.widget.w.c
        public final void a() {
            w wVar = this.f81727a;
            if (wVar.f81705d) {
                return;
            }
            BiliWebView biliWebView = wVar.f81708g;
            if (biliWebView != null) {
                biliWebView.setVisibility(0);
            }
            View view = wVar.h;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // com.bilibili.playerbizcommonv2.danmaku.widget.w.c
        public final void b(boolean z6) {
            w wVar = this.f81727a;
            wVar.f81705d = z6;
            if (z6) {
                BiliWebView biliWebView = wVar.f81708g;
                if (biliWebView != null) {
                    biliWebView.setVisibility(4);
                }
                View view = wVar.h;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            BiliWebView biliWebView2 = wVar.f81708g;
            if (biliWebView2 != null) {
                biliWebView2.setVisibility(4);
            }
            View view2 = wVar.h;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$f.class */
    public static final class f implements IJsBridgeBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f81728a;

        public f(w wVar) {
            this.f81728a = wVar;
        }

        public final boolean isDestroyed() {
            return !this.f81728a.isShowing();
        }

        public final void release() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/w$g.class */
    public static final class g implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f81729a;

        public g(w wVar) {
            this.f81729a = wVar;
        }

        @Override // com.bilibili.playerbizcommon.utils.l.a
        public final void keyBoardHide() {
            w.g(this.f81729a, 0);
        }

        @Override // com.bilibili.playerbizcommon.utils.l.a
        public final void keyBoardShow(int i7) {
            w.g(this.f81729a, i7);
        }
    }

    public w(@NotNull Context context) {
        super(context);
        this.f81703b = new PlayerServiceManager.Client<>();
        this.f81712l = true;
        this.f81714n = new Ea1.p(7);
        this.f81718r = new e(this);
        this.f81719s = new f(this);
    }

    public static final void g(w wVar, int i7) {
        BiliWebView biliWebView = wVar.f81708g;
        if (biliWebView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = biliWebView.getLayoutParams();
        int i8 = wVar.f81717q - i7;
        if (i8 <= 0 || i7 <= 0) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = i8;
        }
        if (biliWebView.isInLayout() || !biliWebView.isLayoutRequested()) {
            biliWebView.post(new com.bilibili.lib.fasthybrid.container.playlet.u(biliWebView, 1));
        } else {
            biliWebView.requestLayout();
        }
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f81702a = playerContainer;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        ViewTreeObserver viewTreeObserver;
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131496634, (ViewGroup) null);
        this.f81715o = (FrameLayout) viewInflate.findViewById(2131306968);
        this.f81708g = viewInflate.findViewById(2131311551);
        this.h = viewInflate.findViewById(2131301154);
        this.f81709i = (ProgressBar) viewInflate.findViewById(2131316565);
        this.f81710j = (TextView) viewInflate.findViewById(2131301181);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getText(2131841361));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, 2131103271)), 5, 9, 17);
        TextView textView = this.f81710j;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        TextView textView2 = this.f81710j;
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC3022x0(this, 1));
        }
        FrameLayout frameLayout = this.f81715o;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new d(this));
        }
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.changeOrientationDisableWhenShow(true);
        builder.persistent(false);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerWebFunctionWidget";
    }

    public final void h() {
        BiliWebView biliWebView;
        if (this.f81711k != null) {
            e eVar = this.f81718r;
            eVar.b(false);
            if (!this.f81707f && (biliWebView = this.f81708g) != null) {
                BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(biliWebView, this.f81709i);
                biliWebViewConfigHolderV2.configBiliWebSettings(Uri.EMPTY, BiliConfig.getBiliVersionCode(), false);
                biliWebViewConfigHolderV2.configBiliWebCookie();
                biliWebViewConfigHolderV2.enableWebContentDebug(false);
                this.f81706e = biliWebViewConfigHolderV2;
                if (this.f81713m) {
                    biliWebView.setBackgroundColor(0);
                }
                biliWebView.setVerticalScrollBarEnabled(this.f81712l);
                biliWebView.setWebChromeClient(new BiliWebViewConfigHolderV2.BiliWebChromeClient(biliWebViewConfigHolderV2));
                biliWebView.setWebViewClient(new b(biliWebViewConfigHolderV2, eVar));
                this.f81704c = biliWebView.getJsbProxy();
                BiliWebView biliWebView2 = this.f81708g;
                if (biliWebView2 != null) {
                    biliWebView2.registerGlobalCloseBrowserBehavior(new y(this));
                    biliWebView2.registerGlobalGetContainerInfoBehavior(new z(this));
                }
                JsbProxy jsbProxy = this.f81704c;
                if (jsbProxy != null) {
                    jsbProxy.registerBuiltin("unitedvideo", new JsBridgeCallHandlerFactoryV2(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.widget.u

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final w f81700a;

                        {
                            this.f81700a = this;
                        }

                        public final JsBridgeCallHandlerV2 create() {
                            w wVar = this.f81700a;
                            return new C9081b(wVar.getMContext(), wVar.f81719s, new v(wVar), new C1465j(wVar, 1));
                        }
                    });
                }
                this.f81707f = true;
            }
            BiliWebView biliWebView3 = this.f81708g;
            if (biliWebView3 != null) {
                biliWebView3.loadUrl(this.f81711k);
            }
        }
    }

    public final boolean onBackPressed() {
        BiliWebView biliWebView = this.f81708g;
        if (biliWebView == null || !biliWebView.canGoBack()) {
            return super.onBackPressed();
        }
        BiliWebView biliWebView2 = this.f81708g;
        if (biliWebView2 == null) {
            return true;
        }
        biliWebView2.goBack();
        return true;
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof a) {
            a aVar = (a) configuration;
            this.f81712l = aVar.f81721b;
            this.f81713m = aVar.f81722c;
            this.f81714n = aVar.f81724e;
            if (aVar.f81723d) {
                g gVar = new g(this);
                Activity activityFindActivityOrNull = UtilKt.findActivityOrNull(getMContext());
                if (activityFindActivityOrNull != null) {
                    com.bilibili.playerbizcommon.utils.l lVar = new com.bilibili.playerbizcommon.utils.l(activityFindActivityOrNull, gVar, false);
                    this.f81716p = lVar;
                    lVar.b(activityFindActivityOrNull.getWindow());
                }
            }
            String str = this.f81711k;
            String str2 = aVar.f81720a;
            if (TextUtils.equals(str, str2)) {
                return;
            }
            this.f81711k = str2;
            h();
        }
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        com.bilibili.playerbizcommon.utils.l lVar = this.f81716p;
        if (lVar != null) {
            lVar.c();
        }
        this.f81714n.invoke();
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(Er0.a.class);
        IPlayerContainer iPlayerContainer = this.f81702a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().unbindService(serviceDescriptorObtain, this.f81703b);
        BiliWebView biliWebView = this.f81708g;
        if (biliWebView != null) {
            biliWebView.loadUrl("");
        }
        JsbProxy jsbProxy = this.f81704c;
        if (jsbProxy != null) {
            jsbProxy.onDestroy();
        }
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = this.f81706e;
        if (biliWebViewConfigHolderV2 != null) {
            biliWebViewConfigHolderV2.destroyWebView();
        }
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(Er0.a.class);
        IPlayerContainer iPlayerContainer = this.f81702a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().bindService(serviceDescriptorObtain, this.f81703b);
    }
}
