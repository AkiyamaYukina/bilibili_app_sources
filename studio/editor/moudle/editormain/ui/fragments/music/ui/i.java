package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.C2893z;
import android.widget.SeekBar;
import com.bilibili.studio.videoeditor.bean.BMusic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/i.class */
public final class i implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFadeFragment f106862a;

    public i(BiliEditorMusicFadeFragment biliEditorMusicFadeFragment) {
        this.f106862a = biliEditorMusicFadeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        if (this.f106862a.lf().f) {
            BiliEditorMusicFadeFragment biliEditorMusicFadeFragment = this.f106862a;
            BMusic bMusic = biliEditorMusicFadeFragment.lf().c.f25043d.f107212c;
            if (bMusic != null) {
                bMusic.fadeOutValue = i7 * 1000;
            }
            C2893z c2893z = biliEditorMusicFadeFragment.f106820g;
            if (c2893z != null) {
                c2893z.f24076e.setText(BiliEditorMusicFadeFragment.kf(i7));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f106862a.lf().f = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f106862a.lf().f = false;
        this.f106862a.lf().J0("BiliEditorMusicFadeFragment.FadeOut.onStopTrackingTouch");
    }
}
