package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBanner.class */
@Keep
public class BiligameBanner {
    public static final int TYPE_GAME = 1;
    public static final int TYPE_LINK = 0;
    public static final int TYPE_TOPIC = 2;

    @JSONField(name = "android_game_status")
    public int androidGameStatus;

    @JSONField(name = "banner_type")
    public int bannerType = 1;

    @JSONField(name = "beta_image")
    public String betaImage;

    @JSONField(name = "data_source")
    public int dataSource;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "image")
    public String image;

    @JSONField(name = "immersion_image")
    public String immersionImage;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "small_game_link")
    public String smallGameLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public long topicId;

    @JSONField(name = "url")
    public String url;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameBanner)) {
            return false;
        }
        BiligameBanner biligameBanner = (BiligameBanner) obj;
        if (this.bannerType != biligameBanner.bannerType || this.dataSource != biligameBanner.dataSource || (str = this.betaImage) == null || !str.equals(biligameBanner.betaImage) || !this.immersionImage.equals(biligameBanner.immersionImage)) {
            return false;
        }
        int i7 = this.bannerType;
        if (i7 == 2 && this.topicId == biligameBanner.topicId) {
            return true;
        }
        if (i7 == 1 && this.gameBaseId == biligameBanner.gameBaseId) {
            return true;
        }
        return i7 == 0 && (str2 = this.url) != null && str2.equals(biligameBanner.url);
    }
}
