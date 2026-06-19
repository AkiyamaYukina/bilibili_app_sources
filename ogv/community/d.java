package com.bilibili.ogv.community;

import com.bilibili.ogv.community.bean.UserCommunityBean;
import com.bilibili.ogv.community.c;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/d.class */
public final class d<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67533a;

    public d(long j7) {
        this.f67533a = j7;
    }

    public final void accept(Object obj) {
        UserCommunityBean userCommunityBean = (UserCommunityBean) obj;
        a<Long, Boolean> aVar = c.f67527c;
        long j7 = this.f67533a;
        aVar.c(Long.valueOf(j7), Boolean.valueOf(userCommunityBean.c()));
        c.f67528d.c(Long.valueOf(j7), new c.a(userCommunityBean.a(), userCommunityBean.d()));
    }
}
