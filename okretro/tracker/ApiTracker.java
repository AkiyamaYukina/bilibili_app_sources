package com.bilibili.okretro.tracker;

import androidx.annotation.Nullable;
import okhttp3.Call;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/tracker/ApiTracker.class */
public interface ApiTracker {
    public static final int INVALID_API_CODE = Integer.MIN_VALUE;
    public static final int INVALID_HTTP_CODE = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/tracker/ApiTracker$Factory.class */
    public interface Factory {
        ApiTracker getTracker();
    }

    @Deprecated
    default void beginConnect(String str, String str2) {
    }

    @Deprecated
    default void beginConnect(String str, String str2, long j7) {
    }

    default void beginConnect(String str, String str2, RequestBody requestBody, long j7) {
    }

    void beginParse();

    void beginReadBody();

    default void endConnect(long j7, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
    }

    @Deprecated
    default void endConnect(long j7, int i7, @Nullable String str, @Nullable Throwable th) {
    }

    default void endConnect(long j7, int i7, @Nullable Throwable th) {
    }

    void endParse(int i7, @Nullable String str, @Nullable Throwable th);

    void endReadBody(@Nullable byte[] bArr, @Nullable Throwable th);

    void finish();

    void setCall(Call call);

    void updateUrl(String str);
}
