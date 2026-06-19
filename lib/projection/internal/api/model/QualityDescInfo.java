package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.C4277b;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/QualityDescInfo.class */
@Keep
public final class QualityDescInfo {

    @SerializedName("currentQn")
    @Nullable
    private CurrQualityInfo currentQn;

    @SerializedName("supportQnList")
    @Nullable
    private ArrayList<QualityItem> supportQnList;

    @SerializedName("userDesireQn")
    private int userDesireQn;

    public QualityDescInfo() {
        this(null, null, 0, 7, null);
    }

    public QualityDescInfo(@Nullable ArrayList<QualityItem> arrayList, @Nullable CurrQualityInfo currQualityInfo, int i7) {
        this.supportQnList = arrayList;
        this.currentQn = currQualityInfo;
        this.userDesireQn = i7;
    }

    public /* synthetic */ QualityDescInfo(ArrayList arrayList, CurrQualityInfo currQualityInfo, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : arrayList, (i8 & 2) != 0 ? null : currQualityInfo, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QualityDescInfo copy$default(QualityDescInfo qualityDescInfo, ArrayList arrayList, CurrQualityInfo currQualityInfo, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            arrayList = qualityDescInfo.supportQnList;
        }
        if ((i8 & 2) != 0) {
            currQualityInfo = qualityDescInfo.currentQn;
        }
        if ((i8 & 4) != 0) {
            i7 = qualityDescInfo.userDesireQn;
        }
        return qualityDescInfo.copy(arrayList, currQualityInfo, i7);
    }

    @Nullable
    public final ArrayList<QualityItem> component1() {
        return this.supportQnList;
    }

    @Nullable
    public final CurrQualityInfo component2() {
        return this.currentQn;
    }

    public final int component3() {
        return this.userDesireQn;
    }

    @NotNull
    public final QualityDescInfo copy(@Nullable ArrayList<QualityItem> arrayList, @Nullable CurrQualityInfo currQualityInfo, int i7) {
        return new QualityDescInfo(arrayList, currQualityInfo, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityDescInfo)) {
            return false;
        }
        QualityDescInfo qualityDescInfo = (QualityDescInfo) obj;
        return Intrinsics.areEqual(this.supportQnList, qualityDescInfo.supportQnList) && Intrinsics.areEqual(this.currentQn, qualityDescInfo.currentQn) && this.userDesireQn == qualityDescInfo.userDesireQn;
    }

    @Nullable
    public final CurrQualityInfo getCurrentQn() {
        return this.currentQn;
    }

    @Nullable
    public final ArrayList<QualityItem> getSupportQnList() {
        return this.supportQnList;
    }

    public final int getUserDesireQn() {
        return this.userDesireQn;
    }

    public int hashCode() {
        ArrayList<QualityItem> arrayList = this.supportQnList;
        int iHashCode = 0;
        int iHashCode2 = arrayList == null ? 0 : arrayList.hashCode();
        CurrQualityInfo currQualityInfo = this.currentQn;
        if (currQualityInfo != null) {
            iHashCode = currQualityInfo.hashCode();
        }
        return Integer.hashCode(this.userDesireQn) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    public final void setCurrentQn(@Nullable CurrQualityInfo currQualityInfo) {
        this.currentQn = currQualityInfo;
    }

    public final void setSupportQnList(@Nullable ArrayList<QualityItem> arrayList) {
        this.supportQnList = arrayList;
    }

    public final void setUserDesireQn(int i7) {
        this.userDesireQn = i7;
    }

    @NotNull
    public String toString() {
        ArrayList<QualityItem> arrayList = this.supportQnList;
        CurrQualityInfo currQualityInfo = this.currentQn;
        int i7 = this.userDesireQn;
        StringBuilder sb = new StringBuilder("QualityDescInfo(supportQnList=");
        sb.append(arrayList);
        sb.append(", currentQn=");
        sb.append(currQualityInfo);
        sb.append(", userDesireQn=");
        return C4277b.a(i7, ")", sb);
    }
}
