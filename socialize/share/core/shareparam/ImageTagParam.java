package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ImageTagParam.class */
public class ImageTagParam implements Parcelable {
    public static final Parcelable.Creator<ImageTagParam> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f105004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColorInt
    public int f105005b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f105006c = -298343;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105007d = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ImageTagParam$a.class */
    public final class a implements Parcelable.Creator<ImageTagParam> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.ImageTagParam, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ImageTagParam createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f105005b = -1;
            obj.f105006c = -298343;
            obj.f105007d = 1;
            obj.f105004a = parcel.readString();
            obj.f105005b = parcel.readInt();
            obj.f105006c = parcel.readInt();
            obj.f105007d = parcel.readInt();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ImageTagParam[] newArray(int i7) {
            return new ImageTagParam[i7];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f105004a);
        parcel.writeInt(this.f105005b);
        parcel.writeInt(this.f105006c);
        parcel.writeInt(this.f105007d);
    }
}
