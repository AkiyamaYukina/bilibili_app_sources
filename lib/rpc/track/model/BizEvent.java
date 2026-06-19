package com.bilibili.lib.rpc.track.model;

import com.bilibili.lib.rpc.track.model.Header;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/BizEvent.class */
public final class BizEvent extends GeneratedMessageLite<BizEvent, b> implements MessageLiteOrBuilder {
    public static final int BIZ_CODE_FIELD_NUMBER = 13;
    public static final int BIZ_END_FIELD_NUMBER = 22;
    public static final int BIZ_EXCEPTION_MESSAGE_FIELD_NUMBER = 16;
    public static final int BIZ_EXCEPTION_NAME_FIELD_NUMBER = 15;
    public static final int BIZ_MESSAGE_FIELD_NUMBER = 14;
    private static final BizEvent DEFAULT_INSTANCE;
    public static final int FINISH_TIME_FIELD_NUMBER = 7;
    public static final int GRPC_MESSAGE_FIELD_NUMBER = 12;
    public static final int GRPC_STATUS_FIELD_NUMBER = 11;
    public static final int HEADER_FIELD_NUMBER = 9;
    public static final int HOST_FIELD_NUMBER = 3;
    public static final int LOCAL_RPC_TRACE_ID_FIELD_NUMBER = 10;
    public static final int NET_EXCEPTION_MESSAGE_FIELD_NUMBER = 21;
    public static final int NET_EXCEPTION_NAME_FIELD_NUMBER = 20;
    public static final int NET_SUCCESS_FIELD_NUMBER = 19;
    private static volatile Parser<BizEvent> PARSER;
    public static final int PATH_FIELD_NUMBER = 4;
    public static final int REAL_URL_FIELD_NUMBER = 5;
    public static final int REQUEST_TIME_FIELD_NUMBER = 6;
    public static final int RPC_SUCCESS_FIELD_NUMBER = 18;
    public static final int SCHEME_FIELD_NUMBER = 2;
    public static final int TOTAL_TIME_FIELD_NUMBER = 8;
    public static final int TUNNEL_FIELD_NUMBER = 17;
    public static final int URL_FIELD_NUMBER = 1;
    private int bizCode_;
    private boolean bizEnd_;
    private long finishTime_;
    private int grpcStatus_;
    private Header header_;
    private boolean netSuccess_;
    private long requestTime_;
    private boolean rpcSuccess_;
    private long totalTime_;
    private int tunnel_;
    private String url_ = "";
    private String scheme_ = "";
    private String host_ = "";
    private String path_ = "";
    private String realUrl_ = "";
    private String localRpcTraceId_ = "";
    private String grpcMessage_ = "";
    private String bizMessage_ = "";
    private String bizExceptionName_ = "";
    private String bizExceptionMessage_ = "";
    private String netExceptionName_ = "";
    private String netExceptionMessage_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/BizEvent$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64360a;

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
                com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.BizEvent.a.f64360a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.BizEvent.a.m6718clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/BizEvent$b.class */
    public static final class b extends GeneratedMessageLite.Builder<BizEvent, b> implements MessageLiteOrBuilder {
        public b() {
            super(BizEvent.DEFAULT_INSTANCE);
        }

        public final void a(int i7) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setBizCode(i7);
        }

