package com.bilibili.playerbizcommon.share;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/share/ShareExtraParams.class */
@Keep
public final class ShareExtraParams implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "from_page")
    @Nullable
    private String fromPage;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/share/ShareExtraParams$a.class */
    public static final class a implements Parcelable.Creator<ShareExtraParams> {
        @Override // android.os.Parcelable.Creator
        public final ShareExtraParams createFromParcel(Parcel parcel) {
            return new ShareExtraParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ShareExtraParams[] newArray(int i7) {
            return new ShareExtraParams[i7];
        }
    }

    public ShareExtraParams() {
        this.fromPage = "";
    }

    public ShareExtraParams(@NotNull Parcel parcel) {
        this();
        this.fromPage = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getFromPage() {
        return this.fromPage;
    }

    public final void setFromPage(@Nullable String str) {
        this.fromPage = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.fromPage);
    }
}
