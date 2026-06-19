package com.bilibili.studio.editor.moudle.danmaku.v1;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuTypeListResponseBean.class */
@Keep
public class DanmakuTypeListResponseBean implements Serializable {

    @JSONField(name = "interactive_barrage")
    public List<DanmakuTypeItem> danmakuTypeList;
}
