package com.bilibili.module.vip.combine;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.vip.VipPrivilegeType;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTips.class */
@StabilityInferred(parameters = 0)
@Bson
public final class VipPaymentTips {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VipPrivilegeType f66143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("image")
    @NotNull
    private final String f66144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f66145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final String f66146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f66147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<VipPrivilegeButton> f66148f;

    public VipPaymentTips() {
        throw null;
    }

    public VipPaymentTips(VipPrivilegeType vipPrivilegeType, String str, String str2, String str3, String str4, List list, int i7) {
        this.f66143a = (i7 & 1) != 0 ? VipPrivilegeType.CommentImgGif : vipPrivilegeType;
        this.f66144b = str;
        this.f66145c = str2;
        this.f66146d = str3;
        this.f66147e = str4;
        this.f66148f = list;
    }

    @NotNull
    public final String a() {
        return this.f66144b;
    }

    @NotNull
    public final String b() {
        return this.f66146d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipPaymentTips)) {
            return false;
        }
        VipPaymentTips vipPaymentTips = (VipPaymentTips) obj;
        return this.f66143a == vipPaymentTips.f66143a && Intrinsics.areEqual(this.f66144b, vipPaymentTips.f66144b) && Intrinsics.areEqual(this.f66145c, vipPaymentTips.f66145c) && Intrinsics.areEqual(this.f66146d, vipPaymentTips.f66146d) && Intrinsics.areEqual(this.f66147e, vipPaymentTips.f66147e) && Intrinsics.areEqual(this.f66148f, vipPaymentTips.f66148f);
    }

    public final int hashCode() {
        return this.f66148f.hashCode() + E.a(E.a(E.a(E.a(this.f66143a.hashCode() * 31, 31, this.f66144b), 31, this.f66145c), 31, this.f66146d), 31, this.f66147e);
    }

    @NotNull
    public final String toString() {
        String str = this.f66144b;
        String str2 = this.f66146d;
        List<VipPrivilegeButton> list = this.f66148f;
        StringBuilder sb = new StringBuilder("VipPaymentTips(rightsType=");
        sb.append(this.f66143a);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(", title=");
        B.a(this.f66145c, ", subtitle=", str2, ", pricePanelTitle=", sb);
        return N1.o.a(this.f66147e, ", buttons=", ")", sb, list);
    }
}
