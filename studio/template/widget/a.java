package com.bilibili.studio.template.widget;

import com.bilibili.studio.template.widget.EditorDownloadProgressDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/a.class */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditorDownloadProgressDialog f108664a;

    public a(EditorDownloadProgressDialog editorDownloadProgressDialog) {
        this.f108664a = editorDownloadProgressDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditorDownloadProgressDialog.b bVar = this.f108664a.f108656d;
        if (bVar != null) {
            bVar.onStart();
        }
        this.f108664a.f108661j.sendEmptyMessage(272);
    }
}
