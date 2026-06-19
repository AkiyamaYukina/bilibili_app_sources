package com.bilibili.studio.videoeditor.capturev3.data;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew.class */
@Keep
public class ModuleShowNew implements Serializable {
    public ActivityInfo activity;
    public boolean audio_record;
    public boolean camera;
    public boolean cooperate;
    public boolean filter;
    public boolean gallery;
    public List<IconBean> icons;
    public boolean lottery;
    public boolean simplify;
    public boolean sticker;
    public boolean subtitle;

    @JSONField(name = "target_people")
    public TargetPeopleBean targetPeople;
    public boolean theme;

    @JSONField(name = "use_bmm")
    public boolean useBmm;
    public boolean videoup_sticker;
    public boolean vote;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew$ActBean.class */
    @Keep
    public static class ActBean implements Serializable {

        @JSONField(name = "act_id")
        public int actId;

        @JSONField(name = "act_scheme")
        public String actScheme;

        @JSONField(name = "act_subtitle")
        public String actSubtitle;

        @JSONField(name = "act_title")
        public String actTitle;

        @JSONField(name = "people_num")
        public String peopleNum;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew$ActivityInfo.class */
    @Keep
    public static class ActivityInfo implements Serializable {
        public BannerInfo banner;
        public String btn_title;
        public int first_tid;
        public String h5_url;
        public String icon;
        public int second_tid;
        public String sub_title;
        public String title;
        public int type;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew$BannerBean.class */
    @Keep
    public static class BannerBean implements Serializable {

        @JSONField(name = "banner_img")
        public String bannerImg;

        @JSONField(name = "banner_scheme")
        public String bannerScheme;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew$IconBean.class */
    @Keep
    public static class IconBean implements Serializable {

        @JSONField(name = "android_scheme")
        public String bcutScheme;
        public int defaultIconDay;
        public int defaultIconNight;
        public String desc;

        @JSONField(name = "download_h5")
        public String downloadH5;

        @JSONField(name = "first_tid")
        public int firstTid;

        @JSONField(name = "icon_day")
        public String iconDay;

        @JSONField(name = "icon_night")
        public String iconNight;

        @JSONField(name = "is_big")
        public boolean isBig;

        @JSONField(name = "second_tid")
        public int secondTid;

        @JSONField(name = "sub_title")
        public String subTitle;
        public String title;
        public long ts;
        public int type;
        public String uri;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew$TPLBean.class */
    @Keep
    public static class TPLBean implements Serializable {

        @JSONField(name = "tpl_cover")
        public String tplCover;

        @JSONField(name = "tpl_id")
        public int tplId;

        @JSONField(name = "tpl_link")
        public String tplLink;

        @JSONField(name = "tpl_title")
        public String tplTitle;

        @JSONField(name = "tpl_total")
        public int tplTotal;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/ModuleShowNew$TargetPeopleBean.class */
    @Keep
    public static class TargetPeopleBean implements Serializable {
        public List<ActBean> act;
        public BannerBean banner;
        public int pid;

        @JSONField(name = "sub_title")
        public String subTitle;
        public String title;
        public List<TPLBean> tpl;
        public int typ;

        public void validateData() {
            ArrayList arrayList = new ArrayList();
            List<ActBean> list = this.act;
            if (list != null) {
                for (ActBean actBean : list) {
                    if (!TextUtils.isEmpty(actBean.actTitle) && !TextUtils.isEmpty(actBean.actScheme)) {
                        arrayList.add(actBean);
                    }
                }
            }
            if (arrayList.size() == 3) {
                this.act = arrayList;
                this.typ = 2;
            } else {
                this.act = null;
            }
            BannerBean bannerBean = this.banner;
            if (bannerBean != null) {
                if (TextUtils.isEmpty(bannerBean.bannerImg) || TextUtils.isEmpty(this.banner.bannerScheme)) {
                    this.banner = null;
                } else {
                    this.typ = 3;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List<TPLBean> list2 = this.tpl;
            if (list2 != null) {
                for (TPLBean tPLBean : list2) {
                    if (!TextUtils.isEmpty(tPLBean.tplTitle) && !TextUtils.isEmpty(tPLBean.tplCover) && !TextUtils.isEmpty(tPLBean.tplLink)) {
                        arrayList2.add(tPLBean);
                    }
                }
            }
            this.tpl = arrayList2;
        }
    }
}
