package com.bilibili.studio.editor.moudle.sticker.v1;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/VideoFxStickerBean.class */
@Keep
public class VideoFxStickerBean implements Serializable, Cloneable {

    @Nullable
    @JSONField(name = "videoup_sticker")
    public List<FxDataBean> fxDataBeanList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/VideoFxStickerBean$Config.class */
    @Keep
    public static class Config implements Cloneable {

        @JSONField(name = "normalize_translationX")
        public Float normalizeTranslationX;

        @JSONField(name = "normalize_translationY")
        public Float normalizeTranslationY;

        @JSONField(name = "scale_factor")
        public Float scaleFactor;

        public Config() {
            Float fValueOf = Float.valueOf(0.0f);
            this.normalizeTranslationX = fValueOf;
            this.normalizeTranslationY = fValueOf;
            this.scaleFactor = Float.valueOf(1.0f);
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Config m10142clone() {
            Config config;
            try {
                config = (Config) super.clone();
            } catch (CloneNotSupportedException e7) {
                config = new Config();
                e7.printStackTrace();
            }
            return config;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/VideoFxStickerBean$FxDataBean.class */
    @Keep
    public static class FxDataBean implements Cloneable {

        @JSONField(name = "cat_id")
        public long catId;

        @JSONField(name = "config")
        public Map<String, Config> config;

        @Nullable
        @JSONField(name = "cover")
        public String coverUrl;

        @Nullable
        @JSONField(name = "download_url")
        public String downloadUrl;

        @JSONField(name = "download_url_aurora")
        public String downloadUrlAurora;

        @JSONField(name = "duration_ms")
        public long durationMs;

        @JSONField(name = "id")
        public int id;

        @Nullable
        @JSONField(name = "name")
        public String name;

        @JSONField(name = "normalize_translationX")
        public Float normalizeTranslationX;

        @JSONField(name = "normalize_translationY")
        public Float normalizeTranslationY;

        @JSONField(name = EditCustomizeSticker.TAG_RANK)
        public int rank;

        @JSONField(name = "scale_factor")
        public Float scaleFactor;

        @JSONField(name = "sound_info")
        public SoundInfo soundInfo;
        public float zValue;

        public FxDataBean() {
            Float fValueOf = Float.valueOf(0.0f);
            this.normalizeTranslationX = fValueOf;
            this.normalizeTranslationY = fValueOf;
            this.scaleFactor = Float.valueOf(1.0f);
            this.zValue = 0.0f;
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public FxDataBean m10143clone() {
            FxDataBean fxDataBean;
            try {
                fxDataBean = (FxDataBean) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                fxDataBean = null;
            }
            return fxDataBean;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/VideoFxStickerBean$SoundInfo.class */
    @Keep
    public static class SoundInfo implements Cloneable {

        @JSONField(name = "download_url")
        public String downloadUrl;
        public long duration;
        public long id;

        public Object clone() throws CloneNotSupportedException {
            SoundInfo soundInfo;
            try {
                soundInfo = (SoundInfo) super.clone();
            } catch (CloneNotSupportedException e7) {
                e7.printStackTrace();
                soundInfo = null;
            }
            return soundInfo;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VideoFxStickerBean m10141clone() {
        VideoFxStickerBean videoFxStickerBean;
        try {
            videoFxStickerBean = (VideoFxStickerBean) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            videoFxStickerBean = null;
        }
        return videoFxStickerBean;
    }
}
