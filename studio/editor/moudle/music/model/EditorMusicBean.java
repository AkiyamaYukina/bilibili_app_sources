package com.bilibili.studio.editor.moudle.music.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.bgm.BgmTab;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/model/EditorMusicBean.class */
@Keep
public class EditorMusicBean {

    @Nullable
    @JSONField(name = "bgm_list")
    public List<BgmTab> bgmList;
}
