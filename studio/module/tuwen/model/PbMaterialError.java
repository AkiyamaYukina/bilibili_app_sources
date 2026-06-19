package com.bilibili.studio.module.tuwen.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/PbMaterialError.class */
@Keep
public final class PbMaterialError {

    @NotNull
    private final String errorMsg;

    @NotNull
    private final String materialId;

    @NotNull
    private final String materialType;

    public PbMaterialError(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.materialId = str;
        this.materialType = str2;
        this.errorMsg = str3;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final String getMaterialId() {
        return this.materialId;
    }

    @NotNull
    public final String getMaterialType() {
        return this.materialType;
    }
}
