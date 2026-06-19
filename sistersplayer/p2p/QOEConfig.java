package com.bilibili.sistersplayer.p2p;

import androidx.annotation.Keep;
import androidx.compose.material3.ProgressIndicatorKt;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.sdk.app.PayTask;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/QOEConfig.class */
@Keep
public final class QOEConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "QOEConfig";

    @JSONField(name = "resolution_priority")
    private boolean resolutionPriority;

    @JSONField(name = "seek_down_shift")
    private boolean seekDownShift;

    @JSONField(name = "auto_switch")
    private boolean autoSwitch = true;

    @JSONField(name = "enable_up_shift")
    private boolean enableUpShift = true;

    @JSONField(name = "enable_down_shift")
    private boolean enableDownShift = true;

    @JSONField(name = "up_test_ratio")
    private double upTestRatio = 1.1d;

    @JSONField(name = "long_avg_speed")
    private double longAvgSpeed = 0.91d;

    @JSONField(name = "short_avg_speed")
    private double shortAvgSpeed = 0.75d;

    @JSONField(name = "test_bandwidth_time")
    private long testBandwidthTime = 5000;

    @JSONField(name = "test_bandwidth_num")
    private int testBandwidthNum = 3;

    @JSONField(name = "test_bandwidth_max_fail_num")
    private int testBandwidthMaxFailNum = 3;

    @JSONField(name = "safe_cache")
    private int safeCache = ProgressIndicatorKt.CircularAnimationAdditionalRotationDelay;

    @JSONField(name = "jitter_cache")
    private int jitterCache = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE;

    @JSONField(name = "stall_count")
    private int stallCount = 2;

    @JSONField(name = "stall_time")
    private int stallTime = 2000;

    @JSONField(name = "max_stall_count")
    private int maxStallCount = 3;

    @JSONField(name = "max_stall_time")
    private int maxStallTime = 4000;

    @JSONField(name = "one_stall_time")
    private int oneStallTime = 100;

    @JSONField(name = "stall_cycle_time")
    private int stallCycleTime = 20000;

    @JSONField(name = "buffer_sample_interval")
    private long bufferSampleInterval = PayTask.f60018j;

    @JSONField(name = "qoe_refresh_interval")
    private long qoeRefreshInterval = v.f70979a;

    @JSONField(name = "qoe_freeze")
    private long qoefreeze = v.f70979a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/QOEConfig$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final QOEConfig parserConfigJson(@Nullable String str, @NotNull P2PLogger p2PLogger) {
            P2PLogger.logI$default(p2PLogger, QOEConfig.TAG, str == null ? "config = null" : str, null, 4, null);
            if (str == null) {
                return new QOEConfig();
            }
            try {
                return (QOEConfig) JSON.parseObject(str, QOEConfig.class);
            } catch (Exception e7) {
                p2PLogger.logE(QOEConfig.TAG, String.valueOf(e7.getMessage()), e7);
                return new QOEConfig();
            }
        }
    }

    public final boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public final long getBufferSampleInterval() {
        return this.bufferSampleInterval;
    }

    public final boolean getEnableDownShift() {
        return this.enableDownShift;
    }

    public final boolean getEnableUpShift() {
        return this.enableUpShift;
    }

    public final int getJitterCache() {
        return this.jitterCache;
    }

    public final double getLongAvgSpeed() {
        return this.longAvgSpeed;
    }

    public final int getMaxStallCount() {
        return this.maxStallCount;
    }

    public final int getMaxStallTime() {
        return this.maxStallTime;
    }

    public final int getOneStallTime() {
        return this.oneStallTime;
    }

    public final long getQoeRefreshInterval() {
        return this.qoeRefreshInterval;
    }

    public final long getQoefreeze() {
        return this.qoefreeze;
    }

    public final boolean getResolutionPriority() {
        return this.resolutionPriority;
    }

    public final int getSafeCache() {
        return this.safeCache;
    }

    public final boolean getSeekDownShift() {
        return this.seekDownShift;
    }

    public final double getShortAvgSpeed() {
        return this.shortAvgSpeed;
    }

    public final int getStallCount() {
        return this.stallCount;
    }

    public final int getStallCycleTime() {
        return this.stallCycleTime;
    }

    public final int getStallTime() {
        return this.stallTime;
    }

    public final int getTestBandwidthMaxFailNum() {
        return this.testBandwidthMaxFailNum;
    }

    public final int getTestBandwidthNum() {
        return this.testBandwidthNum;
    }

    public final long getTestBandwidthTime() {
        return this.testBandwidthTime;
    }

    public final double getUpTestRatio() {
        return this.upTestRatio;
    }

    public final void setAutoSwitch(boolean z6) {
        this.autoSwitch = z6;
    }

    public final void setBufferSampleInterval(long j7) {
        this.bufferSampleInterval = j7;
    }

    public final void setEnableDownShift(boolean z6) {
        this.enableDownShift = z6;
    }

    public final void setEnableUpShift(boolean z6) {
        this.enableUpShift = z6;
    }

    public final void setJitterCache(int i7) {
        this.jitterCache = i7;
    }

    public final void setLongAvgSpeed(double d7) {
        this.longAvgSpeed = d7;
    }

    public final void setMaxStallCount(int i7) {
        this.maxStallCount = i7;
    }

    public final void setMaxStallTime(int i7) {
        this.maxStallTime = i7;
    }

    public final void setOneStallTime(int i7) {
        this.oneStallTime = i7;
    }

    public final void setQoeRefreshInterval(long j7) {
        this.qoeRefreshInterval = j7;
    }

    public final void setQoefreeze(long j7) {
        this.qoefreeze = j7;
    }

    public final void setResolutionPriority(boolean z6) {
        this.resolutionPriority = z6;
    }

    public final void setSafeCache(int i7) {
        this.safeCache = i7;
    }

    public final void setSeekDownShift(boolean z6) {
        this.seekDownShift = z6;
    }

    public final void setShortAvgSpeed(double d7) {
        this.shortAvgSpeed = d7;
    }

    public final void setStallCount(int i7) {
        this.stallCount = i7;
    }

    public final void setStallCycleTime(int i7) {
        this.stallCycleTime = i7;
    }

    public final void setStallTime(int i7) {
        this.stallTime = i7;
    }

    public final void setTestBandwidthMaxFailNum(int i7) {
        this.testBandwidthMaxFailNum = i7;
    }

    public final void setTestBandwidthNum(int i7) {
        this.testBandwidthNum = i7;
    }

    public final void setTestBandwidthTime(long j7) {
        this.testBandwidthTime = j7;
    }

    public final void setUpTestRatio(double d7) {
        this.upTestRatio = d7;
    }
}
