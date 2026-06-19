package com.bilibili.ship.theseus.ogv.season;

import O4.a;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/Publish.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Publish {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f94502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("update_info_desc")
    @Nullable
    private final String f94504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("pub_time_show")
    @Nullable
    private final String f94505d;

    public Publish(@Nullable String str, @Nullable String str2, boolean z6, boolean z7) {
        this.f94502a = z6;
        this.f94503b = z7;
        this.f94504c = str;
        this.f94505d = str2;
    }

    @Nullable
    public final String a() {
        return this.f94505d;
    }

    @Nullable
    public final String b() {
        return this.f94504c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Publish)) {
            return false;
        }
        Publish publish = (Publish) obj;
        return this.f94502a == publish.f94502a && this.f94503b == publish.f94503b && Intrinsics.areEqual(this.f94504c, publish.f94504c) && Intrinsics.areEqual(this.f94505d, publish.f94505d);
    }

    public final int hashCode() {
        int iA = z.a(Boolean.hashCode(this.f94502a) * 31, 31, this.f94503b);
        String str = this.f94504c;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f94505d;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f94504c;
        String str2 = this.f94505d;
        StringBuilder sb = new StringBuilder("Publish(isFinish=");
        sb.append(this.f94502a);
        sb.append(", isStarted=");
        a.d(", updateDescription=", str, ", pubTimeText=", sb, this.f94503b);
        return C8770a.a(sb, str2, ")");
    }
}
