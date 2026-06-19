package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.widget.SeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/N.class */
public final class N implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionStyleV4Fragment f106602a;

    public N(BiliEditorCaptionStyleV4Fragment biliEditorCaptionStyleV4Fragment) {
        this.f106602a = biliEditorCaptionStyleV4Fragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        if (z6) {
            this.f106602a.rf().f106746c.o(i7, true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
