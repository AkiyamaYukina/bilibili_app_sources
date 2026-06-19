package com.bilibili.studio.videoeditor;

import androidx.room.util.TableInfo;
import com.bilibili.studio.videoeditor.ControlPoint;
import com.bilibili.studio.videoeditor.LocalPath;
import com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo;
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
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx.class */
public final class VideoClipFx extends GeneratedMessageLite<VideoClipFx, b> implements B {
    public static final int BRIGHTNESS_FIELD_NUMBER = 27;
    public static final int BUILTINFXNAME_FIELD_NUMBER = 3;
    public static final int BUSINESSTYPE_FIELD_NUMBER = 5;
    public static final int CONTRAST_FIELD_NUMBER = 29;
    public static final int CONTROLPOINTFORROTATION_FIELD_NUMBER = 43;
    public static final int CONTROLPOINTFORSCALEX_FIELD_NUMBER = 39;
    public static final int CONTROLPOINTFORSCALEY_FIELD_NUMBER = 40;
    public static final int CONTROLPOINTFORTRANSX_FIELD_NUMBER = 41;
    public static final int CONTROLPOINTFORTRANSY_FIELD_NUMBER = 42;
    public static final int CVVIDEOFX_FIELD_NUMBER = 52;
    public static final int DATAFILEPATH_FIELD_NUMBER = 51;
    private static final VideoClipFx DEFAULT_INSTANCE;
    public static final int DESCRIPTIONSTRING_FIELD_NUMBER = 8;
    public static final int EXTRABACKGROUNDCOLOR_FIELD_NUMBER = 45;
    public static final int EXTRABACKGROUNDPICTUREPATH_FIELD_NUMBER = 44;
    public static final int EXTRACROPPERRATIOTYPE_FIELD_NUMBER = 48;
    public static final int EXTRACROPPERRATIO_FIELD_NUMBER = 47;
    public static final int EXTRAMATTEINFOS_FIELD_NUMBER = 50;
    public static final int EXTRAMATTEINFO_FIELD_NUMBER = 49;
    public static final int EXTRAVIRTUALIDOL_FIELD_NUMBER = 46;
    public static final int FADE_FIELD_NUMBER = 35;
    public static final int FEATHERWIDTH_FIELD_NUMBER = 20;
    public static final int FILLMODE_FIELD_NUMBER = 17;
    public static final int FILTERNAME_FIELD_NUMBER = 23;
    public static final int FXTYPE_FIELD_NUMBER = 4;
    public static final int GRAYSCALE_FIELD_NUMBER = 26;
    public static final int HIGHLIGHTS_FIELD_NUMBER = 33;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int INDEX_FIELD_NUMBER = 2;
    public static final int INTENSITY_FIELD_NUMBER = 22;
    public static final int INVERSEREGION_FIELD_NUMBER = 19;
    public static final int KEEPRGB_FIELD_NUMBER = 18;
    public static final int KEYFRAMEINFOS_FIELD_NUMBER = 37;
    public static final int LICENSEPATH_FIELD_NUMBER = 38;
    public static final int MATERIALID_FIELD_NUMBER = 7;
    public static final int NOBACKGROUND_FIELD_NUMBER = 9;
    public static final int OPACITY_FIELD_NUMBER = 14;
    public static final int PACKAGEPATH_FIELD_NUMBER = 24;
    private static volatile Parser<VideoClipFx> PARSER;
    public static final int REGIONINFO_FIELD_NUMBER = 21;
    public static final int RESOURCEDIR_FIELD_NUMBER = 10;
    public static final int ROTATION_FIELD_NUMBER = 13;
    public static final int SATURATION_FIELD_NUMBER = 28;
    public static final int SCALEX_FIELD_NUMBER = 15;
    public static final int SCALEY_FIELD_NUMBER = 16;
    public static final int SENCETYPE_FIELD_NUMBER = 36;
    public static final int SHADOWS_FIELD_NUMBER = 34;
    public static final int SHARPNESS_FIELD_NUMBER = 30;
    public static final int STROKEONLY_FIELD_NUMBER = 25;
    public static final int TEMPERATURE_FIELD_NUMBER = 32;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 53;
    public static final int TIMEPOSITION_FIELD_NUMBER = 6;
    public static final int TRANSX_FIELD_NUMBER = 11;
    public static final int TRANSY_FIELD_NUMBER = 12;
    public static final int VIGNETTE_FIELD_NUMBER = 31;
    private float brightness_;
    private int builtinFxName_;
    private int businessType_;
    private float contrast_;
    private ControlPoint controlPointForRotation_;
    private ControlPoint controlPointForScaleX_;
    private ControlPoint controlPointForScaleY_;
    private ControlPoint controlPointForTransX_;
    private ControlPoint controlPointForTransY_;
    private boolean cvVideoFx_;
    private LocalPath extraBackgroundPicturePath_;
    private float fade_;
    private float featherWidth_;
    private int fillMode_;
    private int fxType_;
    private boolean grayscale_;
    private float highlights_;
    private int index_;
    private float intensity_;
    private boolean inverseRegion_;
    private boolean keepRGB_;
    private LocalPath materialId_;
    private boolean noBackground_;
    private float opacity_;
    private VideoClipMaskRegionInfo regionInfo_;
    private float rotation_;
    private float saturation_;
    private float scaleX_;
    private float scaleY_;
    private int senceType_;
    private float shadows_;
    private float sharpness_;
    private boolean strokeOnly_;
    private float temperature_;
    private int templateFxFrom_;
    private long timePosition_;
    private float transX_;
    private float transY_;
    private float vignette_;
    private String idString_ = "";
    private String descriptionString_ = "";
    private String resourceDir_ = "";
    private String filterName_ = "";
    private String packagePath_ = "";
    private Internal.ProtobufList<VideoClipFx> keyFrameInfos_ = GeneratedMessageLite.emptyProtobufList();
    private String licensePath_ = "";
    private String extraBackgroundColor_ = "";
    private String extraCropperRatio_ = "";
    private String extraCropperRatioType_ = "";
    private String extraVirtualIdol_ = "";
    private String extraMatteInfo_ = "";
    private String extraMatteInfos_ = "";
    private String dataFilePath_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$BuiltinFxName.class */
    public enum BuiltinFxName implements Internal.EnumLite {
        Undefine(0),
        Storyboard(1),
        Transform2D(2),
        MaskGenerator(3),
        Cartoon(4),
        Lut(5),
        UNRECOGNIZED(-1);

