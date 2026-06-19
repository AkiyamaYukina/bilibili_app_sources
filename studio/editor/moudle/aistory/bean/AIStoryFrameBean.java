package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryFrameBean.class */
@Keep
public final class AIStoryFrameBean {

    @Nullable
    private String filePath;

    @Nullable
    private List<? extends File> frameList;

    @Nullable
    private List<AiFrameResultBean> frameResult;
    private boolean isImage;
    private int rotation;

    @Nullable
    private String sensitiveMsg;
    private boolean sensitiveResult;

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final List<File> getFrameList() {
        return this.frameList;
    }

    @Nullable
    public final List<AiFrameResultBean> getFrameResult() {
        return this.frameResult;
    }

    public final int getRotation() {
        return this.rotation;
    }

    @Nullable
    public final String getSensitiveMsg() {
        return this.sensitiveMsg;
    }

    public final boolean getSensitiveResult() {
        return this.sensitiveResult;
    }

    @Nullable
    public final List<String> getTagList() {
        List<AiFrameResultBean> list = this.frameResult;
        ArrayList arrayList = null;
        if (list != null) {
            List<AiFrameResultBean> list2 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((AiFrameResultBean) obj).getResultStatus() == AiFrameTagStatus.REG_SUCCESS) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                List<String> tagList = ((AiFrameResultBean) it.next()).getTagList();
                String str = tagList != null ? (String) CollectionsKt.firstOrNull(tagList) : null;
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    public final boolean isAlreadyExtractFrame() {
        boolean z6 = false;
        if (this.frameList != null) {
            z6 = false;
            if (!r0.isEmpty()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean isImage() {
        return this.isImage;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setFrameList(@Nullable List<? extends File> list) {
        this.frameList = list;
    }

    public final void setFrameResult(@Nullable List<AiFrameResultBean> list) {
        this.frameResult = list;
    }

    public final void setImage(boolean z6) {
        this.isImage = z6;
    }

    public final void setRotation(int i7) {
        this.rotation = i7;
    }

    public final void setSensitiveMsg(@Nullable String str) {
        this.sensitiveMsg = str;
    }

    public final void setSensitiveResult(boolean z6) {
        this.sensitiveResult = z6;
    }
}
