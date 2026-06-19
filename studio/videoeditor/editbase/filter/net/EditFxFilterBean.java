package com.bilibili.studio.videoeditor.editbase.filter.net;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/filter/net/EditFxFilterBean.class */
@Keep
public class EditFxFilterBean {

    @Nullable
    @JSONField(name = "filter")
    public List<FxDataBean> fxFilterList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/filter/net/EditFxFilterBean$FxDataBean.class */
    @Keep
    public static class FxDataBean implements Cloneable {

        @Nullable
        @JSONField(name = "cover")
        public String cover;

        @Nullable
        @JSONField(name = "download_url")
        public String downloadUrl;

        @JSONField(name = "download_url_aurora")
        public String downloadUrlAurora;

        @JSONField(name = "filter_type")
        public int filterType;

        @JSONField(name = "id")
        public int id;

        @JSONField(name = "mtime")
        public long mTime;

        @Nullable
        @JSONField(name = "name")
        public String name;

        @JSONField(name = EditCustomizeSticker.TAG_RANK)
        public int rank;

        @JSONField(name = "tags")
        public int tags;

        @NonNull
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public FxDataBean m10438clone() {
            FxDataBean fxDataBean = new FxDataBean();
            fxDataBean.id = this.id;
            fxDataBean.name = this.name;
            fxDataBean.cover = this.cover;
            fxDataBean.downloadUrl = this.downloadUrl;
            fxDataBean.rank = this.rank;
            fxDataBean.mTime = this.mTime;
            fxDataBean.tags = this.tags;
            fxDataBean.filterType = this.filterType;
            fxDataBean.downloadUrlAurora = this.downloadUrlAurora;
            return fxDataBean;
        }
    }
}
