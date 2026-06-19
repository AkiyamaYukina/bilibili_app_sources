package com.bilibili.studio.template.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.n;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/TemplateCutData.class */
@Parcelize
public final class TemplateCutData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TemplateCutData> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Float> f108633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f108634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f108635c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/TemplateCutData$a.class */
    public static final class a implements Parcelable.Creator<TemplateCutData> {
        @Override // android.os.Parcelable.Creator
        public final TemplateCutData createFromParcel(Parcel parcel) {
            int i7 = parcel.readInt();
            HashMap map = new HashMap(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                map.put(parcel.readString(), Float.valueOf(parcel.readFloat()));
            }
            return new TemplateCutData(map, parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateCutData[] newArray(int i7) {
            return new TemplateCutData[i7];
        }
    }

    public TemplateCutData() {
        HashMap map = new HashMap();
        map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, Float.valueOf(1.0f));
        map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, Float.valueOf(1.0f));
        map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_ROTATION_Z, Float.valueOf(0.0f));
        map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_TRANS_X, Float.valueOf(0.0f));
        map.put(BcutVideoClipCropUtil.STORYBOARD_KEY_TRANS_Y, Float.valueOf(0.0f));
        this(map, -1.0f, "free");
    }

    public TemplateCutData(@NotNull HashMap<String, Float> map, float f7, @NotNull String str) {
        this.f108633a = map;
        this.f108634b = f7;
        this.f108635c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateCutData)) {
            return false;
        }
        TemplateCutData templateCutData = (TemplateCutData) obj;
        return Intrinsics.areEqual(this.f108633a, templateCutData.f108633a) && Float.compare(this.f108634b, templateCutData.f108634b) == 0 && Intrinsics.areEqual(this.f108635c, templateCutData.f108635c);
    }

    public final int hashCode() {
        return this.f108635c.hashCode() + n.a(this.f108634b, this.f108633a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        HashMap<String, Float> map = this.f108633a;
        float f7 = this.f108634b;
        String str = this.f108635c;
        StringBuilder sb = new StringBuilder("TemplateCutData(transformData=");
        sb.append(map);
        sb.append(", ratio=");
        sb.append(f7);
        sb.append(", ratioType=");
        return C8770a.a(sb, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        HashMap<String, Float> map = this.f108633a;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeFloat(entry.getValue().floatValue());
        }
        parcel.writeFloat(this.f108634b);
        parcel.writeString(this.f108635c);
    }
}
