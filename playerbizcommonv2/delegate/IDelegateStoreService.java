package com.bilibili.playerbizcommonv2.delegate;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/delegate/IDelegateStoreService.class */
public interface IDelegateStoreService extends IPlayerService {
    @Nullable
    <T> T get(@NotNull DelegateStoreKey<T> delegateStoreKey);

    <T> void put(@NotNull DelegateStoreKey<T> delegateStoreKey, T t7);

    void remove(@NotNull DelegateStoreKey<?> delegateStoreKey);
}
