package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import com.bilibili.relation.utils.FollowFlowHelper;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/L.class */
public final class L extends FollowFlowHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Staff f101784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaffsService f101785b;

    public L(Staff staff, StaffsService staffsService) {
        this.f101784a = staff;
        this.f101785b = staffsService;
    }

    public final void a(boolean z6) {
        this.f101784a.f101787b = z6 ? 1 : 0;
        StaffsService staffsService = this.f101785b;
        t tVar = staffsService.f101856z;
        if (tVar != null) {
            tVar.a();
        }
        B b7 = staffsService.f101826A;
        if (b7 != null) {
            b7.a();
        }
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isCancel() {
        return !CoroutineScopeKt.isActive(this.f101785b.f101833b);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        Context context = this.f101785b.f101832a;
        return sh1.o.b(context, context.getString(2131846702), (String) null, 28, (String) null);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final void onFollowChange(boolean z6) {
        a(z6);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowError(Throwable th) {
        if (!sh1.h.a(th)) {
            return false;
        }
        sh1.o.e(this.f101785b.f101832a, "StaffsService_onFollowError");
        return true;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowSuccess() {
        a(true);
        return super.onFollowSuccess();
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowSuccess() {
        a(false);
        return super.onUnFollowSuccess();
    }
}
