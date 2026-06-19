package com.bilibili.ogv.review;

import android.net.Uri;
import com.bilibili.app.comm.IJsBridgeContextV2;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.provider.BaseAuthLoginBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/o.class */
public final class o extends BaseAuthLoginBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReviewWebViewActivity f72452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ReviewWebViewActivity reviewWebViewActivity, IJsBridgeContextV2 iJsBridgeContextV2) {
        super(iJsBridgeContextV2);
        this.f72452b = reviewWebViewActivity;
    }

    public final void loadNewUrl(Uri uri, boolean z6) {
        BiliWebView biliWebView = this.f72452b.f72182D;
        if (biliWebView != null) {
            biliWebView.loadUrl(uri.toString());
        }
    }
}
