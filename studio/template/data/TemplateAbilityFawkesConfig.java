package com.bilibili.studio.template.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/TemplateAbilityFawkesConfig.class */
public final class TemplateAbilityFawkesConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f108632a = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/TemplateAbilityFawkesConfig$TemplateAbilityFawkesBean.class */
    @Keep
    public static class TemplateAbilityFawkesBean {

        @JSONField(name = "maxVer")
        private Integer maxVer;

        @JSONField(name = "minVer")
        private Integer minVer;

        @JSONField(name = "value")
        private Integer value;

        public Integer getMaxVer() {
            return this.maxVer;
        }

        public Integer getMinVer() {
            return this.minVer;
        }

        public Integer getValue() {
            return this.value;
        }

        public void setMaxVer(Integer num) {
            this.maxVer = num;
        }

        public void setMinVer(Integer num) {
            this.minVer = num;
        }

        public void setValue(Integer num) {
            this.value = num;
        }
    }
}
