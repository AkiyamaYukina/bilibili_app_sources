package com.bilibili.pegasus.holders;

import android.app.Application;
import androidx.fragment.app.Fragment;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.relation.utils.FollowFlowHelper;
import kotlin.Lazy;
import pp0.C8340D;
import qp0.C8476b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/l1.class */
public final class l1 extends FollowFlowHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f77892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f77893b;

    public l1(k1 k1Var, long j7) {
        this.f77892a = k1Var;
        this.f77893b = j7;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isCancel() {
        Fragment fragment = this.f77892a.getFragment();
        boolean z6 = (fragment != null ? fragment.p3() : null) == null;
        j4.t.a("isCancel, cancel = ", "[Pegasus]UpSmallCoverCard", z6);
        return z6;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        boolean zB = o.b();
        j4.t.a("isLogin, login = ", "[Pegasus]UpSmallCoverCard", zB);
        if (!zB) {
            Application application = BiliContext.application();
            Lazy lazy = C8476b.f126257a;
            BLRouter.routeTo(new RouteRequest.Builder("activity://main/login/").build(), application);
        }
        return zB;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowError(Throwable th) {
        BLog.i("[Pegasus]UpSmallCoverCard", "onInterceptBtnClick, onFollowError");
        k1.y0(this.f77892a, false);
        return super.onFollowError(th);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final void onFollowStart() {
        BLog.i("[Pegasus]UpSmallCoverCard", "onInterceptBtnClick, onFollowStart");
        k1 k1Var = this.f77892a;
        k1.y0(k1Var, true);
        Neurons.reportClick(false, "tm.recommend.main-card.0.click", C8340D.c((BasePegasusData) k1Var.getBindData(), "up_follow", null, null, String.valueOf(this.f77893b), null, 22));
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onInterceptBtnClick(boolean z6) {
        j4.t.a("onInterceptBtnClick, isFollow = ", "[Pegasus]UpSmallCoverCard", z6);
        return super.onInterceptBtnClick(z6);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowError(Throwable th) {
        BLog.i("[Pegasus]UpSmallCoverCard", "onInterceptBtnClick, onFollowError");
        k1.y0(this.f77892a, true);
        return super.onUnFollowError(th);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final void onUnFollowStart() {
        BLog.i("[Pegasus]UpSmallCoverCard", "onInterceptBtnClick, onUnFollowStart");
        k1 k1Var = this.f77892a;
        k1.y0(k1Var, false);
        Neurons.reportClick(false, "tm.recommend.main-card.0.click", C8340D.c((BasePegasusData) k1Var.getBindData(), "up_follow", null, null, String.valueOf(this.f77893b), null, 22));
    }
}
