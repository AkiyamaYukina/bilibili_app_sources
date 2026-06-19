package com.bilibili.music.podcast.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPagerReportData.class */
public final class MusicPagerReportData implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f66422a = "6";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f66423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f66424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f66425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f66426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f66427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f66428g;

    @Nullable
    public String h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPagerReportData$a.class */
    public static final class a implements Parcelable.Creator<MusicPagerReportData> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.music.podcast.data.MusicPagerReportData, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final MusicPagerReportData createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f66422a = "6";
            String string = parcel.readString();
            obj.f66422a = string != null ? string : "6";
            obj.f66423b = parcel.readString();
            obj.f66424c = parcel.readString();
            obj.f66425d = parcel.readString();
            obj.f66427f = parcel.readString();
            obj.f66428g = parcel.readString();
            obj.h = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final MusicPagerReportData[] newArray(int i7) {
            return new MusicPagerReportData[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f66422a);
        parcel.writeString(this.f66423b);
        parcel.writeString(this.f66424c);
        parcel.writeString(this.f66425d);
        parcel.writeString(this.f66427f);
        parcel.writeString(this.f66428g);
        parcel.writeString(this.h);
    }
}
