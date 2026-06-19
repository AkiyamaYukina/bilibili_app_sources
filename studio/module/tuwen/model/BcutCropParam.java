package com.bilibili.studio.module.tuwen.model;

import I.E;
import J1.z;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BcutCropParam.class */
@Parcelize
@Keep
public final class BcutCropParam implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<BcutCropParam> CREATOR = new Object();

    @NotNull
    private BcutCutData cutData;

    @NotNull
    private String filePath;
    private long seekPoint;
    private long trimIn;
    private long trimOut;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BcutCropParam$a.class */
    public static final class a implements Parcelable.Creator<BcutCropParam> {
        @Override // android.os.Parcelable.Creator
        public final BcutCropParam createFromParcel(Parcel parcel) {
            return new BcutCropParam(BcutCutData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final BcutCropParam[] newArray(int i7) {
            return new BcutCropParam[i7];
        }
    }

    public BcutCropParam() {
        this(null, null, 0L, 0L, 0L, 31, null);
    }

    public BcutCropParam(@NotNull BcutCutData bcutCutData, @NotNull String str, long j7, long j8, long j9) {
        this.cutData = bcutCutData;
        this.filePath = str;
        this.seekPoint = j7;
        this.trimIn = j8;
        this.trimOut = j9;
    }

    public /* synthetic */ BcutCropParam(BcutCutData bcutCutData, String str, long j7, long j8, long j9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new BcutCutData(null, 0.0f, null, 7, null) : bcutCutData, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? 0L : j7, (i7 & 8) != 0 ? -1L : j8, (i7 & 16) != 0 ? -1L : j9);
    }

    public static /* synthetic */ BcutCropParam copy$default(BcutCropParam bcutCropParam, BcutCutData bcutCutData, String str, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bcutCutData = bcutCropParam.cutData;
        }
        if ((i7 & 2) != 0) {
            str = bcutCropParam.filePath;
        }
        if ((i7 & 4) != 0) {
            j7 = bcutCropParam.seekPoint;
        }
        if ((i7 & 8) != 0) {
            j8 = bcutCropParam.trimIn;
        }
        if ((i7 & 16) != 0) {
            j9 = bcutCropParam.trimOut;
        }
        return bcutCropParam.copy(bcutCutData, str, j7, j8, j9);
    }

    private final void correspondingClone(HashMap<String, Float> map, HashMap<String, Float> map2) {
        for (Map.Entry<String, Float> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public final void clear() {
    }

    @NotNull
    public final BcutCutData component1() {
        return this.cutData;
    }

    @NotNull
    public final String component2() {
        return this.filePath;
    }

    public final long component3() {
        return this.seekPoint;
    }

    public final long component4() {
        return this.trimIn;
    }

    public final long component5() {
        return this.trimOut;
    }

    @NotNull
    public final BcutCropParam copy(@NotNull BcutCutData bcutCutData, @NotNull String str, long j7, long j8, long j9) {
        return new BcutCropParam(bcutCutData, str, j7, j8, j9);
    }

    public final void correspondingClone(@Nullable BcutCropParam bcutCropParam) {
        if (bcutCropParam != null) {
            correspondingClone(this.cutData.getTransformData(), bcutCropParam.cutData.getTransformData());
            this.cutData.setRatio(bcutCropParam.cutData.getRatio());
            this.cutData.setRatioType(bcutCropParam.cutData.getRatioType());
            this.filePath = bcutCropParam.filePath;
            this.seekPoint = bcutCropParam.seekPoint;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BcutCropParam)) {
            return false;
        }
        BcutCropParam bcutCropParam = (BcutCropParam) obj;
        return Intrinsics.areEqual(this.cutData, bcutCropParam.cutData) && Intrinsics.areEqual(this.filePath, bcutCropParam.filePath) && this.seekPoint == bcutCropParam.seekPoint && this.trimIn == bcutCropParam.trimIn && this.trimOut == bcutCropParam.trimOut;
    }

    @NotNull
    public final BcutCutData getCutData() {
        return this.cutData;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getSeekPoint() {
        return this.seekPoint;
    }

    public final long getTrimIn() {
        return this.trimIn;
    }

    public final long getTrimOut() {
        return this.trimOut;
    }

    public int hashCode() {
        return Long.hashCode(this.trimOut) + C3554n0.a(C3554n0.a(E.a(this.cutData.hashCode() * 31, 31, this.filePath), 31, this.seekPoint), 31, this.trimIn);
    }

    public final void reset() {
        this.cutData.reset();
        this.filePath = "";
        this.seekPoint = 0L;
        this.trimIn = -1L;
        this.trimOut = -1L;
    }

    public final void setCutData(@NotNull BcutCutData bcutCutData) {
        this.cutData = bcutCutData;
    }

    public final void setFilePath(@NotNull String str) {
        this.filePath = str;
    }

    public final void setSeekPoint(long j7) {
        this.seekPoint = j7;
    }

    public final void setTrimIn(long j7) {
        this.trimIn = j7;
    }

    public final void setTrimOut(long j7) {
        this.trimOut = j7;
    }

    @NotNull
    public String toString() {
        BcutCutData bcutCutData = this.cutData;
        String str = this.filePath;
        long j7 = this.seekPoint;
        long j8 = this.trimIn;
        long j9 = this.trimOut;
        StringBuilder sb = new StringBuilder("BcutCropParam(cutData=");
        sb.append(bcutCutData);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", seekPoint=");
        sb.append(j7);
        z.a(j8, ", trimIn=", ", trimOut=", sb);
        return android.support.v4.media.session.a.a(sb, j9, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        this.cutData.writeToParcel(parcel, i7);
        parcel.writeString(this.filePath);
        parcel.writeLong(this.seekPoint);
        parcel.writeLong(this.trimIn);
        parcel.writeLong(this.trimOut);
    }
}
