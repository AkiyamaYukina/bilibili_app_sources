package com.bilibili.studio.editor.moudle.music.manager;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.videoeditor.bgm.Bgm;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/MusicDownloadData.class */
@Keep
public class MusicDownloadData {

    @NonNull
    private final Bgm downloadBgmInfo;
    private String fileName;
    private final long inPoint;
    private String localFilePath;

    @Nullable
    private final EditorMusicItem musicItem;
    private long startDownloadTime;
    private final long trimIn;

    public MusicDownloadData(@NonNull Bgm bgm, long j7, long j8, @Nullable EditorMusicItem editorMusicItem) {
        this.downloadBgmInfo = bgm;
        this.inPoint = j7;
        this.trimIn = j8;
        this.musicItem = editorMusicItem;
    }

    @NonNull
    public Bgm getDownloadBgmInfo() {
        return this.downloadBgmInfo;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getInPoint() {
        return this.inPoint;
    }

    @Nullable
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    @Nullable
    public EditorMusicItem getMusicItem() {
        return this.musicItem;
    }

    public long getStartDownloadTime() {
        return this.startDownloadTime;
    }

    public long getTrimIn() {
        return this.trimIn;
    }

    @Nullable
    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setLocalFilePath(String str) {
        this.localFilePath = str;
    }

    public void setStartDownloadTime(long j7) {
        this.startDownloadTime = j7;
    }
}
