package com.bilibili.upper.module.partitionTag.partitionTopic.bean;

import X1.C3081k;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/bean/ValidateTagResponse.class */
@StabilityInferred(parameters = 1)
@Keep
public final class ValidateTagResponse {
    public static final int $stable = 0;
    private final int code;

    @Nullable
    private final String errorMsg;

    @Nullable
    private final String responseMsg;
    private final boolean success;

    @Nullable
    private final String validTag;

    public ValidateTagResponse(@Nullable String str, boolean z6, int i7, @Nullable String str2, @Nullable String str3) {
        this.validTag = str;
        this.success = z6;
        this.code = i7;
        this.responseMsg = str2;
        this.errorMsg = str3;
    }

    public static /* synthetic */ ValidateTagResponse copy$default(ValidateTagResponse validateTagResponse, String str, boolean z6, int i7, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = validateTagResponse.validTag;
        }
        if ((i8 & 2) != 0) {
            z6 = validateTagResponse.success;
        }
        if ((i8 & 4) != 0) {
            i7 = validateTagResponse.code;
        }
        if ((i8 & 8) != 0) {
            str2 = validateTagResponse.responseMsg;
        }
        if ((i8 & 16) != 0) {
            str3 = validateTagResponse.errorMsg;
        }
        return validateTagResponse.copy(str, z6, i7, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.validTag;
    }

    public final boolean component2() {
        return this.success;
    }

    public final int component3() {
        return this.code;
    }

    @Nullable
    public final String component4() {
        return this.responseMsg;
    }

    @Nullable
    public final String component5() {
        return this.errorMsg;
    }

    @NotNull
    public final ValidateTagResponse copy(@Nullable String str, boolean z6, int i7, @Nullable String str2, @Nullable String str3) {
        return new ValidateTagResponse(str, z6, i7, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateTagResponse)) {
            return false;
        }
        ValidateTagResponse validateTagResponse = (ValidateTagResponse) obj;
        return Intrinsics.areEqual(this.validTag, validateTagResponse.validTag) && this.success == validateTagResponse.success && this.code == validateTagResponse.code && Intrinsics.areEqual(this.responseMsg, validateTagResponse.responseMsg) && Intrinsics.areEqual(this.errorMsg, validateTagResponse.errorMsg);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final String getResponseMsg() {
        return this.responseMsg;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final String getValidTag() {
        return this.validTag;
    }

    public int hashCode() {
        String str = this.validTag;
        int iHashCode = 0;
        int iA = I.a(this.code, z.a((str == null ? 0 : str.hashCode()) * 31, 31, this.success), 31);
        String str2 = this.responseMsg;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.errorMsg;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.validTag;
        boolean z6 = this.success;
        int i7 = this.code;
        String str2 = this.responseMsg;
        String str3 = this.errorMsg;
        StringBuilder sbB = C3081k.b("ValidateTagResponse(validTag=", str, ", success=", ", code=", z6);
        M.a(i7, ", responseMsg=", str2, ", errorMsg=", sbB);
        return C8770a.a(sbB, str3, ")");
    }
}
