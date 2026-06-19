package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateListBean.class */
@Keep
public class EditorTemplateListBean implements Serializable {

    @JSONField(name = "children_material")
    public List<EditorTemplateMaterial> childrenMaterial;

    @JSONField(name = "list")
    private List<EditorTemplateTabBean> list;

    @JSONField(name = "select_rule")
    public int selectRule;

    public List<EditorTemplateTabBean> getList() {
        return this.list;
    }

    public void setList(List<EditorTemplateTabBean> list) {
        this.list = list;
    }
}
