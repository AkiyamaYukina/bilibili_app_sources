package com.bilibili.playset.playlist.entity;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/entity/MediaId.class */
@Keep
public class MediaId {

    @JSONField(name = "bv_id")
    public String bvid;
    public long id;
    public int type;

    public MediaId() {
    }

    public MediaId(long j7, String str) {
        this.id = j7;
        this.bvid = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaId mediaId = (MediaId) obj;
        boolean z6 = true;
        if (this.id != mediaId.id) {
            z6 = this.bvid.equals(mediaId.bvid) && !TextUtils.isEmpty(this.bvid);
        }
        return z6;
    }

    public int hashCode() {
        return (int) ((this.id * 31) + ((long) this.type));
    }

    public String toString() {
        return this.id + ":" + this.type;
    }
}
