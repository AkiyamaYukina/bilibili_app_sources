package com.bilibili.upper.module.cover.editor;

import android.content.Context;
import com.bilibili.studio.videoeditor.editor.editdata.OperationCover;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/h.class */
public interface h {
    @Nullable
    CoverEditorInfo a();

    @Nullable
    String b();

    void c(@Nullable OperationCover operationCover);

    void d(@Nullable Context context);

    void release();
}
