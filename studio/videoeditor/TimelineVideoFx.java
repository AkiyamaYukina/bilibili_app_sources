package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Color;
import com.bilibili.studio.videoeditor.LocalPath;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx.class */
public final class TimelineVideoFx extends GeneratedMessageLite<TimelineVideoFx, b> implements z {
    public static final int CORRESPONDINGAUDIOCLIPID_FIELD_NUMBER = 22;
    public static final int CORRESPONDINGSOUNDDOWNLOADURL_FIELD_NUMBER = 20;
    public static final int CORRESPONDINGSOUNDDURATION_FIELD_NUMBER = 17;
    public static final int CORRESPONDINGSOUNDETIME_FIELD_NUMBER = 19;
    public static final int CORRESPONDINGSOUNDFILEPATH_FIELD_NUMBER = 21;
    public static final int CORRESPONDINGSOUNDID_FIELD_NUMBER = 16;
    public static final int CORRESPONDINGSOUNDNAME_FIELD_NUMBER = 15;
    public static final int CORRESPONDINGSOUNDSTIME_FIELD_NUMBER = 18;
    private static final TimelineVideoFx DEFAULT_INSTANCE;
    public static final int FXNAME_FIELD_NUMBER = 5;
    public static final int FXPARAMS_FIELD_NUMBER = 11;
    public static final int FXTYPE_FIELD_NUMBER = 6;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int INPOINT_FIELD_NUMBER = 2;
    public static final int LICENSEPATH_FIELD_NUMBER = 9;
    public static final int MATERIALID_FIELD_NUMBER = 7;
    public static final int MATERIALTYPE_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 10;
    public static final int OUTPOINT_FIELD_NUMBER = 3;
    public static final int PACKAGEPATH_FIELD_NUMBER = 8;
    private static volatile Parser<TimelineVideoFx> PARSER;
    public static final int RECYCLE_FIELD_NUMBER = 13;
    public static final int ROWINTRACK_FIELD_NUMBER = 4;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 14;
    private int fxType_;
    private long inPoint_;
    private LocalPath licensePath_;
    private LocalPath materialId_;
    private int materialType_;
    private long outPoint_;
    private LocalPath packagePath_;
    private boolean recycle_;
    private int rowInTrack_;
    private int templateFxFrom_;
    private String idString_ = "";
    private String fxName_ = "";
    private String name_ = "";
    private Internal.ProtobufList<FxParam> fxParams_ = GeneratedMessageLite.emptyProtobufList();
    private String correspondingSoundName_ = "";
    private String correspondingSoundId_ = "";
    private String correspondingSoundDuration_ = "";
    private String correspondingSoundSTime_ = "";
    private String correspondingSoundETime_ = "";
    private String correspondingSoundDownloadUrl_ = "";
    private String correspondingSoundFilePath_ = "";
    private String correspondingAudioClipId_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxParam.class */
    public static final class FxParam extends GeneratedMessageLite<FxParam, a> implements c {
        public static final int CNNAME_FIELD_NUMBER = 3;
        public static final int CURRENTCOLORVALUE_FIELD_NUMBER = 6;
        public static final int CURRENTVALUE_FIELD_NUMBER = 4;
        private static final FxParam DEFAULT_INSTANCE;
        public static final int FXPARAMCHANGED_FIELD_NUMBER = 5;
        public static final int PARAMTYPE_FIELD_NUMBER = 1;
        private static volatile Parser<FxParam> PARSER;
        public static final int VARNAME_FIELD_NUMBER = 2;
        private Color currentColorValue_;
        private double currentValue_;
        private boolean fxParamChanged_;
        private int paramType_;
        private String varName_ = "";
        private String cnName_ = "";

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxParam$a.class */
        public static final class a extends GeneratedMessageLite.Builder<FxParam, a> implements c {
            public a() {
                super(FxParam.DEFAULT_INSTANCE);
            }
        }

        static {
            FxParam fxParam = new FxParam();
            DEFAULT_INSTANCE = fxParam;
            GeneratedMessageLite.registerDefaultInstance(FxParam.class, fxParam);
        }

        private FxParam() {
        }

        private void clearCnName() {
            this.cnName_ = getDefaultInstance().getCnName();
        }

        private void clearCurrentColorValue() {
            this.currentColorValue_ = null;
        }

        private void clearCurrentValue() {
            this.currentValue_ = 0.0d;
        }

