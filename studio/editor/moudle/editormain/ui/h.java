package com.bilibili.studio.editor.moudle.editormain.ui;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/h.class */
public final class h implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f107062a;

    public h(i iVar) {
        this.f107062a = iVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        i iVar = this.f107062a;
        if (iVar.f107066H) {
            return;
        }
        iVar.f107066H = true;
        g gVar = (g) iVar.generatedComponent();
        gVar.getClass();
    }
}
