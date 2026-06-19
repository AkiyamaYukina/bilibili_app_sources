package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateTabBean.class */
@Keep
public class EditorTemplateTabBean implements Serializable {

    @JSONField(name = "children")
    private List<EditorTemplateTabItemBean> children;

    @JSONField(name = "id")
    private long id;

    @JSONField(name = "name")
    private String name;

    public List<EditorTemplateTabItemBean> getChildren() {
        return this.children;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setChildren(List<EditorTemplateTabItemBean> list) {
        this.children = list;
    }

    public void setId(long j7) {
        this.id = j7;
    }

    public void setName(String str) {
        this.name = str;
    }
}
