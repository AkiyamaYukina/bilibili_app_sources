package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryProcessorBean.class */
@Keep
public final class AIStoryProcessorBean {

    @Nullable
    private List<AIStoryFrameBean> frameList;

    @Nullable
    private List<? extends SelectVideo> resourceList;

    @Nullable
    public final List<AIStoryFrameBean> getFrameList() {
        return this.frameList;
    }

    @Nullable
    public final List<SelectVideo> getResourceList() {
        return this.resourceList;
    }

    public final void setFrameList(@Nullable List<AIStoryFrameBean> list) {
        this.frameList = list;
    }

    public final void setResourceList(@Nullable List<? extends SelectVideo> list) {
        this.resourceList = list;
    }
}
