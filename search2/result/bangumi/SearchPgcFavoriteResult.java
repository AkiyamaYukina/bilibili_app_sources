package com.bilibili.search2.result.bangumi;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchPgcFavoriteResult.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchPgcFavoriteResult {
    public static final int $stable = 8;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "toast")
    @Nullable
    private String toast;

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setToast(@Nullable String str) {
        this.toast = str;
    }
}
