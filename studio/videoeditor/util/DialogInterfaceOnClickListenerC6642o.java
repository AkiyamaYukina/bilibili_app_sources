package com.bilibili.studio.videoeditor.util;

import android.app.Activity;
import android.content.DialogInterface;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/o.class */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6642o implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMainActivity f110242a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f110242a);
        if (activityFindActivityOrNull != null) {
            C6645s.a(activityFindActivityOrNull);
        }
    }
}
