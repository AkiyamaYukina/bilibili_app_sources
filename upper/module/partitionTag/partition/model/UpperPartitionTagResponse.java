package com.bilibili.upper.module.partitionTag.partition.model;

import androidx.annotation.Keep;
import androidx.collection.C3269h;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperPartitionTagResponse.class */
@Keep
public class UpperPartitionTagResponse implements Serializable {
    public long childTypeId;
    public long missionId;
    public String missionName;
    public int responseType = 10;
    public List<String> tags;
    public long topicId;
    public String topicName;
    public int topicSourceType;
    public List<String> topics;
    public String typeText;

    public String toString() {
        StringBuilder sb = new StringBuilder("UpperPartitionTagResponse{responseType=");
        sb.append(this.responseType);
        sb.append(", childTypeId=");
        sb.append(this.childTypeId);
        sb.append(", typeText='");
        sb.append(this.typeText);
        sb.append("', tags=");
        sb.append(this.tags);
        sb.append(", topics=");
        sb.append(this.topics);
        sb.append(", missionId=");
        sb.append(this.missionId);
        sb.append(", missionName='");
        sb.append(this.missionName);
        sb.append("', topicId=");
        sb.append(this.topicId);
        sb.append(", topicName='");
        sb.append(this.topicName);
        sb.append("', topicSourceType=");
        return C3269h.a(sb, this.topicSourceType, '}');
    }
}
