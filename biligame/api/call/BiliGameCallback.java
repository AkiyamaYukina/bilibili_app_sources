package com.bilibili.biligame.api.call;

import retrofit2.Callback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiliGameCallback.class */
public interface BiliGameCallback<T> extends Callback<T> {
    void onCacheResopnse(T t7);
}
