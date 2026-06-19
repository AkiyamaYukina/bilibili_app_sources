package com.bilibili.studio.videoeditor.annual.bean.engine;

import androidx.annotation.Keep;
import g.C7207a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/CaptionInfo.class */
@Keep
public class CaptionInfo {
    public List<String> compoundText = new ArrayList();
    public String fontPath;
    public long inPoint;
    public String licPath;
    public long outPoint;
    public String packageId;
    public String packagePath;
    public long pageId;
    public String text;
    public float zValue;

    public String toString() {
        StringBuilder sb = new StringBuilder("CaptionInfo{inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", text='");
        sb.append(this.text);
        sb.append("', compoundText=");
        sb.append(this.compoundText);
        sb.append(", videoFxPath='");
        sb.append(this.packagePath);
        sb.append("', licPath='");
        sb.append(this.licPath);
        sb.append("', fontPath='");
        sb.append(this.fontPath);
        sb.append("', zValue=");
        sb.append(this.zValue);
        sb.append(", packageId='");
        sb.append(this.packageId);
        sb.append("', pageId=");
        return C7207a.a(sb, this.pageId, '}');
    }
}
