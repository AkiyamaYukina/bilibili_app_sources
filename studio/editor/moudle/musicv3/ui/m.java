package com.bilibili.studio.editor.moudle.musicv3.ui;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/m.class */
public final class m implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicFragmentV3 f108049a;

    public m(BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3) {
        this.f108049a = biliEditorMusicFragmentV3;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        BiliEditorMusicFragmentV3 biliEditorMusicFragmentV3 = this.f108049a;
        float f7 = i7 / 100.0f;
        UC0.a aVarNf = biliEditorMusicFragmentV3.nf();
        if (aVarNf != null) {
            aVarNf.B(f7, f7);
        }
        TextView textView = biliEditorMusicFragmentV3.f107968t.f13216u;
        if (textView != null) {
            textView.setText(String.valueOf(i7));
        }
        biliEditorMusicFragmentV3.vf();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
