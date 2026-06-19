package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmCheckResult.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvDrmCheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("allow_play")
    private final boolean f91264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("errmsg")
    @NotNull
    private final String f91265b;

    public OgvDrmCheckResult(boolean z6, String str, int i7) {
        this.f91264a = (i7 & 1) != 0 ? false : z6;
        this.f91265b = str;
    }

    public final boolean a() {
        return this.f91264a;
    }

    @NotNull
    public final String b() {
        return this.f91265b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvDrmCheckResult)) {
            return false;
        }
        OgvDrmCheckResult ogvDrmCheckResult = (OgvDrmCheckResult) obj;
        return this.f91264a == ogvDrmCheckResult.f91264a && Intrinsics.areEqual(this.f91265b, ogvDrmCheckResult.f91265b);
    }

    public final int hashCode() {
        return this.f91265b.hashCode() + (Boolean.hashCode(this.f91264a) * 31);
    }

    @NotNull
    public final String toString() {
        return androidx.fragment.app.n.b("OgvDrmCheckResult(allowPlay=", ", errorMsg=", this.f91265b, ")", this.f91264a);
    }
}
