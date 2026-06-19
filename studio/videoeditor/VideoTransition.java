package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.LocalPath;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTransition.class */
public final class VideoTransition extends GeneratedMessageLite<VideoTransition, b> implements J {
    public static final int COVER_FIELD_NUMBER = 11;
    private static final VideoTransition DEFAULT_INSTANCE;
    public static final int IDSTRING_FIELD_NUMBER = 10;
    public static final int LICENSEPATH_FIELD_NUMBER = 8;
    public static final int MATERIALID_FIELD_NUMBER = 6;
    public static final int OVERLAP_FIELD_NUMBER = 9;
    public static final int PACKAGEPATH_FIELD_NUMBER = 7;
    private static volatile Parser<VideoTransition> PARSER;
    public static final int PREVIDEOID_FIELD_NUMBER = 3;
    public static final int SRCINDEX_FIELD_NUMBER = 2;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 12;
    public static final int TRANSITIONDUR_FIELD_NUMBER = 4;
    public static final int TRANSITIONNAME_FIELD_NUMBER = 5;
    public static final int TRANSITIONTYPE_FIELD_NUMBER = 1;
    private LocalPath materialId_;
    private boolean overlap_;
    private int srcIndex_;
    private int templateFxFrom_;
    private long transitionDur_;
    private int transitionType_;
    private String preVideoId_ = "";
    private String transitionName_ = "";
    private String packagePath_ = "";
    private String licensePath_ = "";
    private String idString_ = "";
    private String cover_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTransition$Type.class */
    public enum Type implements Internal.EnumLite {
        BUILTIN(0),
        PACKAGE(1),
        CUSTOM(2),
        UNRECOGNIZED(-1);

        public static final int BUILTIN_VALUE = 0;
        public static final int CUSTOM_VALUE = 2;
        public static final int PACKAGE_VALUE = 1;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTransition$Type$a.class */
        public final class a implements Internal.EnumLiteMap<Type> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return Type.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTransition$Type$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108908a = new Object();

            public final boolean isInRange(int i7) {
                return Type.forNumber(i7) != null;
            }
        }

        Type(int i7) {
            this.value = i7;
        }

        public static Type forNumber(int i7) {
            if (i7 == 0) {
                return BUILTIN;
            }
            if (i7 == 1) {
                return PACKAGE;
            }
            if (i7 != 2) {
                return null;
            }
            return CUSTOM;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108908a;
        }

        @Deprecated
        public static Type valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTransition$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108909a;

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
                com.bilibili.studio.videoeditor.VideoTransition.a.f108909a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTransition.a.f108909a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTransition.a.f108909a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTransition.a.f108909a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTransition.a.f108909a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTransition.a.f108909a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.VideoTransition.a.f108909a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.VideoTransition.a.m10395clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoTransition$b.class */
    public static final class b extends GeneratedMessageLite.Builder<VideoTransition, b> implements J {
        public b() {
            super(VideoTransition.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoTransition videoTransition = new VideoTransition();
        DEFAULT_INSTANCE = videoTransition;
        GeneratedMessageLite.registerDefaultInstance(VideoTransition.class, videoTransition);
    }

    private VideoTransition() {
    }

    private void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearLicensePath() {
        this.licensePath_ = getDefaultInstance().getLicensePath();
    }

    private void clearMaterialId() {
        this.materialId_ = null;
    }

    private void clearOverlap() {
        this.overlap_ = false;
    }

    private void clearPackagePath() {
        this.packagePath_ = getDefaultInstance().getPackagePath();
    }

    private void clearPreVideoId() {
        this.preVideoId_ = getDefaultInstance().getPreVideoId();
    }

    private void clearSrcIndex() {
        this.srcIndex_ = 0;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void clearTransitionDur() {
        this.transitionDur_ = 0L;
    }

    private void clearTransitionName() {
        this.transitionName_ = getDefaultInstance().getTransitionName();
    }

    private void clearTransitionType() {
        this.transitionType_ = 0;
    }

    public static VideoTransition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMaterialId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.materialId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.materialId_ = localPath;
        } else {
            this.materialId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.materialId_).mergeFrom(localPath)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(VideoTransition videoTransition) {
        return (b) DEFAULT_INSTANCE.createBuilder(videoTransition);
    }

    public static VideoTransition parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoTransition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoTransition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoTransition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoTransition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoTransition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoTransition parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoTransition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static VideoTransition parseFrom(InputStream inputStream) throws IOException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoTransition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoTransition parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VideoTransition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoTransition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoTransition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoTransition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<VideoTransition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    private void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setLicensePath(String str) {
        str.getClass();
        this.licensePath_ = str;
    }

    private void setLicensePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.licensePath_ = byteString.toStringUtf8();
    }

