package com.bilibili.ship.theseus.ogv.activity;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/d.class */
public interface d {
    @Nullable
    ActivityDialogActionType getAction();

    @Nullable
    default String getCode() {
        return null;
    }

    @Nullable
    default String getLink() {
        return null;
    }

    default boolean getNeedLogin() {
        return false;
    }
}
