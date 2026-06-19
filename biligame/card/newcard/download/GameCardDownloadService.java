package com.bilibili.biligame.card.newcard.download;

import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/download/GameCardDownloadService.class */
public interface GameCardDownloadService {
    @Nullable
    CardDownloadInfo getGameDownloadInfo(@Nullable BiliGameCardDataBean biliGameCardDataBean);

    void registerDownloadCallBack(@Nullable BiliGameCardDataBean biliGameCardDataBean, @NotNull GameCardDownloadCallBack gameCardDownloadCallBack);

    void registerDownloadCallBack(@NotNull GameCardDownloadCallBack gameCardDownloadCallBack);

    void registerDownloadStatus(@Nullable BiliGameCardDataBean biliGameCardDataBean);

    void unRegisterDownloadCallBack(@Nullable BiliGameCardDataBean biliGameCardDataBean, @NotNull GameCardDownloadCallBack gameCardDownloadCallBack);

    void unRegisterDownloadCallBack(@NotNull GameCardDownloadCallBack gameCardDownloadCallBack);
}
