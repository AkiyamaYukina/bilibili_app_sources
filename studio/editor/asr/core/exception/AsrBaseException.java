package com.bilibili.studio.editor.asr.core.exception;

import com.bilibili.studio.editor.asr.core.config.AsrStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/exception/AsrBaseException.class */
public abstract class AsrBaseException extends Exception {

    @Nullable
    private AsrStep step;

    public AsrBaseException(@Nullable AsrStep asrStep, @NotNull String str) {
        super(str);
        this.step = asrStep;
    }

    public final int getCode() {
        int iOriginCode = originCode();
        AsrStep asrStep = this.step;
        return iOriginCode + (asrStep != null ? asrStep.getStepMask() : 0);
    }

    @Nullable
    public final AsrStep getStep() {
        return this.step;
    }

    public abstract int originCode();

    public final void setStep(@Nullable AsrStep asrStep) {
        this.step = asrStep;
    }
}
