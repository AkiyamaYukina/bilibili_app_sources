package com.bilibili.pegasus.components.videomode;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import androidx.room.B;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f77191a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("subTitle")
    @Nullable
    private final String f77192b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cancelButton")
    @Nullable
    private final String f77193c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("setButton")
    @Nullable
    private final String f77194d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("showTimeSec")
    private final int f77195e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("cardJumpEnable")
    private final int f77196f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("imageUrl")
    @Nullable
    private final String f77197g = null;

    @Nullable
    public final String a() {
        return this.f77193c;
    }

    @Nullable
    public final String b() {
        return this.f77197g;
    }

    @Nullable
    public final String c() {
        return this.f77194d;
    }

    public final long d() {
        int i7 = this.f77195e;
        if (i7 < 1) {
            return 5000L;
        }
        return ((long) i7) * 1000;
    }

    @Nullable
    public final String e() {
        return this.f77192b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f77191a, aVar.f77191a) && Intrinsics.areEqual(this.f77192b, aVar.f77192b) && Intrinsics.areEqual(this.f77193c, aVar.f77193c) && Intrinsics.areEqual(this.f77194d, aVar.f77194d) && this.f77195e == aVar.f77195e && this.f77196f == aVar.f77196f && Intrinsics.areEqual(this.f77197g, aVar.f77197g);
    }

    @Nullable
    public final String f() {
        return this.f77191a;
    }

    public final boolean g() {
        boolean z6 = true;
        if (this.f77196f != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean h() {
        String str;
        String str2 = this.f77191a;
        return (str2 == null || StringsKt.isBlank(str2) || (str = this.f77192b) == null || StringsKt.isBlank(str)) ? false : true;
    }

    public final int hashCode() {
        String str = this.f77191a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f77192b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77193c;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f77194d;
        int iA = I.a(this.f77196f, I.a(this.f77195e, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        String str5 = this.f77197g;
        return iA + (str5 == null ? 0 : str5.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f77191a;
        String str2 = this.f77192b;
        String str3 = this.f77193c;
        String str4 = this.f77194d;
        int i7 = this.f77195e;
        int i8 = this.f77196f;
        String str5 = this.f77197g;
        StringBuilder sbA = G0.b.a("GuideItem(title=", str, ", subTitle=", str2, ", cancelButton=");
        B.a(str3, ", setButton=", str4, ", showTimeSec=", sbA);
        C4690e.a(i7, i8, ", cardJumpEnable=", ", imageUrl=", sbA);
        return C8770a.a(sbA, str5, ")");
    }
}
