package com.bilibili.studio.editor.moudle.editormain.ui.fragments.music.ui;

import TB0.C2893z;
import android.widget.SeekBar;
import com.bilibili.studio.videoeditor.bean.BMusic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/music/ui/h.class */
public final class h implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFadeFragment f106861a;

    public h(BiliEditorMusicFadeFragment biliEditorMusicFadeFragment) {
        this.f106861a = biliEditorMusicFadeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        if (this.f106861a.lf().f) {
            BiliEditorMusicFadeFragment biliEditorMusicFadeFragment = this.f106861a;
            BMusic bMusic = biliEditorMusicFadeFragment.lf().c.f25043d.f107212c;
            if (bMusic != null) {
                bMusic.fadeInValue = i7 * 1000;
            }
            BMusic bMusic2 = biliEditorMusicFadeFragment.lf().c.f25043d.f107212c;
            if (bMusic2 != null) {
                bMusic2.fadeIn = true;
            }
            C2893z c2893z = biliEditorMusicFadeFragment.f106820g;
            if (c2893z != null) {
                c2893z.f24075d.setText(BiliEditorMusicFadeFragment.kf(i7));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f106861a.lf().f = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f106861a.lf().f = false;
        this.f106861a.lf().J0("BiliEditorMusicFadeFragment.FadeIn.onStopTrackingTouch");
    }
}
