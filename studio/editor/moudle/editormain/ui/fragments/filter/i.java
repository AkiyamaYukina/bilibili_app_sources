package com.bilibili.studio.editor.moudle.editormain.ui.fragments.filter;

import TB0.Q;
import android.widget.SeekBar;
import com.bilibili.studio.videoeditor.util.S;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/filter/i.class */
public final class i implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorChildFilterFragment f106813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f106814b;

    public i(BiliEditorChildFilterFragment biliEditorChildFilterFragment, Q q7) {
        this.f106813a = biliEditorChildFilterFragment;
        this.f106814b = q7;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        if (z6) {
            float f7 = (i7 * 1.0f) / 100;
            Ry0.g gVar = this.f106813a.lf().h;
            Ry0.b bVar = gVar.f21017c;
            bVar.a();
            Ry0.d dVar = gVar.f21019e;
            UC0.k kVarA = dVar.a();
            if (kVarA != null) {
                kVarA.L(f7, dVar.f21010a.f());
            }
            bVar.b();
        }
        this.f106814b.f23678g.setText(S.d(i7));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Ry0.d dVar = this.f106813a.lf().h.f21019e;
        UC0.k kVarA = dVar.a();
        dVar.b(kVarA == null ? CollectionsKt.emptyList() : kVarA.t());
    }
}
