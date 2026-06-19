package com.bilibili.studio.editor.moudle.caption.tts.bean;

import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/tts/bean/TtsServerEntity.class */
@Keep
public class TtsServerEntity {
    public ArrayList<TtsServerBean> children;
    public long ctime;
    public int id;
    public String name;

    @JSONField(name = "new")
    public int newest;
    public int rank;
    public int type;
    private int white;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/tts/bean/TtsServerEntity$TtsServerBean.class */
    @Keep
    public static class TtsServerBean implements Serializable {
        public static final int DOWNLOADING = 1;
        public static final int DOWNLOADSUCCESS = 2;
        public String animation_cover;
        public int apply_for;
        public int bs;
        public String bs_cover;
        public String bs_file_url;
        public String bs_hash;
        public String bs_videopre_url;
        public String catId;
        public int cat_id;
        public String cover;
        public int ctime;
        public String download_url;
        public int fav;
        public int hot;
        public int hot_index;
        public int id;
        public int mtime;
        public String name;
        public String pop_preview_url;
        public int rank;
        public int speech_rate;
        public String static_cover;
        public int type;
        public String voice;
        public String tags = "";
        public int voice_type = 1;
        public int tabIndex = 0;
        public int downloadState = 1;
        public boolean isOriginalFilm = false;

        public String toString() {
            StringBuilder sb = new StringBuilder("TtsServerBean{id=");
            sb.append(this.id);
            sb.append(", name='");
            sb.append(this.name);
            sb.append("', cover='");
            sb.append(this.cover);
            sb.append("', animation_cover='");
            sb.append(this.animation_cover);
            sb.append("', static_cover='");
            sb.append(this.static_cover);
            sb.append("', download_url='");
            sb.append(this.download_url);
            sb.append("', rank=");
            sb.append(this.rank);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", ctime=");
            sb.append(this.ctime);
            sb.append(", mtime=");
            sb.append(this.mtime);
            sb.append(", tags='");
            sb.append(this.tags);
            sb.append("', hot=");
            sb.append(this.hot);
            sb.append(", hot_index=");
            sb.append(this.hot_index);
            sb.append(", bs=");
            sb.append(this.bs);
            sb.append(", bs_hash='");
            sb.append(this.bs_hash);
            sb.append("', bs_cover='");
            sb.append(this.bs_cover);
            sb.append("', bs_file_url='");
            sb.append(this.bs_file_url);
            sb.append("', bs_videopre_url='");
            sb.append(this.bs_videopre_url);
            sb.append("', fav=");
            sb.append(this.fav);
            sb.append(", apply_for=");
            sb.append(this.apply_for);
            sb.append(", voice='");
            sb.append(this.voice);
            sb.append("', speech_rate=");
            return C3269h.a(sb, this.speech_rate, '}');
        }
    }

    public String toString() {
        return "TtsServerTabBean{id=" + this.id + ", name='" + this.name + "', rank=" + this.rank + ", type=" + this.type + ", ctime=" + this.ctime + ", children=" + this.children + '}';
    }
}
