package com.bilibili.studio.videoeditor.bean;

import O4.a;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import com.bilibili.studio.videoeditor.extension.b;
import com.bilibili.studio.videoeditor.nvsstreaming.AudioClipInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BMusic.class */
@Keep
public class BMusic extends AudioClipInfo implements Serializable, Cloneable, Comparable<BMusic> {

    @Nullable
    public Bgm bgm;
    public long bgmSid;
    public long createTime;
    public String downloadHintMsg;
    public String flag;
    public long initInPoint;
    public long initOutPoint;
    public IntelligenceMusicInfo.MusicMarker musicMarker;
    public String musicName;
    public String musicTypeName;
    public int sourceType;
    public long totalTime;
    public float ratioMusic = 1.0f;
    public long fadeInValue = 0;
    public long fadeOutValue = getFadeOutValue();
    public boolean isLocalMusic = false;
    public boolean isSelectedByUser = false;
    public boolean isBindByTemplate = false;
    public int loopState = 0;
    public String trackFlag = System.currentTimeMillis() + "";

    public static BMusic duplicate(BMusic bMusic) {
        BMusic bMusic2 = new BMusic();
        bMusic2.update(bMusic);
        return bMusic2;
    }

    private int getFadeOutValue() {
        return 0;
    }

    public void clear() {
        this.bgm = null;
        this.bgmSid = 0L;
        this.localPath = "";
        this.musicName = "";
        this.musicTypeName = "";
        this.sourceType = 0;
        this.ratioMusic = 1.0f;
        this.inPoint = 0L;
        this.outPoint = 0L;
        this.trimIn = 0L;
        this.trimOut = 0L;
        this.totalTime = 0L;
        this.downloadHintMsg = "";
        this.fadeIn = false;
        this.fadeInValue = 0L;
        this.fadeOut = true;
        this.fadeOutValue = getFadeOutValue();
        this.isBindByTemplate = false;
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    /* JADX INFO: renamed from: clone */
    public BMusic mo9886clone() {
        IntelligenceMusicInfo.MusicMarker musicMarker;
        Bgm bgm;
        try {
            BMusic bMusic = (BMusic) super.mo9886clone();
            if (bMusic != null && (bgm = this.bgm) != null) {
                bMusic.bgm = bgm.m10406clone();
            }
            if (bMusic != null && (musicMarker = this.musicMarker) != null) {
                bMusic.musicMarker = musicMarker.m10097clone();
            }
            return bMusic;
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(BMusic bMusic) {
        return (int) ((this.createTime - bMusic.createTime) / 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equalsIgnoreTime(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.bean.BMusic.equalsIgnoreTime(java.lang.Object):boolean");
    }

    @Override // com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    public String toString() {
        StringBuilder sb = new StringBuilder("BMusic{, bgmSid=");
        sb.append(this.bgmSid);
        sb.append(", localPath='");
        sb.append(this.localPath);
        sb.append("', musicName='");
        sb.append(this.musicName);
        sb.append("', musicTypeName='");
        sb.append(this.musicTypeName);
        sb.append("', sourceType=");
        sb.append(this.sourceType);
        sb.append(", ratioMusic=");
        sb.append(this.ratioMusic);
        sb.append(", inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        sb.append(this.trimOut);
        sb.append(", totalTime=");
        sb.append(this.totalTime);
        sb.append(", downloadHintMsg='");
        sb.append(this.downloadHintMsg);
        sb.append("', fadeIn=");
        sb.append(this.fadeIn);
        sb.append(", fadeInValue=");
        sb.append(this.fadeInValue);
        sb.append(", fadeOut=");
        sb.append(this.fadeOut);
        sb.append(", fadeOutValue=");
        sb.append(this.fadeOutValue);
        sb.append(", isBindByTemplate=");
        return a.b(sb, this.isBindByTemplate, '}');
    }

    public void update(BMusic bMusic) {
        this.bgm = bMusic.bgm;
        this.localPath = bMusic.localPath;
        this.musicName = bMusic.musicName;
        this.musicTypeName = bMusic.musicTypeName;
        this.ratioMusic = bMusic.ratioMusic;
        this.inPoint = bMusic.inPoint;
        this.outPoint = bMusic.outPoint;
        this.trimIn = bMusic.trimIn;
        this.trimOut = bMusic.trimOut;
        this.totalTime = bMusic.totalTime;
        this.bgmSid = bMusic.bgmSid;
        this.downloadHintMsg = bMusic.downloadHintMsg;
        this.fadeIn = bMusic.fadeIn;
        this.fadeInValue = bMusic.fadeInValue;
        this.fadeOut = bMusic.fadeOut;
        this.fadeOutValue = bMusic.fadeOutValue;
        this.isLocalMusic = bMusic.isLocalMusic;
        this.createTime = bMusic.createTime;
        this.musicMarker = bMusic.musicMarker;
        this.isSelectedByUser = bMusic.isSelectedByUser;
        this.isBindByTemplate = bMusic.isBindByTemplate;
    }

    public void updateBgm(BgmMissionInfo bgmMissionInfo) {
        Bgm bgm = new Bgm(bgmMissionInfo.sid, bgmMissionInfo.name, bgmMissionInfo.playurl);
        this.bgm = bgm;
        bgm.id = bgmMissionInfo.id;
        bgm.duration = bgmMissionInfo.duration;
        bgm.index = (int) bgmMissionInfo.index;
        bgm.musicians = bgmMissionInfo.musicians;
        bgm.mid = bgmMissionInfo.mid;
        bgm.cover = bgmMissionInfo.cover;
        bgm.state = bgmMissionInfo.state;
        bgm.filesize = bgmMissionInfo.filesize;
        bgm.ctime = bgmMissionInfo.ctime;
        bgm.pubtime = bgmMissionInfo.pubtime;
        bgm.recommend_point = bgmMissionInfo.recommend_point;
        b.a(bgmMissionInfo, bgm);
    }
}
