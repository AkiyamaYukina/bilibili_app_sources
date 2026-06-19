package com.bilibili.biligame.api.download;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligamePreResBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligamePreResBean {
    public static final int $stable = 8;

    @Nullable
    private String finalPath;
    private long finishTime;

    @JSONField(name = "game_pkg_name")
    @Nullable
    private String gamePkgName;

    @JSONField(name = "src_md5")
    @Nullable
    private String srcMd5;

    @JSONField(name = "src_name")
    @Nullable
    private String srcName;

    @JSONField(name = "src_size")
    private long srcSize;

    @JSONField(name = "src_link")
    @Nullable
    private String srcUrl;

    @JSONField(name = "src_link2")
    @Nullable
    private String srcUrl2;

    @JSONField(name = "game_base_id")
    private long gameBaseId = -1;

    @JSONField(name = "src_version")
    private int srcVersion = -1;

    @Nullable
    public final String getFinalPath() {
        return this.finalPath;
    }

    public final long getFinishTime() {
        return this.finishTime;
    }

    public final long getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getGamePkgName() {
        return this.gamePkgName;
    }

    public final long getNeedSpace() {
        return (this.srcSize * ((long) 2)) + 314572800;
    }

    @Nullable
    public final String getSrcMd5() {
        return this.srcMd5;
    }

    @Nullable
    public final String getSrcName() {
        return this.srcName;
    }

    public final long getSrcSize() {
        return this.srcSize;
    }

    @Nullable
    public final String getSrcUrl() {
        return this.srcUrl;
    }

    @Nullable
    public final String getSrcUrl2() {
        return this.srcUrl2;
    }

    public final int getSrcVersion() {
        return this.srcVersion;
    }

    public final boolean isValid() {
        String str;
        String str2;
        String str3;
        String str4;
        return (this.gameBaseId <= 0 || (str = this.gamePkgName) == null || str.length() == 0 || (str2 = this.srcName) == null || str2.length() == 0 || (str3 = this.srcMd5) == null || str3.length() == 0 || (str4 = this.srcUrl) == null || str4.length() == 0 || this.srcSize <= 0 || this.srcVersion < 0) ? false : true;
    }

    public final void setFinalPath(@Nullable String str) {
        this.finalPath = str;
    }

    public final void setFinishTime(long j7) {
        this.finishTime = j7;
    }

    public final void setGameBaseId(long j7) {
        this.gameBaseId = j7;
    }

    public final void setGamePkgName(@Nullable String str) {
        this.gamePkgName = str;
    }

    public final void setSrcMd5(@Nullable String str) {
        this.srcMd5 = str;
    }

    public final void setSrcName(@Nullable String str) {
        this.srcName = str;
    }

    public final void setSrcSize(long j7) {
        this.srcSize = j7;
    }

    public final void setSrcUrl(@Nullable String str) {
        this.srcUrl = str;
    }

    public final void setSrcUrl2(@Nullable String str) {
        this.srcUrl2 = str;
    }

    public final void setSrcVersion(int i7) {
        this.srcVersion = i7;
    }
}
