package com.bilibili.module.vip.mall;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPayGift.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VipPayGift {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL)
    @NotNull
    private final String f66223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f66224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final String f66225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("prize_id")
    @NotNull
    private final String f66226d;

    public VipPayGift(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        this.f66223a = str;
        this.f66224b = str2;
        this.f66225c = str3;
        this.f66226d = str4;
    }

    @NotNull
    public final String a() {
        return this.f66223a;
    }

    @NotNull
    public final String b() {
        return this.f66226d;
    }

    @NotNull
    public final String c() {
        return this.f66225c;
    }

    @Nullable
    public final String d() {
        return this.f66224b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipPayGift)) {
            return false;
        }
        VipPayGift vipPayGift = (VipPayGift) obj;
        return Intrinsics.areEqual(this.f66223a, vipPayGift.f66223a) && Intrinsics.areEqual(this.f66224b, vipPayGift.f66224b) && Intrinsics.areEqual(this.f66225c, vipPayGift.f66225c) && Intrinsics.areEqual(this.f66226d, vipPayGift.f66226d);
    }

    public final int hashCode() {
        int iHashCode = this.f66223a.hashCode();
        String str = this.f66224b;
        return this.f66226d.hashCode() + E.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66225c);
    }

    @NotNull
    public final String toString() {
        return androidx.fragment.app.A.a(this.f66225c, ", prizeId=", this.f66226d, ")", G0.b.a("VipPayGift(imageUrl=", this.f66223a, ", title=", this.f66224b, ", subtitle="));
    }
}
