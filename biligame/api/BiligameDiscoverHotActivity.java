package com.bilibili.biligame.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDiscoverHotActivity.class */
@Keep
public class BiligameDiscoverHotActivity extends d {

    @JSONField(name = "begin_time")
    public String beginTime;
    public String cover;

    @JSONField(name = "end_time")
    public String endTime;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "immersion_cover")
    public String immersionCover;
    public String link;
    public int status;
    public String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BiligameDiscoverHotActivity) {
            return TextUtils.equals(this.title, ((BiligameDiscoverHotActivity) obj).title);
        }
        return false;
    }

    public int getStatusBackgroundColor() {
        int i7 = this.status;
        if (i7 != 1) {
            return i7 != 2 ? 2131100574 : 2131100573;
        }
        return 2131100578;
    }

    public String getStatusText() {
        int i7 = this.status;
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? "" : "已结束" : "进行中" : "未开始";
    }

    public int hashCode() {
        String str = this.title;
        return str != null ? str.hashCode() : super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiligameDiscoverHotActivity{gameBaseId='");
        sb.append(this.gameBaseId);
        sb.append("', gameName='");
        sb.append(this.gameName);
        sb.append("', cover='");
        sb.append(this.cover);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', beginTime='");
        sb.append(this.beginTime);
        sb.append("', endTime='");
        sb.append(this.endTime);
        sb.append("', status='");
        sb.append(this.status);
        sb.append("', link='");
        return C8770a.a(sb, this.link, "'}");
    }
}
