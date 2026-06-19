package com.bilibili.pegasus.data.interestchoose;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseMixedItem.class */
@Parcelize
@Keep
public final class InterestChooseMixedItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseMixedItem> CREATOR = new Object();

    @SerializedName("item")
    @Nullable
    private final InterestChooseItem item;

    @SerializedName("sub_item")
    @Nullable
    private final InterestChooseSubItem subItem;

    @SerializedName("type")
    private final int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseMixedItem$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseMixedItem> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseMixedItem createFromParcel(Parcel parcel) {
            return new InterestChooseMixedItem(parcel.readInt(), parcel.readInt() == 0 ? null : InterestChooseItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InterestChooseSubItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseMixedItem[] newArray(int i7) {
            return new InterestChooseMixedItem[i7];
        }
    }

    public InterestChooseMixedItem() {
        this(0, null, null, 7, null);
    }

    public InterestChooseMixedItem(int i7, @Nullable InterestChooseItem interestChooseItem, @Nullable InterestChooseSubItem interestChooseSubItem) {
        this.type = i7;
        this.item = interestChooseItem;
        this.subItem = interestChooseSubItem;
    }

    public /* synthetic */ InterestChooseMixedItem(int i7, InterestChooseItem interestChooseItem, InterestChooseSubItem interestChooseSubItem, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : interestChooseItem, (i8 & 4) != 0 ? null : interestChooseSubItem);
    }

    public static /* synthetic */ InterestChooseMixedItem copy$default(InterestChooseMixedItem interestChooseMixedItem, int i7, InterestChooseItem interestChooseItem, InterestChooseSubItem interestChooseSubItem, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = interestChooseMixedItem.type;
        }
        if ((i8 & 2) != 0) {
            interestChooseItem = interestChooseMixedItem.item;
        }
        if ((i8 & 4) != 0) {
            interestChooseSubItem = interestChooseMixedItem.subItem;
        }
        return interestChooseMixedItem.copy(i7, interestChooseItem, interestChooseSubItem);
    }

    public final int component1() {
        return this.type;
    }

    @Nullable
    public final InterestChooseItem component2() {
        return this.item;
    }

    @Nullable
    public final InterestChooseSubItem component3() {
        return this.subItem;
    }

    @NotNull
    public final InterestChooseMixedItem copy(int i7, @Nullable InterestChooseItem interestChooseItem, @Nullable InterestChooseSubItem interestChooseSubItem) {
        return new InterestChooseMixedItem(i7, interestChooseItem, interestChooseSubItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseMixedItem)) {
            return false;
        }
        InterestChooseMixedItem interestChooseMixedItem = (InterestChooseMixedItem) obj;
        return this.type == interestChooseMixedItem.type && Intrinsics.areEqual(this.item, interestChooseMixedItem.item) && Intrinsics.areEqual(this.subItem, interestChooseMixedItem.subItem);
    }

    @Nullable
    public final InterestChooseItem getItem() {
        return this.item;
    }

    @Nullable
    public final InterestChooseSubItem getSubItem() {
        return this.subItem;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type);
        InterestChooseItem interestChooseItem = this.item;
        int iHashCode2 = 0;
        int iHashCode3 = interestChooseItem == null ? 0 : interestChooseItem.hashCode();
        InterestChooseSubItem interestChooseSubItem = this.subItem;
        if (interestChooseSubItem != null) {
            iHashCode2 = interestChooseSubItem.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "InterestChooseMixedItem(type=" + this.type + ", item=" + this.item + ", subItem=" + this.subItem + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.type);
        InterestChooseItem interestChooseItem = this.item;
        if (interestChooseItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            interestChooseItem.writeToParcel(parcel, i7);
        }
        InterestChooseSubItem interestChooseSubItem = this.subItem;
        if (interestChooseSubItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            interestChooseSubItem.writeToParcel(parcel, i7);
        }
    }
}
