package com.bilibili.relation;

import android.app.Activity;
import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.relation.api.RelationApiCallback;
import com.bilibili.relation.api.ResponseChangeRelation;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/U.class */
public final class U implements RelationApiCallback<ResponseChangeRelation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f85977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c70.e f85978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.biligame.ui.minigame.more.g f85979d;

    public U(long j7, Context context, c70.e eVar, com.bilibili.biligame.ui.minigame.more.g gVar) {
        this.f85976a = j7;
        this.f85977b = context;
        this.f85978c = eVar;
        this.f85979d = gVar;
    }

    @Override // com.bilibili.relation.api.RelationApiCallback
    public final boolean isCancel() {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f85977b);
        boolean z6 = false;
        if (activityFindActivityOrNull != null) {
            z6 = false;
            if (activityFindActivityOrNull.isFinishing()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.relation.api.RelationApiCallback
    public final void onDataSuccess(ResponseChangeRelation responseChangeRelation) {
        FollowStateManager.Companion.getInstance().notify(this.f85976a, false, null);
        ToastHelper.showToastShort(this.f85977b, 2131857281);
        this.f85978c.invoke();
    }

    @Override // com.bilibili.relation.api.RelationApiCallback
    public final void onError(Throwable th) {
        ToastHelper.showToastShort(this.f85977b, th instanceof BiliApiException ? ((BiliApiException) th).getMessage() : !ConnectivityMonitor.getInstance().isNetworkActive() ? this.f85977b.getString(2131847652) : null);
        this.f85979d.invoke();
    }
}
