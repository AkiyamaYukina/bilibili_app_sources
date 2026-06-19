package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourPreviewBean.class */
@Keep
public class KingHonourPreviewBean implements Serializable {

    @JSONField(name = "beauty_highlights")
    public List<KingHonourVideoBean> beautyLights;

    @JSONField(name = "create_topic")
    public boolean canCreateTopic;

    @JSONField(name = "global_highlights")
    public List<KingHonourVideoBean> globalLights;

    @JSONField(name = "global_templates")
    public List<KingHonourPublishTemplateBean> globalTemplates;

    @JSONField(name = "global_topics")
    public List<KingHonourTopicBean> globalTopics;

    @JSONField(name = "single_highlights")
    public List<KingHonourVideoBean> singleLights;

    @JSONField(name = "single_templates")
    public Map<String, Map<String, List<KingHonourPublishTemplateBean>>> singleTemplates;
}
