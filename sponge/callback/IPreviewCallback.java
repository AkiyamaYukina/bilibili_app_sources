package com.bilibili.sponge.callback;

import com.bilibili.sponge.exception.SpongeCameraAccessException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/callback/IPreviewCallback.class */
public interface IPreviewCallback {
    void operatePreviewFail(SpongeCameraAccessException spongeCameraAccessException);

    void operatePreviewSuccess();
}
