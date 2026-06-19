package com.bilibili.studio.videoeditor.capturev3.services;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureCategoryStickerBeanV3;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureStickerBeanV3;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/services/BiliCaptureStickerBeanV3.class */
@Keep
public class BiliCaptureStickerBeanV3 {

    @JSONField(name = "sticker_with_category")
    public List<CaptureCategoryStickerBeanV3> captureCategoryStickers;

    @JSONField(name = "fav_sticker")
    public List<CaptureStickerBeanV3> captureFavStickers;

    @JSONField(name = "hot_sticker")
    public CaptureCategoryStickerBeanV3 captureHotStickers;
}
