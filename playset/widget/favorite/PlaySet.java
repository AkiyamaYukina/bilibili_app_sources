package com.bilibili.playset.widget.favorite;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySet.class */
@StabilityInferred(parameters = 0)
@Bson
@Keep
public final class PlaySet {
    public static final int $stable = 8;
    private static final int ATTR_CHECKED_NO;
    private static final int ATTR_COVER_UPDATE_YES;
    private static final int ATTR_DEFAULT_NO = 2;
    private static final int ATTR_DESC_UPDATE_YES;
    private static final int ATTR_PUBLIC_NO = 1;
    private static final int ATTR_TITLE_UPDATE_YES;
    private static final int ATTR_VALIDE_NO;
    public static final int COVER_TYPE_AUDIO = 12;
    public static final int COVER_TYPE_CUSTOM = 0;
    public static final int COVER_TYPE_OGV = 24;
    public static final int COVER_TYPE_OGV_AVID = 42;
    public static final int COVER_TYPE_SEASON = 21;
    public static final int COVER_TYPE_VIDEO = 2;

    @NotNull
    public static final a Companion = new Object();

    @SerializedName("attr")
    private int attr;

    @SerializedName("media_count")
    private int contentCounts;

    @SerializedName("cover_type")
    private int coverType;

    @SerializedName("fav_state")
    private int favorite;

    @SerializedName("id")
    private long id;

    @SerializedName("is_kid_playlist")
    private boolean isKidPlaylist;

    @SerializedName("kid_playlist_desc")
    @Nullable
    private String kidPlaylistDesc;

    @SerializedName("ogv")
    @Nullable
    private OGV ogv;

    @SerializedName("view_count")
    private long playCounts;

    @SerializedName("play_switch")
    private int playSwitch;

    @SerializedName("type")
    private int type;

    @SerializedName("upper")
    @Nullable
    private Upper upper;

    @SerializedName("state")
    private int valid;

    @SerializedName("vt")
    private long vt;

    @SerializedName("title")
    @NotNull
    private String title = "";

    @SerializedName("cover")
    @NotNull
    private String cover = "";

    @SerializedName("intro")
    @NotNull
    private String intro = "";

    @SerializedName("view_text_1")
    @NotNull
    private String viewText1 = "";

    @SerializedName("link")
    @NotNull
    private String link = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySet$a.class */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.playset.widget.favorite.PlaySet$a, java.lang.Object] */
    static {
        int i7 = 2 << 1;
        ATTR_CHECKED_NO = i7;
        ATTR_VALIDE_NO = i7 << 1;
        ATTR_TITLE_UPDATE_YES = i7 << 2;
        ATTR_DESC_UPDATE_YES = i7 << 3;
        ATTR_COVER_UPDATE_YES = i7 << 4;
    }

    public final int getAttr() {
        return this.attr;
    }

    public final int getContentCounts() {
        return this.contentCounts;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final int getCoverType() {
        return this.coverType;
    }

    public final int getFavorite() {
        return this.favorite;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getIntro() {
        return this.intro;
    }

    @Nullable
    public final String getKidPlaylistDesc() {
        return this.kidPlaylistDesc;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final OGV getOgv() {
        return this.ogv;
    }

    public final long getPlayCounts() {
        return this.playCounts;
    }

    public final int getPlaySwitch() {
        return this.playSwitch;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Upper getUpper() {
        return this.upper;
    }

    public final int getValid() {
        return this.valid;
    }

    @NotNull
    public final String getViewText1() {
        return this.viewText1;
    }

    public final long getVt() {
        return this.vt;
    }

    public final boolean hasCurrentVideo() {
        boolean z6 = true;
        if (this.favorite != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isDefault() {
        return (this.attr & ATTR_DEFAULT_NO) == 0;
    }

    public final boolean isKidPlaylist() {
        return this.isKidPlaylist;
    }

    public final boolean isPublic() {
        boolean z6 = true;
        if ((this.attr & 1) != 0) {
            z6 = false;
        }
        return z6;
    }

    public final void setAttr(int i7) {
        this.attr = i7;
    }

    public final void setContentCounts(int i7) {
        this.contentCounts = i7;
    }

    public final void setCover(@NotNull String str) {
        this.cover = str;
    }

    public final void setCoverType(int i7) {
        this.coverType = i7;
    }

    public final void setFavorite(int i7) {
        this.favorite = i7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setIntro(@NotNull String str) {
        this.intro = str;
    }

    public final void setKidPlaylist(boolean z6) {
        this.isKidPlaylist = z6;
    }

    public final void setKidPlaylistDesc(@Nullable String str) {
        this.kidPlaylistDesc = str;
    }

    public final void setLink(@NotNull String str) {
        this.link = str;
    }

    public final void setOgv(@Nullable OGV ogv) {
        this.ogv = ogv;
    }

    public final void setPlayCounts(long j7) {
        this.playCounts = j7;
    }

    public final void setPlaySwitch(int i7) {
        this.playSwitch = i7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUpper(@Nullable Upper upper) {
        this.upper = upper;
    }

    public final void setValid(int i7) {
        this.valid = i7;
    }

    public final void setViewText1(@NotNull String str) {
        this.viewText1 = str;
    }

    public final void setVt(long j7) {
        this.vt = j7;
    }
}
