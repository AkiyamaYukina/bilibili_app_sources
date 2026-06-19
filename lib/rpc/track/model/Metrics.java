package com.bilibili.lib.rpc.track.model;

import com.bilibili.lib.rpc.track.model.CrNq;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Metrics.class */
public final class Metrics extends GeneratedMessageLite<Metrics, Builder> implements MessageLiteOrBuilder {
    public static final int AVAILABLE_INTERFACES_FIELD_NUMBER = 53;
    public static final int CONGESTION_CONTROL_ALGORITHM_FIELD_NUMBER = 51;
    public static final int CONNECT_COST_FIELD_NUMBER = 10;
    public static final int CONNECT_END_FIELD_NUMBER = 9;
    public static final int CONNECT_START_FIELD_NUMBER = 5;
    public static final int COST_FIELD_NUMBER = 36;
    public static final int CR_NQ_FIELD_NUMBER = 42;
    public static final int C_NET_KB_FIELD_NUMBER = 48;
    public static final int C_NET_KB_TIME_FIELD_NUMBER = 49;
    public static final int C_NET_SUCCESS_RATE_FIELD_NUMBER = 47;
    private static final Metrics DEFAULT_INSTANCE;
    public static final int DNS_COST_FIELD_NUMBER = 4;
    public static final int DNS_END_FIELD_NUMBER = 3;
    public static final int DNS_PROVIDER_FIELD_NUMBER = 39;
    public static final int DNS_START_FIELD_NUMBER = 2;
    public static final int END_FIELD_NUMBER = 35;
    public static final int ERROR_RECORDS_FIELD_NUMBER = 46;
    public static final int EXTRA_FLAG_FIELD_NUMBER = 50;
    public static final int HOST_RESOLVE_IPS_FIELD_NUMBER = 40;
    public static final int JOB_TYPE_FIELD_NUMBER = 41;
    private static volatile Parser<Metrics> PARSER;
    public static final int QUIC_PROTOCOL_ID_FIELD_NUMBER = 45;
    public static final int REMOTE_IP_FIELD_NUMBER = 38;
    public static final int REQ_BODY_COST_FIELD_NUMBER = 17;
    public static final int REQ_BODY_END_FIELD_NUMBER = 16;
    public static final int REQ_BODY_SIZE_FIELD_NUMBER = 30;
    public static final int REQ_BODY_START_FIELD_NUMBER = 15;
    public static final int REQ_COST_FIELD_NUMBER = 19;
    public static final int REQ_END_FIELD_NUMBER = 18;
    public static final int REQ_HEADER_COST_FIELD_NUMBER = 14;
    public static final int REQ_HEADER_END_FIELD_NUMBER = 13;
    public static final int REQ_HEADER_SIZE_FIELD_NUMBER = 29;
    public static final int REQ_HEADER_START_FIELD_NUMBER = 12;
    public static final int REQ_PACKAGE_SIZE_FIELD_NUMBER = 31;
    public static final int REQ_START_FIELD_NUMBER = 11;
    public static final int RESP_BODY_COST_FIELD_NUMBER = 26;
    public static final int RESP_BODY_END_FIELD_NUMBER = 25;
    public static final int RESP_BODY_SIZE_FIELD_NUMBER = 33;
    public static final int RESP_BODY_START_FIELD_NUMBER = 24;
    public static final int RESP_COST_FIELD_NUMBER = 28;
    public static final int RESP_END_FIELD_NUMBER = 27;
    public static final int RESP_HEADER_COST_FIELD_NUMBER = 23;
    public static final int RESP_HEADER_END_FIELD_NUMBER = 22;
    public static final int RESP_HEADER_SIZE_FIELD_NUMBER = 32;
    public static final int RESP_HEADER_START_FIELD_NUMBER = 21;
    public static final int RESP_PACKAGE_SIZE_FIELD_NUMBER = 34;
    public static final int RESP_START_FIELD_NUMBER = 20;
    public static final int SOCKET_REUSE_FIELD_NUMBER = 37;
    public static final int START_FIELD_NUMBER = 1;
    public static final int STREAM_PROTOCL_FIELD_NUMBER = 43;
    public static final int TLS_COST_FIELD_NUMBER = 8;
    public static final int TLS_END_FIELD_NUMBER = 7;
    public static final int TLS_START_FIELD_NUMBER = 6;
    public static final int USING_BEST_INTERFACE_FIELD_NUMBER = 52;
    public static final int USING_QUIC_FIELD_NUMBER = 44;
    private long connectCost_;
    private long connectEnd_;
    private long connectStart_;
    private long cost_;
    private CrNq crNq_;
    private long dnsCost_;
    private long dnsEnd_;
    private long dnsStart_;
    private long end_;
    private long reqBodyCost_;
    private long reqBodyEnd_;
    private long reqBodySize_;
    private long reqBodyStart_;
    private long reqCost_;
    private long reqEnd_;
    private long reqHeaderCost_;
    private long reqHeaderEnd_;
    private long reqHeaderSize_;
    private long reqHeaderStart_;
    private long reqPackageSize_;
    private long reqStart_;
    private long respBodyCost_;
    private long respBodyEnd_;
    private long respBodySize_;
    private long respBodyStart_;
    private long respCost_;
    private long respEnd_;
    private long respHeaderCost_;
    private long respHeaderEnd_;
    private long respHeaderSize_;
    private long respHeaderStart_;
    private long respPackageSize_;
    private long respStart_;
    private boolean socketReuse_;
    private long start_;
    private long tlsCost_;
    private long tlsEnd_;
    private long tlsStart_;
    private int usingBestInterface_;
    private boolean usingQuic_;
    private String remoteIp_ = "";
    private String dnsProvider_ = "";
    private Internal.ProtobufList<String> hostResolveIps_ = GeneratedMessageLite.emptyProtobufList();
    private String jobType_ = "";
    private String streamProtocl_ = "";
    private String quicProtocolId_ = "";
    private String errorRecords_ = "";
    private String cNetSuccessRate_ = "";
    private String cNetKb_ = "";
    private String cNetKbTime_ = "";
    private String extraFlag_ = "";
    private String congestionControlAlgorithm_ = "";
    private String availableInterfaces_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Metrics$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<Metrics, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(Metrics.DEFAULT_INSTANCE);
        }

        public Builder addAllHostResolveIps(Iterable<String> iterable) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).addAllHostResolveIps(iterable);
            return this;
        }

        public Builder addHostResolveIps(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).addHostResolveIps(str);
            return this;
        }

        public Builder addHostResolveIpsBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).addHostResolveIpsBytes(byteString);
            return this;
        }

        public Builder clearAvailableInterfaces() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearAvailableInterfaces();
            return this;
        }

        public Builder clearCNetKb() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearCNetKb();
            return this;
        }

        public Builder clearCNetKbTime() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearCNetKbTime();
            return this;
        }

        public Builder clearCNetSuccessRate() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearCNetSuccessRate();
            return this;
        }

        public Builder clearCongestionControlAlgorithm() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearCongestionControlAlgorithm();
            return this;
        }

        public Builder clearConnectCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearConnectCost();
            return this;
        }

        public Builder clearConnectEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearConnectEnd();
            return this;
        }

        public Builder clearConnectStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearConnectStart();
            return this;
        }

        public Builder clearCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearCost();
            return this;
        }

        public Builder clearCrNq() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearCrNq();
            return this;
        }

        public Builder clearDnsCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearDnsCost();
            return this;
        }

        public Builder clearDnsEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearDnsEnd();
            return this;
        }

        public Builder clearDnsProvider() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearDnsProvider();
            return this;
        }

        public Builder clearDnsStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearDnsStart();
            return this;
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearEnd();
            return this;
        }

        public Builder clearErrorRecords() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearErrorRecords();
            return this;
        }

        public Builder clearExtraFlag() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearExtraFlag();
            return this;
        }

        public Builder clearHostResolveIps() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearHostResolveIps();
            return this;
        }

        public Builder clearJobType() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearJobType();
            return this;
        }

        public Builder clearQuicProtocolId() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearQuicProtocolId();
            return this;
        }

        public Builder clearRemoteIp() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRemoteIp();
            return this;
        }

        public Builder clearReqBodyCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqBodyCost();
            return this;
        }

        public Builder clearReqBodyEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqBodyEnd();
            return this;
        }

        public Builder clearReqBodySize() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqBodySize();
            return this;
        }

        public Builder clearReqBodyStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqBodyStart();
            return this;
        }

        public Builder clearReqCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqCost();
            return this;
        }

        public Builder clearReqEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqEnd();
            return this;
        }

        public Builder clearReqHeaderCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqHeaderCost();
            return this;
        }

        public Builder clearReqHeaderEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqHeaderEnd();
            return this;
        }

        public Builder clearReqHeaderSize() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqHeaderSize();
            return this;
        }

        public Builder clearReqHeaderStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqHeaderStart();
            return this;
        }

        public Builder clearReqPackageSize() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqPackageSize();
            return this;
        }

        public Builder clearReqStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearReqStart();
            return this;
        }

        public Builder clearRespBodyCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespBodyCost();
            return this;
        }

        public Builder clearRespBodyEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespBodyEnd();
            return this;
        }

        public Builder clearRespBodySize() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespBodySize();
            return this;
        }

        public Builder clearRespBodyStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespBodyStart();
            return this;
        }

        public Builder clearRespCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespCost();
            return this;
        }

        public Builder clearRespEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespEnd();
            return this;
        }

        public Builder clearRespHeaderCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespHeaderCost();
            return this;
        }

        public Builder clearRespHeaderEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespHeaderEnd();
            return this;
        }

        public Builder clearRespHeaderSize() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespHeaderSize();
            return this;
        }

        public Builder clearRespHeaderStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespHeaderStart();
            return this;
        }

        public Builder clearRespPackageSize() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespPackageSize();
            return this;
        }

        public Builder clearRespStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearRespStart();
            return this;
        }

        public Builder clearSocketReuse() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearSocketReuse();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearStart();
            return this;
        }

        public Builder clearStreamProtocl() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearStreamProtocl();
            return this;
        }

        public Builder clearTlsCost() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearTlsCost();
            return this;
        }

        public Builder clearTlsEnd() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearTlsEnd();
            return this;
        }

        public Builder clearTlsStart() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearTlsStart();
            return this;
        }

        public Builder clearUsingBestInterface() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearUsingBestInterface();
            return this;
        }

        public Builder clearUsingQuic() {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).clearUsingQuic();
            return this;
        }

        public String getAvailableInterfaces() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getAvailableInterfaces();
        }

        public ByteString getAvailableInterfacesBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getAvailableInterfacesBytes();
        }

        public String getCNetKb() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCNetKb();
        }

        public ByteString getCNetKbBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCNetKbBytes();
        }

        public String getCNetKbTime() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCNetKbTime();
        }

        public ByteString getCNetKbTimeBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCNetKbTimeBytes();
        }

        public String getCNetSuccessRate() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCNetSuccessRate();
        }

        public ByteString getCNetSuccessRateBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCNetSuccessRateBytes();
        }

        public String getCongestionControlAlgorithm() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCongestionControlAlgorithm();
        }

        public ByteString getCongestionControlAlgorithmBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCongestionControlAlgorithmBytes();
        }

        public long getConnectCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getConnectCost();
        }

        public long getConnectEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getConnectEnd();
        }

        public long getConnectStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getConnectStart();
        }

        public long getCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCost();
        }

        public CrNq getCrNq() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getCrNq();
        }

        public long getDnsCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getDnsCost();
        }

        public long getDnsEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getDnsEnd();
        }

        public String getDnsProvider() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getDnsProvider();
        }

        public ByteString getDnsProviderBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getDnsProviderBytes();
        }

        public long getDnsStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getDnsStart();
        }

        public long getEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getEnd();
        }

        public String getErrorRecords() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getErrorRecords();
        }

        public ByteString getErrorRecordsBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getErrorRecordsBytes();
        }

        public String getExtraFlag() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getExtraFlag();
        }

        public ByteString getExtraFlagBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getExtraFlagBytes();
        }

        public String getHostResolveIps(int i7) {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getHostResolveIps(i7);
        }

        public ByteString getHostResolveIpsBytes(int i7) {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getHostResolveIpsBytes(i7);
        }

        public int getHostResolveIpsCount() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getHostResolveIpsCount();
        }

        public List<String> getHostResolveIpsList() {
            return Collections.unmodifiableList(((Metrics) ((GeneratedMessageLite.Builder) this).instance).getHostResolveIpsList());
        }

        public String getJobType() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getJobType();
        }

        public ByteString getJobTypeBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getJobTypeBytes();
        }

        public String getQuicProtocolId() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getQuicProtocolId();
        }

        public ByteString getQuicProtocolIdBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getQuicProtocolIdBytes();
        }

        public String getRemoteIp() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRemoteIp();
        }

        public ByteString getRemoteIpBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRemoteIpBytes();
        }

        public long getReqBodyCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqBodyCost();
        }

        public long getReqBodyEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqBodyEnd();
        }

        public long getReqBodySize() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqBodySize();
        }

        public long getReqBodyStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqBodyStart();
        }

        public long getReqCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqCost();
        }

        public long getReqEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqEnd();
        }

        public long getReqHeaderCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqHeaderCost();
        }

        public long getReqHeaderEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqHeaderEnd();
        }

        public long getReqHeaderSize() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqHeaderSize();
        }

        public long getReqHeaderStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqHeaderStart();
        }

        public long getReqPackageSize() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqPackageSize();
        }

        public long getReqStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getReqStart();
        }

        public long getRespBodyCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespBodyCost();
        }

        public long getRespBodyEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespBodyEnd();
        }

        public long getRespBodySize() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespBodySize();
        }

        public long getRespBodyStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespBodyStart();
        }

        public long getRespCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespCost();
        }

        public long getRespEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespEnd();
        }

        public long getRespHeaderCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespHeaderCost();
        }

        public long getRespHeaderEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespHeaderEnd();
        }

        public long getRespHeaderSize() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespHeaderSize();
        }

        public long getRespHeaderStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespHeaderStart();
        }

        public long getRespPackageSize() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespPackageSize();
        }

        public long getRespStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getRespStart();
        }

        public boolean getSocketReuse() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getSocketReuse();
        }

        public long getStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getStart();
        }

        public String getStreamProtocl() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getStreamProtocl();
        }

        public ByteString getStreamProtoclBytes() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getStreamProtoclBytes();
        }

        public long getTlsCost() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getTlsCost();
        }

        public long getTlsEnd() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getTlsEnd();
        }

        public long getTlsStart() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getTlsStart();
        }

        public int getUsingBestInterface() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getUsingBestInterface();
        }

        public boolean getUsingQuic() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).getUsingQuic();
        }

        public boolean hasCrNq() {
            return ((Metrics) ((GeneratedMessageLite.Builder) this).instance).hasCrNq();
        }

        public Builder mergeCrNq(CrNq crNq) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).mergeCrNq(crNq);
            return this;
        }

        public Builder setAvailableInterfaces(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setAvailableInterfaces(str);
            return this;
        }

        public Builder setAvailableInterfacesBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setAvailableInterfacesBytes(byteString);
            return this;
        }

        public Builder setCNetKb(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCNetKb(str);
            return this;
        }

        public Builder setCNetKbBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCNetKbBytes(byteString);
            return this;
        }

        public Builder setCNetKbTime(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCNetKbTime(str);
            return this;
        }

        public Builder setCNetKbTimeBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCNetKbTimeBytes(byteString);
            return this;
        }

        public Builder setCNetSuccessRate(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCNetSuccessRate(str);
            return this;
        }

        public Builder setCNetSuccessRateBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCNetSuccessRateBytes(byteString);
            return this;
        }

        public Builder setCongestionControlAlgorithm(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCongestionControlAlgorithm(str);
            return this;
        }

        public Builder setCongestionControlAlgorithmBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCongestionControlAlgorithmBytes(byteString);
            return this;
        }

        public Builder setConnectCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setConnectCost(j7);
            return this;
        }

        public Builder setConnectEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setConnectEnd(j7);
            return this;
        }

        public Builder setConnectStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setConnectStart(j7);
            return this;
        }

        public Builder setCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCost(j7);
            return this;
        }

        public Builder setCrNq(CrNq.Builder builder) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCrNq((CrNq) builder.build());
            return this;
        }

        public Builder setCrNq(CrNq crNq) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setCrNq(crNq);
            return this;
        }

        public Builder setDnsCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setDnsCost(j7);
            return this;
        }

        public Builder setDnsEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setDnsEnd(j7);
            return this;
        }

        public Builder setDnsProvider(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setDnsProvider(str);
            return this;
        }

        public Builder setDnsProviderBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setDnsProviderBytes(byteString);
            return this;
        }

        public Builder setDnsStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setDnsStart(j7);
            return this;
        }

        public Builder setEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setEnd(j7);
            return this;
        }

        public Builder setErrorRecords(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setErrorRecords(str);
            return this;
        }

        public Builder setErrorRecordsBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setErrorRecordsBytes(byteString);
            return this;
        }

        public Builder setExtraFlag(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setExtraFlag(str);
            return this;
        }

        public Builder setExtraFlagBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setExtraFlagBytes(byteString);
            return this;
        }

        public Builder setHostResolveIps(int i7, String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setHostResolveIps(i7, str);
            return this;
        }

        public Builder setJobType(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setJobType(str);
            return this;
        }

        public Builder setJobTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setJobTypeBytes(byteString);
            return this;
        }

        public Builder setQuicProtocolId(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setQuicProtocolId(str);
            return this;
        }

        public Builder setQuicProtocolIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setQuicProtocolIdBytes(byteString);
            return this;
        }

        public Builder setRemoteIp(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRemoteIp(str);
            return this;
        }

        public Builder setRemoteIpBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRemoteIpBytes(byteString);
            return this;
        }

        public Builder setReqBodyCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqBodyCost(j7);
            return this;
        }

        public Builder setReqBodyEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqBodyEnd(j7);
            return this;
        }

        public Builder setReqBodySize(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqBodySize(j7);
            return this;
        }

        public Builder setReqBodyStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqBodyStart(j7);
            return this;
        }

        public Builder setReqCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqCost(j7);
            return this;
        }

        public Builder setReqEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqEnd(j7);
            return this;
        }

        public Builder setReqHeaderCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqHeaderCost(j7);
            return this;
        }

        public Builder setReqHeaderEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqHeaderEnd(j7);
            return this;
        }

        public Builder setReqHeaderSize(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqHeaderSize(j7);
            return this;
        }

        public Builder setReqHeaderStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqHeaderStart(j7);
            return this;
        }

        public Builder setReqPackageSize(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqPackageSize(j7);
            return this;
        }

        public Builder setReqStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setReqStart(j7);
            return this;
        }

        public Builder setRespBodyCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespBodyCost(j7);
            return this;
        }

        public Builder setRespBodyEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespBodyEnd(j7);
            return this;
        }

        public Builder setRespBodySize(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespBodySize(j7);
            return this;
        }

        public Builder setRespBodyStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespBodyStart(j7);
            return this;
        }

        public Builder setRespCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespCost(j7);
            return this;
        }

        public Builder setRespEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespEnd(j7);
            return this;
        }

        public Builder setRespHeaderCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespHeaderCost(j7);
            return this;
        }

        public Builder setRespHeaderEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespHeaderEnd(j7);
            return this;
        }

        public Builder setRespHeaderSize(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespHeaderSize(j7);
            return this;
        }

        public Builder setRespHeaderStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespHeaderStart(j7);
            return this;
        }

        public Builder setRespPackageSize(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespPackageSize(j7);
            return this;
        }

        public Builder setRespStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setRespStart(j7);
            return this;
        }

        public Builder setSocketReuse(boolean z6) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setSocketReuse(z6);
            return this;
        }

        public Builder setStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setStart(j7);
            return this;
        }

        public Builder setStreamProtocl(String str) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setStreamProtocl(str);
            return this;
        }

        public Builder setStreamProtoclBytes(ByteString byteString) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setStreamProtoclBytes(byteString);
            return this;
        }

        public Builder setTlsCost(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setTlsCost(j7);
            return this;
        }

        public Builder setTlsEnd(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setTlsEnd(j7);
            return this;
        }

        public Builder setTlsStart(long j7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setTlsStart(j7);
            return this;
        }

        public Builder setUsingBestInterface(int i7) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setUsingBestInterface(i7);
            return this;
        }

        public Builder setUsingQuic(boolean z6) {
            copyOnWrite();
            ((Metrics) ((GeneratedMessageLite.Builder) this).instance).setUsingQuic(z6);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Metrics$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64367a;

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
                com.bilibili.lib.rpc.track.model.Metrics.a.f64367a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.Metrics.a.f64367a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.Metrics.a.f64367a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.Metrics.a.f64367a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.Metrics.a.f64367a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.Metrics.a.f64367a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.Metrics.a.f64367a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.Metrics.a.m6730clinit():void");
        }
    }

    static {
        Metrics metrics = new Metrics();
        DEFAULT_INSTANCE = metrics;
        GeneratedMessageLite.registerDefaultInstance(Metrics.class, metrics);
    }

    private Metrics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHostResolveIps(Iterable<String> iterable) {
        ensureHostResolveIpsIsMutable();
        AbstractMessageLite.addAll(iterable, this.hostResolveIps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHostResolveIps(String str) {
        str.getClass();
        ensureHostResolveIpsIsMutable();
        this.hostResolveIps_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHostResolveIpsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureHostResolveIpsIsMutable();
        this.hostResolveIps_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableInterfaces() {
        this.availableInterfaces_ = getDefaultInstance().getAvailableInterfaces();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCNetKb() {
        this.cNetKb_ = getDefaultInstance().getCNetKb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCNetKbTime() {
        this.cNetKbTime_ = getDefaultInstance().getCNetKbTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCNetSuccessRate() {
        this.cNetSuccessRate_ = getDefaultInstance().getCNetSuccessRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCongestionControlAlgorithm() {
        this.congestionControlAlgorithm_ = getDefaultInstance().getCongestionControlAlgorithm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectCost() {
        this.connectCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectEnd() {
        this.connectEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectStart() {
        this.connectStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCost() {
        this.cost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrNq() {
        this.crNq_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnsCost() {
        this.dnsCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnsEnd() {
        this.dnsEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnsProvider() {
        this.dnsProvider_ = getDefaultInstance().getDnsProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnsStart() {
        this.dnsStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorRecords() {
        this.errorRecords_ = getDefaultInstance().getErrorRecords();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraFlag() {
        this.extraFlag_ = getDefaultInstance().getExtraFlag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHostResolveIps() {
        this.hostResolveIps_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobType() {
        this.jobType_ = getDefaultInstance().getJobType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicProtocolId() {
        this.quicProtocolId_ = getDefaultInstance().getQuicProtocolId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoteIp() {
        this.remoteIp_ = getDefaultInstance().getRemoteIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqBodyCost() {
        this.reqBodyCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqBodyEnd() {
        this.reqBodyEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqBodySize() {
        this.reqBodySize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqBodyStart() {
        this.reqBodyStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqCost() {
        this.reqCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqEnd() {
        this.reqEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqHeaderCost() {
        this.reqHeaderCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqHeaderEnd() {
        this.reqHeaderEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqHeaderSize() {
        this.reqHeaderSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqHeaderStart() {
        this.reqHeaderStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqPackageSize() {
        this.reqPackageSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqStart() {
        this.reqStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespBodyCost() {
        this.respBodyCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespBodyEnd() {
        this.respBodyEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespBodySize() {
        this.respBodySize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespBodyStart() {
        this.respBodyStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespCost() {
        this.respCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespEnd() {
        this.respEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespHeaderCost() {
        this.respHeaderCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespHeaderEnd() {
        this.respHeaderEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespHeaderSize() {
        this.respHeaderSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespHeaderStart() {
        this.respHeaderStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespPackageSize() {
        this.respPackageSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRespStart() {
        this.respStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSocketReuse() {
        this.socketReuse_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamProtocl() {
        this.streamProtocl_ = getDefaultInstance().getStreamProtocl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTlsCost() {
        this.tlsCost_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTlsEnd() {
        this.tlsEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTlsStart() {
        this.tlsStart_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsingBestInterface() {
        this.usingBestInterface_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsingQuic() {
        this.usingQuic_ = false;
    }

    private void ensureHostResolveIpsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.hostResolveIps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.hostResolveIps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Metrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrNq(CrNq crNq) {
        crNq.getClass();
        CrNq crNq2 = this.crNq_;
        if (crNq2 == null || crNq2 == CrNq.getDefaultInstance()) {
            this.crNq_ = crNq;
        } else {
            this.crNq_ = (CrNq) ((CrNq.Builder) CrNq.newBuilder(this.crNq_).mergeFrom(crNq)).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Metrics metrics) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(metrics);
    }

    public static Metrics parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Metrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metrics parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Metrics parseFrom(InputStream inputStream) throws IOException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Metrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Metrics> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableInterfaces(String str) {
        str.getClass();
        this.availableInterfaces_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableInterfacesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.availableInterfaces_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCNetKb(String str) {
        str.getClass();
        this.cNetKb_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCNetKbBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cNetKb_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCNetKbTime(String str) {
        str.getClass();
        this.cNetKbTime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCNetKbTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cNetKbTime_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCNetSuccessRate(String str) {
        str.getClass();
        this.cNetSuccessRate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCNetSuccessRateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cNetSuccessRate_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCongestionControlAlgorithm(String str) {
        str.getClass();
        this.congestionControlAlgorithm_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCongestionControlAlgorithmBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.congestionControlAlgorithm_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectCost(long j7) {
        this.connectCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectEnd(long j7) {
        this.connectEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectStart(long j7) {
        this.connectStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCost(long j7) {
        this.cost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrNq(CrNq crNq) {
        crNq.getClass();
        this.crNq_ = crNq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnsCost(long j7) {
        this.dnsCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnsEnd(long j7) {
        this.dnsEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnsProvider(String str) {
        str.getClass();
        this.dnsProvider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnsProviderBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dnsProvider_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnsStart(long j7) {
        this.dnsStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j7) {
        this.end_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorRecords(String str) {
        str.getClass();
        this.errorRecords_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorRecordsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorRecords_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraFlag(String str) {
        str.getClass();
        this.extraFlag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraFlagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraFlag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostResolveIps(int i7, String str) {
        str.getClass();
        ensureHostResolveIpsIsMutable();
        this.hostResolveIps_.set(i7, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobType(String str) {
        str.getClass();
        this.jobType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jobType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicProtocolId(String str) {
        str.getClass();
        this.quicProtocolId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicProtocolIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.quicProtocolId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteIp(String str) {
        str.getClass();
        this.remoteIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteIpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.remoteIp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqBodyCost(long j7) {
        this.reqBodyCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqBodyEnd(long j7) {
        this.reqBodyEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqBodySize(long j7) {
        this.reqBodySize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqBodyStart(long j7) {
        this.reqBodyStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqCost(long j7) {
        this.reqCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqEnd(long j7) {
        this.reqEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqHeaderCost(long j7) {
        this.reqHeaderCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqHeaderEnd(long j7) {
        this.reqHeaderEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqHeaderSize(long j7) {
        this.reqHeaderSize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqHeaderStart(long j7) {
        this.reqHeaderStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqPackageSize(long j7) {
        this.reqPackageSize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqStart(long j7) {
        this.reqStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespBodyCost(long j7) {
        this.respBodyCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespBodyEnd(long j7) {
        this.respBodyEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespBodySize(long j7) {
        this.respBodySize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespBodyStart(long j7) {
        this.respBodyStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespCost(long j7) {
        this.respCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespEnd(long j7) {
        this.respEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespHeaderCost(long j7) {
        this.respHeaderCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespHeaderEnd(long j7) {
        this.respHeaderEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespHeaderSize(long j7) {
        this.respHeaderSize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespHeaderStart(long j7) {
        this.respHeaderStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespPackageSize(long j7) {
        this.respPackageSize_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRespStart(long j7) {
        this.respStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSocketReuse(boolean z6) {
        this.socketReuse_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j7) {
        this.start_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamProtocl(String str) {
        str.getClass();
        this.streamProtocl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamProtoclBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.streamProtocl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTlsCost(long j7) {
        this.tlsCost_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTlsEnd(long j7) {
        this.tlsEnd_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTlsStart(long j7) {
        this.tlsStart_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsingBestInterface(int i7) {
        this.usingBestInterface_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsingQuic(boolean z6) {
        this.usingQuic_ = z6;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64367a[methodToInvoke.ordinal()]) {
            case 1:
                return new Metrics();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u00005\u0000\u0000\u000155\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u0002\n\u0002\u000b\u0002\f\u0002\r\u0002\u000e\u0002\u000f\u0002\u0010\u0002\u0011\u0002\u0012\u0002\u0013\u0002\u0014\u0002\u0015\u0002\u0016\u0002\u0017\u0002\u0018\u0002\u0019\u0002\u001a\u0002\u001b\u0002\u001c\u0002\u001d\u0002\u001e\u0002\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%\u0007&Ȉ'Ȉ(Ț)Ȉ*\t+Ȉ,\u0007-Ȉ.Ȉ/Ȉ0Ȉ1Ȉ2Ȉ3Ȉ4\u00045Ȉ", new Object[]{"start_", "dnsStart_", "dnsEnd_", "dnsCost_", "connectStart_", "tlsStart_", "tlsEnd_", "tlsCost_", "connectEnd_", "connectCost_", "reqStart_", "reqHeaderStart_", "reqHeaderEnd_", "reqHeaderCost_", "reqBodyStart_", "reqBodyEnd_", "reqBodyCost_", "reqEnd_", "reqCost_", "respStart_", "respHeaderStart_", "respHeaderEnd_", "respHeaderCost_", "respBodyStart_", "respBodyEnd_", "respBodyCost_", "respEnd_", "respCost_", "reqHeaderSize_", "reqBodySize_", "reqPackageSize_", "respHeaderSize_", "respBodySize_", "respPackageSize_", "end_", "cost_", "socketReuse_", "remoteIp_", "dnsProvider_", "hostResolveIps_", "jobType_", "crNq_", "streamProtocl_", "usingQuic_", "quicProtocolId_", "errorRecords_", "cNetSuccessRate_", "cNetKb_", "cNetKbTime_", "extraFlag_", "congestionControlAlgorithm_", "usingBestInterface_", "availableInterfaces_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Metrics.class) {
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

    public String getAvailableInterfaces() {
        return this.availableInterfaces_;
    }

    public ByteString getAvailableInterfacesBytes() {
        return ByteString.copyFromUtf8(this.availableInterfaces_);
    }

    public String getCNetKb() {
        return this.cNetKb_;
    }

    public ByteString getCNetKbBytes() {
        return ByteString.copyFromUtf8(this.cNetKb_);
    }

    public String getCNetKbTime() {
        return this.cNetKbTime_;
    }

    public ByteString getCNetKbTimeBytes() {
        return ByteString.copyFromUtf8(this.cNetKbTime_);
    }

    public String getCNetSuccessRate() {
        return this.cNetSuccessRate_;
    }

    public ByteString getCNetSuccessRateBytes() {
        return ByteString.copyFromUtf8(this.cNetSuccessRate_);
    }

    public String getCongestionControlAlgorithm() {
        return this.congestionControlAlgorithm_;
    }

    public ByteString getCongestionControlAlgorithmBytes() {
        return ByteString.copyFromUtf8(this.congestionControlAlgorithm_);
    }

    public long getConnectCost() {
        return this.connectCost_;
    }

    public long getConnectEnd() {
        return this.connectEnd_;
    }

    public long getConnectStart() {
        return this.connectStart_;
    }

    public long getCost() {
        return this.cost_;
    }

    public CrNq getCrNq() {
        CrNq crNq = this.crNq_;
        CrNq defaultInstance = crNq;
        if (crNq == null) {
            defaultInstance = CrNq.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getDnsCost() {
        return this.dnsCost_;
    }

    public long getDnsEnd() {
        return this.dnsEnd_;
    }

    public String getDnsProvider() {
        return this.dnsProvider_;
    }

    public ByteString getDnsProviderBytes() {
        return ByteString.copyFromUtf8(this.dnsProvider_);
    }

    public long getDnsStart() {
        return this.dnsStart_;
    }

    public long getEnd() {
        return this.end_;
    }

    public String getErrorRecords() {
        return this.errorRecords_;
    }

    public ByteString getErrorRecordsBytes() {
        return ByteString.copyFromUtf8(this.errorRecords_);
    }

    public String getExtraFlag() {
        return this.extraFlag_;
    }

    public ByteString getExtraFlagBytes() {
        return ByteString.copyFromUtf8(this.extraFlag_);
    }

    public String getHostResolveIps(int i7) {
        return (String) this.hostResolveIps_.get(i7);
    }

    public ByteString getHostResolveIpsBytes(int i7) {
        return ByteString.copyFromUtf8((String) this.hostResolveIps_.get(i7));
    }

    public int getHostResolveIpsCount() {
        return this.hostResolveIps_.size();
    }

    public List<String> getHostResolveIpsList() {
        return this.hostResolveIps_;
    }

    public String getJobType() {
        return this.jobType_;
    }

    public ByteString getJobTypeBytes() {
        return ByteString.copyFromUtf8(this.jobType_);
    }

    public String getQuicProtocolId() {
        return this.quicProtocolId_;
    }

    public ByteString getQuicProtocolIdBytes() {
        return ByteString.copyFromUtf8(this.quicProtocolId_);
    }

    public String getRemoteIp() {
        return this.remoteIp_;
    }

    public ByteString getRemoteIpBytes() {
        return ByteString.copyFromUtf8(this.remoteIp_);
    }

    public long getReqBodyCost() {
        return this.reqBodyCost_;
    }

    public long getReqBodyEnd() {
        return this.reqBodyEnd_;
    }

    public long getReqBodySize() {
        return this.reqBodySize_;
    }

    public long getReqBodyStart() {
        return this.reqBodyStart_;
    }

    public long getReqCost() {
        return this.reqCost_;
    }

    public long getReqEnd() {
        return this.reqEnd_;
    }

    public long getReqHeaderCost() {
        return this.reqHeaderCost_;
    }

    public long getReqHeaderEnd() {
        return this.reqHeaderEnd_;
    }

    public long getReqHeaderSize() {
        return this.reqHeaderSize_;
    }

    public long getReqHeaderStart() {
        return this.reqHeaderStart_;
    }

    public long getReqPackageSize() {
        return this.reqPackageSize_;
    }

    public long getReqStart() {
        return this.reqStart_;
    }

    public long getRespBodyCost() {
        return this.respBodyCost_;
    }

    public long getRespBodyEnd() {
        return this.respBodyEnd_;
    }

    public long getRespBodySize() {
        return this.respBodySize_;
    }

    public long getRespBodyStart() {
        return this.respBodyStart_;
    }

    public long getRespCost() {
        return this.respCost_;
    }

    public long getRespEnd() {
        return this.respEnd_;
    }

    public long getRespHeaderCost() {
        return this.respHeaderCost_;
    }

    public long getRespHeaderEnd() {
        return this.respHeaderEnd_;
    }

    public long getRespHeaderSize() {
        return this.respHeaderSize_;
    }

    public long getRespHeaderStart() {
        return this.respHeaderStart_;
    }

    public long getRespPackageSize() {
        return this.respPackageSize_;
    }

    public long getRespStart() {
        return this.respStart_;
    }

    public boolean getSocketReuse() {
        return this.socketReuse_;
    }

    public long getStart() {
        return this.start_;
    }

    public String getStreamProtocl() {
        return this.streamProtocl_;
    }

    public ByteString getStreamProtoclBytes() {
        return ByteString.copyFromUtf8(this.streamProtocl_);
    }

    public long getTlsCost() {
        return this.tlsCost_;
    }

    public long getTlsEnd() {
        return this.tlsEnd_;
    }

    public long getTlsStart() {
        return this.tlsStart_;
    }

    public int getUsingBestInterface() {
        return this.usingBestInterface_;
    }

    public boolean getUsingQuic() {
        return this.usingQuic_;
    }

    public boolean hasCrNq() {
        return this.crNq_ != null;
    }
}
