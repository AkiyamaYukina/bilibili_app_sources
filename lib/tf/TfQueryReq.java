package com.bilibili.lib.tf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfQueryReq.class */
public final class TfQueryReq extends GeneratedMessageLite<TfQueryReq, Builder> implements TfQueryReqOrBuilder {
    public static final int CACHED_PROVIDER_FIELD_NUMBER = 3;
    private static final TfQueryReq DEFAULT_INSTANCE;
    public static final int MAYBE_CACHE_FIELD_NUMBER = 2;
    private static volatile Parser<TfQueryReq> PARSER;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private int cachedProvider_;
    private boolean maybeCache_;
    private int resource_;

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfQueryReq$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfQueryReq$1.class */
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
                com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfQueryReq.AnonymousClass1.m6819clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfQueryReq$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfQueryReq, Builder> implements TfQueryReqOrBuilder {
        private Builder() {
            super(TfQueryReq.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearCachedProvider() {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).clearCachedProvider();
            return this;
        }

        public Builder clearMaybeCache() {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).clearMaybeCache();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).clearResource();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
        public TfProvider getCachedProvider() {
            return ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).getCachedProvider();
        }

        @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
        public int getCachedProviderValue() {
            return ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).getCachedProviderValue();
        }

        @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
        public boolean getMaybeCache() {
            return ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).getMaybeCache();
        }

        @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
        public TfResource getResource() {
            return ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).getResource();
        }

        @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
        public int getResourceValue() {
            return ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).getResourceValue();
        }

        public Builder setCachedProvider(TfProvider tfProvider) {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).setCachedProvider(tfProvider);
            return this;
        }

        public Builder setCachedProviderValue(int i7) {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).setCachedProviderValue(i7);
            return this;
        }

        public Builder setMaybeCache(boolean z6) {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).setMaybeCache(z6);
            return this;
        }

        public Builder setResource(TfResource tfResource) {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).setResource(tfResource);
            return this;
        }

        public Builder setResourceValue(int i7) {
            copyOnWrite();
            ((TfQueryReq) ((GeneratedMessageLite.Builder) this).instance).setResourceValue(i7);
            return this;
        }
    }

    static {
        TfQueryReq tfQueryReq = new TfQueryReq();
        DEFAULT_INSTANCE = tfQueryReq;
        GeneratedMessageLite.registerDefaultInstance(TfQueryReq.class, tfQueryReq);
    }

    private TfQueryReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCachedProvider() {
        this.cachedProvider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaybeCache() {
        this.maybeCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = 0;
    }

    public static TfQueryReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfQueryReq tfQueryReq) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfQueryReq);
    }

    public static TfQueryReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfQueryReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfQueryReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfQueryReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfQueryReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfQueryReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfQueryReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfQueryReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfQueryReq parseFrom(InputStream inputStream) throws IOException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfQueryReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfQueryReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfQueryReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfQueryReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfQueryReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfQueryReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfQueryReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachedProvider(TfProvider tfProvider) {
        this.cachedProvider_ = tfProvider.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCachedProviderValue(int i7) {
        this.cachedProvider_ = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaybeCache(boolean z6) {
        this.maybeCache_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(TfResource tfResource) {
        this.resource_ = tfResource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceValue(int i7) {
        this.resource_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TfQueryReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\f", new Object[]{"resource_", "maybeCache_", "cachedProvider_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfQueryReq.class) {
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

    @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
    public TfProvider getCachedProvider() {
        TfProvider tfProviderForNumber = TfProvider.forNumber(this.cachedProvider_);
        TfProvider tfProvider = tfProviderForNumber;
        if (tfProviderForNumber == null) {
            tfProvider = TfProvider.UNRECOGNIZED;
        }
        return tfProvider;
    }

    @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
    public int getCachedProviderValue() {
        return this.cachedProvider_;
    }

    @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
    public boolean getMaybeCache() {
        return this.maybeCache_;
    }

    @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
    public TfResource getResource() {
        TfResource tfResourceForNumber = TfResource.forNumber(this.resource_);
        TfResource tfResource = tfResourceForNumber;
        if (tfResourceForNumber == null) {
            tfResource = TfResource.UNRECOGNIZED;
        }
        return tfResource;
    }

    @Override // com.bilibili.lib.tf.TfQueryReqOrBuilder
    public int getResourceValue() {
        return this.resource_;
    }
}
