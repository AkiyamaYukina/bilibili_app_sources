package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedActivitySeasonShow.class */
@StabilityInferred(parameters = 1)
@Bson
public final class UnitedActivitySeasonShow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("button_text")
    @NotNull
    private final String f101503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("join_text")
    @NotNull
    private final String f101504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("rule_text")
    @NotNull
    private final String f101505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("checkin_text")
    @NotNull
    private final String f101506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("checkin_prompt")
    @NotNull
    private final String f101507e;

    public UnitedActivitySeasonShow(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.f101503a = str;
        this.f101504b = str2;
        this.f101505c = str3;
        this.f101506d = str4;
        this.f101507e = str5;
    }

    @NotNull
    public final String a() {
        return this.f101503a;
    }

    @NotNull
    public final String b() {
        return this.f101507e;
    }

    @NotNull
    public final String c() {
        return this.f101506d;
    }

    @NotNull
    public final String d() {
        return this.f101504b;
    }

    @NotNull
    public final String e() {
        return this.f101505c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnitedActivitySeasonShow)) {
            return false;
        }
        UnitedActivitySeasonShow unitedActivitySeasonShow = (UnitedActivitySeasonShow) obj;
        return Intrinsics.areEqual(this.f101503a, unitedActivitySeasonShow.f101503a) && Intrinsics.areEqual(this.f101504b, unitedActivitySeasonShow.f101504b) && Intrinsics.areEqual(this.f101505c, unitedActivitySeasonShow.f101505c) && Intrinsics.areEqual(this.f101506d, unitedActivitySeasonShow.f101506d) && Intrinsics.areEqual(this.f101507e, unitedActivitySeasonShow.f101507e);
    }

    public final int hashCode() {
        return this.f101507e.hashCode() + I.E.a(I.E.a(I.E.a(this.f101503a.hashCode() * 31, 31, this.f101504b), 31, this.f101505c), 31, this.f101506d);
    }

    @NotNull
    public final String toString() {
        String str = this.f101503a;
        String str2 = this.f101504b;
        String str3 = this.f101505c;
        String str4 = this.f101506d;
        String str5 = this.f101507e;
        StringBuilder sbA = G0.b.a("UnitedActivitySeasonShow(buttonText=", str, ", joinText=", str2, ", ruleText=");
        androidx.room.B.a(str3, ", checkInText=", str4, ", checkInPrompt=", sbA);
        return C8770a.a(sbA, str5, ")");
    }
}
