package com.bilibili.studio.videoeditor.editbase.filter.net;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.editbase.filter.net.EditFxFilterBean;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/filter/net/EditFxFilterWithCategoryBean$CategoryDataBean.class */
@Keep
public class EditFxFilterWithCategoryBean$CategoryDataBean implements Cloneable {

    @Nullable
    @JSONField(name = "children")
    public List<EditFxFilterBean.FxDataBean> filterList;

    @JSONField(name = "id")
    public int id;

    @Nullable
    @JSONField(name = "name")
    public String name;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @JSONField(name = "type")
    public int type;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditFxFilterWithCategoryBean$CategoryDataBean m10439clone() {
        EditFxFilterWithCategoryBean$CategoryDataBean editFxFilterWithCategoryBean$CategoryDataBean;
        try {
            editFxFilterWithCategoryBean$CategoryDataBean = (EditFxFilterWithCategoryBean$CategoryDataBean) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            editFxFilterWithCategoryBean$CategoryDataBean = null;
        }
        return editFxFilterWithCategoryBean$CategoryDataBean;
    }
}
