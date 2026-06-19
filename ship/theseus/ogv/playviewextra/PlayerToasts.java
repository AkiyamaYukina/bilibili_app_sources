package com.bilibili.ship.theseus.ogv.playviewextra;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.google.gson.annotations.SerializedName;
import com.tencent.connect.common.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/PlayerToasts.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayerToasts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("1")
    @Nullable
    private final PlayerToastVo f94372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("2")
    @Nullable
    private final PlayerToastVo f94373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("4")
    @Nullable
    private final PlayerToastVo f94374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(Constants.VIA_REPORT_TYPE_JOININ_GROUP)
    @Nullable
    private final PlayerToastVo f94375d;

    public PlayerToasts(@Nullable PlayerToastVo playerToastVo, @Nullable PlayerToastVo playerToastVo2, @Nullable PlayerToastVo playerToastVo3, @Nullable PlayerToastVo playerToastVo4) {
        this.f94372a = playerToastVo;
        this.f94373b = playerToastVo2;
        this.f94374c = playerToastVo3;
        this.f94375d = playerToastVo4;
    }

    @Nullable
    public final PlayerToastVo a() {
        return this.f94375d;
    }

    @Nullable
    public final PlayerToastVo b() {
        return this.f94374c;
    }

    @Nullable
    public final PlayerToastVo c() {
        return this.f94373b;
    }

    @Nullable
    public final PlayerToastVo d() {
        return this.f94372a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerToasts)) {
            return false;
        }
        PlayerToasts playerToasts = (PlayerToasts) obj;
        return Intrinsics.areEqual(this.f94372a, playerToasts.f94372a) && Intrinsics.areEqual(this.f94373b, playerToasts.f94373b) && Intrinsics.areEqual(this.f94374c, playerToasts.f94374c) && Intrinsics.areEqual(this.f94375d, playerToasts.f94375d);
    }

    public final int hashCode() {
        PlayerToastVo playerToastVo = this.f94372a;
        int iHashCode = 0;
        int iHashCode2 = playerToastVo == null ? 0 : playerToastVo.hashCode();
        PlayerToastVo playerToastVo2 = this.f94373b;
        int iHashCode3 = playerToastVo2 == null ? 0 : playerToastVo2.hashCode();
        PlayerToastVo playerToastVo3 = this.f94374c;
        int iHashCode4 = playerToastVo3 == null ? 0 : playerToastVo3.hashCode();
        PlayerToastVo playerToastVo4 = this.f94375d;
        if (playerToastVo4 != null) {
            iHashCode = playerToastVo4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "PlayerToasts(vipRightsRemindToast=" + this.f94372a + ", vipQualityRightsRemindToast=" + this.f94373b + ", ogvStartToast=" + this.f94374c + ", ctccToast=" + this.f94375d + ")";
    }
}
