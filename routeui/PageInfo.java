package com.bilibili.routeui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/PageInfo.class */
public final class PageInfo implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f86259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f86261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Bundle f86262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Class<?> f86263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Bundle f86264f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/PageInfo$a.class */
    public static final class a implements Parcelable.Creator<PageInfo> {
        @Override // android.os.Parcelable.Creator
        public final PageInfo createFromParcel(Parcel parcel) {
            Object value = parcel.readValue(Integer.TYPE.getClassLoader());
            return new PageInfo(value instanceof Integer ? (Integer) value : null, parcel.readString(), parcel.readString(), parcel.readBundle(Bundle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PageInfo[] newArray(int i7) {
            return new PageInfo[i7];
        }
    }

    public PageInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f86259a = num;
        this.f86260b = str;
        this.f86261c = str2;
        this.f86262d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeValue(this.f86259a);
        parcel.writeString(this.f86260b);
        parcel.writeString(this.f86261c);
        parcel.writeBundle(this.f86262d);
    }
}
