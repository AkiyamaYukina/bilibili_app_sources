package com.bilibili.studio.videocompile.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f108706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f108707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f108708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f108709e;

    public b() {
        this(0, null, null, null, null, 31);
    }

    public b(int i7, String str, String str2, Integer num, String str3, int i8) {
        i7 = (i8 & 1) != 0 ? 0 : i7;
        str = (i8 & 2) != 0 ? null : str;
        str2 = (i8 & 4) != 0 ? null : str2;
        num = (i8 & 8) != 0 ? null : num;
        str3 = (i8 & 16) != 0 ? null : str3;
        this.f108705a = i7;
        this.f108706b = str;
        this.f108707c = str2;
        this.f108708d = num;
        this.f108709e = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f108705a == bVar.f108705a && Intrinsics.areEqual(this.f108706b, bVar.f108706b) && Intrinsics.areEqual(this.f108707c, bVar.f108707c) && Intrinsics.areEqual(this.f108708d, bVar.f108708d) && Intrinsics.areEqual(this.f108709e, bVar.f108709e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f108705a);
        int iHashCode2 = 0;
        String str = this.f108706b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f108707c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.f108708d;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str3 = this.f108709e;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BVideoCompileStateData(state=");
        sb.append(this.f108705a);
        sb.append(", videoPath=");
        sb.append(this.f108706b);
        sb.append(", dcimPath=");
        sb.append(this.f108707c);
        sb.append(", errorCode=");
        sb.append(this.f108708d);
        sb.append(", errorInfo=");
        return C8770a.a(sb, this.f108709e, ")");
    }
}
