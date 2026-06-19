package com.bilibili.studio.videoeditor.util;

import By0.RunnableC1451e0;
import android.app.Activity;
import android.content.DialogInterface;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/l.class */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6639l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC1451e0 f110239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorMainActivity f110240b;

    public /* synthetic */ DialogInterfaceOnClickListenerC6639l(RunnableC1451e0 runnableC1451e0, BiliEditorMainActivity biliEditorMainActivity) {
        this.f110239a = runnableC1451e0;
        this.f110240b = biliEditorMainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        RunnableC1451e0 runnableC1451e0 = this.f110239a;
        GeneratedComponentManagerHolder generatedComponentManagerHolder = this.f110240b;
        if (V.c()) {
            return;
        }
        dialogInterface.dismiss();
        runnableC1451e0.run();
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(generatedComponentManagerHolder);
        if (activityFindActivityOrNull != null) {
            C6645s.a(activityFindActivityOrNull);
        }
    }
}
