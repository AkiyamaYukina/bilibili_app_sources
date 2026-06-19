package com.bilibili.studio.editor.moudle.musicv3.net.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/net/bean/EditorFavItemBean.class */
@Keep
public class EditorFavItemBean implements Serializable {

    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    public CursorBean cursor;

    @JSONField(name = "fav")
    public List<Bgm> favList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/net/bean/EditorFavItemBean$CursorBean.class */
    @Keep
    public static class CursorBean implements Serializable {
        public int pn;
        public int ps;
        public int total;
    }
}
