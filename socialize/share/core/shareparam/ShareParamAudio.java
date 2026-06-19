package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamAudio.class */
public class ShareParamAudio extends BaseShareParam implements Parcelable {
    public static final Parcelable.Creator<ShareParamAudio> CREATOR = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ShareAudio f105022g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamAudio$a.class */
    public final class a implements Parcelable.Creator<ShareParamAudio> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamAudio] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamAudio createFromParcel(Parcel parcel) {
            ?? baseShareParam = new BaseShareParam(parcel);
            baseShareParam.f105022g = (ShareAudio) parcel.readParcelable(ShareAudio.class.getClassLoader());
            return baseShareParam;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamAudio[] newArray(int i7) {
            return new ShareParamAudio[i7];
        }
    }

    @Nullable
    public final ShareImage b() {
        ShareAudio shareAudio = this.f105022g;
        return shareAudio == null ? null : shareAudio.f105008a;
    }

    @Override // com.bilibili.socialize.share.core.shareparam.BaseShareParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f105022g, 0);
    }
}