        private void clearFxParamChanged() {
            this.fxParamChanged_ = false;
        }

        private void clearParamType() {
            this.paramType_ = 0;
        }

        private void clearVarName() {
            this.varName_ = getDefaultInstance().getVarName();
        }

        public static FxParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCurrentColorValue(Color color) {
            color.getClass();
            Color color2 = this.currentColorValue_;
            if (color2 == null || color2 == Color.getDefaultInstance()) {
                this.currentColorValue_ = color;
            } else {
                this.currentColorValue_ = (Color) ((Color.b) Color.newBuilder(this.currentColorValue_).mergeFrom(color)).buildPartial();
            }
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(FxParam fxParam) {
            return (a) DEFAULT_INSTANCE.createBuilder(fxParam);
        }

        public static FxParam parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FxParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FxParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FxParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FxParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FxParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FxParam parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FxParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static FxParam parseFrom(InputStream inputStream) throws IOException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FxParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FxParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static FxParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FxParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FxParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FxParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<FxParam> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCnName(String str) {
            str.getClass();
            this.cnName_ = str;
        }

        private void setCnNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cnName_ = byteString.toStringUtf8();
        }

        private void setCurrentColorValue(Color color) {
            color.getClass();
            this.currentColorValue_ = color;
        }

        private void setCurrentValue(double d7) {
            this.currentValue_ = d7;
        }

        private void setFxParamChanged(boolean z6) {
            this.fxParamChanged_ = z6;
        }

        private void setParamType(FxParamType fxParamType) {
            this.paramType_ = fxParamType.getNumber();
        }

        private void setParamTypeValue(int i7) {
            this.paramType_ = i7;
        }

        private void setVarName(String str) {
            str.getClass();
            this.varName_ = str;
        }

        private void setVarNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.varName_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f108889a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FxParam();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0000\u0005\u0007\u0006\t", new Object[]{"paramType_", "varName_", "cnName_", "currentValue_", "fxParamChanged_", "currentColorValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (FxParam.class) {
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

        public String getCnName() {
            return this.cnName_;
        }

        public ByteString getCnNameBytes() {
            return ByteString.copyFromUtf8(this.cnName_);
        }

        public Color getCurrentColorValue() {
            Color color = this.currentColorValue_;
            Color defaultInstance = color;
            if (color == null) {
                defaultInstance = Color.getDefaultInstance();
            }
            return defaultInstance;
        }

        public double getCurrentValue() {
            return this.currentValue_;
        }

        public boolean getFxParamChanged() {
            return this.fxParamChanged_;
        }

        public FxParamType getParamType() {
            FxParamType fxParamTypeForNumber = FxParamType.forNumber(this.paramType_);
            FxParamType fxParamType = fxParamTypeForNumber;
            if (fxParamTypeForNumber == null) {
                fxParamType = FxParamType.UNRECOGNIZED;
            }
            return fxParamType;
        }

        public int getParamTypeValue() {
            return this.paramType_;
        }

        public String getVarName() {
            return this.varName_;
        }

        public ByteString getVarNameBytes() {
            return ByteString.copyFromUtf8(this.varName_);
        }

        public boolean hasCurrentColorValue() {
            return this.currentColorValue_ != null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxParamType.class */
    public enum FxParamType implements Internal.EnumLite {
        FxParamTypeUndefine(0),
        FxParamTypeInt(1),
        FxParamTypeFloat(2),
        FxParamTypeColor(3),
        UNRECOGNIZED(-1);

        public static final int FxParamTypeColor_VALUE = 3;
        public static final int FxParamTypeFloat_VALUE = 2;
        public static final int FxParamTypeInt_VALUE = 1;
        public static final int FxParamTypeUndefine_VALUE = 0;
        private static final Internal.EnumLiteMap<FxParamType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxParamType$a.class */
        public final class a implements Internal.EnumLiteMap<FxParamType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return FxParamType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxParamType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108887a = new Object();

            public final boolean isInRange(int i7) {
                return FxParamType.forNumber(i7) != null;
            }
        }

        FxParamType(int i7) {
            this.value = i7;
        }

        public static FxParamType forNumber(int i7) {
            if (i7 == 0) {
                return FxParamTypeUndefine;
            }
            if (i7 == 1) {
                return FxParamTypeInt;
            }
            if (i7 == 2) {
                return FxParamTypeFloat;
            }
            if (i7 != 3) {
                return null;
            }
            return FxParamTypeColor;
        }

        public static Internal.EnumLiteMap<FxParamType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108887a;
        }

        @Deprecated
        public static FxParamType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxType.class */
    public enum FxType implements Internal.EnumLite {
        Builtin(0),
        Package(1),
        Custom(2),
        UNRECOGNIZED(-1);

        public static final int Builtin_VALUE = 0;
        public static final int Custom_VALUE = 2;
        public static final int Package_VALUE = 1;
        private static final Internal.EnumLiteMap<FxType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxType$a.class */
        public final class a implements Internal.EnumLiteMap<FxType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return FxType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$FxType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108888a = new Object();

            public final boolean isInRange(int i7) {
                return FxType.forNumber(i7) != null;
            }
        }

        FxType(int i7) {
            this.value = i7;
        }

        public static FxType forNumber(int i7) {
            if (i7 == 0) {
                return Builtin;
            }
            if (i7 == 1) {
                return Package;
            }
            if (i7 != 2) {
                return null;
            }
            return Custom;
        }

        public static Internal.EnumLiteMap<FxType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108888a;
        }

