package com.bilibili.paycoin;

import android.app.Activity;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.droid.ActivityUtils;
import com.bilibili.lib.accountinfo.model.AccountInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/z.class */
public final class z<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayCoinsView f74826a;

    public z(PayCoinsView payCoinsView) {
        this.f74826a = payCoinsView;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        if (!task.isCompleted() || task.getResult() == null) {
            return null;
        }
        AccountInfo accountInfo = (AccountInfo) task.getResult();
        PayCoinsView payCoinsView = this.f74826a;
        Activity wrapperActivity = ActivityUtils.getWrapperActivity(payCoinsView.getContext());
        if (wrapperActivity == null || wrapperActivity.isFinishing() || !payCoinsView.isShowing() || accountInfo.getCoins() == payCoinsView.f74715C) {
            return null;
        }
        payCoinsView.q(accountInfo);
        return null;
    }
}
