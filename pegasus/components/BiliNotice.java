package com.bilibili.pegasus.components;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/BiliNotice.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliNotice extends BaseResponse {
    public static final int $stable = 8;

    @SerializedName("data")
    @Nullable
    private Data data;

    @SerializedName("isCancel")
    private boolean isCancel;

    @SerializedName("ver")
    @Nullable
    private String ver;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/BiliNotice$Data.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Data {
        public static final int $stable = 8;

        @SerializedName(TextSource.CFG_CONTENT)
        @Nullable
        private String content;

        @SerializedName("end_time")
        private long endTime;

        @SerializedName("id")
        private long id;

        @SerializedName("start_time")
        private long startTime;

        @SerializedName("title")
        @Nullable
        private String title;

        @SerializedName(EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getId() {
            return this.id;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setEndTime(long j7) {
            this.endTime = j7;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setStartTime(long j7) {
            this.startTime = j7;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getVer() {
        return this.ver;
    }

    public final boolean isCancel() {
        return this.isCancel;
    }

    public final void setCancel(boolean z6) {
        this.isCancel = z6;
    }

    public final void setData(@Nullable Data data) {
        this.data = data;
    }

    public final void setVer(@Nullable String str) {
        this.ver = str;
    }
}
