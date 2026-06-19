package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.A;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/MediaEpisodeIndex.class */
@Bson
@Parcelize
public final class MediaEpisodeIndex implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MediaEpisodeIndex> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f71691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("index_show")
    @Nullable
    private final String f71692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("play_index_show")
    @Nullable
    private final String f71693d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/MediaEpisodeIndex$a.class */
    public static final class a implements Parcelable.Creator<MediaEpisodeIndex> {
        @Override // android.os.Parcelable.Creator
        public final MediaEpisodeIndex createFromParcel(Parcel parcel) {
            return new MediaEpisodeIndex(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaEpisodeIndex[] newArray(int i7) {
            return new MediaEpisodeIndex[i7];
        }
    }

    public MediaEpisodeIndex(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f71690a = i7;
        this.f71691b = str;
        this.f71692c = str2;
        this.f71693d = str3;
    }

    @Nullable
    public final String a() {
        return this.f71692c;
    }

    @Nullable
    public final String b() {
        return this.f71693d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaEpisodeIndex)) {
            return false;
        }
        MediaEpisodeIndex mediaEpisodeIndex = (MediaEpisodeIndex) obj;
        return this.f71690a == mediaEpisodeIndex.f71690a && Intrinsics.areEqual(this.f71691b, mediaEpisodeIndex.f71691b) && Intrinsics.areEqual(this.f71692c, mediaEpisodeIndex.f71692c) && Intrinsics.areEqual(this.f71693d, mediaEpisodeIndex.f71693d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f71690a);
        String str = this.f71691b;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f71692c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f71693d;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return A.a(this.f71692c, ", playIndexDesc=", this.f71693d, ")", bilibili.live.app.service.resolver.a.b(this.f71690a, "MediaEpisodeIndex(id=", ", index=", this.f71691b, ", indexDesc="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f71690a);
        parcel.writeString(this.f71691b);
        parcel.writeString(this.f71692c);
        parcel.writeString(this.f71693d);
    }
}
