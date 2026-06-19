package com.bilibili.studio.editor.moudle.danmaku.v1;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuItemListResponseBean.class */
@Keep
public class DanmakuItemListResponseBean implements Serializable {

    @JSONField(name = "list")
    public List<DanmakuItemList> list;
}
