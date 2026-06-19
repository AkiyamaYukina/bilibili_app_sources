package com.bilibili.studio.editor.moudle.editormain.ui.fragments.clip;

import TB0.h0;
import android.widget.SeekBar;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/clip/a.class */
public final class a implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorClipVolumeFragment f106772a;

    public a(BiliEditorClipVolumeFragment biliEditorClipVolumeFragment) {
        this.f106772a = biliEditorClipVolumeFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        EditVideoClip userVideoTrack;
        UpperTimeline upperTimeline;
        BiliEditorClipVolumeFragment biliEditorClipVolumeFragment = this.f106772a;
        float f7 = i7 / 100.0f;
        fy0.d dVarKf = biliEditorClipVolumeFragment.kf();
        long jF = dVarKf.f.f();
        i iVar = dVarKf.c.f19474f.f19412b.f4833c;
        UC0.a editNativeAudioTrack = (iVar == null || (upperTimeline = iVar.f108300b) == null) ? null : upperTimeline.getEditNativeAudioTrack();
        if (editNativeAudioTrack != null) {
            editNativeAudioTrack.C(f7, jF);
        }
        EditVideoInfo editVideoInfo = dVarKf.e.f4806b;
        if (editVideoInfo != null && (userVideoTrack = editVideoInfo.getUserVideoTrack()) != null) {
            List<BClip> bClipList = userVideoTrack.getBClipList();
            if (bClipList != null) {
                for (BClip bClip : bClipList) {
                    if (bClip.getInPoint() <= jF && jF <= bClip.getOutPoint() && !bClip.isFakeClip()) {
                        bClip.setClipVolume(f7);
                    }
                }
            }
            EditorUsedFunctionUtil.b(dVarKf.e.f4806b, EditorUsedFunctionUtil.ClipBehavior.CLIP_VOLUME.getValue());
        }
        h0 h0Var = biliEditorClipVolumeFragment.f106750g;
        if (h0Var != null) {
            h0Var.f23806e.setText(String.valueOf(i7));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f106772a.kf().d.f19412b.j();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        P50.c cVar = (P50.c) this.f106772a.kf().g.getValue();
        if (cVar != null) {
            fy0.d dVarKf = this.f106772a.kf();
            dVarKf.d.f19412b.l(cVar.getInPoint(), cVar.getOutPoint());
        }
    }
}
