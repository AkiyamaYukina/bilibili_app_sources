package com.bilibili.studio.editor.asr.core.exception;

import com.bilibili.studio.editor.asr.core.config.AsrStep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/exception/AsrInterruptException.class */
public final class AsrInterruptException extends AsrBaseException {
    public AsrInterruptException(@NotNull AsrStep asrStep, @NotNull String str) {
        super(asrStep, str);
    }

    @Override // com.bilibili.studio.editor.asr.core.exception.AsrBaseException
    public int originCode() {
        return 9;
    }
}
