package com.bilibili.studio.videoeditor.capturev3.draft;

import android.graphics.Point;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureUsageInfo;
import com.bilibili.studio.videoeditor.capturev3.data.VideoClipRecordInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/draft/ClipBean.class */
@Keep
public class ClipBean {
    public int bizFrom;
    public long duration;
    public boolean fTPipPreviewFront;
    public String filePath;
    public boolean isHeadsetOn;
    public Point materialStartPoint;
    public int position;
    public int screenOrientation;
    public float speed;
    public CaptureUsageInfo usageInfo;
    public String voiceFx;

    public static VideoClipRecordInfo.VideoClip clipBean2videoClip(ClipBean clipBean) {
        return new VideoClipRecordInfo.VideoClip(clipBean.filePath, clipBean.duration, clipBean.speed, clipBean.screenOrientation, clipBean.fTPipPreviewFront, clipBean.position, clipBean.materialStartPoint, clipBean.usageInfo, clipBean.bizFrom, clipBean.voiceFx, clipBean.isHeadsetOn);
    }

    public static ClipBean videoClip2ClipBean(VideoClipRecordInfo.VideoClip videoClip) {
        ClipBean clipBean = new ClipBean();
        clipBean.filePath = videoClip.getPath();
        clipBean.duration = videoClip.getDuration();
        clipBean.speed = videoClip.getSpeed();
        clipBean.screenOrientation = videoClip.getScreenOrientation();
        clipBean.fTPipPreviewFront = videoClip.getFtPipPreviewFront();
        clipBean.position = videoClip.getPosition();
        clipBean.materialStartPoint = videoClip.getMaterialStartPoint();
        clipBean.usageInfo = videoClip.getCaptureUsageInfo();
        clipBean.bizFrom = videoClip.getVideoFrom();
        clipBean.voiceFx = videoClip.getVoiceFx();
        clipBean.isHeadsetOn = videoClip.isHeadsetOn();
        return clipBean;
    }
}
