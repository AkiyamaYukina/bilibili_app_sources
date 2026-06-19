package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/QualityDescInfoV2.class */
@Keep
public final class QualityDescInfoV2 {

    @SerializedName("curQn")
    private int currentQn;

    @SerializedName("supportQnList")
    @Nullable
    private ArrayList<QualityItem> supportQnList;

    @SerializedName("userDesireQn")
    private int userDesireQn;

    public QualityDescInfoV2() {
        this(null, 0, 0, 7, null);
    }

    public QualityDescInfoV2(@Nullable ArrayList<QualityItem> arrayList, int i7, int i8) {
        this.supportQnList = arrayList;
        this.currentQn = i7;
        this.userDesireQn = i8;
    }

    public /* synthetic */ QualityDescInfoV2(ArrayList arrayList, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : arrayList, (i9 & 2) != 0 ? 0 : i7, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QualityDescInfoV2 copy$default(QualityDescInfoV2 qualityDescInfoV2, ArrayList arrayList, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            arrayList = qualityDescInfoV2.supportQnList;
        }
        if ((i9 & 2) != 0) {
            i7 = qualityDescInfoV2.currentQn;
        }
        if ((i9 & 4) != 0) {
            i8 = qualityDescInfoV2.userDesireQn;
        }
        return qualityDescInfoV2.copy(arrayList, i7, i8);
    }

    @Nullable
    public final ArrayList<QualityItem> component1() {
        return this.supportQnList;
    }

    public final int component2() {
        return this.currentQn;
    }

    public final int component3() {
        return this.userDesireQn;
    }

    @NotNull
    public final QualityDescInfoV2 copy(@Nullable ArrayList<QualityItem> arrayList, int i7, int i8) {
        return new QualityDescInfoV2(arrayList, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityDescInfoV2)) {
            return false;
        }
        QualityDescInfoV2 qualityDescInfoV2 = (QualityDescInfoV2) obj;
        return Intrinsics.areEqual(this.supportQnList, qualityDescInfoV2.supportQnList) && this.currentQn == qualityDescInfoV2.currentQn && this.userDesireQn == qualityDescInfoV2.userDesireQn;
    }

    public final int getCurrentQn() {
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
        return Integer.hashCode(this.userDesireQn) + I.a(this.currentQn, (arrayList == null ? 0 : arrayList.hashCode()) * 31, 31);
    }

    public final void setCurrentQn(int i7) {
        this.currentQn = i7;
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
        int i7 = this.currentQn;
        int i8 = this.userDesireQn;
        StringBuilder sb = new StringBuilder("QualityDescInfoV2(supportQnList=");
        sb.append(arrayList);
        sb.append(", currentQn=");
        sb.append(i7);
        sb.append(", userDesireQn=");
        return C4277b.a(i8, ")", sb);
    }
}
