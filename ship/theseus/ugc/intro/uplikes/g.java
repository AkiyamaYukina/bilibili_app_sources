package com.bilibili.ship.theseus.ugc.intro.uplikes;

import android.content.Context;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent;
import kotlinx.coroutines.flow.MutableSharedFlow;
import sh1.o;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/g.class */
public final class g extends FollowFlowHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcUpLikesPanelComponent f97730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final User f97732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f97733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UgcUpLikesPanelComponent.c f97734e;

    public g(UgcUpLikesPanelComponent ugcUpLikesPanelComponent, int i7, User user, Context context, UgcUpLikesPanelComponent.c cVar) {
        this.f97730a = ugcUpLikesPanelComponent;
        this.f97731b = i7;
        this.f97732c = user;
        this.f97733d = context;
        this.f97734e = cVar;
    }

    public final void a(boolean z6) {
        MutableSharedFlow<UgcUpLikesPanelComponent.a> mutableSharedFlow = this.f97730a.f97644o;
        long j7 = z6 ? 1L : 0L;
        User user = this.f97732c;
        mutableSharedFlow.tryEmit(new UgcUpLikesPanelComponent.a.C0884a(this.f97731b, new User(user.f97689a, user.f97690b, user.f97691c, user.f97692d, j7, user.f97694f, user.f97695g, user.h)));
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isCancel() {
        return !this.f97734e.f97665d;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        Context context = this.f97733d;
        return o.b(context, context.getString(2131846702), (String) null, 28, (String) null);
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
        o.e(this.f97733d, "UpLikesListAdapter_bindFollowButton");
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
