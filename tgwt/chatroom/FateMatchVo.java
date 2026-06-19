package com.bilibili.tgwt.chatroom;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/FateMatchVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FateMatchVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("delay")
    private long f110954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timeout")
    private long f110955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("match_id")
    @NotNull
    private final String f110956c;

    public FateMatchVo(long j7, long j8, @NotNull String str) {
        this.f110954a = j7;
        this.f110955b = j8;
        this.f110956c = str;
    }

    public final long a() {
        return this.f110954a;
    }

    @NotNull
    public final String b() {
        return this.f110956c;
    }

    public final long c() {
        return this.f110955b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FateMatchVo)) {
            return false;
        }
        FateMatchVo fateMatchVo = (FateMatchVo) obj;
        return this.f110954a == fateMatchVo.f110954a && this.f110955b == fateMatchVo.f110955b && Intrinsics.areEqual(this.f110956c, fateMatchVo.f110956c);
    }

    public final int hashCode() {
        return this.f110956c.hashCode() + C3554n0.a(Long.hashCode(this.f110954a) * 31, 31, this.f110955b);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f110954a;
        long j8 = this.f110955b;
        String str = this.f110956c;
        StringBuilder sbA = z.a(j7, "FateMatchVo(delay=", ", timeout=");
        G0.d.a(j8, ", matchId=", str, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
