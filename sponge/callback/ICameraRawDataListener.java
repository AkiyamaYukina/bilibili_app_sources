package com.bilibili.sponge.callback;

import com.bilibili.sponge.camera.CameraParameterConfigture;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/callback/ICameraRawDataListener.class */
public interface ICameraRawDataListener {
    void onCameraDataReceive(CameraParameterConfigture.RawFrameData rawFrameData);
}
