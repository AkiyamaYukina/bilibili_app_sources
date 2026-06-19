package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrRequestParam.class */
@Keep
public final class AsrRequestParam {

    @NotNull
    private final String captionType;

    @NotNull
    private final String filePath;

    public AsrRequestParam(@NotNull String str, @NotNull String str2) {
        this.filePath = str;
        this.captionType = str2;
    }

    public static /* synthetic */ AsrRequestParam copy$default(AsrRequestParam asrRequestParam, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = asrRequestParam.filePath;
        }
        if ((i7 & 2) != 0) {
            str2 = asrRequestParam.captionType;
        }
        return asrRequestParam.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.filePath;
    }

    @NotNull
    public final String component2() {
        return this.captionType;
    }

    @NotNull
    public final AsrRequestParam copy(@NotNull String str, @NotNull String str2) {
        return new AsrRequestParam(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrRequestParam)) {
            return false;
        }
        AsrRequestParam asrRequestParam = (AsrRequestParam) obj;
        return Intrinsics.areEqual(this.filePath, asrRequestParam.filePath) && Intrinsics.areEqual(this.captionType, asrRequestParam.captionType);
    }

    @NotNull
    public final String getCaptionType() {
        return this.captionType;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public int hashCode() {
        return this.captionType.hashCode() + (this.filePath.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return p.a("AsrRequestParam(filePath=", this.filePath, ", captionType=", this.captionType, ")");
    }
}
