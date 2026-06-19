package com.bilibili.socialize.share.core.helper;

import Ev0.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bilibili.droid.ToastHelper;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.bilibili.socialize.share.core.shareparam.BaseShareParam;
import com.bilibili.socialize.share.core.shareparam.ShareImage;
import com.bilibili.socialize.share.core.shareparam.ShareMinProgram;
import com.bilibili.socialize.share.core.shareparam.ShareParamAudio;
import com.bilibili.socialize.share.core.shareparam.ShareParamImage;
import com.bilibili.socialize.share.core.shareparam.ShareParamMinProgram;
import com.bilibili.socialize.share.core.shareparam.ShareParamPureImage;
import com.bilibili.socialize.share.core.shareparam.ShareParamText;
import com.bilibili.socialize.share.core.shareparam.ShareParamVideo;
import com.bilibili.socialize.share.core.shareparam.ShareParamWebPage;
import com.bilibili.studio.material.util.UtilsKt;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f104994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BiliShareConfiguration f104995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.b f104996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SocializeMedia f104997d;

    @Nullable
    public static ShareImage e(@Nullable BaseShareParam baseShareParam) {
        ShareImage shareImageB = null;
        if (baseShareParam != null) {
            if (baseShareParam instanceof ShareParamText) {
                shareImageB = null;
            } else if (baseShareParam instanceof ShareParamImage) {
                shareImageB = ((ShareParamImage) baseShareParam).f105023g;
            } else if (baseShareParam instanceof ShareParamWebPage) {
                shareImageB = ((ShareParamWebPage) baseShareParam).f105027g;
            } else if (baseShareParam instanceof ShareParamAudio) {
                shareImageB = ((ShareParamAudio) baseShareParam).b();
            } else if (baseShareParam instanceof ShareParamVideo) {
                shareImageB = ((ShareParamVideo) baseShareParam).b();
            } else if (baseShareParam instanceof ShareParamMinProgram) {
                ShareMinProgram shareMinProgram = ((ShareParamMinProgram) baseShareParam).f105024g;
                shareImageB = shareMinProgram == null ? null : shareMinProgram.f105021c;
            } else {
                shareImageB = null;
                if (baseShareParam instanceof ShareParamPureImage) {
                    shareImageB = ((ShareParamPureImage) baseShareParam).f105025g;
                }
            }
        }
        return shareImageB;
    }

    @WorkerThread
    public final byte[] a(@Nullable ShareImage shareImage) {
        Qv0.a aVar = new Qv0.a();
        aVar.f20221a = 100;
        aVar.f20222b = 100;
        return b(shareImage, 30720, aVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:170|14|15|(3:159|16|(7:18|19|20|21|166|22|23))|168|28|79) */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0269  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] b(@androidx.annotation.Nullable com.bilibili.socialize.share.core.shareparam.ShareImage r8, int r9, Qv0.a r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.socialize.share.core.helper.b.b(com.bilibili.socialize.share.core.shareparam.ShareImage, int, Qv0.a):byte[]");
    }

    public final boolean c() {
        if (!TextUtils.isEmpty(this.f104995b.a(this.f104994a))) {
            return true;
        }
        Pv0.b.d("BShare.image", "存储设备不可用");
        ToastHelper.showToastLong(this.f104994a.getApplicationContext(), "存储设备不可用");
        return false;
    }

    public final void d(@Nullable ShareImage shareImage) {
        File file;
        if (shareImage == null) {
            Pv0.b.c("BShare.image", "copy image file: null image");
            return;
        }
        File file2 = shareImage.f105012a;
        if (file2 == null || !file2.exists()) {
            Pv0.b.c("BShare.image", "copy image file: local file not exists");
            return;
        }
        if (c()) {
            String absolutePath = file2.getAbsolutePath();
            Context context = this.f104994a;
            BiliShareConfiguration biliShareConfiguration = this.f104995b;
            if (absolutePath.startsWith(biliShareConfiguration.a(context))) {
                Pv0.b.c("BShare.image", "copy image file: has copied before");
                return;
            }
            Pv0.b.c("BShare.image", "copy image file: start");
            String strA = biliShareConfiguration.a(this.f104994a);
            if (file2.exists()) {
                File file3 = new File(strA);
                String name = file2.getName();
                String strConcat = name;
                if (SocializeMedia.isIntlMedia(this.f104997d).booleanValue()) {
                    if (name.endsWith(".cnt")) {
                        Pv0.b.c("BShare.image", "copy image file: found local file with cnt :: ".concat(name));
                        strConcat = name.replace(".cnt", ".png");
                        Pv0.b.c("BShare.image", "copy image file: local file replace cnt :: " + strConcat);
                    } else {
                        strConcat = name;
                        if (!name.contains(UtilsKt.DOT)) {
                            strConcat = name.concat(".png");
                            Pv0.b.c("BShare.image", "copy image file: local file add suffix :: " + strConcat);
                        }
                    }
                }
                file = new File(file3, strConcat);
                if (file3.exists() || file3.mkdirs()) {
                    try {
                        Rv0.a.a(file2, file);
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        file = null;
                    }
                } else {
                    file = null;
                }
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                Pv0.b.d("BShare.image", "copy image file: failed");
            } else {
                Pv0.b.c("BShare.image", "copy image file: success");
                shareImage.j(file);
            }
        }
    }

    @Nullable
    public final void f(BaseShareParam baseShareParam) {
        ShareImage shareImageE = e(baseShareParam);
        if (shareImageE == null) {
            Pv0.b.c("BShare.image", "save bitmap image: null image");
            return;
        }
        boolean zC = shareImageE.c();
        BiliShareConfiguration biliShareConfiguration = this.f104995b;
        if (zC) {
            Bitmap bitmap = shareImageE.f105013b;
            if (bitmap == null || bitmap.getByteCount() <= 32768) {
                Pv0.b.c("BShare.image", "save bitmap image: image size is valid, skip");
                return;
            }
            if (c()) {
                Pv0.b.c("BShare.image", "save bitmap image: start");
                File fileB = Qv0.b.b(bitmap, biliShareConfiguration.a(this.f104994a));
                if (fileB == null || !fileB.exists()) {
                    Pv0.b.d("BShare.image", "save bitmap image: failed");
                    return;
                } else {
                    Pv0.b.c("BShare.image", "save bitmap image: success");
                    shareImageE.j(fileB);
                    return;
                }
            }
            return;
        }
        if (!shareImageE.i()) {
            Pv0.b.c("BShare.image", "save image: file image, skip");
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f104994a.getResources(), shareImageE.f105015d);
        if (bitmapDecodeResource.getByteCount() <= 32768) {
            Pv0.b.c("BShare.image", "save bitmap image: image size is valid, skip");
            return;
        }
        if (c()) {
            Pv0.b.c("BShare.image", "save res image: start");
            File fileB2 = Qv0.b.b(bitmapDecodeResource, biliShareConfiguration.a(this.f104994a));
            if (fileB2 == null || !fileB2.exists()) {
                Pv0.b.d("BShare.image", "save res image: failed");
                return;
            }
            Pv0.b.c("BShare.image", "save res image: success");
            Pv0.b.c("BShare.image", "save res image: success");
            shareImageE.j(fileB2);
            bitmapDecodeResource.recycle();
        }
    }
}
