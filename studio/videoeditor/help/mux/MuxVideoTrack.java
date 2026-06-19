package com.bilibili.studio.videoeditor.help.mux;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/mux/MuxVideoTrack.class */
@Keep
public class MuxVideoTrack {
    public List<BClip> bClipList;
    public EditFxFilterInfo editFxFilterInfo;
    public EditVisualEffectsInfo editVisualEffectsInfo;
    public boolean isUserTrack;
    public List<SceneFxInfo> sceneFxInfoList;
    public List<Transform2DFxInfo> transform2DFxInfoList;
    public List<TransitionInfo> transitionInfoList;
    public float videoTrackVolume = 1.0f;
}
