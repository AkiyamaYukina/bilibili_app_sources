package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiStickerBean.class */
@Keep
public class MultiStickerBean extends MultiEngineMaterialBean {

    @JSONField(name = "apply_for")
    public int applyFor;

    @JSONField(name = "cover")
    public String coverUrl;

    @JSONField(name = "duration_ms")
    public long durationMs;

    @JSONField(name = "hot")
    public int hot;

    @JSONField(name = "id")
    public int id;

    @JSONField(name = "fav")
    public int isFavourite;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;
}
