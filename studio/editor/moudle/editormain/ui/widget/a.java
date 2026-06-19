package com.bilibili.studio.editor.moudle.editormain.ui.widget;

import android.widget.SeekBar;
import com.bilibili.studio.editor.moudle.editormain.ui.widget.EditorFullScreenControlView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/widget/a.class */
public final class a implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditorFullScreenControlView f107108a;

    public a(EditorFullScreenControlView editorFullScreenControlView) {
        this.f107108a = editorFullScreenControlView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        EditorFullScreenControlView.a mOnFullScreenControlListener;
        if (!z6 || (mOnFullScreenControlListener = this.f107108a.getMOnFullScreenControlListener()) == null) {
            return;
        }
        mOnFullScreenControlListener.b(((long) i7) * 1000);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        EditorFullScreenControlView.a mOnFullScreenControlListener = this.f107108a.getMOnFullScreenControlListener();
        if (mOnFullScreenControlListener != null) {
            mOnFullScreenControlListener.d();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        EditorFullScreenControlView.a mOnFullScreenControlListener = this.f107108a.getMOnFullScreenControlListener();
        if (mOnFullScreenControlListener != null) {
            mOnFullScreenControlListener.c();
        }
    }
}
