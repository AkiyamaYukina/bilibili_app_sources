package com.bilibili.studio.editor.moudle.intelligence.music.api.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/PollingMusicResponse.class */
@Keep
public final class PollingMusicResponse {

    @Nullable
    private List<Music> musics;

    @Nullable
    private Integer state = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/bean/PollingMusicResponse$Music.class */
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

    @Nullable
    public final List<Music> getMusics() {
        return this.musics;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    public final void setMusics(@Nullable List<Music> list) {
        this.musics = list;
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }
}
