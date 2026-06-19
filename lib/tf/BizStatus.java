package com.bilibili.lib.tf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/BizStatus.class */
public final class BizStatus extends GeneratedMessageLite<BizStatus, Builder> implements BizStatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final BizStatus DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<BizStatus> PARSER;
    private int code_;
    private String message_ = "";

    /* JADX INFO: renamed from: com.bilibili.lib.tf.BizStatus$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/BizStatus$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

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
                com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.BizStatus.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.BizStatus.AnonymousClass1.m6793clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/BizStatus$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<BizStatus, Builder> implements BizStatusOrBuilder {
        private Builder() {
            super(BizStatus.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCode() {
            copyOnWrite();
            ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).clearCode();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).clearMessage();
            return this;
        }

        @Override // com.bilibili.lib.tf.BizStatusOrBuilder
        public int getCode() {
            return ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).getCode();
        }

        @Override // com.bilibili.lib.tf.BizStatusOrBuilder
        public String getMessage() {
            return ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).getMessage();
        }

        @Override // com.bilibili.lib.tf.BizStatusOrBuilder
        public ByteString getMessageBytes() {
            return ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).getMessageBytes();
        }

        public Builder setCode(int i7) {
            copyOnWrite();
            ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).setCode(i7);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((BizStatus) ((GeneratedMessageLite.Builder) this).instance).setMessageBytes(byteString);
            return this;
        }
    }

    static {
        BizStatus bizStatus = new BizStatus();
        DEFAULT_INSTANCE = bizStatus;
        GeneratedMessageLite.registerDefaultInstance(BizStatus.class, bizStatus);
    }

    private BizStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static BizStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BizStatus bizStatus) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(bizStatus);
    }

    public static BizStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BizStatus parseFrom(InputStream inputStream) throws IOException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BizStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<BizStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i7) {
        this.code_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new BizStatus();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BizStatus.class) {
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

    @Override // com.bilibili.lib.tf.BizStatusOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.bilibili.lib.tf.BizStatusOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.bilibili.lib.tf.BizStatusOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }
}
