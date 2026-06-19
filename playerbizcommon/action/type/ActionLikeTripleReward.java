package com.bilibili.playerbizcommon.action.type;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/action/type/ActionLikeTripleReward.class */
@Keep
public final class ActionLikeTripleReward {

    @JSONField(name = "coin")
    private boolean coin;

    @JSONField(name = "fav")
    private boolean fav;

    @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
    private boolean like;

    @JSONField(name = "multiply")
    private int multiply;

    @JSONField(name = "prompt")
    private boolean prompt;

    @JSONField(name = "v_voucher")
    @NotNull
    private String voucher = "";

    @JSONField(name = "toast")
    @NotNull
    private String toast = "";

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

    @NotNull
    public final String getToast() {
        return this.toast;
    }

    @NotNull
    public final String getVoucher() {
        return this.voucher;
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

    public final void setToast(@NotNull String str) {
        this.toast = str;
    }

    public final void setVoucher(@NotNull String str) {
        this.voucher = str;
    }
}
