package com.bilibili.studio.editor.moudle.aistory.exception;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/exception/AIStorySensitiveInvalidateException.class */
public final class AIStorySensitiveInvalidateException extends Exception {
    private int errorStep;

    public AIStorySensitiveInvalidateException(@NotNull String str, int i7) {
        super(str);
        this.errorStep = i7;
    }

    public final int getErrorStep() {
        return this.errorStep;
    }

    public final void setErrorStep(int i7) {
        this.errorStep = i7;
    }
}
