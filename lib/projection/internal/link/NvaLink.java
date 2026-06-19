package com.bilibili.lib.projection.internal.link;

import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/link/NvaLink.class */
@Keep
public final class NvaLink {

    @SerializedName("cb")
    @Nullable
    private String callbackUrl;

    @SerializedName("cd")
    @Nullable
    private String code;

    public NvaLink() {
        this(null, null, 3, null);
    }

    public NvaLink(@Nullable String str, @Nullable String str2) {
        this.callbackUrl = str;
        this.code = str2;
    }

    public /* synthetic */ NvaLink(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ NvaLink copy$default(NvaLink nvaLink, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = nvaLink.callbackUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = nvaLink.code;
        }
        return nvaLink.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.callbackUrl;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final NvaLink copy(@Nullable String str, @Nullable String str2) {
        return new NvaLink(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NvaLink)) {
            return false;
        }
        NvaLink nvaLink = (NvaLink) obj;
        return Intrinsics.areEqual(this.callbackUrl, nvaLink.callbackUrl) && Intrinsics.areEqual(this.code, nvaLink.code);
    }

    @Nullable
    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        String str = this.callbackUrl;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.code;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setCallbackUrl(@Nullable String str) {
        this.callbackUrl = str;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    @NotNull
    public String toString() {
        return p.a("NvaLink(callbackUrl=", this.callbackUrl, ", code=", this.code, ")");
    }
}
