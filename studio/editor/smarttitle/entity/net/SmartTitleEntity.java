package com.bilibili.studio.editor.smarttitle.entity.net;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.f0;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/entity/net/SmartTitleEntity.class */
@Keep
public class SmartTitleEntity {

    @JSONField(name = "list")
    public List<SmartTitleStyleEntity> list;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/entity/net/SmartTitleEntity$SmartTitleStyleEntity.class */
    @Keep
    public static class SmartTitleStyleEntity {

        @JSONField(name = "id")
        public int id;

        @JSONField(name = "prompt")
        public String prompt;

        @JSONField(name = "sentence_pattern")
        public List<Integer> sentencePattern;

        @JSONField(name = "style_name")
        public String styleName;

        public String toString() {
            StringBuilder sb = new StringBuilder("{styleName='");
            sb.append(this.styleName);
            sb.append("'id='");
            sb.append(this.id);
            sb.append("', sentencePattern=");
            return f0.a(sb, this.sentencePattern, '}');
        }
    }

    public String toString() {
        return f0.a(new StringBuilder("SmartTitleEntity{list="), this.list, '}');
    }
}
