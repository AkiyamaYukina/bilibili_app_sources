package com.bilibili.studio.videoeditor.generalrender.model;

import com.bilibili.studio.videoeditor.generalrender.bean.GRRenderTaskStatusResult;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/s.class */
public interface s extends Runnable {
    void release();

    long x();

    @Nullable
    GRRenderTaskStatusResult y();
}
