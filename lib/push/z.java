package com.bilibili.lib.push;

import c6.Q;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/z.class */
public final class z extends BiliApiDataCallback<DisturbInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f64266b;

    public z(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f64266b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(DisturbInfo disturbInfo) {
        DisturbInfo disturbInfo2 = disturbInfo;
        CancellableContinuationImpl cancellableContinuationImpl = this.f64266b;
        if (disturbInfo2 == null) {
            BPushLog.e("RedDotHelper", "isNotDisturbUser onDataSuccess data is null");
            cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
            return;
        }
        A.f64161f = disturbInfo2.isBadgeAiNoDisturb();
        A.f64162g = disturbInfo2.isBadgeDayVisitNoDisturb();
        boolean zIsHoldOutNoDistrub = disturbInfo2.isHoldOutNoDistrub();
        boolean z6 = A.f64161f;
        boolean z7 = A.f64162g;
        boolean zIsNotDisturb = disturbInfo2.isNotDisturb();
        StringBuilder sbA = Q.a("isNotDisturbUser onSuccess holdOut ", ", fifteen ", ", today ", zIsHoldOutNoDistrub, z6);
        sbA.append(z7);
        sbA.append(", isNotDisturb ");
        sbA.append(zIsNotDisturb);
        BPushLog.i("RedDotHelper", sbA.toString());
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(disturbInfo2));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BPushLog.e("RedDotHelper", "isNotDisturbUser onFailure msg = " + (th != null ? th.getMessage() : null));
        this.f64266b.resumeWith(Result.constructor-impl((Object) null));
    }
}
