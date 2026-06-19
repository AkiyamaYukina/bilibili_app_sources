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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateEvent.class */
public final class TfActivateEvent extends GeneratedMessageLite<TfActivateEvent, Builder> implements TfActivateEventOrBuilder {
    private static final TfActivateEvent DEFAULT_INSTANCE;
    public static final int IS_AUTO_FIELD_NUMBER = 3;
    public static final int IS_SUCCESS_FIELD_NUMBER = 1;
    private static volatile Parser<TfActivateEvent> PARSER;
    public static final int RAW_STATUS_FIELD_NUMBER = 4;
    public static final int TYPE_EXT_FIELD_NUMBER = 2;
    private boolean isAuto_;
    private boolean isSuccess_;
    private String rawStatus_ = "";
    private int typeExt_;

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfActivateEvent$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateEvent$1.class */
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
                com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfActivateEvent.AnonymousClass1.m6802clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateEvent$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfActivateEvent, Builder> implements TfActivateEventOrBuilder {
        private Builder() {
            super(TfActivateEvent.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearIsAuto() {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).clearIsAuto();
            return this;
        }

        public Builder clearIsSuccess() {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).clearIsSuccess();
            return this;
        }

        public Builder clearRawStatus() {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).clearRawStatus();
            return this;
        }

        public Builder clearTypeExt() {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).clearTypeExt();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
        public boolean getIsAuto() {
            return ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).getIsAuto();
        }

        @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
        public boolean getIsSuccess() {
            return ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).getIsSuccess();
        }

        @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
        public String getRawStatus() {
            return ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).getRawStatus();
        }

        @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
        public ByteString getRawStatusBytes() {
            return ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).getRawStatusBytes();
        }

        @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
        public TfTypeExt getTypeExt() {
            return ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).getTypeExt();
        }

        @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
        public int getTypeExtValue() {
            return ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).getTypeExtValue();
        }

        public Builder setIsAuto(boolean z6) {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).setIsAuto(z6);
            return this;
        }

        public Builder setIsSuccess(boolean z6) {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).setIsSuccess(z6);
            return this;
        }

        public Builder setRawStatus(String str) {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).setRawStatus(str);
            return this;
        }

        public Builder setRawStatusBytes(ByteString byteString) {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).setRawStatusBytes(byteString);
            return this;
        }

        public Builder setTypeExt(TfTypeExt tfTypeExt) {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).setTypeExt(tfTypeExt);
            return this;
        }

        public Builder setTypeExtValue(int i7) {
            copyOnWrite();
            ((TfActivateEvent) ((GeneratedMessageLite.Builder) this).instance).setTypeExtValue(i7);
            return this;
        }
    }

    static {
        TfActivateEvent tfActivateEvent = new TfActivateEvent();
        DEFAULT_INSTANCE = tfActivateEvent;
        GeneratedMessageLite.registerDefaultInstance(TfActivateEvent.class, tfActivateEvent);
    }

    private TfActivateEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSuccess() {
        this.isSuccess_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawStatus() {
        this.rawStatus_ = getDefaultInstance().getRawStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeExt() {
        this.typeExt_ = 0;
    }

    public static TfActivateEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfActivateEvent tfActivateEvent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfActivateEvent);
    }

    public static TfActivateEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfActivateEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfActivateEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfActivateEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfActivateEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfActivateEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfActivateEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfActivateEvent parseFrom(InputStream inputStream) throws IOException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfActivateEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfActivateEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfActivateEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfActivateEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfActivateEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfActivateEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfActivateEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z6) {
        this.isAuto_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSuccess(boolean z6) {
        this.isSuccess_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawStatus(String str) {
        str.getClass();
        this.rawStatus_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawStatusBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rawStatus_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeExt(TfTypeExt tfTypeExt) {
        this.typeExt_ = tfTypeExt.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeExtValue(int i7) {
        this.typeExt_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TfActivateEvent();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\u0007\u0004Ȉ", new Object[]{"isSuccess_", "typeExt_", "isAuto_", "rawStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfActivateEvent.class) {
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

    @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
    public boolean getIsAuto() {
        return this.isAuto_;
    }

    @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
    public boolean getIsSuccess() {
        return this.isSuccess_;
    }

    @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
    public String getRawStatus() {
        return this.rawStatus_;
    }

    @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
    public ByteString getRawStatusBytes() {
        return ByteString.copyFromUtf8(this.rawStatus_);
    }

    @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
    public TfTypeExt getTypeExt() {
        TfTypeExt tfTypeExtForNumber = TfTypeExt.forNumber(this.typeExt_);
        TfTypeExt tfTypeExt = tfTypeExtForNumber;
        if (tfTypeExtForNumber == null) {
            tfTypeExt = TfTypeExt.UNRECOGNIZED;
        }
        return tfTypeExt;
    }

    @Override // com.bilibili.lib.tf.TfActivateEventOrBuilder
    public int getTypeExtValue() {
        return this.typeExt_;
    }
}
