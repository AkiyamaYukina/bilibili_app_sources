package com.bilibili.lib.sharewrapper;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bilibili.lib.sharewrapper.basic.IShareInterceptorV2;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/ShareHelper.class */
public interface ShareHelper {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/ShareHelper$Callback.class */
    public interface Callback {
        @Nullable
        Bundle getShareContent(String str);

        default void isFirstShare(Boolean bool) {
        }

        void onShareCancel(String str, ShareResult shareResult);

        void onShareFail(String str, ShareResult shareResult);

        void onShareSuccess(String str, ShareResult shareResult);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/ShareHelper$SimpleCallback.class */
    public static abstract class SimpleCallback implements Callback {
        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public void isFirstShare(Boolean bool) {
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public void onShareCancel(String str, ShareResult shareResult) {
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public void onShareFail(String str, ShareResult shareResult) {
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public void onShareSuccess(String str, ShareResult shareResult) {
        }
    }

    void addShareInterceptor(IShareInterceptorV2 iShareInterceptorV2);

    void reset();

    void setCallback(Callback callback);

    void setContext(Activity activity);

    void setShareInterceptors(List<IShareInterceptorV2> list);

    void shareTo(SharePlatform sharePlatform);

    void shareTo(SharePlatform sharePlatform, Bundle bundle);

    void shareTo(String str);

    void shareTo(String str, Bundle bundle);

    void showShareDialog();

    void showShareDialog(DialogInterface.OnDismissListener onDismissListener);

    void showShareDialog(ISharePlatformSelector.Style style, List<SharePlatform> list);

    void showShareDialog(ISharePlatformSelector.Style style, List<SharePlatform> list, @Nullable DialogInterface.OnDismissListener onDismissListener);

    void showShareDialog(String str);

    void showShareDialog(String str, DialogInterface.OnDismissListener onDismissListener);

    void showShareDialog(String str, ISharePlatformSelector.Style style, List<SharePlatform> list);

    void showShareDialog(String str, ISharePlatformSelector.Style style, List<SharePlatform> list, @Nullable DialogInterface.OnDismissListener onDismissListener);

    void showShareDialog(String str, List<SharePlatform> list);

    void showShareDialog(List<SharePlatform> list);
}
