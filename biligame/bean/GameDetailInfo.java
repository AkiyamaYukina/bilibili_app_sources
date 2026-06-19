package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameDetailInfo.class */
@Keep
public final class GameDetailInfo implements Serializable {

    @JSONField(name = "game_name")
    @NotNull
    private String gameName = "";

    @JSONField(name = "expanded_name")
    @NotNull
    private String expandedName = "";

    @JSONField(name = "icon")
    @NotNull
    private String gameIcon = "";

    @JSONField(name = "android_pkg_name")
    @NotNull
    private String androidPkgName = "";

    @NotNull
    public final String getAndroidPkgName() {
        return this.androidPkgName;
    }

    @NotNull
    public final String getExpandedName() {
        return this.expandedName;
    }

    @NotNull
    public final String getGameIcon() {
        return this.gameIcon;
    }

    @NotNull
    public final String getGameName() {
        return this.gameName;
    }

    public final void setAndroidPkgName(@NotNull String str) {
        this.androidPkgName = str;
    }

    public final void setExpandedName(@NotNull String str) {
        this.expandedName = str;
    }

    public final void setGameIcon(@NotNull String str) {
        this.gameIcon = str;
    }

    public final void setGameName(@NotNull String str) {
        this.gameName = str;
    }
}
