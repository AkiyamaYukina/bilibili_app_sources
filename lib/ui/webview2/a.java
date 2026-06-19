package com.bilibili.lib.ui.webview2;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/a.class */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public WebViewClient f64980a;

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z6) {
        this.f64980a.doUpdateVisitedHistory(webView, str, z6);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f64980a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onLoadResource(WebView webView, String str) {
        this.f64980a.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f64980a.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public void onPageFinished(WebView webView, String str) {
        this.f64980a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f64980a.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f64980a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    @CallSuper
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f64980a.onReceivedError(webView, i7, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f64980a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f64980a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f64980a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f64980a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f64980a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final void onScaleChanged(WebView webView, float f7, float f8) {
        this.f64980a.onScaleChanged(webView, f7, f8);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    @CallSuper
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f64980a.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    @CallSuper
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.f64980a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f64980a.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    @CallSuper
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f64980a.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f64980a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    @CallSuper
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f64980a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @CallSuper
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f64980a.shouldOverrideUrlLoading(webView, str);
    }
}
