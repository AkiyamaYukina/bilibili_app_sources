package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamPureImage.class */
public class ShareParamPureImage extends BaseShareParam {
    public static final Parcelable.Creator<ShareParamPureImage> CREATOR = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ShareImage f105025g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamPureImage$a.class */
    public final class a implements Parcelable.Creator<ShareParamPureImage> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamPureImage] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamPureImage createFromParcel(Parcel parcel) {
            ?? baseShareParam = new BaseShareParam(parcel);
            baseShareParam.f105025g = (ShareImage) parcel.readParcelable(ShareImage.class.getClassLoader());
            return baseShareParam;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamPureImage[] newArray(int i7) {
            return new ShareParamPureImage[i7];
        }
    }

    public ShareParamPureImage() {
    }

    public ShareParamPureImage(String str, String str2) {
        this.f105001d = new HashMap();
        this.f105002e = new HashMap();
        this.f104998a = str;
        this.f104999b = str2;
    }

    @Override // com.bilibili.socialize.share.core.shareparam.BaseShareParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f105025g, 0);
    }
}
