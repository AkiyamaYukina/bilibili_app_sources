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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/RpcSample.class */
public final class RpcSample extends GeneratedMessageLite<RpcSample, Builder> implements MessageLiteOrBuilder {
    private static final RpcSample DEFAULT_INSTANCE;
    private static volatile Parser<RpcSample> PARSER;
    public static final int RATE_FIELD_NUMBER = 2;
    public static final int SAMPLE_FIELD_NUMBER = 1;
    private float rate_;
    private boolean sample_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/RpcSample$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<RpcSample, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(RpcSample.DEFAULT_INSTANCE);
        }

        public Builder clearRate() {
            copyOnWrite();
            ((RpcSample) ((GeneratedMessageLite.Builder) this).instance).clearRate();
            return this;
        }

        public Builder clearSample() {
            copyOnWrite();
            ((RpcSample) ((GeneratedMessageLite.Builder) this).instance).clearSample();
            return this;
        }

        public float getRate() {
            return ((RpcSample) ((GeneratedMessageLite.Builder) this).instance).getRate();
        }

        public boolean getSample() {
            return ((RpcSample) ((GeneratedMessageLite.Builder) this).instance).getSample();
        }

        public Builder setRate(float f7) {
            copyOnWrite();
            ((RpcSample) ((GeneratedMessageLite.Builder) this).instance).setRate(f7);
            return this;
        }

        public Builder setSample(boolean z6) {
            copyOnWrite();
            ((RpcSample) ((GeneratedMessageLite.Builder) this).instance).setSample(z6);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/RpcSample$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64379a;

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
                com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.RpcSample.a.f64379a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.RpcSample.a.m6736clinit():void");
        }
    }

    static {
        RpcSample rpcSample = new RpcSample();
        DEFAULT_INSTANCE = rpcSample;
        GeneratedMessageLite.registerDefaultInstance(RpcSample.class, rpcSample);
    }

    private RpcSample() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRate() {
        this.rate_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSample() {
        this.sample_ = false;
    }

    public static RpcSample getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RpcSample rpcSample) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rpcSample);
    }

    public static RpcSample parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RpcSample) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RpcSample parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RpcSample) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RpcSample parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RpcSample parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RpcSample parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RpcSample parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RpcSample parseFrom(InputStream inputStream) throws IOException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RpcSample parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RpcSample parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RpcSample parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RpcSample parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RpcSample parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RpcSample) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<RpcSample> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRate(float f7) {
        this.rate_ = f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSample(boolean z6) {
        this.sample_ = z6;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64379a[methodToInvoke.ordinal()]) {
            case 1:
                return new RpcSample();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0001", new Object[]{"sample_", "rate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RpcSample.class) {
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

    public float getRate() {
        return this.rate_;
    }

    public boolean getSample() {
        return this.sample_;
    }
}
