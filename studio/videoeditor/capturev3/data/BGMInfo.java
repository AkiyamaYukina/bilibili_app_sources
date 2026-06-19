package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.bgm.Bgm;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BGMInfo.class */
@Keep
public class BGMInfo {
    public static final int FROM_ACTIVITY = 0;
    public static final int FROM_MUSIC = 1;
    public static final int FROM_STICKER = 2;
    public static final int LOCALBGM = 0;
    public static final int NETBGM = 1;

    @Nullable
    private Bgm bgm;
    private long bgmId;
    private long durationInMs;
    private int mFrom;
    private boolean mSelectedByUser = false;
    private String name;
    private String path;
    private long starTime;
    private int type;

    public BGMInfo() {
    }

    public BGMInfo(String str, long j7, String str2, int i7, long j8, int i8, Bgm bgm) {
        this.path = str;
        this.starTime = j7;
        this.name = str2;
        this.type = i7;
        this.bgmId = j8;
        this.mFrom = i8;
        this.bgm = bgm;
    }

    @Nullable
    public Bgm getBgm() {
        return this.bgm;
    }

    public long getBgmId() {
        return this.bgmId;
    }

    public long getDurationInMs() {
        return this.durationInMs;
    }

    public int getFrom() {
        return this.mFrom;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public long getStarTime() {
        return this.starTime;
    }

    public int getType() {
        return this.type;
    }

    public boolean isSelectedByUser() {
        return this.mSelectedByUser;
    }

    public void setBgm(@Nullable Bgm bgm) {
        this.bgm = bgm;
    }

    public void setBgmId(long j7) {
        this.bgmId = j7;
    }

    public void setDurationInMs(long j7) {
        this.durationInMs = j7;
    }

    public void setFrom(int i7) {
        this.mFrom = i7;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSelectedByUser(boolean z6) {
        this.mSelectedByUser = z6;
    }

    public void setStarTime(long j7) {
        this.starTime = j7;
    }

    public void setType(int i7) {
        this.type = i7;
    }

    public String toString() {
        return "BGMInfo{path='" + this.path + "', starTime=" + this.starTime + ", durationInMs=" + this.durationInMs + ", name='" + this.name + "', type=" + this.type + ", bgmId=" + this.bgmId + ", mFrom=" + this.mFrom + ", bgm=" + this.bgm + '}';
    }
}
