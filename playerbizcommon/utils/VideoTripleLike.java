package com.bilibili.playerbizcommon.utils;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/VideoTripleLike.class */
@Keep
public final class VideoTripleLike {
    private boolean coin;
    private boolean fav;
    private boolean like;
    private int multiply;
    private boolean prompt;

    public final boolean getCoin() {
        return this.coin;
    }

    public final boolean getFav() {
        return this.fav;
    }

    public final boolean getLike() {
        return this.like;
    }

    public final int getMultiply() {
        return this.multiply;
    }

    public final boolean getPrompt() {
        return this.prompt;
    }

    public final void setCoin(boolean z6) {
        this.coin = z6;
    }

    public final void setFav(boolean z6) {
        this.fav = z6;
    }

    public final void setLike(boolean z6) {
        this.like = z6;
    }

    public final void setMultiply(int i7) {
        this.multiply = i7;
    }

    public final void setPrompt(boolean z6) {
        this.prompt = z6;
    }
}
