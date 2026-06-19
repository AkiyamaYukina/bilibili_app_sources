package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamText.class */
public class ShareParamText extends BaseShareParam {
    public static final Parcelable.Creator<ShareParamText> CREATOR = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamText$a.class */
    public final class a implements Parcelable.Creator<ShareParamText> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamText] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamText createFromParcel(Parcel parcel) {
            return new BaseShareParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamText[] newArray(int i7) {
            return new ShareParamText[i7];
        }
    }
}
