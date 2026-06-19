package com.bilibili.pegasus.components.videomode;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private String f77198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("subTitle")
    @Nullable
    private String f77199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("showTimeSec")
    private int f77200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("cardJumpEnable")
    private int f77201d;

    public b() {
        this(0);
    }

    public b(int i7) {
        this.f77198a = null;
        this.f77199b = null;
        this.f77200c = 0;
        this.f77201d = 0;
    }

    public final long a() {
        int i7 = this.f77200c;
        if (i7 < 1) {
            return 5000L;
        }
        return ((long) i7) * 1000;
    }

    @Nullable
    public final String b() {
        return this.f77199b;
    }

    @Nullable
    public final String c() {
        return this.f77198a;
    }

    public final boolean d() {
        boolean z6 = true;
        if (this.f77201d != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean e() {
        String str;
        String str2 = this.f77198a;
        return (str2 == null || StringsKt.isBlank(str2) || (str = this.f77199b) == null || StringsKt.isBlank(str)) ? false : true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f77198a, bVar.f77198a) && Intrinsics.areEqual(this.f77199b, bVar.f77199b) && this.f77200c == bVar.f77200c && this.f77201d == bVar.f77201d;
    }

    public final int hashCode() {
        String str = this.f77198a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77199b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Integer.hashCode(this.f77201d) + I.a(this.f77200c, ((iHashCode2 * 31) + iHashCode) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return androidx.constraintlayout.widget.d.a(this.f77200c, this.f77201d, ", cardJumpEnable=", ")", G0.b.a("VideoModeGuidanceConfig(title=", this.f77198a, ", subTitle=", this.f77199b, ", showTimeSec="));
    }
}
