package com.bilibili.studio.editor.moudle.caption.v1;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.caption.v1.net.SubtitleWithCategoryBean;
import com.bilibili.studio.videoeditor.bean.CaptionFontEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionBean.class */
@Keep
public class CaptionBean implements Serializable {

    @JSONField(name = "flower_with_category")
    public List<SubtitleWithCategoryBean> flowerWithCategoryBeanList;
    public List<CaptionFontEntity> font;

    @JSONField(name = "text_motion_category")
    public List<SubtitleWithCategoryBean> motionWithCategoryBeanList;
    public List<SubtitleBean> subtitle;

    @JSONField(name = "subtitle_with_category")
    public List<SubtitleWithCategoryBean> subtitleWithCategoryBeanList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionBean$Config.class */
    @Keep
    public static class Config implements Cloneable {

        @JSONField(name = "max_word_count_per_end")
        public int maxWordCount = 15;

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
        public Config m9884clone() {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionBean$FontBean.class */
    @Keep
    public static class FontBean {
        public String cover;
        public String download_url;
        public int id;
        public String name;
        public int rank;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CaptionBean$SubtitleBean.class */
    @Keep
    public static class SubtitleBean implements Cloneable {
        public int apply_for;

        @JSONField(name = "loop_textmotion_id")
        public long circleAnimId;

        @JSONField(name = "config")
        public Map<String, Config> config;
        public String cover;
        public long ctime;

        @JSONField(name = "download_url_aurora")
        public String downloadUrlAurora;

        @JSONField(name = "download_url_v2")
        public String downloadUrlV2;
        public String download_url;
        public long duration;

        @JSONField(name = "font_color")
        public String fontColor;

        @JSONField(name = "font_id")
        public Integer fontId;

        @JSONField(name = "font_size")
        public Float fontScale;
        public int id;

        @JSONField(name = "fadein_textmotion_id")
        public long inAnimId;
        public int loop;
        public int max;
        public long mtime;
        public String name;

        @JSONField(name = "fadeout_textmotion_id")
        public long outAnimId;

        @JSONField(name = "outline_color")
        public String outlineColor;

        @JSONField(name = "outline_size")
        public Integer outlineWidth;
        public int rank;

        @JSONField(name = "static_cover")
        public String staticCover;
        public Object tags;

        @JSONField(name = "text_attr")
        public int textAttr;

        @JSONField(name = "text_fmt")
        public String textFmt;

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public SubtitleBean m9885clone() {
            SubtitleBean subtitleBean = new SubtitleBean();
            subtitleBean.id = this.id;
            subtitleBean.name = this.name;
            subtitleBean.cover = this.cover;
            subtitleBean.rank = this.rank;
            subtitleBean.max = this.max;
            subtitleBean.ctime = this.ctime;
            subtitleBean.mtime = this.mtime;
            Object obj = this.tags;
            if (obj != null) {
                subtitleBean.tags = obj;
            } else {
                subtitleBean.tags = null;
            }
            subtitleBean.apply_for = this.apply_for;
            subtitleBean.loop = this.loop;
            subtitleBean.duration = this.duration;
            subtitleBean.download_url = this.download_url;
            subtitleBean.textAttr = this.textAttr;
            subtitleBean.textFmt = this.textFmt;
            subtitleBean.fontId = this.fontId;
            subtitleBean.fontColor = this.fontColor;
            subtitleBean.fontScale = this.fontScale;
            subtitleBean.outlineColor = this.outlineColor;
            subtitleBean.outlineWidth = this.outlineWidth;
            subtitleBean.staticCover = this.staticCover;
            subtitleBean.downloadUrlAurora = this.downloadUrlAurora;
            subtitleBean.downloadUrlV2 = this.downloadUrlV2;
            subtitleBean.config = this.config;
            subtitleBean.inAnimId = this.inAnimId;
            subtitleBean.outAnimId = this.outAnimId;
            subtitleBean.circleAnimId = this.circleAnimId;
            return subtitleBean;
        }

        public String toString() {
            return "SubtitleBean{id=" + this.id + ", name='" + this.name + "', download_url='" + this.download_url + "', downloadUrlAurora='" + this.downloadUrlAurora + "', textFmt='" + this.textFmt + "', fontId=" + this.fontId + ", fontColor='" + this.fontColor + "', fontScale=" + this.fontScale + ", outlineColor='" + this.outlineColor + "', outlineWidth=" + this.outlineWidth + '}';
        }
    }
}
