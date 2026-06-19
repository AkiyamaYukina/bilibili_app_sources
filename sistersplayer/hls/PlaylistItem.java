package com.bilibili.sistersplayer.hls;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/PlaylistItem.class */
public final class PlaylistItem {

    @NotNull
    private BiLiAUX aux;

    @Nullable
    private Long duration;
    private final boolean isInit;

    @NotNull
    private String name;

    @Nullable
    private final Long seq;

    @NotNull
    private String src;

    @NotNull
    private Title title;

    @NotNull
    private String uri;

    public PlaylistItem(@NotNull String str, @NotNull String str2, @Nullable Long l7, @NotNull Title title, @NotNull BiLiAUX biLiAUX, boolean z6, @Nullable Long l8, @NotNull String str3) {
        this.uri = str;
        this.name = str2;
        this.duration = l7;
        this.title = title;
        this.aux = biLiAUX;
        this.isInit = z6;
        this.seq = l8;
        this.src = str3;
    }

    public /* synthetic */ PlaylistItem(String str, String str2, Long l7, Title title, BiLiAUX biLiAUX, boolean z6, Long l8, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l7, title, biLiAUX, (i7 & 32) != 0 ? false : z6, (i7 & 64) != 0 ? null : l8, str3);
    }

    @NotNull
    public final BiLiAUX getAux() {
        return this.aux;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getSeq() {
        return this.seq;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    public final Title getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public final boolean isInit() {
        return this.isInit;
    }

    public final void setAux(@NotNull BiLiAUX biLiAUX) {
        this.aux = biLiAUX;
    }

    public final void setDuration(@Nullable Long l7) {
        this.duration = l7;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setSrc(@NotNull String str) {
        this.src = str;
    }

    public final void setTitle(@NotNull Title title) {
        this.title = title;
    }

    public final void setUri(@NotNull String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        return "\n(name=" + this.name + ", \n|duration=" + this.duration + ", \n|title=" + this.title + ", \n|aux=" + this.aux + ", \n|init=" + this.isInit + ", \n|seq=" + this.seq + ")";
    }
}
