package com.bilibili.ogv.operation.entrance.indexpage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/PreselectedFilterItem.class */
public class PreselectedFilterItem implements Parcelable, Comparable<PreselectedFilterItem> {
    public static final Parcelable.Creator<PreselectedFilterItem> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f70163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70164b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/PreselectedFilterItem$a.class */
    public final class a implements Parcelable.Creator<PreselectedFilterItem> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.operation.entrance.indexpage.PreselectedFilterItem, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final PreselectedFilterItem createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f70163a = parcel.readString();
            obj.f70164b = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final PreselectedFilterItem[] newArray(int i7) {
            return new PreselectedFilterItem[i7];
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull PreselectedFilterItem preselectedFilterItem) {
        return this.f70163a.compareTo(preselectedFilterItem.f70163a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PreselectedFilterItem)) {
            return false;
        }
        PreselectedFilterItem preselectedFilterItem = (PreselectedFilterItem) obj;
        String str = this.f70163a;
        return str != null && str.equals(preselectedFilterItem.f70163a);
    }

    public final int hashCode() {
        String str = this.f70163a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f70163a);
        parcel.writeString(this.f70164b);
    }
}
