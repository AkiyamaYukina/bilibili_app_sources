package com.bilibili.pegasus.recommendlabel.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/UinterestDistributionMaterial.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class UinterestDistributionMaterial implements Parcelable {

    @SerializedName("area_list")
    @Nullable
    private final List<AreaItem> areaList;

    @SerializedName("subtitle")
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    @NotNull
    public static final Parcelable.Creator<UinterestDistributionMaterial> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/UinterestDistributionMaterial$a.class */
    public static final class a implements Parcelable.Creator<UinterestDistributionMaterial> {
        @Override // android.os.Parcelable.Creator
        public final UinterestDistributionMaterial createFromParcel(Parcel parcel) {
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
                    iA = b.a(AreaItem.CREATOR, parcel, arrayList2, i8, 1);
                }
                arrayList = arrayList2;
            }
            return new UinterestDistributionMaterial(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UinterestDistributionMaterial[] newArray(int i7) {
            return new UinterestDistributionMaterial[i7];
        }
    }

    public UinterestDistributionMaterial() {
        this(null, null, null, 7, null);
    }

    public UinterestDistributionMaterial(@Nullable String str, @Nullable String str2, @Nullable List<AreaItem> list) {
        this.title = str;
        this.subtitle = str2;
        this.areaList = list;
    }

    public /* synthetic */ UinterestDistributionMaterial(String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UinterestDistributionMaterial copy$default(UinterestDistributionMaterial uinterestDistributionMaterial, String str, String str2, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = uinterestDistributionMaterial.title;
        }
        if ((i7 & 2) != 0) {
            str2 = uinterestDistributionMaterial.subtitle;
        }
        if ((i7 & 4) != 0) {
            list = uinterestDistributionMaterial.areaList;
        }
        return uinterestDistributionMaterial.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.subtitle;
    }

    @Nullable
    public final List<AreaItem> component3() {
        return this.areaList;
    }

    @NotNull
    public final UinterestDistributionMaterial copy(@Nullable String str, @Nullable String str2, @Nullable List<AreaItem> list) {
        return new UinterestDistributionMaterial(str, str2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UinterestDistributionMaterial)) {
            return false;
        }
        UinterestDistributionMaterial uinterestDistributionMaterial = (UinterestDistributionMaterial) obj;
        return Intrinsics.areEqual(this.title, uinterestDistributionMaterial.title) && Intrinsics.areEqual(this.subtitle, uinterestDistributionMaterial.subtitle) && Intrinsics.areEqual(this.areaList, uinterestDistributionMaterial.areaList);
    }

    @Nullable
    public final List<AreaItem> getAreaList() {
        return this.areaList;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<AreaItem> list = this.areaList;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return N.a(G0.b.a("UinterestDistributionMaterial(title=", str, ", subtitle=", str2, ", areaList="), ")", this.areaList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<AreaItem> list = this.areaList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = cf.a.a(parcel, 1, list);
        while (itA.hasNext()) {
            ((AreaItem) itA.next()).writeToParcel(parcel, i7);
        }
    }
}
