package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import TB0.O;
import android.widget.SeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/b.class */
public final class b implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorChildAdjustFragment f106805a;

    public b(BiliEditorChildAdjustFragment biliEditorChildAdjustFragment) {
        this.f106805a = biliEditorChildAdjustFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        tC0.a aVar = this.f106805a.kf().g;
        if (aVar == null) {
            return;
        }
        float fB = sC0.a.b(i7, aVar.a.type);
        O o7 = this.f106805a.f106778g;
        if (o7 != null) {
            com.bapis.bilibili.main.community.reply.v2.d.a(o7.f23660g, "", i7);
        }
        this.f106805a.kf().J0(fB);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ky0.a aVarKf = this.f106805a.kf();
        if (aVarKf.g != null) {
            aVarKf.c.f21018d.i();
        }
    }
}
