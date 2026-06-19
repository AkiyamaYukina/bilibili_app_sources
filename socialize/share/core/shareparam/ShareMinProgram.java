package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareMinProgram.class */
public final class ShareMinProgram implements Parcelable {
    public static final Parcelable.Creator<ShareMinProgram> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f105019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f105020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ShareImage f105021c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareMinProgram$a.class */
    public final class a implements Parcelable.Creator<ShareMinProgram> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.ShareMinProgram, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ShareMinProgram createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f105019a = parcel.readString();
            obj.f105020b = parcel.readString();
            obj.f105021c = (ShareImage) parcel.readParcelable(ShareImage.class.getClassLoader());
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareMinProgram[] newArray(int i7) {
            return new ShareMinProgram[i7];
        }
    }

    public ShareMinProgram() {
    }

    public ShareMinProgram(@Nullable ShareImage shareImage, @Nullable String str, @Nullable String str2) {
        this.f105019a = str;
        this.f105020b = str2;
        this.f105021c = shareImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f105019a);
        parcel.writeString(this.f105020b);
        parcel.writeParcelable(this.f105021c, i7);
    }
}
