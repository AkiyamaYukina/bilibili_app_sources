package com.bilibili.upper.module.tempalte.dialog;

import com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/dialog/a.class */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperDownloadProgressDialog f113950a;

    public a(UpperDownloadProgressDialog upperDownloadProgressDialog) {
        this.f113950a = upperDownloadProgressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UpperDownloadProgressDialog upperDownloadProgressDialog = this.f113950a;
        UpperDownloadProgressDialog.b bVar = upperDownloadProgressDialog.f113945d;
        upperDownloadProgressDialog.f113948g.sendEmptyMessage(272);
    }
}
