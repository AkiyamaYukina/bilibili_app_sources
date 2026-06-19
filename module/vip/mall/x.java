package com.bilibili.module.vip.mall;

import android.content.Context;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.module.vip.mall.VipPurchaseException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/x.class */
public final class x<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f66299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f66301c;

    public x(CancellableContinuationImpl cancellableContinuationImpl, String str, Context context) {
        this.f66299a = cancellableContinuationImpl;
        this.f66300b = str;
        this.f66301c = context;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        VipUserInfo vipInfo;
        if (task == null || !task.isCompleted()) {
            return null;
        }
        AccountInfo accountInfo = (AccountInfo) task.getResult();
        long endTime = (accountInfo == null || (vipInfo = accountInfo.getVipInfo()) == null) ? 0L : vipInfo.getEndTime();
        CancellableContinuationImpl cancellableContinuationImpl = this.f66299a;
        if (endTime > 0) {
            Result.Companion companion = Result.Companion;
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(Unit.INSTANCE)));
            return null;
        }
        Result.Companion companion2 = Result.Companion;
        B b7 = B.f66198a;
        Context context = this.f66301c;
        String str = this.f66300b;
        com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new VipPurchaseException.AccountVipTimeNotUpdated(str, B.f(context, str))))));
        return null;
    }
}
