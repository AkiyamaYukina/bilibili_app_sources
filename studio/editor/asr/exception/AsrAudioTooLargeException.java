package com.bilibili.studio.editor.asr.exception;

import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/exception/AsrAudioTooLargeException.class */
public final class AsrAudioTooLargeException extends AsrBaseException {
    public AsrAudioTooLargeException(@NotNull String str) {
        super(null, str);
    }

    @Override // com.bilibili.studio.editor.asr.core.exception.AsrBaseException
    public int originCode() {
        return -300;
    }
}
