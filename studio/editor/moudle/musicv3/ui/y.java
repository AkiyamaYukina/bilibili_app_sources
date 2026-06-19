package com.bilibili.studio.editor.moudle.musicv3.ui;

import android.widget.SeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/y.class */
public final class y implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicVolumeFragment f108064a;

    public y(BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment) {
        this.f108064a = biliEditorMusicVolumeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = this.f108064a;
        float f7 = i7 / 100.0f;
        UC0.a aVarNf = biliEditorMusicVolumeFragment.nf();
        if (aVarNf != null) {
            aVarNf.B(f7, f7);
        }
        biliEditorMusicVolumeFragment.vf();
        Kz0.i iVar = biliEditorMusicVolumeFragment.f108013t;
        if (iVar != null) {
            iVar.h(biliEditorMusicVolumeFragment.f108005l, String.valueOf(i7));
        }
        if (biliEditorMusicVolumeFragment.f108009p == 1) {
            return;
        }
        ((Lz0.a) biliEditorMusicVolumeFragment.f108012s.getValue()).f15016b.postValue(Float.valueOf(f7));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f108064a.f108011r.f108025b = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
