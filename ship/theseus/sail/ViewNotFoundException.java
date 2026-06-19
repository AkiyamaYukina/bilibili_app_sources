package com.bilibili.ship.theseus.sail;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/ViewNotFoundException.class */
public final class ViewNotFoundException extends Throwable {

    @NotNull
    private final String jumpUrl;

    public ViewNotFoundException(@NotNull String str) {
        this.jumpUrl = str;
    }

    @NotNull
    public final String getJumpUrl() {
        return this.jumpUrl;
    }
}
