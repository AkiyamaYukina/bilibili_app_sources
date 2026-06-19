package com.bilibili.lib.riskcontrol;

import androidx.annotation.Keep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/RiskToken.class */
@Keep
public final class RiskToken {
    private final long createMillis;

    @NotNull
    private final String token;

    public RiskToken(@NotNull String str, long j7) {
        this.token = str;
        this.createMillis = j7;
    }

    public static /* synthetic */ RiskToken copy$default(RiskToken riskToken, String str, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = riskToken.token;
        }
        if ((i7 & 2) != 0) {
            j7 = riskToken.createMillis;
        }
        return riskToken.copy(str, j7);
    }

    @NotNull
    public final String component1() {
        return this.token;
    }

    public final long component2() {
        return this.createMillis;
    }

    @NotNull
    public final RiskToken copy(@NotNull String str, long j7) {
        return new RiskToken(str, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskToken)) {
            return false;
        }
        RiskToken riskToken = (RiskToken) obj;
        return Intrinsics.areEqual(this.token, riskToken.token) && this.createMillis == riskToken.createMillis;
    }

    public final long getCreateMillis() {
        return this.createMillis;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Long.hashCode(this.createMillis) + (this.token.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(this.createMillis, "RiskToken(token=", this.token, ", createMillis=");
        sbA.append(")");
        return sbA.toString();
    }
}
