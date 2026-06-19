package com.bilibili.upper.module.question.web;

import AX.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.IPerformanceReporter;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslError;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslErrorHandler;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceResponse;
import com.bilibili.lib.biliweb.b;
import com.bilibili.lib.jsbridge.legacy.WebBehavior;
import com.bilibili.lib.jsbridge.legacy.WebProxyV2;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.webview2.WebSuicide;
import com.bilibili.upper.module.question.web.a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/question/web/PlusQuestionActivity.class */
@StabilityInferred(parameters = 0)
public final class PlusQuestionActivity extends b implements IPerformanceReporter {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public String f113937Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public View f113938Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public a f113939a0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/question/web/PlusQuestionActivity$a.class */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlusQuestionActivity f113940a;

        public a(PlusQuestionActivity plusQuestionActivity) {
            this.f113940a = plusQuestionActivity;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual("finish_question_web_act_action", intent != null ? intent.getAction() : null)) {
                IPerformanceReporter iPerformanceReporter = this.f113940a;
                try {
                    Result.Companion companion = Result.Companion;
                    iPerformanceReporter.finish();
                    Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
        }
    }

    public final int Y6() {
        return 2131311551;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final int b7() {
        return 2131299392;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String e7() {
        Uri data = getIntent().getData();
        if (data != null) {
            return data.toString();
        }
        finish();
        return "";
    }

    public final void j7() {
        String str = this.f113937Y;
        A7((str == null || str.length() == 0) ? "live_location_half" : this.f113937Y, new a.C1233a(this));
        A7("live_ui_half", new a.C1233a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k7() {
        setContentView(2131500849);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadNewUrl(@Nullable Uri uri, boolean z6) {
        setIntent(new Intent("android.intent.action.VIEW", uri));
        if (uri != null) {
            ((b) this).G = uri.toString();
        }
        super.loadNewUrl(uri, z6);
    }

    @Nullable
    public final ProgressBar n7() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        h.a(this);
        WebSuicide.enter("PlusQuestionActivity");
        super.onCreate(bundle);
        this.f113939a0 = new a(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("finish_question_web_act_action");
        ContextCompat.registerReceiver(this, this.f113939a0, intentFilter, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        Object obj;
        WebSuicide.leave("PlusQuestionActivity");
        a aVar = this.f113939a0;
        if (aVar != null) {
            try {
                Result.Companion companion = Result.Companion;
                unregisterReceiver(aVar);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Result.box-impl(obj);
        }
        super.onDestroy();
    }

    public final void onReceivedError(@Nullable BiliWebView biliWebView, int i7, @Nullable String str, @Nullable String str2) {
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "【问卷调查H5界面 展示失败】页面加载错误  errorCode = ", " , description = ", str, " failingUrl = ");
        sbB.append(str2);
        Wz0.a.a(sbB.toString());
    }

    public final void onReceivedError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        Wz0.a.a("【问卷调查H5界面 展示失败】页面加载错误 webResourceRequest=" + webResourceRequest + "  webResourceError=" + webResourceError);
    }

    public final void onReceivedHttpError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        Wz0.a.a("【问卷调查H5界面 展示失败】Http连接错误  webResourceRequest=" + webResourceRequest + "  webResourceResponse=" + webResourceResponse);
    }

    public final void onReceivedSslError(@Nullable BiliWebView biliWebView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        super.onReceivedSslError(biliWebView, sslErrorHandler, sslError);
        Wz0.a.a("【问卷调查H5界面 展示失败】ssl连接错误 sslErrorHandler = " + sslErrorHandler + " sslError=" + sslError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q7() {
        super.q7();
        this.f113938Z = findViewById(2131298840);
        View innerView = g7().getInnerView();
        if (innerView != null) {
            innerView.setBackgroundColor(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s7() {
        ((b) this).U = false;
        ((b) this).T = false;
        Intent intent = getIntent();
        String string = null;
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("param_control") : null;
        if (bundleExtra != null) {
            string = bundleExtra.getString("intent_js_namespace");
        }
        this.f113937Y = string;
        super.s7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w7() {
        if (getIntent().getData() == null) {
            String stringExtra = getIntent().getStringExtra("url");
            if (!TextUtils.isEmpty(stringExtra)) {
                getIntent().setData(Uri.parse(stringExtra));
            }
        }
        super.w7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y7() {
        super.y7();
        i7().enableWebContentDebug(false);
        ((b) this).N = new WebProxyV2.Builder(this, g7()).of(Uri.parse(d7())).with(new WebBehavior(this)).build();
    }
}
