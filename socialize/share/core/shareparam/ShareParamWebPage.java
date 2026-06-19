package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamWebPage.class */
public class ShareParamWebPage extends BaseShareParam {
    public static final Parcelable.Creator<ShareParamWebPage> CREATOR = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ShareImage f105027g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamWebPage$a.class */
    public final class a implements Parcelable.Creator<ShareParamWebPage> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamWebPage] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamWebPage createFromParcel(Parcel parcel) {
            ?? baseShareParam = new BaseShareParam(parcel);
            baseShareParam.f105027g = (ShareImage) parcel.readParcelable(ShareImage.class.getClassLoader());
            return baseShareParam;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamWebPage[] newArray(int i7) {
            return new ShareParamWebPage[i7];
        }
    }

    @Override // com.bilibili.socialize.share.core.shareparam.BaseShareParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f105027g, 0);
    }
}
