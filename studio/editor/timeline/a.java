package com.bilibili.studio.editor.timeline;

import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/a.class */
public interface a {
    default void a() {
    }

    void b(@NotNull EditVideoInfo editVideoInfo, @NotNull EditVideoInfo editVideoInfo2, @NotNull BackUpTag backUpTag);
}
