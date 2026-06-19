package com.bilibili.upper.module.partitionTag.partition.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bilibili.upper.module.contribute.up.util.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperPartitionTagParam.class */
@Keep
public class UpperPartitionTagParam implements Serializable {
    public long aid;
    public int archiveState;
    public boolean canCreateTopic;
    public long canEditMission;
    public long childTypeId;
    public int copyright;
    public String cover;
    public String cover43;
    public String desc;
    public String filename;
    private List<UpperTagBean> initTags;
    public long missionId;
    private List<UpperTagBean> tags;
    public String title;
    public long topicId;
    public String topicName;
    public int topicSourceType = 0;

    public void addTag(int i7, UpperTagBean upperTagBean) {
        List<UpperTagBean> tags;
        if (i7 < 0 || upperTagBean == null || TextUtils.isEmpty(upperTagBean.tagText) || (tags = getTags()) == null || tags.contains(upperTagBean)) {
            return;
        }
        tags.add(i7, upperTagBean);
    }

    public void addTag(int i7, String str) {
        addTag(i7, UpperTagBean.createNormalTag(str));
    }

    public void addTag(UpperTagBean upperTagBean) {
        List<UpperTagBean> tags;
        if (upperTagBean == null || TextUtils.isEmpty(upperTagBean.tagText) || (tags = getTags()) == null || tags.contains(upperTagBean)) {
            return;
        }
        tags.add(upperTagBean);
    }

    public void addTag(String str) {
        addTag(UpperTagBean.createNormalTag(str));
    }

    public void addTags(List<UpperTagBean> list) {
        List<UpperTagBean> tags;
        if (list == null || list.isEmpty() || (tags = getTags()) == null) {
            return;
        }
        for (UpperTagBean upperTagBean : list) {
            if (!tags.contains(upperTagBean)) {
                tags.add(upperTagBean);
            }
        }
    }

    public void addTextTags(List<String> list) {
        addTags(convertToTagList(list));
    }

    public boolean containTag(UpperTagBean upperTagBean) {
        if (upperTagBean == null) {
            return false;
        }
        return containTag(upperTagBean.tagText);
    }

    public boolean containTag(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List<UpperTagBean> tags = getTags();
        boolean zEquals = false;
        if (tags != null) {
            if (tags.isEmpty()) {
                zEquals = false;
            } else {
                Iterator<UpperTagBean> it = tags.iterator();
                boolean z6 = false;
                while (true) {
                    zEquals = z6;
                    if (!it.hasNext()) {
                        break;
                    }
                    UpperTagBean next = it.next();
                    if (next != null && !TextUtils.isEmpty(next.tagText)) {
                        zEquals = str.equals(next.tagText);
                        z6 = zEquals;
                        if (zEquals) {
                            break;
                        }
                    }
                }
            }
        }
        return zEquals;
    }

    public List<UpperTagBean> convertToTagList(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(UpperTagBean.createNormalTag(str));
                }
            }
        }
        return arrayList;
    }

    public List<UpperTagBean> getTags() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        return this.tags;
    }

    public List<UpperTagBean> getTags(boolean z6) {
        List<UpperTagBean> tags = getTags();
        if (!z6) {
            return tags;
        }
        ArrayList arrayList = new ArrayList();
        for (UpperTagBean upperTagBean : tags) {
            if (upperTagBean != null && !upperTagBean.isPartRcmdTag) {
                arrayList.add(upperTagBean.copy());
            }
        }
        return arrayList;
    }

    public List<String> getTextTags() {
        List<UpperTagBean> tags = getTags();
        ArrayList arrayList = new ArrayList();
        if (tags == null) {
            return arrayList;
        }
        for (UpperTagBean upperTagBean : tags) {
            if (upperTagBean != null && !TextUtils.isEmpty(upperTagBean.tagText)) {
                arrayList.add(upperTagBean.tagText);
            }
        }
        return arrayList;
    }

    public boolean isInitTagsEmpty() {
        List<UpperTagBean> list = this.initTags;
        return list == null || list.isEmpty();
    }

    public boolean needToReplacePartitionRecommendTags() {
        return this.childTypeId > 0 && isInitTagsEmpty();
    }

    public void removeTag(int i7) {
        List<UpperTagBean> tags;
        if (i7 >= 0 && (tags = getTags()) != null && tags.size() > i7) {
            tags.remove(i7);
        }
    }

    public void removeTag(UpperTagBean upperTagBean) {
        List<UpperTagBean> tags = getTags();
        if (tags == null) {
            return;
        }
        tags.remove(upperTagBean);
    }

    public void removeTag(String str) {
        removeTag(UpperTagBean.createNormalTag(str));
    }

    public void removeTag(String str, boolean z6) {
        if (z6) {
            removeTag(UpperTagBean.createTopicTag(str));
        } else {
            removeTag(UpperTagBean.createNormalTag(str));
        }
    }

    public void setTags(List<UpperTagBean> list) {
        getTags().clear();
        addTags(list);
    }

    public void setTextTags(List<String> list) {
        setTags(convertToTagList(list));
    }

    public void syncInitTags() {
        this.initTags = new ArrayList();
        List<UpperTagBean> tags = getTags();
        ArrayList arrayList = new ArrayList();
        if (tags == null || tags.isEmpty()) {
            m.g(arrayList);
            m.h(arrayList);
            return;
        }
        for (UpperTagBean upperTagBean : tags) {
            if (upperTagBean != null) {
                this.initTags.add(upperTagBean.copy());
                arrayList.add(upperTagBean.tagText);
            }
        }
        m.g(arrayList);
        m.h(arrayList);
    }
}
