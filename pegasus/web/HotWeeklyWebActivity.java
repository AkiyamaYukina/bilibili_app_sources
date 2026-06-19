package com.bilibili.pegasus.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import cb0.a;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.provider.IUiHideNavigationBehavior;
import com.bilibili.app.provider.IUiSetStatusBarModeBehavior;
import com.bilibili.app.provider.IUiSetStatusBarVisibilityBehavior;
import com.bilibili.app.provider.IUiSetTitleBehavior;
import com.bilibili.app.provider.IUiShowNavigationBehavior;
import com.bilibili.lib.biliweb.WebFragment;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.util.StatusBarCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/web/HotWeeklyWebActivity.class */
public class HotWeeklyWebActivity extends com.bilibili.lib.biliweb.c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/web/HotWeeklyWebActivity$a.class */
    public final class a implements IUiSetStatusBarModeBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotWeeklyWebActivity f79098a;

        public a(HotWeeklyWebActivity hotWeeklyWebActivity) {
            this.f79098a = hotWeeklyWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f79098a.isDestroyed();
        }

        public final void setStatusBarMode(int i7) {
            com.bilibili.lib.biliweb.c cVar = this.f79098a;
            if (i7 == 0) {
                StatusBarCompat.setStatusBarDarkMode((Activity) cVar);
            } else if (i7 == 1) {
                StatusBarCompat.setStatusBarLightMode((Activity) cVar);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/web/HotWeeklyWebActivity$b.class */
    public final class b implements IUiSetStatusBarVisibilityBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotWeeklyWebActivity f79099a;

        public b(HotWeeklyWebActivity hotWeeklyWebActivity) {
            this.f79099a = hotWeeklyWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f79099a.isDestroyed();
        }

        public final void setStatusBarVisibility(boolean z6) {
            this.f79099a.T6(z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/web/HotWeeklyWebActivity$c.class */
    public final class c implements IUiHideNavigationBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotWeeklyWebActivity f79100a;

        public c(HotWeeklyWebActivity hotWeeklyWebActivity) {
            this.f79100a = hotWeeklyWebActivity;
        }

        public final void hideNavigation() {
            this.f79100a.R6();
        }

        public final boolean isDestroyed() {
            return this.f79100a.isDestroyed();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/web/HotWeeklyWebActivity$d.class */
    public final class d implements IUiShowNavigationBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotWeeklyWebActivity f79101a;

        public d(HotWeeklyWebActivity hotWeeklyWebActivity) {
            this.f79101a = hotWeeklyWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f79101a.isDestroyed();
        }

        public final void showNavigation() {
            this.f79101a.getClass();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/web/HotWeeklyWebActivity$e.class */
    public final class e implements IUiSetTitleBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HotWeeklyWebActivity f79102a;

        public e(HotWeeklyWebActivity hotWeeklyWebActivity) {
            this.f79102a = hotWeeklyWebActivity;
        }

        public final boolean isDestroyed() {
            return this.f79102a.isDestroyed();
        }

        public final void setTitle(@NonNull String str) {
            com.bilibili.lib.biliweb.c cVar = this.f79102a;
            if (cVar.getSupportActionBar() != null) {
                cVar.getSupportActionBar().setTitle(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String U6() {
        Intent intent = getIntent();
        return (intent == null || intent.getData() == null) ? "https://www.bilibili.com/h5/weekly-recommend" : intent.getData().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V6() {
        setContentView(2131493739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Xp0.a aVar = new Xp0.a(this);
        WebFragment webFragment = ((com.bilibili.lib.biliweb.c) this).D;
        if (webFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
            webFragment = null;
        }
        webFragment.registerBuiltInJsBridge("listhot", aVar);
        a.a aVar2 = new a.a(this);
        WebFragment webFragment2 = ((com.bilibili.lib.biliweb.c) this).D;
        if (webFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
            webFragment2 = null;
        }
        webFragment2.registerBuiltInJsBridge("main", aVar2);
    }

    public final void onReceivedTitle(@Nullable BiliWebView biliWebView, @Nullable String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super/*com.bilibili.lib.ui.BaseAppCompatActivity*/.onStart();
        BiliWebView webView = ((com.bilibili.lib.biliweb.c) this).D.getWebView();
        if (webView == null) {
            return;
        }
        webView.registerUiSetStatusBarModeBehavior(new a(this));
        webView.registerUiSetStatusBarVisibilityBehavior(new b(this));
        webView.registerUiHideNavigationBehavior(new c(this));
        webView.registerUiShowNavigationBehavior(new d(this));
        webView.registerUiSetTitleBehavior(new e(this));
    }
}
