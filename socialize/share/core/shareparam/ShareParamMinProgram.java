package com.bilibili.socialize.share.core.shareparam;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamMinProgram.class */
public class ShareParamMinProgram extends BaseShareParam {
    public static final Parcelable.Creator<ShareParamMinProgram> CREATOR = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ShareMinProgram f105024g;
    public String h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareParamMinProgram$a.class */
    public final class a implements Parcelable.Creator<ShareParamMinProgram> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.BaseShareParam, com.bilibili.socialize.share.core.shareparam.ShareParamMinProgram] */
        @Override // android.os.Parcelable.Creator
        public final ShareParamMinProgram createFromParcel(Parcel parcel) {
            ?? baseShareParam = new BaseShareParam(parcel);
            baseShareParam.f105024g = (ShareMinProgram) parcel.readParcelable(ShareParamMinProgram.class.getClassLoader());
            baseShareParam.h = parcel.readString();
            return baseShareParam;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareParamMinProgram[] newArray(int i7) {
            return new ShareParamMinProgram[i7];
        }
    }

    @Override // com.bilibili.socialize.share.core.shareparam.BaseShareParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f105024g, i7);
        parcel.writeString(this.h);
    }
}
