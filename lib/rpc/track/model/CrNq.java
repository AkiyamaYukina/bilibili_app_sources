package com.bilibili.lib.rpc.track.model;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrNq.class */
public final class CrNq extends GeneratedMessageLite<CrNq, Builder> implements MessageLiteOrBuilder {
    private static final CrNq DEFAULT_INSTANCE;
    public static final int DOWNSTREAM_THROUGHPUT_KBPS_FIELD_NUMBER = 4;
    public static final int ECT_FIELD_NUMBER = 1;
    public static final int HTTP_RTT_MS_FIELD_NUMBER = 2;
    private static volatile Parser<CrNq> PARSER;
    public static final int TRANSPORT_RTT_MS_FIELD_NUMBER = 3;
    private int downstreamThroughputKbps_;
    private int ect_;
    private int httpRttMs_;
    private int transportRttMs_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrNq$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<CrNq, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(CrNq.DEFAULT_INSTANCE);
        }

        public Builder clearDownstreamThroughputKbps() {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).clearDownstreamThroughputKbps();
            return this;
        }

        public Builder clearEct() {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).clearEct();
            return this;
        }

        public Builder clearHttpRttMs() {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).clearHttpRttMs();
            return this;
        }

        public Builder clearTransportRttMs() {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).clearTransportRttMs();
            return this;
        }

        public int getDownstreamThroughputKbps() {
            return ((CrNq) ((GeneratedMessageLite.Builder) this).instance).getDownstreamThroughputKbps();
        }

        public int getEct() {
            return ((CrNq) ((GeneratedMessageLite.Builder) this).instance).getEct();
        }

        public int getHttpRttMs() {
            return ((CrNq) ((GeneratedMessageLite.Builder) this).instance).getHttpRttMs();
        }

        public int getTransportRttMs() {
            return ((CrNq) ((GeneratedMessageLite.Builder) this).instance).getTransportRttMs();
        }

        public Builder setDownstreamThroughputKbps(int i7) {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).setDownstreamThroughputKbps(i7);
            return this;
        }

        public Builder setEct(int i7) {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).setEct(i7);
            return this;
        }

        public Builder setHttpRttMs(int i7) {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).setHttpRttMs(i7);
            return this;
        }

        public Builder setTransportRttMs(int i7) {
            copyOnWrite();
            ((CrNq) ((GeneratedMessageLite.Builder) this).instance).setTransportRttMs(i7);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrNq$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64363a;

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
                com.bilibili.lib.rpc.track.model.CrNq.a.f64363a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNq.a.f64363a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNq.a.f64363a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNq.a.f64363a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNq.a.f64363a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNq.a.f64363a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNq.a.f64363a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.CrNq.a.m6724clinit():void");
        }
    }

    static {
        CrNq crNq = new CrNq();
        DEFAULT_INSTANCE = crNq;
        GeneratedMessageLite.registerDefaultInstance(CrNq.class, crNq);
    }

    private CrNq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownstreamThroughputKbps() {
        this.downstreamThroughputKbps_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEct() {
        this.ect_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpRttMs() {
        this.httpRttMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportRttMs() {
        this.transportRttMs_ = 0;
    }

    public static CrNq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CrNq crNq) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(crNq);
    }

    public static CrNq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CrNq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CrNq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrNq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CrNq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CrNq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CrNq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CrNq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CrNq parseFrom(InputStream inputStream) throws IOException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CrNq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CrNq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CrNq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CrNq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CrNq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrNq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<CrNq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownstreamThroughputKbps(int i7) {
        this.downstreamThroughputKbps_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEct(int i7) {
        this.ect_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpRttMs(int i7) {
        this.httpRttMs_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportRttMs(int i7) {
        this.transportRttMs_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64363a[methodToInvoke.ordinal()]) {
            case 1:
                return new CrNq();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"ect_", "httpRttMs_", "transportRttMs_", "downstreamThroughputKbps_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CrNq.class) {
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

    public int getDownstreamThroughputKbps() {
        return this.downstreamThroughputKbps_;
    }

    public int getEct() {
        return this.ect_;
    }

    public int getHttpRttMs() {
        return this.httpRttMs_;
    }

    public int getTransportRttMs() {
        return this.transportRttMs_;
    }
}
