package com.bilibili.montage.avutil;

import com.bilibili.montage.avinfo.MontageAudioResolution;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageSize;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.timeline.MontageTimeline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageTimelineHelper.class */
public class MontageTimelineHelper {
    private static final int MAX_CUSTOM_HEIGHT = 3840;
    private static final String TAG = "MontageTimelineHelper";

    public static MontageTimeline createSingleVideoClipTimeline(String str, int i7) {
        int i8;
        int i9;
        MontageParseFile montageParseFile = new MontageParseFile();
        MontageSize videoSize = montageParseFile.getVideoSize(str);
        int videoStreamRotation = montageParseFile.getVideoStreamRotation(str);
        if (videoStreamRotation == 1 || videoStreamRotation == 3) {
            int i10 = videoSize.width;
            videoSize.width = videoSize.height;
            videoSize.height = i10;
        }
        MontageAudioResolution montageAudioResolution = new MontageAudioResolution();
        MontageRational videoFrameRate = montageParseFile.getVideoFrameRate(str);
        if (videoFrameRate.num <= 0 || videoFrameRate.den <= 0) {
            videoFrameRate.num = 30;
            videoFrameRate.den = 1;
        }
        float f7 = (i7 <= 0 || (i9 = videoSize.height) <= 0) ? (i7 > 0 || (i8 = videoSize.height) < MAX_CUSTOM_HEIGHT) ? 1.0f : 3840.0f / i8 : i7 / i9;
        MontageTimeline montageTimelineCreateTimeline = MontageTimeline.createTimeline(new MontageVideoResolution((int) Math.ceil(videoSize.width * f7), (int) Math.ceil(videoSize.height * f7)), videoFrameRate, montageAudioResolution, 0);
        montageTimelineCreateTimeline.appendVideoTrack().appendClip(str);
        return montageTimelineCreateTimeline;
    }
}
