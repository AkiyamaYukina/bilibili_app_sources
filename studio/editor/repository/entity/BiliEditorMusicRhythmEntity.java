package com.bilibili.studio.editor.repository.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmEntity.class */
@Keep
public final class BiliEditorMusicRhythmEntity implements Serializable {
    private int defaultSourceTab;

    @Nullable
    private String dirPath;

    @Nullable
    private HashMap<String, String> endingVideo;
    private long endingVideoDuration;

    @Nullable
    private String endingVideoTrans;

    @Nullable
    private String endingVideoTransitionName;

    @Nullable
    private String endingVideoTransitionPackageId;

    @Nullable
    private ArrayList<BiliEditorMusicRhythmFilter> filter;

    @Nullable
    private String id;
    private int maxCount;
    private int minCount;

    @JSONField(name = CaptureSchema.MISSION_ID)
    private long missionId;

    @JSONField(name = CaptureSchema.MISSION_NAME)
    @Nullable
    private String missionName;

    @Nullable
    private String msInstalledId;

    @Nullable
    private ArrayList<BiliEditorMusicRhythmMusic> music;

    @Nullable
    private String name;

    @Nullable
    private ArrayList<BiliEditorMusicRhythmSticker> stickers;

    @Nullable
    private String tags;

    @Nullable
    private HashMap<String, String> titleVideo;
    private long titleVideoDuration;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    private long topicId;

    @JSONField(name = CaptureSchema.TOPIC_NAME)
    @Nullable
    private String topicName;
    private long videoClipDuration;

    @Nullable
    private ArrayList<BiliEditorMusicRhythmWords> words;

    @NotNull
    private ArrayList<BiliEditorMusicRhythmVideoClip> videoClips = new ArrayList<>();
    private boolean needAdaptation = true;

    public final int getDefaultSourceTab() {
        return this.defaultSourceTab;
    }

    @Nullable
    public final String getDirPath() {
        return this.dirPath;
    }

    @Nullable
    public final HashMap<String, String> getEndingVideo() {
        return this.endingVideo;
    }

    public final long getEndingVideoDuration() {
        return this.endingVideoDuration;
    }

    @Nullable
    public final String getEndingVideoTrans() {
        return this.endingVideoTrans;
    }

    @Nullable
    public final String getEndingVideoTransitionName() {
        return this.endingVideoTransitionName;
    }

    @Nullable
    public final String getEndingVideoTransitionPackageId() {
        return this.endingVideoTransitionPackageId;
    }

    @Nullable
    public final ArrayList<BiliEditorMusicRhythmFilter> getFilter() {
        return this.filter;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    public final long getMissionId() {
        return this.missionId;
    }

    @Nullable
    public final String getMissionName() {
        return this.missionName;
    }

    @Nullable
    public final String getMsInstalledId() {
        return this.msInstalledId;
    }

    @Nullable
    public final ArrayList<BiliEditorMusicRhythmMusic> getMusic() {
        return this.music;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getNeedAdaptation() {
        return this.needAdaptation;
    }

    @Nullable
    public final ArrayList<BiliEditorMusicRhythmSticker> getStickers() {
        return this.stickers;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    @Nullable
    public final HashMap<String, String> getTitleVideo() {
        return this.titleVideo;
    }

    public final long getTitleVideoDuration() {
        return this.titleVideoDuration;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @Nullable
    public final String getTopicName() {
        return this.topicName;
    }

    public final long getVideoClipDuration() {
        return this.videoClipDuration;
    }

    @NotNull
    public final ArrayList<BiliEditorMusicRhythmVideoClip> getVideoClips() {
        return this.videoClips;
    }

    @Nullable
    public final ArrayList<BiliEditorMusicRhythmWords> getWords() {
        return this.words;
    }

    public final void setDefaultSourceTab(int i7) {
        this.defaultSourceTab = i7;
    }

    public final void setDirPath(@Nullable String str) {
        this.dirPath = str;
    }

    public final void setEndingVideo(@Nullable HashMap<String, String> map) {
        this.endingVideo = map;
    }

    public final void setEndingVideoDuration(long j7) {
        this.endingVideoDuration = j7;
    }

    public final void setEndingVideoTrans(@Nullable String str) {
        this.endingVideoTrans = str;
    }

    public final void setEndingVideoTransitionName(@Nullable String str) {
        this.endingVideoTransitionName = str;
    }

    public final void setEndingVideoTransitionPackageId(@Nullable String str) {
        this.endingVideoTransitionPackageId = str;
    }

    public final void setFilter(@Nullable ArrayList<BiliEditorMusicRhythmFilter> arrayList) {
        this.filter = arrayList;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMaxCount(int i7) {
        this.maxCount = i7;
    }

    public final void setMinCount(int i7) {
        this.minCount = i7;
    }

    public final void setMissionId(long j7) {
        this.missionId = j7;
    }

    public final void setMissionName(@Nullable String str) {
        this.missionName = str;
    }

    public final void setMsInstalledId(@Nullable String str) {
        this.msInstalledId = str;
    }

    public final void setMusic(@Nullable ArrayList<BiliEditorMusicRhythmMusic> arrayList) {
        this.music = arrayList;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNeedAdaptation(boolean z6) {
        this.needAdaptation = z6;
    }

    public final void setStickers(@Nullable ArrayList<BiliEditorMusicRhythmSticker> arrayList) {
        this.stickers = arrayList;
    }

    public final void setTags(@Nullable String str) {
        this.tags = str;
    }

    public final void setTitleVideo(@Nullable HashMap<String, String> map) {
        this.titleVideo = map;
    }

    public final void setTitleVideoDuration(long j7) {
        this.titleVideoDuration = j7;
    }

    public final void setTopicId(long j7) {
        this.topicId = j7;
    }

    public final void setTopicName(@Nullable String str) {
        this.topicName = str;
    }

    public final void setVideoClipDuration(long j7) {
        this.videoClipDuration = j7;
    }

    public final void setVideoClips(@NotNull ArrayList<BiliEditorMusicRhythmVideoClip> arrayList) {
        this.videoClips = arrayList;
    }

    public final void setWords(@Nullable ArrayList<BiliEditorMusicRhythmWords> arrayList) {
        this.words = arrayList;
    }
}
