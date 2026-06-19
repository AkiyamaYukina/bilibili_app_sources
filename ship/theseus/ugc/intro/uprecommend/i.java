package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import HG0.A;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.ship.theseus.united.utils.q;
import kotlinx.coroutines.CoroutineScopeKt;
import sh1.o;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/i.class */
public final class i extends FollowFlowHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecommendUpService f97834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f97835b;

    public i(RecommendUpService recommendUpService, A a7) {
        this.f97834a = recommendUpService;
        this.f97835b = a7;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isCancel() {
        return !CoroutineScopeKt.isActive(this.f97834a.f97801a);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        return o.b(FoundationAlias.getFapp().getApplicationContext(), (String) null, (String) null, 30, (String) null);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowError(Throwable th) {
        if (!sh1.h.a(th)) {
            return false;
        }
        o.e(FoundationAlias.getFapp().getApplicationContext(), "PartyRecommendSection_getFollowButtonConfig");
        return true;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final void onFollowStart() {
        if (this.f97834a.f97802b.a() <= 0) {
            q.b(2131841476);
        }
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowSuccess() {
        this.f97835b.invoke(1);
        return super.onFollowSuccess();
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowSuccess() {
        this.f97835b.invoke(0);
        return super.onUnFollowSuccess();
    }
}
