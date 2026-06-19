package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.GameVideoInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMediaPicture.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameMediaPicture implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "dimension")
    @Nullable
    private GameVideoInfo.Dimension dimension;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    private int duration;

    @JSONField(name = "av_id")
    @Nullable
    private String filePath;

    @JSONField(name = "pic")
    @NotNull
    private String pic = "";

    @JSONField(name = "pubdate")
    @NotNull
    private String pubdate = "";

    @JSONField(name = "title")
    @NotNull
    private String title = "";

    @Nullable
    public final GameVideoInfo.Dimension getDimension() {
        return this.dimension;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    @NotNull
    public final String getPubdate() {
        return this.pubdate;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setDimension(@Nullable GameVideoInfo.Dimension dimension) {
        this.dimension = dimension;
    }

    public final void setDuration(int i7) {
        this.duration = i7;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setPic(@NotNull String str) {
        this.pic = str;
    }

    public final void setPubdate(@NotNull String str) {
        this.pubdate = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }
}
