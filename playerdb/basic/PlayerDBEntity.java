package com.bilibili.playerdb.basic;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.bilibili.playerdb.basic.IPlayerDBData;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerdb/basic/PlayerDBEntity.class */
public class PlayerDBEntity<DATA extends IPlayerDBData> implements Parcelable {
    public static final Parcelable.Creator<PlayerDBEntity> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f83836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f83837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f83838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f83840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DATA f83841f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerdb/basic/PlayerDBEntity$a.class */
    public final class a implements Parcelable.Creator<PlayerDBEntity> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.playerdb.basic.PlayerDBEntity, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final PlayerDBEntity createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f83836a = parcel.readLong();
            obj.f83837b = parcel.readLong();
            obj.f83838c = parcel.readLong();
            obj.f83839d = parcel.readLong();
            obj.f83840e = parcel.readString();
            try {
                obj.f83841f = (DATA) parcel.readParcelable(Class.forName(parcel.readString()).getClassLoader());
            } catch (ClassNotFoundException e7) {
                BLog.d("PlayerDB", e7.getMessage());
                e7.printStackTrace();
            }
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final PlayerDBEntity[] newArray(int i7) {
            return new PlayerDBEntity[i7];
        }
    }

    public PlayerDBEntity() {
        throw null;
    }

    public PlayerDBEntity(DATA data) {
        this.f83841f = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlayerDBEntity{currentPos=" + this.f83836a + ", duration=" + this.f83837b + ", playTime=" + this.f83838c + ", timeStamp=" + this.f83839d + ", dataType=" + this.f83840e + ", data_main=" + this.f83841f.L0() + ", data_extra=" + this.f83841f.l() + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f83836a);
        parcel.writeLong(this.f83837b);
        parcel.writeLong(this.f83838c);
        parcel.writeLong(this.f83839d);
        parcel.writeString(this.f83840e);
        parcel.writeString(this.f83841f.getClass().getName());
        parcel.writeParcelable(this.f83841f, i7);
    }
}
