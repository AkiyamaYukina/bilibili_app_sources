package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/bean/RecordVoiceResponse.class */
@Keep
public final class RecordVoiceResponse implements Serializable {

    @JSONField(name = "list")
    @Nullable
    private List<RecordVoiceCategory> list;

    @Nullable
    public final List<RecordVoiceCategory> getList() {
        return this.list;
    }

    public final void setList(@Nullable List<RecordVoiceCategory> list) {
        this.list = list;
    }
}
