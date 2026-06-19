package com.bilibili.studio.material.internal.net;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/net/DownloadUrlLevel.class */
@Keep
public final class DownloadUrlLevel implements Comparator<DownloadUrlLevel> {

    @Nullable
    private String download_url;

    @Nullable
    private String level;

    @Override // java.util.Comparator
    public int compare(@NotNull DownloadUrlLevel downloadUrlLevel, @NotNull DownloadUrlLevel downloadUrlLevel2) {
        if (downloadUrlLevel.getLevelValue() > downloadUrlLevel2.getLevelValue()) {
            return 1;
        }
        return downloadUrlLevel.getLevelValue() < downloadUrlLevel2.getLevelValue() ? -1 : 0;
    }

    @Nullable
    public final String getDownload_url() {
        return this.download_url;
    }

    @Nullable
    public final String getLevel() {
        return this.level;
    }

    @JSONField(deserialize = false, serialize = false)
    public final int getLevelValue() {
        return isHigh() ? 2 : isMid() ? 1 : isLow() ? 0 : -1;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isHigh() {
        return Intrinsics.areEqual("high", this.level);
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isLow() {
        return Intrinsics.areEqual("low", this.level);
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isMid() {
        return Intrinsics.areEqual(EditCustomizeSticker.TAG_MID, this.level);
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isValid() {
        return !TextUtils.isEmpty(this.download_url) && (isHigh() || isMid() || isLow());
    }

    public final void setDownload_url(@Nullable String str) {
        this.download_url = str;
    }

    public final void setLevel(@Nullable String str) {
        this.level = str;
    }
}
