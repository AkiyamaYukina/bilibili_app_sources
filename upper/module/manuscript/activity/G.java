package com.bilibili.upper.module.manuscript.activity;

import android.webkit.MimeTypeMap;
import com.bilibili.droid.MediaUtils;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.bean.DownloadOnlyResponse;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.upper.module.template.dialog.UpperFullScreenLoadingDialog;
import java.io.File;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/G.class */
public final class G implements ImageDataSubscriber<DownloadOnlyResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViolationPicItemActivity f113419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113420b;

    public G(ViolationPicItemActivity violationPicItemActivity, String str) {
        this.f113419a = violationPicItemActivity;
        this.f113420b = str;
    }

    public final void onCancellation(ImageDataSource<DownloadOnlyResponse> imageDataSource) {
        int i7 = ViolationPicItemActivity.f113527J;
        this.f113419a.getClass();
    }

    public final void onFailure(ImageDataSource<DownloadOnlyResponse> imageDataSource) {
        int i7 = ViolationPicItemActivity.f113527J;
        ViolationPicItemActivity violationPicItemActivity = this.f113419a;
        UpperFullScreenLoadingDialog upperFullScreenLoadingDialog = violationPicItemActivity.f113529E;
        if (upperFullScreenLoadingDialog != null) {
            upperFullScreenLoadingDialog.f113990b = null;
            upperFullScreenLoadingDialog.dismiss();
        }
        violationPicItemActivity.f113529E = null;
        ToastHelper.showToastShort(violationPicItemActivity, 2131851272);
    }

    public final void onResult(ImageDataSource<DownloadOnlyResponse> imageDataSource) {
        DownloadOnlyResponse downloadOnlyResponse;
        int i7 = ViolationPicItemActivity.f113527J;
        ViolationPicItemActivity violationPicItemActivity = this.f113419a;
        violationPicItemActivity.getClass();
        File file = (imageDataSource == null || (downloadOnlyResponse = (DownloadOnlyResponse) imageDataSource.getResult()) == null) ? null : downloadOnlyResponse.getFile();
        if (file == null) {
            UpperFullScreenLoadingDialog upperFullScreenLoadingDialog = violationPicItemActivity.f113529E;
            if (upperFullScreenLoadingDialog != null) {
                upperFullScreenLoadingDialog.f113990b = null;
                upperFullScreenLoadingDialog.dismiss();
            }
            violationPicItemActivity.f113529E = null;
            ToastHelper.showToastShort(violationPicItemActivity, 2131851272);
            return;
        }
        String lowerCase = StringsKt.substringAfterLast(this.f113420b, UtilsKt.DOT, "").toLowerCase(Locale.ROOT);
        if (MediaUtils.getPathByUri(violationPicItemActivity, MediaUtils.insertMediaToPictureFolderSync(violationPicItemActivity, file, ec.b.a(System.currentTimeMillis(), UtilsKt.DOT, lowerCase), MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase))) == null) {
            UpperFullScreenLoadingDialog upperFullScreenLoadingDialog2 = violationPicItemActivity.f113529E;
            if (upperFullScreenLoadingDialog2 != null) {
                upperFullScreenLoadingDialog2.f113990b = null;
                upperFullScreenLoadingDialog2.dismiss();
            }
            violationPicItemActivity.f113529E = null;
            ToastHelper.showToastShort(violationPicItemActivity, 2131851272);
            return;
        }
        UpperFullScreenLoadingDialog upperFullScreenLoadingDialog3 = violationPicItemActivity.f113529E;
        if (upperFullScreenLoadingDialog3 != null) {
            upperFullScreenLoadingDialog3.f113990b = null;
            upperFullScreenLoadingDialog3.dismiss();
        }
        violationPicItemActivity.f113529E = null;
        ToastHelper.showToastShort(violationPicItemActivity, 2131849702);
    }
}
