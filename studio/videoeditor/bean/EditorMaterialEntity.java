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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/EditorMaterialEntity.class */
@Keep
public class EditorMaterialEntity implements Cloneable {

    @JSONField(name = "interactive_barrage")
    public List<DanmakuTypeItem> danmakuTypeList;

    @Nullable
    @JSONField(name = "filter_with_category")
    public List<EditFxFilterWithCategoryBean$CategoryDataBean> filterWithCategory;

    @JSONField(name = "flower_with_category")
    public List<SubtitleWithCategoryBean> flowerWithCategoryBeanList;

    @Nullable
    @JSONField(name = "vsticker_with_category")
    public List<VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean> fxStickerCategoryList;

    @Nullable
    @JSONField(name = "hot_sticker")
    public VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean hotSticker;

    @JSONField(name = "text_motion_category")
    public List<SubtitleWithCategoryBean> motionWithCategoryBeanList;
    public List<CaptionBean.SubtitleBean> subtitle;
    public List<TransitionData.TransitionBean> trans;

    @JSONField(name = "trans_with_category")
    public List<TransitionData.TransitionTabBean> transWithCategory;

    @JSONField(name = "subtitle_with_category")
    public List<SubtitleWithCategoryBean> subtitleWithCategoryBeanList = new ArrayList();
    public ArrayList<CaptionFontEntity> font = new ArrayList<>();

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditorMaterialEntity m10403clone() {
        EditorMaterialEntity editorMaterialEntity;
        try {
            editorMaterialEntity = (EditorMaterialEntity) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            editorMaterialEntity = null;
        }
        return editorMaterialEntity;
    }
}
