package com.bilibili.ogv.operation.entrance.indexpage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/PreSelectedFilter.class */
public class PreSelectedFilter implements Parcelable, Comparable<PreSelectedFilter> {
    public static final Parcelable.Creator<PreSelectedFilter> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<PreselectedFilterItem> f70162c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/PreSelectedFilter$a.class */
    public final class a implements Parcelable.Creator<PreSelectedFilter> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation.entrance.indexpage.PreSelectedFilter, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final PreSelectedFilter createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f70160a = parcel.readString();
            obj.f70161b = parcel.readString();
            obj.f70162c = parcel.createTypedArrayList(PreselectedFilterItem.CREATOR);
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final PreSelectedFilter[] newArray(int i7) {
            return new PreSelectedFilter[i7];
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull PreSelectedFilter preSelectedFilter) {
        return this.f70160a.compareTo(preSelectedFilter.f70160a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PreSelectedFilter)) {
            return false;
        }
        PreSelectedFilter preSelectedFilter = (PreSelectedFilter) obj;
        String str = this.f70160a;
        return str != null && str.equals(preSelectedFilter.f70160a);
    }

    public final int hashCode() {
        String str = this.f70160a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f70160a);
        parcel.writeString(this.f70161b);
        parcel.writeTypedList(this.f70162c);
    }
}
