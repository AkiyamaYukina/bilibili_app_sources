package com.bilibili.socialize.share.core.shareparam;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareImage.class */
public class ShareImage implements Parcelable {
    public static final Parcelable.Creator<ShareImage> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public File f105012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Bitmap f105013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f105014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f105016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f105017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ImageTagParam f105018g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareImage$ImageType.class */
    public enum ImageType {
        UNKNOW,
        LOCAL,
        NET,
        BITMAP,
        RES
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/shareparam/ShareImage$a.class */
    public final class a implements Parcelable.Creator<ShareImage> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.socialize.share.core.shareparam.ShareImage, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final ShareImage createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f105015d = -1;
            boolean z6 = false;
            obj.f105016e = new byte[0];
            obj.f105017f = false;
            String string = parcel.readString();
            obj.f105012a = TextUtils.isEmpty(string) ? null : new File(string);
            obj.f105013b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
            obj.f105014c = parcel.readString();
            obj.f105015d = parcel.readInt();
            if (parcel.readInt() == 1) {
                z6 = true;
            }
            obj.f105017f = z6;
            obj.f105018g = (ImageTagParam) parcel.readParcelable(ImageTagParam.class.getClassLoader());
            obj.f105016e = parcel.createByteArray();
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final ShareImage[] newArray(int i7) {
            return new ShareImage[i7];
        }
    }

    public ShareImage(int i7) {
        this.f105016e = new byte[0];
        this.f105017f = false;
        this.f105015d = i7;
    }

    public ShareImage(@Nullable Bitmap bitmap) {
        this.f105015d = -1;
        this.f105016e = new byte[0];
        this.f105017f = false;
        this.f105013b = bitmap;
    }

    public ShareImage(@Nullable String str) {
        this.f105015d = -1;
        this.f105016e = new byte[0];
        this.f105017f = false;
        this.f105014c = str;
    }

    public final ImageType a() {
        if (!TextUtils.isEmpty(this.f105014c)) {
            return ImageType.NET;
        }
        File file = this.f105012a;
        if (file != null && file.exists()) {
            return ImageType.LOCAL;
        }
        if (this.f105015d != -1) {
            return ImageType.RES;
        }
        Bitmap bitmap = this.f105013b;
        return (bitmap == null || bitmap.isRecycled()) ? ImageType.UNKNOW : ImageType.BITMAP;
    }

    @Nullable
    public final String b() {
        File file = this.f105012a;
        String absolutePath = null;
        if (file != null && file.exists()) {
            absolutePath = this.f105012a.getAbsolutePath();
        }
        return absolutePath;
    }

    public final boolean c() {
        return a() == ImageType.BITMAP;
    }

    public final boolean d() {
        return a() == ImageType.LOCAL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean h() {
        return a() == ImageType.NET;
    }

    public final boolean i() {
        return a() == ImageType.RES;
    }

    public final void j(File file) {
        this.f105012a = file;
        this.f105015d = -1;
        this.f105014c = null;
        this.f105013b = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        File file = this.f105012a;
        parcel.writeString(file == null ? null : file.getAbsolutePath());
        parcel.writeParcelable(this.f105013b, 0);
        parcel.writeString(this.f105014c);
        parcel.writeInt(this.f105015d);
        parcel.writeInt(this.f105017f ? 1 : 0);
        parcel.writeParcelable(this.f105018g, i7);
        parcel.writeByteArray(this.f105016e);
    }
}
