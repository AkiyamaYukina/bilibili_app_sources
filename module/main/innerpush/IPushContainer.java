package com.bilibili.module.main.innerpush;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/main/innerpush/IPushContainer.class */
public interface IPushContainer {
    default boolean matchPushWhiteList(@NotNull List<String> list) {
        return false;
    }

    boolean onInterceptPushShow(@NotNull List<String> list, @Nullable PushBizParams pushBizParams);

    default boolean onInterceptPushShowV2(int i7, @NotNull String str) {
        return false;
    }
}
