package com.bilibili.lib.ui;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/MenuInfo.class */
public final class MenuInfo implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f64792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f64793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f64794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f64795d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/MenuInfo$a.class */
    public static final class a implements Parcelable.Creator<MenuInfo> {
        @Override // android.os.Parcelable.Creator
        public final MenuInfo createFromParcel(Parcel parcel) {
            return new MenuInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MenuInfo[] newArray(int i7) {
            return new MenuInfo[i7];
        }
    }

    public MenuInfo() {
        this(null, "", null, null);
    }

    public MenuInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f64792a = str;
        this.f64793b = str2;
        this.f64794c = str3;
        this.f64795d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f64792a);
        parcel.writeString(this.f64793b);
        parcel.writeString(this.f64794c);
        parcel.writeString(this.f64795d);
    }
}
