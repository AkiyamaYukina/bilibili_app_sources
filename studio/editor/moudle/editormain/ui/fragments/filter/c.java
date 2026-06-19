package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import TB0.O;
import com.bilibili.studio.videoeditor.editor.visualeffects.view.EditBiDirectionSeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/c.class */
public final class c implements EditBiDirectionSeekBar.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorChildAdjustFragment f106806a;

    public c(BiliEditorChildAdjustFragment biliEditorChildAdjustFragment) {
        this.f106806a = biliEditorChildAdjustFragment;
    }

    @Override // com.bilibili.studio.videoeditor.editor.visualeffects.view.EditBiDirectionSeekBar.a
    public final void a() {
        ky0.a aVarKf = this.f106806a.kf();
        if (aVarKf.g != null) {
            aVarKf.c.f21018d.i();
        }
    }

    @Override // com.bilibili.studio.videoeditor.editor.visualeffects.view.EditBiDirectionSeekBar.a
    public final void onProgressChanged(int i7) {
        BiliEditorChildAdjustFragment biliEditorChildAdjustFragment = this.f106806a;
        tC0.a aVar = biliEditorChildAdjustFragment.kf().g;
        if (aVar == null) {
            return;
        }
        float fB = sC0.a.b(i7, aVar.a.type);
        O o7 = biliEditorChildAdjustFragment.f106778g;
        if (o7 != null) {
            com.bapis.bilibili.main.community.reply.v2.d.a(o7.f23660g, "", i7);
        }
        biliEditorChildAdjustFragment.kf().J0(fB);
    }
}
