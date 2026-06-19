package com.bilibili.studio.videoeditor.capturev3.data;

import JB0.p;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sB0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureStickerBeanV3.class */
@Keep
public class CaptureStickerBeanV3 {

    @JSONField(name = "baidu_ar_type")
    public int arType;

    @JSONField(name = "stickers")
    public List<CaptureStickerBeanV3> attachStickers;

    @JSONField(name = "auto_replay")
    public int autoReplay;

    @JSONField(name = "bgm")
    public Bgm bgm;

    @Nullable
    @JSONField(name = "cover")
    public String cover;

    @Nullable
    @JSONField(name = "ctime")
    public String ctime;

    @JSONField(name = "cue_video")
    public String cueVideo;

    @Nullable
    @JSONField(name = "download_url")
    public String download;

    @JSONField(name = "filters")
    public List<CaptureFilterBean> effectFilters;

    @JSONField(name = "surgerys")
    public List<b> effectSurgerys;

    @JSONField(name = "videofxs")
    public List<CaptureFilterBean> effectVideoFxes;

    @JSONField(name = "faceshapes")
    public Map<String, Float> faceshapes;

    @JSONField(name = "fav")
    public int fav;

    @Nullable
    @JSONField(name = "h5_desc")
    public String h5Desc;

    @Nullable
    @JSONField(name = "hotval")
    public String hotval;

    @JSONField(name = "id")
    public int id;

    @Nullable
    @JSONField(name = "new")
    public String isNew;

    @Nullable
    @JSONField(name = "mtime")
    public String mtime;

    @Nullable
    @JSONField(name = "name")
    public String name;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    public int rank;

    @Nullable
    @JSONField(name = GameCardButton.extraParamSource)
    public int[] source;

    @JSONField(name = "splitbk_video")
    public String splitVideoUrl;

    @JSONField(name = "sub_type")
    public int[] subType;

    @Nullable
    @JSONField(name = "tags")
    public String[] tags;

    @Nullable
    @JSONField(name = "tip")
    public String tip;

    @Nullable
    @JSONField(name = "ref_topics")
    public List<CaptureStickerTopicBean> topicBeans;

    @JSONField(name = "voicefx")
    public String voiceFx;

    @JSONField(name = "coverface_show")
    public int showCoverSticker = 0;

    @JSONField(name = "coverface_val")
    public int isCoverStickerOn = 1;

    public boolean containsSource(int i7) {
        return p.a(i7, this.source);
    }

    public boolean containsSubType(int i7) {
        return p.a(i7, this.subType);
    }

    public int getSource() {
        int[] iArr = this.source;
        if (iArr == null || iArr.length < 1) {
            return -1;
        }
        if (containsSource(2)) {
            return 2;
        }
        if (containsSource(1)) {
            return 1;
        }
        if (containsSource(5)) {
            return 5;
        }
        return this.source[0];
    }

    public String toString() {
        return "CaptureStickerBeanV3{id=" + this.id + ", name='" + this.name + "', cover='" + this.cover + "', download='" + this.download + "', rank=" + this.rank + ", subType=" + Arrays.toString(this.subType) + ", tip='" + this.tip + "', ctime='" + this.ctime + "', mtime='" + this.mtime + "', isNew='" + this.isNew + "', tags=" + Arrays.toString(this.tags) + ", hotval='" + this.hotval + "', fav=" + this.fav + ", autoReplay=" + this.autoReplay + ", h5Desc='" + this.h5Desc + "', effectFilters=" + this.effectFilters + ", effectSurgerys=" + this.effectSurgerys + ", effectVideoFxes=" + this.effectVideoFxes + ", voiceFx='" + this.voiceFx + "', attachStickers=" + this.attachStickers + ", cueVideo='" + this.cueVideo + "', bgm=" + this.bgm + ", faceshapes=" + this.faceshapes + ", splitVideoUrl='" + this.splitVideoUrl + "', arType=" + this.arType + ", showCoverSticker=" + this.showCoverSticker + ", isCoverStickerOn=" + this.isCoverStickerOn + ", topicBeans=" + this.topicBeans + ", source=" + Arrays.toString(this.source) + '}';
    }
}
