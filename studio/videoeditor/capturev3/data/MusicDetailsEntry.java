package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/MusicDetailsEntry.class */
@Keep
public class MusicDetailsEntry {
    public long album_id;
    public String author;
    public String avid;
    public long coin_num;
    public long coinceiling;
    public int collect_count;
    public String cover_url;
    public long ctime;
    public String ctime_str;
    public long duration;
    public long fans;
    public long id;
    public String intro;
    public int isFromVideo;
    public boolean is_cacheable;
    public int is_collect;
    public int is_off;
    public long limit;
    public String limitdesc;
    public String lyric_url;
    public ArrayList<MenusResponesBean> menusRespones;
    public long mid;
    public Object pgc_info;
    public int play_count;
    public ArrayList<QualitiesBeanX> qualities;
    public Object region;
    public RelationDataBean relationData;
    public int reply_count;
    public long snum;
    public int songAttr;
    public String title;
    public String up_cert_info;
    public int up_cert_type;
    public ArrayList<UpHitAudiosBean> up_hit_audios;
    public String up_img;
    public int up_is_follow;
    public long up_mid;
    public String up_name;
    public ArrayList<?> videos;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/MusicDetailsEntry$MenusResponesBean.class */
    @Keep
    public static class MenusResponesBean {
        public String chnTieup;
        public String chnTitle;
        public int collectNum;
        public Object collected;
        public int commentNum;
        public String coverUrl;
        public long ctime;
        public String ctimeStr;
        public String face;
        public String intro;
        public int isOff;
        public String mbnames;
        public int menuAttr;
        public long menuId;
        public long patime;
        public long pbtime;
        public int playNum;
        public String schema;
        public int snum;
        public int songNum;
        public String title;
        public String toptitle;
        public int type;
        public long uid;
        public String uname;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/MusicDetailsEntry$QualitiesBean.class */
    @Keep
    public static class QualitiesBean {
        public String bps;
        public String desc;
        public int require;
        public String requiredesc;
        public int size;
        public String tag;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/MusicDetailsEntry$QualitiesBeanX.class */
    @Keep
    public static class QualitiesBeanX {
        public String bps;
        public String desc;
        public int require;
        public String requiredesc;
        public int size;
        public String tag;
        public int type;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/MusicDetailsEntry$RelationDataBean.class */
    @Keep
    public static class RelationDataBean {
        public ArrayList<String> cover;
        public String key;
        public String title;
        public long ttl;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/MusicDetailsEntry$UpHitAudiosBean.class */
    @Keep
    public static class UpHitAudiosBean {
        public String author;
        public String avid;
        public String cover;
        public long ctime;
        public String ctime_fmt;
        public long duration;
        public long id;
        public int is_off;
        public long limit;
        public String limitdesc;
        public int page;
        public Object payment;
        public int play_num;
        public ArrayList<QualitiesBean> qualities;
        public int reply_num;
        public String schema;
        public int song_attr;
        public String title;
        public long uid;
        public String uname;
    }
}
