package com.bilibili.lib.sharewrapper.Bshare;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.basic.IShareInterceptorV2;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/c.class */
public final class c implements ShareHelper {
    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void addShareInterceptor(@Nullable IShareInterceptorV2 iShareInterceptorV2) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void reset() {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void setCallback(@Nullable ShareHelper.Callback callback) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void setContext(@Nullable Activity activity) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void setShareInterceptors(@Nullable List<IShareInterceptorV2> list) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(@Nullable SharePlatform sharePlatform) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(@Nullable SharePlatform sharePlatform, @Nullable Bundle bundle) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(@Nullable String str) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(@Nullable String str, @Nullable Bundle bundle) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog() {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable ISharePlatformSelector.Style style, @Nullable List<SharePlatform> list) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable ISharePlatformSelector.Style style, @Nullable List<SharePlatform> list, @Nullable DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable String str) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable String str, @Nullable DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable String str, @Nullable ISharePlatformSelector.Style style, @Nullable List<SharePlatform> list) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable String str, @Nullable ISharePlatformSelector.Style style, @Nullable List<SharePlatform> list, @Nullable DialogInterface.OnDismissListener onDismissListener) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable String str, @Nullable List<SharePlatform> list) {
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(@Nullable List<SharePlatform> list) {
    }
}
