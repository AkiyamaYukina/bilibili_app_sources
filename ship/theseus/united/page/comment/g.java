package com.bilibili.ship.theseus.united.page.comment;

import com.bapis.bilibili.app.viewunite.v1.ReplyStyle;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import org.jetbrains.annotations.NotNull;
import tb0.h;
import tb0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f99298a = j.c();

    @NotNull
    public static final TheseusCommentService.b a(@NotNull ReplyStyle replyStyle) {
        long badgeType = replyStyle.getBadgeType();
        return new TheseusCommentService.b(badgeType == 1 ? CommentStyleType.FLIP_EFFECT : badgeType == 2 ? CommentStyleType.SCROLL_ANIMATION : badgeType == 3 ? CommentStyleType.CAROUSEL_TEXT : badgeType == 4 ? CommentStyleType.BUBBLE_TEXT : CommentStyleType.UNKNOWN, replyStyle.getBadgeText());
    }
}
