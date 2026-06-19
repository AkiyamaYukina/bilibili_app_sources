package com.bilibili.upper.module.template.fragment;

import android.app.Application;
import android.content.DialogInterface;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.util.V;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/b.class */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
        Application application = BiliContext.application();
        if (application != null) {
            V.b(application);
        }
    }
}
