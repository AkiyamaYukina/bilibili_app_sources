package com.bilibili.socialize.share.core.helper;

import Ev0.e;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.content.c;
import com.bilibili.base.MainThread;
import com.bilibili.biligame.widget.dialog.D;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DownloadOnlyResponse;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.bilibili.socialize.share.core.shareparam.ShareImage;
import com.bilibili.studio.material.util.UtilsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/a.class */
public final class a extends BaseImageDataSubscriber<DownloadOnlyResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShareImage f104991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShareImageDownloader f104992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f104993c;

    public a(ShareImage shareImage, ShareImageDownloader shareImageDownloader, e eVar) {
        this.f104991a = shareImage;
        this.f104992b = shareImageDownloader;
        this.f104993c = eVar;
    }

    public final void onFailureImpl(ImageDataSource<DownloadOnlyResponse> imageDataSource) {
        DownloadOnlyResponse downloadOnlyResponse;
        Pv0.b.c("ShareImageDownloader", "download image: failed: " + ((imageDataSource == null || (downloadOnlyResponse = (DownloadOnlyResponse) imageDataSource.getResult()) == null) ? null : downloadOnlyResponse.getUri()) + " , use default share image.");
        ShareImage shareImage = this.f104991a;
        shareImage.f105015d = 2131234122;
        shareImage.f105012a = null;
        shareImage.f105014c = null;
        shareImage.f105013b = null;
        this.f104992b.b(shareImage, this.f104993c);
    }

    public final void onNewResultImpl(ImageDataSource<DownloadOnlyResponse> imageDataSource) {
        File file;
        DownloadOnlyResponse downloadOnlyResponse;
        String absolutePath = null;
        File file2 = (imageDataSource == null || (downloadOnlyResponse = (DownloadOnlyResponse) imageDataSource.getResult()) == null) ? null : downloadOnlyResponse.getFile();
        ShareImage shareImage = this.f104991a;
        shareImage.j(file2);
        ShareImageDownloader shareImageDownloader = this.f104992b;
        b bVar = shareImageDownloader.f104986a;
        if (bVar != null) {
            File file3 = shareImage.f105012a;
            Pv0.b.c("ShareImageDownloader", "download image success，file: " + (file3 != null ? file3.getAbsolutePath() : null));
            bVar.d(shareImage);
            SocializeMedia socializeMedia = shareImageDownloader.f104987b;
            SocializeMedia socializeMedia2 = SocializeMedia.QQ;
            e eVar = this.f104993c;
            if (socializeMedia != socializeMedia2 && socializeMedia != SocializeMedia.QZONE) {
                shareImageDownloader.b(shareImage, eVar);
                return;
            }
            File file4 = shareImage.f105012a;
            if (file4 == null || file4.length() == 0) {
                Pv0.b.c("BShare.image", "file is null");
                file = file4;
            } else {
                file = file4;
                if (file4.length() >= 5242880) {
                    file = new File(file4.getParent(), B0.a.a(file4.getName().substring(0, file4.getName().lastIndexOf(UtilsKt.DOT)), "_compress", file4.getName().substring(file4.getName().lastIndexOf(UtilsKt.DOT))));
                    if (file4.length() == 0) {
                        Pv0.b.c("BShare.image", "sourceFile is null");
                    } else {
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file4.getAbsolutePath());
                        if (bitmapDecodeFile == null) {
                            Pv0.b.b("BShare.image", "Failed to decode bitmap from file: " + file4.getAbsolutePath(), null);
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            int i7 = 100;
                            bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                            while (byteArrayOutputStream.toByteArray().length > 5242880 && i7 > 10) {
                                byteArrayOutputStream.reset();
                                i7 -= 10;
                                bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
                            }
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                    fileOutputStream.close();
                                } finally {
                                }
                            } catch (IOException e7) {
                                Pv0.b.b("BShare.image", "Failed to write compressed image file", e7);
                            }
                        }
                    }
                    file4.delete();
                }
            }
            if (file != null) {
                absolutePath = file.getAbsolutePath();
            }
            Pv0.b.c("ShareImageDownloader", c.b(file.length(), "compressImageIfNeed success: ", absolutePath, ", file.size = "));
            shareImage.j(file);
            MainThread.runOnMainThread(new D(eVar, 4));
        }
    }
}
