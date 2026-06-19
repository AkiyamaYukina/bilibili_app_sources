package com.bilibili.sponge.callback;

import com.bilibili.sponge.exception.SpongeCameraAccessException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/callback/IOpenCameraCallback.class */
public interface IOpenCameraCallback {
    void cameraOpenFail(SpongeCameraAccessException spongeCameraAccessException);

    void cameraOpenSuccess(Object obj);
}
