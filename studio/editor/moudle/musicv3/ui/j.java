package com.bilibili.studio.editor.moudle.musicv3.ui;

import android.widget.SeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/j.class */
public final class j implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFragmentV3 f108045a;

    public j(BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3) {
        this.f108045a = biliEditorMusicFragmentV3;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        float f7 = i7 / 100.0f;
        UC0.a aVarNf = this.f108045a.nf();
        if (aVarNf != null) {
            aVarNf.B(f7, f7);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
