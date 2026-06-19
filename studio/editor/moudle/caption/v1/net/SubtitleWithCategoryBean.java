package com.bilibili.studio.editor.moudle.caption.v1.net;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionBean;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/net/SubtitleWithCategoryBean.class */
@Keep
public class SubtitleWithCategoryBean implements Serializable, Cloneable {

    @JSONField(name = "id")
    public long id;

    @Nullable
    @JSONField(name = "name")
    public String name;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @Nullable
    @JSONField(name = "children")
    public List<CaptionBean.SubtitleBean> subTitleList;

    @JSONField(name = "type")
    public int type;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SubtitleWithCategoryBean m9891clone() {
        try {
            return (SubtitleWithCategoryBean) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