        @Deprecated
        public static FxType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108889a;

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
                com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.TimelineVideoFx.a.f108889a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.TimelineVideoFx.a.m10349clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$b.class */
    public static final class b extends GeneratedMessageLite.Builder<TimelineVideoFx, b> implements z {
        public b() {
            super(TimelineVideoFx.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TimelineVideoFx$c.class */
    public interface c extends MessageLiteOrBuilder {
    }

    static {
        TimelineVideoFx timelineVideoFx = new TimelineVideoFx();
        DEFAULT_INSTANCE = timelineVideoFx;
        GeneratedMessageLite.registerDefaultInstance(TimelineVideoFx.class, timelineVideoFx);
    }

    private TimelineVideoFx() {
    }

    private void addAllFxParams(Iterable<? extends FxParam> iterable) {
        ensureFxParamsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fxParams_);
    }

    private void addFxParams(int i7, FxParam fxParam) {
        fxParam.getClass();
        ensureFxParamsIsMutable();
        this.fxParams_.add(i7, fxParam);
    }

    private void addFxParams(FxParam fxParam) {
        fxParam.getClass();
        ensureFxParamsIsMutable();
        this.fxParams_.add(fxParam);
    }

    private void clearCorrespondingAudioClipId() {
        this.correspondingAudioClipId_ = getDefaultInstance().getCorrespondingAudioClipId();
    }

    private void clearCorrespondingSoundDownloadUrl() {
        this.correspondingSoundDownloadUrl_ = getDefaultInstance().getCorrespondingSoundDownloadUrl();
    }

    private void clearCorrespondingSoundDuration() {
        this.correspondingSoundDuration_ = getDefaultInstance().getCorrespondingSoundDuration();
    }

    private void clearCorrespondingSoundETime() {
        this.correspondingSoundETime_ = getDefaultInstance().getCorrespondingSoundETime();
    }

    private void clearCorrespondingSoundFilePath() {
        this.correspondingSoundFilePath_ = getDefaultInstance().getCorrespondingSoundFilePath();
    }

    private void clearCorrespondingSoundId() {
        this.correspondingSoundId_ = getDefaultInstance().getCorrespondingSoundId();
    }

    private void clearCorrespondingSoundName() {
        this.correspondingSoundName_ = getDefaultInstance().getCorrespondingSoundName();
    }

    private void clearCorrespondingSoundSTime() {
        this.correspondingSoundSTime_ = getDefaultInstance().getCorrespondingSoundSTime();
    }

    private void clearFxName() {
        this.fxName_ = getDefaultInstance().getFxName();
    }

    private void clearFxParams() {
        this.fxParams_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearFxType() {
        this.fxType_ = 0;
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearInPoint() {
        this.inPoint_ = 0L;
    }

    private void clearLicensePath() {
        this.licensePath_ = null;
    }

    private void clearMaterialId() {
        this.materialId_ = null;
    }

    private void clearMaterialType() {
        this.materialType_ = 0;
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearOutPoint() {
        this.outPoint_ = 0L;
    }

    private void clearPackagePath() {
        this.packagePath_ = null;
    }

    private void clearRecycle() {
        this.recycle_ = false;
    }

    private void clearRowInTrack() {
        this.rowInTrack_ = 0;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void ensureFxParamsIsMutable() {
        Internal.ProtobufList<FxParam> protobufList = this.fxParams_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fxParams_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TimelineVideoFx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLicensePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.licensePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.licensePath_ = localPath;
        } else {
            this.licensePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.licensePath_).mergeFrom(localPath)).buildPartial();
        }
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

    private void mergePackagePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.packagePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.packagePath_ = localPath;
        } else {
            this.packagePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.packagePath_).mergeFrom(localPath)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(TimelineVideoFx timelineVideoFx) {
        return (b) DEFAULT_INSTANCE.createBuilder(timelineVideoFx);
    }

    public static TimelineVideoFx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimelineVideoFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimelineVideoFx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimelineVideoFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimelineVideoFx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TimelineVideoFx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TimelineVideoFx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TimelineVideoFx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TimelineVideoFx parseFrom(InputStream inputStream) throws IOException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimelineVideoFx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimelineVideoFx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TimelineVideoFx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TimelineVideoFx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TimelineVideoFx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimelineVideoFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<TimelineVideoFx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFxParams(int i7) {
        ensureFxParamsIsMutable();
        this.fxParams_.remove(i7);
    }

    private void setCorrespondingAudioClipId(String str) {
        str.getClass();
        this.correspondingAudioClipId_ = str;
    }

    private void setCorrespondingAudioClipIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingAudioClipId_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundDownloadUrl(String str) {
        str.getClass();
        this.correspondingSoundDownloadUrl_ = str;
    }

    private void setCorrespondingSoundDownloadUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundDownloadUrl_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundDuration(String str) {
        str.getClass();
        this.correspondingSoundDuration_ = str;
    }

    private void setCorrespondingSoundDurationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundDuration_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundETime(String str) {
        str.getClass();
        this.correspondingSoundETime_ = str;
    }

    private void setCorrespondingSoundETimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundETime_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundFilePath(String str) {
        str.getClass();
        this.correspondingSoundFilePath_ = str;
    }

    private void setCorrespondingSoundFilePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundFilePath_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundId(String str) {
        str.getClass();
        this.correspondingSoundId_ = str;
    }

    private void setCorrespondingSoundIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundId_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundName(String str) {
        str.getClass();
        this.correspondingSoundName_ = str;
    }

    private void setCorrespondingSoundNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundName_ = byteString.toStringUtf8();
    }

    private void setCorrespondingSoundSTime(String str) {
        str.getClass();
        this.correspondingSoundSTime_ = str;
    }

    private void setCorrespondingSoundSTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingSoundSTime_ = byteString.toStringUtf8();
    }

