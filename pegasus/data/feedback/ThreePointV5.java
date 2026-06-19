package com.bilibili.pegasus.data.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/feedback/ThreePointV5.class */
@Parcelize
@Keep
public final class ThreePointV5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ThreePointV5> CREATOR = new Object();

    @SerializedName("items")
    @Nullable
    private final List<ThreePointV5Item> items;

    @SerializedName("style")
    @Nullable
    private final String style;

    @SerializedName("title")
    @Nullable
    private final String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/feedback/ThreePointV5$a.class */
    public static final class a implements Parcelable.Creator<ThreePointV5> {
        @Override // android.os.Parcelable.Creator
        public final ThreePointV5 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
                    iA = b.a(ThreePointV5Item.CREATOR, parcel, arrayList2, i8, 1);
                }
                arrayList = arrayList2;
            }
            return new ThreePointV5(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ThreePointV5[] newArray(int i7) {
            return new ThreePointV5[i7];
        }
    }

    public ThreePointV5() {
        this(null, null, null, 7, null);
    }

    public ThreePointV5(@Nullable String str, @Nullable String str2, @Nullable List<ThreePointV5Item> list) {
        this.style = str;
        this.title = str2;
        this.items = list;
    }

    public /* synthetic */ ThreePointV5(String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreePointV5 copy$default(ThreePointV5 threePointV5, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = threePointV5.style;
        }
        if ((i7 & 2) != 0) {
            str2 = threePointV5.title;
        }
        if ((i7 & 4) != 0) {
            list = threePointV5.items;
        }
        return threePointV5.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.style;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final List<ThreePointV5Item> component3() {
        return this.items;
    }

    @NotNull
    public final ThreePointV5 copy(@Nullable String str, @Nullable String str2, @Nullable List<ThreePointV5Item> list) {
        return new ThreePointV5(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreePointV5)) {
            return false;
        }
        ThreePointV5 threePointV5 = (ThreePointV5) obj;
        return Intrinsics.areEqual(this.style, threePointV5.style) && Intrinsics.areEqual(this.title, threePointV5.title) && Intrinsics.areEqual(this.items, threePointV5.items);
    }

    @Nullable
    public final List<ThreePointV5Item> getItems() {
        return this.items;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.style;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<ThreePointV5Item> list = this.items;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.style;
        String str2 = this.title;
        return N.a(G0.b.a("ThreePointV5(style=", str, ", title=", str2, ", items="), ")", this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.style);
        parcel.writeString(this.title);
        List<ThreePointV5Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = cf.a.a(parcel, 1, list);
        while (itA.hasNext()) {
            ((ThreePointV5Item) itA.next()).writeToParcel(parcel, i7);
        }
    }
}
