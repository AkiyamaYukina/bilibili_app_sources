package com.bilibili.ship.theseus.ogv.tabpage;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/TabActivityExtensionField.class */
@StabilityInferred(parameters = 1)
@Bson
public final class TabActivityExtensionField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("biz_key")
    private final long f94557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("room_num")
    private final long f94558b;

    public TabActivityExtensionField(long j7, long j8) {
        this.f94557a = j7;
        this.f94558b = j8;
    }

    public final long a() {
        return this.f94557a;
    }

    public final long b() {
        return this.f94558b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabActivityExtensionField)) {
            return false;
        }
        TabActivityExtensionField tabActivityExtensionField = (TabActivityExtensionField) obj;
        return this.f94557a == tabActivityExtensionField.f94557a && this.f94558b == tabActivityExtensionField.f94558b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f94558b) + (Long.hashCode(this.f94557a) * 31);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f94557a;
        return android.support.v4.media.session.a.a(z.a(j7, "TabActivityExtensionField(roomId=", ", roomMemberNum="), this.f94558b, ")");
    }
}
