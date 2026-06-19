package com.bilibili.pegasus.data.card;

import I00.b;
import I00.c;
import com.bilibili.inline.biz.card.FavoriteItem;
import com.bilibili.inline.biz.card.IVideoCommentItem;
import com.bilibili.inline.biz.card.IVideoInfoItem;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/IUgcVideoInfoItem.class */
public interface IUgcVideoInfoItem extends IVideoInfoItem, I00.a, FavoriteItem, b, IVideoCommentItem, c {
    /* synthetic */ long getCoinCount();

    /* synthetic */ boolean getCoinState();

    /* synthetic */ long getLikeCount();

    /* synthetic */ boolean getLikeState();

    /* synthetic */ boolean hasTripleLike();

    /* synthetic */ boolean isTripleLikeCoin();

    /* synthetic */ boolean isTripleLikeFav();

    /* synthetic */ void setTripleLikeCoin(boolean z6);

    /* synthetic */ void setTripleLikeFav(boolean z6);

    /* synthetic */ void updateByMsg(@NotNull VideoStatusMessage videoStatusMessage);

    /* synthetic */ void updateCoinStatus(boolean z6, long j7);

    /* synthetic */ void updateLikeState(boolean z6, long j7);
}
