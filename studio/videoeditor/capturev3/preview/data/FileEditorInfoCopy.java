package com.bilibili.studio.videoeditor.capturev3.preview.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/preview/data/FileEditorInfoCopy.class */
@Keep
public class FileEditorInfoCopy implements Serializable, Cloneable {
    public int audio_record;
    public String bgms;
    public int camera;
    public int camera_rotate;
    public String cooperates;
    public int countdown;
    public int cut;
    public String filters;
    public int flash;
    public String fonts;
    public String makeups;

    @JSONField(name = "pic_count")
    public int picCount;
    public String rhythms;
    public int rotate;
    public int speed;
    public int split;
    public String stickers;
    public String subtitles;
    public String themes;
    public String trans;

    @JSONField(name = "video_count")
    public int videoCount;

    @JSONField(name = "video_template")
    public String videoTemplate;
    public String videoup_stickers;

    public String toString() {
        StringBuilder sb = new StringBuilder("FileEditorInfoCopy{filters='");
        sb.append(this.filters);
        sb.append("', trans='");
        sb.append(this.trans);
        sb.append("', fonts='");
        sb.append(this.fonts);
        sb.append("', subtitles='");
        sb.append(this.subtitles);
        sb.append("', bgms='");
        sb.append(this.bgms);
        sb.append("', stickers='");
        sb.append(this.stickers);
        sb.append("', videoup_stickers='");
        sb.append(this.videoup_stickers);
        sb.append("', cooperates='");
        sb.append(this.cooperates);
        sb.append("', themes='");
        sb.append(this.themes);
        sb.append("', makeups='");
        sb.append(this.makeups);
        sb.append("', split=");
        sb.append(this.split);
        sb.append(", cut=");
        sb.append(this.cut);
        sb.append(", rotate=");
        sb.append(this.rotate);
        sb.append(", audio_record=");
        sb.append(this.audio_record);
        sb.append(", camera=");
        sb.append(this.camera);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", camera_rotate=");
        sb.append(this.camera_rotate);
        sb.append(", picCount=");
        sb.append(this.picCount);
        sb.append(", videoCount=");
        sb.append(this.videoCount);
        sb.append(", rhythms='");
        return C8770a.a(sb, this.rhythms, "'}");
    }
}
