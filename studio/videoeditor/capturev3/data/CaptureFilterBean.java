package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureFilterBean.class */
@Keep
public class CaptureFilterBean {

    @JSONField(name = "effect_val")
    public int effectValue;

    @Nullable
    @JSONField(name = "cover")
    public String mCover;

    @JSONField(name = "ctime")
    public long mCtime;

    @Nullable
    @JSONField(name = "download_url")
    public String mDownloadUrl;

    @JSONField(name = "filter_type")
    public int mFilterType;

    @JSONField(name = "id")
    public int mId;

    @JSONField(name = "mtime")
    public long mMtime;

    @Nullable
    @JSONField(name = "name")
    public String mName;

    @JSONField(name = "new")
    public int mNew;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int mRank;

    @Nullable
    @JSONField(name = "tags")
    public String mTags;
}
