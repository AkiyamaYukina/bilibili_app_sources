package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BCutNetMusic.class */
@Keep
public final class BCutNetMusic {

    @NotNull
    private String play_url;

    public BCutNetMusic() {
        this(null, 1, null);
    }

    public BCutNetMusic(@NotNull String str) {
        this.play_url = str;
    }

    public /* synthetic */ BCutNetMusic(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str);
    }

    @NotNull
    public final String getPlay_url() {
        return this.play_url;
    }

    public final void setPlay_url(@NotNull String str) {
        this.play_url = str;
    }
}
