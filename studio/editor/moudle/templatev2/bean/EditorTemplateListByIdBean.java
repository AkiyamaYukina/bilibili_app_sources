package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateListByIdBean.class */
@Keep
public class EditorTemplateListByIdBean implements Serializable {

    @JSONField(name = "children_material")
    public List<EditorTemplateMaterial> childrenMaterial;

    @JSONField(name = "list")
    public List<EditorTemplateTabItemBean> list;
}
