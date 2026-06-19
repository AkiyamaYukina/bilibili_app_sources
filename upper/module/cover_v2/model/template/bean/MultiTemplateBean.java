package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiTemplateBean.class */
@Keep
public class MultiTemplateBean extends MultiEngineMaterialBean {

    @JSONField(name = "apply_for")
    public int applyFor;

    @JSONField(name = "text_attr")
    public int attribute;

    @JSONField(name = "loop_textmotion_id")
    public String circleAnimationId;
    public String cover;
    public long duration;

    @JSONField(name = "font_color")
    public String fontColor;

    @JSONField(name = "font_id")
    public Integer fontId;

    @JSONField(name = "font_ids")
    public List<Integer> fontIds;

    @JSONField(name = "font_size")
    public Float fontScale;
    public int id;

    @JSONField(name = "fadein_textmotion_id")
    public String inAnimationId;

    @JSONField(name = "fav")
    public Integer isFav;

    @JSONField(name = "italic")
    public int italic;
    public int max;
    public String name;

    @JSONField(name = "fadeout_textmotion_id")
    public String outAnimationId;

    @JSONField(name = "outline_color")
    public String outlineColor;

    @JSONField(name = "outline_size")
    public Double outlineWidth;
    public int rank;

    @JSONField(name = "subtitle_type")
    public int subtitleType;

    @JSONField(name = "text_fmt")
    public String textFmt;
}
