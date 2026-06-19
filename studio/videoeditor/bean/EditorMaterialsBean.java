package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionBean;
import com.bilibili.studio.editor.moudle.caption.v1.net.SubtitleWithCategoryBean;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuTypeItem;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerWithCategoryBean;
import com.bilibili.studio.videoeditor.editbase.filter.net.EditFxFilterWithCategoryBean$CategoryDataBean;
import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/EditorMaterialsBean.class */
@Keep
public class EditorMaterialsBean {

    @JSONField(name = "interactive_barrage")
    public List<DanmakuTypeItem> danmakuTypeList;

    @Nullable
    @JSONField(name = "filter_with_category")
    public List<EditFxFilterWithCategoryBean$CategoryDataBean> filterWithCategory;
    public List<CaptionBean.FontBean> font;

    @Nullable
    @JSONField(name = "vsticker_with_category")
    public List<VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean> fxStickerCategoryList;

    @Nullable
    @JSONField(name = "hot_sticker")
    public VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean hotSticker;
    public List<CaptionBean.SubtitleBean> subtitle;

    @JSONField(name = "subtitle_with_category")
    public List<SubtitleWithCategoryBean> subtitleWithCategoryBeanList;
    public List<TransitionData.TransitionBean> trans;
}
