package com.bilibili.ship.theseus.ogv.playviewextra;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.P;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/EpUserStatus.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpUserStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(alternate = {"sponsor"}, value = "sponsored")
    private final boolean f94344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f94345c;

    public EpUserStatus(@NotNull String str, boolean z6, boolean z7) {
        this.f94343a = z6;
        this.f94344b = z7;
        this.f94345c = str;
    }

    public final boolean a() {
        return this.f94344b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpUserStatus)) {
            return false;
        }
        EpUserStatus epUserStatus = (EpUserStatus) obj;
        return this.f94343a == epUserStatus.f94343a && this.f94344b == epUserStatus.f94344b && Intrinsics.areEqual(this.f94345c, epUserStatus.f94345c);
    }

    public final int hashCode() {
        return this.f94345c.hashCode() + z.a(Boolean.hashCode(this.f94343a) * 31, 31, this.f94344b);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f94344b;
        StringBuilder sb = new StringBuilder("EpUserStatus(payCheck=");
        P.a(", sponsored=", ", canWatchReason=", sb, this.f94343a, z6);
        return C8770a.a(sb, this.f94345c, ")");
    }
}
