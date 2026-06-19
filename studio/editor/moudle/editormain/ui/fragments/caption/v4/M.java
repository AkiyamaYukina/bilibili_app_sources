package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.widget.SeekBar;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import cx0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/M.class */
public final class M implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionStyleV4Fragment f106601a;

    public M(BiliEditorCaptionStyleV4Fragment biliEditorCaptionStyleV4Fragment) {
        this.f106601a = biliEditorCaptionStyleV4Fragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        if (z6) {
            float f7 = (i7 / 100.0f) + 0.5f;
            com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar = this.f106601a.rf().f106746c;
            Ny0.c cVar = bVar.f107164l;
            if (cVar.b("onSetFontSize")) {
                cVar.f();
                cVar.g(Boolean.TRUE);
                CaptionInfo captionInfo = cVar.f17480f;
                P50.p pVar = cVar.f17479e;
                captionInfo.captionScaleBeforeAutoAdjust = -1.0f;
                pVar.scaleCaption(f7 / captionInfo.captionScale, cVar.c(pVar));
                captionInfo.captionScale = f7;
                if (pVar.getAnchorPoint() != null) {
                    captionInfo.anchorX = pVar.getAnchorPoint().x;
                    captionInfo.anchorY = pVar.getAnchorPoint().y;
                }
                a.a.a(cx0.a.g, (Integer) null, (Integer) null, Float.valueOf(f7), (Integer) null, (Integer) null, (String) null, 59);
                bVar.s();
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
