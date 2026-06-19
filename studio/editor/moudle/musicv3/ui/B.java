package com.bilibili.studio.editor.moudle.musicv3.ui;

import android.widget.SeekBar;
import com.bilibili.studio.videoeditor.bean.BMusic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/B.class */
public final class B implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicVolumeFragment f107951a;

    public B(BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment) {
        this.f107951a = biliEditorMusicVolumeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = this.f107951a;
        BMusic bMusic = biliEditorMusicVolumeFragment.f108008o;
        if (bMusic != null) {
            bMusic.fadeOutValue = i7 * 1000;
        }
        Kz0.i iVar = biliEditorMusicVolumeFragment.f108013t;
        if (iVar != null) {
            iVar.f(biliEditorMusicVolumeFragment.f108005l, BiliEditorMusicVolumeFragment.wf(i7));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f107951a.f108011r.f108027d = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f107951a.Cf("FadeOut.onStopTrackingTouch");
    }
}
