package com.bilibili.studio.editor.moudle.musicv3.net.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/net/bean/EditorRecommendItemBean.class */
@Keep
public class EditorRecommendItemBean implements Serializable {

    @JSONField(name = "musics")
    public List<Bgm> recommendList;
}
