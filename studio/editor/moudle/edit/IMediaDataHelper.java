package com.bilibili.studio.editor.moudle.edit;

import UC0.k;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/edit/IMediaDataHelper.class */
@Keep
public interface IMediaDataHelper {
    void adjustTransitionAfterClipChanged(@NotNull k kVar, @Nullable EditVideoClip editVideoClip, long j7);

    void videoAdjustAfterDurationChanged(@Nullable EditVideoInfo editVideoInfo, @Nullable List<? extends BClip> list, long j7, @Nullable List<k> list2);

    boolean videoCutClip(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoClip editVideoClip, @Nullable BClip bClip, long j7);

    boolean videoDeleteClip(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoClip editVideoClip, int i7);

    boolean videoReplaceClip(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoClip editVideoClip, int i7, @Nullable String str, long j7);
}
