package com.bilibili.teenagersmode.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagersTextConfig.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class TeenagersTextConfig implements Parcelable {

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @NotNull
    public static final Parcelable.Creator<TeenagersTextConfig> CREATOR = new a();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagersTextConfig$a.class */
    public static final class a implements Parcelable.Creator<TeenagersTextConfig> {
        @Override // android.os.Parcelable.Creator
        public final TeenagersTextConfig createFromParcel(Parcel parcel) {
            return new TeenagersTextConfig(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TeenagersTextConfig[] newArray(int i7) {
            return new TeenagersTextConfig[i7];
        }
    }

    public TeenagersTextConfig() {
        this(null, null, 3, null);
    }

    public TeenagersTextConfig(@Nullable String str, @Nullable String str2) {
        this.icon = str;
        this.text = str2;
    }

    public /* synthetic */ TeenagersTextConfig(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ TeenagersTextConfig copy$default(TeenagersTextConfig teenagersTextConfig, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = teenagersTextConfig.icon;
        }
        if ((i7 & 2) != 0) {
            str2 = teenagersTextConfig.text;
        }
        return teenagersTextConfig.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.icon;
    }

    @Nullable
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final TeenagersTextConfig copy(@Nullable String str, @Nullable String str2) {
        return new TeenagersTextConfig(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeenagersTextConfig)) {
            return false;
        }
        TeenagersTextConfig teenagersTextConfig = (TeenagersTextConfig) obj;
        return Intrinsics.areEqual(this.icon, teenagersTextConfig.icon) && Intrinsics.areEqual(this.text, teenagersTextConfig.text);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.text;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    @NotNull
    public String toString() {
        return p.a("TeenagersTextConfig(icon=", this.icon, ", text=", this.text, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.icon);
        parcel.writeString(this.text);
    }
}
