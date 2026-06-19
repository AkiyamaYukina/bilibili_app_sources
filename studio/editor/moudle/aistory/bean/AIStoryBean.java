package com.bilibili.studio.editor.moudle.aistory.bean;

import Qw0.a;
import androidx.annotation.Keep;
import com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveCheckResult;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryBean.class */
@Keep
public final class AIStoryBean {

    @Nullable
    private String aiTaskId;

    @Nullable
    private a backupMaterial;
    private int bizFrom;

    @Nullable
    private CaptionInfo captionInfo;

    @Nullable
    private List<? extends CaptionInfo> captionInfoList;

    @Nullable
    private kC0.a editFxFilterItem;

    @Nullable
    private List<? extends EditStickerItem> editFxStickerList;

    @Nullable
    private String from;
    private int gptSentenceCount;
    private int gptWordCount;

    @Nullable
    private String jumpParams;

    @Nullable
    private Map<String, ? extends kC0.a> localFilter;

    @Nullable
    private Map<String, ? extends EditStickerItem> localSticker;

    @Nullable
    private List<? extends a> matchedMaterials;

    @Nullable
    private List<? extends a> materials;

    @Nullable
    private MusicInfo musicInfo;

    @Nullable
    private String relationFrom;

    @Nullable
    private SensitiveCheckResult sensitiveResult;

    @Nullable
    private List<String> sentences;

    @Nullable
    private ArrayList<BiliEditorStickerInfo> stickerInfoList;
    private int storyPlayType;

    @Nullable
    private Long styleId;

    @Nullable
    private String styleName;

    @Nullable
    private TransitionInfo transitionCross;

    @Nullable
    private TransitionInfo transitionInfo;

    @Nullable
    private Map<String, ? extends TransitionInfo> transitionInfoSection;

    @Nullable
    private Map<String, ? extends TransitionInfo> transitionInfoType;

    @Nullable
    private String ttsName;

    @Nullable
    private List<AIStoryTtsBean> ttsPathList;

    @Nullable
    private String ttsVoiceEngine;

    @Nullable
    private Map<String, ? extends a> videoHead;

    @Nullable
    private List<? extends a> videoMaterial;

    @Nullable
    private Map<String, ? extends a> videoTail;

    @Nullable
    private Long voiceId;

    @Nullable
    private String voiceName;

    @Nullable
    private String prompt = "";
    private boolean limitPrompt = true;

    @NotNull
    private String extraContent = "";

    @Nullable
    private String finalPrompt = "";

    @Nullable
    private String story = "";

    @Nullable
    private Integer speedRate = 0;
    private boolean isLongTts = true;
    private long playId = -1;

    @NotNull
    private String playName = "";

    @NotNull
    private String sdkEngine = "1";
    private boolean reportGenerate = true;

    @Nullable
    public final String getAiTaskId() {
        return this.aiTaskId;
    }

    @Nullable
    public final a getBackupMaterial() {
        return this.backupMaterial;
    }

    public final int getBizFrom() {
        return this.bizFrom;
    }

    @Nullable
    public final CaptionInfo getCaptionInfo() {
        return this.captionInfo;
    }

    @Nullable
    public final List<CaptionInfo> getCaptionInfoList() {
        return this.captionInfoList;
    }

    @Nullable
    public final kC0.a getEditFxFilterItem() {
        return this.editFxFilterItem;
    }

    @Nullable
    public final List<EditStickerItem> getEditFxStickerList() {
        return this.editFxStickerList;
    }

    @NotNull
    public final String getExtraContent() {
        return this.extraContent;
    }

