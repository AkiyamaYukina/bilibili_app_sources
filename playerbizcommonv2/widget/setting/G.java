package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/G.class */
@Stable
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f83090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLongState f83091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList f83092c;

    public G(@NotNull String str, @NotNull MutableLongState mutableLongState, @NotNull SnapshotStateList snapshotStateList) {
        this.f83090a = str;
        this.f83091b = mutableLongState;
        this.f83092c = snapshotStateList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return Intrinsics.areEqual(this.f83090a, g7.f83090a) && Intrinsics.areEqual(this.f83091b, g7.f83091b) && Intrinsics.areEqual(this.f83092c, g7.f83092c);
    }

    public final int hashCode() {
        int iHashCode = this.f83090a.hashCode();
        return this.f83092c.hashCode() + ((this.f83091b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PlayerSettingSelect(title=" + this.f83090a + ", currentSelect=" + this.f83091b + ", items=" + this.f83092c + ")";
    }
}
