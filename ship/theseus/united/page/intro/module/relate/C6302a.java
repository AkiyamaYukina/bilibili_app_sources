package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/a.class */
@StabilityInferred(parameters = 1)
public final class C6302a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f101092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101093g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f101094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f101095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f101096k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f101097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f101098m;

    public C6302a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i7, String str8, int i8, int i9, int i10, int i11) {
        i9 = (i11 & 1024) != 0 ? 16 : i9;
        i10 = (i11 & 4096) != 0 ? 4 : i10;
        this.f101087a = str;
        this.f101088b = str2;
        this.f101089c = str3;
        this.f101090d = str4;
        this.f101091e = str5;
        this.f101092f = str6;
        this.f101093g = str7;
        this.h = i7;
        this.f101094i = str8;
        this.f101095j = i8;
        this.f101096k = i9;
        this.f101097l = 2;
        this.f101098m = i10;
    }

    public final boolean a() {
        return (StringsKt.isBlank(this.f101087a) || StringsKt.isBlank(this.f101088b)) ? false : true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6302a)) {
            return false;
        }
        C6302a c6302a = (C6302a) obj;
        return Intrinsics.areEqual(this.f101087a, c6302a.f101087a) && Intrinsics.areEqual(this.f101088b, c6302a.f101088b) && Intrinsics.areEqual(this.f101089c, c6302a.f101089c) && Intrinsics.areEqual(this.f101090d, c6302a.f101090d) && Intrinsics.areEqual(this.f101091e, c6302a.f101091e) && Intrinsics.areEqual(this.f101092f, c6302a.f101092f) && Intrinsics.areEqual(this.f101093g, c6302a.f101093g) && this.h == c6302a.h && Intrinsics.areEqual(this.f101094i, c6302a.f101094i) && this.f101095j == c6302a.f101095j && this.f101096k == c6302a.f101096k && this.f101097l == c6302a.f101097l && this.f101098m == c6302a.f101098m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101098m) + androidx.compose.animation.core.I.a(this.f101097l, androidx.compose.animation.core.I.a(this.f101096k, androidx.compose.animation.core.I.a(this.f101095j, I.E.a(androidx.compose.animation.core.I.a(this.h, I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(this.f101087a.hashCode() * 31, 31, this.f101088b), 31, this.f101089c), 31, this.f101090d), 31, this.f101091e), 31, this.f101092f), 31, this.f101093g), 31), 31, this.f101094i), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgeInfo(text=");
        sb.append(this.f101087a);
        sb.append(", textColor=");
        sb.append(this.f101088b);
        sb.append(", textColorNight=");
        sb.append(this.f101089c);
        sb.append(", bgColor=");
        sb.append(this.f101090d);
        sb.append(", bgColorNight=");
        sb.append(this.f101091e);
        sb.append(", borderColor=");
        sb.append(this.f101092f);
        sb.append(", borderColorNight=");
        sb.append(this.f101093g);
        sb.append(", bgStyle=");
        sb.append(this.h);
        sb.append(", img=");
        sb.append(this.f101094i);
        sb.append(", type=");
        sb.append(this.f101095j);
        sb.append(", height=");
        sb.append(this.f101096k);
        sb.append(", cornerRadius=");
        sb.append(this.f101097l);
        sb.append(", horizontalPadding=");
        return C4277b.a(this.f101098m, ")", sb);
    }
}
