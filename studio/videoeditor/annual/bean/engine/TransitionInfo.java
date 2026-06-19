package com.bilibili.studio.videoeditor.annual.bean.engine;

import androidx.annotation.Keep;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/TransitionInfo.class */
@Keep
public class TransitionInfo implements Serializable, Cloneable {
    public String packageId;
    public int srcClipIndex;
    public String transitionPath;

    public String toString() {
        StringBuilder sb = new StringBuilder("TransitionInfo{srcClipIndex=");
        sb.append(this.srcClipIndex);
        sb.append(", transitionPath='");
        sb.append(this.transitionPath);
        sb.append("', packageId='");
        return C8770a.a(sb, this.packageId, "'}");
    }
}
