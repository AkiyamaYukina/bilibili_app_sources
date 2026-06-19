package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureCategoryFilterBean.class */
@Keep
public class CaptureCategoryFilterBean {

    @JSONField(name = "children")
    public List<CaptureFilterBean> mChildren;

    @JSONField(name = "ctime")
    public long mCtime;

    @JSONField(name = "id")
    public long mId;

    @JSONField(name = "name")
    public String mName;

    @JSONField(name = "new")
    public int mNew;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int mRank;

    @JSONField(name = "type")
    public int mType;
}
