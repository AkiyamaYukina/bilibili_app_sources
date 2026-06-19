package com.bilibili.upper.module.partitionTag.partition.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperPublishHotTag.class */
@Keep
public class UpperPublishHotTag {

    @JSONField(name = "act_url")
    public String actUrl;
    public List<Children> children;
    public int hot;
    public int id;

    @JSONField(name = "new")
    public int isNew;
    public String name;
    public String protocol;
    public String tags;
    public String types;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperPublishHotTag$Children.class */
    @Keep
    public static class Children {

        @JSONField(name = "act_url")
        public String actUrl;
        public String author;
        public String bvids;

        @JSONField(name = "child_sids")
        public String childSids;
        public String comment;
        public String cover;
        public String dic;
        public long etime;

        @JSONField(name = "global_weight")
        public long globalWeight;
        public int hot;

        @JSONField(name = "hot_value")
        public long hotValue;
        public long id;

        @JSONField(name = "new")
        public int isNew;
        public String name;
        public String oids;

        @JSONField(name = "priority_region")
        public String priorityRegion;
        public String protocol;
        public String rank;

        @JSONField(name = "region_weight")
        public long regionWeight;
        public long stime;

        @JSONField(name = "tag_show_platform")
        public long tagShowPlatform;
        public String tags;
        public int type;
        public String types;
    }
}
