package com.bilibili.montage.avutil;

import O4.c;
import android.graphics.Bitmap;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.timeline.MontageTimeline;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageVideoFrameRetriever.class */
public class MontageVideoFrameRetriever {
    private static final boolean HAS_EFFECT = true;
    public static final int VIDEO_FRAME_HEIGHT_GRADE_360 = 0;
    public static final int VIDEO_FRAME_HEIGHT_GRADE_480 = 1;
    public static final int VIDEO_FRAME_HEIGHT_GRADE_720 = 2;
    private static HashMap<Integer, Integer> mGradeToHeight;
    private MontageImageGrabber mImageGrabber;
    private String mPath;
    MontageTimeline mTimeline;

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        mGradeToHeight = map;
        map.put(0, 360);
        mGradeToHeight.put(1, Integer.valueOf(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND));
        mGradeToHeight.put(2, 720);
    }

    private MontageVideoFrameRetriever() {
        this.mImageGrabber = null;
        this.mTimeline = null;
    }

    public MontageVideoFrameRetriever(String str) {
        this.mImageGrabber = null;
        this.mTimeline = null;
        this.mPath = str;
        this.mTimeline = MontageTimelineHelper.createSingleVideoClipTimeline(str, -1);
    }

    public Bitmap getFrameAtTime(long j7) {
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(null, null);
        }
        return this.mImageGrabber.grabImageFromTimeline(this.mTimeline, j7, true, true, new MontageRational(1, 1));
    }

    public Bitmap getFrameAtTime(long j7, int i7) {
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(null, null);
        }
        MontageRational montageRational = new MontageRational(1, 1);
        if (mGradeToHeight.containsKey(Integer.valueOf(i7))) {
            montageRational.num = mGradeToHeight.get(Integer.valueOf(i7)).intValue();
            montageRational.den = this.mTimeline.getVideoRes().imageHeight;
        }
        return this.mImageGrabber.grabImageFromTimeline(this.mTimeline, j7, true, true, montageRational);
    }

    public Bitmap getFrameAtTimeWithCustomVideoFrameHeight(long j7, int i7) {
        if (this.mImageGrabber == null) {
            this.mImageGrabber = new MontageImageGrabber(null, null);
        }
        StringBuilder sbB = c.b(i7, j7, "getFrameAtTimeWithCustomVideoFrameHeight timeUs:", ", videoFrameHeight:");
        sbB.append(", mHasEffect:true");
        LogSinker.i("MontageVideoFrameRetriever", sbB.toString());
        return this.mImageGrabber.grabImageFromTimeline(this.mTimeline, j7, true, true, new MontageRational(i7, this.mTimeline.getVideoRes().imageHeight));
    }

    public void release() {
        MontageImageGrabber montageImageGrabber = this.mImageGrabber;
        if (montageImageGrabber != null) {
            montageImageGrabber.destroy();
        }
        this.mImageGrabber = null;
    }
}
