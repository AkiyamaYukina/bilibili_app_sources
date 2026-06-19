package com.bilibili.upper.module.cover_v2.ui;

import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.upper.module.cover.entity.CoverEngineType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/a.class */
public interface a {
    @Nullable
    default KH0.i A5(@NotNull CoverEngineType coverEngineType) {
        return null;
    }

    @Nullable
    KH0.i C3();

    @Nullable
    com.bilibili.upper.module.cover_v2.presenter.a E5();

    boolean R1();

    @Nullable
    UpperLiveWindowExt U5();

    @Nullable
    MultiCoverEditorView V5();
}
