package com.bilibili.live.streaming.widget;

import android.view.SurfaceHolder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/ISurfaceHolder.class */
public interface ISurfaceHolder {
    @Nullable
    Object getPreview();

    @Nullable
    IRenderView getRenderView();

    @Nullable
    SurfaceHolder getSurfaceHolder();
}
