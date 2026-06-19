package com.bilibili.ship.theseus.united.page.playviewextra;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PlayerToastVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayerToastVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("toast_text")
    @Nullable
    private final TextVo f102389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f102390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ReportVo f102391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f102392d;

    public PlayerToastVo(@Nullable TextVo textVo, @Nullable TextVo textVo2, @Nullable ReportVo reportVo, @Nullable String str) {
        this.f102389a = textVo;
        this.f102390b = textVo2;
        this.f102391c = reportVo;
        this.f102392d = str;
    }

    @Nullable
    public final TextVo a() {
        return this.f102389a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerToastVo)) {
            return false;
        }
        PlayerToastVo playerToastVo = (PlayerToastVo) obj;
        return Intrinsics.areEqual(this.f102389a, playerToastVo.f102389a) && Intrinsics.areEqual(this.f102390b, playerToastVo.f102390b) && Intrinsics.areEqual(this.f102391c, playerToastVo.f102391c) && Intrinsics.areEqual(this.f102392d, playerToastVo.f102392d);
    }

    public final int hashCode() {
        TextVo textVo = this.f102389a;
        int iHashCode = 0;
        int iHashCode2 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f102390b;
        int iHashCode3 = textVo2 == null ? 0 : textVo2.hashCode();
        ReportVo reportVo = this.f102391c;
        int iHashCode4 = reportVo == null ? 0 : reportVo.hashCode();
        String str = this.f102392d;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "PlayerToastVo(title=" + this.f102389a + ", button=" + this.f102390b + ", report=" + this.f102391c + ", icon=" + this.f102392d + ")";
    }
}
