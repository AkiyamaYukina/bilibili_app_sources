package com.bilibili.studio.material;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IDownloadMaterialListener.class */
public interface IDownloadMaterialListener {
    default void onCancel() {
    }

    default void onProgress(double d7, int i7, int i8) {
    }

    default void onSpeed(float f7) {
    }

    default void onStart() {
    }
}
