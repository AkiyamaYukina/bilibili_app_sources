package com.bilibili.ogv.opbase;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.e;
import com.bilibili.bson.common.Bson;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Status.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Status {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("follow")
    private boolean f69942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("follow_status")
    private int f69943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IVideoLikeRouteService.ACTION_LIKE)
    private int f69944c;

    public Status() {
        this(0, 0, 7, false);
    }

    public Status(int i7, int i8, int i9, boolean z6) {
        z6 = (i9 & 1) != 0 ? false : z6;
        i7 = (i9 & 2) != 0 ? 0 : i7;
        i8 = (i9 & 4) != 0 ? 0 : i8;
        this.f69942a = z6;
        this.f69943b = i7;
        this.f69944c = i8;
    }

    public final int a() {
        return this.f69944c;
    }

    public final int b() {
        return this.f69943b;
    }

    public final boolean c() {
        return this.f69942a;
    }

    public final void d(boolean z6) {
        this.f69942a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f69942a == status.f69942a && this.f69943b == status.f69943b && this.f69944c == status.f69944c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69944c) + I.a(this.f69943b, Boolean.hashCode(this.f69942a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f69942a;
        return C4277b.a(this.f69944c, ")", e.a(this.f69943b, "Status(isFavor=", ", status=", ", like=", z6));
    }
}
