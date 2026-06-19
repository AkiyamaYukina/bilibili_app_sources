package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class GuideStripVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("text")
    @NotNull
    private final String f100081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("text_extra")
    @NotNull
    private final String f100082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f100083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f100084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f100085g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("url_text")
    @NotNull
    private final String f100086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f100087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HonorType f100088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final HonorJumpType f100089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("report")
    @NotNull
    private final Map<String, String> f100090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f100091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final ProfessionHonorExtend f100092o;

    public GuideStripVo() {
        throw null;
    }

    public GuideStripVo(String str, String str2, String str3, String str4, int i7, int i8, int i9, int i10, String str5, String str6, HonorType honorType, HonorJumpType honorJumpType, Map map, String str7, ProfessionHonorExtend professionHonorExtend, int i11) {
        honorType = (i11 & 1024) != 0 ? HonorType.TYPE_50_HEIGHT : honorType;
        honorJumpType = (i11 & 2048) != 0 ? HonorJumpType.HONOR_JUMP_TYPE_UNKNOWN : honorJumpType;
        this.f100079a = str;
        this.f100080b = str2;
        this.f100081c = str3;
        this.f100082d = str4;
        this.f100083e = i7;
        this.f100084f = i8;
        this.f100085g = i9;
        this.h = i10;
        this.f100086i = str5;
        this.f100087j = str6;
        this.f100088k = honorType;
        this.f100089l = honorJumpType;
        this.f100090m = map;
        this.f100091n = str7;
        this.f100092o = professionHonorExtend;
    }

    @NotNull
    public final String a() {
        return this.f100086i;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f100090m;
    }

    @NotNull
    public final String c() {
        return this.f100082d;
    }

    @NotNull
    public final String d() {
        return this.f100081c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuideStripVo)) {
            return false;
        }
        GuideStripVo guideStripVo = (GuideStripVo) obj;
        return Intrinsics.areEqual(this.f100079a, guideStripVo.f100079a) && Intrinsics.areEqual(this.f100080b, guideStripVo.f100080b) && Intrinsics.areEqual(this.f100081c, guideStripVo.f100081c) && Intrinsics.areEqual(this.f100082d, guideStripVo.f100082d) && this.f100083e == guideStripVo.f100083e && this.f100084f == guideStripVo.f100084f && this.f100085g == guideStripVo.f100085g && this.h == guideStripVo.h && Intrinsics.areEqual(this.f100086i, guideStripVo.f100086i) && Intrinsics.areEqual(this.f100087j, guideStripVo.f100087j) && this.f100088k == guideStripVo.f100088k && this.f100089l == guideStripVo.f100089l && Intrinsics.areEqual(this.f100090m, guideStripVo.f100090m) && Intrinsics.areEqual(this.f100091n, guideStripVo.f100091n) && Intrinsics.areEqual(this.f100092o, guideStripVo.f100092o);
    }

    public final int hashCode() {
        int iA = E.a(J2.g.a((this.f100089l.hashCode() + ((this.f100088k.hashCode() + E.a(E.a(I.a(this.h, I.a(this.f100085g, I.a(this.f100084f, I.a(this.f100083e, E.a(E.a(E.a(this.f100079a.hashCode() * 31, 31, this.f100080b), 31, this.f100081c), 31, this.f100082d), 31), 31), 31), 31), 31, this.f100086i), 31, this.f100087j)) * 31)) * 31, this.f100090m, 31), 31, this.f100091n);
        ProfessionHonorExtend professionHonorExtend = this.f100092o;
        return iA + (professionHonorExtend == null ? 0 : professionHonorExtend.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f100081c;
        String str2 = this.f100082d;
        String str3 = this.f100086i;
        Map<String, String> map = this.f100090m;
        StringBuilder sb = new StringBuilder("GuideStripVo(icon=");
        sb.append(this.f100079a);
        sb.append(", iconNight=");
        B.a(this.f100080b, ", title=", str, ", subtitle=", sb);
        sb.append(str2);
        sb.append(", textColor=");
        sb.append(this.f100083e);
        sb.append(", textColorNight=");
        sb.append(this.f100084f);
        sb.append(", bgColor=");
        sb.append(this.f100085g);
        sb.append(", bgColorNight=");
        M.a(this.h, ", button=", str3, ", url=", sb);
        sb.append(this.f100087j);
        sb.append(", type=");
        sb.append(this.f100088k);
        sb.append(", honorJumpType=");
        sb.append(this.f100089l);
        sb.append(", reportParams=");
        sb.append(map);
        sb.append(", endIcon=");
        sb.append(this.f100091n);
        sb.append(", professionExt=");
        sb.append(this.f100092o);
        sb.append(")");
        return sb.toString();
    }
}
