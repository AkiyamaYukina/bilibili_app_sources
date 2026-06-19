package com.bilibili.pegasus.feedbackdialog.model;

import W60.F;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import cf.b;
import cf.h;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/model/ThreePointV5Item.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class ThreePointV5Item implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ThreePointV5Item> CREATOR = new Object();

    @SerializedName("extend")
    @Nullable
    private final String extend;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("icon_height")
    private final int iconHeight;

    @SerializedName("icon_night")
    @Nullable
    private final String iconNight;

    @SerializedName("icon_width")
    private final int iconWidth;

    @SerializedName("id")
    private final long id;

    @SerializedName("is_light_panel")
    private final boolean isLightPanel;

    @SerializedName("link")
    @Nullable
    private final String link;

    @SerializedName("sub_sections")
    @Nullable
    private final List<ThreePointV5> subSections;

    @SerializedName("subtitle")
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("toast")
    @Nullable
    private final String toast;

    @SerializedName("type")
    @Nullable
    private final String type;

    @SerializedName("value")
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/model/ThreePointV5Item$a.class */
    public static final class a implements Parcelable.Creator<ThreePointV5Item> {
        @Override // android.os.Parcelable.Creator
        public final ThreePointV5Item createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            long j7 = parcel.readLong();
            String string = parcel.readString();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i9 = parcel.readInt();
            String string7 = parcel.readString();
            int iA = 0;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                str = string7;
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                while (iA != i10) {
                    iA = b.a(ThreePointV5.CREATOR, parcel, arrayList2, iA, 1);
                }
                str = string7;
                arrayList = arrayList2;
            }
            return new ThreePointV5Item(j7, string, i7, i8, string2, string3, string4, string5, string6, i9, str, z6, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ThreePointV5Item[] newArray(int i7) {
            return new ThreePointV5Item[i7];
        }
    }

    public ThreePointV5Item() {
        this(0L, null, 0, 0, null, null, null, null, null, 0, null, false, null, null, 16383, null);
    }

    public ThreePointV5Item(long j7, @Nullable String str, int i7, int i8, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i9, @Nullable String str7, boolean z6, @Nullable List<ThreePointV5> list, @Nullable String str8) {
        this.id = j7;
        this.icon = str;
        this.iconWidth = i7;
        this.iconHeight = i8;
        this.iconNight = str2;
        this.title = str3;
        this.subtitle = str4;
        this.type = str5;
        this.toast = str6;
        this.value = i9;
        this.extend = str7;
        this.isLightPanel = z6;
        this.subSections = list;
        this.link = str8;
    }

    public /* synthetic */ ThreePointV5Item(long j7, String str, int i7, int i8, String str2, String str3, String str4, String str5, String str6, int i9, String str7, boolean z6, List list, String str8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? 20 : i7, (i10 & 8) != 0 ? 20 : i8, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? 0 : i9, (i10 & 1024) != 0 ? null : str7, (i10 & 2048) != 0 ? false : z6, (i10 & 4096) != 0 ? null : list, (i10 & 8192) != 0 ? null : str8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreePointV5Item copy$default(ThreePointV5Item threePointV5Item, long j7, String str, int i7, int i8, String str2, String str3, String str4, String str5, String str6, int i9, String str7, boolean z6, List list, String str8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j7 = threePointV5Item.id;
        }
        if ((i10 & 2) != 0) {
            str = threePointV5Item.icon;
        }
        if ((i10 & 4) != 0) {
            i7 = threePointV5Item.iconWidth;
        }
        if ((i10 & 8) != 0) {
            i8 = threePointV5Item.iconHeight;
        }
        if ((i10 & 16) != 0) {
            str2 = threePointV5Item.iconNight;
        }
        if ((i10 & 32) != 0) {
            str3 = threePointV5Item.title;
        }
        if ((i10 & 64) != 0) {
            str4 = threePointV5Item.subtitle;
        }
        if ((i10 & 128) != 0) {
            str5 = threePointV5Item.type;
        }
        if ((i10 & 256) != 0) {
            str6 = threePointV5Item.toast;
        }
        if ((i10 & 512) != 0) {
            i9 = threePointV5Item.value;
        }
        if ((i10 & 1024) != 0) {
            str7 = threePointV5Item.extend;
        }
        if ((i10 & 2048) != 0) {
            z6 = threePointV5Item.isLightPanel;
        }
        if ((i10 & 4096) != 0) {
            list = threePointV5Item.subSections;
        }
        if ((i10 & 8192) != 0) {
            str8 = threePointV5Item.link;
        }
        return threePointV5Item.copy(j7, str, i7, i8, str2, str3, str4, str5, str6, i9, str7, z6, list, str8);
    }

    public final long component1() {
        return this.id;
    }

    public final int component10() {
        return this.value;
    }

    @Nullable
    public final String component11() {
        return this.extend;
    }

    public final boolean component12() {
        return this.isLightPanel;
    }

    @Nullable
    public final List<ThreePointV5> component13() {
        return this.subSections;
    }

    @Nullable
    public final String component14() {
        return this.link;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    public final int component3() {
        return this.iconWidth;
    }

    public final int component4() {
        return this.iconHeight;
    }

    @Nullable
    public final String component5() {
        return this.iconNight;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final String component7() {
        return this.subtitle;
    }

    @Nullable
    public final String component8() {
        return this.type;
    }

    @Nullable
    public final String component9() {
        return this.toast;
    }

    @NotNull
    public final ThreePointV5Item copy(long j7, @Nullable String str, int i7, int i8, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i9, @Nullable String str7, boolean z6, @Nullable List<ThreePointV5> list, @Nullable String str8) {
        return new ThreePointV5Item(j7, str, i7, i8, str2, str3, str4, str5, str6, i9, str7, z6, list, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreePointV5Item)) {
            return false;
        }
        ThreePointV5Item threePointV5Item = (ThreePointV5Item) obj;
        return this.id == threePointV5Item.id && Intrinsics.areEqual(this.icon, threePointV5Item.icon) && this.iconWidth == threePointV5Item.iconWidth && this.iconHeight == threePointV5Item.iconHeight && Intrinsics.areEqual(this.iconNight, threePointV5Item.iconNight) && Intrinsics.areEqual(this.title, threePointV5Item.title) && Intrinsics.areEqual(this.subtitle, threePointV5Item.subtitle) && Intrinsics.areEqual(this.type, threePointV5Item.type) && Intrinsics.areEqual(this.toast, threePointV5Item.toast) && this.value == threePointV5Item.value && Intrinsics.areEqual(this.extend, threePointV5Item.extend) && this.isLightPanel == threePointV5Item.isLightPanel && Intrinsics.areEqual(this.subSections, threePointV5Item.subSections) && Intrinsics.areEqual(this.link, threePointV5Item.link);
    }

    @Nullable
    public final String getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getIconHeight() {
        return this.iconHeight;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    public final int getIconWidth() {
        return this.iconWidth;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final List<ThreePointV5> getSubSections() {
        return this.subSections;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.icon;
        int iA = I.a(this.iconHeight, I.a(this.iconWidth, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.iconNight;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subtitle;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.type;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.toast;
        int iA2 = I.a(this.value, (((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.extend;
        int iA3 = z.a((iA2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.isLightPanel);
        List<ThreePointV5> list = this.subSections;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str8 = this.link;
        return ((iA3 + iHashCode6) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    public final boolean isLightPanel() {
        return this.isLightPanel;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.icon;
        int i7 = this.iconWidth;
        int i8 = this.iconHeight;
        String str2 = this.iconNight;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.type;
        String str6 = this.toast;
        int i9 = this.value;
        String str7 = this.extend;
        boolean z6 = this.isLightPanel;
        List<ThreePointV5> list = this.subSections;
        String str8 = this.link;
        StringBuilder sbA = n.a(j7, "ThreePointV5Item(id=", ", icon=", str);
        F.b(i7, i8, ", iconWidth=", ", iconHeight=", sbA);
        B.a(", iconNight=", str2, ", title=", str3, sbA);
        B.a(", subtitle=", str4, ", type=", str5, sbA);
        bf.a.a(i9, ", toast=", str6, ", value=", sbA);
        cf.n.a(", extend=", str7, ", isLightPanel=", sbA, z6);
        h.a(", subSections=", ", link=", str8, sbA, list);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeString(this.icon);
        parcel.writeInt(this.iconWidth);
        parcel.writeInt(this.iconHeight);
        parcel.writeString(this.iconNight);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.type);
        parcel.writeString(this.toast);
        parcel.writeInt(this.value);
        parcel.writeString(this.extend);
        parcel.writeInt(this.isLightPanel ? 1 : 0);
        List<ThreePointV5> list = this.subSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ((ThreePointV5) itA.next()).writeToParcel(parcel, i7);
            }
        }
        parcel.writeString(this.link);
    }
}
