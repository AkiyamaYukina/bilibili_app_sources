package com.bilibili.studio.videocompile;

import com.bilibili.studio.videocompile.define.BVideoCompileRetryType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/IBVideoCompileCallback.class */
public interface IBVideoCompileCallback {
    static /* synthetic */ void onCompileFinished$default(IBVideoCompileCallback iBVideoCompileCallback, String str, String str2, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCompileFinished");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        iBVideoCompileCallback.onCompileFinished(str, str2, z6);
    }

    static /* synthetic */ void onCompileFinishedWithCode$default(IBVideoCompileCallback iBVideoCompileCallback, String str, String str2, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCompileFinishedWithCode");
        }
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        iBVideoCompileCallback.onCompileFinishedWithCode(str, str2, i7);
    }

    void onCompileCanceled(int i7);

    void onCompileFailed(int i7, @NotNull String str);

    default void onCompileFinished(@NotNull String str, @Nullable String str2, boolean z6) {
    }

    default void onCompileFinishedWithCode(@NotNull String str, @Nullable String str2, int i7) {
    }

    void onCompileProgress(float f7);

    default void onCompileProgress2(int i7) {
    }

    void onCompileRetryed(@NotNull BVideoCompileRetryType bVideoCompileRetryType);

    void onCompileStart();
}
