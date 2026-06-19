package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/b0.class */
@StabilityInferred(parameters = 1)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f83195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final VideoSettingJumpType f83197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Jr0.f f83198d;

    public b0(@NotNull String str, boolean z6, @NotNull VideoSettingJumpType videoSettingJumpType, @NotNull Jr0.f fVar) {
        this.f83195a = str;
        this.f83196b = z6;
        this.f83197c = videoSettingJumpType;
        this.f83198d = fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f83195a, b0Var.f83195a) && this.f83196b == b0Var.f83196b && this.f83197c == b0Var.f83197c && Intrinsics.areEqual(this.f83198d, b0Var.f83198d);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a(this.f83195a.hashCode() * 31, 31, this.f83196b);
        return this.f83198d.hashCode() + ((this.f83197c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "VideoSettingVertical(url=" + this.f83195a + ", needLogin=" + this.f83196b + ", jumpType=" + this.f83197c + ", badgeInfo=" + this.f83198d + ")";
    }
}
