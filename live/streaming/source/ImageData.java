package com.bilibili.live.streaming.source;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/ImageData.class */
public final class ImageData {

    @NotNull
    private String imageFrom;

    @NotNull
    private String imagePath;

    public ImageData(@NotNull String str, @NotNull String str2) {
        this.imagePath = str;
        this.imageFrom = str2;
    }

    @NotNull
    public final String getImageFrom() {
        return this.imageFrom;
    }

    @NotNull
    public final String getImagePath() {
        return this.imagePath;
    }

    public final void setImageFrom(@NotNull String str) {
        this.imageFrom = str;
    }

    public final void setImagePath(@NotNull String str) {
        this.imagePath = str;
    }
}