    private void setFxName(String str) {
        str.getClass();
        this.fxName_ = str;
    }

    private void setFxNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fxName_ = byteString.toStringUtf8();
    }

    private void setFxParams(int i7, FxParam fxParam) {
        fxParam.getClass();
        ensureFxParamsIsMutable();
        this.fxParams_.set(i7, fxParam);
    }

    private void setFxType(FxType fxType) {
        this.fxType_ = fxType.getNumber();
    }

    private void setFxTypeValue(int i7) {
        this.fxType_ = i7;
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setInPoint(long j7) {
        this.inPoint_ = j7;
    }

    private void setLicensePath(LocalPath localPath) {
        localPath.getClass();
        this.licensePath_ = localPath;
    }

    private void setMaterialId(LocalPath localPath) {
        localPath.getClass();
        this.materialId_ = localPath;
    }

    private void setMaterialType(MaterialType materialType) {
        this.materialType_ = materialType.getNumber();
    }

    private void setMaterialTypeValue(int i7) {
        this.materialType_ = i7;
    }

    private void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setOutPoint(long j7) {
        this.outPoint_ = j7;
    }

    private void setPackagePath(LocalPath localPath) {
        localPath.getClass();
        this.packagePath_ = localPath;
    }

    private void setRecycle(boolean z6) {
        this.recycle_ = z6;
    }

    private void setRowInTrack(int i7) {
        this.rowInTrack_ = i7;
    }

    private void setTemplateFxFrom(TemplateFxFrom templateFxFrom) {
        this.templateFxFrom_ = templateFxFrom.getNumber();
    }

    private void setTemplateFxFromValue(int i7) {
        this.templateFxFrom_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108889a[methodToInvoke.ordinal()]) {
            case 1:
                return new TimelineVideoFx();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0000\u0001\u0016\u0016\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0004\u0005Ȉ\u0006\f\u0007\t\b\t\t\t\nȈ\u000b\u001b\f\f\r\u0007\u000e\f\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ", new Object[]{"idString_", "inPoint_", "outPoint_", "rowInTrack_", "fxName_", "fxType_", "materialId_", "packagePath_", "licensePath_", "name_", "fxParams_", FxParam.class, "materialType_", "recycle_", "templateFxFrom_", "correspondingSoundName_", "correspondingSoundId_", "correspondingSoundDuration_", "correspondingSoundSTime_", "correspondingSoundETime_", "correspondingSoundDownloadUrl_", "correspondingSoundFilePath_", "correspondingAudioClipId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TimelineVideoFx.class) {
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

    public String getCorrespondingAudioClipId() {
        return this.correspondingAudioClipId_;
    }

    public ByteString getCorrespondingAudioClipIdBytes() {
        return ByteString.copyFromUtf8(this.correspondingAudioClipId_);
    }

    public String getCorrespondingSoundDownloadUrl() {
        return this.correspondingSoundDownloadUrl_;
    }

    public ByteString getCorrespondingSoundDownloadUrlBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundDownloadUrl_);
    }

