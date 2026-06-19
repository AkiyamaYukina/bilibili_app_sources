package com.bilibili.pegasus.recommendlabel.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.b;
import com.google.gson.annotations.SerializedName;
import h6.C7417v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/RecommendLabelResponse.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class RecommendLabelResponse implements Parcelable {

    @SerializedName("all_labels")
    @Nullable
    private final List<AllLabel> allLabels;

    @SerializedName("labels")
    @Nullable
    private final List<Label> labels;

    @SerializedName("uinterest_distribution_material")
    @Nullable
    private final UinterestDistributionMaterial uinterestDistributionMaterial;

    @SerializedName("uinterest_mng_page_material")
    @Nullable
    private final UinterestMngPageMaterial uinterestMngPageMaterial;

    @SerializedName("uinterest_page_material")
    @Nullable
    private final UinterestPageMaterial uinterestPageMaterial;

    @NotNull
    public static final Parcelable.Creator<RecommendLabelResponse> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/RecommendLabelResponse$a.class */
    public static final class a implements Parcelable.Creator<RecommendLabelResponse> {
        @Override // android.os.Parcelable.Creator
        public final RecommendLabelResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                int iA = 0;
                while (true) {
                    int i8 = iA;
                    if (i8 == i7) {
                        break;
                    }
                    iA = b.a(Label.CREATOR, parcel, arrayList, i8, 1);
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                arrayList2 = new ArrayList(i9);
                int iA2 = 0;
                while (true) {
                    int i10 = iA2;
                    if (i10 == i9) {
                        break;
                    }
                    iA2 = b.a(AllLabel.CREATOR, parcel, arrayList2, i10, 1);
                }
            } else {
                arrayList2 = null;
            }
            return new RecommendLabelResponse(arrayList, arrayList2, parcel.readInt() == 0 ? null : UinterestPageMaterial.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UinterestDistributionMaterial.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UinterestMngPageMaterial.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendLabelResponse[] newArray(int i7) {
            return new RecommendLabelResponse[i7];
        }
    }

    public RecommendLabelResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public RecommendLabelResponse(@Nullable List<Label> list, @Nullable List<AllLabel> list2, @Nullable UinterestPageMaterial uinterestPageMaterial, @Nullable UinterestDistributionMaterial uinterestDistributionMaterial, @Nullable UinterestMngPageMaterial uinterestMngPageMaterial) {
        this.labels = list;
        this.allLabels = list2;
        this.uinterestPageMaterial = uinterestPageMaterial;
        this.uinterestDistributionMaterial = uinterestDistributionMaterial;
        this.uinterestMngPageMaterial = uinterestMngPageMaterial;
    }

    public /* synthetic */ RecommendLabelResponse(List list, List list2, UinterestPageMaterial uinterestPageMaterial, UinterestDistributionMaterial uinterestDistributionMaterial, UinterestMngPageMaterial uinterestMngPageMaterial, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : list2, (i7 & 4) != 0 ? null : uinterestPageMaterial, (i7 & 8) != 0 ? null : uinterestDistributionMaterial, (i7 & 16) != 0 ? null : uinterestMngPageMaterial);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendLabelResponse copy$default(RecommendLabelResponse recommendLabelResponse, List list, List list2, UinterestPageMaterial uinterestPageMaterial, UinterestDistributionMaterial uinterestDistributionMaterial, UinterestMngPageMaterial uinterestMngPageMaterial, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = recommendLabelResponse.labels;
        }
        if ((i7 & 2) != 0) {
            list2 = recommendLabelResponse.allLabels;
        }
        if ((i7 & 4) != 0) {
            uinterestPageMaterial = recommendLabelResponse.uinterestPageMaterial;
        }
        if ((i7 & 8) != 0) {
            uinterestDistributionMaterial = recommendLabelResponse.uinterestDistributionMaterial;
        }
        if ((i7 & 16) != 0) {
            uinterestMngPageMaterial = recommendLabelResponse.uinterestMngPageMaterial;
        }
        return recommendLabelResponse.copy(list, list2, uinterestPageMaterial, uinterestDistributionMaterial, uinterestMngPageMaterial);
    }

    @Nullable
    public final List<Label> component1() {
        return this.labels;
    }

    @Nullable
    public final List<AllLabel> component2() {
        return this.allLabels;
    }

    @Nullable
    public final UinterestPageMaterial component3() {
        return this.uinterestPageMaterial;
    }

    @Nullable
    public final UinterestDistributionMaterial component4() {
        return this.uinterestDistributionMaterial;
    }

    @Nullable
    public final UinterestMngPageMaterial component5() {
        return this.uinterestMngPageMaterial;
    }

    @NotNull
    public final RecommendLabelResponse copy(@Nullable List<Label> list, @Nullable List<AllLabel> list2, @Nullable UinterestPageMaterial uinterestPageMaterial, @Nullable UinterestDistributionMaterial uinterestDistributionMaterial, @Nullable UinterestMngPageMaterial uinterestMngPageMaterial) {
        return new RecommendLabelResponse(list, list2, uinterestPageMaterial, uinterestDistributionMaterial, uinterestMngPageMaterial);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendLabelResponse)) {
            return false;
        }
        RecommendLabelResponse recommendLabelResponse = (RecommendLabelResponse) obj;
        return Intrinsics.areEqual(this.labels, recommendLabelResponse.labels) && Intrinsics.areEqual(this.allLabels, recommendLabelResponse.allLabels) && Intrinsics.areEqual(this.uinterestPageMaterial, recommendLabelResponse.uinterestPageMaterial) && Intrinsics.areEqual(this.uinterestDistributionMaterial, recommendLabelResponse.uinterestDistributionMaterial) && Intrinsics.areEqual(this.uinterestMngPageMaterial, recommendLabelResponse.uinterestMngPageMaterial);
    }

    @Nullable
    public final List<AllLabel> getAllLabels() {
        return this.allLabels;
    }

    @Nullable
    public final List<Label> getLabels() {
        return this.labels;
    }

    @Nullable
    public final UinterestDistributionMaterial getUinterestDistributionMaterial() {
        return this.uinterestDistributionMaterial;
    }

    @Nullable
    public final UinterestMngPageMaterial getUinterestMngPageMaterial() {
        return this.uinterestMngPageMaterial;
    }

    @Nullable
    public final UinterestPageMaterial getUinterestPageMaterial() {
        return this.uinterestPageMaterial;
    }

    public int hashCode() {
        List<Label> list = this.labels;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<AllLabel> list2 = this.allLabels;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        UinterestPageMaterial uinterestPageMaterial = this.uinterestPageMaterial;
        int iHashCode4 = uinterestPageMaterial == null ? 0 : uinterestPageMaterial.hashCode();
        UinterestDistributionMaterial uinterestDistributionMaterial = this.uinterestDistributionMaterial;
        int iHashCode5 = uinterestDistributionMaterial == null ? 0 : uinterestDistributionMaterial.hashCode();
        UinterestMngPageMaterial uinterestMngPageMaterial = this.uinterestMngPageMaterial;
        if (uinterestMngPageMaterial != null) {
            iHashCode = uinterestMngPageMaterial.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        List<Label> list = this.labels;
        List<AllLabel> list2 = this.allLabels;
        UinterestPageMaterial uinterestPageMaterial = this.uinterestPageMaterial;
        UinterestDistributionMaterial uinterestDistributionMaterial = this.uinterestDistributionMaterial;
        UinterestMngPageMaterial uinterestMngPageMaterial = this.uinterestMngPageMaterial;
        StringBuilder sbA = C7417v.a("RecommendLabelResponse(labels=", ", allLabels=", ", uinterestPageMaterial=", list, list2);
        sbA.append(uinterestPageMaterial);
        sbA.append(", uinterestDistributionMaterial=");
        sbA.append(uinterestDistributionMaterial);
        sbA.append(", uinterestMngPageMaterial=");
        sbA.append(uinterestMngPageMaterial);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        List<Label> list = this.labels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = cf.a.a(parcel, 1, list);
            while (itA.hasNext()) {
                ((Label) itA.next()).writeToParcel(parcel, i7);
            }
        }
        List<AllLabel> list2 = this.allLabels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = cf.a.a(parcel, 1, list2);
            while (itA2.hasNext()) {
                ((AllLabel) itA2.next()).writeToParcel(parcel, i7);
            }
        }
        UinterestPageMaterial uinterestPageMaterial = this.uinterestPageMaterial;
        if (uinterestPageMaterial == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uinterestPageMaterial.writeToParcel(parcel, i7);
        }
        UinterestDistributionMaterial uinterestDistributionMaterial = this.uinterestDistributionMaterial;
        if (uinterestDistributionMaterial == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uinterestDistributionMaterial.writeToParcel(parcel, i7);
        }
        UinterestMngPageMaterial uinterestMngPageMaterial = this.uinterestMngPageMaterial;
        if (uinterestMngPageMaterial == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uinterestMngPageMaterial.writeToParcel(parcel, i7);
        }
    }
}
