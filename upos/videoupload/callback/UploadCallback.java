package com.bilibili.upos.videoupload.callback;

import com.bilibili.upos.videoupload.UploadTaskInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upos/videoupload/callback/UploadCallback.class */
public interface UploadCallback {
    void onCancel(UploadTaskInfo uploadTaskInfo);

    void onFail(UploadTaskInfo uploadTaskInfo, int i7);

    void onPause(UploadTaskInfo uploadTaskInfo);

    void onProgress(UploadTaskInfo uploadTaskInfo, float f7);

    void onResume(UploadTaskInfo uploadTaskInfo);

    void onSpeed(UploadTaskInfo uploadTaskInfo, long j7, long j8);

    void onStart(UploadTaskInfo uploadTaskInfo);

    void onSuccess(UploadTaskInfo uploadTaskInfo, String str);
}
