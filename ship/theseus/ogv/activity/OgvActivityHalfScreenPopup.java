package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityHalfScreenPopup.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvActivityHalfScreenPopup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("h5url")
    @NotNull
    private final String f91378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("win_id")
    @NotNull
    private final String f91379b;

    public OgvActivityHalfScreenPopup(@NotNull String str, @NotNull String str2) {
        this.f91378a = str;
        this.f91379b = str2;
    }

    @NotNull
    public final String a() {
        return this.f91379b;
    }

    @NotNull
    public final String b() {
        return this.f91378a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvActivityHalfScreenPopup)) {
            return false;
        }
        OgvActivityHalfScreenPopup ogvActivityHalfScreenPopup = (OgvActivityHalfScreenPopup) obj;
        return Intrinsics.areEqual(this.f91378a, ogvActivityHalfScreenPopup.f91378a) && Intrinsics.areEqual(this.f91379b, ogvActivityHalfScreenPopup.f91379b);
    }

    public final int hashCode() {
        return this.f91379b.hashCode() + (this.f91378a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return p.a("OgvActivityHalfScreenPopup(url=", this.f91378a, ", id=", this.f91379b, ")");
    }
}
