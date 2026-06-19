package com.bilibili.lib.rpc.track.model;

import com.bilibili.lib.rpc.track.model.CrNetError;
import com.bilibili.lib.rpc.track.model.CrVersion;
import com.bilibili.lib.rpc.track.model.Header;
import com.bilibili.lib.rpc.track.model.Metrics;
import com.bilibili.lib.rpc.track.model.Queue;
import com.bilibili.lib.rpc.track.model.RpcSample;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/NetworkEvent.class */
public final class NetworkEvent extends GeneratedMessageLite<NetworkEvent, Builder> implements MessageLiteOrBuilder {
    public static final int CALL_TYPE_FIELD_NUMBER = 16;
    public static final int CONSUMED_FIELD_NUMBER = 22;
    public static final int CR_NET_ERROR_FIELD_NUMBER = 23;
    public static final int CR_VERSION_FIELD_NUMBER = 31;
    private static final NetworkEvent DEFAULT_INSTANCE;
    public static final int DOMAIN_DOWNGRADE_FIELD_NUMBER = 36;
    public static final int DOWNGRADE_FIELD_NUMBER = 19;
    public static final int FINISH_TIME_FIELD_NUMBER = 7;
    public static final int HEADER_FIELD_NUMBER = 12;
    public static final int HOST_FIELD_NUMBER = 3;
    public static final int HTTP_CODE_FIELD_NUMBER = 11;
    public static final int LOCAL_RPC_TRACE_ID_FIELD_NUMBER = 18;
    public static final int LOGICAL_HOST_FIELD_NUMBER = 26;
    public static final int LOGICAL_PATH_FIELD_NUMBER = 27;
    public static final int LOGICAL_SCHEME_FIELD_NUMBER = 25;
    public static final int LOGICAL_URL_FIELD_NUMBER = 24;
    public static final int METHOD_FIELD_NUMBER = 9;
    public static final int METRICS_FIELD_NUMBER = 13;
    public static final int NET_EXCEPTION_MESSAGE_FIELD_NUMBER = 15;
    public static final int NET_EXCEPTION_NAME_FIELD_NUMBER = 14;
    public static final int NET_TYPE_FIELD_NUMBER = 38;
    private static volatile Parser<NetworkEvent> PARSER;
    public static final int PATH_FIELD_NUMBER = 4;
    public static final int PERSISTENT_FIELD_NUMBER = 20;
    public static final int PROTOCOL_FIELD_NUMBER = 10;
    public static final int PROXY_FIELD_NUMBER = 33;
    public static final int QUEUE_FIELD_NUMBER = 32;
    public static final int REAL_HOST_FIELD_NUMBER = 29;
    public static final int REAL_PATH_FIELD_NUMBER = 30;
    public static final int REAL_SCHEME_FIELD_NUMBER = 28;
    public static final int REAL_URL_FIELD_NUMBER = 5;
    public static final int REQUEST_TIME_FIELD_NUMBER = 6;
    public static final int SAMPLE_FIELD_NUMBER = 21;
    public static final int SCHEME_FIELD_NUMBER = 2;
    public static final int TOTAL_TIME_FIELD_NUMBER = 8;
    public static final int TUNNEL_FIELD_NUMBER = 17;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int XTICKET_FIELD_NUMBER = 37;
    public static final int XTRACE_ID_FIELD_NUMBER = 34;
    public static final int ZONE_FIELD_NUMBER = 35;
    private int callType_;
    private boolean consumed_;
    private CrNetError crNetError_;
    private CrVersion crVersion_;
    private boolean domainDowngrade_;
    private boolean downgrade_;
    private long finishTime_;
    private Header header_;
    private int httpCode_;
    private Metrics metrics_;
    private boolean persistent_;
    private Queue queue_;
    private long requestTime_;
    private RpcSample sample_;
    private long totalTime_;
    private int tunnel_;
    private String url_ = "";
    private String scheme_ = "";
    private String host_ = "";
    private String path_ = "";
    private String realUrl_ = "";
    private String method_ = "";
    private String protocol_ = "";
    private String netExceptionName_ = "";
    private String netExceptionMessage_ = "";
    private String localRpcTraceId_ = "";
    private String logicalUrl_ = "";
    private String logicalScheme_ = "";
    private String logicalHost_ = "";
    private String logicalPath_ = "";
    private String realScheme_ = "";
    private String realHost_ = "";
    private String realPath_ = "";
    private String proxy_ = "";
    private String xtraceId_ = "";
    private String zone_ = "";
    private String xticket_ = "";
    private String netType_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/NetworkEvent$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<NetworkEvent, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(NetworkEvent.DEFAULT_INSTANCE);
        }

        public Builder clearCallType() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearCallType();
            return this;
        }

        public Builder clearConsumed() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearConsumed();
            return this;
        }

        public Builder clearCrNetError() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearCrNetError();
            return this;
        }

        public Builder clearCrVersion() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearCrVersion();
            return this;
        }

        public Builder clearDomainDowngrade() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearDomainDowngrade();
            return this;
        }

        public Builder clearDowngrade() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearDowngrade();
            return this;
        }

        public Builder clearFinishTime() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearFinishTime();
            return this;
        }

        public Builder clearHeader() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearHeader();
            return this;
        }

        public Builder clearHost() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearHost();
            return this;
        }

        public Builder clearHttpCode() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearHttpCode();
            return this;
        }

        public Builder clearLocalRpcTraceId() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearLocalRpcTraceId();
            return this;
        }

        public Builder clearLogicalHost() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearLogicalHost();
            return this;
        }

        public Builder clearLogicalPath() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearLogicalPath();
            return this;
        }

        public Builder clearLogicalScheme() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearLogicalScheme();
            return this;
        }

        public Builder clearLogicalUrl() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearLogicalUrl();
            return this;
        }

        public Builder clearMethod() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearMethod();
            return this;
        }

        public Builder clearMetrics() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearMetrics();
            return this;
        }

        public Builder clearNetExceptionMessage() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearNetExceptionMessage();
            return this;
        }

        public Builder clearNetExceptionName() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearNetExceptionName();
            return this;
        }

        public Builder clearNetType() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearNetType();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearPath();
            return this;
        }

        public Builder clearPersistent() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearPersistent();
            return this;
        }

        public Builder clearProtocol() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearProtocol();
            return this;
        }

        public Builder clearProxy() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearProxy();
            return this;
        }

        public Builder clearQueue() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearQueue();
            return this;
        }

        public Builder clearRealHost() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearRealHost();
            return this;
        }

        public Builder clearRealPath() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearRealPath();
            return this;
        }

        public Builder clearRealScheme() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearRealScheme();
            return this;
        }

        public Builder clearRealUrl() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearRealUrl();
            return this;
        }

        public Builder clearRequestTime() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearRequestTime();
            return this;
        }

        public Builder clearSample() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearSample();
            return this;
        }

        public Builder clearScheme() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearScheme();
            return this;
        }

        public Builder clearTotalTime() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearTotalTime();
            return this;
        }

        public Builder clearTunnel() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearTunnel();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearUrl();
            return this;
        }

        public Builder clearXticket() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearXticket();
            return this;
        }

        public Builder clearXtraceId() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearXtraceId();
            return this;
        }

        public Builder clearZone() {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).clearZone();
            return this;
        }

        public CallType getCallType() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getCallType();
        }

        public int getCallTypeValue() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getCallTypeValue();
        }

        public boolean getConsumed() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getConsumed();
        }

        public CrNetError getCrNetError() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getCrNetError();
        }

        public CrVersion getCrVersion() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getCrVersion();
        }

        public boolean getDomainDowngrade() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getDomainDowngrade();
        }

        public boolean getDowngrade() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getDowngrade();
        }

        public long getFinishTime() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getFinishTime();
        }

        public Header getHeader() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getHeader();
        }

        public String getHost() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getHost();
        }

        public ByteString getHostBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getHostBytes();
        }

        public int getHttpCode() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getHttpCode();
        }

        public String getLocalRpcTraceId() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLocalRpcTraceId();
        }

        public ByteString getLocalRpcTraceIdBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLocalRpcTraceIdBytes();
        }

        public String getLogicalHost() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalHost();
        }

        public ByteString getLogicalHostBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalHostBytes();
        }

        public String getLogicalPath() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalPath();
        }

        public ByteString getLogicalPathBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalPathBytes();
        }

        public String getLogicalScheme() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalScheme();
        }

        public ByteString getLogicalSchemeBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalSchemeBytes();
        }

        public String getLogicalUrl() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalUrl();
        }

        public ByteString getLogicalUrlBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getLogicalUrlBytes();
        }

        public String getMethod() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getMethod();
        }

        public ByteString getMethodBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getMethodBytes();
        }

        public Metrics getMetrics() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getMetrics();
        }

        public String getNetExceptionMessage() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getNetExceptionMessage();
        }

        public ByteString getNetExceptionMessageBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getNetExceptionMessageBytes();
        }

        public String getNetExceptionName() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getNetExceptionName();
        }

        public ByteString getNetExceptionNameBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getNetExceptionNameBytes();
        }

        public String getNetType() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getNetType();
        }

        public ByteString getNetTypeBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getNetTypeBytes();
        }

        public String getPath() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getPath();
        }

        public ByteString getPathBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getPathBytes();
        }

        public boolean getPersistent() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getPersistent();
        }

        public String getProtocol() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getProtocol();
        }

        public ByteString getProtocolBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getProtocolBytes();
        }

        public String getProxy() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getProxy();
        }

        public ByteString getProxyBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getProxyBytes();
        }

        public Queue getQueue() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getQueue();
        }

        public String getRealHost() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealHost();
        }

        public ByteString getRealHostBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealHostBytes();
        }

        public String getRealPath() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealPath();
        }

        public ByteString getRealPathBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealPathBytes();
        }

        public String getRealScheme() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealScheme();
        }

        public ByteString getRealSchemeBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealSchemeBytes();
        }

        public String getRealUrl() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealUrl();
        }

        public ByteString getRealUrlBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRealUrlBytes();
        }

        public long getRequestTime() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getRequestTime();
        }

        public RpcSample getSample() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getSample();
        }

        public String getScheme() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getScheme();
        }

        public ByteString getSchemeBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getSchemeBytes();
        }

        public long getTotalTime() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getTotalTime();
        }

        public Tunnel getTunnel() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getTunnel();
        }

        public int getTunnelValue() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getTunnelValue();
        }

        public String getUrl() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getUrlBytes();
        }

        public String getXticket() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getXticket();
        }

        public ByteString getXticketBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getXticketBytes();
        }

        public String getXtraceId() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getXtraceId();
        }

        public ByteString getXtraceIdBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getXtraceIdBytes();
        }

        public String getZone() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getZone();
        }

        public ByteString getZoneBytes() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).getZoneBytes();
        }

        public boolean hasCrNetError() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).hasCrNetError();
        }

        public boolean hasCrVersion() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).hasCrVersion();
        }

        public boolean hasHeader() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).hasHeader();
        }

        public boolean hasMetrics() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).hasMetrics();
        }

        public boolean hasQueue() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).hasQueue();
        }

        public boolean hasSample() {
            return ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).hasSample();
        }

        public Builder mergeCrNetError(CrNetError crNetError) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).mergeCrNetError(crNetError);
            return this;
        }

        public Builder mergeCrVersion(CrVersion crVersion) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).mergeCrVersion(crVersion);
            return this;
        }

        public Builder mergeHeader(Header header) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).mergeHeader(header);
            return this;
        }

        public Builder mergeMetrics(Metrics metrics) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).mergeMetrics(metrics);
            return this;
        }

        public Builder mergeQueue(Queue queue) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).mergeQueue(queue);
            return this;
        }

        public Builder mergeSample(RpcSample rpcSample) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).mergeSample(rpcSample);
            return this;
        }

        public Builder setCallType(CallType callType) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setCallType(callType);
            return this;
        }

        public Builder setCallTypeValue(int i7) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setCallTypeValue(i7);
            return this;
        }

        public Builder setConsumed(boolean z6) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setConsumed(z6);
            return this;
        }

        public Builder setCrNetError(CrNetError.Builder builder) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setCrNetError((CrNetError) builder.build());
            return this;
        }

        public Builder setCrNetError(CrNetError crNetError) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setCrNetError(crNetError);
            return this;
        }

        public Builder setCrVersion(CrVersion.Builder builder) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setCrVersion((CrVersion) builder.build());
            return this;
        }

        public Builder setCrVersion(CrVersion crVersion) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setCrVersion(crVersion);
            return this;
        }

        public Builder setDomainDowngrade(boolean z6) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setDomainDowngrade(z6);
            return this;
        }

        public Builder setDowngrade(boolean z6) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setDowngrade(z6);
            return this;
        }

        public Builder setFinishTime(long j7) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setFinishTime(j7);
            return this;
        }

        public Builder setHeader(Header.Builder builder) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setHeader((Header) builder.build());
            return this;
        }

        public Builder setHeader(Header header) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setHeader(header);
            return this;
        }

        public Builder setHost(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setHost(str);
            return this;
        }

        public Builder setHostBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setHostBytes(byteString);
            return this;
        }

        public Builder setHttpCode(int i7) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setHttpCode(i7);
            return this;
        }

        public Builder setLocalRpcTraceId(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLocalRpcTraceId(str);
            return this;
        }

        public Builder setLocalRpcTraceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLocalRpcTraceIdBytes(byteString);
            return this;
        }

        public Builder setLogicalHost(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalHost(str);
            return this;
        }

        public Builder setLogicalHostBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalHostBytes(byteString);
            return this;
        }

        public Builder setLogicalPath(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalPath(str);
            return this;
        }

        public Builder setLogicalPathBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalPathBytes(byteString);
            return this;
        }

        public Builder setLogicalScheme(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalScheme(str);
            return this;
        }

        public Builder setLogicalSchemeBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalSchemeBytes(byteString);
            return this;
        }

        public Builder setLogicalUrl(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalUrl(str);
            return this;
        }

        public Builder setLogicalUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setLogicalUrlBytes(byteString);
            return this;
        }

        public Builder setMethod(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setMethod(str);
            return this;
        }

        public Builder setMethodBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setMethodBytes(byteString);
            return this;
        }

        public Builder setMetrics(Metrics.Builder builder) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setMetrics((Metrics) builder.build());
            return this;
        }

        public Builder setMetrics(Metrics metrics) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setMetrics(metrics);
            return this;
        }

        public Builder setNetExceptionMessage(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setNetExceptionMessage(str);
            return this;
        }

        public Builder setNetExceptionMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setNetExceptionMessageBytes(byteString);
            return this;
        }

        public Builder setNetExceptionName(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setNetExceptionName(str);
            return this;
        }

        public Builder setNetExceptionNameBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setNetExceptionNameBytes(byteString);
            return this;
        }

        public Builder setNetType(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setNetType(str);
            return this;
        }

        public Builder setNetTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setNetTypeBytes(byteString);
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setPathBytes(byteString);
            return this;
        }

        public Builder setPersistent(boolean z6) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setPersistent(z6);
            return this;
        }

        public Builder setProtocol(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setProtocol(str);
            return this;
        }

        public Builder setProtocolBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setProtocolBytes(byteString);
            return this;
        }

        public Builder setProxy(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setProxy(str);
            return this;
        }

        public Builder setProxyBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setProxyBytes(byteString);
            return this;
        }

        public Builder setQueue(Queue.b bVar) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setQueue((Queue) bVar.build());
            return this;
        }

        public Builder setQueue(Queue queue) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setQueue(queue);
            return this;
        }

        public Builder setRealHost(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealHost(str);
            return this;
        }

        public Builder setRealHostBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealHostBytes(byteString);
            return this;
        }

        public Builder setRealPath(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealPath(str);
            return this;
        }

        public Builder setRealPathBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealPathBytes(byteString);
            return this;
        }

        public Builder setRealScheme(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealScheme(str);
            return this;
        }

        public Builder setRealSchemeBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealSchemeBytes(byteString);
            return this;
        }

        public Builder setRealUrl(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealUrl(str);
            return this;
        }

        public Builder setRealUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRealUrlBytes(byteString);
            return this;
        }

        public Builder setRequestTime(long j7) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setRequestTime(j7);
            return this;
        }

        public Builder setSample(RpcSample.Builder builder) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setSample((RpcSample) builder.build());
            return this;
        }

        public Builder setSample(RpcSample rpcSample) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setSample(rpcSample);
            return this;
        }

        public Builder setScheme(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setScheme(str);
            return this;
        }

        public Builder setSchemeBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setSchemeBytes(byteString);
            return this;
        }

        public Builder setTotalTime(long j7) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setTotalTime(j7);
            return this;
        }

        public Builder setTunnel(Tunnel tunnel) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setTunnel(tunnel);
            return this;
        }

        public Builder setTunnelValue(int i7) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setTunnelValue(i7);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setXticket(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setXticket(str);
            return this;
        }

        public Builder setXticketBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setXticketBytes(byteString);
            return this;
        }

        public Builder setXtraceId(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setXtraceId(str);
            return this;
        }

        public Builder setXtraceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setXtraceIdBytes(byteString);
            return this;
        }

        public Builder setZone(String str) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setZone(str);
            return this;
        }

        public Builder setZoneBytes(ByteString byteString) {
            copyOnWrite();
            ((NetworkEvent) ((GeneratedMessageLite.Builder) this).instance).setZoneBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/NetworkEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64368a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x006d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.NetworkEvent.a.f64368a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
            L58:
                return
            L59:
                r4 = move-exception
                goto L14
            L5d:
                r4 = move-exception
                goto L1f
            L61:
                r4 = move-exception
                goto L2a
            L65:
                r4 = move-exception
                goto L35
            L69:
                r4 = move-exception
                goto L40
            L6d:
                r4 = move-exception
                goto L4c
            L71:
                r4 = move-exception
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.NetworkEvent.a.m6732clinit():void");
        }
    }

    static {
        NetworkEvent networkEvent = new NetworkEvent();
        DEFAULT_INSTANCE = networkEvent;
        GeneratedMessageLite.registerDefaultInstance(NetworkEvent.class, networkEvent);
    }

    private NetworkEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallType() {
        this.callType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumed() {
        this.consumed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrNetError() {
        this.crNetError_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrVersion() {
        this.crVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDomainDowngrade() {
        this.domainDowngrade_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDowngrade() {
        this.downgrade_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFinishTime() {
        this.finishTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeader() {
        this.header_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHost() {
        this.host_ = getDefaultInstance().getHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCode() {
        this.httpCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalRpcTraceId() {
        this.localRpcTraceId_ = getDefaultInstance().getLocalRpcTraceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalHost() {
        this.logicalHost_ = getDefaultInstance().getLogicalHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalPath() {
        this.logicalPath_ = getDefaultInstance().getLogicalPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalScheme() {
        this.logicalScheme_ = getDefaultInstance().getLogicalScheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalUrl() {
        this.logicalUrl_ = getDefaultInstance().getLogicalUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = getDefaultInstance().getMethod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetExceptionMessage() {
        this.netExceptionMessage_ = getDefaultInstance().getNetExceptionMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetExceptionName() {
        this.netExceptionName_ = getDefaultInstance().getNetExceptionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetType() {
        this.netType_ = getDefaultInstance().getNetType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersistent() {
        this.persistent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = getDefaultInstance().getProtocol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxy() {
        this.proxy_ = getDefaultInstance().getProxy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueue() {
        this.queue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealHost() {
        this.realHost_ = getDefaultInstance().getRealHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealPath() {
        this.realPath_ = getDefaultInstance().getRealPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealScheme() {
        this.realScheme_ = getDefaultInstance().getRealScheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealUrl() {
        this.realUrl_ = getDefaultInstance().getRealUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTime() {
        this.requestTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSample() {
        this.sample_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScheme() {
        this.scheme_ = getDefaultInstance().getScheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTime() {
        this.totalTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTunnel() {
        this.tunnel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearXticket() {
        this.xticket_ = getDefaultInstance().getXticket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearXtraceId() {
        this.xtraceId_ = getDefaultInstance().getXtraceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZone() {
        this.zone_ = getDefaultInstance().getZone();
    }

    public static NetworkEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrNetError(CrNetError crNetError) {
        crNetError.getClass();
        CrNetError crNetError2 = this.crNetError_;
        if (crNetError2 == null || crNetError2 == CrNetError.getDefaultInstance()) {
            this.crNetError_ = crNetError;
        } else {
            this.crNetError_ = (CrNetError) ((CrNetError.Builder) CrNetError.newBuilder(this.crNetError_).mergeFrom(crNetError)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrVersion(CrVersion crVersion) {
        crVersion.getClass();
        CrVersion crVersion2 = this.crVersion_;
        if (crVersion2 == null || crVersion2 == CrVersion.getDefaultInstance()) {
            this.crVersion_ = crVersion;
        } else {
            this.crVersion_ = (CrVersion) ((CrVersion.Builder) CrVersion.newBuilder(this.crVersion_).mergeFrom(crVersion)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeader(Header header) {
        header.getClass();
        Header header2 = this.header_;
        if (header2 == null || header2 == Header.getDefaultInstance()) {
            this.header_ = header;
        } else {
            this.header_ = (Header) ((Header.Builder) Header.newBuilder(this.header_).mergeFrom(header)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetrics(Metrics metrics) {
        metrics.getClass();
        Metrics metrics2 = this.metrics_;
        if (metrics2 == null || metrics2 == Metrics.getDefaultInstance()) {
            this.metrics_ = metrics;
        } else {
            this.metrics_ = (Metrics) ((Metrics.Builder) Metrics.newBuilder(this.metrics_).mergeFrom(metrics)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQueue(Queue queue) {
        queue.getClass();
        Queue queue2 = this.queue_;
        if (queue2 == null || queue2 == Queue.getDefaultInstance()) {
            this.queue_ = queue;
        } else {
            this.queue_ = (Queue) ((Queue.b) Queue.newBuilder(this.queue_).mergeFrom(queue)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSample(RpcSample rpcSample) {
        rpcSample.getClass();
        RpcSample rpcSample2 = this.sample_;
        if (rpcSample2 == null || rpcSample2 == RpcSample.getDefaultInstance()) {
            this.sample_ = rpcSample;
        } else {
            this.sample_ = (RpcSample) ((RpcSample.Builder) RpcSample.newBuilder(this.sample_).mergeFrom(rpcSample)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NetworkEvent networkEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(networkEvent);
    }

    public static NetworkEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NetworkEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NetworkEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NetworkEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NetworkEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NetworkEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static NetworkEvent parseFrom(InputStream inputStream) throws IOException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NetworkEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NetworkEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NetworkEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<NetworkEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallType(CallType callType) {
        this.callType_ = callType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallTypeValue(int i7) {
        this.callType_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumed(boolean z6) {
        this.consumed_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrNetError(CrNetError crNetError) {
        crNetError.getClass();
        this.crNetError_ = crNetError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrVersion(CrVersion crVersion) {
        crVersion.getClass();
        this.crVersion_ = crVersion;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDomainDowngrade(boolean z6) {
        this.domainDowngrade_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDowngrade(boolean z6) {
        this.downgrade_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFinishTime(long j7) {
        this.finishTime_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(Header header) {
        header.getClass();
        this.header_ = header;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHost(String str) {
        str.getClass();
        this.host_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.host_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCode(int i7) {
        this.httpCode_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalRpcTraceId(String str) {
        str.getClass();
        this.localRpcTraceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalRpcTraceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.localRpcTraceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalHost(String str) {
        str.getClass();
        this.logicalHost_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logicalHost_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalPath(String str) {
        str.getClass();
        this.logicalPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logicalPath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalScheme(String str) {
        str.getClass();
        this.logicalScheme_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalSchemeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logicalScheme_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalUrl(String str) {
        str.getClass();
        this.logicalUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.logicalUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(String str) {
        str.getClass();
        this.method_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.method_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(Metrics metrics) {
        metrics.getClass();
        this.metrics_ = metrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetExceptionMessage(String str) {
        str.getClass();
        this.netExceptionMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetExceptionMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.netExceptionMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetExceptionName(String str) {
        str.getClass();
        this.netExceptionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetExceptionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.netExceptionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetType(String str) {
        str.getClass();
        this.netType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.netType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistent(boolean z6) {
        this.persistent_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(String str) {
        str.getClass();
        this.protocol_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.protocol_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxy(String str) {
        str.getClass();
        this.proxy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.proxy_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueue(Queue queue) {
        queue.getClass();
        this.queue_ = queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealHost(String str) {
        str.getClass();
        this.realHost_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realHost_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealPath(String str) {
        str.getClass();
        this.realPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realPath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealScheme(String str) {
        str.getClass();
        this.realScheme_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealSchemeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realScheme_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealUrl(String str) {
        str.getClass();
        this.realUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTime(long j7) {
        this.requestTime_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSample(RpcSample rpcSample) {
        rpcSample.getClass();
        this.sample_ = rpcSample;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(String str) {
        str.getClass();
        this.scheme_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.scheme_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTime(long j7) {
        this.totalTime_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTunnel(Tunnel tunnel) {
        this.tunnel_ = tunnel.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTunnelValue(int i7) {
        this.tunnel_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXticket(String str) {
        str.getClass();
        this.xticket_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXticketBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.xticket_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXtraceId(String str) {
        str.getClass();
        this.xtraceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXtraceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.xtraceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZone(String str) {
        str.getClass();
        this.zone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.zone_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64368a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000&\u0000\u0000\u0001&&\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007\u0002\b\u0002\tȈ\nȈ\u000b\u0004\f\t\r\t\u000eȈ\u000fȈ\u0010\f\u0011\f\u0012Ȉ\u0013\u0007\u0014\u0007\u0015\t\u0016\u0007\u0017\t\u0018Ȉ\u0019Ȉ\u001aȈ\u001bȈ\u001cȈ\u001dȈ\u001eȈ\u001f\t \t!Ȉ\"Ȉ#Ȉ$\u0007%Ȉ&Ȉ", new Object[]{"url_", "scheme_", "host_", "path_", "realUrl_", "requestTime_", "finishTime_", "totalTime_", "method_", "protocol_", "httpCode_", "header_", "metrics_", "netExceptionName_", "netExceptionMessage_", "callType_", "tunnel_", "localRpcTraceId_", "downgrade_", "persistent_", "sample_", "consumed_", "crNetError_", "logicalUrl_", "logicalScheme_", "logicalHost_", "logicalPath_", "realScheme_", "realHost_", "realPath_", "crVersion_", "queue_", "proxy_", "xtraceId_", "zone_", "domainDowngrade_", "xticket_", "netType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NetworkEvent.class) {
                        try {
                            GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser3 = PARSER;
                            defaultInstanceBasedParser2 = defaultInstanceBasedParser3;
                            if (defaultInstanceBasedParser3 == null) {
                                defaultInstanceBasedParser2 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public CallType getCallType() {
        CallType callTypeForNumber = CallType.forNumber(this.callType_);
        CallType callType = callTypeForNumber;
        if (callTypeForNumber == null) {
            callType = CallType.UNRECOGNIZED;
        }
        return callType;
    }

    public int getCallTypeValue() {
        return this.callType_;
    }

    public boolean getConsumed() {
        return this.consumed_;
    }

    public CrNetError getCrNetError() {
        CrNetError crNetError = this.crNetError_;
        CrNetError defaultInstance = crNetError;
        if (crNetError == null) {
            defaultInstance = CrNetError.getDefaultInstance();
        }
        return defaultInstance;
    }

    public CrVersion getCrVersion() {
        CrVersion crVersion = this.crVersion_;
        CrVersion defaultInstance = crVersion;
        if (crVersion == null) {
            defaultInstance = CrVersion.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getDomainDowngrade() {
        return this.domainDowngrade_;
    }

    public boolean getDowngrade() {
        return this.downgrade_;
    }

    public long getFinishTime() {
        return this.finishTime_;
    }

    public Header getHeader() {
        Header header = this.header_;
        Header defaultInstance = header;
        if (header == null) {
            defaultInstance = Header.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getHost() {
        return this.host_;
    }

    public ByteString getHostBytes() {
        return ByteString.copyFromUtf8(this.host_);
    }

    public int getHttpCode() {
        return this.httpCode_;
    }

    public String getLocalRpcTraceId() {
        return this.localRpcTraceId_;
    }

    public ByteString getLocalRpcTraceIdBytes() {
        return ByteString.copyFromUtf8(this.localRpcTraceId_);
    }

    public String getLogicalHost() {
        return this.logicalHost_;
    }

    public ByteString getLogicalHostBytes() {
        return ByteString.copyFromUtf8(this.logicalHost_);
    }

    public String getLogicalPath() {
        return this.logicalPath_;
    }

    public ByteString getLogicalPathBytes() {
        return ByteString.copyFromUtf8(this.logicalPath_);
    }

    public String getLogicalScheme() {
        return this.logicalScheme_;
    }

    public ByteString getLogicalSchemeBytes() {
        return ByteString.copyFromUtf8(this.logicalScheme_);
    }

    public String getLogicalUrl() {
        return this.logicalUrl_;
    }

    public ByteString getLogicalUrlBytes() {
        return ByteString.copyFromUtf8(this.logicalUrl_);
    }

    public String getMethod() {
        return this.method_;
    }

    public ByteString getMethodBytes() {
        return ByteString.copyFromUtf8(this.method_);
    }

    public Metrics getMetrics() {
        Metrics metrics = this.metrics_;
        Metrics defaultInstance = metrics;
        if (metrics == null) {
            defaultInstance = Metrics.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getNetExceptionMessage() {
        return this.netExceptionMessage_;
    }

    public ByteString getNetExceptionMessageBytes() {
        return ByteString.copyFromUtf8(this.netExceptionMessage_);
    }

    public String getNetExceptionName() {
        return this.netExceptionName_;
    }

    public ByteString getNetExceptionNameBytes() {
        return ByteString.copyFromUtf8(this.netExceptionName_);
    }

    public String getNetType() {
        return this.netType_;
    }

    public ByteString getNetTypeBytes() {
        return ByteString.copyFromUtf8(this.netType_);
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }

    public boolean getPersistent() {
        return this.persistent_;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    public String getProxy() {
        return this.proxy_;
    }

    public ByteString getProxyBytes() {
        return ByteString.copyFromUtf8(this.proxy_);
    }

    public Queue getQueue() {
        Queue queue = this.queue_;
        Queue defaultInstance = queue;
        if (queue == null) {
            defaultInstance = Queue.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getRealHost() {
        return this.realHost_;
    }

    public ByteString getRealHostBytes() {
        return ByteString.copyFromUtf8(this.realHost_);
    }

    public String getRealPath() {
        return this.realPath_;
    }

    public ByteString getRealPathBytes() {
        return ByteString.copyFromUtf8(this.realPath_);
    }

    public String getRealScheme() {
        return this.realScheme_;
    }

    public ByteString getRealSchemeBytes() {
        return ByteString.copyFromUtf8(this.realScheme_);
    }

    public String getRealUrl() {
        return this.realUrl_;
    }

    public ByteString getRealUrlBytes() {
        return ByteString.copyFromUtf8(this.realUrl_);
    }

    public long getRequestTime() {
        return this.requestTime_;
    }

    public RpcSample getSample() {
        RpcSample rpcSample = this.sample_;
        RpcSample defaultInstance = rpcSample;
        if (rpcSample == null) {
            defaultInstance = RpcSample.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getScheme() {
        return this.scheme_;
    }

    public ByteString getSchemeBytes() {
        return ByteString.copyFromUtf8(this.scheme_);
    }

    public long getTotalTime() {
        return this.totalTime_;
    }

    public Tunnel getTunnel() {
        Tunnel tunnelForNumber = Tunnel.forNumber(this.tunnel_);
        Tunnel tunnel = tunnelForNumber;
        if (tunnelForNumber == null) {
            tunnel = Tunnel.UNRECOGNIZED;
        }
        return tunnel;
    }

    public int getTunnelValue() {
        return this.tunnel_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public String getXticket() {
        return this.xticket_;
    }

    public ByteString getXticketBytes() {
        return ByteString.copyFromUtf8(this.xticket_);
    }

    public String getXtraceId() {
        return this.xtraceId_;
    }

    public ByteString getXtraceIdBytes() {
        return ByteString.copyFromUtf8(this.xtraceId_);
    }

    public String getZone() {
        return this.zone_;
    }

    public ByteString getZoneBytes() {
        return ByteString.copyFromUtf8(this.zone_);
    }

    public boolean hasCrNetError() {
        return this.crNetError_ != null;
    }

    public boolean hasCrVersion() {
        return this.crVersion_ != null;
    }

    public boolean hasHeader() {
        return this.header_ != null;
    }

    public boolean hasMetrics() {
        return this.metrics_ != null;
    }

    public boolean hasQueue() {
        return this.queue_ != null;
    }

    public boolean hasSample() {
        return this.sample_ != null;
    }
}
