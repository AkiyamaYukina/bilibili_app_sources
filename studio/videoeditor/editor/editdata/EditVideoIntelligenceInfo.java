package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceTemplateInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoIntelligenceInfo.class */
@Keep
public class EditVideoIntelligenceInfo implements Serializable {
    public static final int VERSION_NONE = 0;
    public static final int VERSION_ONE = 2;
    public static final int VERSION_PIC_TO_VIDEO = 1;
    public static final int VERSION_SECOND = 3;
    public IntelligenceAudioConfig audioConfig;
    public TransitionInfo defaultTransitionInfo;
    public Map<String, String> imageFrameAndTag;

    @Nullable
    public String imageRecLabel;
    public boolean isInitIntelligence;
    public IntelligenceMusicInfo musicInfo;
    public List<String> recMusicIds;
    public IntelligenceTemplateInfo templateInfo;
    public int version;

    @Nullable
    public String zipUrl;
    public int videoCount = -1;
    public int enterFrom = 0;
}
