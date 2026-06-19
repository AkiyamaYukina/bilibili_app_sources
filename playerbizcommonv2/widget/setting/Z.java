package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/Z.class */
@StabilityInferred(parameters = 1)
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f83176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f83178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f83179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final VideoSettingJumpType f83180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Jr0.f f83181f;

    public Z(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, @NotNull VideoSettingJumpType videoSettingJumpType, @Nullable Jr0.f fVar) {
        this.f83176a = str;
        this.f83177b = str2;
        this.f83178c = str3;
        this.f83179d = z6;
        this.f83180e = videoSettingJumpType;
        this.f83181f = fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return Intrinsics.areEqual(this.f83176a, z6.f83176a) && Intrinsics.areEqual(this.f83177b, z6.f83177b) && Intrinsics.areEqual(this.f83178c, z6.f83178c) && this.f83179d == z6.f83179d && this.f83180e == z6.f83180e && Intrinsics.areEqual(this.f83181f, z6.f83181f);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a(I.E.a(I.E.a(this.f83176a.hashCode() * 31, 31, this.f83177b), 31, this.f83178c), 31, this.f83179d);
        int iHashCode = this.f83180e.hashCode();
        Jr0.f fVar = this.f83181f;
        return ((iHashCode + iA) * 31) + (fVar == null ? 0 : fVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "VideoSettingMore(url=" + this.f83176a + ", description=" + this.f83177b + ", iconRes=" + this.f83178c + ", needLogin=" + this.f83179d + ", jumpType=" + this.f83180e + ", badgeInfo=" + this.f83181f + ")";
    }
}
