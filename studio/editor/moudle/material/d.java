package com.bilibili.studio.editor.moudle.material;

import com.bilibili.studio.material.FailReason;
import com.bilibili.studio.material.ISingleMaterialListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/d.class */
public final class d implements ISingleMaterialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f107889a;

    public d(g gVar) {
        this.f107889a = gVar;
    }

    @Override // com.bilibili.studio.material.ISingleMaterialListener
    public final void onFailed(String str, String str2, FailReason failReason) {
        g gVar = this.f107889a;
        if (failReason != null) {
            failReason.getMsg();
        }
        gVar.onFailed();
    }

    @Override // com.bilibili.studio.material.ISingleMaterialListener
    public final void onSuccess(String str, String str2, String str3, String str4) {
        this.f107889a.onSuccess(str3);
    }
}
