package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBookNotifyGame.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameBookNotifyGame extends BiligameHotGame {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int TYPE_OFFICIAL = 1;

    @JSONField(name = "game_type")
    private int gameType;
    private int index;

    @JSONField(name = "valid_comment_number")
    private int validCommentNumber;

    @JSONField(name = "game_state")
    @Nullable
    private String gameState = "";

    @JSONField(name = "video_image")
    @Nullable
    private String videoImage = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBookNotifyGame$a.class */
    public static final class a {
    }

    @Nullable
    public final String getGameState() {
        return this.gameState;
    }

    public final int getGameType() {
        return this.gameType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getValidCommentNumber() {
        return this.validCommentNumber;
    }

    @Nullable
    public final String getVideoImage() {
        return this.videoImage;
    }

    public final void setGameState(@Nullable String str) {
        this.gameState = str;
    }

    public final void setGameType(int i7) {
        this.gameType = i7;
    }

    public final void setIndex(int i7) {
        this.index = i7;
    }

    public final void setValidCommentNumber(int i7) {
        this.validCommentNumber = i7;
    }

    public final void setVideoImage(@Nullable String str) {
        this.videoImage = str;
    }
}
