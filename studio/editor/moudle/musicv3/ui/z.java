package com.bilibili.studio.editor.moudle.musicv3.ui;

import UC0.n;
import android.widget.SeekBar;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.videoeditor.bean.BMusic;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/z.class */
public final class z implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicVolumeFragment f108065a;

    public z(BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment) {
        this.f108065a = biliEditorMusicVolumeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        UC0.a audioTrackByMusic;
        BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = this.f108065a;
        float f7 = i7 / 100.0f;
        BMusic bMusic = biliEditorMusicVolumeFragment.f108008o;
        if (bMusic != null) {
            Lazy<UC0.n> lazy = UC0.n.f24629b;
            n.a.a().getClass();
            UpperTimeline upperTimelineC = UC0.n.c();
            if (upperTimelineC != null && (audioTrackByMusic = upperTimelineC.getAudioTrackByMusic(bMusic)) != null) {
                audioTrackByMusic.E(f7, f7);
            }
            bMusic.ratioMusic = f7;
        }
        biliEditorMusicVolumeFragment.vf();
        Kz0.i iVar = biliEditorMusicVolumeFragment.f108013t;
        if (iVar != null) {
            iVar.g(biliEditorMusicVolumeFragment.f108005l, String.valueOf(i7));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f108065a.f108011r.f108024a = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
