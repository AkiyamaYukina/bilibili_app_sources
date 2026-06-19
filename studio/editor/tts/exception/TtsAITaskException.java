package com.bilibili.studio.editor.tts.exception;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/exception/TtsAITaskException.class */
public final class TtsAITaskException extends Exception {

    @Nullable
    private String taskId;

    public TtsAITaskException(@Nullable String str, @NotNull String str2) {
        super(str2);
        this.taskId = str;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}
