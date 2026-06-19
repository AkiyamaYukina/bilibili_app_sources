package com.bilibili.studio.videoeditor.help.mux;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/mux/MuxInfoOld.class */
@Keep
public class MuxInfoOld implements Serializable {
    public List<BClip> bClipList;
    public FilterInfo bFilterInfoBean;
    public BMusic bMusic;
    public EditFxFilterInfo editFxFilterInfo;
    public EditVisualEffectsInfo editVisualEffectsInfo;
    public float nativeVolumn = 1.0f;
    public List<SceneFxInfo> sceneFxInfoList;
    public List<Transform2DFxInfo> transform2DFxInfoList;
    public List<TransitionInfo> transitionInfoList;
}
