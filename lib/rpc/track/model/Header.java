package com.bilibili.lib.rpc.track.model;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Header.class */
public final class Header extends GeneratedMessageLite<Header, Builder> implements MessageLiteOrBuilder {
    public static final int AURORA_PATH_ROUTE_FIELD_NUMBER = 27;
    public static final int AURORA_ZONE_FIELD_NUMBER = 28;
    public static final int BIZ_CODE_FIELD_NUMBER = 24;
    public static final int CONTENT_ENCODING_FIELD_NUMBER = 26;
    private static final Header DEFAULT_INSTANCE;
    public static final int FLOW_CONTROL_FIELD_NUMBER = 25;
    public static final int GRPC_STATUS_FIELD_NUMBER = 6;
    public static final int IDC_FIELD_NUMBER = 5;
    private static volatile Parser<Header> PARSER;
    public static final int TICKET_STATUS_FIELD_NUMBER = 32;
    public static final int TRACE_ID_FIELD_NUMBER = 4;
    public static final int VIA_FIELD_NUMBER = 2;
    public static final int V_VOUCHER_FIELD_NUMBER = 31;
    public static final int XCACHE_FIELD_NUMBER = 1;
    public static final int XCACHE_WEBCDN_FIELD_NUMBER = 3;
    private String xcache_ = "";
    private String via_ = "";
    private String xcacheWebcdn_ = "";
    private String traceId_ = "";
    private String idc_ = "";
    private String grpcStatus_ = "";
    private String bizCode_ = "";
    private String flowControl_ = "";
    private String contentEncoding_ = "";
    private String auroraPathRoute_ = "";
    private String auroraZone_ = "";
    private String vVoucher_ = "";
    private String ticketStatus_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Header$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<Header, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(Header.DEFAULT_INSTANCE);
        }

        public Builder clearAuroraPathRoute() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearAuroraPathRoute();
            return this;
        }

        public Builder clearAuroraZone() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearAuroraZone();
            return this;
        }

        public Builder clearBizCode() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearBizCode();
            return this;
        }

        public Builder clearContentEncoding() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearContentEncoding();
            return this;
        }

        public Builder clearFlowControl() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearFlowControl();
            return this;
        }

        public Builder clearGrpcStatus() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearGrpcStatus();
            return this;
        }

        public Builder clearIdc() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearIdc();
            return this;
        }

        public Builder clearTicketStatus() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearTicketStatus();
            return this;
        }

        public Builder clearTraceId() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearTraceId();
            return this;
        }

        public Builder clearVVoucher() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearVVoucher();
            return this;
        }

        public Builder clearVia() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearVia();
            return this;
        }

        public Builder clearXcache() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearXcache();
            return this;
        }

        public Builder clearXcacheWebcdn() {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).clearXcacheWebcdn();
            return this;
        }

        public String getAuroraPathRoute() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getAuroraPathRoute();
        }

        public ByteString getAuroraPathRouteBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getAuroraPathRouteBytes();
        }

        public String getAuroraZone() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getAuroraZone();
        }

        public ByteString getAuroraZoneBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getAuroraZoneBytes();
        }

        public String getBizCode() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getBizCode();
        }

        public ByteString getBizCodeBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getBizCodeBytes();
        }

        public String getContentEncoding() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getContentEncoding();
        }

        public ByteString getContentEncodingBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getContentEncodingBytes();
        }

        public String getFlowControl() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getFlowControl();
        }

        public ByteString getFlowControlBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getFlowControlBytes();
        }

        public String getGrpcStatus() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getGrpcStatus();
        }

        public ByteString getGrpcStatusBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getGrpcStatusBytes();
        }

        public String getIdc() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getIdc();
        }

        public ByteString getIdcBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getIdcBytes();
        }

        public String getTicketStatus() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getTicketStatus();
        }

        public ByteString getTicketStatusBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getTicketStatusBytes();
        }

        public String getTraceId() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getTraceId();
        }

        public ByteString getTraceIdBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getTraceIdBytes();
        }

        public String getVVoucher() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getVVoucher();
        }

        public ByteString getVVoucherBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getVVoucherBytes();
        }

        public String getVia() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getVia();
        }

        public ByteString getViaBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getViaBytes();
        }

        public String getXcache() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getXcache();
        }

        public ByteString getXcacheBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getXcacheBytes();
        }

        public String getXcacheWebcdn() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getXcacheWebcdn();
        }

        public ByteString getXcacheWebcdnBytes() {
            return ((Header) ((GeneratedMessageLite.Builder) this).instance).getXcacheWebcdnBytes();
        }

        public Builder setAuroraPathRoute(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setAuroraPathRoute(str);
            return this;
        }

        public Builder setAuroraPathRouteBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setAuroraPathRouteBytes(byteString);
            return this;
        }

        public Builder setAuroraZone(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setAuroraZone(str);
            return this;
        }

        public Builder setAuroraZoneBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setAuroraZoneBytes(byteString);
            return this;
        }

        public Builder setBizCode(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setBizCode(str);
            return this;
        }

        public Builder setBizCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setBizCodeBytes(byteString);
            return this;
        }

        public Builder setContentEncoding(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setContentEncoding(str);
            return this;
        }

        public Builder setContentEncodingBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setContentEncodingBytes(byteString);
            return this;
        }

        public Builder setFlowControl(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setFlowControl(str);
            return this;
        }

        public Builder setFlowControlBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setFlowControlBytes(byteString);
            return this;
        }

        public Builder setGrpcStatus(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setGrpcStatus(str);
            return this;
        }

        public Builder setGrpcStatusBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setGrpcStatusBytes(byteString);
            return this;
        }

        public Builder setIdc(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setIdc(str);
            return this;
        }

        public Builder setIdcBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setIdcBytes(byteString);
            return this;
        }

        public Builder setTicketStatus(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setTicketStatus(str);
            return this;
        }

        public Builder setTicketStatusBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setTicketStatusBytes(byteString);
            return this;
        }

        public Builder setTraceId(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setTraceId(str);
            return this;
        }

        public Builder setTraceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setTraceIdBytes(byteString);
            return this;
        }

        public Builder setVVoucher(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setVVoucher(str);
            return this;
        }

        public Builder setVVoucherBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setVVoucherBytes(byteString);
            return this;
        }

        public Builder setVia(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setVia(str);
            return this;
        }

        public Builder setViaBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setViaBytes(byteString);
            return this;
        }

        public Builder setXcache(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setXcache(str);
            return this;
        }

        public Builder setXcacheBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setXcacheBytes(byteString);
            return this;
        }

        public Builder setXcacheWebcdn(String str) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setXcacheWebcdn(str);
            return this;
        }

        public Builder setXcacheWebcdnBytes(ByteString byteString) {
            copyOnWrite();
            ((Header) ((GeneratedMessageLite.Builder) this).instance).setXcacheWebcdnBytes(byteString);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/Header$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64366a;

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
                com.bilibili.lib.rpc.track.model.Header.a.f64366a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.Header.a.f64366a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.Header.a.f64366a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.Header.a.f64366a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.Header.a.f64366a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.Header.a.f64366a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.Header.a.f64366a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.Header.a.m6728clinit():void");
        }
    }

    static {
        Header header = new Header();
        DEFAULT_INSTANCE = header;
        GeneratedMessageLite.registerDefaultInstance(Header.class, header);
    }

    private Header() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuroraPathRoute() {
        this.auroraPathRoute_ = getDefaultInstance().getAuroraPathRoute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuroraZone() {
        this.auroraZone_ = getDefaultInstance().getAuroraZone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizCode() {
        this.bizCode_ = getDefaultInstance().getBizCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentEncoding() {
        this.contentEncoding_ = getDefaultInstance().getContentEncoding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlowControl() {
        this.flowControl_ = getDefaultInstance().getFlowControl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGrpcStatus() {
        this.grpcStatus_ = getDefaultInstance().getGrpcStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdc() {
        this.idc_ = getDefaultInstance().getIdc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTicketStatus() {
        this.ticketStatus_ = getDefaultInstance().getTicketStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVVoucher() {
        this.vVoucher_ = getDefaultInstance().getVVoucher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVia() {
        this.via_ = getDefaultInstance().getVia();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearXcache() {
        this.xcache_ = getDefaultInstance().getXcache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearXcacheWebcdn() {
        this.xcacheWebcdn_ = getDefaultInstance().getXcacheWebcdn();
    }

    public static Header getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Header header) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(header);
    }

    public static Header parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Header) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Header parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Header) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Header parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Header parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Header parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Header parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Header parseFrom(InputStream inputStream) throws IOException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Header parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Header parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Header parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Header parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Header parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Header) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Header> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuroraPathRoute(String str) {
        str.getClass();
        this.auroraPathRoute_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuroraPathRouteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.auroraPathRoute_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuroraZone(String str) {
        str.getClass();
        this.auroraZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuroraZoneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.auroraZone_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizCode(String str) {
        str.getClass();
        this.bizCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentEncoding(String str) {
        str.getClass();
        this.contentEncoding_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentEncodingBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contentEncoding_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowControl(String str) {
        str.getClass();
        this.flowControl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowControlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.flowControl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrpcStatus(String str) {
        str.getClass();
        this.grpcStatus_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrpcStatusBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.grpcStatus_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdc(String str) {
        str.getClass();
        this.idc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdcBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicketStatus(String str) {
        str.getClass();
        this.ticketStatus_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicketStatusBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ticketStatus_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(String str) {
        str.getClass();
        this.traceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.traceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVVoucher(String str) {
        str.getClass();
        this.vVoucher_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVVoucherBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vVoucher_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVia(String str) {
        str.getClass();
        this.via_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.via_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXcache(String str) {
        str.getClass();
        this.xcache_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXcacheBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.xcache_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXcacheWebcdn(String str) {
        str.getClass();
        this.xcacheWebcdn_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXcacheWebcdnBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.xcacheWebcdn_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64366a[methodToInvoke.ordinal()]) {
            case 1:
                return new Header();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001 \r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0018Ȉ\u0019Ȉ\u001aȈ\u001bȈ\u001cȈ\u001fȈ Ȉ", new Object[]{"xcache_", "via_", "xcacheWebcdn_", "traceId_", "idc_", "grpcStatus_", "bizCode_", "flowControl_", "contentEncoding_", "auroraPathRoute_", "auroraZone_", "vVoucher_", "ticketStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Header.class) {
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

    public String getAuroraPathRoute() {
        return this.auroraPathRoute_;
    }

    public ByteString getAuroraPathRouteBytes() {
        return ByteString.copyFromUtf8(this.auroraPathRoute_);
    }

    public String getAuroraZone() {
        return this.auroraZone_;
    }

    public ByteString getAuroraZoneBytes() {
        return ByteString.copyFromUtf8(this.auroraZone_);
    }

    public String getBizCode() {
        return this.bizCode_;
    }

    public ByteString getBizCodeBytes() {
        return ByteString.copyFromUtf8(this.bizCode_);
    }

    public String getContentEncoding() {
        return this.contentEncoding_;
    }

    public ByteString getContentEncodingBytes() {
        return ByteString.copyFromUtf8(this.contentEncoding_);
    }

    public String getFlowControl() {
        return this.flowControl_;
    }

    public ByteString getFlowControlBytes() {
        return ByteString.copyFromUtf8(this.flowControl_);
    }

    public String getGrpcStatus() {
        return this.grpcStatus_;
    }

    public ByteString getGrpcStatusBytes() {
        return ByteString.copyFromUtf8(this.grpcStatus_);
    }

    public String getIdc() {
        return this.idc_;
    }

    public ByteString getIdcBytes() {
        return ByteString.copyFromUtf8(this.idc_);
    }

    public String getTicketStatus() {
        return this.ticketStatus_;
    }

    public ByteString getTicketStatusBytes() {
        return ByteString.copyFromUtf8(this.ticketStatus_);
    }

    public String getTraceId() {
        return this.traceId_;
    }

    public ByteString getTraceIdBytes() {
        return ByteString.copyFromUtf8(this.traceId_);
    }

    public String getVVoucher() {
        return this.vVoucher_;
    }

    public ByteString getVVoucherBytes() {
        return ByteString.copyFromUtf8(this.vVoucher_);
    }

    public String getVia() {
        return this.via_;
    }

    public ByteString getViaBytes() {
        return ByteString.copyFromUtf8(this.via_);
    }

    public String getXcache() {
        return this.xcache_;
    }

    public ByteString getXcacheBytes() {
        return ByteString.copyFromUtf8(this.xcache_);
    }

    public String getXcacheWebcdn() {
        return this.xcacheWebcdn_;
    }

    public ByteString getXcacheWebcdnBytes() {
        return ByteString.copyFromUtf8(this.xcacheWebcdn_);
    }
}
