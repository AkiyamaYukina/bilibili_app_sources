package com.bilibili.pegasus.data.interestchoose;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.A;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseGuide.class */
@Parcelize
public final class InterestChooseGuide implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InterestChooseGuide> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("icon")
    @Nullable
    private final String f77412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f77413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("subtitle")
    @Nullable
    private final String f77414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("button_text")
    @Nullable
    private final String f77415d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/interestchoose/InterestChooseGuide$a.class */
    public static final class a implements Parcelable.Creator<InterestChooseGuide> {
        @Override // android.os.Parcelable.Creator
        public final InterestChooseGuide createFromParcel(Parcel parcel) {
            return new InterestChooseGuide(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InterestChooseGuide[] newArray(int i7) {
            return new InterestChooseGuide[i7];
        }
    }

    public InterestChooseGuide() {
        this(null, null, null, null);
    }

    public InterestChooseGuide(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f77412a = str;
        this.f77413b = str2;
        this.f77414c = str3;
        this.f77415d = str4;
    }

    @Nullable
    public final String a() {
        return this.f77415d;
    }

    @Nullable
    public final String b() {
        return this.f77412a;
    }

    @Nullable
    public final String c() {
        return this.f77414c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestChooseGuide)) {
            return false;
        }
        InterestChooseGuide interestChooseGuide = (InterestChooseGuide) obj;
        return Intrinsics.areEqual(this.f77412a, interestChooseGuide.f77412a) && Intrinsics.areEqual(this.f77413b, interestChooseGuide.f77413b) && Intrinsics.areEqual(this.f77414c, interestChooseGuide.f77414c) && Intrinsics.areEqual(this.f77415d, interestChooseGuide.f77415d);
    }

    @Nullable
    public final String getTitle() {
        return this.f77413b;
    }

    public final int hashCode() {
        String str = this.f77412a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77413b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77414c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f77415d;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return A.a(this.f77414c, ", buttonText=", this.f77415d, ")", b.a("InterestChooseGuide(icon=", this.f77412a, ", title=", this.f77413b, ", subtitle="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f77412a);
        parcel.writeString(this.f77413b);
        parcel.writeString(this.f77414c);
        parcel.writeString(this.f77415d);
    }
}
