package com.bilibili.pegasus.data.component;

import androidx.compose.animation.core.I;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/component/UpData.class */
public final class UpData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private long f77364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    @Nullable
    private String f77365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("desc")
    @Nullable
    private String f77366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("avatar")
    @Nullable
    private AvatarData f77367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("official_icon")
    private int f77368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("desc_button")
    @Nullable
    private DescButtonData f77369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("cooperation")
    @Nullable
    private String f77370g;

    @SerializedName(EditCustomizeSticker.TAG_URI)
    @Nullable
    private String h;

    public UpData() {
        this(0L, null, null, null, 0, null, null, null, 255, null);
    }

    public UpData(long j7, @Nullable String str, @Nullable String str2, @Nullable AvatarData avatarData, int i7, @Nullable DescButtonData descButtonData, @Nullable String str3, @Nullable String str4) {
        this.f77364a = j7;
        this.f77365b = str;
        this.f77366c = str2;
        this.f77367d = avatarData;
        this.f77368e = i7;
        this.f77369f = descButtonData;
        this.f77370g = str3;
        this.h = str4;
    }

    public /* synthetic */ UpData(long j7, String str, String str2, AvatarData avatarData, int i7, DescButtonData descButtonData, String str3, String str4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : avatarData, (i8 & 16) != 0 ? 0 : i7, (i8 & 32) != 0 ? null : descButtonData, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : str4);
    }

    public static /* synthetic */ UpData copy$default(UpData upData, long j7, String str, String str2, AvatarData avatarData, int i7, DescButtonData descButtonData, String str3, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = upData.f77364a;
        }
        if ((i8 & 2) != 0) {
            str = upData.f77365b;
        }
        if ((i8 & 4) != 0) {
            str2 = upData.f77366c;
        }
        if ((i8 & 8) != 0) {
            avatarData = upData.f77367d;
        }
        if ((i8 & 16) != 0) {
            i7 = upData.f77368e;
        }
        if ((i8 & 32) != 0) {
            descButtonData = upData.f77369f;
        }
        if ((i8 & 64) != 0) {
            str3 = upData.f77370g;
        }
        if ((i8 & 128) != 0) {
            str4 = upData.h;
        }
        return upData.copy(j7, str, str2, avatarData, i7, descButtonData, str3, str4);
    }

    public final long component1() {
        return this.f77364a;
    }

    @Nullable
    public final String component2() {
        return this.f77365b;
    }

    @Nullable
    public final String component3() {
        return this.f77366c;
    }

    @Nullable
    public final AvatarData component4() {
        return this.f77367d;
    }

    public final int component5() {
        return this.f77368e;
    }

    @Nullable
    public final DescButtonData component6() {
        return this.f77369f;
    }

    @Nullable
    public final String component7() {
        return this.f77370g;
    }

    @Nullable
    public final String component8() {
        return this.h;
    }

    @NotNull
    public final UpData copy(long j7, @Nullable String str, @Nullable String str2, @Nullable AvatarData avatarData, int i7, @Nullable DescButtonData descButtonData, @Nullable String str3, @Nullable String str4) {
        return new UpData(j7, str, str2, avatarData, i7, descButtonData, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpData)) {
            return false;
        }
        UpData upData = (UpData) obj;
        return this.f77364a == upData.f77364a && Intrinsics.areEqual(this.f77365b, upData.f77365b) && Intrinsics.areEqual(this.f77366c, upData.f77366c) && Intrinsics.areEqual(this.f77367d, upData.f77367d) && this.f77368e == upData.f77368e && Intrinsics.areEqual(this.f77369f, upData.f77369f) && Intrinsics.areEqual(this.f77370g, upData.f77370g) && Intrinsics.areEqual(this.h, upData.h);
    }

    @Nullable
    public final AvatarData getAvatar() {
        return this.f77367d;
    }

    @Nullable
    public final String getCooperation() {
        return this.f77370g;
    }

    @Nullable
    public final String getDesc() {
        return this.f77366c;
    }

    @Nullable
    public final DescButtonData getDescButton() {
        return this.f77369f;
    }

    public final long getIdX() {
        return this.f77364a;
    }

    @Nullable
    public final String getName() {
        return this.f77365b;
    }

    public final int getOfficialIcon() {
        return this.f77368e;
    }

    @Nullable
    public final String getUri() {
        return this.h;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f77364a);
        String str = this.f77365b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77366c;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        AvatarData avatarData = this.f77367d;
        int iA = I.a(this.f77368e, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (avatarData == null ? 0 : avatarData.hashCode())) * 31, 31);
        DescButtonData descButtonData = this.f77369f;
        int iHashCode4 = descButtonData == null ? 0 : descButtonData.hashCode();
        String str3 = this.f77370g;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.h;
        return ((((iA + iHashCode4) * 31) + iHashCode5) * 31) + (str4 == null ? 0 : str4.hashCode());
    }

    public final void setAvatar(@Nullable AvatarData avatarData) {
        this.f77367d = avatarData;
    }

    public final void setCooperation(@Nullable String str) {
        this.f77370g = str;
    }

    public final void setDesc(@Nullable String str) {
        this.f77366c = str;
    }

    public final void setDescButton(@Nullable DescButtonData descButtonData) {
        this.f77369f = descButtonData;
    }

    public final void setIdX(long j7) {
        this.f77364a = j7;
    }

    public final void setName(@Nullable String str) {
        this.f77365b = str;
    }

    public final void setOfficialIcon(int i7) {
        this.f77368e = i7;
    }

    public final void setUri(@Nullable String str) {
        this.h = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.f77364a;
        String str = this.f77365b;
        String str2 = this.f77366c;
        AvatarData avatarData = this.f77367d;
        int i7 = this.f77368e;
        DescButtonData descButtonData = this.f77369f;
        String str3 = this.f77370g;
        String str4 = this.h;
        StringBuilder sbA = n.a(j7, "UpData(idX=", ", name=", str);
        sbA.append(", desc=");
        sbA.append(str2);
        sbA.append(", avatar=");
        sbA.append(avatarData);
        sbA.append(", officialIcon=");
        sbA.append(i7);
        sbA.append(", descButton=");
        sbA.append(descButtonData);
        B.a(", cooperation=", str3, ", uri=", str4, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
