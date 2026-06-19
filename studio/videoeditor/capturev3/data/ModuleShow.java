package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShow.class */
@Keep
public class ModuleShow implements Serializable {
    public ActivityInfo activity;
    public boolean audio_record;
    public BCutInfo bcut;
    public boolean camera;

    @JSONField(name = "capture_effect")
    public boolean captureEffect;

    @JSONField(name = "capture_filter")
    public boolean captureFilter;
    public boolean cooperate;
    public boolean filter;
    public boolean gallery;

    @JSONField(name = "icons_new")
    public List<IconBean> iconBeanNew;

    @JSONField(name = "icons_old")
    public List<IconBean> iconBeanOld;

    @JSONField(name = "icon_style_new")
    public Boolean iconStyleNew;
    public boolean lottery;
    public boolean simplify;
    public boolean sticker;
    public boolean subtitle;
    public boolean theme;

    @JSONField(name = "use_bmm")
    public boolean useBmm;
    public boolean videoup_sticker;
    public boolean vote;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShow$ActivityInfo.class */
    @Keep
    public static class ActivityInfo implements Serializable {
        public BannerInfo banner;
        public String btn_title;
        public long first_tid;
        public String h5_url;
        public String icon;
        public long second_tid;
        public String sub_title;
        public String title;
        public int type;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShow$AppDetailsInfo.class */
    @Keep
    public static class AppDetailsInfo implements Serializable {
        public String btn_title;
        public String sub_title;
        public String title;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShow$BCutInfo.class */
    @Keep
    public static class BCutInfo implements Serializable {
        public String android_scheme;
        public BannerInfo banner;
        public String download_h5;
        public long first_tid;
        public String icon;
        public AppDetailsInfo installed;
        public String ios_scheme;
        public AppDetailsInfo not_installed;
        public long second_tid;
        public int type;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShow$IconBean.class */
    @Keep
    public static class IconBean implements Serializable {
        public String desc;
        public String icon;

        @JSONField(name = "icon_day")
        public String iconDay;

        @JSONField(name = "icon_night")
        public String iconNight;
        public String title;
        public int type;
        public String uri;
    }
}
