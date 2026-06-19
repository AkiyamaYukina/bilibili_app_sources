package com.bilibili.studio.framework.utils;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/framework/utils/PackageUtils$Package.class */
public class PackageUtils$Package implements Parcelable, Serializable {
    public static final Parcelable.Creator<PackageUtils$Package> CREATOR = new Object();
    public int appIconRes;
    public String appIconUrl;
    public transient ApplicationInfo appInfo;
    public String appName;
    public String packageName;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/framework/utils/PackageUtils$Package$a.class */
    public final class a implements Parcelable.Creator<PackageUtils$Package> {
        @Override // android.os.Parcelable.Creator
        public final PackageUtils$Package createFromParcel(Parcel parcel) {
            return new PackageUtils$Package(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PackageUtils$Package[] newArray(int i7) {
            return new PackageUtils$Package[i7];
        }
    }

    public PackageUtils$Package() {
    }

    public PackageUtils$Package(Parcel parcel) {
        this.packageName = parcel.readString();
        this.appName = parcel.readString();
        this.appIconUrl = parcel.readString();
        this.appIconRes = parcel.readInt();
    }

    public PackageUtils$Package(String str, String str2) {
        this.packageName = str;
        this.appName = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAppIconRes() {
        return this.appIconRes;
    }

    public String getAppIconUrl() {
        return this.appIconUrl;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppIconRes(int i7) {
        this.appIconRes = i7;
    }

    public void setAppIconUrl(String str) {
        this.appIconUrl = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        return "Package{packageName='" + this.packageName + "', appName='" + this.appName + "', appIconUrl='" + this.appIconUrl + "', appIconRes=" + this.appIconRes + ", appInfo=" + this.appInfo + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.packageName);
        parcel.writeString(this.appName);
        parcel.writeString(this.appIconUrl);
        parcel.writeInt(this.appIconRes);
    }
}
