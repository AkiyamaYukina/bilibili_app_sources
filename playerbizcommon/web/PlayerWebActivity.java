package com.bilibili.playerbizcommon.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslError;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslErrorHandler;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceResponse;
import com.bilibili.app.provider.IUiHideNavigationBehavior;
import com.bilibili.app.provider.IUiSetStatusBarModeBehavior;
import com.bilibili.app.provider.IUiSetStatusBarVisibilityBehavior;
import com.bilibili.app.provider.IUiSetTitleBehavior;
import com.bilibili.app.provider.IUiShowNavigationBehavior;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import com.bilibili.biligame.cloudgame.v2.BCGPlayerImpl;
import com.bilibili.biligame.cloudgame.v2.ui.fragment.BCGDialogFragment;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.lib.ui.webview2.WebSuicide;
import com.bilibili.playerbizcommon.iconfont.PlayerIconFontView;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerWindowManager;
import com.bilibili.playerbizcommon.web.PlayerWebActivity;
import com.bilibili.upper.feat.gamefactory.stylefragment.match.CloudMatchMaterialStyleContainerFragment;
import ep.e;
import ep.g;
import ep.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/web/PlayerWebActivity.class */
public final class PlayerWebActivity extends com.bilibili.lib.biliweb.b {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f80436Z = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public PlayerIconFontView f80437Y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/web/PlayerWebActivity$a.class */
    public static final class a implements IUiHideNavigationBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerWebActivity f80438a;

        public a(PlayerWebActivity playerWebActivity) {
            this.f80438a = playerWebActivity;
        }

        public final void hideNavigation() {
            this.f80438a.R6();
        }

