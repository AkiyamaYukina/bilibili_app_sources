package com.bilibili.upper.module.manuscript.activity;

import android.app.Dialog;
import androidx.lifecycle.Lifecycle;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.DownloadOnlyRequestBuilder;
import com.bilibili.upper.module.template.dialog.UpperFullScreenLoadingDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/D.class */
public final /* synthetic */ class D implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViolationPicItemActivity f113415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113416b;

    public /* synthetic */ D(ViolationPicItemActivity violationPicItemActivity, String str) {
        this.f113415a = violationPicItemActivity;
        this.f113416b = str;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        Dialog dialog;
        int i7 = ViolationPicItemActivity.f113527J;
        boolean zIsCancelled = task.isCancelled();
        ViolationPicItemActivity violationPicItemActivity = this.f113415a;
        if (zIsCancelled || task.isFaulted()) {
            ToastHelper.showToastShort(violationPicItemActivity, violationPicItemActivity.getString(2131849837));
            return null;
        }
        UpperFullScreenLoadingDialog upperFullScreenLoadingDialog = violationPicItemActivity.f113529E;
        if (upperFullScreenLoadingDialog == null || (dialog = upperFullScreenLoadingDialog.getDialog()) == null || !dialog.isShowing()) {
            UpperFullScreenLoadingDialog upperFullScreenLoadingDialog2 = new UpperFullScreenLoadingDialog();
            upperFullScreenLoadingDialog2.setCancelable(false);
            upperFullScreenLoadingDialog2.f113991c = 1;
            upperFullScreenLoadingDialog2.show(violationPicItemActivity.getSupportFragmentManager(), "UpperFullScreenLoadingDialog");
            violationPicItemActivity.f113529E = upperFullScreenLoadingDialog2;
        }
        DownloadOnlyRequestBuilder downloadOnlyRequestBuilderUseOrigin = BiliImageLoader.INSTANCE.acquireDownloadOnly(violationPicItemActivity, (Lifecycle) null).useOrigin();
        String str = this.f113416b;
        downloadOnlyRequestBuilderUseOrigin.url(str).submit().subscribe(new G(violationPicItemActivity, str));
        return null;
    }
}
