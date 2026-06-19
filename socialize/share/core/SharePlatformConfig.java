package com.bilibili.socialize.share.core;

import Pv0.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/SharePlatformConfig.class */
public class SharePlatformConfig implements Parcelable {
    public static final Parcelable.Creator<SharePlatformConfig> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray<Map<String, String>> f104980a = new SparseArray<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/SharePlatformConfig$a.class */
    public final class a implements Parcelable.Creator<SharePlatformConfig> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.SharePlatformConfig, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final SharePlatformConfig createFromParcel(Parcel parcel) {
            int i7;
            ?? obj = new Object();
            obj.f104980a = new SparseArray<>();
            try {
                int i8 = parcel.readInt();
                int i9 = 0;
                do {
                    int i10 = parcel.readInt();
                    int i11 = parcel.readInt();
                    HashMap map = new HashMap();
                    for (int i12 = 0; i12 < i11; i12++) {
                        map.put(parcel.readString(), parcel.readString());
                    }
                    obj.f104980a.put(i10, map);
                    i7 = i9 + 1;
                    i9 = i7;
                } while (i7 < i8);
            } catch (Exception e7) {
                b.a("SharePlatformConfig", "SharePlatformConfig read error");
            }
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final SharePlatformConfig[] newArray(int i7) {
            return new SharePlatformConfig[i7];
        }
    }

    public final void a(SocializeMedia socializeMedia, String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new RuntimeException("Please check your share app config info");
        }
        HashMap map = new HashMap();
        int length = strArr.length / 2;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            map.put(strArr[i8], strArr[i8 + 1]);
        }
        this.f104980a.put(socializeMedia.ordinal(), map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        try {
            int size = this.f104980a.size();
            parcel.writeInt(size);
            int i9 = 0;
            do {
                int iKeyAt = this.f104980a.keyAt(i9);
                parcel.writeInt(iKeyAt);
                Map<String, String> map = this.f104980a.get(iKeyAt);
                parcel.writeInt(map.size());
                for (String str : map.keySet()) {
                    parcel.writeString(str);
                    parcel.writeString(map.get(str));
                }
                i8 = i9 + 1;
                i9 = i8;
            } while (i8 < size);
        } catch (Exception e7) {
            b.a("SharePlatformConfig", "SharePlatformConfig write error");
        }
    }
}
