package com.bilibili.lib.sharewrapper;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.basic.IShareInterceptorV2;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/ShareHelperV2.class */
public class ShareHelperV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ShareHelper f64413a;

    public ShareHelperV2(Activity activity, ShareHelper.Callback callback) {
        f64413a.setContext(activity);
        f64413a.setCallback(callback);
    }

    public static void setShareHelperDelegate(ShareHelper shareHelper) {
        f64413a = shareHelper;
    }

    public void addShareInterceptor(IShareInterceptorV2 iShareInterceptorV2) {
        f64413a.addShareInterceptor(iShareInterceptorV2);
    }

    public void reset() {
        f64413a.reset();
    }

    public void setShareInterceptors(List<IShareInterceptorV2> list) {
        f64413a.setShareInterceptors(list);
    }

    public void shareTo(String str) {
        f64413a.shareTo(str);
    }

    public void shareTo(String str, Bundle bundle) {
        f64413a.shareTo(str, bundle);
    }

    public void showShareDialog() {
        f64413a.showShareDialog();
    }

    public void showShareDialog(DialogInterface.OnDismissListener onDismissListener) {
        f64413a.showShareDialog(onDismissListener);
    }

    public void showShareDialog(String str) {
        f64413a.showShareDialog(str);
    }

    public void showShareDialog(String str, DialogInterface.OnDismissListener onDismissListener) {
        f64413a.showShareDialog(str, onDismissListener);
    }

    public void showShareDialog(String str, ISharePlatformSelector.Style style, List<SharePlatform> list) {
        f64413a.showShareDialog(str, style, list);
    }

    public void showShareDialog(String str, List<SharePlatform> list) {
        f64413a.showShareDialog(str, list);
    }

    public void showShareDialog(List<SharePlatform> list) {
        f64413a.showShareDialog(list);
    }
}
