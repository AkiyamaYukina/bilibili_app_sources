package com.bilibili.studio.editor.moudle.musicv3.ui;

import android.widget.SeekBar;
import com.bilibili.studio.videoeditor.bean.BMusic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/A.class */
public final class A implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicVolumeFragment f107950a;

    public A(BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment) {
        this.f107950a = biliEditorMusicVolumeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = this.f107950a;
        BMusic bMusic = biliEditorMusicVolumeFragment.f108008o;
        if (bMusic != null) {
            bMusic.fadeInValue = i7 * 1000;
        }
        if (bMusic != null) {
            bMusic.fadeIn = true;
        }
        Kz0.i iVar = biliEditorMusicVolumeFragment.f108013t;
        if (iVar != null) {
            iVar.e(biliEditorMusicVolumeFragment.f108005l, BiliEditorMusicVolumeFragment.wf(i7));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f107950a.f108011r.f108026c = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f107950a.Cf("FadeIn.onStopTrackingTouch");
    }
}
