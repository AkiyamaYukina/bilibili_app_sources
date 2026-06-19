package com.bilibili.playerbizcommonv2.utils;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/VideoTripleLike.class */
@StabilityInferred(parameters = 0)
@Keep
public final class VideoTripleLike {
    public static final int $stable = 8;
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
