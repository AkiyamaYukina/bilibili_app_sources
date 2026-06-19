package com.bilibili.studio.videoeditor.capturev3.data;

import PB0.c;
import android.graphics.Point;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.util.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/VideoClipRecordInfo.class */
@Keep
public class VideoClipRecordInfo {
    private a mSubscriber;
    private List<VideoClip> mVideoClips = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/VideoClipRecordInfo$VideoClip.class */
    @Keep
    public static class VideoClip {
        private long mDuration;
        private long mDurationBySpeed;
        private boolean mFtPipPreviewFront;
        private boolean mIsHeadsetOn;
        private Point mMaterialStartPoint;
        private String mPath;
        private int mPosition;
        private int mScreenOrientation;
        private float mSpeed;
        private CaptureUsageInfo mUsageInfo;
        private int mVideoFrom;
        private String mVoiceFx;

        public VideoClip(String str, long j7, float f7, int i7, boolean z6, int i8, Point point, CaptureUsageInfo captureUsageInfo, int i9, String str2, boolean z7) {
            this.mPath = str;
            this.mDuration = j7;
            this.mSpeed = f7;
            this.mScreenOrientation = i7;
            this.mFtPipPreviewFront = z6;
            this.mPosition = i8;
            this.mDurationBySpeed = (long) (j7 / f7);
            this.mMaterialStartPoint = point;
            this.mUsageInfo = captureUsageInfo;
            this.mVideoFrom = i9;
            this.mVoiceFx = str2;
            this.mIsHeadsetOn = z7;
        }

        public CaptureUsageInfo getCaptureUsageInfo() {
            return this.mUsageInfo;
        }

        public long getDuration() {
            return this.mDuration;
        }

        public long getDurationBySpeed() {
            return this.mDurationBySpeed;
        }

        public boolean getFtPipPreviewFront() {
            return this.mFtPipPreviewFront;
        }

        public Point getMaterialStartPoint() {
            return this.mMaterialStartPoint;
        }

        public String getPath() {
            return this.mPath;
        }

        public int getPosition() {
            return this.mPosition;
        }

        public int getScreenOrientation() {
            return this.mScreenOrientation;
        }

        public float getSpeed() {
            return this.mSpeed;
        }

        public int getVideoFrom() {
            return this.mVideoFrom;
        }

        public String getVoiceFx() {
            return this.mVoiceFx;
        }

        public boolean isHeadsetOn() {
            return this.mIsHeadsetOn;
        }

        public void setHeadsetOn(boolean z6) {
            this.mIsHeadsetOn = z6;
        }

        public void setVideoFrom(int i7) {
            this.mVideoFrom = i7;
        }

        public void setVoiceFx(String str) {
            this.mVoiceFx = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/VideoClipRecordInfo$a.class */
    public interface a {
    }

    public void addClip(VideoClip videoClip) {
        this.mVideoClips.add(videoClip);
    }

    public void addClip(String str, long j7, float f7, int i7, boolean z6, int i8, Point point, CaptureUsageInfo captureUsageInfo, int i9, String str2, boolean z7) {
        this.mVideoClips.add(new VideoClip(str, j7, f7, i7, z6, i8, point, captureUsageInfo, i9, str2, z7));
    }

    public int getClipCount() {
        return this.mVideoClips.size();
    }

    public long getLastVideoLength() {
        if (getClipCount() <= 0) {
            return 0L;
        }
        return this.mVideoClips.get(getClipCount() - 1).getDurationBySpeed();
    }

    public long getTotalVideoLen() {
        List<VideoClip> list = this.mVideoClips;
        long durationBySpeed = 0;
        if (list == null) {
            return 0L;
        }
        Iterator<VideoClip> it = list.iterator();
        while (it.hasNext()) {
            durationBySpeed += it.next().getDurationBySpeed();
        }
        return durationBySpeed;
    }

    public List<VideoClip> getVideoClips() {
        return this.mVideoClips;
    }

    public boolean hasClip() {
        return this.mVideoClips.size() > 0;
    }

    public void removeAll(J j7) {
        while (this.mVideoClips.size() > 0) {
            String path = removeLast().getPath();
            if (!TextUtils.isEmpty(path) && !j7.b(path)) {
                c.a(path);
            }
        }
    }

    public VideoClip removeLast() {
        if (this.mVideoClips.size() <= 0) {
            return null;
        }
        List<VideoClip> list = this.mVideoClips;
        return list.remove(list.size() - 1);
    }

    public void setSubscriber(a aVar) {
        if (aVar != null) {
            throw null;
        }
    }
}
