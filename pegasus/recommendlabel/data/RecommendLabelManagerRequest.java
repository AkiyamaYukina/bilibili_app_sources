package com.bilibili.pegasus.recommendlabel.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.media3.common.K;
import com.google.gson.annotations.SerializedName;
import h6.C7417v;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/RecommendLabelManagerRequest.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class RecommendLabelManagerRequest implements Parcelable {

    @SerializedName("action")
    private final int action;

    @SerializedName("fixed_label")
    @NotNull
    private final List<String> areaIcon;

    @SerializedName("unfixed_label")
    @NotNull
    private final List<String> areaLabel;

    @SerializedName("changed_label")
    @Nullable
    private final String areaName;

    @NotNull
    public static final Parcelable.Creator<RecommendLabelManagerRequest> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/RecommendLabelManagerRequest$a.class */
    public static final class a implements Parcelable.Creator<RecommendLabelManagerRequest> {
        @Override // android.os.Parcelable.Creator
        public final RecommendLabelManagerRequest createFromParcel(Parcel parcel) {
            return new RecommendLabelManagerRequest(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendLabelManagerRequest[] newArray(int i7) {
            return new RecommendLabelManagerRequest[i7];
        }
    }

    public RecommendLabelManagerRequest(@NotNull List<String> list, @NotNull List<String> list2, @Nullable String str, int i7) {
        this.areaIcon = list;
        this.areaLabel = list2;
        this.areaName = str;
        this.action = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendLabelManagerRequest copy$default(RecommendLabelManagerRequest recommendLabelManagerRequest, List list, List list2, String str, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = recommendLabelManagerRequest.areaIcon;
        }
        if ((i8 & 2) != 0) {
            list2 = recommendLabelManagerRequest.areaLabel;
        }
        if ((i8 & 4) != 0) {
            str = recommendLabelManagerRequest.areaName;
        }
        if ((i8 & 8) != 0) {
            i7 = recommendLabelManagerRequest.action;
        }
        return recommendLabelManagerRequest.copy(list, list2, str, i7);
    }

    @NotNull
    public final List<String> component1() {
        return this.areaIcon;
    }

    @NotNull
    public final List<String> component2() {
        return this.areaLabel;
    }

    @Nullable
    public final String component3() {
        return this.areaName;
    }

    public final int component4() {
        return this.action;
    }

    @NotNull
    public final RecommendLabelManagerRequest copy(@NotNull List<String> list, @NotNull List<String> list2, @Nullable String str, int i7) {
        return new RecommendLabelManagerRequest(list, list2, str, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendLabelManagerRequest)) {
            return false;
        }
        RecommendLabelManagerRequest recommendLabelManagerRequest = (RecommendLabelManagerRequest) obj;
        return Intrinsics.areEqual(this.areaIcon, recommendLabelManagerRequest.areaIcon) && Intrinsics.areEqual(this.areaLabel, recommendLabelManagerRequest.areaLabel) && Intrinsics.areEqual(this.areaName, recommendLabelManagerRequest.areaName) && this.action == recommendLabelManagerRequest.action;
    }

    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final List<String> getAreaIcon() {
        return this.areaIcon;
    }

    @NotNull
    public final List<String> getAreaLabel() {
        return this.areaLabel;
    }

    @Nullable
    public final String getAreaName() {
        return this.areaName;
    }

    public int hashCode() {
        int iA = e0.a(this.areaIcon.hashCode() * 31, 31, this.areaLabel);
        String str = this.areaName;
        return Integer.hashCode(this.action) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        List<String> list = this.areaIcon;
        List<String> list2 = this.areaLabel;
        return K.a(this.action, this.areaName, ", action=", ")", C7417v.a("RecommendLabelManagerRequest(areaIcon=", ", areaLabel=", ", areaName=", list, list2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeStringList(this.areaIcon);
        parcel.writeStringList(this.areaLabel);
        parcel.writeString(this.areaName);
        parcel.writeInt(this.action);
    }
}
