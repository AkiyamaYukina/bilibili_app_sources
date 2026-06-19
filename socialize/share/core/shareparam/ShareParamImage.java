package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamImage.class */
public class ShareParamImage extends BaseShareParam {
    public static final Parcelable.Creator<ShareParamImage> CREATOR = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ShareImage f105023g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamImage$a.class */
    public final class a implements Parcelable.Creator<ShareParamImage> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamImage] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamImage createFromParcel(Parcel parcel) {
            ?? baseShareParam = new BaseShareParam(parcel);
            baseShareParam.f105023g = (ShareImage) parcel.readParcelable(ShareImage.class.getClassLoader());
            return baseShareParam;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamImage[] newArray(int i7) {
            return new ShareParamImage[i7];
        }
    }

    @Override // com.bilibili.socialize.share.core.shareparam.BaseShareParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f105023g, 0);
    }
}
