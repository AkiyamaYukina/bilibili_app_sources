package com.bilibili.studio.editor.asr.bean;

import androidx.annotation.Keep;
import com.bilibili.studio.editor.asr.core.bean.AsrUtterances;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AsrResultWrapper.class */
@Keep
public final class AsrResultWrapper {

    @Nullable
    private String asrLabelResult;

    @Nullable
    private AsrUtterances asrUtterances;

    @NotNull
    private final AudioInfo audioInfo;

    @Nullable
    private final AsrBaseException exception;

    public AsrResultWrapper(@NotNull AudioInfo audioInfo, @Nullable AsrUtterances asrUtterances, @Nullable AsrBaseException asrBaseException, @Nullable String str) {
        this.audioInfo = audioInfo;
        this.asrUtterances = asrUtterances;
        this.exception = asrBaseException;
        this.asrLabelResult = str;
    }

    public /* synthetic */ AsrResultWrapper(AudioInfo audioInfo, AsrUtterances asrUtterances, AsrBaseException asrBaseException, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioInfo, (i7 & 2) != 0 ? null : asrUtterances, (i7 & 4) != 0 ? null : asrBaseException, (i7 & 8) != 0 ? null : str);
    }

    public static /* synthetic */ AsrResultWrapper copy$default(AsrResultWrapper asrResultWrapper, AudioInfo audioInfo, AsrUtterances asrUtterances, AsrBaseException asrBaseException, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            audioInfo = asrResultWrapper.audioInfo;
        }
        if ((i7 & 2) != 0) {
            asrUtterances = asrResultWrapper.asrUtterances;
        }
        if ((i7 & 4) != 0) {
            asrBaseException = asrResultWrapper.exception;
        }
        if ((i7 & 8) != 0) {
            str = asrResultWrapper.asrLabelResult;
        }
        return asrResultWrapper.copy(audioInfo, asrUtterances, asrBaseException, str);
    }

    @NotNull
    public final AudioInfo component1() {
        return this.audioInfo;
    }

    @Nullable
    public final AsrUtterances component2() {
        return this.asrUtterances;
    }

    @Nullable
    public final AsrBaseException component3() {
        return this.exception;
    }

    @Nullable
    public final String component4() {
        return this.asrLabelResult;
    }

    @NotNull
    public final AsrResultWrapper copy(@NotNull AudioInfo audioInfo, @Nullable AsrUtterances asrUtterances, @Nullable AsrBaseException asrBaseException, @Nullable String str) {
        return new AsrResultWrapper(audioInfo, asrUtterances, asrBaseException, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrResultWrapper)) {
            return false;
        }
        AsrResultWrapper asrResultWrapper = (AsrResultWrapper) obj;
        return Intrinsics.areEqual(this.audioInfo, asrResultWrapper.audioInfo) && Intrinsics.areEqual(this.asrUtterances, asrResultWrapper.asrUtterances) && Intrinsics.areEqual(this.exception, asrResultWrapper.exception) && Intrinsics.areEqual(this.asrLabelResult, asrResultWrapper.asrLabelResult);
    }

    @Nullable
    public final String getAsrLabelResult() {
        return this.asrLabelResult;
    }

    @Nullable
    public final AsrUtterances getAsrUtterances() {
        return this.asrUtterances;
    }

    @NotNull
    public final AudioInfo getAudioInfo() {
        return this.audioInfo;
    }

    @Nullable
    public final AsrBaseException getException() {
        return this.exception;
    }

    public int hashCode() {
        int iHashCode = this.audioInfo.hashCode();
        AsrUtterances asrUtterances = this.asrUtterances;
        int iHashCode2 = 0;
        int iHashCode3 = asrUtterances == null ? 0 : asrUtterances.hashCode();
        AsrBaseException asrBaseException = this.exception;
        int iHashCode4 = asrBaseException == null ? 0 : asrBaseException.hashCode();
        String str = this.asrLabelResult;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final boolean isAvailable() {
        return this.asrUtterances != null;
    }

    public final void setAsrLabelResult(@Nullable String str) {
        this.asrLabelResult = str;
    }

    public final void setAsrUtterances(@Nullable AsrUtterances asrUtterances) {
        this.asrUtterances = asrUtterances;
    }

    @NotNull
    public String toString() {
        return "AsrResultWrapper(audioInfo=" + this.audioInfo + ", asrUtterances=" + this.asrUtterances + ", exception=" + this.exception + ", asrLabelResult=" + this.asrLabelResult + ")";
    }
}
