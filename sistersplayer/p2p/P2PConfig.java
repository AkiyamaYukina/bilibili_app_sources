package com.bilibili.sistersplayer.p2p;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PConfig.class */
@Keep
public final class P2PConfig {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "P2PConfig";

    @JSONField(name = "check_interface_name_change")
    private boolean checkInterfaceNameChange;

    @JSONField(name = "delay_close_proxy")
    private int delayCloseProxy;

    @JSONField(name = "internal_io_thread")
    private boolean internalIOThread;

    @JSONField(name = "hls_start_playable_duration")
    private int keepFirstGopMs;

    @JSONField(name = "rtc_keep_main_network")
    private boolean rtcKeepMainNetwork = true;

    @JSONField(name = "disable_global_field")
    private boolean disableGlobalField = true;

    @JSONField(name = "check_fragment_stream_name")
    private boolean checkFragmentStreamName = true;

    @JSONField(name = "proxy_url_add_dns")
    private boolean proxyUrlAddDns = true;

    @JSONField(name = "fetcher_max_history_size")
    private int fetcherMaxHistorySize = 5;

    @JSONField(name = "qoe_config")
    @NotNull
    private QOEConfig qoeConfig = new QOEConfig();

    @JSONField(name = "hls_master_config")
    @NotNull
    private HlsMasterConfig hlsMasterConfig = new HlsMasterConfig();

    @JSONField(name = "debug")
    @NotNull
    private Debug debug = new Debug();

    @JSONField(name = "http_fetch_timeout")
    @NotNull
    private FetchTimeOut fetchTimeOut = new FetchTimeOut();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PConfig$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final P2PConfig parserConfigJson(@Nullable String str, @NotNull P2PLogger p2PLogger) {
            P2PLogger.logI$default(p2PLogger, P2PConfig.TAG, str == null ? "config = null" : str, null, 4, null);
            if (str == null) {
                return new P2PConfig();
            }
            try {
                return (P2PConfig) JSON.parseObject(str, P2PConfig.class);
            } catch (Exception e7) {
                p2PLogger.logE(P2PConfig.TAG, String.valueOf(e7.getMessage()), e7);
                return new P2PConfig();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PConfig$Debug.class */
    @Keep
    public static final class Debug {

        @JSONField(name = "log_tags")
        @NotNull
        private String logTags = "";

        @JSONField(name = "master_no_name")
        private boolean masterNoName;

        @JSONField(name = "save_stream")
        private boolean saveStream;

        @NotNull
        public final String getLogTags() {
            return this.logTags;
        }

        public final boolean getMasterNoName() {
            return this.masterNoName;
        }

        public final boolean getSaveStream() {
            return this.saveStream;
        }

        public final void setLogTags(@NotNull String str) {
            this.logTags = str;
        }

        public final void setMasterNoName(boolean z6) {
            this.masterNoName = z6;
        }

        public final void setSaveStream(boolean z6) {
            this.saveStream = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PConfig$FetchTimeOut.class */
    @Keep
    public static final class FetchTimeOut {

        @JSONField(name = "enable")
        private boolean enable;

        @JSONField(name = "call_timeout")
        private long callTimeout = 4000;

        @JSONField(name = "read_timeout")
        private long readTimeOut = 2000;

        @JSONField(name = "write_timeout")
        private long writeTimeOut = 2000;

        @JSONField(name = "connect_timeout")
        private long connectTimeOut = 2000;

        @JSONField(name = "max_retry_count")
        private int maxRetryCount = 1;

        @JSONField(name = "retry_buffer_threshold")
        private long retryBufferThreshold = 2000;

        public final long getCallTimeout() {
            return this.callTimeout;
        }

        public final long getConnectTimeOut() {
            return this.connectTimeOut;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getMaxRetryCount() {
            return this.maxRetryCount;
        }

        public final long getReadTimeOut() {
            return this.readTimeOut;
        }

        public final long getRetryBufferThreshold() {
            return this.retryBufferThreshold;
        }

        public final long getWriteTimeOut() {
            return this.writeTimeOut;
        }

        public final void setCallTimeout(long j7) {
            this.callTimeout = j7;
        }

        public final void setConnectTimeOut(long j7) {
            this.connectTimeOut = j7;
        }

        public final void setEnable(boolean z6) {
            this.enable = z6;
        }

        public final void setMaxRetryCount(int i7) {
            this.maxRetryCount = i7;
        }

        public final void setReadTimeOut(long j7) {
            this.readTimeOut = j7;
        }

        public final void setRetryBufferThreshold(long j7) {
            this.retryBufferThreshold = j7;
        }

        public final void setWriteTimeOut(long j7) {
            this.writeTimeOut = j7;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public final boolean getCheckFragmentStreamName() {
        return this.checkFragmentStreamName;
    }

    public final boolean getCheckInterfaceNameChange() {
        return this.checkInterfaceNameChange;
    }

    @NotNull
    public final Debug getDebug() {
        return this.debug;
    }

    public final int getDelayCloseProxy() {
        return this.delayCloseProxy;
    }

    public final boolean getDisableGlobalField() {
        return this.disableGlobalField;
    }

    @NotNull
    public final FetchTimeOut getFetchTimeOut() {
        return this.fetchTimeOut;
    }

    public final int getFetcherMaxHistorySize() {
        return this.fetcherMaxHistorySize;
    }

    @NotNull
    public final HlsMasterConfig getHlsMasterConfig() {
        return this.hlsMasterConfig;
    }

    public final boolean getInternalIOThread() {
        return this.internalIOThread;
    }

    public final int getKeepFirstGopMs() {
        return this.keepFirstGopMs;
    }

    public final boolean getProxyUrlAddDns() {
        return this.proxyUrlAddDns;
    }

    @NotNull
    public final QOEConfig getQoeConfig() {
        return this.qoeConfig;
    }

    public final boolean getRtcKeepMainNetwork() {
        return this.rtcKeepMainNetwork;
    }

    public final void setCheckFragmentStreamName(boolean z6) {
        this.checkFragmentStreamName = z6;
    }

    public final void setCheckInterfaceNameChange(boolean z6) {
        this.checkInterfaceNameChange = z6;
    }

    public final void setDebug(@NotNull Debug debug) {
        this.debug = debug;
    }

    public final void setDelayCloseProxy(int i7) {
        this.delayCloseProxy = i7;
    }

    public final void setDisableGlobalField(boolean z6) {
        this.disableGlobalField = z6;
    }

    public final void setFetchTimeOut(@NotNull FetchTimeOut fetchTimeOut) {
        this.fetchTimeOut = fetchTimeOut;
    }

    public final void setFetcherMaxHistorySize(int i7) {
        this.fetcherMaxHistorySize = i7;
    }

    public final void setHlsMasterConfig(@NotNull HlsMasterConfig hlsMasterConfig) {
        this.hlsMasterConfig = hlsMasterConfig;
    }

    public final void setInternalIOThread(boolean z6) {
        this.internalIOThread = z6;
    }

    public final void setKeepFirstGopMs(int i7) {
        this.keepFirstGopMs = i7;
    }

    public final void setProxyUrlAddDns(boolean z6) {
        this.proxyUrlAddDns = z6;
    }

    public final void setQoeConfig(@NotNull QOEConfig qOEConfig) {
        this.qoeConfig = qOEConfig;
    }

    public final void setRtcKeepMainNetwork(boolean z6) {
        this.rtcKeepMainNetwork = z6;
    }
}
