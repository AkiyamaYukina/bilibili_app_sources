package com.bilibili.module.vip.mall;

import I.E;
import a5.C3188c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPayResultInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class VipPayResultInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("order_no")
    @Nullable
    private final String f66229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dialog")
    @Nullable
    private final VipPayResultDialogContentInfo f66230c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPayResultInfo$VipPayResultDialogContentInfo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class VipPayResultDialogContentInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f66231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f66232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("left_button")
        @Nullable
        private final String f66233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("left_link")
        @Nullable
        private final String f66234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("right_button")
        @Nullable
        private final String f66235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @SerializedName("right_link")
        @Nullable
        private final String f66236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @SerializedName("top_image")
        @NotNull
        private final String f66237g;

        @SerializedName("corner_mark")
        @Nullable
        private final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @SerializedName("follow")
        private final boolean f66238i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @SerializedName("gift_title")
        @Nullable
        private final String f66239j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @SerializedName("gift_list")
        @Nullable
        private final List<VipPayGift> f66240k;

        public VipPayResultDialogContentInfo() {
            throw null;
        }

        public VipPayResultDialogContentInfo(String str, String str2, boolean z6, String str3, String str4, String str5, String str6, List list, String str7, int i7, String str8, String str9) {
            str = (i7 & 1) != 0 ? null : str;
            str2 = (i7 & 2) != 0 ? null : str2;
            str3 = (i7 & 4) != 0 ? null : str3;
            str4 = (i7 & 8) != 0 ? null : str4;
            str5 = (i7 & 16) != 0 ? null : str5;
            str6 = (i7 & 32) != 0 ? null : str6;
            str8 = (i7 & 128) != 0 ? null : str8;
            z6 = (i7 & 256) != 0 ? false : z6;
            str9 = (i7 & 512) != 0 ? null : str9;
            list = (i7 & 1024) != 0 ? null : list;
            this.f66231a = str;
            this.f66232b = str2;
            this.f66233c = str3;
            this.f66234d = str4;
            this.f66235e = str5;
            this.f66236f = str6;
            this.f66237g = str7;
            this.h = str8;
            this.f66238i = z6;
            this.f66239j = str9;
            this.f66240k = list;
        }

        @Nullable
        public final String a() {
            return this.h;
        }

        public final boolean b() {
            return this.f66238i;
        }

        @Nullable
        public final List<VipPayGift> c() {
            return this.f66240k;
        }

        @Nullable
        public final String d() {
            return this.f66239j;
        }

        @NotNull
        public final String e() {
            return this.f66237g;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VipPayResultDialogContentInfo)) {
                return false;
            }
            VipPayResultDialogContentInfo vipPayResultDialogContentInfo = (VipPayResultDialogContentInfo) obj;
            return Intrinsics.areEqual(this.f66231a, vipPayResultDialogContentInfo.f66231a) && Intrinsics.areEqual(this.f66232b, vipPayResultDialogContentInfo.f66232b) && Intrinsics.areEqual(this.f66233c, vipPayResultDialogContentInfo.f66233c) && Intrinsics.areEqual(this.f66234d, vipPayResultDialogContentInfo.f66234d) && Intrinsics.areEqual(this.f66235e, vipPayResultDialogContentInfo.f66235e) && Intrinsics.areEqual(this.f66236f, vipPayResultDialogContentInfo.f66236f) && Intrinsics.areEqual(this.f66237g, vipPayResultDialogContentInfo.f66237g) && Intrinsics.areEqual(this.h, vipPayResultDialogContentInfo.h) && this.f66238i == vipPayResultDialogContentInfo.f66238i && Intrinsics.areEqual(this.f66239j, vipPayResultDialogContentInfo.f66239j) && Intrinsics.areEqual(this.f66240k, vipPayResultDialogContentInfo.f66240k);
        }

        @Nullable
        public final String f() {
            return this.f66234d;
        }

        @Nullable
        public final String g() {
            return this.f66233c;
        }

        @Nullable
        public final String h() {
            return this.f66236f;
        }

        public final int hashCode() {
            String str = this.f66231a;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.f66232b;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f66233c;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.f66234d;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.f66235e;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.f66236f;
            int iA = E.a(((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f66237g);
            String str7 = this.h;
            int iA2 = androidx.compose.animation.z.a((iA + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.f66238i);
            String str8 = this.f66239j;
            int iHashCode6 = str8 == null ? 0 : str8.hashCode();
            List<VipPayGift> list = this.f66240k;
            return ((iA2 + iHashCode6) * 31) + (list == null ? 0 : list.hashCode());
        }

        @Nullable
        public final String i() {
            return this.f66235e;
        }

        @NotNull
        public final String toString() {
            String str = this.f66233c;
            String str2 = this.f66234d;
            String str3 = this.f66235e;
            String str4 = this.f66236f;
            String str5 = this.f66237g;
            String str6 = this.h;
            boolean z6 = this.f66238i;
            String str7 = this.f66239j;
            List<VipPayGift> list = this.f66240k;
            StringBuilder sb = new StringBuilder("VipPayResultDialogContentInfo(title=");
            sb.append(this.f66231a);
            sb.append(", content=");
            androidx.room.B.a(this.f66232b, ", leftButtonText=", str, ", leftButtonLink=", sb);
            androidx.room.B.a(str2, ", rightButtonText=", str3, ", rightButtonLink=", sb);
            androidx.room.B.a(str4, ", headerImageUrl=", str5, ", badgeText=", sb);
            C3188c.a(str6, ", followVisible=", ", giftTitle=", sb, z6);
            return N1.o.a(str7, ", giftList=", ")", sb, list);
        }
    }

    public VipPayResultInfo() {
        this(0, null, null, 7);
    }

    public VipPayResultInfo(int i7, String str, VipPayResultDialogContentInfo vipPayResultDialogContentInfo, int i8) {
        i7 = (i8 & 1) != 0 ? 0 : i7;
        str = (i8 & 2) != 0 ? null : str;
        vipPayResultDialogContentInfo = (i8 & 4) != 0 ? null : vipPayResultDialogContentInfo;
        this.f66228a = i7;
        this.f66229b = str;
        this.f66230c = vipPayResultDialogContentInfo;
    }

    @Nullable
    public final VipPayResultDialogContentInfo a() {
        return this.f66230c;
    }

    @Nullable
    public final String b() {
        return this.f66229b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipPayResultInfo)) {
            return false;
        }
        VipPayResultInfo vipPayResultInfo = (VipPayResultInfo) obj;
        return this.f66228a == vipPayResultInfo.f66228a && Intrinsics.areEqual(this.f66229b, vipPayResultInfo.f66229b) && Intrinsics.areEqual(this.f66230c, vipPayResultInfo.f66230c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f66228a);
        String str = this.f66229b;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        VipPayResultDialogContentInfo vipPayResultDialogContentInfo = this.f66230c;
        if (vipPayResultDialogContentInfo != null) {
            iHashCode2 = vipPayResultDialogContentInfo.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        String str = this.f66229b;
        VipPayResultDialogContentInfo vipPayResultDialogContentInfo = this.f66230c;
        StringBuilder sb = new StringBuilder("VipPayResultInfo(status=");
        M.a(this.f66228a, ", orderId=", str, ", message=", sb);
        sb.append(vipPayResultDialogContentInfo);
        sb.append(")");
        return sb.toString();
    }
}
