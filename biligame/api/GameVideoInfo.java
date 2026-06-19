package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameVideoInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public class GameVideoInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "av_id")
    @Nullable
    private String avId;

    @JSONField(name = "bv_id")
    @Nullable
    private String bvId;

    @JSONField(name = "cid")
    @Nullable
    private String cid;

    @JSONField(name = "dimension")
    @Nullable
    private Dimension dimension;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    private int duration;
    private int fromAutoPlay;

    @JSONField(name = "play_start_position")
    private int playStartPosition;

    @Nullable
    private String spmid;

    @JSONField(name = "pic")
    @NotNull
    private String pic = "";

    @JSONField(name = "pubdate")
    @NotNull
    private String pubdate = "";

    @JSONField(name = "title")
    @NotNull
    private String title = "";
    private boolean danmakuEnable = true;
    private boolean danmakuOn = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameVideoInfo$Dimension.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Dimension implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "height")
        private float height;

        @JSONField(name = "rotate")
        private float rotate;

        @JSONField(name = "width")
        private float width;

        public final float getHeight() {
            return this.height;
        }

        public final float getRotate() {
            return this.rotate;
        }

        public final float getWidth() {
            return this.width;
        }

        public final void setHeight(float f7) {
            this.height = f7;
        }

        public final void setRotate(float f7) {
            this.rotate = f7;
        }

        public final void setWidth(float f7) {
            this.width = f7;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameVideoInfo)) {
            return false;
        }
        GameVideoInfo gameVideoInfo = (GameVideoInfo) obj;
        boolean z6 = true;
        if (!Intrinsics.areEqual(this.avId, gameVideoInfo.avId)) {
            z6 = Intrinsics.areEqual(this.bvId, gameVideoInfo.bvId);
        }
        return z6;
    }

    @Nullable
    public final String getAvId() {
        return this.avId;
    }

    @Nullable
    public final String getBvId() {
        return this.bvId;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    public final boolean getDanmakuEnable() {
        return this.danmakuEnable;
    }

    public final boolean getDanmakuOn() {
        return this.danmakuOn;
    }

    @Nullable
    public final Dimension getDimension() {
        return this.dimension;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getFromAutoPlay() {
        return this.fromAutoPlay;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    public final int getPlayStartPosition() {
        return this.playStartPosition;
    }

    @NotNull
    public final String getPubdate() {
        return this.pubdate;
    }

    @Nullable
    public final String getSpmid() {
        return this.spmid;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean isValid() {
        String str;
        String str2;
        String str3 = this.avId;
        return (((str3 == null || StringsKt.isBlank(str3)) && ((str = this.bvId) == null || StringsKt.isBlank(str))) || (str2 = this.cid) == null || StringsKt.isBlank(str2)) ? false : true;
    }

    public final boolean isVerticalVideo() {
        Dimension dimension = this.dimension;
        boolean z6 = false;
        if (dimension != null) {
            z6 = false;
            if (dimension.getHeight() > dimension.getWidth()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void setAvId(@Nullable String str) {
        this.avId = str;
    }

    public final void setBvId(@Nullable String str) {
        this.bvId = str;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    public final void setDanmakuEnable(boolean z6) {
        this.danmakuEnable = z6;
    }

    public final void setDanmakuOn(boolean z6) {
        this.danmakuOn = z6;
    }

    public final void setDimension(@Nullable Dimension dimension) {
        this.dimension = dimension;
    }

    public final void setDuration(int i7) {
        this.duration = i7;
    }

    public final void setFromAutoPlay(int i7) {
        this.fromAutoPlay = i7;
    }

    public final void setPic(@NotNull String str) {
        this.pic = str;
    }

    public final void setPlayStartPosition(int i7) {
        this.playStartPosition = i7;
    }

    public final void setPubdate(@NotNull String str) {
        this.pubdate = str;
    }

    public final void setSpmid(@Nullable String str) {
        this.spmid = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }
}
