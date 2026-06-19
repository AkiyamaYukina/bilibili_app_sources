package com.bilibili.studio.videoeditor.util;

import android.app.Activity;
import android.content.DialogInterface;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/m.class */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6640m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMainActivity f110241a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        GeneratedComponentManagerHolder generatedComponentManagerHolder = this.f110241a;
        dialogInterface.dismiss();
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(generatedComponentManagerHolder);
        if (activityFindActivityOrNull != null) {
            C6645s.a(activityFindActivityOrNull);
        }
    }
}
