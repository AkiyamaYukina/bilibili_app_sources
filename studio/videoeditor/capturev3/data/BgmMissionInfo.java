package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import g.C7207a;
import java.util.ArrayList;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BgmMissionInfo.class */
@Keep
public class BgmMissionInfo {
    public String category;
    public String cover;
    public long ctime;
    public ArrayList<DownloadResource> download_resource;
    public long duration;
    public long filesize;
    public long id;
    public long index;

    @JSONField(name = "markers_download_url")
    public String markPointDownloadUrl;
    public long mid;
    public String musicians;
    public String name;
    public String playurl;
    public long pubtime;
    public long recommend_point;
    public long sid;
    public String stat;
    public int state;
    public ArrayList<String> tags;
    public long tid;
    public ArrayList<TimelineBean> timeline;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BgmMissionInfo$DownloadResource.class */
    @Keep
    public static class DownloadResource {
        public static final String FORMAT_128 = "128k";
        public static final String FORMAT_64 = "64k";
        public static final String FORMAT_96 = "96k";
        public String music_format;
        public long sid;
        public String uri;

        public String toString() {
            StringBuilder sb = new StringBuilder("DownloadResource{sid=");
            sb.append(this.sid);
            sb.append(", uri='");
            sb.append(this.uri);
            sb.append("', music_format='");
            return C8770a.a(sb, this.music_format, "'}");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/BgmMissionInfo$TimelineBean.class */
    @Keep
    public static class TimelineBean {
        public String comment;
        public long point;
        public long recommend;

        public String toString() {
            StringBuilder sb = new StringBuilder("TimelineBean{point=");
            sb.append(this.point);
            sb.append(", comment='");
            sb.append(this.comment);
            sb.append("', recommend=");
            return C7207a.a(sb, this.recommend, '}');
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BgmMissionInfo{id=");
        sb.append(this.id);
        sb.append(", tid=");
        sb.append(this.tid);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', musicians='");
        sb.append(this.musicians);
        sb.append("', mid=");
        sb.append(this.mid);
        sb.append(", cover='");
        sb.append(this.cover);
        sb.append("', stat='");
        sb.append(this.stat);
        sb.append("', playurl='");
        sb.append(this.playurl);
        sb.append("', state=");
        sb.append(this.state);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", filesize=");
        sb.append(this.filesize);
        sb.append(", ctime=");
        sb.append(this.ctime);
        sb.append(", pubtime=");
        sb.append(this.pubtime);
        sb.append(", recommend_point=");
        sb.append(this.recommend_point);
        sb.append(", markPointDownloadUrl=");
        sb.append(this.markPointDownloadUrl);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", timeline=");
        sb.append(this.timeline);
        sb.append(", download_resource=");
        sb.append(this.download_resource);
        sb.append(", category='");
        return C8770a.a(sb, this.category, "'}");
    }
}
