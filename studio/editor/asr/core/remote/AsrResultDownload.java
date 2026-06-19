package com.bilibili.studio.editor.asr.core.remote;

import com.bilibili.studio.editor.asr.core.bean.AsrUtterances;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/AsrResultDownload.class */
public final class AsrResultDownload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f105538a = "";

    @Nullable
    public final Object a(@NotNull String str, @NotNull Continuation<? super AsrUtterances> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AsrResultDownload$downloadAsrJson$2(str, this, null), continuation);
    }
}
