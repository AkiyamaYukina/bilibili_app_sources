package com.bilibili.studio.editor.repository.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmMusic.class */
@Keep
public final class BiliEditorMusicRhythmMusic implements Serializable {
    private long end;

    @Nullable
    private String localPath;

    @Nullable
    private String name;

    @Nullable
    private String sid;
    private long start;

    public final long getEnd() {
        return this.end;
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j7) {
        this.end = j7;
    }

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setStart(long j7) {
        this.start = j7;
    }
}
