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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfResourceConfig.class */
public final class TfResourceConfig extends GeneratedMessageLite<TfResourceConfig, Builder> implements TfResourceConfigOrBuilder {
    public static final int DANMAKU_FIELD_NUMBER = 5;
    public static final int DANMAKU_MASK_FIELD_NUMBER = 6;
    private static final TfResourceConfig DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 8;
    public static final int IMAGE_FIELD_NUMBER = 9;
    public static final int MUSIC_FIELD_NUMBER = 7;
    private static volatile Parser<TfResourceConfig> PARSER;
    public static final int RTMP_FIELD_NUMBER = 3;
    public static final int RTMP_PUSH_FIELD_NUMBER = 4;
    public static final int VIDEO_FIELD_NUMBER = 1;
    public static final int VIDEO_UPLOAD_FIELD_NUMBER = 2;
    private boolean danmakuMask_;
    private boolean danmaku_;
    private boolean file_;
    private boolean image_;
    private boolean music_;
    private boolean rtmpPush_;
    private boolean rtmp_;
    private boolean videoUpload_;
    private boolean video_;

    /* JADX INFO: renamed from: com.bilibili.lib.tf.TfResourceConfig$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfResourceConfig$1.class */
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
                com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tf.TfResourceConfig.AnonymousClass1.m6826clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfResourceConfig$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder<TfResourceConfig, Builder> implements TfResourceConfigOrBuilder {
        private Builder() {
            super(TfResourceConfig.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder clearDanmaku() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearDanmaku();
            return this;
        }

        public Builder clearDanmakuMask() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearDanmakuMask();
            return this;
        }

        public Builder clearFile() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearFile();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearImage();
            return this;
        }

        public Builder clearMusic() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearMusic();
            return this;
        }

        public Builder clearRtmp() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearRtmp();
            return this;
        }

        public Builder clearRtmpPush() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearRtmpPush();
            return this;
        }

        public Builder clearVideo() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearVideo();
            return this;
        }

        public Builder clearVideoUpload() {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).clearVideoUpload();
            return this;
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getDanmaku() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getDanmaku();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getDanmakuMask() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getDanmakuMask();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getFile() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getFile();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getImage() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getImage();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getMusic() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getMusic();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getRtmp() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getRtmp();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getRtmpPush() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getRtmpPush();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getVideo() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getVideo();
        }

        @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
        public boolean getVideoUpload() {
            return ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).getVideoUpload();
        }

        public Builder setDanmaku(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setDanmaku(z6);
            return this;
        }

        public Builder setDanmakuMask(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setDanmakuMask(z6);
            return this;
        }

        public Builder setFile(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setFile(z6);
            return this;
        }

        public Builder setImage(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setImage(z6);
            return this;
        }

        public Builder setMusic(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setMusic(z6);
            return this;
        }

        public Builder setRtmp(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setRtmp(z6);
            return this;
        }

        public Builder setRtmpPush(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setRtmpPush(z6);
            return this;
        }

        public Builder setVideo(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setVideo(z6);
            return this;
        }

        public Builder setVideoUpload(boolean z6) {
            copyOnWrite();
            ((TfResourceConfig) ((GeneratedMessageLite.Builder) this).instance).setVideoUpload(z6);
            return this;
        }
    }

    static {
        TfResourceConfig tfResourceConfig = new TfResourceConfig();
        DEFAULT_INSTANCE = tfResourceConfig;
        GeneratedMessageLite.registerDefaultInstance(TfResourceConfig.class, tfResourceConfig);
    }

    private TfResourceConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmaku() {
        this.danmaku_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmakuMask() {
        this.danmakuMask_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        this.file_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMusic() {
        this.music_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtmp() {
        this.rtmp_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtmpPush() {
        this.rtmpPush_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoUpload() {
        this.videoUpload_ = false;
    }

    public static TfResourceConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TfResourceConfig tfResourceConfig) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tfResourceConfig);
    }

    public static TfResourceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TfResourceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfResourceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfResourceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfResourceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TfResourceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TfResourceConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TfResourceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TfResourceConfig parseFrom(InputStream inputStream) throws IOException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TfResourceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TfResourceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TfResourceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TfResourceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TfResourceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TfResourceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TfResourceConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmaku(boolean z6) {
        this.danmaku_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmakuMask(boolean z6) {
        this.danmakuMask_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(boolean z6) {
        this.file_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(boolean z6) {
        this.image_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMusic(boolean z6) {
        this.music_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtmp(boolean z6) {
        this.rtmp_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtmpPush(boolean z6) {
        this.rtmpPush_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(boolean z6) {
        this.video_ = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoUpload(boolean z6) {
        this.videoUpload_ = z6;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TfResourceConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007", new Object[]{"video_", "videoUpload_", "rtmp_", "rtmpPush_", "danmaku_", "danmakuMask_", "music_", "file_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TfResourceConfig.class) {
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

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getDanmaku() {
        return this.danmaku_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getDanmakuMask() {
        return this.danmakuMask_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getFile() {
        return this.file_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getImage() {
        return this.image_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getMusic() {
        return this.music_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getRtmp() {
        return this.rtmp_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getRtmpPush() {
        return this.rtmpPush_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getVideo() {
        return this.video_;
    }

    @Override // com.bilibili.lib.tf.TfResourceConfigOrBuilder
    public boolean getVideoUpload() {
        return this.videoUpload_;
    }
}
