package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import g.C7207a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureCategoryStickerBeanV3.class */
@Keep
public class CaptureCategoryStickerBeanV3 {

    @JSONField(name = "children")
    public List<CaptureStickerBeanV3> children;

    @JSONField(name = "ctime")
    public long ctime;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "new")
    public int isNew;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @JSONField(name = "type")
    public int type;

    public CaptureCategoryStickerBeanV3() {
        this("");
    }

    public CaptureCategoryStickerBeanV3(String str) {
        this.name = str;
        this.children = new ArrayList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CaptureCategoryStickerBeanV3{id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', rank=");
        sb.append(this.rank);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", children=");
        sb.append(this.children);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", ctime=");
        return C7207a.a(sb, this.ctime, '}');
    }
}
