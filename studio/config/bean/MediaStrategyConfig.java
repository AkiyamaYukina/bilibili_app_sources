package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyConfig.class */
@Keep
public class MediaStrategyConfig {

    @JSONField(name = "all_num")
    private MediaStrategyAllTabConfig allTabConfig;

    @JSONField(name = "deduplication_strategy")
    private MediaStrategyDeduplicationConfig deduplicationStrategy;

    @JSONField(name = "entrance_limit_count")
    private int entranceLimitCount;

    @JSONField(name = "extract_frame")
    private MediaStrategyExtrmeConfig extractFrame;

    @JSONField(name = "festival")
    private List<MediaStrategyFestivalConfig> festivalList;

    @JSONField(name = "photo_num")
    private MediaStrategyMusicConfig imageConfig;

    @JSONField(name = "image_day_group_max_count")
    private int imageDayGroupMaxCount;

    @JSONField(name = "image_day_group_min_count")
    private int imageDayGroupMinCount;

    @JSONField(name = "final")
    private String imageDefaultLabel;

    @JSONField(name = "image_day_group_count")
    private int imageGroupCount;

    @JSONField(name = "default_text")
    private String intelligenceDefaultText;

    @JSONField(name = "gen_content")
    private String intelligenceLoadingContent;

    @JSONField(name = "gen_loading_time")
    private String intelligenceLoadingTime;

    @JSONField(name = "permission_text")
    private String intelligencePermissionText;

    @JSONField(name = "permission_title")
    private String intelligencePermissionTitle;

    @JSONField(name = "loading_time")
    private long lottieLoadingTime;

    @JSONField(name = "max_result_num")
    private Integer maxResultNum;

    @JSONField(name = "min_result_num")
    private Integer minResultNum;

    @JSONField(name = "long_video_duration")
    private long priorAnalysisVideoDuration;

    @JSONField(name = "server_side_strategy_timeout")
    private String serverSideStrategyTimeout;

    @JSONField(name = "skip_long_video_duration")
    private long skipLongVideoDuration;

    @JSONField(name = "smart_tpl_id")
    private long smartTplId;

    @JSONField(name = "strategy_calculate")
    private MediaStrategyCalculateConfig strategyCalculateConfig;

    @JSONField(name = "strategy_filter")
    private MediaStrategyFilterConfig strategyFilterConfig;

    @JSONField(name = "strategy_timeout")
    private long strategyTimeout;

    @JSONField(name = "tab_analysis_count")
    private MediaStrategyAnalysisCount tabAnalysisCount;

    @JSONField(name = "video_num")
    private MediaStrategyVideoConfig videoConfig;

    @JSONField(name = "week")
    private String weekendLabel;

    public MediaStrategyAllTabConfig getAllTabConfig() {
        return this.allTabConfig;
    }

    public MediaStrategyDeduplicationConfig getDeduplicationStrategy() {
        return this.deduplicationStrategy;
    }

    public int getEntranceLimitCount() {
        return this.entranceLimitCount;
    }

    public MediaStrategyExtrmeConfig getExtractFrame() {
        return this.extractFrame;
    }

    public List<MediaStrategyFestivalConfig> getFestivalList() {
        return this.festivalList;
    }

    public MediaStrategyMusicConfig getImageConfig() {
        return this.imageConfig;
    }

    public int getImageDayGroupMaxCount() {
        return this.imageDayGroupMaxCount;
    }

    public int getImageDayGroupMinCount() {
        return this.imageDayGroupMinCount;
    }

    public String getImageDefaultLabel() {
        return this.imageDefaultLabel;
    }

    public int getImageGroupCount() {
        return this.imageGroupCount;
    }

    public String getIntelligenceDefaultText() {
        return this.intelligenceDefaultText;
    }

    public String getIntelligenceLoadingContent() {
        return this.intelligenceLoadingContent;
    }

    public String getIntelligenceLoadingTime() {
        return this.intelligenceLoadingTime;
    }

    public String getIntelligencePermissionText() {
        return this.intelligencePermissionText;
    }

    public String getIntelligencePermissionTitle() {
        return this.intelligencePermissionTitle;
    }

    public long getLottieLoadingTime() {
        return this.lottieLoadingTime;
    }

    public Integer getMaxResultNum() {
        return this.maxResultNum;
    }

    public Integer getMinResultNum() {
        return this.minResultNum;
    }

