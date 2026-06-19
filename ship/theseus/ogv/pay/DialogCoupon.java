package com.bilibili.ship.theseus.ogv.pay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.bson.common.Bson;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/DialogCoupon.class */
@StabilityInferred(parameters = 1)
@Bson
public final class DialogCoupon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("coupon_token")
    @Nullable
    private final String f94142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f94143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("otype")
    @Nullable
    private final Long f94144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f94145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("use_desc")
    @Nullable
    private final String f94146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f94147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f94148g;

    @SerializedName("pay_button_text")
    @Nullable
    private final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("pay_button_text_line_through")
    @Nullable
    private final String f94149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final transient PurchaseType f94150j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/DialogCoupon$PurchaseType.class */
    public static final class PurchaseType {
        private static final EnumEntries $ENTRIES;
        private static final PurchaseType[] $VALUES;
        public static final PurchaseType EXCHANGE = new PurchaseType("EXCHANGE", 0);
        public static final PurchaseType PAYMENT = new PurchaseType("PAYMENT", 1);

        private static final /* synthetic */ PurchaseType[] $values() {
            return new PurchaseType[]{EXCHANGE, PAYMENT};
        }

        static {
            PurchaseType[] purchaseTypeArr$values = $values();
            $VALUES = purchaseTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(purchaseTypeArr$values);
        }

        private PurchaseType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<PurchaseType> getEntries() {
            return $ENTRIES;
        }

        public static PurchaseType valueOf(String str) {
            return (PurchaseType) Enum.valueOf(PurchaseType.class, str);
        }

        public static PurchaseType[] values() {
            return (PurchaseType[]) $VALUES.clone();
        }
    }

    public DialogCoupon() {
        this(null, null, null, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE);
    }

    public DialogCoupon(@Nullable String str, @Nullable Long l7, @Nullable Long l8, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.f94142a = str;
        this.f94143b = l7;
        this.f94144c = l8;
        this.f94145d = str2;
        this.f94146e = str3;
        this.f94147f = str4;
        this.f94148g = str5;
        this.h = str6;
        this.f94149i = str7;
        this.f94150j = ((l7 != null && l7.longValue() == 4) || (l7 != null && l7.longValue() == 5)) ? PurchaseType.EXCHANGE : PurchaseType.PAYMENT;
    }

    public /* synthetic */ DialogCoupon(String str, Long l7, Long l8, String str2, String str3, String str4, String str5, String str6, String str7, int i7) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : l7, (i7 & 4) != 0 ? null : l8, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & 256) != 0 ? null : str7);
    }

    @Nullable
    public final String a() {
        return this.f94142a;
    }

    @Nullable
    public final Long b() {
        return this.f94144c;
    }

    @Nullable
    public final String c() {
        return this.h;
    }

    @Nullable
    public final String d() {
        return this.f94149i;
    }

    @Nullable
    public final String e() {
        return this.f94146e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogCoupon)) {
            return false;
        }
        DialogCoupon dialogCoupon = (DialogCoupon) obj;
        return Intrinsics.areEqual(this.f94142a, dialogCoupon.f94142a) && Intrinsics.areEqual(this.f94143b, dialogCoupon.f94143b) && Intrinsics.areEqual(this.f94144c, dialogCoupon.f94144c) && Intrinsics.areEqual(this.f94145d, dialogCoupon.f94145d) && Intrinsics.areEqual(this.f94146e, dialogCoupon.f94146e) && Intrinsics.areEqual(this.f94147f, dialogCoupon.f94147f) && Intrinsics.areEqual(this.f94148g, dialogCoupon.f94148g) && Intrinsics.areEqual(this.h, dialogCoupon.h) && Intrinsics.areEqual(this.f94149i, dialogCoupon.f94149i);
    }

    public final int hashCode() {
        String str = this.f94142a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Long l7 = this.f94143b;
        int iHashCode3 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.f94144c;
        int iHashCode4 = l8 == null ? 0 : l8.hashCode();
        String str2 = this.f94145d;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f94146e;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f94147f;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f94148g;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.h;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.f94149i;
        if (str7 != null) {
            iHashCode = str7.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f94142a;
        Long l7 = this.f94144c;
        String str2 = this.f94146e;
        String str3 = this.h;
        String str4 = this.f94149i;
        StringBuilder sbA = l0.a("DialogCoupon(couponToken=", str, ", type=");
        sbA.append(this.f94143b);
        sbA.append(", oType=");
        sbA.append(l7);
        sbA.append(", value=");
        B.a(this.f94145d, ", useDesc=", str2, ", title=", sbA);
        sbA.append(this.f94147f);
        sbA.append(", desc=");
        B.a(this.f94148g, ", payButtonText=", str3, ", payButtonTextLineThrough=", sbA);
        return C8770a.a(sbA, str4, ")");
    }
}
