package com.bilibili.studio.editor.smarttitle.entity.aitask;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/entity/aitask/SmartTitleAITaskResult.class */
@Keep
public class SmartTitleAITaskResult {
    public long aiTaskCreateTime;

    @JSONField(name = "code")
    public int code;

    @Nullable
    @JSONField(name = "title_list")
    public List<String> titleList;

    public static SmartTitleAITaskResult copy(SmartTitleAITaskResult smartTitleAITaskResult) {
        SmartTitleAITaskResult smartTitleAITaskResult2 = new SmartTitleAITaskResult();
        if (smartTitleAITaskResult.titleList != null) {
            smartTitleAITaskResult2.titleList = new ArrayList(smartTitleAITaskResult.titleList);
        }
        smartTitleAITaskResult2.code = smartTitleAITaskResult.code;
        smartTitleAITaskResult2.aiTaskCreateTime = smartTitleAITaskResult.aiTaskCreateTime;
        return smartTitleAITaskResult2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SmartTitleAITaskResult{aiTaskCreateTime=");
        sb.append(this.aiTaskCreateTime);
        sb.append(", titleList=");
        sb.append(this.titleList);
        sb.append(", code=");
        return C3269h.a(sb, this.code, '}');
    }
}
