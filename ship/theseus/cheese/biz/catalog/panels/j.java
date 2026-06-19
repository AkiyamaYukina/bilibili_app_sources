package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import android.view.View;
import androidx.activity.ComponentActivity;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.IBiliHitTestResult;
import com.bilibili.lib.biliweb.share.WebShare;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/j.class */
public final /* synthetic */ class j implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliWebView f89225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentActivity f89226b;

    public /* synthetic */ j(BiliWebView biliWebView, ComponentActivity componentActivity) {
        this.f89225a = biliWebView;
        this.f89226b = componentActivity;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int hitTestResultType;
        BiliWebView biliWebView = this.f89225a;
        ComponentActivity componentActivity = this.f89226b;
        IBiliHitTestResult biliHitTestResult = biliWebView.getBiliHitTestResult();
        boolean z6 = false;
        if (biliHitTestResult != null && ((hitTestResultType = biliHitTestResult.getHitTestResultType()) == 5 || hitTestResultType == 8)) {
            String title = biliWebView.getTitle();
            String url = biliWebView.getUrl();
            String hitTestResultExtra = biliHitTestResult.getHitTestResultExtra();
            if (hitTestResultExtra.length() != 0 && StringsKt.Z(hitTestResultExtra, "http")) {
                WebShare.showImageShareMenu$default(WebShare.Companion.getINSTANCE(), componentActivity, title, url, hitTestResultExtra, "public.webview.0.0.pv", (String) null, 32, (Object) null);
                z6 = true;
            }
        }
        return z6;
    }
}
