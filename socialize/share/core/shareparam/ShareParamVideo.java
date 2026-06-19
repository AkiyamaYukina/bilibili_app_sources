package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamVideo.class */
public class ShareParamVideo extends BaseShareParam {
    public static final Parcelable.Creator<ShareParamVideo> CREATOR = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ShareVideo f105026g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamVideo$a.class */
    public final class a implements Parcelable.Creator<ShareParamVideo> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamVideo] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamVideo createFromParcel(Parcel parcel) {
            ?? baseShareParam = new BaseShareParam(parcel);
            baseShareParam.f105026g = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
            return baseShareParam;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamVideo[] newArray(int i7) {
            return new ShareParamVideo[i7];
        }
    }

    @Nullable
    public final ShareImage b() {
        ShareVideo shareVideo = this.f105026g;
        return shareVideo == null ? null : shareVideo.f105028a;
    }

    @Override // com.bilibili.socialize.share.core.shareparam.BaseShareParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f105026g, i7);
    }
}
