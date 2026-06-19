package com.bilibili.studio.editor.moudle.intelligence.frame.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.sdk.app.PayTask;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig.class */
@Keep
public class AiFrameConfig {

    @JSONField(name = "album_rec_config")
    public AlbumRecConfig albumRecConfig;

    @JSONField(name = "cache_config")
    public CacheConfig cacheConfig;

    @JSONField(name = "edit_rec_config")
    public EditorAiRecConfig editorAiRecConfig;

    @JSONField(name = "fast_config")
    public FastConfig fastConfig;

    @JSONField(name = "intelligence_config")
    public IntelligenceFrameConfig intelligenceConfig;

    @JSONField(name = "silence_config")
    public SilenceConfig silenceConfig;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig$AlbumRecConfig.class */
    @Keep
    public static class AlbumRecConfig {

        @JSONField(name = "video_divider_duration")
        public long videoDividerDuration = 120000;

        @JSONField(name = "less_frame_count")
        public int lessFrameCount = 3;

        @JSONField(name = "more_frame_count")
        public int moreFrameCount = 7;

        @JSONField(name = "min_frame_interval")
        public long minFrameInterval = 1000;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig$CacheConfig.class */
    @Keep
    public static class CacheConfig {

        @JSONField(name = "cache_size")
        public long cacheSize = 100;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig$EditorAiRecConfig.class */
    @Keep
    public static class EditorAiRecConfig {

        @JSONField(name = "total_frame_count")
        public int totalFrameCount = 63;

        @JSONField(name = "single_frame_count")
        public int materialFrameCount = 15;

        @JSONField(name = "upload_frame_count")
        public int uploadFrameCount = 10;

        @JSONField(name = "min_frame_interval")
        public long minFrameInterval = 1000;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig$FastConfig.class */
    @Keep
    public static class FastConfig {

        @JSONField(name = "single_frame_count")
        public int materialFrameCount = 15;

        @JSONField(name = "min_frame_interval")
        public long minFrameInterval = 1000;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig$IntelligenceFrameConfig.class */
    @Keep
    public static class IntelligenceFrameConfig {

        @JSONField(name = "frame_wait_time")
        public long frameWaitTime = PayTask.f60018j;

        @JSONField(name = "total_frame_count")
        public int totalFrameCount = 20;

        @JSONField(name = "single_frame_count")
        public int materialFrameCount = 15;

        @JSONField(name = "min_frame_interval")
        public long minFrameInterval = 1000;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/AiFrameConfig$SilenceConfig.class */
    @Keep
    public static class SilenceConfig {

        @JSONField(name = "single_frame_count")
        public int materialFrameCount = 15;

        @JSONField(name = "total_file_count")
        public int totalMaterialCount = 80;

        @JSONField(name = "min_frame_interval")
        public long minFrameInterval = 1000;
    }
}
