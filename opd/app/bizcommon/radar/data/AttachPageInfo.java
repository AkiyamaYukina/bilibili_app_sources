package com.bilibili.opd.app.bizcommon.radar.data;

import Di0.C1600d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/AttachPageInfo.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class AttachPageInfo implements Parcelable {

    @Nullable
    private String eventName;

    @Nullable
    private String homePageUUID;
    private boolean isHomePage;

    @NotNull
    public static final Parcelable.Creator<AttachPageInfo> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/AttachPageInfo$a.class */
    public static final class a implements Parcelable.Creator<AttachPageInfo> {
        @Override // android.os.Parcelable.Creator
        public final AttachPageInfo createFromParcel(Parcel parcel) {
            return new AttachPageInfo(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AttachPageInfo[] newArray(int i7) {
            return new AttachPageInfo[i7];
        }
    }

    public AttachPageInfo() {
        this(false, null, null, 7, null);
    }

    public AttachPageInfo(boolean z6, @Nullable String str, @Nullable String str2) {
        this.isHomePage = z6;
        this.homePageUUID = str;
        this.eventName = str2;
    }

    public /* synthetic */ AttachPageInfo(boolean z6, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ AttachPageInfo copy$default(AttachPageInfo attachPageInfo, boolean z6, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = attachPageInfo.isHomePage;
        }
        if ((i7 & 2) != 0) {
            str = attachPageInfo.homePageUUID;
        }
        if ((i7 & 4) != 0) {
            str2 = attachPageInfo.eventName;
        }
        return attachPageInfo.copy(z6, str, str2);
    }

    public final boolean component1() {
        return this.isHomePage;
    }

    @Nullable
    public final String component2() {
        return this.homePageUUID;
    }

    @Nullable
    public final String component3() {
        return this.eventName;
    }

    @NotNull
    public final AttachPageInfo copy(boolean z6, @Nullable String str, @Nullable String str2) {
        return new AttachPageInfo(z6, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachPageInfo)) {
            return false;
        }
        AttachPageInfo attachPageInfo = (AttachPageInfo) obj;
        return this.isHomePage == attachPageInfo.isHomePage && Intrinsics.areEqual(this.homePageUUID, attachPageInfo.homePageUUID) && Intrinsics.areEqual(this.eventName, attachPageInfo.eventName);
    }

    @Nullable
    public final String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final String getHomePageUUID() {
        return this.homePageUUID;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isHomePage);
        String str = this.homePageUUID;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.eventName;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final boolean isHomePage() {
        return this.isHomePage;
    }

    public final void setEventName(@Nullable String str) {
        this.eventName = str;
    }

    public final void setHomePage(boolean z6) {
        this.isHomePage = z6;
    }

    public final void setHomePageUUID(@Nullable String str) {
        this.homePageUUID = str;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.isHomePage;
        String str = this.homePageUUID;
        return C8770a.a(C1600d.b("AttachPageInfo(isHomePage=", ", homePageUUID=", str, ", eventName=", z6), this.eventName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.isHomePage ? 1 : 0);
        parcel.writeString(this.homePageUUID);
        parcel.writeString(this.eventName);
    }
}
