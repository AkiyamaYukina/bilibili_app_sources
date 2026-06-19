package com.bilibili.opd.app.bizcommon.imageselector.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.boxing.model.entity.impl.VideoMedia;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallVideoMedia.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MallVideoMedia extends VideoMedia implements Parcelable {

    @Nullable
    private String cachePath;

    @Nullable
    private Uri editUri;

    @Nullable
    private String mVideoDuration;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallVideoMedia$a.class */
    public static final class a implements Parcelable.Creator<MallVideoMedia> {
        @Override // android.os.Parcelable.Creator
        public final MallVideoMedia createFromParcel(Parcel parcel) {
            return new MallVideoMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MallVideoMedia[] newArray(int i7) {
            return new MallVideoMedia[i7];
        }
    }

    public MallVideoMedia(@NotNull Parcel parcel) {
        super(parcel);
        this.cachePath = parcel.readString();
        this.editUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.mVideoDuration = parcel.readString();
    }

    public MallVideoMedia(@Nullable VideoMedia.b bVar) {
        super(bVar);
    }

    public MallVideoMedia(@Nullable VideoMedia.b bVar, @Nullable Uri uri) {
        super(bVar);
        this.editUri = uri;
    }

    public MallVideoMedia(@Nullable VideoMedia.b bVar, @Nullable String str, @Nullable String str2) {
        super(bVar);
        this.cachePath = str;
        this.mVideoDuration = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCachePath() {
        return this.cachePath;
    }

    @Nullable
    public final Uri getEditUri() {
        return this.editUri;
    }

    @Nullable
    public final String getMVideoDuration() {
        return this.mVideoDuration;
    }

    public final void setCachePath(@Nullable String str) {
        this.cachePath = str;
    }

    public final void setEditUri(@Nullable Uri uri) {
        this.editUri = uri;
    }

    public final void setMVideoDuration(@Nullable String str) {
        this.mVideoDuration = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeString(this.cachePath);
        parcel.writeParcelable(this.editUri, i7);
        parcel.writeString(this.mVideoDuration);
    }
}
