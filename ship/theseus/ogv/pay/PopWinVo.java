package com.bilibili.ship.theseus.ogv.pay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/PopWinVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PopWinVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f94173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f94174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("desc")
    @Nullable
    private final TextVo f94175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<DialogCoupon> f94176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<TextVo> f94177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("bottom_text")
    @Nullable
    private final TextVo f94178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("pop_type")
    @NotNull
    private final Type f94179g;

    @Nullable
    public final ReportVo h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/PopWinVo$Type.class */
    public static final class Type implements com.bilibili.bson.adapter.a<String> {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;
        public static final Type COMMON = new Type("COMMON", 0, "common");
        public static final Type COUPON = new Type("COUPON", 1, "coupon");

        @NotNull
        private final String value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{COMMON, COUPON};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private Type(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public String getValue() {
            return this.value;
        }
    }

    public PopWinVo() {
        throw null;
    }

    public PopWinVo(String str, TextVo textVo, TextVo textVo2, List list, List list2, TextVo textVo3, Type type, ReportVo reportVo, int i7) {
        str = (i7 & 1) != 0 ? null : str;
        textVo = (i7 & 2) != 0 ? null : textVo;
        textVo2 = (i7 & 4) != 0 ? null : textVo2;
        textVo3 = (i7 & 32) != 0 ? null : textVo3;
        type = (i7 & 64) != 0 ? Type.COMMON : type;
        reportVo = (i7 & 128) != 0 ? null : reportVo;
        this.f94173a = str;
        this.f94174b = textVo;
        this.f94175c = textVo2;
        this.f94176d = list;
        this.f94177e = list2;
        this.f94178f = textVo3;
        this.f94179g = type;
        this.h = reportVo;
    }

    @Nullable
    public final TextVo a() {
        return this.f94178f;
    }

    @NotNull
    public final Type b() {
        return this.f94179g;
    }

    @Nullable
    public final TextVo c() {
        return this.f94175c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopWinVo)) {
            return false;
        }
        PopWinVo popWinVo = (PopWinVo) obj;
        return Intrinsics.areEqual(this.f94173a, popWinVo.f94173a) && Intrinsics.areEqual(this.f94174b, popWinVo.f94174b) && Intrinsics.areEqual(this.f94175c, popWinVo.f94175c) && Intrinsics.areEqual(this.f94176d, popWinVo.f94176d) && Intrinsics.areEqual(this.f94177e, popWinVo.f94177e) && Intrinsics.areEqual(this.f94178f, popWinVo.f94178f) && this.f94179g == popWinVo.f94179g && Intrinsics.areEqual(this.h, popWinVo.h);
    }

    public final int hashCode() {
        String str = this.f94173a;
        int iHashCode = str == null ? 0 : str.hashCode();
        TextVo textVo = this.f94174b;
        int iHashCode2 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f94175c;
        int iA = e0.a(e0.a(((((iHashCode * 31) + iHashCode2) * 31) + (textVo2 == null ? 0 : textVo2.hashCode())) * 31, 31, this.f94176d), 31, this.f94177e);
        TextVo textVo3 = this.f94178f;
        int iHashCode3 = textVo3 == null ? 0 : textVo3.hashCode();
        int iHashCode4 = this.f94179g.hashCode();
        ReportVo reportVo = this.h;
        return ((iHashCode4 + ((iA + iHashCode3) * 31)) * 31) + (reportVo == null ? 0 : reportVo.hashCode());
    }

    @NotNull
    public final String toString() {
        return "PopWinVo(cover=" + this.f94173a + ", title=" + this.f94174b + ", subtitle=" + this.f94175c + ", coupons=" + this.f94176d + ", buttons=" + this.f94177e + ", bottomText=" + this.f94178f + ", popType=" + this.f94179g + ", report=" + this.h + ")";
    }
}