    @Nullable
    public final String getFinalPrompt() {
        return this.finalPrompt;
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    public final int getGptSentenceCount() {
        return this.gptSentenceCount;
    }

    public final int getGptWordCount() {
        return this.gptWordCount;
    }

    @Nullable
    public final String getJumpParams() {
        return this.jumpParams;
    }

    public final boolean getLimitPrompt() {
        return this.limitPrompt;
    }

    @Nullable
    public final Map<String, kC0.a> getLocalFilter() {
        return this.localFilter;
    }

    @Nullable
    public final Map<String, EditStickerItem> getLocalSticker() {
        return this.localSticker;
    }

    @Nullable
    public final List<a> getMatchedMaterials() {
        return this.matchedMaterials;
    }

    @Nullable
    public final List<a> getMaterials() {
        return this.materials;
    }

    @Nullable
    public final MusicInfo getMusicInfo() {
        return this.musicInfo;
    }

    public final long getPlayId() {
        return this.playId;
    }

    @NotNull
    public final String getPlayName() {
        return this.playName;
    }

    @Nullable
    public final String getPrompt() {
        return this.prompt;
    }

    @Nullable
    public final String getRelationFrom() {
        return this.relationFrom;
    }

    public final boolean getReportGenerate() {
        return this.reportGenerate;
    }

    @NotNull
    public final String getSdkEngine() {
        return this.sdkEngine;
    }

    @Nullable
    public final SensitiveCheckResult getSensitiveResult() {
        return this.sensitiveResult;
    }

    @Nullable
    public final List<String> getSentences() {
        return this.sentences;
    }

    @Nullable
    public final Integer getSpeedRate() {
        return this.speedRate;
    }

    @Nullable
    public final ArrayList<BiliEditorStickerInfo> getStickerInfoList() {
        return this.stickerInfoList;
    }

    @Nullable
    public final String getStory() {
        return this.story;
    }

    public final int getStoryPlayType() {
        return this.storyPlayType;
    }

    @Nullable
    public final Long getStyleId() {
        return this.styleId;
    }

    @Nullable
    public final String getStyleName() {
        return this.styleName;
    }

    @Nullable
    public final TransitionInfo getTransitionCross() {
        return this.transitionCross;
    }

    @Nullable
    public final TransitionInfo getTransitionInfo() {
        return this.transitionInfo;
    }

    @Nullable
    public final Map<String, TransitionInfo> getTransitionInfoSection() {
        return this.transitionInfoSection;
    }

    @Nullable
    public final Map<String, TransitionInfo> getTransitionInfoType() {
        return this.transitionInfoType;
    }

    @Nullable
    public final String getTtsName() {
        return this.ttsName;
    }

    @Nullable
    public final List<AIStoryTtsBean> getTtsPathList() {
        return this.ttsPathList;
    }

    @Nullable
    public final String getTtsVoiceEngine() {
        return this.ttsVoiceEngine;
    }

    @Nullable
    public final Map<String, a> getVideoHead() {
        return this.videoHead;
    }

    @Nullable
    public final List<a> getVideoMaterial() {
        return this.videoMaterial;
    }

    @Nullable
    public final Map<String, a> getVideoTail() {
        return this.videoTail;
    }

    @Nullable
    public final Long getVoiceId() {
        return this.voiceId;
    }

    @Nullable
    public final String getVoiceName() {
        return this.voiceName;
    }

    public final boolean isLongTts() {
        return this.isLongTts;
    }

    public final void setAiTaskId(@Nullable String str) {
        this.aiTaskId = str;
    }

    public final void setBackupMaterial(@Nullable a aVar) {
        this.backupMaterial = aVar;
    }

    public final void setBizFrom(int i7) {
        this.bizFrom = i7;
    }

    public final void setCaptionInfo(@Nullable CaptionInfo captionInfo) {
        this.captionInfo = captionInfo;
    }

    public final void setCaptionInfoList(@Nullable List<? extends CaptionInfo> list) {
        this.captionInfoList = list;
    }

    public final void setEditFxFilterItem(@Nullable kC0.a aVar) {
        this.editFxFilterItem = aVar;
    }

    public final void setEditFxStickerList(@Nullable List<? extends EditStickerItem> list) {
        this.editFxStickerList = list;
    }

    public final void setExtraContent(@NotNull String str) {
        this.extraContent = str;
    }

    public final void setFinalPrompt(@Nullable String str) {
        this.finalPrompt = str;
    }

    public final void setFrom(@Nullable String str) {
        this.from = str;
    }

    public final void setGptSentenceCount(int i7) {
        this.gptSentenceCount = i7;
    }

    public final void setGptWordCount(int i7) {
        this.gptWordCount = i7;
    }

    public final void setJumpParams(@Nullable String str) {
        this.jumpParams = str;
    }

    public final void setLimitPrompt(boolean z6) {
        this.limitPrompt = z6;
    }

    public final void setLocalFilter(@Nullable Map<String, ? extends kC0.a> map) {
        this.localFilter = map;
    }

    public final void setLocalSticker(@Nullable Map<String, ? extends EditStickerItem> map) {
        this.localSticker = map;
    }

    public final void setLongTts(boolean z6) {
        this.isLongTts = z6;
    }

    public final void setMatchedMaterials(@Nullable List<? extends a> list) {
        this.matchedMaterials = list;
    }

    public final void setMaterials(@Nullable List<? extends a> list) {
        this.materials = list;
    }

    public final void setMusicInfo(@Nullable MusicInfo musicInfo) {
        this.musicInfo = musicInfo;
    }

    public final void setPlayId(long j7) {
        this.playId = j7;
    }

    public final void setPlayName(@NotNull String str) {
        this.playName = str;
    }

    public final void setPrompt(@Nullable String str) {
        this.prompt = str;
    }

    public final void setRelationFrom(@Nullable String str) {
        this.relationFrom = str;
    }

    public final void setReportGenerate(boolean z6) {
        this.reportGenerate = z6;
    }

    public final void setSdkEngine(@NotNull String str) {
        this.sdkEngine = str;
    }

    public final void setSensitiveResult(@Nullable SensitiveCheckResult sensitiveCheckResult) {
        this.sensitiveResult = sensitiveCheckResult;
    }

    public final void setSentences(@Nullable List<String> list) {
        this.sentences = list;
    }

    public final void setSpeedRate(@Nullable Integer num) {
        this.speedRate = num;
    }

    public final void setStickerInfoList(@Nullable ArrayList<BiliEditorStickerInfo> arrayList) {
        this.stickerInfoList = arrayList;
    }

    public final void setStory(@Nullable String str) {
        this.story = str;
    }

    public final void setStoryPlayType(int i7) {
        this.storyPlayType = i7;
    }

    public final void setStyleId(@Nullable Long l7) {
        this.styleId = l7;
    }

    public final void setStyleName(@Nullable String str) {
        this.styleName = str;
    }

    public final void setTransitionCross(@Nullable TransitionInfo transitionInfo) {
        this.transitionCross = transitionInfo;
    }

    public final void setTransitionInfo(@Nullable TransitionInfo transitionInfo) {
        this.transitionInfo = transitionInfo;
    }

    public final void setTransitionInfoSection(@Nullable Map<String, ? extends TransitionInfo> map) {
        this.transitionInfoSection = map;
    }

    public final void setTransitionInfoType(@Nullable Map<String, ? extends TransitionInfo> map) {
        this.transitionInfoType = map;
    }

    public final void setTtsName(@Nullable String str) {
        this.ttsName = str;
    }

    public final void setTtsPathList(@Nullable List<AIStoryTtsBean> list) {
        this.ttsPathList = list;
    }

    public final void setTtsVoiceEngine(@Nullable String str) {
        this.ttsVoiceEngine = str;
    }

    public final void setVideoHead(@Nullable Map<String, ? extends a> map) {
        this.videoHead = map;
    }

    public final void setVideoMaterial(@Nullable List<? extends a> list) {
        this.videoMaterial = list;
    }

    public final void setVideoTail(@Nullable Map<String, ? extends a> map) {
        this.videoTail = map;
    }

    public final void setVoiceId(@Nullable Long l7) {
        this.voiceId = l7;
    }

    public final void setVoiceName(@Nullable String str) {
        this.voiceName = str;
    }
}
