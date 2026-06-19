package com.bilibili.studio.editor.moudle.sticker.v1;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/VideoFxStickerWithCategoryBean.class */
@Keep
public class VideoFxStickerWithCategoryBean implements Serializable, Cloneable {

    @Nullable
    @JSONField(name = "vsticker_with_category")
    public List<VideoFxStickerCategoryBean> fxStickerCategoryList;

    @Nullable
    @JSONField(name = "hot_sticker")
    public VideoFxStickerCategoryBean hotSticker;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/VideoFxStickerWithCategoryBean$VideoFxStickerCategoryBean.class */
    @Keep
    public static class VideoFxStickerCategoryBean implements Cloneable {

        @JSONField(name = "id")
        public long id;

        @Nullable
        @JSONField(name = "name")
        public String name;

        @JSONField(name = EditCustomizeSticker.TAG_RANK)
        public int rank;

        @Nullable
        @JSONField(name = "children")
        public List<VideoFxStickerBean.FxDataBean> stickerList;

        @JSONField(name = "type")
        public int type;

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public VideoFxStickerCategoryBean m10144clone() {
            VideoFxStickerCategoryBean videoFxStickerCategoryBean;
            try {
                videoFxStickerCategoryBean = (VideoFxStickerCategoryBean) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                videoFxStickerCategoryBean = null;
            }
            return videoFxStickerCategoryBean;
        }
    }
}
