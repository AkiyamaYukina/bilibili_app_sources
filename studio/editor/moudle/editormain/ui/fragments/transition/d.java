package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import android.widget.SeekBar;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import kotlin.Pair;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/d.class */
public final class d implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorTransitionFragmentV2 f107056a;

    public d(BiliEditorTransitionFragmentV2 biliEditorTransitionFragmentV2) {
        this.f107056a = biliEditorTransitionFragmentV2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        Pair<Long, Long> pair = this.f107056a.lf().f107023l;
        if (pair == null) {
            return;
        }
        long jLongValue = ((((Number) pair.getSecond()).longValue() - ((Number) pair.getFirst()).longValue()) * ((long) i7)) / ((long) 100);
        this.f107056a.of(((Number) pair.getFirst()).longValue() + jLongValue, false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            Pair<Long, Long> pair = this.f107056a.lf().f107023l;
            if (pair == null) {
                return;
            }
            long jLongValue = ((((Number) pair.getSecond()).longValue() - ((Number) pair.getFirst()).longValue()) * ((long) progress)) / ((long) 100);
            long jLongValue2 = ((Number) pair.getFirst()).longValue();
            BiliEditorTransitionViewModel biliEditorTransitionViewModelLf = this.f107056a.lf();
            TransitionInfo transitionInfo = biliEditorTransitionViewModelLf.f107024m;
            if (transitionInfo != null) {
                transitionInfo.duration = jLongValue2 + jLongValue;
            }
            cz0.a aVar = biliEditorTransitionViewModelLf.f107015c;
            if (transitionInfo == null) {
                aVar.getClass();
                return;
            }
            Integer num = (Integer) aVar.e.getValue();
            if (num != null) {
                int iIntValue = num.intValue();
                UC0.k kVarK = aVar.k();
                if (kVarK != null) {
                    kVarK.I(iIntValue, transitionInfo.duration);
                }
                aVar.i(iIntValue, transitionInfo);
            }
        }
    }
}
