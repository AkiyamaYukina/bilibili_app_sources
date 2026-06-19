package com.bilibili.player.history;

import H9.a;
import com.bilibili.lib.blrouter.BLRouter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/MediaHistoryHelper.class */
public final class MediaHistoryHelper {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<MediaHistoryHelper> f79278a = LazyKt.lazy(new a(7));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/MediaHistoryHelper$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MediaHistoryHelper getInstance() {
            return (MediaHistoryHelper) MediaHistoryHelper.f79278a.getValue();
        }
    }

    @NotNull
    public final String generateKeyId(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        IMediaHistoryStorage iMediaHistoryStorage = (IMediaHistoryStorage) BLRouter.INSTANCE.get(IMediaHistoryStorage.class, iMediaHistoryKeyParams.getType());
        return iMediaHistoryStorage == null ? "" : iMediaHistoryStorage.generateKeyId(iMediaHistoryKeyParams);
    }

    @Nullable
    public final <DATA extends MediaHistoryEntry> DATA read(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        IMediaHistoryStorage iMediaHistoryStorage = (IMediaHistoryStorage) BLRouter.INSTANCE.get(IMediaHistoryStorage.class, iMediaHistoryKeyParams.getType());
        if (iMediaHistoryStorage == null) {
            return null;
        }
        String strGenerateKeyId = iMediaHistoryStorage.generateKeyId(iMediaHistoryKeyParams);
        if (strGenerateKeyId.length() == 0) {
            return null;
        }
        return (DATA) iMediaHistoryStorage.read(strGenerateKeyId);
    }

    @Nullable
    public final <DATA extends MediaHistoryEntry> DATA read(@NotNull String str, @NotNull String str2) {
        IMediaHistoryStorage iMediaHistoryStorage = (IMediaHistoryStorage) BLRouter.INSTANCE.get(IMediaHistoryStorage.class, str2);
        if (iMediaHistoryStorage == null) {
            return null;
        }
        return (DATA) iMediaHistoryStorage.read(str);
    }

    @Nullable
    public final <DATA extends MediaHistoryEntry> Object readFromDB(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams, @NotNull Continuation<? super DATA> continuation) {
        IMediaHistoryStorage iMediaHistoryStorage = (IMediaHistoryStorage) BLRouter.INSTANCE.get(IMediaHistoryStorage.class, iMediaHistoryKeyParams.getType());
        if (iMediaHistoryStorage == null) {
            return null;
        }
        return iMediaHistoryStorage.readFromDB(iMediaHistoryKeyParams, continuation);
    }

    public final <DATA extends MediaHistoryEntry> void write(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams, @NotNull DATA data) {
        IMediaHistoryStorage iMediaHistoryStorage = (IMediaHistoryStorage) BLRouter.INSTANCE.get(IMediaHistoryStorage.class, iMediaHistoryKeyParams.getType());
        if (iMediaHistoryStorage == null) {
            return;
        }
        iMediaHistoryStorage.write(iMediaHistoryStorage.generateKeyId(iMediaHistoryKeyParams), data);
    }

    public final <DATA extends MediaHistoryEntry> void write(@NotNull String str, @NotNull String str2, @NotNull DATA data) {
        IMediaHistoryStorage iMediaHistoryStorage = (IMediaHistoryStorage) BLRouter.INSTANCE.get(IMediaHistoryStorage.class, str2);
        if (iMediaHistoryStorage == null) {
            return;
        }
        iMediaHistoryStorage.write(str, data);
    }
}
