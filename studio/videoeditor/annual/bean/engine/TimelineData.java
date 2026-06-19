package com.bilibili.studio.videoeditor.annual.bean.engine;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/TimelineData.class */
@Keep
public class TimelineData {
    private int mVideoHeight;
    private int mVideoWidth;
    private String storyboard;
    private final HashMap<String, String> mFontMap = new HashMap<>();
    private final ArrayList<ClipInfo> mVideoClipList = new ArrayList<>();
    private final ArrayList<ClipInfo> mPipVideoClipList = new ArrayList<>();
    private final ArrayList<VideoFxInfo> mTimelineVideoFxList = new ArrayList<>();
    private final ArrayList<CaptionInfo> mCaptionList = new ArrayList<>();
    private final ArrayList<TransitionInfo> mTransitionList = new ArrayList<>();
    private final ArrayList<MusicInfo> mMusicList = new ArrayList<>();

    public void addCaption(CaptionInfo captionInfo) {
        this.mCaptionList.add(captionInfo);
    }

    public void addMusic(MusicInfo musicInfo) {
        this.mMusicList.add(musicInfo);
    }

    public void addPipVideoClip(ClipInfo clipInfo) {
        this.mPipVideoClipList.add(clipInfo);
    }

    public void addTransition(TransitionInfo transitionInfo) {
        this.mTransitionList.add(transitionInfo);
    }

    public void addVideoClip(ClipInfo clipInfo) {
        this.mVideoClipList.add(clipInfo);
    }

    public void addVideoFx(VideoFxInfo videoFxInfo) {
        this.mTimelineVideoFxList.add(videoFxInfo);
    }

    public CaptionInfo getCaption(long j7, String str) {
        String str2;
        for (CaptionInfo captionInfo : this.mCaptionList) {
            if (captionInfo.pageId == j7 && (str2 = captionInfo.packagePath) != null && str2.equals(str)) {
                return captionInfo;
            }
        }
        return null;
    }

    public ArrayList<CaptionInfo> getCaptionList() {
        return this.mCaptionList;
    }

    public int getClipIndex(long j7) {
        int i7 = 0;
        while (i7 < this.mVideoClipList.size()) {
            ClipInfo clipInfo = this.mVideoClipList.get(i7);
            if (clipInfo.pageId == j7) {
                ClipInfo clipInfo2 = i7 < this.mVideoClipList.size() - 1 ? this.mVideoClipList.get(i7 + 1) : null;
                if (clipInfo2 == null) {
                    return -1;
                }
                if (clipInfo2.pageId - clipInfo.pageId == 1) {
                    return i7;
                }
            }
            i7++;
        }
        return -1;
    }

    public HashMap<String, String> getFontMap() {
        return this.mFontMap;
    }

    public ArrayList<MusicInfo> getMusicList() {
        return this.mMusicList;
    }

    public ArrayList<ClipInfo> getPipVideoClipList() {
        return this.mPipVideoClipList;
    }

    public String getStoryboard() {
        return this.storyboard;
    }

    public ArrayList<TransitionInfo> getTransitionList() {
        return this.mTransitionList;
    }

    public ArrayList<ClipInfo> getVideoClipList() {
        return this.mVideoClipList;
    }

    public ArrayList<VideoFxInfo> getVideoFxList() {
        return this.mTimelineVideoFxList;
    }

    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    public void putFont(String str, String str2) {
        this.mFontMap.put(str, str2);
    }

    public void setStoryboard(String str) {
        this.storyboard = str;
    }

    public void setVideoHeight(int i7) {
        this.mVideoHeight = i7;
    }

    public void setVideoWidth(int i7) {
        this.mVideoWidth = i7;
    }

    public String toString() {
        return "TimelineData{mVideoWidth=" + this.mVideoWidth + ", mVideoHeight=" + this.mVideoHeight + ", storyboard='" + this.storyboard + "', mFontMap=" + this.mFontMap + ", mVideoClipList=" + this.mVideoClipList + ", mPipVideoClipList=" + this.mPipVideoClipList + ", mTimelineVideoFxList=" + this.mTimelineVideoFxList + ", mCaptionList=" + this.mCaptionList + ", mTransitionList=" + this.mTransitionList + ", mMusicList=" + this.mMusicList + '}';
    }
}
