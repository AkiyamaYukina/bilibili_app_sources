package com.bilibili.lib.ui.webview2;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/BaseWebView$WebChromeClientWrapper.class */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BaseWebView$WebChromeClientWrapper extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebChromeClient f64955a = new WebChromeClient();

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public Bitmap getDefaultVideoPoster() {
        return this.f64955a.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public View getVideoLoadingProgressView() {
        return this.f64955a.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        this.f64955a.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onCloseWindow(WebView webView) {
        this.f64955a.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onConsoleMessage(String str, int i7, String str2) {
        this.f64955a.onConsoleMessage(str, i7, str2);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.f64955a.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
        return this.f64955a.onCreateWindow(webView, z6, z7, message);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    @CallSuper
    public void onExceededDatabaseQuota(String str, String str2, long j7, long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        this.f64955a.onExceededDatabaseQuota(str, str2, j7, j8, j9, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onGeolocationPermissionsHidePrompt() {
        this.f64955a.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.f64955a.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onHideCustomView() {
        this.f64955a.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f64955a.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f64955a.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.f64955a.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.f64955a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onJsTimeout() {
        return this.f64955a.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f64955a.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.f64955a.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onProgressChanged(WebView webView, int i7) {
        this.f64955a.onProgressChanged(webView, i7);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.f64955a.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onReceivedTitle(WebView webView, String str) {
        this.f64955a.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z6) {
        this.f64955a.onReceivedTouchIconUrl(webView, str, z6);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onRequestFocus(WebView webView) {
        this.f64955a.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f64955a.onShowCustomView(view, i7, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f64955a.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @CallSuper
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return this.f64955a.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        WebChromeClient webChromeClient2 = this.f64955a;
        if (webChromeClient2 instanceof BaseWebView$WebChromeClientWrapper) {
            ((BaseWebView$WebChromeClientWrapper) webChromeClient2).setWebChromeClient(webChromeClient);
        } else {
            this.f64955a = webChromeClient;
        }
    }
}
