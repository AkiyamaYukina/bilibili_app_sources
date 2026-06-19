package com.bilibili.ogv.review;

import android.net.Uri;
import com.bilibili.app.comm.IJsBridgeContextV2;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.provider.BaseAbilityOpenSchemeBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/n.class */
public final class n extends BaseAbilityOpenSchemeBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReviewWebViewActivity f72451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ReviewWebViewActivity reviewWebViewActivity, IJsBridgeContextV2 iJsBridgeContextV2) {
        super(iJsBridgeContextV2);
        this.f72451b = reviewWebViewActivity;
    }

    public final void loadNewUrl(Uri uri, boolean z6) {
        BiliWebView biliWebView = this.f72451b.f72182D;
        if (biliWebView != null) {
            biliWebView.loadUrl(uri.toString());
        }
    }
}
