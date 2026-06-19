package com.bilibili.lib.riskcontrol;

import I.E;
import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/BiliRiskException.class */
@Keep
public final class BiliRiskException {

    @NotNull
    private final String errorCode;

    @NotNull
    private final String errorMsg;

    @NotNull
    private final ErrorType type;

    public BiliRiskException(@NotNull ErrorType errorType, @NotNull String str, @NotNull String str2) {
        this.type = errorType;
        this.errorCode = str;
        this.errorMsg = str2;
    }

    public /* synthetic */ BiliRiskException(ErrorType errorType, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ BiliRiskException copy$default(BiliRiskException biliRiskException, ErrorType errorType, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            errorType = biliRiskException.type;
        }
        if ((i7 & 2) != 0) {
            str = biliRiskException.errorCode;
        }
        if ((i7 & 4) != 0) {
            str2 = biliRiskException.errorMsg;
        }
        return biliRiskException.copy(errorType, str, str2);
    }

    @NotNull
    public final ErrorType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.errorCode;
    }

    @NotNull
    public final String component3() {
        return this.errorMsg;
    }

    @NotNull
    public final BiliRiskException copy(@NotNull ErrorType errorType, @NotNull String str, @NotNull String str2) {
        return new BiliRiskException(errorType, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliRiskException)) {
            return false;
        }
        BiliRiskException biliRiskException = (BiliRiskException) obj;
        return this.type == biliRiskException.type && Intrinsics.areEqual(this.errorCode, biliRiskException.errorCode) && Intrinsics.areEqual(this.errorMsg, biliRiskException.errorMsg);
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final ErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.errorMsg.hashCode() + E.a(this.type.hashCode() * 31, 31, this.errorCode);
    }

    @NotNull
    public String toString() {
        ErrorType errorType = this.type;
        String str = this.errorCode;
        String str2 = this.errorMsg;
        StringBuilder sb = new StringBuilder("BiliRiskException(type=");
        sb.append(errorType);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(", errorMsg=");
        return C8770a.a(sb, str2, ")");
    }
}
