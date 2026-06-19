package com.bilibili.upper.module.tempalte.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/TagTemplate.class */
@Keep
public class TagTemplate {
    public static final String DEFAULT_TAG = "Default";
    private String tag;
    private List<Template> templates;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/TagTemplate$Template.class */
    @Keep
    public static class Template {
        private long id;
        private long max_time;

        public long getId() {
            return this.id;
        }

        public long getMax_time() {
            return this.max_time;
        }

        public void setId(long j7) {
            this.id = j7;
        }

        public void setMax_time(long j7) {
            this.max_time = j7;
        }
    }

    public String getTag() {
        return this.tag;
    }

    public List<Template> getTemplates() {
        return this.templates;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTemplates(List<Template> list) {
        this.templates = list;
    }
}
