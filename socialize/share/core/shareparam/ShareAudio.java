package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareAudio.class */
public class ShareAudio implements Parcelable {
    public static final Parcelable.Creator<ShareAudio> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ShareImage f105008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f105009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f105010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f105011d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareAudio$a.class */
    public final class a implements Parcelable.Creator<ShareAudio> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.ShareAudio, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ShareAudio createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f105008a = (ShareImage) parcel.readParcelable(ShareImage.class.getClassLoader());
            obj.f105009b = parcel.readString();
            obj.f105010c = parcel.readString();
            obj.f105011d = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareAudio[] newArray(int i7) {
            return new ShareAudio[i7];
        }
    }

    public ShareAudio() {
    }

    public ShareAudio(@Nullable ShareImage shareImage, @Nullable String str, @Nullable String str2) {
        this.f105008a = shareImage;
        this.f105009b = str;
        this.f105011d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f105008a, 0);
        parcel.writeString(this.f105009b);
        parcel.writeString(this.f105010c);
        parcel.writeString(this.f105011d);
    }
}
