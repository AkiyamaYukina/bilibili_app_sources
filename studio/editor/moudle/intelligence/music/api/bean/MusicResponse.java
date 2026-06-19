package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.editor.moudle.musicv3.net.bean.EditorFavItemBean;
import java.util.List;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MusicResponse.class */
@Keep
public final class MusicResponse {

    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    @Nullable
    private EditorFavItemBean.CursorBean cursorBean;

    @JvmField
    @JSONField(name = "polling_required")
    public boolean isPolling;

    @Nullable
    private List<Music> musics;

    @Nullable
    private Polling polling;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MusicResponse$Music.class */
    @Keep
    public static final class Music {

        @Nullable
        private Float score = Float.valueOf(0.0f);
        private long sid;

        @Nullable
        public final Float getScore() {
            return this.score;
        }

        public final long getSid() {
            return this.sid;
        }

        public final void setScore(@Nullable Float f7) {
            this.score = f7;
        }

        public final void setSid(long j7) {
            this.sid = j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/MusicResponse$Polling.class */
    @Keep
    public static final class Polling {

        @JSONField(name = "interval_time")
        @Nullable
        private Long intervalTime = 0L;

        @Nullable
        private Long timeout = 0L;

        @JSONField(name = "begin_time")
        @Nullable
        private Long beginTime = 0L;

        @Nullable
        public final Long getBeginTime() {
            return this.beginTime;
        }

        @Nullable
        public final Long getIntervalTime() {
            return this.intervalTime;
        }

        @Nullable
        public final Long getTimeout() {
            return this.timeout;
        }

        public final void setBeginTime(@Nullable Long l7) {
            this.beginTime = l7;
        }

        public final void setIntervalTime(@Nullable Long l7) {
            this.intervalTime = l7;
        }

        public final void setTimeout(@Nullable Long l7) {
            this.timeout = l7;
        }
    }

    @Nullable
    public final EditorFavItemBean.CursorBean getCursorBean() {
        return this.cursorBean;
    }

    @Nullable
    public final List<Music> getMusics() {
        return this.musics;
    }

    @Nullable
    public final Polling getPolling() {
        return this.polling;
    }

    public final void setCursorBean(@Nullable EditorFavItemBean.CursorBean cursorBean) {
        this.cursorBean = cursorBean;
    }

    public final void setMusics(@Nullable List<Music> list) {
        this.musics = list;
    }

    public final void setPolling(@Nullable Polling polling) {
        this.polling = polling;
    }
}