        public final void b(boolean z6) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setBizEnd(z6);
        }

        public final void c(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setBizExceptionMessage(str);
        }

        public final void d(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setBizExceptionName(str);
        }

        public final void e(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setBizMessage(str);
        }

        public final void f(long j7) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setFinishTime(j7);
        }

        public final void g(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setGrpcMessage(str);
        }

        public final long getFinishTime() {
            return ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).getFinishTime();
        }

        public final String getHost() {
            return ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).getHost();
        }

        public final String getPath() {
            return ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).getPath();
        }

        public final long getRequestTime() {
            return ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).getRequestTime();
        }

        public final String getUrl() {
            return ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).getUrl();
        }

        public final void h(int i7) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setGrpcStatus(i7);
        }

        public final void i(Header header) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setHeader(header);
        }

        public final void j(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setHost(str);
        }

        public final void k(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setLocalRpcTraceId(str);
        }

        public final void l(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setNetExceptionMessage(str);
        }

        public final void m(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setNetExceptionName(str);
        }

        public final void n(boolean z6) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setNetSuccess(z6);
        }

        public final void o(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setPath(str);
        }

        public final void p(long j7) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setRequestTime(j7);
        }

        public final void q(boolean z6) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setRpcSuccess(z6);
        }

        public final void r(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setScheme(str);
        }

        public final void s(long j7) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setTotalTime(j7);
        }

        public final void t(Tunnel tunnel) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setTunnel(tunnel);
        }

        public final void u(String str) {
            copyOnWrite();
            ((BizEvent) ((GeneratedMessageLite.Builder) this).instance).setUrl(str);
        }
    }

    static {
        BizEvent bizEvent = new BizEvent();
        DEFAULT_INSTANCE = bizEvent;
        GeneratedMessageLite.registerDefaultInstance(BizEvent.class, bizEvent);
    }

    private BizEvent() {
    }

    private void clearBizCode() {
        this.bizCode_ = 0;
    }

    private void clearBizEnd() {
        this.bizEnd_ = false;
    }

    private void clearBizExceptionMessage() {
        this.bizExceptionMessage_ = getDefaultInstance().getBizExceptionMessage();
    }

    private void clearBizExceptionName() {
        this.bizExceptionName_ = getDefaultInstance().getBizExceptionName();
    }

    private void clearBizMessage() {
        this.bizMessage_ = getDefaultInstance().getBizMessage();
    }

    private void clearFinishTime() {
        this.finishTime_ = 0L;
    }

    private void clearGrpcMessage() {
        this.grpcMessage_ = getDefaultInstance().getGrpcMessage();
    }

    private void clearGrpcStatus() {
        this.grpcStatus_ = 0;
    }

    private void clearHeader() {
        this.header_ = null;
    }

    private void clearHost() {
        this.host_ = getDefaultInstance().getHost();
    }

    private void clearLocalRpcTraceId() {
        this.localRpcTraceId_ = getDefaultInstance().getLocalRpcTraceId();
    }

    private void clearNetExceptionMessage() {
        this.netExceptionMessage_ = getDefaultInstance().getNetExceptionMessage();
    }

    private void clearNetExceptionName() {
        this.netExceptionName_ = getDefaultInstance().getNetExceptionName();
    }

    private void clearNetSuccess() {
        this.netSuccess_ = false;
    }

    private void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    private void clearRealUrl() {
        this.realUrl_ = getDefaultInstance().getRealUrl();
    }

    private void clearRequestTime() {
        this.requestTime_ = 0L;
    }

    private void clearRpcSuccess() {
        this.rpcSuccess_ = false;
    }

    private void clearScheme() {
        this.scheme_ = getDefaultInstance().getScheme();
    }

    private void clearTotalTime() {
        this.totalTime_ = 0L;
    }

    private void clearTunnel() {
        this.tunnel_ = 0;
    }

    private void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static BizEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeHeader(Header header) {
        header.getClass();
        Header header2 = this.header_;
        if (header2 == null || header2 == Header.getDefaultInstance()) {
            this.header_ = header;
        } else {
            this.header_ = (Header) ((Header.Builder) Header.newBuilder(this.header_).mergeFrom(header)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(BizEvent bizEvent) {
        return (b) DEFAULT_INSTANCE.createBuilder(bizEvent);
    }

    public static BizEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BizEvent parseFrom(InputStream inputStream) throws IOException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BizEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<BizEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizCode(int i7) {
        this.bizCode_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizEnd(boolean z6) {
        this.bizEnd_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizExceptionMessage(String str) {
        str.getClass();
        this.bizExceptionMessage_ = str;
    }

    private void setBizExceptionMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizExceptionMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizExceptionName(String str) {
        str.getClass();
        this.bizExceptionName_ = str;
    }

    private void setBizExceptionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizExceptionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizMessage(String str) {
        str.getClass();
        this.bizMessage_ = str;
    }

    private void setBizMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFinishTime(long j7) {
        this.finishTime_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrpcMessage(String str) {
        str.getClass();
        this.grpcMessage_ = str;
    }

    private void setGrpcMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.grpcMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrpcStatus(int i7) {
        this.grpcStatus_ = i7;
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

    private void setHostBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.host_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalRpcTraceId(String str) {
        str.getClass();
        this.localRpcTraceId_ = str;
    }

    private void setLocalRpcTraceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.localRpcTraceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetExceptionMessage(String str) {
        str.getClass();
        this.netExceptionMessage_ = str;
    }

    private void setNetExceptionMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.netExceptionMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetExceptionName(String str) {
        str.getClass();
        this.netExceptionName_ = str;
    }

    private void setNetExceptionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.netExceptionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetSuccess(boolean z6) {
        this.netSuccess_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    private void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
    }

    private void setRealUrl(String str) {
        str.getClass();
        this.realUrl_ = str;
    }

    private void setRealUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.realUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTime(long j7) {
        this.requestTime_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRpcSuccess(boolean z6) {
        this.rpcSuccess_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(String str) {
        str.getClass();
        this.scheme_ = str;
    }

    private void setSchemeBytes(ByteString byteString) {
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

    private void setTunnelValue(int i7) {
        this.tunnel_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    private void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64360a[methodToInvoke.ordinal()]) {
            case 1:
                return new BizEvent();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0000\u0001\u0016\u0016\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007\u0002\b\u0002\t\t\nȈ\u000b\u0004\fȈ\r\u0004\u000eȈ\u000fȈ\u0010Ȉ\u0011\f\u0012\u0007\u0013\u0007\u0014Ȉ\u0015Ȉ\u0016\u0007", new Object[]{"url_", "scheme_", "host_", "path_", "realUrl_", "requestTime_", "finishTime_", "totalTime_", "header_", "localRpcTraceId_", "grpcStatus_", "grpcMessage_", "bizCode_", "bizMessage_", "bizExceptionName_", "bizExceptionMessage_", "tunnel_", "rpcSuccess_", "netSuccess_", "netExceptionName_", "netExceptionMessage_", "bizEnd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BizEvent.class) {
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

    public int getBizCode() {
        return this.bizCode_;
    }

    public boolean getBizEnd() {
        return this.bizEnd_;
    }

    public String getBizExceptionMessage() {
        return this.bizExceptionMessage_;
    }

    public ByteString getBizExceptionMessageBytes() {
        return ByteString.copyFromUtf8(this.bizExceptionMessage_);
    }

    public String getBizExceptionName() {
        return this.bizExceptionName_;
    }

    public ByteString getBizExceptionNameBytes() {
        return ByteString.copyFromUtf8(this.bizExceptionName_);
    }

    public String getBizMessage() {
        return this.bizMessage_;
    }

    public ByteString getBizMessageBytes() {
        return ByteString.copyFromUtf8(this.bizMessage_);
    }

    public long getFinishTime() {
        return this.finishTime_;
    }

    public String getGrpcMessage() {
        return this.grpcMessage_;
    }

    public ByteString getGrpcMessageBytes() {
        return ByteString.copyFromUtf8(this.grpcMessage_);
    }

    public int getGrpcStatus() {
        return this.grpcStatus_;
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

    public String getLocalRpcTraceId() {
        return this.localRpcTraceId_;
    }

    public ByteString getLocalRpcTraceIdBytes() {
        return ByteString.copyFromUtf8(this.localRpcTraceId_);
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

    public boolean getNetSuccess() {
        return this.netSuccess_;
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
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

    public boolean getRpcSuccess() {
        return this.rpcSuccess_;
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

    public boolean hasHeader() {
        return this.header_ != null;
    }
}
