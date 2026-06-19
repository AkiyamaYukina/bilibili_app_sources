package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.LikeComment;
import com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/u.class */
public final /* synthetic */ class u implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommentGuideService f97226a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        LikeComment likeComment = mVar.f124400a.getLikeComment();
        mVar.a(this.f97226a.a(new com.bilibili.ship.theseus.ugc.intro.commentguide.i(likeComment.getReply(), likeComment.getTitle())));
    }
}
