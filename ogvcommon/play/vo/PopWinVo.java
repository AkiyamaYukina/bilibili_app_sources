package com.bilibili.ogvcommon.play.vo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bapis.bilibili.pgc.gateway.player.v2.Coupon;
import com.bilibili.bson.adapter.a;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/PopWinVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PopWinVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f73331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f73332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("desc")
    @Nullable
    private final TextVo f73333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Coupon> f73334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<TextVo> f73335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("bottom_text")
    @Nullable
    private final TextVo f73336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("pop_type")
    @NotNull
    private final Type f73337g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/PopWinVo$Type.class */
    public static final class Type implements a<String> {
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

    public PopWinVo(@Nullable String str, @Nullable TextVo textVo, @Nullable TextVo textVo2, @NotNull List<Coupon> list, @NotNull List<TextVo> list2, @Nullable TextVo textVo3, @NotNull Type type) {
        this.f73331a = str;
        this.f73332b = textVo;
        this.f73333c = textVo2;
        this.f73334d = list;
        this.f73335e = list2;
        this.f73336f = textVo3;
        this.f73337g = type;
    }

    @Nullable
    public final TextVo a() {
        return this.f73336f;
    }

    @NotNull
    public final Type b() {
        return this.f73337g;
    }

    @Nullable
    public final TextVo c() {
        return this.f73333c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopWinVo)) {
            return false;
        }
        PopWinVo popWinVo = (PopWinVo) obj;
        return Intrinsics.areEqual(this.f73331a, popWinVo.f73331a) && Intrinsics.areEqual(this.f73332b, popWinVo.f73332b) && Intrinsics.areEqual(this.f73333c, popWinVo.f73333c) && Intrinsics.areEqual(this.f73334d, popWinVo.f73334d) && Intrinsics.areEqual(this.f73335e, popWinVo.f73335e) && Intrinsics.areEqual(this.f73336f, popWinVo.f73336f) && this.f73337g == popWinVo.f73337g;
    }

    public final int hashCode() {
        String str = this.f73331a;
        int iHashCode = str == null ? 0 : str.hashCode();
        TextVo textVo = this.f73332b;
        int iHashCode2 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f73333c;
        int iA = e0.a(e0.a(((((iHashCode * 31) + iHashCode2) * 31) + (textVo2 == null ? 0 : textVo2.hashCode())) * 31, 31, this.f73334d), 31, this.f73335e);
        TextVo textVo3 = this.f73336f;
        return this.f73337g.hashCode() + ((iA + (textVo3 == null ? 0 : textVo3.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "PopWinVo(cover=" + this.f73331a + ", title=" + this.f73332b + ", subtitle=" + this.f73333c + ", coupons=" + this.f73334d + ", buttons=" + this.f73335e + ", bottomText=" + this.f73336f + ", popType=" + this.f73337g + ")";
    }
}
