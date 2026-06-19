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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrNetError.class */
public final class CrNetError extends GeneratedMessageLite<CrNetError, Builder> implements MessageLiteOrBuilder {
    private static final CrNetError DEFAULT_INSTANCE;
    public static final int DETAIL_MESSAGE_FIELD_NUMBER = 3;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int INTERNAL_ERROR_CODE_FIELD_NUMBER = 2;
    private static volatile Parser<CrNetError> PARSER;
    public static final int QUIC_DETAILED_ERROR_CODE_FIELD_NUMBER = 5;
    public static final int RETRYABLE_FIELD_NUMBER = 4;
    private String detailMessage_ = "";
    private int errorCode_;
    private int internalErrorCode_;
    private int quicDetailedErrorCode_;
    private boolean retryable_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrNetError$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<CrNetError, Builder> implements MessageLiteOrBuilder {
        public Builder() {
            super(CrNetError.DEFAULT_INSTANCE);
        }

        public Builder clearDetailMessage() {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).clearDetailMessage();
            return this;
        }

        public Builder clearErrorCode() {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).clearErrorCode();
            return this;
        }

        public Builder clearInternalErrorCode() {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).clearInternalErrorCode();
            return this;
        }

        public Builder clearQuicDetailedErrorCode() {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).clearQuicDetailedErrorCode();
            return this;
        }

        public Builder clearRetryable() {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).clearRetryable();
            return this;
        }

        public String getDetailMessage() {
            return ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).getDetailMessage();
        }

        public ByteString getDetailMessageBytes() {
            return ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).getDetailMessageBytes();
        }

        public int getErrorCode() {
            return ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).getErrorCode();
        }

        public int getInternalErrorCode() {
            return ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).getInternalErrorCode();
        }

        public int getQuicDetailedErrorCode() {
            return ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).getQuicDetailedErrorCode();
        }

        public boolean getRetryable() {
            return ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).getRetryable();
        }

        public Builder setDetailMessage(String str) {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).setDetailMessage(str);
            return this;
        }

        public Builder setDetailMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).setDetailMessageBytes(byteString);
            return this;
        }

        public Builder setErrorCode(int i7) {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).setErrorCode(i7);
            return this;
        }

        public Builder setInternalErrorCode(int i7) {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).setInternalErrorCode(i7);
            return this;
        }

        public Builder setQuicDetailedErrorCode(int i7) {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).setQuicDetailedErrorCode(i7);
            return this;
        }

        public Builder setRetryable(boolean z6) {
            copyOnWrite();
            ((CrNetError) ((GeneratedMessageLite.Builder) this).instance).setRetryable(z6);
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/model/CrNetError$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64362a;

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
                com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.rpc.track.model.CrNetError.a.f64362a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.model.CrNetError.a.m6722clinit():void");
        }
    }

    static {
        CrNetError crNetError = new CrNetError();
        DEFAULT_INSTANCE = crNetError;
        GeneratedMessageLite.registerDefaultInstance(CrNetError.class, crNetError);
    }

    private CrNetError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetailMessage() {
        this.detailMessage_ = getDefaultInstance().getDetailMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalErrorCode() {
        this.internalErrorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicDetailedErrorCode() {
        this.quicDetailedErrorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryable() {
        this.retryable_ = false;
    }

    public static CrNetError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CrNetError crNetError) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(crNetError);
    }

    public static CrNetError parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CrNetError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CrNetError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrNetError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CrNetError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CrNetError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CrNetError parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CrNetError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CrNetError parseFrom(InputStream inputStream) throws IOException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CrNetError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CrNetError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CrNetError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CrNetError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CrNetError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CrNetError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<CrNetError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailMessage(String str) {
        str.getClass();
        this.detailMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.detailMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i7) {
        this.errorCode_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalErrorCode(int i7) {
        this.internalErrorCode_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDetailedErrorCode(int i7) {
        this.quicDetailedErrorCode_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryable(boolean z6) {
        this.retryable_ = z6;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f64362a[methodToInvoke.ordinal()]) {
            case 1:
                return new CrNetError();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004\u0007\u0005\u0004", new Object[]{"errorCode_", "internalErrorCode_", "detailMessage_", "retryable_", "quicDetailedErrorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CrNetError.class) {
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

    public String getDetailMessage() {
        return this.detailMessage_;
    }

    public ByteString getDetailMessageBytes() {
        return ByteString.copyFromUtf8(this.detailMessage_);
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public int getInternalErrorCode() {
        return this.internalErrorCode_;
    }

    public int getQuicDetailedErrorCode() {
        return this.quicDetailedErrorCode_;
    }

    public boolean getRetryable() {
        return this.retryable_;
    }
}
