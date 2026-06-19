package com.bilibili.studio.videoeditor.widgets;

import android.content.Context;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/a.class */
public final class a extends AlertDialog {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, androidx.appcompat.app.AlertDialog, com.bilibili.studio.videoeditor.widgets.a] */
    public static a j(Context context) {
        ?? alertDialog = new AlertDialog(context, 2131888077);
        alertDialog.setCancelable(false);
        alertDialog.setOnCancelListener(null);
        alertDialog.show();
        if (alertDialog.getWindow() != null) {
            WindowManager.LayoutParams attributes = alertDialog.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            alertDialog.getWindow().setAttributes(attributes);
            alertDialog.getWindow().setContentView(2131493990);
        }
        return alertDialog;
    }
}