        public static final int Cartoon_VALUE = 4;
        public static final int Lut_VALUE = 5;
        public static final int MaskGenerator_VALUE = 3;
        public static final int Storyboard_VALUE = 1;
        public static final int Transform2D_VALUE = 2;
        public static final int Undefine_VALUE = 0;
        private static final Internal.EnumLiteMap<BuiltinFxName> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$BuiltinFxName$a.class */
        public final class a implements Internal.EnumLiteMap<BuiltinFxName> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return BuiltinFxName.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$BuiltinFxName$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108898a = new Object();

            public final boolean isInRange(int i7) {
                return BuiltinFxName.forNumber(i7) != null;
            }
        }

        BuiltinFxName(int i7) {
            this.value = i7;
        }

        public static BuiltinFxName forNumber(int i7) {
            if (i7 == 0) {
                return Undefine;
            }
            if (i7 == 1) {
                return Storyboard;
            }
            if (i7 == 2) {
                return Transform2D;
            }
            if (i7 == 3) {
                return MaskGenerator;
            }
            if (i7 == 4) {
                return Cartoon;
            }
            if (i7 != 5) {
                return null;
            }
            return Lut;
        }

        public static Internal.EnumLiteMap<BuiltinFxName> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108898a;
        }

        @Deprecated
        public static BuiltinFxName valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$BusinessType.class */
    public enum BusinessType implements Internal.EnumLite {
        Background(0),
        Trans2D(1),
        Cut2D(2),
        Mask(3),
        KeyFrame(4),
        Sence(5),
        BuildInFilter(6),
        VideoFilter(7),
        CustomFilter(8),
        VirtualIdol(9),
        ChromaMatting(10),
        VideoDetect(11),
        Default(12),
        PortraitEffect(13),
        UNRECOGNIZED(-1);

        public static final int Background_VALUE = 0;
        public static final int BuildInFilter_VALUE = 6;
        public static final int ChromaMatting_VALUE = 10;
        public static final int CustomFilter_VALUE = 8;
        public static final int Cut2D_VALUE = 2;
        public static final int Default_VALUE = 12;
        public static final int KeyFrame_VALUE = 4;
        public static final int Mask_VALUE = 3;
        public static final int PortraitEffect_VALUE = 13;
        public static final int Sence_VALUE = 5;
        public static final int Trans2D_VALUE = 1;
        public static final int VideoDetect_VALUE = 11;
        public static final int VideoFilter_VALUE = 7;
        public static final int VirtualIdol_VALUE = 9;
        private static final Internal.EnumLiteMap<BusinessType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$BusinessType$a.class */
        public final class a implements Internal.EnumLiteMap<BusinessType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return BusinessType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$BusinessType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108899a = new Object();

            public final boolean isInRange(int i7) {
                return BusinessType.forNumber(i7) != null;
            }
        }

        BusinessType(int i7) {
            this.value = i7;
        }

        public static BusinessType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return Background;
                case 1:
                    return Trans2D;
                case 2:
                    return Cut2D;
                case 3:
                    return Mask;
                case 4:
                    return KeyFrame;
                case 5:
                    return Sence;
                case 6:
                    return BuildInFilter;
                case 7:
                    return VideoFilter;
                case 8:
                    return CustomFilter;
                case 9:
                    return VirtualIdol;
                case 10:
                    return ChromaMatting;
                case 11:
                    return VideoDetect;
                case 12:
                    return Default;
                case 13:
                    return PortraitEffect;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<BusinessType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108899a;
        }

        @Deprecated
        public static BusinessType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$FxType.class */
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$FxType$a.class */
        public final class a implements Internal.EnumLiteMap<FxType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return FxType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$FxType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108900a = new Object();

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
            return b.f108900a;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$SenceType.class */
    public enum SenceType implements Internal.EnumLite {
        None(0),
        Pull(1),
        Push(2),
        UNRECOGNIZED(-1);

        public static final int None_VALUE = 0;
        public static final int Pull_VALUE = 1;
        public static final int Push_VALUE = 2;
        private static final Internal.EnumLiteMap<SenceType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$SenceType$a.class */
        public final class a implements Internal.EnumLiteMap<SenceType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return SenceType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$SenceType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108901a = new Object();

            public final boolean isInRange(int i7) {
                return SenceType.forNumber(i7) != null;
            }
        }

        SenceType(int i7) {
            this.value = i7;
        }

        public static SenceType forNumber(int i7) {
            if (i7 == 0) {
                return None;
            }
            if (i7 == 1) {
                return Pull;
            }
            if (i7 != 2) {
                return null;
            }
            return Push;
        }

        public static Internal.EnumLiteMap<SenceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108901a;
        }

        @Deprecated
        public static SenceType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108902a;

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
                com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipFx.a.f108902a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.VideoClipFx.a.m10377clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipFx$b.class */
    public static final class b extends GeneratedMessageLite.Builder<VideoClipFx, b> implements B {
        public b() {
            super(VideoClipFx.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoClipFx videoClipFx = new VideoClipFx();
        DEFAULT_INSTANCE = videoClipFx;
        GeneratedMessageLite.registerDefaultInstance(VideoClipFx.class, videoClipFx);
    }

    private VideoClipFx() {
    }

    private void addAllKeyFrameInfos(Iterable<? extends VideoClipFx> iterable) {
        ensureKeyFrameInfosIsMutable();
        AbstractMessageLite.addAll(iterable, this.keyFrameInfos_);
    }

    private void addKeyFrameInfos(int i7, VideoClipFx videoClipFx) {
        videoClipFx.getClass();
        ensureKeyFrameInfosIsMutable();
        this.keyFrameInfos_.add(i7, videoClipFx);
    }

    private void addKeyFrameInfos(VideoClipFx videoClipFx) {
        videoClipFx.getClass();
        ensureKeyFrameInfosIsMutable();
        this.keyFrameInfos_.add(videoClipFx);
    }

    private void clearBrightness() {
        this.brightness_ = 0.0f;
    }

    private void clearBuiltinFxName() {
        this.builtinFxName_ = 0;
    }

    private void clearBusinessType() {
        this.businessType_ = 0;
    }

    private void clearContrast() {
        this.contrast_ = 0.0f;
    }

    private void clearControlPointForRotation() {
        this.controlPointForRotation_ = null;
    }

    private void clearControlPointForScaleX() {
        this.controlPointForScaleX_ = null;
    }

    private void clearControlPointForScaleY() {
        this.controlPointForScaleY_ = null;
    }

    private void clearControlPointForTransX() {
        this.controlPointForTransX_ = null;
    }

    private void clearControlPointForTransY() {
        this.controlPointForTransY_ = null;
    }

    private void clearCvVideoFx() {
        this.cvVideoFx_ = false;
    }

    private void clearDataFilePath() {
        this.dataFilePath_ = getDefaultInstance().getDataFilePath();
    }

    private void clearDescriptionString() {
        this.descriptionString_ = getDefaultInstance().getDescriptionString();
    }

    private void clearExtraBackgroundColor() {
        this.extraBackgroundColor_ = getDefaultInstance().getExtraBackgroundColor();
    }

    private void clearExtraBackgroundPicturePath() {
        this.extraBackgroundPicturePath_ = null;
    }

    private void clearExtraCropperRatio() {
        this.extraCropperRatio_ = getDefaultInstance().getExtraCropperRatio();
    }

    private void clearExtraCropperRatioType() {
        this.extraCropperRatioType_ = getDefaultInstance().getExtraCropperRatioType();
    }

    private void clearExtraMatteInfo() {
        this.extraMatteInfo_ = getDefaultInstance().getExtraMatteInfo();
    }

    private void clearExtraMatteInfos() {
        this.extraMatteInfos_ = getDefaultInstance().getExtraMatteInfos();
    }

    private void clearExtraVirtualIdol() {
        this.extraVirtualIdol_ = getDefaultInstance().getExtraVirtualIdol();
    }

    private void clearFade() {
        this.fade_ = 0.0f;
    }

    private void clearFeatherWidth() {
        this.featherWidth_ = 0.0f;
    }

    private void clearFillMode() {
        this.fillMode_ = 0;
    }

    private void clearFilterName() {
        this.filterName_ = getDefaultInstance().getFilterName();
    }

    private void clearFxType() {
        this.fxType_ = 0;
    }

    private void clearGrayscale() {
        this.grayscale_ = false;
    }

    private void clearHighlights() {
        this.highlights_ = 0.0f;
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearIndex() {
        this.index_ = 0;
    }

    private void clearIntensity() {
        this.intensity_ = 0.0f;
    }

    private void clearInverseRegion() {
        this.inverseRegion_ = false;
    }

    private void clearKeepRGB() {
        this.keepRGB_ = false;
    }

    private void clearKeyFrameInfos() {
        this.keyFrameInfos_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLicensePath() {
        this.licensePath_ = getDefaultInstance().getLicensePath();
    }

    private void clearMaterialId() {
        this.materialId_ = null;
    }

    private void clearNoBackground() {
        this.noBackground_ = false;
    }

    private void clearOpacity() {
        this.opacity_ = 0.0f;
    }

    private void clearPackagePath() {
        this.packagePath_ = getDefaultInstance().getPackagePath();
    }

    private void clearRegionInfo() {
        this.regionInfo_ = null;
    }

    private void clearResourceDir() {
        this.resourceDir_ = getDefaultInstance().getResourceDir();
    }

    private void clearRotation() {
        this.rotation_ = 0.0f;
    }

    private void clearSaturation() {
        this.saturation_ = 0.0f;
    }

    private void clearScaleX() {
        this.scaleX_ = 0.0f;
    }

    private void clearScaleY() {
        this.scaleY_ = 0.0f;
    }

    private void clearSenceType() {
        this.senceType_ = 0;
    }

    private void clearShadows() {
        this.shadows_ = 0.0f;
    }

    private void clearSharpness() {
        this.sharpness_ = 0.0f;
    }

    private void clearStrokeOnly() {
        this.strokeOnly_ = false;
    }

    private void clearTemperature() {
        this.temperature_ = 0.0f;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void clearTimePosition() {
        this.timePosition_ = 0L;
    }

    private void clearTransX() {
        this.transX_ = 0.0f;
    }

    private void clearTransY() {
        this.transY_ = 0.0f;
    }

    private void clearVignette() {
        this.vignette_ = 0.0f;
    }

    private void ensureKeyFrameInfosIsMutable() {
        Internal.ProtobufList<VideoClipFx> protobufList = this.keyFrameInfos_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keyFrameInfos_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoClipFx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeControlPointForRotation(ControlPoint controlPoint) {
        controlPoint.getClass();
        ControlPoint controlPoint2 = this.controlPointForRotation_;
        if (controlPoint2 == null || controlPoint2 == ControlPoint.getDefaultInstance()) {
            this.controlPointForRotation_ = controlPoint;
        } else {
            this.controlPointForRotation_ = (ControlPoint) ((ControlPoint.b) ControlPoint.newBuilder(this.controlPointForRotation_).mergeFrom(controlPoint)).buildPartial();
        }
    }

    private void mergeControlPointForScaleX(ControlPoint controlPoint) {
        controlPoint.getClass();
        ControlPoint controlPoint2 = this.controlPointForScaleX_;
        if (controlPoint2 == null || controlPoint2 == ControlPoint.getDefaultInstance()) {
            this.controlPointForScaleX_ = controlPoint;
        } else {
            this.controlPointForScaleX_ = (ControlPoint) ((ControlPoint.b) ControlPoint.newBuilder(this.controlPointForScaleX_).mergeFrom(controlPoint)).buildPartial();
        }
    }

    private void mergeControlPointForScaleY(ControlPoint controlPoint) {
        controlPoint.getClass();
        ControlPoint controlPoint2 = this.controlPointForScaleY_;
        if (controlPoint2 == null || controlPoint2 == ControlPoint.getDefaultInstance()) {
            this.controlPointForScaleY_ = controlPoint;
        } else {
            this.controlPointForScaleY_ = (ControlPoint) ((ControlPoint.b) ControlPoint.newBuilder(this.controlPointForScaleY_).mergeFrom(controlPoint)).buildPartial();
        }
    }

    private void mergeControlPointForTransX(ControlPoint controlPoint) {
        controlPoint.getClass();
        ControlPoint controlPoint2 = this.controlPointForTransX_;
        if (controlPoint2 == null || controlPoint2 == ControlPoint.getDefaultInstance()) {
            this.controlPointForTransX_ = controlPoint;
        } else {
            this.controlPointForTransX_ = (ControlPoint) ((ControlPoint.b) ControlPoint.newBuilder(this.controlPointForTransX_).mergeFrom(controlPoint)).buildPartial();
        }
    }

    private void mergeControlPointForTransY(ControlPoint controlPoint) {
        controlPoint.getClass();
        ControlPoint controlPoint2 = this.controlPointForTransY_;
        if (controlPoint2 == null || controlPoint2 == ControlPoint.getDefaultInstance()) {
            this.controlPointForTransY_ = controlPoint;
        } else {
            this.controlPointForTransY_ = (ControlPoint) ((ControlPoint.b) ControlPoint.newBuilder(this.controlPointForTransY_).mergeFrom(controlPoint)).buildPartial();
        }
    }

    private void mergeExtraBackgroundPicturePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.extraBackgroundPicturePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.extraBackgroundPicturePath_ = localPath;
        } else {
            this.extraBackgroundPicturePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.extraBackgroundPicturePath_).mergeFrom(localPath)).buildPartial();
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

    private void mergeRegionInfo(VideoClipMaskRegionInfo videoClipMaskRegionInfo) {
        videoClipMaskRegionInfo.getClass();
        VideoClipMaskRegionInfo videoClipMaskRegionInfo2 = this.regionInfo_;
        if (videoClipMaskRegionInfo2 == null || videoClipMaskRegionInfo2 == VideoClipMaskRegionInfo.getDefaultInstance()) {
            this.regionInfo_ = videoClipMaskRegionInfo;
        } else {
            this.regionInfo_ = (VideoClipMaskRegionInfo) ((VideoClipMaskRegionInfo.b) VideoClipMaskRegionInfo.newBuilder(this.regionInfo_).mergeFrom(videoClipMaskRegionInfo)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(VideoClipFx videoClipFx) {
        return (b) DEFAULT_INSTANCE.createBuilder(videoClipFx);
    }

    public static VideoClipFx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoClipFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClipFx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClipFx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoClipFx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoClipFx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoClipFx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static VideoClipFx parseFrom(InputStream inputStream) throws IOException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClipFx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClipFx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VideoClipFx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoClipFx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoClipFx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<VideoClipFx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeKeyFrameInfos(int i7) {
        ensureKeyFrameInfosIsMutable();
        this.keyFrameInfos_.remove(i7);
    }

    private void setBrightness(float f7) {
        this.brightness_ = f7;
    }

    private void setBuiltinFxName(BuiltinFxName builtinFxName) {
        this.builtinFxName_ = builtinFxName.getNumber();
    }

    private void setBuiltinFxNameValue(int i7) {
        this.builtinFxName_ = i7;
    }

    private void setBusinessType(BusinessType businessType) {
        this.businessType_ = businessType.getNumber();
    }

    private void setBusinessTypeValue(int i7) {
        this.businessType_ = i7;
    }

    private void setContrast(float f7) {
        this.contrast_ = f7;
    }

    private void setControlPointForRotation(ControlPoint controlPoint) {
        controlPoint.getClass();
        this.controlPointForRotation_ = controlPoint;
    }

    private void setControlPointForScaleX(ControlPoint controlPoint) {
        controlPoint.getClass();
        this.controlPointForScaleX_ = controlPoint;
    }

    private void setControlPointForScaleY(ControlPoint controlPoint) {
        controlPoint.getClass();
        this.controlPointForScaleY_ = controlPoint;
    }

    private void setControlPointForTransX(ControlPoint controlPoint) {
        controlPoint.getClass();
        this.controlPointForTransX_ = controlPoint;
    }

    private void setControlPointForTransY(ControlPoint controlPoint) {
        controlPoint.getClass();
        this.controlPointForTransY_ = controlPoint;
    }

    private void setCvVideoFx(boolean z6) {
        this.cvVideoFx_ = z6;
    }

    private void setDataFilePath(String str) {
        str.getClass();
        this.dataFilePath_ = str;
    }

    private void setDataFilePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dataFilePath_ = byteString.toStringUtf8();
    }

    private void setDescriptionString(String str) {
        str.getClass();
        this.descriptionString_ = str;
    }

    private void setDescriptionStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.descriptionString_ = byteString.toStringUtf8();
    }

    private void setExtraBackgroundColor(String str) {
        str.getClass();
        this.extraBackgroundColor_ = str;
    }

    private void setExtraBackgroundColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraBackgroundColor_ = byteString.toStringUtf8();
    }

    private void setExtraBackgroundPicturePath(LocalPath localPath) {
        localPath.getClass();
        this.extraBackgroundPicturePath_ = localPath;
    }

    private void setExtraCropperRatio(String str) {
        str.getClass();
        this.extraCropperRatio_ = str;
    }

    private void setExtraCropperRatioBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraCropperRatio_ = byteString.toStringUtf8();
    }

    private void setExtraCropperRatioType(String str) {
        str.getClass();
        this.extraCropperRatioType_ = str;
    }

    private void setExtraCropperRatioTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraCropperRatioType_ = byteString.toStringUtf8();
    }

    private void setExtraMatteInfo(String str) {
        str.getClass();
        this.extraMatteInfo_ = str;
    }

    private void setExtraMatteInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraMatteInfo_ = byteString.toStringUtf8();
    }

    private void setExtraMatteInfos(String str) {
        str.getClass();
        this.extraMatteInfos_ = str;
    }

    private void setExtraMatteInfosBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraMatteInfos_ = byteString.toStringUtf8();
    }

    private void setExtraVirtualIdol(String str) {
        str.getClass();
        this.extraVirtualIdol_ = str;
    }

    private void setExtraVirtualIdolBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraVirtualIdol_ = byteString.toStringUtf8();
    }

    private void setFade(float f7) {
        this.fade_ = f7;
    }

    private void setFeatherWidth(float f7) {
        this.featherWidth_ = f7;
    }

    private void setFillMode(int i7) {
        this.fillMode_ = i7;
    }

    private void setFilterName(String str) {
        str.getClass();
        this.filterName_ = str;
    }

    private void setFilterNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.filterName_ = byteString.toStringUtf8();
    }

    private void setFxType(FxType fxType) {
        this.fxType_ = fxType.getNumber();
    }

    private void setFxTypeValue(int i7) {
        this.fxType_ = i7;
    }

    private void setGrayscale(boolean z6) {
        this.grayscale_ = z6;
    }

    private void setHighlights(float f7) {
        this.highlights_ = f7;
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setIndex(int i7) {
        this.index_ = i7;
    }

    private void setIntensity(float f7) {
        this.intensity_ = f7;
    }

    private void setInverseRegion(boolean z6) {
        this.inverseRegion_ = z6;
    }

    private void setKeepRGB(boolean z6) {
        this.keepRGB_ = z6;
    }

    private void setKeyFrameInfos(int i7, VideoClipFx videoClipFx) {
        videoClipFx.getClass();
        ensureKeyFrameInfosIsMutable();
        this.keyFrameInfos_.set(i7, videoClipFx);
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

    private void setNoBackground(boolean z6) {
        this.noBackground_ = z6;
    }

    private void setOpacity(float f7) {
        this.opacity_ = f7;
    }

    private void setPackagePath(String str) {
        str.getClass();
        this.packagePath_ = str;
    }

    private void setPackagePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packagePath_ = byteString.toStringUtf8();
    }

    private void setRegionInfo(VideoClipMaskRegionInfo videoClipMaskRegionInfo) {
        videoClipMaskRegionInfo.getClass();
        this.regionInfo_ = videoClipMaskRegionInfo;
    }

    private void setResourceDir(String str) {
        str.getClass();
        this.resourceDir_ = str;
    }

    private void setResourceDirBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resourceDir_ = byteString.toStringUtf8();
    }

    private void setRotation(float f7) {
        this.rotation_ = f7;
    }

    private void setSaturation(float f7) {
        this.saturation_ = f7;
    }

    private void setScaleX(float f7) {
        this.scaleX_ = f7;
    }

    private void setScaleY(float f7) {
        this.scaleY_ = f7;
    }

    private void setSenceType(SenceType senceType) {
        this.senceType_ = senceType.getNumber();
    }

    private void setSenceTypeValue(int i7) {
        this.senceType_ = i7;
    }

    private void setShadows(float f7) {
        this.shadows_ = f7;
    }

    private void setSharpness(float f7) {
        this.sharpness_ = f7;
    }

    private void setStrokeOnly(boolean z6) {
        this.strokeOnly_ = z6;
    }

    private void setTemperature(float f7) {
        this.temperature_ = f7;
    }

    private void setTemplateFxFrom(TemplateFxFrom templateFxFrom) {
        this.templateFxFrom_ = templateFxFrom.getNumber();
    }

    private void setTemplateFxFromValue(int i7) {
        this.templateFxFrom_ = i7;
    }

    private void setTimePosition(long j7) {
        this.timePosition_ = j7;
    }

    private void setTransX(float f7) {
        this.transX_ = f7;
    }

    private void setTransY(float f7) {
        this.transY_ = f7;
    }

    private void setVignette(float f7) {
        this.vignette_ = f7;
    }

    /* JADX WARN: Finally extract failed */
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108902a[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoClipFx();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u00005\u0000\u0000\u000155\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\f\u0004\f\u0005\f\u0006\u0002\u0007\t\bȈ\t\u0007\nȈ\u000b\u0001\f\u0001\r\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0004\u0012\u0007\u0013\u0007\u0014\u0001\u0015\t\u0016\u0001\u0017Ȉ\u0018Ȉ\u0019\u0007\u001a\u0007\u001b\u0001\u001c\u0001\u001d\u0001\u001e\u0001\u001f\u0001 \u0001!\u0001\"\u0001#\u0001$\f%\u001b&Ȉ'\t(\t)\t*\t+\t,\t-Ȉ.Ȉ/Ȉ0Ȉ1Ȉ2Ȉ3Ȉ4\u00075\f", new Object[]{"idString_", TableInfo.Index.DEFAULT_PREFIX, "builtinFxName_", "fxType_", "businessType_", "timePosition_", "materialId_", "descriptionString_", "noBackground_", "resourceDir_", "transX_", "transY_", "rotation_", "opacity_", "scaleX_", "scaleY_", "fillMode_", "keepRGB_", "inverseRegion_", "featherWidth_", "regionInfo_", "intensity_", "filterName_", "packagePath_", "strokeOnly_", "grayscale_", "brightness_", "saturation_", "contrast_", "sharpness_", "vignette_", "temperature_", "highlights_", "shadows_", "fade_", "senceType_", "keyFrameInfos_", VideoClipFx.class, "licensePath_", "controlPointForScaleX_", "controlPointForScaleY_", "controlPointForTransX_", "controlPointForTransY_", "controlPointForRotation_", "extraBackgroundPicturePath_", "extraBackgroundColor_", "extraVirtualIdol_", "extraCropperRatio_", "extraCropperRatioType_", "extraMatteInfo_", "extraMatteInfos_", "dataFilePath_", "cvVideoFx_", "templateFxFrom_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (VideoClipFx.class) {
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

    public float getBrightness() {
        return this.brightness_;
    }

    public BuiltinFxName getBuiltinFxName() {
        BuiltinFxName builtinFxNameForNumber = BuiltinFxName.forNumber(this.builtinFxName_);
        BuiltinFxName builtinFxName = builtinFxNameForNumber;
        if (builtinFxNameForNumber == null) {
            builtinFxName = BuiltinFxName.UNRECOGNIZED;
        }
        return builtinFxName;
    }

    public int getBuiltinFxNameValue() {
        return this.builtinFxName_;
    }

    public BusinessType getBusinessType() {
        BusinessType businessTypeForNumber = BusinessType.forNumber(this.businessType_);
        BusinessType businessType = businessTypeForNumber;
        if (businessTypeForNumber == null) {
            businessType = BusinessType.UNRECOGNIZED;
        }
        return businessType;
    }

    public int getBusinessTypeValue() {
        return this.businessType_;
    }

    public float getContrast() {
        return this.contrast_;
    }

    public ControlPoint getControlPointForRotation() {
        ControlPoint controlPoint = this.controlPointForRotation_;
        ControlPoint defaultInstance = controlPoint;
        if (controlPoint == null) {
            defaultInstance = ControlPoint.getDefaultInstance();
        }
        return defaultInstance;
    }

    public ControlPoint getControlPointForScaleX() {
        ControlPoint controlPoint = this.controlPointForScaleX_;
        ControlPoint defaultInstance = controlPoint;
        if (controlPoint == null) {
            defaultInstance = ControlPoint.getDefaultInstance();
        }
        return defaultInstance;
    }

    public ControlPoint getControlPointForScaleY() {
        ControlPoint controlPoint = this.controlPointForScaleY_;
        ControlPoint defaultInstance = controlPoint;
        if (controlPoint == null) {
            defaultInstance = ControlPoint.getDefaultInstance();
        }
        return defaultInstance;
    }

    public ControlPoint getControlPointForTransX() {
        ControlPoint controlPoint = this.controlPointForTransX_;
        ControlPoint defaultInstance = controlPoint;
        if (controlPoint == null) {
            defaultInstance = ControlPoint.getDefaultInstance();
        }
        return defaultInstance;
    }

    public ControlPoint getControlPointForTransY() {
        ControlPoint controlPoint = this.controlPointForTransY_;
        ControlPoint defaultInstance = controlPoint;
        if (controlPoint == null) {
            defaultInstance = ControlPoint.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getCvVideoFx() {
        return this.cvVideoFx_;
    }

    public String getDataFilePath() {
        return this.dataFilePath_;
    }

    public ByteString getDataFilePathBytes() {
        return ByteString.copyFromUtf8(this.dataFilePath_);
    }

    public String getDescriptionString() {
        return this.descriptionString_;
    }

    public ByteString getDescriptionStringBytes() {
        return ByteString.copyFromUtf8(this.descriptionString_);
    }

    public String getExtraBackgroundColor() {
        return this.extraBackgroundColor_;
    }

    public ByteString getExtraBackgroundColorBytes() {
        return ByteString.copyFromUtf8(this.extraBackgroundColor_);
    }

    public LocalPath getExtraBackgroundPicturePath() {
        LocalPath localPath = this.extraBackgroundPicturePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getExtraCropperRatio() {
        return this.extraCropperRatio_;
    }

    public ByteString getExtraCropperRatioBytes() {
        return ByteString.copyFromUtf8(this.extraCropperRatio_);
    }

    public String getExtraCropperRatioType() {
        return this.extraCropperRatioType_;
    }

    public ByteString getExtraCropperRatioTypeBytes() {
        return ByteString.copyFromUtf8(this.extraCropperRatioType_);
    }

    public String getExtraMatteInfo() {
        return this.extraMatteInfo_;
    }

    public ByteString getExtraMatteInfoBytes() {
        return ByteString.copyFromUtf8(this.extraMatteInfo_);
    }

    public String getExtraMatteInfos() {
        return this.extraMatteInfos_;
    }

    public ByteString getExtraMatteInfosBytes() {
        return ByteString.copyFromUtf8(this.extraMatteInfos_);
    }

    public String getExtraVirtualIdol() {
        return this.extraVirtualIdol_;
    }

    public ByteString getExtraVirtualIdolBytes() {
        return ByteString.copyFromUtf8(this.extraVirtualIdol_);
    }

    public float getFade() {
        return this.fade_;
    }

    public float getFeatherWidth() {
        return this.featherWidth_;
    }

    public int getFillMode() {
        return this.fillMode_;
    }

    public String getFilterName() {
        return this.filterName_;
    }

    public ByteString getFilterNameBytes() {
        return ByteString.copyFromUtf8(this.filterName_);
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

    public boolean getGrayscale() {
        return this.grayscale_;
    }

    public float getHighlights() {
        return this.highlights_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public int getIndex() {
        return this.index_;
    }

    public float getIntensity() {
        return this.intensity_;
    }

    public boolean getInverseRegion() {
        return this.inverseRegion_;
    }

    public boolean getKeepRGB() {
        return this.keepRGB_;
    }

    public VideoClipFx getKeyFrameInfos(int i7) {
        return (VideoClipFx) this.keyFrameInfos_.get(i7);
    }

    public int getKeyFrameInfosCount() {
        return this.keyFrameInfos_.size();
    }

    public List<VideoClipFx> getKeyFrameInfosList() {
        return this.keyFrameInfos_;
    }

    public B getKeyFrameInfosOrBuilder(int i7) {
        return (B) this.keyFrameInfos_.get(i7);
    }

    public List<? extends B> getKeyFrameInfosOrBuilderList() {
        return this.keyFrameInfos_;
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

    public boolean getNoBackground() {
        return this.noBackground_;
    }

    public float getOpacity() {
        return this.opacity_;
    }

    public String getPackagePath() {
        return this.packagePath_;
    }

    public ByteString getPackagePathBytes() {
        return ByteString.copyFromUtf8(this.packagePath_);
    }

    public VideoClipMaskRegionInfo getRegionInfo() {
        VideoClipMaskRegionInfo videoClipMaskRegionInfo = this.regionInfo_;
        VideoClipMaskRegionInfo defaultInstance = videoClipMaskRegionInfo;
        if (videoClipMaskRegionInfo == null) {
            defaultInstance = VideoClipMaskRegionInfo.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getResourceDir() {
        return this.resourceDir_;
    }

    public ByteString getResourceDirBytes() {
        return ByteString.copyFromUtf8(this.resourceDir_);
    }

    public float getRotation() {
        return this.rotation_;
    }

    public float getSaturation() {
        return this.saturation_;
    }

    public float getScaleX() {
        return this.scaleX_;
    }

    public float getScaleY() {
        return this.scaleY_;
    }

    public SenceType getSenceType() {
        SenceType senceTypeForNumber = SenceType.forNumber(this.senceType_);
        SenceType senceType = senceTypeForNumber;
        if (senceTypeForNumber == null) {
            senceType = SenceType.UNRECOGNIZED;
        }
        return senceType;
    }

    public int getSenceTypeValue() {
        return this.senceType_;
    }

    public float getShadows() {
        return this.shadows_;
    }

    public float getSharpness() {
        return this.sharpness_;
    }

    public boolean getStrokeOnly() {
        return this.strokeOnly_;
    }

    public float getTemperature() {
        return this.temperature_;
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

    public long getTimePosition() {
        return this.timePosition_;
    }

    public float getTransX() {
        return this.transX_;
    }

    public float getTransY() {
        return this.transY_;
    }

    public float getVignette() {
        return this.vignette_;
    }

    public boolean hasControlPointForRotation() {
        return this.controlPointForRotation_ != null;
    }

    public boolean hasControlPointForScaleX() {
        return this.controlPointForScaleX_ != null;
    }

    public boolean hasControlPointForScaleY() {
        return this.controlPointForScaleY_ != null;
    }

    public boolean hasControlPointForTransX() {
        return this.controlPointForTransX_ != null;
    }

    public boolean hasControlPointForTransY() {
        return this.controlPointForTransY_ != null;
    }

    public boolean hasExtraBackgroundPicturePath() {
        return this.extraBackgroundPicturePath_ != null;
    }

    public boolean hasMaterialId() {
        return this.materialId_ != null;
    }

    public boolean hasRegionInfo() {
        return this.regionInfo_ != null;
    }
}
