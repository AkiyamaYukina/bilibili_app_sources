package com.bilibili.opd.app.bizcommon.imageselector.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallImageMedia.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MallImageMedia extends ImageMedia implements Parcelable {

    @Nullable
    private String cachePath;

    @Nullable
    private Uri editUri;

    @Nullable
    private Long templateId;

    @Nullable
    private String text;

    @Nullable
    private String url;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/MallImageMedia$a.class */
    public static final class a implements Parcelable.Creator<MallImageMedia> {
        @Override // android.os.Parcelable.Creator
        public final MallImageMedia createFromParcel(Parcel parcel) {
            return new MallImageMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MallImageMedia[] newArray(int i7) {
            return new MallImageMedia[i7];
        }
    }

    public MallImageMedia() {
        this.templateId = 0L;
    }

    public MallImageMedia(@NotNull Parcel parcel) {
        super(parcel);
        this.templateId = 0L;
        this.cachePath = parcel.readString();
        this.editUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.url = parcel.readString();
        this.text = parcel.readString();
        this.templateId = Long.valueOf(parcel.readLong());
    }

    public MallImageMedia(@Nullable ImageMedia.c cVar) {
        super(cVar);
        this.templateId = 0L;
    }

    public MallImageMedia(@Nullable ImageMedia.c cVar, @Nullable Uri uri) {
        super(cVar);
        this.templateId = 0L;
        this.editUri = uri;
    }

    public MallImageMedia(@Nullable ImageMedia.c cVar, @Nullable String str) {
        super(cVar);
        this.templateId = 0L;
        this.cachePath = str;
    }

    public MallImageMedia(@NotNull File file) {
        super(file);
        this.templateId = 0L;
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
    public final Long getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean hasEditorImage() {
        Uri uri = this.editUri;
        return (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(this.editUri.getPath()).exists()) ? false : true;
    }

    public final void setCachePath(@Nullable String str) {
        this.cachePath = str;
    }

    public final void setEditUri(@Nullable Uri uri) {
        this.editUri = uri;
    }

    public final void setTemplateId(@Nullable Long l7) {
        this.templateId = l7;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeString(this.cachePath);
        parcel.writeParcelable(this.editUri, 0);
        parcel.writeString(this.url);
        parcel.writeString(this.text);
        Long l7 = this.templateId;
        parcel.writeLong(l7 != null ? l7.longValue() : 0L);
    }
}