    public String getCorrespondingSoundDuration() {
        return this.correspondingSoundDuration_;
    }

    public ByteString getCorrespondingSoundDurationBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundDuration_);
    }

    public String getCorrespondingSoundETime() {
        return this.correspondingSoundETime_;
    }

    public ByteString getCorrespondingSoundETimeBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundETime_);
    }

    public String getCorrespondingSoundFilePath() {
        return this.correspondingSoundFilePath_;
    }

    public ByteString getCorrespondingSoundFilePathBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundFilePath_);
    }

    public String getCorrespondingSoundId() {
        return this.correspondingSoundId_;
    }

    public ByteString getCorrespondingSoundIdBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundId_);
    }

    public String getCorrespondingSoundName() {
        return this.correspondingSoundName_;
    }

    public ByteString getCorrespondingSoundNameBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundName_);
    }

    public String getCorrespondingSoundSTime() {
        return this.correspondingSoundSTime_;
    }

    public ByteString getCorrespondingSoundSTimeBytes() {
        return ByteString.copyFromUtf8(this.correspondingSoundSTime_);
    }

    public String getFxName() {
        return this.fxName_;
    }

    public ByteString getFxNameBytes() {
        return ByteString.copyFromUtf8(this.fxName_);
    }

    public FxParam getFxParams(int i7) {
        return (FxParam) this.fxParams_.get(i7);
    }

    public int getFxParamsCount() {
        return this.fxParams_.size();
    }

    public List<FxParam> getFxParamsList() {
        return this.fxParams_;
    }

    public c getFxParamsOrBuilder(int i7) {
        return (c) this.fxParams_.get(i7);
    }

    public List<? extends c> getFxParamsOrBuilderList() {
        return this.fxParams_;
    }

    public FxType getFxType() {
        FxType fxTypeForNumber = FxType.forNumber(this.fxType_);
        FxType fxType = fxTypeForNumber;
        if (fxTypeForNumber == null) {
            fxType = FxType.UNRECOGNIZED;
        }
        return fxType;
    }

    public int getFxTypeValue() {
        return this.fxType_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public long getInPoint() {
        return this.inPoint_;
    }

    public LocalPath getLicensePath() {
        LocalPath localPath = this.licensePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getMaterialId() {
        LocalPath localPath = this.materialId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public MaterialType getMaterialType() {
        MaterialType materialTypeForNumber = MaterialType.forNumber(this.materialType_);
        MaterialType materialType = materialTypeForNumber;
        if (materialTypeForNumber == null) {
            materialType = MaterialType.UNRECOGNIZED;
        }
        return materialType;
    }

    public int getMaterialTypeValue() {
        return this.materialType_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public long getOutPoint() {
        return this.outPoint_;
    }

    public LocalPath getPackagePath() {
        LocalPath localPath = this.packagePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getRecycle() {
        return this.recycle_;
    }

    public int getRowInTrack() {
        return this.rowInTrack_;
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

    public boolean hasLicensePath() {
        return this.licensePath_ != null;
    }

    public boolean hasMaterialId() {
        return this.materialId_ != null;
    }

    public boolean hasPackagePath() {
        return this.packagePath_ != null;
    }
}
