package com.bilibili.biligame.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/CommentShare.class */
@StabilityInferred(parameters = 0)
public final class CommentShare implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String comment;
    private int commentStar;

    @Nullable
    private String developerName;

    @Nullable
    private String expandedName;

    @Nullable
    private String gameIcon;

    @Nullable
    private String gameId;

    @Nullable
    private String gameName;

    @Nullable
    private String shareComment;

    @Nullable
    private String summary;

    @Nullable
    private String tagName;

    @Nullable
    private String videoImage;

    @Nullable
    private Float star = Float.valueOf(0.0f);

    @Nullable
    private Integer commentNumber = 0;

    @Nullable
    private Integer validCommentNumber = 0;

    @Nullable
    private Integer source = 0;

    @Nullable
    public final String getComment() {
        return this.comment;
    }

    @Nullable
    public final Integer getCommentNumber() {
        return this.commentNumber;
    }

    public final int getCommentStar() {
        return this.commentStar;
    }

    @Nullable
    public final String getDeveloperName() {
        return this.developerName;
    }

    @Nullable
    public final String getExpandedName() {
        return this.expandedName;
    }

    @Nullable
    public final String getGameIcon() {
        return this.gameIcon;
    }

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getShareComment() {
        return this.shareComment;
    }

    @Nullable
    public final Integer getSource() {
        return this.source;
    }

    @Nullable
    public final Float getStar() {
        return this.star;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    public final Integer getValidCommentNumber() {
        return this.validCommentNumber;
    }

    @Nullable
    public final String getVideoImage() {
        return this.videoImage;
    }

    public final void setComment(@Nullable String str) {
        this.comment = str;
    }

    public final void setCommentNumber(@Nullable Integer num) {
        this.commentNumber = num;
    }

    public final void setCommentStar(int i7) {
        this.commentStar = i7;
    }

    public final void setDeveloperName(@Nullable String str) {
        this.developerName = str;
    }

    public final void setExpandedName(@Nullable String str) {
        this.expandedName = str;
    }

    public final void setGameIcon(@Nullable String str) {
        this.gameIcon = str;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setShareComment(@Nullable String str) {
        this.shareComment = str;
    }

    public final void setSource(@Nullable Integer num) {
        this.source = num;
    }

    public final void setStar(@Nullable Float f7) {
        this.star = f7;
    }

    public final void setSummary(@Nullable String str) {
        this.summary = str;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }

    public final void setValidCommentNumber(@Nullable Integer num) {
        this.validCommentNumber = num;
    }

    public final void setVideoImage(@Nullable String str) {
        this.videoImage = str;
    }
}
