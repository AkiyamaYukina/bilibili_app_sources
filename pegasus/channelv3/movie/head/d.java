package com.bilibili.pegasus.channelv3.movie.head;

import com.bapis.bilibili.app.interfaces.v1.CommentItem;
import com.bapis.bilibili.app.interfaces.v1.CommentType;
import com.bapis.bilibili.app.interfaces.v1.Supernatant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/d.class */
public final class d {
    @NotNull
    public static final void a(@NotNull Supernatant supernatant, @NotNull o oVar) {
        oVar.f75447a = supernatant.getTitle();
        oVar.f75448b.clear();
        for (CommentItem commentItem : supernatant.getItemList()) {
            if (commentItem.getType() == CommentType.comment_type_redirect || commentItem.getType() == CommentType.comment_type_judge) {
                oVar.f75448b.add(new b(commentItem.getIcon(), commentItem.getUrl(), commentItem.getTitle(), commentItem.getId(), commentItem.getActionType(), commentItem.getType()));
            }
        }
    }
}
