package com.bilibili.pegasus.data.interestchoose;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.ui.layout.LayoutKt;
import androidx.room.B;
import cf.b;
import cf.h;
import cf.i;
import cf.m;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseItem.class */
@Parcelize
@Keep
public final class InterestChooseItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseItem> CREATOR = new Object();

    @SerializedName("confirm_text")
    @Nullable
    private final String confirmText;

    @SerializedName("default_selected")
    private final int defaultSelected;

    @SerializedName("desc")
    @Nullable
    private final String desc;
    private boolean hasReported;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("id")
    private final long id;
    private boolean isSelected;
    private int listPosition;

    @SerializedName("max_subitems_show_count")
    private final int maxSubitemsShowCount;

    @SerializedName("name")
    @Nullable
    private final String name;
    private final int originPos;

    @SerializedName("sub_items")
    @Nullable
    private final List<InterestChooseSubItem> subItems;

    @SerializedName("sub_sections")
    @Nullable
    private final List<InterestChooseSubSection> subSections;

    @SerializedName("sub_type")
    private final int subType;

    @SerializedName("tip")
    @Nullable
    private final String tip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseItem$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseItem> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            long j7 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i8 = parcel.readInt();
                arrayList = new ArrayList(i8);
                int iA = 0;
                while (true) {
                    int i9 = iA;
                    if (i9 == i8) {
                        break;
                    }
                    iA = b.a(InterestChooseSubSection.CREATOR, parcel, arrayList, i9, 1);
                }
            } else {
                arrayList = null;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int iA2 = 0;
                while (true) {
                    int i11 = iA2;
                    arrayList2 = arrayList3;
                    if (i11 == i10) {
                        break;
                    }
                    iA2 = b.a(InterestChooseSubItem.CREATOR, parcel, arrayList3, i11, 1);
                }
            } else {
                arrayList2 = null;
            }
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            boolean z6 = true;
            boolean z7 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z6 = false;
            }
            return new InterestChooseItem(j7, string, string2, string3, string4, i7, arrayList, string5, arrayList2, i12, i13, z7, i14, z6, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseItem[] newArray(int i7) {
            return new InterestChooseItem[i7];
        }
    }

    public InterestChooseItem() {
        this(0L, null, null, null, null, 0, null, null, null, 0, 0, false, 0, false, 0, LayoutKt.LargeDimension, null);
    }

    public InterestChooseItem(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @Nullable List<InterestChooseSubSection> list, @Nullable String str5, @Nullable List<InterestChooseSubItem> list2, int i8, int i9, boolean z6, int i10, boolean z7, int i11) {
        this.id = j7;
        this.name = str;
        this.tip = str2;
        this.desc = str3;
        this.icon = str4;
        this.subType = i7;
        this.subSections = list;
        this.confirmText = str5;
        this.subItems = list2;
        this.maxSubitemsShowCount = i8;
        this.defaultSelected = i9;
        this.isSelected = z6;
        this.listPosition = i10;
        this.hasReported = z7;
        this.originPos = i11;
    }

    public /* synthetic */ InterestChooseItem(long j7, String str, String str2, String str3, String str4, int i7, List list, String str5, List list2, int i8, int i9, boolean z6, int i10, boolean z7, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j7, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? 0 : i7, (i12 & 64) != 0 ? null : list, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? 0 : i8, (i12 & 1024) != 0 ? 0 : i9, (i12 & 2048) != 0 ? false : z6, (i12 & 4096) != 0 ? 0 : i10, (i12 & 8192) != 0 ? false : z7, (i12 & 16384) != 0 ? -1 : i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestChooseItem copy$default(InterestChooseItem interestChooseItem, long j7, String str, String str2, String str3, String str4, int i7, List list, String str5, List list2, int i8, int i9, boolean z6, int i10, boolean z7, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j7 = interestChooseItem.id;
        }
        if ((i12 & 2) != 0) {
            str = interestChooseItem.name;
        }
        if ((i12 & 4) != 0) {
            str2 = interestChooseItem.tip;
        }
        if ((i12 & 8) != 0) {
            str3 = interestChooseItem.desc;
        }
        if ((i12 & 16) != 0) {
            str4 = interestChooseItem.icon;
        }
        if ((i12 & 32) != 0) {
            i7 = interestChooseItem.subType;
        }
        if ((i12 & 64) != 0) {
            list = interestChooseItem.subSections;
        }
        if ((i12 & 128) != 0) {
            str5 = interestChooseItem.confirmText;
        }
        if ((i12 & 256) != 0) {
            list2 = interestChooseItem.subItems;
        }
        if ((i12 & 512) != 0) {
            i8 = interestChooseItem.maxSubitemsShowCount;
        }
        if ((i12 & 1024) != 0) {
            i9 = interestChooseItem.defaultSelected;
        }
        if ((i12 & 2048) != 0) {
            z6 = interestChooseItem.isSelected;
        }
        if ((i12 & 4096) != 0) {
            i10 = interestChooseItem.listPosition;
        }
        if ((i12 & 8192) != 0) {
            z7 = interestChooseItem.hasReported;
        }
        if ((i12 & 16384) != 0) {
            i11 = interestChooseItem.originPos;
        }
        return interestChooseItem.copy(j7, str, str2, str3, str4, i7, list, str5, list2, i8, i9, z6, i10, z7, i11);
    }

    public final long component1() {
        return this.id;
    }

    public final int component10() {
        return this.maxSubitemsShowCount;
    }

    public final int component11() {
        return this.defaultSelected;
    }

    public final boolean component12() {
        return this.isSelected;
    }

    public final int component13() {
        return this.listPosition;
    }

    public final boolean component14() {
        return this.hasReported;
    }

    public final int component15() {
        return this.originPos;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.tip;
    }

    @Nullable
    public final String component4() {
        return this.desc;
    }

    @Nullable
    public final String component5() {
        return this.icon;
    }

    public final int component6() {
        return this.subType;
    }

    @Nullable
    public final List<InterestChooseSubSection> component7() {
        return this.subSections;
    }

    @Nullable
    public final String component8() {
        return this.confirmText;
    }

    @Nullable
    public final List<InterestChooseSubItem> component9() {
        return this.subItems;
    }

    @NotNull
    public final InterestChooseItem copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i7, @Nullable List<InterestChooseSubSection> list, @Nullable String str5, @Nullable List<InterestChooseSubItem> list2, int i8, int i9, boolean z6, int i10, boolean z7, int i11) {
        return new InterestChooseItem(j7, str, str2, str3, str4, i7, list, str5, list2, i8, i9, z6, i10, z7, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseItem)) {
            return false;
        }
        InterestChooseItem interestChooseItem = (InterestChooseItem) obj;
        return this.id == interestChooseItem.id && Intrinsics.areEqual(this.name, interestChooseItem.name) && Intrinsics.areEqual(this.tip, interestChooseItem.tip) && Intrinsics.areEqual(this.desc, interestChooseItem.desc) && Intrinsics.areEqual(this.icon, interestChooseItem.icon) && this.subType == interestChooseItem.subType && Intrinsics.areEqual(this.subSections, interestChooseItem.subSections) && Intrinsics.areEqual(this.confirmText, interestChooseItem.confirmText) && Intrinsics.areEqual(this.subItems, interestChooseItem.subItems) && this.maxSubitemsShowCount == interestChooseItem.maxSubitemsShowCount && this.defaultSelected == interestChooseItem.defaultSelected && this.isSelected == interestChooseItem.isSelected && this.listPosition == interestChooseItem.listPosition && this.hasReported == interestChooseItem.hasReported && this.originPos == interestChooseItem.originPos;
    }

    @Nullable
    public final String getConfirmText() {
        return this.confirmText;
    }

    public final int getDefaultSelected() {
        return this.defaultSelected;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final boolean getHasReported() {
        return this.hasReported;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final int getListPosition() {
        return this.listPosition;
    }

    public final int getMaxSubitemsShowCount() {
        return this.maxSubitemsShowCount;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getOriginPos() {
        return this.originPos;
    }

    @Nullable
    public final List<InterestChooseSubItem> getSubItems() {
        return this.subItems;
    }

    @Nullable
    public final List<InterestChooseSubSection> getSubSections() {
        return this.subSections;
    }

    public final int getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tip;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.desc;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.icon;
        int iA = I.a(this.subType, ((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        List<InterestChooseSubSection> list = this.subSections;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str5 = this.confirmText;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        List<InterestChooseSubItem> list2 = this.subItems;
        return Integer.hashCode(this.originPos) + z.a(I.a(this.listPosition, z.a(I.a(this.defaultSelected, I.a(this.maxSubitemsShowCount, (((((iA + iHashCode5) * 31) + iHashCode6) * 31) + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31), 31, this.isSelected), 31), 31, this.hasReported);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setHasReported(boolean z6) {
        this.hasReported = z6;
    }

    public final void setListPosition(int i7) {
        this.listPosition = i7;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.name;
        String str2 = this.tip;
        String str3 = this.desc;
        String str4 = this.icon;
        int i7 = this.subType;
        List<InterestChooseSubSection> list = this.subSections;
        String str5 = this.confirmText;
        List<InterestChooseSubItem> list2 = this.subItems;
        int i8 = this.maxSubitemsShowCount;
        int i9 = this.defaultSelected;
        boolean z6 = this.isSelected;
        int i10 = this.listPosition;
        boolean z7 = this.hasReported;
        int i11 = this.originPos;
        StringBuilder sbA = n.a(j7, "InterestChooseItem(id=", ", name=", str);
        B.a(", tip=", str2, ", desc=", str3, sbA);
        bf.a.a(i7, ", icon=", str4, ", subType=", sbA);
        h.a(", subSections=", ", confirmText=", str5, sbA, list);
        sbA.append(", subItems=");
        sbA.append(list2);
        sbA.append(", maxSubitemsShowCount=");
        sbA.append(i8);
        m.a(", defaultSelected=", ", isSelected=", i9, z6, sbA);
        m.a(", listPosition=", ", hasReported=", i10, z7, sbA);
        return i.a(i11, ", originPos=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.tip);
        parcel.writeString(this.desc);
        parcel.writeString(this.icon);
        parcel.writeInt(this.subType);
        List<InterestChooseSubSection> list = this.subSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ((InterestChooseSubSection) itA.next()).writeToParcel(parcel, i7);
            }
        }
        parcel.writeString(this.confirmText);
        List<InterestChooseSubItem> list2 = this.subItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = cf.a.a(parcel, 1, list2);
            while (itA2.hasNext()) {
                ((InterestChooseSubItem) itA2.next()).writeToParcel(parcel, i7);
            }
        }
        parcel.writeInt(this.maxSubitemsShowCount);
        parcel.writeInt(this.defaultSelected);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.listPosition);
        parcel.writeInt(this.hasReported ? 1 : 0);
        parcel.writeInt(this.originPos);
    }
}
