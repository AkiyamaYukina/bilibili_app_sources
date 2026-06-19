package com.bilibili.playerbizcommon.features.interactvideo.model;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/HiddenVar.class */
@Keep
public final class HiddenVar implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "id_v2")
    @Nullable
    private String id;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "is_show")
    private int show;

    @JSONField(name = "skip_overwrite")
    private int skipOverwrite;

    @JSONField(name = "value")
    private float value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/HiddenVar$a.class */
    public static final class a implements Parcelable.Creator<HiddenVar> {
        @Override // android.os.Parcelable.Creator
        public final HiddenVar createFromParcel(Parcel parcel) {
            return new HiddenVar(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HiddenVar[] newArray(int i7) {
            return new HiddenVar[i7];
        }
    }

    public HiddenVar() {
        this(null, null, 0.0f, 0, 0, 31, null);
    }

    public HiddenVar(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
    }

    public HiddenVar(@Nullable String str, @Nullable String str2, float f7, int i7, int i8) {
        this.id = str;
        this.name = str2;
        this.value = f7;
        this.show = i7;
        this.skipOverwrite = i8;
    }

    public /* synthetic */ HiddenVar(String str, String str2, float f7, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 0.0f : f7, (i9 & 8) != 0 ? 1 : i7, (i9 & 16) != 0 ? 0 : i8);
    }

    public static /* synthetic */ HiddenVar copy$default(HiddenVar hiddenVar, String str, String str2, float f7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = hiddenVar.id;
        }
        if ((i9 & 2) != 0) {
            str2 = hiddenVar.name;
        }
        if ((i9 & 4) != 0) {
            f7 = hiddenVar.value;
        }
        if ((i9 & 8) != 0) {
            i7 = hiddenVar.show;
        }
        if ((i9 & 16) != 0) {
            i8 = hiddenVar.skipOverwrite;
        }
        return hiddenVar.copy(str, str2, f7, i7, i8);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    public final float component3() {
        return this.value;
    }

    public final int component4() {
        return this.show;
    }

    public final int component5() {
        return this.skipOverwrite;
    }

    @NotNull
    public final HiddenVar copy(@Nullable String str, @Nullable String str2, float f7, int i7, int i8) {
        return new HiddenVar(str, str2, f7, i7, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenVar)) {
            return false;
        }
        HiddenVar hiddenVar = (HiddenVar) obj;
        return Intrinsics.areEqual(this.id, hiddenVar.id) && Intrinsics.areEqual(this.name, hiddenVar.name) && Float.compare(this.value, hiddenVar.value) == 0 && this.show == hiddenVar.show && this.skipOverwrite == hiddenVar.skipOverwrite;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getShow() {
        return this.show;
    }

    public final int getSkipOverwrite() {
        return this.skipOverwrite;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Integer.hashCode(this.skipOverwrite) + I.a(this.show, n.a(this.value, ((iHashCode2 * 31) + iHashCode) * 31, 31), 31);
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setShow(int i7) {
        this.show = i7;
    }

    public final void setSkipOverwrite(int i7) {
        this.skipOverwrite = i7;
    }

    public final void setValue(float f7) {
        this.value = f7;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        float f7 = this.value;
        int i7 = this.show;
        int i8 = this.skipOverwrite;
        StringBuilder sbA = b.a("HiddenVar(id=", str, ", name=", str2, ", value=");
        sbA.append(f7);
        sbA.append(", show=");
        sbA.append(i7);
        sbA.append(", skipOverwrite=");
        return C4277b.a(i8, ")", sbA);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeFloat(this.value);
        parcel.writeInt(this.show);
        parcel.writeInt(this.skipOverwrite);
    }
}
