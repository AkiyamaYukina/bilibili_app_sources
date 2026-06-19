package com.bilibili.playerbizcommon.features.interactvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.snapshots.z;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/Video.class */
@Keep
public final class Video implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "aid")
    private long aid;

    @JSONField(name = "cid")
    private long cid;

    @JSONField(name = "edge_id")
    private long id;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/Video$a.class */
    public static final class a implements Parcelable.Creator<Video> {
        @Override // android.os.Parcelable.Creator
        public final Video createFromParcel(Parcel parcel) {
            return new Video(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Video[] newArray(int i7) {
            return new Video[i7];
        }
    }

    public Video() {
        this(0L, 0L, 0L, 7, null);
    }

    public Video(long j7, long j8, long j9) {
        this.id = j7;
        this.cid = j8;
        this.aid = j9;
    }

    public /* synthetic */ Video(long j7, long j8, long j9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? 0L : j8, (i7 & 4) != 0 ? 0L : j9);
    }

    public Video(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    public static /* synthetic */ Video copy$default(Video video, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = video.id;
        }
        if ((i7 & 2) != 0) {
            j8 = video.cid;
        }
        if ((i7 & 4) != 0) {
            j9 = video.aid;
        }
        return video.copy(j7, j8, j9);
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.cid;
    }

    public final long component3() {
        return this.aid;
    }

    @NotNull
    public final Video copy(long j7, long j8, long j9) {
        return new Video(j7, j8, j9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return this.id == video.id && this.cid == video.cid && this.aid == video.aid;
    }

    public final long getAid() {
        return this.aid;
    }

    public final long getCid() {
        return this.cid;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.aid) + C3554n0.a(Long.hashCode(this.id) * 31, 31, this.cid);
    }

    public final void setAid(long j7) {
        this.aid = j7;
    }

    public final void setCid(long j7) {
        this.cid = j7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        long j8 = this.cid;
        long j9 = this.aid;
        StringBuilder sbA = z.a(j7, "Video(id=", ", cid=");
        sbA.append(j8);
        return androidx.exifinterface.media.a.a(j9, ", aid=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.cid);
        parcel.writeLong(this.aid);
    }
}
