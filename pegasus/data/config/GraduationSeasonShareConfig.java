package com.bilibili.pegasus.data.config;

import G0.b;
import H0.e;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.room.B;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/GraduationSeasonShareConfig.class */
@Keep
public final class GraduationSeasonShareConfig {

    @SerializedName("click_id")
    @Nullable
    private final String clickId;

    @SerializedName("origin")
    @Nullable
    private final String origin;

    @SerializedName("pic")
    @Nullable
    private final String pic;

    @SerializedName("show_id")
    @Nullable
    private final String showId;

    @SerializedName("text")
    @Nullable
    private final String text;

    @SerializedName("type")
    private final int type;

    @SerializedName("value")
    @Nullable
    private final String value;

    public GraduationSeasonShareConfig() {
        this(null, null, null, 0, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public GraduationSeasonShareConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.showId = str;
        this.clickId = str2;
        this.origin = str3;
        this.type = i7;
        this.pic = str4;
        this.value = str5;
        this.text = str6;
    }

    public /* synthetic */ GraduationSeasonShareConfig(String str, String str2, String str3, int i7, String str4, String str5, String str6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? 0 : i7, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? null : str6);
    }

    public static /* synthetic */ GraduationSeasonShareConfig copy$default(GraduationSeasonShareConfig graduationSeasonShareConfig, String str, String str2, String str3, int i7, String str4, String str5, String str6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = graduationSeasonShareConfig.showId;
        }
        if ((i8 & 2) != 0) {
            str2 = graduationSeasonShareConfig.clickId;
        }
        if ((i8 & 4) != 0) {
            str3 = graduationSeasonShareConfig.origin;
        }
        if ((i8 & 8) != 0) {
            i7 = graduationSeasonShareConfig.type;
        }
        if ((i8 & 16) != 0) {
            str4 = graduationSeasonShareConfig.pic;
        }
        if ((i8 & 32) != 0) {
            str5 = graduationSeasonShareConfig.value;
        }
        if ((i8 & 64) != 0) {
            str6 = graduationSeasonShareConfig.text;
        }
        return graduationSeasonShareConfig.copy(str, str2, str3, i7, str4, str5, str6);
    }

    @Nullable
    public final String component1() {
        return this.showId;
    }

    @Nullable
    public final String component2() {
        return this.clickId;
    }

    @Nullable
    public final String component3() {
        return this.origin;
    }

    public final int component4() {
        return this.type;
    }

    @Nullable
    public final String component5() {
        return this.pic;
    }

    @Nullable
    public final String component6() {
        return this.value;
    }

    @Nullable
    public final String component7() {
        return this.text;
    }

    @NotNull
    public final GraduationSeasonShareConfig copy(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new GraduationSeasonShareConfig(str, str2, str3, i7, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraduationSeasonShareConfig)) {
            return false;
        }
        GraduationSeasonShareConfig graduationSeasonShareConfig = (GraduationSeasonShareConfig) obj;
        return Intrinsics.areEqual(this.showId, graduationSeasonShareConfig.showId) && Intrinsics.areEqual(this.clickId, graduationSeasonShareConfig.clickId) && Intrinsics.areEqual(this.origin, graduationSeasonShareConfig.origin) && this.type == graduationSeasonShareConfig.type && Intrinsics.areEqual(this.pic, graduationSeasonShareConfig.pic) && Intrinsics.areEqual(this.value, graduationSeasonShareConfig.value) && Intrinsics.areEqual(this.text, graduationSeasonShareConfig.text);
    }

    @Nullable
    public final String getClickId() {
        return this.clickId;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getShowId() {
        return this.showId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.showId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.clickId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.origin;
        int iA = I.a(this.type, ((((iHashCode * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.pic;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode4 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.text;
        return ((((iA + iHashCode3) * 31) + iHashCode4) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.showId;
        String str2 = this.clickId;
        String str3 = this.origin;
        int i7 = this.type;
        String str4 = this.pic;
        String str5 = this.value;
        String str6 = this.text;
        StringBuilder sbA = b.a("GraduationSeasonShareConfig(showId=", str, ", clickId=", str2, ", origin=");
        e.b(i7, str3, ", type=", ", pic=", sbA);
        B.a(str4, ", value=", str5, ", text=", sbA);
        return C8770a.a(sbA, str6, ")");
    }
}
