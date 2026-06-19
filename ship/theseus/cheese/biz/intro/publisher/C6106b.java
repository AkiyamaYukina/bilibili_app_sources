package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.C6107c;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/b.class */
public final class C6106b extends FollowFlowHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6107c.a f89848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f89849b;

    public C6106b(C6107c.a aVar, D d7) {
        this.f89848a = aVar;
        this.f89849b = d7;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isCancel() {
        return this.f89848a.itemView.getContext() == null;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        boolean z6;
        if (BiliAccounts.get(this.f89848a.f89851a.f119414a.getContext()).isLogin()) {
            z6 = true;
        } else {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowError(Throwable th) {
        C6107c.a.p0(this.f89848a.f89851a, false);
        return super.onFollowError(th);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final void onFollowStart() {
        C6107c.a.p0(this.f89848a.f89851a, true);
        super.onFollowStart();
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowSuccess() {
        D d7 = this.f89849b;
        if (d7 != null) {
            d7.f89836g = true;
        }
        return super.onFollowSuccess();
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowError(Throwable th) {
        C6107c.a.p0(this.f89848a.f89851a, true);
        return super.onUnFollowError(th);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final void onUnFollowStart() {
        C6107c.a.p0(this.f89848a.f89851a, false);
        super.onUnFollowStart();
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowSuccess() {
        D d7 = this.f89849b;
        if (d7 != null) {
            d7.f89836g = false;
        }
        return super.onUnFollowSuccess();
    }
}