    public long getPriorAnalysisVideoDuration() {
        return this.priorAnalysisVideoDuration;
    }

    public String getServerSideStrategyTimeout() {
        return this.serverSideStrategyTimeout;
    }

    public long getSkipLongVideoDuration() {
        return this.skipLongVideoDuration;
    }

    public long getSmartTplId() {
        return this.smartTplId;
    }

    public MediaStrategyCalculateConfig getStrategyCalculateConfig() {
        return this.strategyCalculateConfig;
    }

    public MediaStrategyFilterConfig getStrategyFilterConfig() {
        return this.strategyFilterConfig;
    }

    public long getStrategyTimeout() {
        return this.strategyTimeout;
    }

    public MediaStrategyAnalysisCount getTabAnalysisCount() {
        return this.tabAnalysisCount;
    }

    public MediaStrategyVideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public String getWeekendLabel() {
        return this.weekendLabel;
    }

    public void setAllTabConfig(MediaStrategyAllTabConfig mediaStrategyAllTabConfig) {
        this.allTabConfig = mediaStrategyAllTabConfig;
    }

    public void setDeduplicationStrategy(MediaStrategyDeduplicationConfig mediaStrategyDeduplicationConfig) {
        this.deduplicationStrategy = mediaStrategyDeduplicationConfig;
    }

    public void setEntranceLimitCount(int i7) {
        this.entranceLimitCount = i7;
    }

    public void setExtractFrame(MediaStrategyExtrmeConfig mediaStrategyExtrmeConfig) {
        this.extractFrame = mediaStrategyExtrmeConfig;
    }

    public void setFestivalList(List<MediaStrategyFestivalConfig> list) {
        this.festivalList = list;
    }

    public void setImageConfig(MediaStrategyMusicConfig mediaStrategyMusicConfig) {
        this.imageConfig = mediaStrategyMusicConfig;
    }

    public void setImageDayGroupMaxCount(int i7) {
        this.imageDayGroupMaxCount = i7;
    }

    public void setImageDayGroupMinCount(int i7) {
        this.imageDayGroupMinCount = i7;
    }

    public void setImageDefaultLabel(String str) {
        this.imageDefaultLabel = str;
    }

    public void setImageGroupCount(int i7) {
        this.imageGroupCount = i7;
    }

    public void setIntelligenceDefaultText(String str) {
        this.intelligenceDefaultText = str;
    }

    public void setIntelligenceLoadingContent(String str) {
        this.intelligenceLoadingContent = str;
    }

    public void setIntelligenceLoadingTime(String str) {
        this.intelligenceLoadingTime = str;
    }

    public void setIntelligencePermissionText(String str) {
        this.intelligencePermissionText = str;
    }

    public void setIntelligencePermissionTitle(String str) {
        this.intelligencePermissionTitle = str;
    }

    public void setLottieLoadingTime(long j7) {
        this.lottieLoadingTime = j7;
    }

    public void setMaxResultNum(Integer num) {
        this.maxResultNum = num;
    }

    public void setMinResultNum(Integer num) {
        this.minResultNum = num;
    }

    public void setPriorAnalysisVideoDuration(long j7) {
        this.priorAnalysisVideoDuration = j7;
    }

    public void setServerSideStrategyTimeout(String str) {
        this.serverSideStrategyTimeout = str;
    }

    public void setSkipLongVideoDuration(long j7) {
        this.skipLongVideoDuration = j7;
    }

    public void setSmartTplId(long j7) {
        this.smartTplId = j7;
    }

    public void setStrategyCalculateConfig(MediaStrategyCalculateConfig mediaStrategyCalculateConfig) {
        this.strategyCalculateConfig = mediaStrategyCalculateConfig;
    }

    public void setStrategyFilterConfig(MediaStrategyFilterConfig mediaStrategyFilterConfig) {
        this.strategyFilterConfig = mediaStrategyFilterConfig;
    }

    public void setStrategyTimeout(long j7) {
        this.strategyTimeout = j7;
    }

    public void setTabAnalysisCount(MediaStrategyAnalysisCount mediaStrategyAnalysisCount) {
        this.tabAnalysisCount = mediaStrategyAnalysisCount;
    }

    public void setVideoConfig(MediaStrategyVideoConfig mediaStrategyVideoConfig) {
        this.videoConfig = mediaStrategyVideoConfig;
    }

    public void setWeekendLabel(String str) {
        this.weekendLabel = str;
    }
}
