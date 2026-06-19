package com.bilibili.opd.app.bizcommon.hybridruntime.preload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/preload/PreloadPriorityUrl.class */
public class PreloadPriorityUrl implements Parcelable {
    public static final Parcelable.Creator<PreloadPriorityUrl> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f73589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73591c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/preload/PreloadPriorityUrl$a.class */
    public final class a implements Parcelable.Creator<PreloadPriorityUrl> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.opd.app.bizcommon.hybridruntime.preload.PreloadPriorityUrl, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final PreloadPriorityUrl createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f73589a = parcel.readString();
            obj.f73590b = parcel.readString();
            obj.f73591c = parcel.readInt();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final PreloadPriorityUrl[] newArray(int i7) {
            return new PreloadPriorityUrl[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreloadPriorityUrl preloadPriorityUrl = (PreloadPriorityUrl) obj;
        if (this.f73589a.equals(preloadPriorityUrl.f73589a)) {
            return this.f73590b.equals(preloadPriorityUrl.f73590b);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f73591c;
        return this.f73590b.hashCode() + this.f73589a.hashCode() + (i7 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadPriorityUrl {mModule = ");
        sb.append(this.f73589a);
        sb.append("', mUrl = ");
        sb.append(this.f73590b);
        sb.append(", mPriority = ");
        return C3269h.a(sb, this.f73591c, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f73589a);
        parcel.writeString(this.f73590b);
        parcel.writeInt(this.f73591c);
    }
}
