package com.bilibili.ship.theseus.ugc.charge;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ResidentBar.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ResidentBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("question_text")
    @Nullable
    private final TextVo f96422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("icon")
    @Nullable
    private final String f96423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("button")
    @Nullable
    private final TextVo f96424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("report")
    @Nullable
    private final ReportVo f96425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("link")
    @NotNull
    private final String f96426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("bg_image")
    @Nullable
    private final String f96427f;

    public ResidentBar(TextVo textVo, String str, TextVo textVo2, ReportVo reportVo, String str2, String str3, int i7) {
        textVo = (i7 & 1) != 0 ? null : textVo;
        str = (i7 & 2) != 0 ? null : str;
        textVo2 = (i7 & 4) != 0 ? null : textVo2;
        reportVo = (i7 & 8) != 0 ? null : reportVo;
        this.f96422a = textVo;
        this.f96423b = str;
        this.f96424c = textVo2;
        this.f96425d = reportVo;
        this.f96426e = str2;
        this.f96427f = str3;
    }

    @Nullable
    public final String a() {
        return this.f96427f;
    }

    @Nullable
    public final TextVo b() {
        return this.f96424c;
    }

    @Nullable
    public final String c() {
        return this.f96423b;
    }

    @NotNull
    public final String d() {
        return this.f96426e;
    }

    @Nullable
    public final ReportVo e() {
        return this.f96425d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResidentBar)) {
            return false;
        }
        ResidentBar residentBar = (ResidentBar) obj;
        return Intrinsics.areEqual(this.f96422a, residentBar.f96422a) && Intrinsics.areEqual(this.f96423b, residentBar.f96423b) && Intrinsics.areEqual(this.f96424c, residentBar.f96424c) && Intrinsics.areEqual(this.f96425d, residentBar.f96425d) && Intrinsics.areEqual(this.f96426e, residentBar.f96426e) && Intrinsics.areEqual(this.f96427f, residentBar.f96427f);
    }

    @Nullable
    public final TextVo f() {
        return this.f96422a;
    }

    public final int hashCode() {
        TextVo textVo = this.f96422a;
        int iHashCode = textVo == null ? 0 : textVo.hashCode();
        String str = this.f96423b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        TextVo textVo2 = this.f96424c;
        int iHashCode3 = textVo2 == null ? 0 : textVo2.hashCode();
        ReportVo reportVo = this.f96425d;
        int iA = E.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (reportVo == null ? 0 : reportVo.hashCode())) * 31, 31, this.f96426e);
        String str2 = this.f96427f;
        return iA + (str2 == null ? 0 : str2.hashCode());
    }

    @NotNull
    public final String toString() {
        TextVo textVo = this.f96422a;
        String str = this.f96423b;
        TextVo textVo2 = this.f96424c;
        ReportVo reportVo = this.f96425d;
        String str2 = this.f96426e;
        String str3 = this.f96427f;
        StringBuilder sb = new StringBuilder("ResidentBar(text=");
        sb.append(textVo);
        sb.append(", icon=");
        sb.append(str);
        sb.append(", button=");
        sb.append(textVo2);
        sb.append(", report=");
        sb.append(reportVo);
        sb.append(", link=");
        return A.a(str2, ", bgImage=", str3, ")", sb);
    }
}