        public final boolean isDestroyed() {
            return this.f80438a.isFinishing();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/web/PlayerWebActivity$b.class */
    public static final class b implements IUiShowNavigationBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerWebActivity f80439a;

        public b(PlayerWebActivity playerWebActivity) {
            this.f80439a = playerWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f80439a.isFinishing();
        }

        public final void showNavigation() {
            this.f80439a.C7();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/web/PlayerWebActivity$c.class */
    public static final class c implements IUiSetStatusBarVisibilityBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerWebActivity f80440a;

        public c(PlayerWebActivity playerWebActivity) {
            this.f80440a = playerWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f80440a.isFinishing();
        }

        public final void setStatusBarVisibility(boolean z6) {
            this.f80440a.T6(z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/web/PlayerWebActivity$d.class */
    public static final class d implements IUiSetStatusBarModeBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerWebActivity f80441a;

        public d(PlayerWebActivity playerWebActivity) {
            this.f80441a = playerWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f80441a.isFinishing();
        }

        public final void setStatusBarMode(int i7) {
            com.bilibili.lib.biliweb.b bVar = this.f80441a;
            if (i7 == 0) {
                StatusBarCompat.setStatusBarDarkMode((Activity) bVar);
            } else {
                if (i7 != 1) {
                    return;
                }
                StatusBarCompat.setStatusBarLightMode((Activity) bVar);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/web/PlayerWebActivity$e.class */
    public static final class e implements IUiSetTitleBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerWebActivity f80442a;

        public e(PlayerWebActivity playerWebActivity) {
            this.f80442a = playerWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f80442a.isFinishing();
        }

        public final void setTitle(String str) {
            this.f80442a.getClass();
        }
    }

    public final int Y6() {
        return 2131309072;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final int b7() {
        return 2131309071;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String e7() {
        Uri data = getIntent().getData();
        String string = data != null ? data.toString() : null;
        if (string == null || string.length() == 0 || (!StringsKt.startsWith(string, "http://", true) && !StringsKt.startsWith(string, "https://", true))) {
            finish();
        }
        return String.valueOf(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        IMiniPlayerWindowManager iMiniPlayerWindowManager = (IMiniPlayerWindowManager) BLRouter.get$default(BLRouter.INSTANCE, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);
        if (iMiniPlayerWindowManager != null) {
            iMiniPlayerWindowManager.setIgnorePauseEnable(true);
        }
        super/*android.app.Activity*/.finish();
    }

    @Nullable
    public final ActionBar getSupportActionBar() {
        return null;
    }

    public final void j7() {
        BiliWebView biliWebViewG7 = g7();
        biliWebViewG7.registerUiHideNavigationBehavior(new a(this));
        biliWebViewG7.registerUiShowNavigationBehavior(new b(this));
        biliWebViewG7.registerUiSetStatusBarVisibilityBehavior(new c(this));
        biliWebViewG7.registerUiSetStatusBarModeBehavior(new d(this));
        biliWebViewG7.registerUiSetTitleBehavior(new e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k7() {
        setContentView(2131492940);
        PlayerIconFontView playerIconFontView = (PlayerIconFontView) findViewById(2131309070);
        this.f80437Y = playerIconFontView;
        if (playerIconFontView != null) {
            final int i7 = 0;
            playerIconFontView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: ar0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f54207a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f54208b;

                {
                    this.f54207a = i7;
                    this.f54208b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int iA;
                    switch (this.f54207a) {
                        case 0:
                            PlayerWebActivity playerWebActivity = (PlayerWebActivity) this.f54208b;
                            int i8 = PlayerWebActivity.f80436Z;
                            playerWebActivity.finish();
                            break;
                        case 1:
                            ((CloudMatchMaterialStyleContainerFragment) this.f54208b).kf();
                            break;
                        default:
                            e eVar = (e) this.f54208b;
                            int i9 = e.k;
                            eVar.getClass();
                            boolean z6 = g.a;
                            Context context = eVar.getContext();
                            if (g.e < 0) {
                                Qo.a aVar = g.d;
                                if (aVar != null) {
                                    aVar.c(false);
                                }
                                g.c();
                                break;
                            } else {
                                AppCompatActivity appCompatActivity = (AppCompatActivity) (context != null ? ContextUtilKt.findTypedActivityOrNull(context, AppCompatActivity.class) : null);
                                if (appCompatActivity != null && (iA = g.a(appCompatActivity)) >= 0) {
                                    WeakReference weakReference = (WeakReference) ((ArrayList) g.i).get(iA);
                                    Qo.a aVar2 = g.d;
                                    if (aVar2 != null) {
                                        BCGPlayerImpl bCGPlayerImpl = (BCGPlayerImpl) weakReference.get();
                                        BCGDialogFragment bCGDialogFragmentR = null;
                                        if (bCGPlayerImpl != null) {
                                            Oo.e eVar2 = bCGPlayerImpl.v;
                                            bCGDialogFragmentR = null;
                                            if (eVar2 != null) {
                                                WeakReference weakReference2 = bCGPlayerImpl.c;
                                                bCGDialogFragmentR = eVar2.r(weakReference2 != null ? (AppCompatActivity) weakReference2.get() : null, 12, bCGPlayerImpl.z, aVar2, bCGPlayerImpl.l, (BCGToken) null);
                                            }
                                        }
                                        if (bCGDialogFragmentR != null) {
                                            bCGDialogFragmentR.x = new h(bCGDialogFragmentR);
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
    }

    @Nullable
    public final ProgressBar n7() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.app.Activity*/.onAttachedToWindow();
        if (NotchCompat.hasDisplayCutout(getWindow())) {
            NotchCompat.immersiveDisplayCutout(getWindow());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        WebSuicide.enter("PlayerWebActivity");
        new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView()).hide(WindowInsetsCompat.Type.statusBars());
        super.onCreate(bundle);
        if (getRequestedOrientation() != 1 && Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        View innerView = g7().getInnerView();
        if (innerView != null) {
            innerView.setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.transparent, null));
        }
    }

    public final void onDestroy() {
        IMiniPlayerWindowManager iMiniPlayerWindowManager = (IMiniPlayerWindowManager) BLRouter.get$default(BLRouter.INSTANCE, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);
        if (iMiniPlayerWindowManager != null) {
            iMiniPlayerWindowManager.setIgnorePauseEnable(true);
        }
        super.onDestroy();
        WebSuicide.leave("PlayerWebActivity");
    }

    public final void onPageFinished(@Nullable BiliWebView biliWebView, @Nullable String str) {
        PlayerIconFontView playerIconFontView = this.f80437Y;
        if (playerIconFontView != null) {
            playerIconFontView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        IMiniPlayerWindowManager iMiniPlayerWindowManager = (IMiniPlayerWindowManager) BLRouter.get$default(BLRouter.INSTANCE, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);
        if (iMiniPlayerWindowManager != null) {
            iMiniPlayerWindowManager.setIgnorePauseEnable(true);
        }
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
    }

    public final void onReceivedError(@Nullable BiliWebView biliWebView, int i7, @Nullable String str, @Nullable String str2) {
        BLog.e("PlayerWebActivity", "page finished cause receive error:" + i7);
        finish();
    }

    public final void onReceivedError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        BLog.e("PlayerWebActivity", "page finished cause receive error:" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null));
        finish();
    }

    public final void onReceivedHttpError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        BLog.e("PlayerWebActivity", "page finished cause receive http error:" + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
        finish();
    }

    public final void onReceivedSslError(@Nullable BiliWebView biliWebView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        super.onReceivedSslError(biliWebView, sslErrorHandler, sslError);
        BLog.e("PlayerWebActivity", "page finished cause receive ssl error");
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSupportActionBar(@Nullable Toolbar toolbar) {
        super/*androidx.appcompat.app.AppCompatActivity*/.setSupportActionBar(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void tintSystemBar() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1280);
        getWindow().setStatusBarColor(0);
    }

    public final void v7() {
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(g7(), ((com.bilibili.lib.biliweb.b) this).M);
        biliWebViewConfigHolderV2.configBiliWebSettings(Uri.parse(d7()), Foundation.Companion.instance().getApps().getVersionCode(), false);
        biliWebViewConfigHolderV2.configBiliWebCookie();
        ((com.bilibili.lib.biliweb.b) this).F = biliWebViewConfigHolderV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w7() {
        super.w7();
        if (getIntent().getData() != null) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        getIntent().setData(Uri.parse(stringExtra));
    }
}
