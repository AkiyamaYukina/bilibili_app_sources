package com.bilibili.studio.module.tuwen.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.n;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BcutCutData.class */
@Parcelize
@Keep
public final class BcutCutData implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<BcutCutData> CREATOR = new Object();
    private float ratio;

    @NotNull
    private String ratioType;

    @NotNull
    private HashMap<String, Float> transformData;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BcutCutData$a.class */
    public static final class a implements Parcelable.Creator<BcutCutData> {
        @Override // android.os.Parcelable.Creator
        public final BcutCutData createFromParcel(Parcel parcel) {
            int i7 = parcel.readInt();
            HashMap map = new HashMap(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                map.put(parcel.readString(), Float.valueOf(parcel.readFloat()));
            }
            return new BcutCutData(map, parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BcutCutData[] newArray(int i7) {
            return new BcutCutData[i7];
        }
    }

    public BcutCutData() {
        this(null, 0.0f, null, 7, null);
    }

    public BcutCutData(@NotNull HashMap<String, Float> map, float f7, @NotNull String str) {
        this.transformData = map;
        this.ratio = f7;
        this.ratioType = str;
    }

    public /* synthetic */ BcutCutData(HashMap map, float f7, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i7 & 1) != 0) {
            map = new HashMap();
            map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, Float.valueOf(1.0f));
            map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, Float.valueOf(1.0f));
            map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_ROTATION_Z, Float.valueOf(0.0f));
            map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_TRANS_X, Float.valueOf(0.0f));
            map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_TRANS_Y, Float.valueOf(0.0f));
        }
        this(map, (i7 & 2) != 0 ? -1.0f : f7, (i7 & 4) != 0 ? "free" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BcutCutData copy$default(BcutCutData bcutCutData, HashMap map, float f7, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            map = bcutCutData.transformData;
        }
        if ((i7 & 2) != 0) {
            f7 = bcutCutData.ratio;
        }
        if ((i7 & 4) != 0) {
            str = bcutCutData.ratioType;
        }
        return bcutCutData.copy(map, f7, str);
    }

    @NotNull
    public final HashMap<String, Float> component1() {
        return this.transformData;
    }

    public final float component2() {
        return this.ratio;
    }

    @NotNull
    public final String component3() {
        return this.ratioType;
    }

    @NotNull
    public final BcutCutData copy(@NotNull HashMap<String, Float> map, float f7, @NotNull String str) {
        return new BcutCutData(map, f7, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BcutCutData)) {
            return false;
        }
        BcutCutData bcutCutData = (BcutCutData) obj;
        return Intrinsics.areEqual(this.transformData, bcutCutData.transformData) && Float.compare(this.ratio, bcutCutData.ratio) == 0 && Intrinsics.areEqual(this.ratioType, bcutCutData.ratioType);
    }

    public final float getRatio() {
        return this.ratio;
    }

    @NotNull
    public final String getRatioType() {
        return this.ratioType;
    }

    @NotNull
    public final HashMap<String, Float> getTransformData() {
        return this.transformData;
    }

    public int hashCode() {
        return this.ratioType.hashCode() + n.a(this.ratio, this.transformData.hashCode() * 31, 31);
    }

    public final void reset() {
        HashMap<String, Float> map = this.transformData;
        Float fValueOf = Float.valueOf(1.0f);
        map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, fValueOf);
        this.transformData.put(BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, fValueOf);
        HashMap<String, Float> map2 = this.transformData;
        Float fValueOf2 = Float.valueOf(0.0f);
        map2.put(BcutVideoClipCropUtil.STORYBOARD_KEY_ROTATION_Z, fValueOf2);
        this.transformData.put(BcutVideoClipCropUtil.STORYBOARD_KEY_TRANS_X, fValueOf2);
        this.transformData.put(BcutVideoClipCropUtil.STORYBOARD_KEY_TRANS_Y, fValueOf2);
        this.ratio = -1.0f;
        this.ratioType = "free";
    }

    public final void setRatio(float f7) {
        this.ratio = f7;
    }

    public final void setRatioType(@NotNull String str) {
        this.ratioType = str;
    }

    public final void setTransformData(@NotNull HashMap<String, Float> map) {
        this.transformData = map;
    }

    @NotNull
    public String toString() {
        HashMap<String, Float> map = this.transformData;
        float f7 = this.ratio;
        String str = this.ratioType;
        StringBuilder sb = new StringBuilder("BcutCutData(transformData=");
        sb.append(map);
        sb.append(", ratio=");
        sb.append(f7);
        sb.append(", ratioType=");
        return C8770a.a(sb, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        HashMap<String, Float> map = this.transformData;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeFloat(entry.getValue().floatValue());
        }
        parcel.writeFloat(this.ratio);
        parcel.writeString(this.ratioType);
    }
}
