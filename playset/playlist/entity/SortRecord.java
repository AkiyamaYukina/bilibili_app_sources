package com.bilibili.playset.playlist.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/entity/SortRecord.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SortRecord implements Parcelable {
    private long insertId;
    private int insertType;
    private long preId;
    private int preType;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/entity/SortRecord$a.class */
    public static final class a implements Parcelable.Creator<SortRecord> {
        @Override // android.os.Parcelable.Creator
        public final SortRecord createFromParcel(Parcel parcel) {
            return new SortRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SortRecord[] newArray(int i7) {
            return new SortRecord[i7];
        }
    }

    public SortRecord() {
    }

    public SortRecord(@NotNull Parcel parcel) {
        this();
        this.preId = parcel.readLong();
        this.preType = parcel.readInt();
        this.insertId = parcel.readLong();
        this.insertType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getInsertId() {
        return this.insertId;
    }

    public final int getInsertType() {
        return this.insertType;
    }

    public final long getPreId() {
        return this.preId;
    }

    public final int getPreType() {
        return this.preType;
    }

    public final boolean isInvalid() {
        return this.preId == 0 && this.preType == 0 && this.insertId == 0 && this.insertType == 0;
    }

    public final void setInsertId(long j7) {
        this.insertId = j7;
    }

    public final void setInsertType(int i7) {
        this.insertType = i7;
    }

    public final void setPreId(long j7) {
        this.preId = j7;
    }

    public final void setPreType(int i7) {
        this.preType = i7;
    }

    @NotNull
    public String toString() {
        return this.preId + ":" + this.preType + ":" + this.insertId + ":" + this.insertType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.preId);
        parcel.writeInt(this.preType);
        parcel.writeLong(this.insertId);
        parcel.writeInt(this.insertType);
    }
}
