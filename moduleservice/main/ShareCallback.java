package com.bilibili.moduleservice.main;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/ShareCallback.class */
public interface ShareCallback {
    void onShareCancel();

    void onShareFail(@Nullable String str);

    void onShareSuccess();
}
