package com.bilibili.ship.theseus.ogv.chathall.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/bean/RoomPendant.class */
@StabilityInferred(parameters = 1)
@Bson
public final class RoomPendant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("img_url")
    @Nullable
    private final String f91745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("url")
    @Nullable
    private final String f91746b;

    public RoomPendant(@Nullable String str, @Nullable String str2) {
        this.f91745a = str;
        this.f91746b = str2;
    }

    @Nullable
    public final String a() {
        return this.f91745a;
    }

    @Nullable
    public final String b() {
        return this.f91746b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomPendant)) {
            return false;
        }
        RoomPendant roomPendant = (RoomPendant) obj;
        return Intrinsics.areEqual(this.f91745a, roomPendant.f91745a) && Intrinsics.areEqual(this.f91746b, roomPendant.f91746b);
    }

    public final int hashCode() {
        String str = this.f91745a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f91746b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return p.a("RoomPendant(imageUrl=", this.f91745a, ", link=", this.f91746b, ")");
    }
}
