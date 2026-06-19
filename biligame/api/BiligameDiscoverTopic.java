package com.bilibili.biligame.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDiscoverTopic.class */
@Keep
public class BiligameDiscoverTopic extends d {

    @JSONField(name = "av_id")
    public String avId;

    @JSONField(name = "background_color")
    public String backgroundColor;

    @JSONField(name = "bv_id")
    public String bvId;
    public String description;

    @JSONField(name = "font_color")
    public String fontColor;

    @JSONField(name = "game_count")
    public int gameCount;

    @JSONField(name = "game_list_style")
    public int gameListStyle;
    public String image;

    @JSONField(name = "immersion_cover_image")
    public String immersionImage;

    @JSONField(name = "publish_time")
    public String publishTime;
    public String title;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public String topicId;

    @JSONField(name = "url_path")
    public String urlPath;

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameDiscoverTopic)) {
            return false;
        }
        BiligameDiscoverTopic biligameDiscoverTopic = (BiligameDiscoverTopic) obj;
        if (!TextUtils.equals(this.topicId, biligameDiscoverTopic.topicId) || !TextUtils.equals(this.publishTime, biligameDiscoverTopic.publishTime)) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        String str = this.topicId;
        return str != null ? str.hashCode() : super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiligameDiscoverTopic{topicId='");
        sb.append(this.topicId);
        sb.append("', urlPath='");
        sb.append(this.urlPath);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', avId='");
        sb.append(this.avId);
        sb.append("', image='");
        sb.append(this.image);
        sb.append("', description='");
        sb.append(this.description);
        sb.append("', fontColor='");
        sb.append(this.fontColor);
        sb.append("', backgroundColor='");
        sb.append(this.backgroundColor);
        sb.append("', publishTime='");
        sb.append(this.publishTime);
        sb.append("', gameCount='");
        sb.append(this.gameCount);
        sb.append("', gameListStyle='");
        return C4277b.a(this.gameListStyle, "'}", sb);
    }
}
