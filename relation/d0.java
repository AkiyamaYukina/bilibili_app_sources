package com.bilibili.relation;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.relation.utils.FollowFlowHelper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/d0.class */
public final class d0 extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Context f86060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FollowFlowHelper.FollowFlowCallback f86062d;

    public d0(@Nullable Context context, boolean z6, @Nullable FollowFlowHelper.FollowFlowCallback followFlowCallback) {
        this.f86060b = context;
        this.f86061c = z6;
        this.f86062d = followFlowCallback;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return this.f86060b == null;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Void r52) {
        Context context = this.f86060b;
        boolean z6 = this.f86061c;
        ToastHelper.showToastShort(context, z6 ? 2131847622 : 2131847625);
        FollowFlowHelper.FollowFlowCallback followFlowCallback = this.f86062d;
        if (followFlowCallback != null) {
            followFlowCallback.onSpecialStatusChange(!z6);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(@Nullable Throwable th) {
        if (th instanceof BiliApiException) {
            ToastHelper.showToastShort(this.f86060b, ((BiliApiException) th).getMessage());
        } else if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            ToastHelper.showToastShort(this.f86060b, 2131841734);
        } else {
            ToastHelper.showToastShort(this.f86060b, 2131847652);
        }
    }
}
