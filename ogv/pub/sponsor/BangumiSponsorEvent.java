package com.bilibili.ogv.pub.sponsor;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiSponsorEvent.class */
@Bson
@Parcelize
public final class BangumiSponsorEvent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BangumiSponsorEvent> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71789c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiSponsorEvent$a.class */
    public static final class a implements Parcelable.Creator<BangumiSponsorEvent> {
        @Override // android.os.Parcelable.Creator
        public final BangumiSponsorEvent createFromParcel(Parcel parcel) {
            return new BangumiSponsorEvent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiSponsorEvent[] newArray(int i7) {
            return new BangumiSponsorEvent[i7];
        }
    }

    public BangumiSponsorEvent(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f71787a = str;
        this.f71788b = str2;
        this.f71789c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f71787a);
        parcel.writeString(this.f71788b);
        parcel.writeString(this.f71789c);
    }
}
