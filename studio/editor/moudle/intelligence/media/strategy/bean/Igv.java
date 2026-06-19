package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import O4.c;
import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.media3.exoplayer.C4690e;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/Igv.class */
@Keep
public interface Igv {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/Igv$ContentText.class */
    @Keep
    public static final class ContentText {
        private long id;

        @Nullable
        private String subtitle;

        @Nullable
        private String title;

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setSubtitle(@Nullable String str) {
            this.subtitle = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/Igv$FilterCondition.class */
    @Keep
    public static final class FilterCondition {

        @JSONField(name = "resource_date_range")
        @Nullable
        private ResourceDateRange resourceDateRange;

        @JSONField(name = "resource_type")
        private int resourceType;

        @JSONField(name = "since_now_days")
        private int sinceNowDays;

        @Nullable
        private String source;

        @JSONField(name = "video_duration_range")
        @Nullable
        private Range videoDurationRange;

        @JSONField(name = "is_weekend")
        private int weekend;

        @Nullable
        public final ResourceDateRange getResourceDateRange() {
            return this.resourceDateRange;
        }

        public final int getResourceType() {
            return this.resourceType;
        }

        public final int getSinceNowDays() {
            return this.sinceNowDays;
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }

        @Nullable
        public final Range getVideoDurationRange() {
            return this.videoDurationRange;
        }

        public final int getWeekend() {
            return this.weekend;
        }

        public final void setResourceDateRange(@Nullable ResourceDateRange resourceDateRange) {
            this.resourceDateRange = resourceDateRange;
        }

        public final void setResourceType(int i7) {
            this.resourceType = i7;
        }

        public final void setSinceNowDays(int i7) {
            this.sinceNowDays = i7;
        }

        public final void setSource(@Nullable String str) {
            this.source = str;
        }

        public final void setVideoDurationRange(@Nullable Range range) {
            this.videoDurationRange = range;
        }

        public final void setWeekend(int i7) {
            this.weekend = i7;
        }

        @NotNull
        public String toString() {
            int i7 = this.weekend;
            ResourceDateRange resourceDateRange = this.resourceDateRange;
            int i8 = this.resourceType;
            int i9 = this.sinceNowDays;
            String str = this.source;
            Range range = this.videoDurationRange;
            StringBuilder sb = new StringBuilder("FilterCondition(isWeekend=");
            sb.append(i7);
            sb.append(", resourceDateRange=");
            sb.append(resourceDateRange);
            sb.append(", resourceType=");
            C4690e.a(i8, i9, ", sinceNowDays=", ", source=", sb);
            sb.append(str);
            sb.append(", videoDurationRange=");
            sb.append(range);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/Igv$GroupCondition.class */
    @Keep
    public static final class GroupCondition {
        private long distance;

        @Nullable
        private Range duration;

        @JSONField(name = "image_num")
        @Nullable
        private Range imageNum;

        @JSONField(name = "interval_day")
        private int intervalDay;

        @JSONField(name = "video_num")
        @Nullable
        private Range videoNum;

        public final long getDistance() {
            return this.distance;
        }

        @Nullable
        public final Range getDuration() {
            return this.duration;
        }

        @Nullable
        public final Range getImageNum() {
            return this.imageNum;
        }

        public final int getIntervalDay() {
            return this.intervalDay;
        }

        @Nullable
        public final Range getVideoNum() {
            return this.videoNum;
        }

        public final void setDistance(long j7) {
            this.distance = j7;
        }

        public final void setDuration(@Nullable Range range) {
            this.duration = range;
        }

        public final void setImageNum(@Nullable Range range) {
            this.imageNum = range;
        }

        public final void setIntervalDay(int i7) {
            this.intervalDay = i7;
        }

        public final void setVideoNum(@Nullable Range range) {
            this.videoNum = range;
        }

        @NotNull
        public String toString() {
            long j7 = this.distance;
            int i7 = this.intervalDay;
            Range range = this.duration;
            Range range2 = this.imageNum;
            Range range3 = this.videoNum;
            StringBuilder sbB = c.b(i7, j7, "GroupCondition(distance=", ", intervalDay=");
            sbB.append(", duration=");
            sbB.append(range);
            sbB.append(", imageNum=");
            sbB.append(range2);
            sbB.append(", videoNum=");
            sbB.append(range3);
            sbB.append(")");
            return sbB.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/Igv$Range.class */
    @Keep
    public static final class Range {
        private long max;
        private long min;

        public final long getMax() {
            return this.max;
        }

        public final long getMin() {
            return this.min;
        }

        public final void setMax(long j7) {
            this.max = j7;
        }

        public final void setMin(long j7) {
            this.min = j7;
        }

        @NotNull
        public String toString() {
            long j7 = this.max;
            return android.support.v4.media.session.a.a(z.a(j7, "Range(max=", ", min="), this.min, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/Igv$ResourceDateRange.class */
    @Keep
    public static final class ResourceDateRange {

        @JSONField(name = "end_time")
        private long endTime;

        @JSONField(name = "start_time")
        private long startTime;

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final void setEndTime(long j7) {
            this.endTime = j7;
        }

        public final void setStartTime(long j7) {
            this.startTime = j7;
        }

        @NotNull
        public String toString() {
            long j7 = this.endTime;
            return android.support.v4.media.session.a.a(z.a(j7, "ResourceDateRange(endTime=", ", startTime="), this.startTime, ")");
        }
    }

    @Nullable
    String getContentNameX();

    @Nullable
    FilterCondition getFilterConditionX();

    @Nullable
    GroupCondition getGroupConditionX();

    @Nullable
    String getPeopleIdX();

    long getResourceIdX();

    @NotNull
    String getResourceType();

    long getStrategyIdX();

    @Nullable
    String getStrategyNameX();

    @Nullable
    String getStrategyTypeX();

    @Nullable
    String getTemplateIdX();

    @Nullable
    List<ContentText> getTextListX();

    long getTopicIdX();

    long getWeightX();

    boolean isAbChild();
}
