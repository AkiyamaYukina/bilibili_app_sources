package com.bilibili.pegasus.data.interestchoose;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.constraintlayout.widget.e;
import c6.N;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseMixedSection.class */
@Parcelize
@Keep
public final class InterestChooseMixedSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseMixedSection> CREATOR = new Object();

    @SerializedName("mixed_items")
    @Nullable
    private final List<InterestChooseMixedItem> mixedItems;

    @SerializedName("style")
    private final int style;

    @SerializedName("title")
    @Nullable
    private final String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseMixedSection$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseMixedSection> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseMixedSection createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i7 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                int iA = 0;
                while (true) {
                    int i9 = iA;
                    if (i9 == i8) {
                        break;
                    }
                    iA = b.a(InterestChooseMixedItem.CREATOR, parcel, arrayList2, i9, 1);
                }
                arrayList = arrayList2;
            }
            return new InterestChooseMixedSection(string, i7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseMixedSection[] newArray(int i7) {
            return new InterestChooseMixedSection[i7];
        }
    }

    public InterestChooseMixedSection() {
        this(null, 0, null, 7, null);
    }

    public InterestChooseMixedSection(@Nullable String str, int i7, @Nullable List<InterestChooseMixedItem> list) {
        this.title = str;
        this.style = i7;
        this.mixedItems = list;
    }

    public /* synthetic */ InterestChooseMixedSection(String str, int i7, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestChooseMixedSection copy$default(InterestChooseMixedSection interestChooseMixedSection, String str, int i7, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = interestChooseMixedSection.title;
        }
        if ((i8 & 2) != 0) {
            i7 = interestChooseMixedSection.style;
        }
        if ((i8 & 4) != 0) {
            list = interestChooseMixedSection.mixedItems;
        }
        return interestChooseMixedSection.copy(str, i7, list);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.style;
    }

    @Nullable
    public final List<InterestChooseMixedItem> component3() {
        return this.mixedItems;
    }

    @NotNull
    public final InterestChooseMixedSection copy(@Nullable String str, int i7, @Nullable List<InterestChooseMixedItem> list) {
        return new InterestChooseMixedSection(str, i7, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseMixedSection)) {
            return false;
        }
        InterestChooseMixedSection interestChooseMixedSection = (InterestChooseMixedSection) obj;
        return Intrinsics.areEqual(this.title, interestChooseMixedSection.title) && this.style == interestChooseMixedSection.style && Intrinsics.areEqual(this.mixedItems, interestChooseMixedSection.mixedItems);
    }

    @Nullable
    public final List<InterestChooseMixedItem> getMixedItems() {
        return this.mixedItems;
    }

    public final int getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iA = I.a(this.style, (str == null ? 0 : str.hashCode()) * 31, 31);
        List<InterestChooseMixedItem> list = this.mixedItems;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        int i7 = this.style;
        return N.a(e.a(i7, "InterestChooseMixedSection(title=", str, ", style=", ", mixedItems="), ")", this.mixedItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.title);
        parcel.writeInt(this.style);
        List<InterestChooseMixedItem> list = this.mixedItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = cf.a.a(parcel, 1, list);
        while (itA.hasNext()) {
            ((InterestChooseMixedItem) itA.next()).writeToParcel(parcel, i7);
        }
    }
}
