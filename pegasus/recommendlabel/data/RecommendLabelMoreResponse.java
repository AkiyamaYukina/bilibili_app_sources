package com.bilibili.pegasus.recommendlabel.data;

import G0.b;
import M6.f;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/RecommendLabelMoreResponse.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class RecommendLabelMoreResponse implements Parcelable {

    @SerializedName("add_button")
    @Nullable
    private final String addButton;

    @SerializedName("labels")
    @Nullable
    private final List<String> labels;

    @SerializedName("subtitle")
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("toast")
    @Nullable
    private final String toast;

    @NotNull
    public static final Parcelable.Creator<RecommendLabelMoreResponse> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/RecommendLabelMoreResponse$a.class */
    public static final class a implements Parcelable.Creator<RecommendLabelMoreResponse> {
        @Override // android.os.Parcelable.Creator
        public final RecommendLabelMoreResponse createFromParcel(Parcel parcel) {
            return new RecommendLabelMoreResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendLabelMoreResponse[] newArray(int i7) {
            return new RecommendLabelMoreResponse[i7];
        }
    }

    public RecommendLabelMoreResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public RecommendLabelMoreResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4) {
        this.title = str;
        this.subtitle = str2;
        this.addButton = str3;
        this.labels = list;
        this.toast = str4;
    }

    public /* synthetic */ RecommendLabelMoreResponse(String str, String str2, String str3, List list, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : list, (i7 & 16) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendLabelMoreResponse copy$default(RecommendLabelMoreResponse recommendLabelMoreResponse, String str, String str2, String str3, List list, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = recommendLabelMoreResponse.title;
        }
        if ((i7 & 2) != 0) {
            str2 = recommendLabelMoreResponse.subtitle;
        }
        if ((i7 & 4) != 0) {
            str3 = recommendLabelMoreResponse.addButton;
        }
        if ((i7 & 8) != 0) {
            list = recommendLabelMoreResponse.labels;
        }
        if ((i7 & 16) != 0) {
            str4 = recommendLabelMoreResponse.toast;
        }
        return recommendLabelMoreResponse.copy(str, str2, str3, list, str4);
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
    public final String component3() {
        return this.addButton;
    }

    @Nullable
    public final List<String> component4() {
        return this.labels;
    }

    @Nullable
    public final String component5() {
        return this.toast;
    }

    @NotNull
    public final RecommendLabelMoreResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4) {
        return new RecommendLabelMoreResponse(str, str2, str3, list, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendLabelMoreResponse)) {
            return false;
        }
        RecommendLabelMoreResponse recommendLabelMoreResponse = (RecommendLabelMoreResponse) obj;
        return Intrinsics.areEqual(this.title, recommendLabelMoreResponse.title) && Intrinsics.areEqual(this.subtitle, recommendLabelMoreResponse.subtitle) && Intrinsics.areEqual(this.addButton, recommendLabelMoreResponse.addButton) && Intrinsics.areEqual(this.labels, recommendLabelMoreResponse.labels) && Intrinsics.areEqual(this.toast, recommendLabelMoreResponse.toast);
    }

    @Nullable
    public final String getAddButton() {
        return this.addButton;
    }

    @Nullable
    public final List<String> getLabels() {
        return this.labels;
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

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addButton;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.labels;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str4 = this.toast;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.addButton;
        List<String> list = this.labels;
        String str4 = this.toast;
        StringBuilder sbA = b.a("RecommendLabelMoreResponse(title=", str, ", subtitle=", str2, ", addButton=");
        f.a(str3, ", labels=", ", toast=", sbA, list);
        return C8770a.a(sbA, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.addButton);
        parcel.writeStringList(this.labels);
        parcel.writeString(this.toast);
    }
}
