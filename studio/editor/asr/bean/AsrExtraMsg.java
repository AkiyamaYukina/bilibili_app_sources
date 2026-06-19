package com.bilibili.studio.editor.asr.bean;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.constraintlayout.widget.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AsrExtraMsg.class */
@Keep
public final class AsrExtraMsg {
    private final int asrResult;
    private final int fastAsrResult;

    @NotNull
    private String msgForReport;

    @NotNull
    private String msgForToast;

    public AsrExtraMsg() {
        this(null, null, 0, 0, 15, null);
    }

    public AsrExtraMsg(@NotNull String str, @NotNull String str2, int i7, int i8) {
        this.msgForToast = str;
        this.msgForReport = str2;
        this.fastAsrResult = i7;
        this.asrResult = i8;
    }

    public /* synthetic */ AsrExtraMsg(String str, String str2, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 0 : i7, (i9 & 8) != 0 ? 0 : i8);
    }

    public static /* synthetic */ AsrExtraMsg copy$default(AsrExtraMsg asrExtraMsg, String str, String str2, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = asrExtraMsg.msgForToast;
        }
        if ((i9 & 2) != 0) {
            str2 = asrExtraMsg.msgForReport;
        }
        if ((i9 & 4) != 0) {
            i7 = asrExtraMsg.fastAsrResult;
        }
        if ((i9 & 8) != 0) {
            i8 = asrExtraMsg.asrResult;
        }
        return asrExtraMsg.copy(str, str2, i7, i8);
    }

    @NotNull
    public final String component1() {
        return this.msgForToast;
    }

    @NotNull
    public final String component2() {
        return this.msgForReport;
    }

    public final int component3() {
        return this.fastAsrResult;
    }

    public final int component4() {
        return this.asrResult;
    }

    @NotNull
    public final AsrExtraMsg copy(@NotNull String str, @NotNull String str2, int i7, int i8) {
        return new AsrExtraMsg(str, str2, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsrExtraMsg)) {
            return false;
        }
        AsrExtraMsg asrExtraMsg = (AsrExtraMsg) obj;
        return Intrinsics.areEqual(this.msgForToast, asrExtraMsg.msgForToast) && Intrinsics.areEqual(this.msgForReport, asrExtraMsg.msgForReport) && this.fastAsrResult == asrExtraMsg.fastAsrResult && this.asrResult == asrExtraMsg.asrResult;
    }

    public final int getAsrResult() {
        return this.asrResult;
    }

    public final int getFastAsrResult() {
        return this.fastAsrResult;
    }

    @NotNull
    public final String getMsgForReport() {
        return this.msgForReport;
    }

    @NotNull
    public final String getMsgForToast() {
        return this.msgForToast;
    }

    public int hashCode() {
        return Integer.hashCode(this.asrResult) + I.a(this.fastAsrResult, E.a(this.msgForToast.hashCode() * 31, 31, this.msgForReport), 31);
    }

    public final void setMsgForReport(@NotNull String str) {
        this.msgForReport = str;
    }

    public final void setMsgForToast(@NotNull String str) {
        this.msgForToast = str;
    }

    @NotNull
    public String toString() {
        return d.a(this.fastAsrResult, this.asrResult, ", asrResult=", ")", b.a("AsrExtraMsg(msgForToast=", this.msgForToast, ", msgForReport=", this.msgForReport, ", fastAsrResult="));
    }
}
