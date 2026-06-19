package com.bilibili.pegasus.data.interestchoose;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.analytics.C;
import cf.b;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseSubSection.class */
@Parcelize
@Keep
public final class InterestChooseSubSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseSubSection> CREATOR = new Object();

    @SerializedName("sub_items")
    @Nullable
    private final List<InterestChooseSubItem> subItems;

    @SerializedName("title")
    @Nullable
    private final String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseSubSection$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseSubSection> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseSubSection createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int iA = 0;
                while (true) {
                    int i8 = iA;
                    if (i8 == i7) {
                        break;
                    }
                    iA = b.a(InterestChooseSubItem.CREATOR, parcel, arrayList2, i8, 1);
                }
                arrayList = arrayList2;
            }
            return new InterestChooseSubSection(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseSubSection[] newArray(int i7) {
            return new InterestChooseSubSection[i7];
        }
    }

    public InterestChooseSubSection() {
        this(null, null, 3, null);
    }

    public InterestChooseSubSection(@Nullable String str, @Nullable List<InterestChooseSubItem> list) {
        this.title = str;
        this.subItems = list;
    }

    public /* synthetic */ InterestChooseSubSection(String str, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestChooseSubSection copy$default(InterestChooseSubSection interestChooseSubSection, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = interestChooseSubSection.title;
        }
        if ((i7 & 2) != 0) {
            list = interestChooseSubSection.subItems;
        }
        return interestChooseSubSection.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final List<InterestChooseSubItem> component2() {
        return this.subItems;
    }

    @NotNull
    public final InterestChooseSubSection copy(@Nullable String str, @Nullable List<InterestChooseSubItem> list) {
        return new InterestChooseSubSection(str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseSubSection)) {
            return false;
        }
        InterestChooseSubSection interestChooseSubSection = (InterestChooseSubSection) obj;
        return Intrinsics.areEqual(this.title, interestChooseSubSection.title) && Intrinsics.areEqual(this.subItems, interestChooseSubSection.subItems);
    }

    @Nullable
    public final List<InterestChooseSubItem> getSubItems() {
        return this.subItems;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<InterestChooseSubItem> list = this.subItems;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        return C.a("InterestChooseSubSection(title=", this.title, ", subItems=", ")", this.subItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.title);
        List<InterestChooseSubItem> list = this.subItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = cf.a.a(parcel, 1, list);
        while (itA.hasNext()) {
            ((InterestChooseSubItem) itA.next()).writeToParcel(parcel, i7);
        }
    }
}
