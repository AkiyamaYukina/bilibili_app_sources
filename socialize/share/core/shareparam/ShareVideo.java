package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareVideo.class */
public class ShareVideo implements Parcelable {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ShareImage f105028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f105029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f105030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f105031d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareVideo$a.class */
    public final class a implements Parcelable.Creator<ShareVideo> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.ShareVideo, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ShareVideo createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f105028a = (ShareImage) parcel.readParcelable(ShareImage.class.getClassLoader());
            obj.f105029b = parcel.readString();
            obj.f105030c = parcel.readString();
            obj.f105031d = parcel.readString();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareVideo[] newArray(int i7) {
            return new ShareVideo[i7];
        }
    }

    public ShareVideo() {
    }

    public ShareVideo(@Nullable ShareImage shareImage, @Nullable String str, @Nullable String str2) {
        this.f105028a = shareImage;
        this.f105030c = str;
        this.f105031d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f105028a, 0);
        parcel.writeString(this.f105029b);
        parcel.writeString(this.f105030c);
        parcel.writeString(this.f105031d);
    }
}
