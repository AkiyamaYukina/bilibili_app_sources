package com.bilibili.lib.videoupload.bean;

import androidx.annotation.Keep;
import androidx.window.core.layout.WindowSizeClass;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/bean/UploadClientTimeoutConfig.class */
@Keep
public class UploadClientTimeoutConfig {

    @JSONField(name = "connect_timeout")
    public int connectTimeout = 15;

    @JSONField(name = "read_timeout")
    public int readTimeout = 15;

    @JSONField(name = "write_timeout")
    public int writeTimeout = 15;

    @JSONField(name = "retry_delay")
    public float retryDelay = 0.3f;

    @JSONField(name = "retry_count")
    public int retryCount = 10;

    @JSONField(name = "bandwidth_detect_interval")
    public int bandwidthDetectInterval = 10;

    @JSONField(name = "bandwidth_detect_duration")
    public int bandwidthDetectDuration = 3;

    @JSONField(name = "line_probe_read_timeout")
    public int lineProbeReadTimeout = 15;

    @JSONField(name = "line_probe_write_timeout")
    public int lineProbeWriteTimeout = 15;

    @JSONField(name = "line_probe_connect_timeout")
    public int lineProbeConnectTimeout = 15;

    @JSONField(name = "max_requests_per_host")
    public int maxRequestsPerHost = 10;

    @JSONField(name = "speed_detect_interval")
    public int speedDetectInterval = 5;

    @JSONField(name = "chunk_write_time_out")
    public int chunkWriteTimeout = WindowSizeClass.WIDTH_DP_LARGE_LOWER_BOUND;

    @JSONField(name = "chunk_read_time_out")
    public int chunkReadTimeout = 150;

    @JSONField(name = "chunk_connect_time_out")
    public int chunkConnectTimeout = 150;

    @JSONField(name = "chunk_no_change_time_out")
    public int chunkNoChangeTimeout = 30;

    @JSONField(name = "wait_net_retry_count")
    public int waitNetRetryCount = 2;

    @JSONField(name = "req_retry_delay_first")
    public int reqRetryDelayFirst = 300;

    @JSONField(name = "req_retry_delay_increasing")
    public int reqRetryDelayIncreasing = 1000;

    @JSONField(name = "req_retry_delay_max")
    public int reqRetryDelayMax = 5000;

    @JSONField(name = "req_retry_count")
    public int reqRetryCount = 1000;

    @JSONField(name = "chunk_retry_count")
    public int chunkRetryCount = 1000;

    @JSONField(name = "slow_net_check_size")
    public int slowNetCheckSize = 102400;

    @JSONField(name = "expire_time")
    public long expiredTime = 345600000;
}
