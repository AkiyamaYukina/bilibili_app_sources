package com.bilibili.player.history;

import com.bilibili.player.history.MediaHistoryEntry;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/IMediaHistoryStorage.class */
public interface IMediaHistoryStorage<DATA extends MediaHistoryEntry> {
    static /* synthetic */ <DATA extends MediaHistoryEntry> Object readFromDB$suspendImpl(IMediaHistoryStorage<DATA> iMediaHistoryStorage, IMediaHistoryKeyParams iMediaHistoryKeyParams, Continuation<? super DATA> continuation) {
        return null;
    }

    @NotNull
    default String generateKeyId(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        return "";
    }

    @Nullable
    DATA read(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams);

    @Nullable
    DATA read(@NotNull String str);

    @Nullable
    default Object readFromDB(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams, @NotNull Continuation<? super DATA> continuation) {
        return readFromDB$suspendImpl(this, iMediaHistoryKeyParams, continuation);
    }

    void write(@NotNull String str, @NotNull DATA data);
}
