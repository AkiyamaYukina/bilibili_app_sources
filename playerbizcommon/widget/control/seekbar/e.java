package com.bilibili.playerbizcommon.widget.control.seekbar;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f80634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f80635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f80636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f80637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f80638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f80639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f80640g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f80641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f80642j;

    public /* synthetic */ e() {
        this(null, -1L, null, null, null, null, null, null, null, null);
    }

    public e(@Nullable String str, long j7, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f80634a = j7;
        this.f80635b = str;
        this.f80636c = str2;
        this.f80637d = str3;
        this.f80638e = str4;
        this.f80639f = str5;
        this.f80640g = str6;
        this.h = str7;
        this.f80641i = str8;
        this.f80642j = str9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f80634a == eVar.f80634a && Intrinsics.areEqual(this.f80635b, eVar.f80635b) && Intrinsics.areEqual(this.f80636c, eVar.f80636c) && Intrinsics.areEqual(this.f80637d, eVar.f80637d) && Intrinsics.areEqual(this.f80638e, eVar.f80638e) && Intrinsics.areEqual(this.f80639f, eVar.f80639f) && Intrinsics.areEqual(this.f80640g, eVar.f80640g) && Intrinsics.areEqual(this.h, eVar.h) && Intrinsics.areEqual(this.f80641i, eVar.f80641i) && Intrinsics.areEqual(this.f80642j, eVar.f80642j);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f80634a);
        int iHashCode2 = 0;
        String str = this.f80635b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f80636c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f80637d;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f80638e;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f80639f;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f80640g;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.h;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.f80641i;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.f80642j;
        if (str9 != null) {
            iHashCode2 = str9.hashCode();
        }
        return (((((((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SeekbarThumbInfo(cid=");
        sb.append(this.f80634a);
        sb.append(", lottie1=");
        sb.append(this.f80635b);
        sb.append(", lottie2=");
        sb.append(this.f80636c);
        sb.append(", iconLeft=");
        sb.append(this.f80637d);
        sb.append(", iconMiddle=");
        sb.append(this.f80638e);
        sb.append(", iconRight=");
        sb.append(this.f80639f);
        sb.append(", spriteDragImg=");
        sb.append(this.f80640g);
        sb.append(", spriteDragMeta=");
        sb.append(this.h);
        sb.append(", spriteFinishImg=");
        sb.append(this.f80641i);
        sb.append(", spriteFinishMeta=");
        return C8770a.a(sb, this.f80642j, ")");
    }
}
