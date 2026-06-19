package com.bilibili.lib.sharewrapper.online.api;

import androidx.annotation.Keep;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareClickResult.class */
@Bson
@Keep
public final class ShareClickResult {

    @SerializedName("audio_play_link")
    @Nullable
    private String audioLink;

    @SerializedName("card_type")
    @Nullable
    private Integer cardType;

    @Nullable
    private String content;

    @SerializedName("header")
    @Nullable
    private String header;

    @SerializedName("is_first_share")
    @Nullable
    private Boolean isFirstShare;

    @Nullable
    private String link;

    @Nullable
    private String picture;

    @SerializedName("program_id")
    @Nullable
    private String programId;

    @SerializedName("program_path")
    @Nullable
    private String programPath;

    @SerializedName("schema")
    @Nullable
    private String schema;

    @SerializedName("share_mode")
    @Nullable
    private Integer shareMode;

    @Nullable
    private String title;

    @Nullable
    public final String getAudioLink() {
        return this.audioLink;
    }

    @Nullable
    public final Integer getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getHeader() {
        return this.header;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    public final String getProgramId() {
        return this.programId;
    }

    @Nullable
    public final String getProgramPath() {
        return this.programPath;
    }

    @Nullable
    public final String getSchema() {
        return this.schema;
    }

    @Nullable
    public final Integer getShareMode() {
        return this.shareMode;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Boolean isFirstShare() {
        return this.isFirstShare;
    }

    public final void setAudioLink(@Nullable String str) {
        this.audioLink = str;
    }

    public final void setCardType(@Nullable Integer num) {
        this.cardType = num;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFirstShare(@Nullable Boolean bool) {
        this.isFirstShare = bool;
    }

    public final void setHeader(@Nullable String str) {
        this.header = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setPicture(@Nullable String str) {
        this.picture = str;
    }

    public final void setProgramId(@Nullable String str) {
        this.programId = str;
    }

    public final void setProgramPath(@Nullable String str) {
        this.programPath = str;
    }

    public final void setSchema(@Nullable String str) {
        this.schema = str;
    }

    public final void setShareMode(@Nullable Integer num) {
        this.shareMode = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
