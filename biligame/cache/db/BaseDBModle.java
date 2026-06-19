package com.bilibili.biligame.cache.db;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.motion.widget.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/cache/db/BaseDBModle.class */
public class BaseDBModle implements Parcelable {
    public static final Parcelable.Creator<BaseDBModle> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f62796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f62797b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/cache/db/BaseDBModle$a.class */
    public final class a implements Parcelable.Creator<BaseDBModle> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.biligame.cache.db.BaseDBModle, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final BaseDBModle createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f62796a = parcel.readString();
            obj.f62797b = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final BaseDBModle[] newArray(int i7) {
            return new BaseDBModle[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return p.a("[bookId:", this.f62796a, ", bookName:", this.f62797b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f62796a);
        parcel.writeString(this.f62797b);
    }
}