    private void setMaterialId(LocalPath localPath) {
        localPath.getClass();
        this.materialId_ = localPath;
    }

    private void setOverlap(boolean z6) {
        this.overlap_ = z6;
    }

    private void setPackagePath(String str) {
        str.getClass();
        this.packagePath_ = str;
    }

    private void setPackagePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packagePath_ = byteString.toStringUtf8();
    }

    private void setPreVideoId(String str) {
        str.getClass();
        this.preVideoId_ = str;
    }

    private void setPreVideoIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.preVideoId_ = byteString.toStringUtf8();
    }

    private void setSrcIndex(int i7) {
        this.srcIndex_ = i7;
    }

    private void setTemplateFxFrom(TemplateFxFrom templateFxFrom) {
        this.templateFxFrom_ = templateFxFrom.getNumber();
    }

    private void setTemplateFxFromValue(int i7) {
        this.templateFxFrom_ = i7;
    }

    private void setTransitionDur(long j7) {
        this.transitionDur_ = j7;
    }

    private void setTransitionName(String str) {
        str.getClass();
        this.transitionName_ = str;
    }

    private void setTransitionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.transitionName_ = byteString.toStringUtf8();
    }

    private void setTransitionType(Type type) {
        this.transitionType_ = type.getNumber();
    }

    private void setTransitionTypeValue(int i7) {
        this.transitionType_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108909a[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoTransition();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006\t\u0007Ȉ\bȈ\t\u0007\nȈ\u000bȈ\f\f", new Object[]{"transitionType_", "srcIndex_", "preVideoId_", "transitionDur_", "transitionName_", "materialId_", "packagePath_", "licensePath_", "overlap_", "idString_", "cover_", "templateFxFrom_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (VideoTransition.class) {
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

    public String getCover() {
        return this.cover_;
    }

    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public String getLicensePath() {
        return this.licensePath_;
    }

    public ByteString getLicensePathBytes() {
        return ByteString.copyFromUtf8(this.licensePath_);
    }

    public LocalPath getMaterialId() {
        LocalPath localPath = this.materialId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getOverlap() {
        return this.overlap_;
    }

    public String getPackagePath() {
        return this.packagePath_;
    }

    public ByteString getPackagePathBytes() {
        return ByteString.copyFromUtf8(this.packagePath_);
    }

    public String getPreVideoId() {
        return this.preVideoId_;
    }

    public ByteString getPreVideoIdBytes() {
        return ByteString.copyFromUtf8(this.preVideoId_);
    }

    public int getSrcIndex() {
        return this.srcIndex_;
    }

    public TemplateFxFrom getTemplateFxFrom() {
        TemplateFxFrom templateFxFromForNumber = TemplateFxFrom.forNumber(this.templateFxFrom_);
        TemplateFxFrom templateFxFrom = templateFxFromForNumber;
        if (templateFxFromForNumber == null) {
            templateFxFrom = TemplateFxFrom.UNRECOGNIZED;
        }
        return templateFxFrom;
    }

    public int getTemplateFxFromValue() {
        return this.templateFxFrom_;
    }

    public long getTransitionDur() {
        return this.transitionDur_;
    }

    public String getTransitionName() {
        return this.transitionName_;
    }

    public ByteString getTransitionNameBytes() {
        return ByteString.copyFromUtf8(this.transitionName_);
    }

    public Type getTransitionType() {
        Type typeForNumber = Type.forNumber(this.transitionType_);
        Type type = typeForNumber;
        if (typeForNumber == null) {
            type = Type.UNRECOGNIZED;
        }
        return type;
    }

    public int getTransitionTypeValue() {
        return this.transitionType_;
    }

    public boolean hasMaterialId() {
        return this.materialId_ != null;
    }
}
