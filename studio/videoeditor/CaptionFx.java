package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Color;
import com.bilibili.studio.videoeditor.LocalPath;
import com.bilibili.studio.videoeditor.Point;
import com.bilibili.studio.videoeditor.Rect;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx.class */
public final class CaptionFx extends GeneratedMessageLite<CaptionFx, b> implements k {
    public static final int ANCHORPOINT_FIELD_NUMBER = 54;
    public static final int APPLYTEXTCOLOR_FIELD_NUMBER = 29;
    public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 25;
    public static final int BUBBLEPATH_FIELD_NUMBER = 111;
    public static final int CANREPLACE_FIELD_NUMBER = 62;
    public static final int CAPTIONTYPE_FIELD_NUMBER = 61;
    private static final CaptionFx DEFAULT_INSTANCE;
    public static final int DRAWBACKGROUNDCOLOR_FIELD_NUMBER = 55;
    public static final int DRAWOUTLINE_FIELD_NUMBER = 22;
    public static final int DRAWSHADOWCOLOR_FIELD_NUMBER = 69;
    public static final int FANCYWORDFORMAT_FIELD_NUMBER = 28;
    public static final int FANCYWORDID_FIELD_NUMBER = 26;
    public static final int FANCYWORDLICPATH_FIELD_NUMBER = 52;
    public static final int FANCYWORDPATH_FIELD_NUMBER = 27;
    public static final int FANCYWORDTEXTCOLOR_FIELD_NUMBER = 53;
    public static final int FONTID_FIELD_NUMBER = 12;
    public static final int FONTPATH_FIELD_NUMBER = 13;
    public static final int FONTSIZE_FIELD_NUMBER = 14;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int INANIMATIONDURATION_FIELD_NUMBER = 32;
    public static final int INANIMATIONID_FIELD_NUMBER = 30;
    public static final int INANIMATIONPATH_FIELD_NUMBER = 31;
    public static final int INPOINT_FIELD_NUMBER = 2;
    public static final int ISFRAMECAPTION_FIELD_NUMBER = 72;
    public static final int ISVERTICALLAYOUT_FIELD_NUMBER = 71;
    public static final int KEYFRAME_FIELD_NUMBER = 46;
    public static final int LASTANIMATIONID_FIELD_NUMBER = 49;
    public static final int LASTUGCTEMPLATETTSID_FIELD_NUMBER = 63;
    public static final int LEFTTOPPOINT_FIELD_NUMBER = 50;
    public static final int LETTERSPACING_FIELD_NUMBER = 16;
    public static final int LICENSEPATH_FIELD_NUMBER = 59;
    public static final int LINESPACING_FIELD_NUMBER = 17;
    public static final int LOOPANIMATIONDURATION_FIELD_NUMBER = 38;
    public static final int LOOPANIMATIONID_FIELD_NUMBER = 36;
    public static final int LOOPANIMATIONPATH_FIELD_NUMBER = 37;
    public static final int MATERIALTYPE_FIELD_NUMBER = 73;
    public static final int OPACITY_FIELD_NUMBER = 42;
    public static final int OUTANIMATIONDURATION_FIELD_NUMBER = 35;
    public static final int OUTANIMATIONID_FIELD_NUMBER = 33;
    public static final int OUTANIMATIONPATH_FIELD_NUMBER = 34;
    public static final int OUTLINECOLOR_FIELD_NUMBER = 24;
    public static final int OUTLINEWIDTH_FIELD_NUMBER = 23;
    public static final int OUTPOINT_FIELD_NUMBER = 3;
    public static final int PACKAGEPATH_FIELD_NUMBER = 58;
    private static volatile Parser<CaptionFx> PARSER;
    public static final int RECOGNITIONSOURCES_FIELD_NUMBER = 57;
    public static final int RECYCLE_FIELD_NUMBER = 74;
    public static final int RIGHTTOPPOINT_FIELD_NUMBER = 51;
    public static final int ROTATION_FIELD_NUMBER = 41;
    public static final int ROWINTRACK_FIELD_NUMBER = 4;
    public static final int SCALE_FIELD_NUMBER = 43;
    public static final int SHADOWCOLOR_FIELD_NUMBER = 66;
    public static final int SHADOWFEATHER_FIELD_NUMBER = 68;
    public static final int SHADOWOFFSET_FIELD_NUMBER = 67;
    public static final int SOURCETYPE_FIELD_NUMBER = 60;
    public static final int STYLEFORMAT_FIELD_NUMBER = 10;
    public static final int STYLEOPTION_FIELD_NUMBER = 9;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 75;
    public static final int TEMPLATEID_FIELD_NUMBER = 6;
    public static final int TEMPLATEPATH_FIELD_NUMBER = 7;
    public static final int TEXTALIGNMENT_FIELD_NUMBER = 15;
    public static final int TEXTBOLD_FIELD_NUMBER = 18;
    public static final int TEXTCOLORSOURCE_FIELD_NUMBER = 20;
    public static final int TEXTCOLOR_FIELD_NUMBER = 21;
    public static final int TEXTFRAMEORIGINRECT_FIELD_NUMBER = 65;
    public static final int TEXTITALIC_FIELD_NUMBER = 19;
    public static final int TEXTVERTICALALIGNMENT_FIELD_NUMBER = 64;
    public static final int TEXT_FIELD_NUMBER = 5;
    public static final int TRACEKEYFRAME_FIELD_NUMBER = 45;
    public static final int TRANSX_FIELD_NUMBER = 39;
    public static final int TRANSY_FIELD_NUMBER = 40;
    public static final int TTSAUDIOIDS_FIELD_NUMBER = 47;
    public static final int TTSID_FIELD_NUMBER = 48;
    public static final int TTSSELECTED_FIELD_NUMBER = 56;
    public static final int UNDERLINE_FIELD_NUMBER = 70;
    public static final int VERSION_FIELD_NUMBER = 11;
    public static final int WORDMAXLENGTH_FIELD_NUMBER = 8;
    public static final int ZVALUE_FIELD_NUMBER = 44;
    private Point anchorPoint_;
    private boolean applyTextColor_;
    private Color backgroundColor_;
    private LocalPath bubblePath_;
    private boolean canReplace_;
    private int captionType_;
    private boolean drawBackgroundColor_;
    private boolean drawOutline_;
    private boolean drawShadowColor_;
    private LocalPath fancyWordId_;
    private LocalPath fancyWordLicPath_;
    private LocalPath fancyWordPath_;
    private Color fancyWordTextColor_;
    private LocalPath fontId_;
    private LocalPath fontPath_;
    private float fontSize_;
    private long inAnimationDuration_;
    private LocalPath inAnimationId_;
    private LocalPath inAnimationPath_;
    private long inPoint_;
    private boolean isFrameCaption_;
    private boolean isVerticalLayout_;
    private Point leftTopPoint_;
    private float letterSpacing_;
    private LocalPath licensePath_;
    private float lineSpacing_;
    private long loopAnimationDuration_;
    private LocalPath loopAnimationId_;
    private LocalPath loopAnimationPath_;
    private int materialType_;
    private float opacity_;
    private long outAnimationDuration_;
    private LocalPath outAnimationId_;
    private LocalPath outAnimationPath_;
    private long outPoint_;
    private Color outlineColor_;
    private float outlineWidth_;
    private LocalPath packagePath_;
    private boolean recycle_;
    private Point rightTopPoint_;
    private float rotation_;
    private int rowInTrack_;
    private float scale_;
    private Color shadowColor_;
    private float shadowFeather_;
    private Point shadowOffset_;
    private int sourceType_;
    private int styleOption_;
    private int templateFxFrom_;
    private LocalPath templateId_;
    private LocalPath templatePath_;
    private int textAlignment_;
    private boolean textBold_;
    private int textColorSource_;
    private Color textColor_;
    private Rect textFrameOriginRect_;
    private boolean textItalic_;
    private int textVerticalAlignment_;
    private float transX_;
    private float transY_;
    private boolean ttsSelected_;
    private boolean underline_;
    private int wordMaxLength_;
    private float zValue_;
    private String idString_ = "";
    private String text_ = "";
    private String styleFormat_ = "";
    private String version_ = "";
    private String fancyWordFormat_ = "";
    private Internal.ProtobufList<KeyFrame> traceKeyFrame_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<KeyFrame> keyFrame_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> ttsAudioIds_ = GeneratedMessageLite.emptyProtobufList();
    private String ttsId_ = "";
    private String lastAnimationId_ = "";
    private Internal.ProtobufList<Recognition> recognitionSources_ = GeneratedMessageLite.emptyProtobufList();
    private String lastUgcTemplateTtsId_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$Recognition.class */
    public static final class Recognition extends GeneratedMessageLite<Recognition, a> implements c {
        public static final int AUDIOPATH_FIELD_NUMBER = 1;
        private static final Recognition DEFAULT_INSTANCE;
        private static volatile Parser<Recognition> PARSER;
        public static final int TRIMINPOINT_FIELD_NUMBER = 2;
        public static final int TRIMOUTPOINT_FIELD_NUMBER = 3;
        private String audioPath_ = "";
        private long trimInPoint_;
        private long trimOutPoint_;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$Recognition$a.class */
        public static final class a extends GeneratedMessageLite.Builder<Recognition, a> implements c {
            public a() {
                super(Recognition.DEFAULT_INSTANCE);
            }
        }

        static {
            Recognition recognition = new Recognition();
            DEFAULT_INSTANCE = recognition;
            GeneratedMessageLite.registerDefaultInstance(Recognition.class, recognition);
        }

        private Recognition() {
        }

        private void clearAudioPath() {
            this.audioPath_ = getDefaultInstance().getAudioPath();
        }

        private void clearTrimInPoint() {
            this.trimInPoint_ = 0L;
        }

        private void clearTrimOutPoint() {
            this.trimOutPoint_ = 0L;
        }

        public static Recognition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(Recognition recognition) {
            return (a) DEFAULT_INSTANCE.createBuilder(recognition);
        }

        public static Recognition parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Recognition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Recognition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Recognition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Recognition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Recognition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Recognition parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Recognition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Recognition parseFrom(InputStream inputStream) throws IOException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Recognition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Recognition parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Recognition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Recognition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Recognition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Recognition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<Recognition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAudioPath(String str) {
            str.getClass();
            this.audioPath_ = str;
        }

        private void setAudioPathBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.audioPath_ = byteString.toStringUtf8();
        }

        private void setTrimInPoint(long j7) {
            this.trimInPoint_ = j7;
        }

        private void setTrimOutPoint(long j7) {
            this.trimOutPoint_ = j7;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f108848a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Recognition();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"audioPath_", "trimInPoint_", "trimOutPoint_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Recognition.class) {
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

        public String getAudioPath() {
            return this.audioPath_;
        }

        public ByteString getAudioPathBytes() {
            return ByteString.copyFromUtf8(this.audioPath_);
        }

        public long getTrimInPoint() {
            return this.trimInPoint_;
        }

        public long getTrimOutPoint() {
            return this.trimOutPoint_;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$SourceType.class */
    public enum SourceType implements Internal.EnumLite {
        DEFAULT(0),
        VIDEO(1),
        AUDIO(2),
        FAKE(3),
        TUWEN_ASR(4),
        TUWEN_RECORD(5),
        MUSIC(6),
        UNRECOGNIZED(-1);

        public static final int AUDIO_VALUE = 2;
        public static final int DEFAULT_VALUE = 0;
        public static final int FAKE_VALUE = 3;
        public static final int MUSIC_VALUE = 6;
        public static final int TUWEN_ASR_VALUE = 4;
        public static final int TUWEN_RECORD_VALUE = 5;
        public static final int VIDEO_VALUE = 1;
        private static final Internal.EnumLiteMap<SourceType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$SourceType$a.class */
        public final class a implements Internal.EnumLiteMap<SourceType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return SourceType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$SourceType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108845a = new Object();

            public final boolean isInRange(int i7) {
                return SourceType.forNumber(i7) != null;
            }
        }

        SourceType(int i7) {
            this.value = i7;
        }

        public static SourceType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return DEFAULT;
                case 1:
                    return VIDEO;
                case 2:
                    return AUDIO;
                case 3:
                    return FAKE;
                case 4:
                    return TUWEN_ASR;
                case 5:
                    return TUWEN_RECORD;
                case 6:
                    return MUSIC;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<SourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108845a;
        }

        @Deprecated
        public static SourceType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$StyleOption.class */
    public enum StyleOption implements Internal.EnumLite {
        None(0),
        Date(1),
        Location(2),
        UNRECOGNIZED(-1);

        public static final int Date_VALUE = 1;
        public static final int Location_VALUE = 2;
        public static final int None_VALUE = 0;
        private static final Internal.EnumLiteMap<StyleOption> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$StyleOption$a.class */
        public final class a implements Internal.EnumLiteMap<StyleOption> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return StyleOption.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$StyleOption$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108846a = new Object();

            public final boolean isInRange(int i7) {
                return StyleOption.forNumber(i7) != null;
            }
        }

        StyleOption(int i7) {
            this.value = i7;
        }

        public static StyleOption forNumber(int i7) {
            if (i7 == 0) {
                return None;
            }
            if (i7 == 1) {
                return Date;
            }
            if (i7 != 2) {
                return null;
            }
            return Location;
        }

        public static Internal.EnumLiteMap<StyleOption> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108846a;
        }

        @Deprecated
        public static StyleOption valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$TextAlignment.class */
    public enum TextAlignment implements Internal.EnumLite {
        Left(0),
        Center(1),
        Right(2),
        Top(3),
        Bottom(4),
        VCenter(5),
        UNRECOGNIZED(-1);

        public static final int Bottom_VALUE = 4;
        public static final int Center_VALUE = 1;
        public static final int Left_VALUE = 0;
        public static final int Right_VALUE = 2;
        public static final int Top_VALUE = 3;
        public static final int VCenter_VALUE = 5;
        private static final Internal.EnumLiteMap<TextAlignment> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$TextAlignment$a.class */
        public final class a implements Internal.EnumLiteMap<TextAlignment> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return TextAlignment.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$TextAlignment$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108847a = new Object();

            public final boolean isInRange(int i7) {
                return TextAlignment.forNumber(i7) != null;
            }
        }

        TextAlignment(int i7) {
            this.value = i7;
        }

        public static TextAlignment forNumber(int i7) {
            if (i7 == 0) {
                return Left;
            }
            if (i7 == 1) {
                return Center;
            }
            if (i7 == 2) {
                return Right;
            }
            if (i7 == 3) {
                return Top;
            }
            if (i7 == 4) {
                return Bottom;
            }
            if (i7 != 5) {
                return null;
            }
            return VCenter;
        }

        public static Internal.EnumLiteMap<TextAlignment> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108847a;
        }

        @Deprecated
        public static TextAlignment valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108848a;

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
                com.bilibili.studio.videoeditor.CaptionFx.a.f108848a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.CaptionFx.a.f108848a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.CaptionFx.a.f108848a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.CaptionFx.a.f108848a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.CaptionFx.a.f108848a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.CaptionFx.a.f108848a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.CaptionFx.a.f108848a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.CaptionFx.a.m10281clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$b.class */
    public static final class b extends GeneratedMessageLite.Builder<CaptionFx, b> implements k {
        public b() {
            super(CaptionFx.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CaptionFx$c.class */
    public interface c extends MessageLiteOrBuilder {
    }

    static {
        CaptionFx captionFx = new CaptionFx();
        DEFAULT_INSTANCE = captionFx;
        GeneratedMessageLite.registerDefaultInstance(CaptionFx.class, captionFx);
    }

    private CaptionFx() {
    }

    private void addAllKeyFrame(Iterable<? extends KeyFrame> iterable) {
        ensureKeyFrameIsMutable();
        AbstractMessageLite.addAll(iterable, this.keyFrame_);
    }

    private void addAllRecognitionSources(Iterable<? extends Recognition> iterable) {
        ensureRecognitionSourcesIsMutable();
        AbstractMessageLite.addAll(iterable, this.recognitionSources_);
    }

    private void addAllTraceKeyFrame(Iterable<? extends KeyFrame> iterable) {
        ensureTraceKeyFrameIsMutable();
        AbstractMessageLite.addAll(iterable, this.traceKeyFrame_);
    }

    private void addAllTtsAudioIds(Iterable<String> iterable) {
        ensureTtsAudioIdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.ttsAudioIds_);
    }

    private void addKeyFrame(int i7, KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureKeyFrameIsMutable();
        this.keyFrame_.add(i7, keyFrame);
    }

    private void addKeyFrame(KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureKeyFrameIsMutable();
        this.keyFrame_.add(keyFrame);
    }

    private void addRecognitionSources(int i7, Recognition recognition) {
        recognition.getClass();
        ensureRecognitionSourcesIsMutable();
        this.recognitionSources_.add(i7, recognition);
    }

    private void addRecognitionSources(Recognition recognition) {
        recognition.getClass();
        ensureRecognitionSourcesIsMutable();
        this.recognitionSources_.add(recognition);
    }

    private void addTraceKeyFrame(int i7, KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureTraceKeyFrameIsMutable();
        this.traceKeyFrame_.add(i7, keyFrame);
    }

    private void addTraceKeyFrame(KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureTraceKeyFrameIsMutable();
        this.traceKeyFrame_.add(keyFrame);
    }

    private void addTtsAudioIds(String str) {
        str.getClass();
        ensureTtsAudioIdsIsMutable();
        this.ttsAudioIds_.add(str);
    }

    private void addTtsAudioIdsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTtsAudioIdsIsMutable();
        this.ttsAudioIds_.add(byteString.toStringUtf8());
    }

    private void clearAnchorPoint() {
        this.anchorPoint_ = null;
    }

    private void clearApplyTextColor() {
        this.applyTextColor_ = false;
    }

    private void clearBackgroundColor() {
        this.backgroundColor_ = null;
    }

    private void clearBubblePath() {
        this.bubblePath_ = null;
    }

    private void clearCanReplace() {
        this.canReplace_ = false;
    }

    private void clearCaptionType() {
        this.captionType_ = 0;
    }

    private void clearDrawBackgroundColor() {
        this.drawBackgroundColor_ = false;
    }

    private void clearDrawOutline() {
        this.drawOutline_ = false;
    }

    private void clearDrawShadowColor() {
        this.drawShadowColor_ = false;
    }

    private void clearFancyWordFormat() {
        this.fancyWordFormat_ = getDefaultInstance().getFancyWordFormat();
    }

    private void clearFancyWordId() {
        this.fancyWordId_ = null;
    }

    private void clearFancyWordLicPath() {
        this.fancyWordLicPath_ = null;
    }

    private void clearFancyWordPath() {
        this.fancyWordPath_ = null;
    }

    private void clearFancyWordTextColor() {
        this.fancyWordTextColor_ = null;
    }

    private void clearFontId() {
        this.fontId_ = null;
    }

    private void clearFontPath() {
        this.fontPath_ = null;
    }

    private void clearFontSize() {
        this.fontSize_ = 0.0f;
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearInAnimationDuration() {
        this.inAnimationDuration_ = 0L;
    }

    private void clearInAnimationId() {
        this.inAnimationId_ = null;
    }

    private void clearInAnimationPath() {
        this.inAnimationPath_ = null;
    }

    private void clearInPoint() {
        this.inPoint_ = 0L;
    }

    private void clearIsFrameCaption() {
        this.isFrameCaption_ = false;
    }

    private void clearIsVerticalLayout() {
        this.isVerticalLayout_ = false;
    }

    private void clearKeyFrame() {
        this.keyFrame_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLastAnimationId() {
        this.lastAnimationId_ = getDefaultInstance().getLastAnimationId();
    }

    private void clearLastUgcTemplateTtsId() {
        this.lastUgcTemplateTtsId_ = getDefaultInstance().getLastUgcTemplateTtsId();
    }

    private void clearLeftTopPoint() {
        this.leftTopPoint_ = null;
    }

    private void clearLetterSpacing() {
        this.letterSpacing_ = 0.0f;
    }

    private void clearLicensePath() {
        this.licensePath_ = null;
    }

    private void clearLineSpacing() {
        this.lineSpacing_ = 0.0f;
    }

    private void clearLoopAnimationDuration() {
        this.loopAnimationDuration_ = 0L;
    }

    private void clearLoopAnimationId() {
        this.loopAnimationId_ = null;
    }

    private void clearLoopAnimationPath() {
        this.loopAnimationPath_ = null;
    }

    private void clearMaterialType() {
        this.materialType_ = 0;
    }

    private void clearOpacity() {
        this.opacity_ = 0.0f;
    }

    private void clearOutAnimationDuration() {
        this.outAnimationDuration_ = 0L;
    }

    private void clearOutAnimationId() {
        this.outAnimationId_ = null;
    }

    private void clearOutAnimationPath() {
        this.outAnimationPath_ = null;
    }

    private void clearOutPoint() {
        this.outPoint_ = 0L;
    }

    private void clearOutlineColor() {
        this.outlineColor_ = null;
    }

    private void clearOutlineWidth() {
        this.outlineWidth_ = 0.0f;
    }

    private void clearPackagePath() {
        this.packagePath_ = null;
    }

    private void clearRecognitionSources() {
        this.recognitionSources_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRecycle() {
        this.recycle_ = false;
    }

    private void clearRightTopPoint() {
        this.rightTopPoint_ = null;
    }

    private void clearRotation() {
        this.rotation_ = 0.0f;
    }

    private void clearRowInTrack() {
        this.rowInTrack_ = 0;
    }

    private void clearScale() {
        this.scale_ = 0.0f;
    }

    private void clearShadowColor() {
        this.shadowColor_ = null;
    }

    private void clearShadowFeather() {
        this.shadowFeather_ = 0.0f;
    }

    private void clearShadowOffset() {
        this.shadowOffset_ = null;
    }

    private void clearSourceType() {
        this.sourceType_ = 0;
    }

    private void clearStyleFormat() {
        this.styleFormat_ = getDefaultInstance().getStyleFormat();
    }

    private void clearStyleOption() {
        this.styleOption_ = 0;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void clearTemplateId() {
        this.templateId_ = null;
    }

    private void clearTemplatePath() {
        this.templatePath_ = null;
    }

    private void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    private void clearTextAlignment() {
        this.textAlignment_ = 0;
    }

    private void clearTextBold() {
        this.textBold_ = false;
    }

    private void clearTextColor() {
        this.textColor_ = null;
    }

    private void clearTextColorSource() {
        this.textColorSource_ = 0;
    }

    private void clearTextFrameOriginRect() {
        this.textFrameOriginRect_ = null;
    }

    private void clearTextItalic() {
        this.textItalic_ = false;
    }

    private void clearTextVerticalAlignment() {
        this.textVerticalAlignment_ = 0;
    }

    private void clearTraceKeyFrame() {
        this.traceKeyFrame_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTransX() {
        this.transX_ = 0.0f;
    }

    private void clearTransY() {
        this.transY_ = 0.0f;
    }

    private void clearTtsAudioIds() {
        this.ttsAudioIds_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTtsId() {
        this.ttsId_ = getDefaultInstance().getTtsId();
    }

    private void clearTtsSelected() {
        this.ttsSelected_ = false;
    }

    private void clearUnderline() {
        this.underline_ = false;
    }

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void clearWordMaxLength() {
        this.wordMaxLength_ = 0;
    }

    private void clearZValue() {
        this.zValue_ = 0.0f;
    }

    private void ensureKeyFrameIsMutable() {
        Internal.ProtobufList<KeyFrame> protobufList = this.keyFrame_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keyFrame_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRecognitionSourcesIsMutable() {
        Internal.ProtobufList<Recognition> protobufList = this.recognitionSources_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.recognitionSources_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTraceKeyFrameIsMutable() {
        Internal.ProtobufList<KeyFrame> protobufList = this.traceKeyFrame_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.traceKeyFrame_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTtsAudioIdsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.ttsAudioIds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.ttsAudioIds_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CaptionFx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAnchorPoint(Point point) {
        point.getClass();
        Point point2 = this.anchorPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.anchorPoint_ = point;
        } else {
            this.anchorPoint_ = (Point) ((Point.b) Point.newBuilder(this.anchorPoint_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergeBackgroundColor(Color color) {
        color.getClass();
        Color color2 = this.backgroundColor_;
        if (color2 == null || color2 == Color.getDefaultInstance()) {
            this.backgroundColor_ = color;
        } else {
            this.backgroundColor_ = (Color) ((Color.b) Color.newBuilder(this.backgroundColor_).mergeFrom(color)).buildPartial();
        }
    }

    private void mergeBubblePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.bubblePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.bubblePath_ = localPath;
        } else {
            this.bubblePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.bubblePath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeFancyWordId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.fancyWordId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.fancyWordId_ = localPath;
        } else {
            this.fancyWordId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.fancyWordId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeFancyWordLicPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.fancyWordLicPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.fancyWordLicPath_ = localPath;
        } else {
            this.fancyWordLicPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.fancyWordLicPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeFancyWordPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.fancyWordPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.fancyWordPath_ = localPath;
        } else {
            this.fancyWordPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.fancyWordPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeFancyWordTextColor(Color color) {
        color.getClass();
        Color color2 = this.fancyWordTextColor_;
        if (color2 == null || color2 == Color.getDefaultInstance()) {
            this.fancyWordTextColor_ = color;
        } else {
            this.fancyWordTextColor_ = (Color) ((Color.b) Color.newBuilder(this.fancyWordTextColor_).mergeFrom(color)).buildPartial();
        }
    }

    private void mergeFontId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.fontId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.fontId_ = localPath;
        } else {
            this.fontId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.fontId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeFontPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.fontPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.fontPath_ = localPath;
        } else {
            this.fontPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.fontPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeInAnimationId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.inAnimationId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.inAnimationId_ = localPath;
        } else {
            this.inAnimationId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.inAnimationId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeInAnimationPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.inAnimationPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.inAnimationPath_ = localPath;
        } else {
            this.inAnimationPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.inAnimationPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeLeftTopPoint(Point point) {
        point.getClass();
        Point point2 = this.leftTopPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.leftTopPoint_ = point;
        } else {
            this.leftTopPoint_ = (Point) ((Point.b) Point.newBuilder(this.leftTopPoint_).mergeFrom(point)).buildPartial();
        }
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

    private void mergeLoopAnimationId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.loopAnimationId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.loopAnimationId_ = localPath;
        } else {
            this.loopAnimationId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.loopAnimationId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeLoopAnimationPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.loopAnimationPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.loopAnimationPath_ = localPath;
        } else {
            this.loopAnimationPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.loopAnimationPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeOutAnimationId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.outAnimationId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.outAnimationId_ = localPath;
        } else {
            this.outAnimationId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.outAnimationId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeOutAnimationPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.outAnimationPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.outAnimationPath_ = localPath;
        } else {
            this.outAnimationPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.outAnimationPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeOutlineColor(Color color) {
        color.getClass();
        Color color2 = this.outlineColor_;
        if (color2 == null || color2 == Color.getDefaultInstance()) {
            this.outlineColor_ = color;
        } else {
            this.outlineColor_ = (Color) ((Color.b) Color.newBuilder(this.outlineColor_).mergeFrom(color)).buildPartial();
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

    private void mergeRightTopPoint(Point point) {
        point.getClass();
        Point point2 = this.rightTopPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.rightTopPoint_ = point;
        } else {
            this.rightTopPoint_ = (Point) ((Point.b) Point.newBuilder(this.rightTopPoint_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergeShadowColor(Color color) {
        color.getClass();
        Color color2 = this.shadowColor_;
        if (color2 == null || color2 == Color.getDefaultInstance()) {
            this.shadowColor_ = color;
        } else {
            this.shadowColor_ = (Color) ((Color.b) Color.newBuilder(this.shadowColor_).mergeFrom(color)).buildPartial();
        }
    }

    private void mergeShadowOffset(Point point) {
        point.getClass();
        Point point2 = this.shadowOffset_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.shadowOffset_ = point;
        } else {
            this.shadowOffset_ = (Point) ((Point.b) Point.newBuilder(this.shadowOffset_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergeTemplateId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.templateId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.templateId_ = localPath;
        } else {
            this.templateId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.templateId_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeTemplatePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.templatePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.templatePath_ = localPath;
        } else {
            this.templatePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.templatePath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeTextColor(Color color) {
        color.getClass();
        Color color2 = this.textColor_;
        if (color2 == null || color2 == Color.getDefaultInstance()) {
            this.textColor_ = color;
        } else {
            this.textColor_ = (Color) ((Color.b) Color.newBuilder(this.textColor_).mergeFrom(color)).buildPartial();
        }
    }

    private void mergeTextFrameOriginRect(Rect rect) {
        rect.getClass();
        Rect rect2 = this.textFrameOriginRect_;
        if (rect2 == null || rect2 == Rect.getDefaultInstance()) {
            this.textFrameOriginRect_ = rect;
        } else {
            this.textFrameOriginRect_ = (Rect) ((Rect.b) Rect.newBuilder(this.textFrameOriginRect_).mergeFrom(rect)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(CaptionFx captionFx) {
        return (b) DEFAULT_INSTANCE.createBuilder(captionFx);
    }

    public static CaptionFx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CaptionFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CaptionFx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CaptionFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CaptionFx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CaptionFx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CaptionFx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CaptionFx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CaptionFx parseFrom(InputStream inputStream) throws IOException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CaptionFx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CaptionFx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CaptionFx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CaptionFx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CaptionFx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<CaptionFx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeKeyFrame(int i7) {
        ensureKeyFrameIsMutable();
        this.keyFrame_.remove(i7);
    }

    private void removeRecognitionSources(int i7) {
        ensureRecognitionSourcesIsMutable();
        this.recognitionSources_.remove(i7);
    }

    private void removeTraceKeyFrame(int i7) {
        ensureTraceKeyFrameIsMutable();
        this.traceKeyFrame_.remove(i7);
    }

    private void setAnchorPoint(Point point) {
        point.getClass();
        this.anchorPoint_ = point;
    }

    private void setApplyTextColor(boolean z6) {
        this.applyTextColor_ = z6;
    }

    private void setBackgroundColor(Color color) {
        color.getClass();
        this.backgroundColor_ = color;
    }

    private void setBubblePath(LocalPath localPath) {
        localPath.getClass();
        this.bubblePath_ = localPath;
    }

    private void setCanReplace(boolean z6) {
        this.canReplace_ = z6;
    }

    private void setCaptionType(int i7) {
        this.captionType_ = i7;
    }

    private void setDrawBackgroundColor(boolean z6) {
        this.drawBackgroundColor_ = z6;
    }

    private void setDrawOutline(boolean z6) {
        this.drawOutline_ = z6;
    }

    private void setDrawShadowColor(boolean z6) {
        this.drawShadowColor_ = z6;
    }

    private void setFancyWordFormat(String str) {
        str.getClass();
        this.fancyWordFormat_ = str;
    }

    private void setFancyWordFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fancyWordFormat_ = byteString.toStringUtf8();
    }

    private void setFancyWordId(LocalPath localPath) {
        localPath.getClass();
        this.fancyWordId_ = localPath;
    }

    private void setFancyWordLicPath(LocalPath localPath) {
        localPath.getClass();
        this.fancyWordLicPath_ = localPath;
    }

    private void setFancyWordPath(LocalPath localPath) {
        localPath.getClass();
        this.fancyWordPath_ = localPath;
    }

    private void setFancyWordTextColor(Color color) {
        color.getClass();
        this.fancyWordTextColor_ = color;
    }

    private void setFontId(LocalPath localPath) {
        localPath.getClass();
        this.fontId_ = localPath;
    }

    private void setFontPath(LocalPath localPath) {
        localPath.getClass();
        this.fontPath_ = localPath;
    }

    private void setFontSize(float f7) {
        this.fontSize_ = f7;
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setInAnimationDuration(long j7) {
        this.inAnimationDuration_ = j7;
    }

    private void setInAnimationId(LocalPath localPath) {
        localPath.getClass();
        this.inAnimationId_ = localPath;
    }

    private void setInAnimationPath(LocalPath localPath) {
        localPath.getClass();
        this.inAnimationPath_ = localPath;
    }

    private void setInPoint(long j7) {
        this.inPoint_ = j7;
    }

    private void setIsFrameCaption(boolean z6) {
        this.isFrameCaption_ = z6;
    }

    private void setIsVerticalLayout(boolean z6) {
        this.isVerticalLayout_ = z6;
    }

    private void setKeyFrame(int i7, KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureKeyFrameIsMutable();
        this.keyFrame_.set(i7, keyFrame);
    }

    private void setLastAnimationId(String str) {
        str.getClass();
        this.lastAnimationId_ = str;
    }

    private void setLastAnimationIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastAnimationId_ = byteString.toStringUtf8();
    }

    private void setLastUgcTemplateTtsId(String str) {
        str.getClass();
        this.lastUgcTemplateTtsId_ = str;
    }

    private void setLastUgcTemplateTtsIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastUgcTemplateTtsId_ = byteString.toStringUtf8();
    }

    private void setLeftTopPoint(Point point) {
        point.getClass();
        this.leftTopPoint_ = point;
    }

    private void setLetterSpacing(float f7) {
        this.letterSpacing_ = f7;
    }

    private void setLicensePath(LocalPath localPath) {
        localPath.getClass();
        this.licensePath_ = localPath;
    }

    private void setLineSpacing(float f7) {
        this.lineSpacing_ = f7;
    }

    private void setLoopAnimationDuration(long j7) {
        this.loopAnimationDuration_ = j7;
    }

    private void setLoopAnimationId(LocalPath localPath) {
        localPath.getClass();
        this.loopAnimationId_ = localPath;
    }

    private void setLoopAnimationPath(LocalPath localPath) {
        localPath.getClass();
        this.loopAnimationPath_ = localPath;
    }

    private void setMaterialType(MaterialType materialType) {
        this.materialType_ = materialType.getNumber();
    }

    private void setMaterialTypeValue(int i7) {
        this.materialType_ = i7;
    }

    private void setOpacity(float f7) {
        this.opacity_ = f7;
    }

    private void setOutAnimationDuration(long j7) {
        this.outAnimationDuration_ = j7;
    }

    private void setOutAnimationId(LocalPath localPath) {
        localPath.getClass();
        this.outAnimationId_ = localPath;
    }

    private void setOutAnimationPath(LocalPath localPath) {
        localPath.getClass();
        this.outAnimationPath_ = localPath;
    }

    private void setOutPoint(long j7) {
        this.outPoint_ = j7;
    }

    private void setOutlineColor(Color color) {
        color.getClass();
        this.outlineColor_ = color;
    }

    private void setOutlineWidth(float f7) {
        this.outlineWidth_ = f7;
    }

    private void setPackagePath(LocalPath localPath) {
        localPath.getClass();
        this.packagePath_ = localPath;
    }

    private void setRecognitionSources(int i7, Recognition recognition) {
        recognition.getClass();
        ensureRecognitionSourcesIsMutable();
        this.recognitionSources_.set(i7, recognition);
    }

    private void setRecycle(boolean z6) {
        this.recycle_ = z6;
    }

    private void setRightTopPoint(Point point) {
        point.getClass();
        this.rightTopPoint_ = point;
    }

    private void setRotation(float f7) {
        this.rotation_ = f7;
    }

    private void setRowInTrack(int i7) {
        this.rowInTrack_ = i7;
    }

    private void setScale(float f7) {
        this.scale_ = f7;
    }

    private void setShadowColor(Color color) {
        color.getClass();
        this.shadowColor_ = color;
    }

    private void setShadowFeather(float f7) {
        this.shadowFeather_ = f7;
    }

    private void setShadowOffset(Point point) {
        point.getClass();
        this.shadowOffset_ = point;
    }

    private void setSourceType(SourceType sourceType) {
        this.sourceType_ = sourceType.getNumber();
    }

    private void setSourceTypeValue(int i7) {
        this.sourceType_ = i7;
    }

    private void setStyleFormat(String str) {
        str.getClass();
        this.styleFormat_ = str;
    }

    private void setStyleFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.styleFormat_ = byteString.toStringUtf8();
    }

    private void setStyleOption(StyleOption styleOption) {
        this.styleOption_ = styleOption.getNumber();
    }

    private void setStyleOptionValue(int i7) {
        this.styleOption_ = i7;
    }

    private void setTemplateFxFrom(TemplateFxFrom templateFxFrom) {
        this.templateFxFrom_ = templateFxFrom.getNumber();
    }

    private void setTemplateFxFromValue(int i7) {
        this.templateFxFrom_ = i7;
    }

    private void setTemplateId(LocalPath localPath) {
        localPath.getClass();
        this.templateId_ = localPath;
    }

    private void setTemplatePath(LocalPath localPath) {
        localPath.getClass();
        this.templatePath_ = localPath;
    }

    private void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    private void setTextAlignment(TextAlignment textAlignment) {
        this.textAlignment_ = textAlignment.getNumber();
    }

    private void setTextAlignmentValue(int i7) {
        this.textAlignment_ = i7;
    }

    private void setTextBold(boolean z6) {
        this.textBold_ = z6;
    }

    private void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    private void setTextColor(Color color) {
        color.getClass();
        this.textColor_ = color;
    }

    private void setTextColorSource(int i7) {
        this.textColorSource_ = i7;
    }

    private void setTextFrameOriginRect(Rect rect) {
        rect.getClass();
        this.textFrameOriginRect_ = rect;
    }

    private void setTextItalic(boolean z6) {
        this.textItalic_ = z6;
    }

    private void setTextVerticalAlignment(TextAlignment textAlignment) {
        this.textVerticalAlignment_ = textAlignment.getNumber();
    }

    private void setTextVerticalAlignmentValue(int i7) {
        this.textVerticalAlignment_ = i7;
    }

    private void setTraceKeyFrame(int i7, KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureTraceKeyFrameIsMutable();
        this.traceKeyFrame_.set(i7, keyFrame);
    }

    private void setTransX(float f7) {
        this.transX_ = f7;
    }

    private void setTransY(float f7) {
        this.transY_ = f7;
    }

    private void setTtsAudioIds(int i7, String str) {
        str.getClass();
        ensureTtsAudioIdsIsMutable();
        this.ttsAudioIds_.set(i7, str);
    }

    private void setTtsId(String str) {
        str.getClass();
        this.ttsId_ = str;
    }

    private void setTtsIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ttsId_ = byteString.toStringUtf8();
    }

    private void setTtsSelected(boolean z6) {
        this.ttsSelected_ = z6;
    }

    private void setUnderline(boolean z6) {
        this.underline_ = z6;
    }

    private void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    private void setVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    private void setWordMaxLength(int i7) {
        this.wordMaxLength_ = i7;
    }

    private void setZValue(float f7) {
        this.zValue_ = f7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108848a[methodToInvoke.ordinal()]) {
            case 1:
                return new CaptionFx();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000L\u0000\u0000\u0001oL\u0000\u0004\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0004\u0005Ȉ\u0006\t\u0007\t\b\u0004\t\f\nȈ\u000bȈ\f\t\r\t\u000e\u0001\u000f\f\u0010\u0001\u0011\u0001\u0012\u0007\u0013\u0007\u0014\u0004\u0015\t\u0016\u0007\u0017\u0001\u0018\t\u0019\t\u001a\t\u001b\t\u001cȈ\u001d\u0007\u001e\t\u001f\t \u0002!\t\"\t#\u0002$\t%\t&\u0002'\u0001(\u0001)\u0001*\u0001+\u0001,\u0001-\u001b.\u001b/Ț0Ȉ1Ȉ2\t3\t4\t5\t6\t7\u00078\u00079\u001b:\t;\t<\f=\u0004>\u0007?Ȉ@\fA\tB\tC\tD\u0001E\u0007F\u0007G\u0007H\u0007I\fJ\u0007K\fo\t", new Object[]{"idString_", "inPoint_", "outPoint_", "rowInTrack_", "text_", "templateId_", "templatePath_", "wordMaxLength_", "styleOption_", "styleFormat_", "version_", "fontId_", "fontPath_", "fontSize_", "textAlignment_", "letterSpacing_", "lineSpacing_", "textBold_", "textItalic_", "textColorSource_", "textColor_", "drawOutline_", "outlineWidth_", "outlineColor_", "backgroundColor_", "fancyWordId_", "fancyWordPath_", "fancyWordFormat_", "applyTextColor_", "inAnimationId_", "inAnimationPath_", "inAnimationDuration_", "outAnimationId_", "outAnimationPath_", "outAnimationDuration_", "loopAnimationId_", "loopAnimationPath_", "loopAnimationDuration_", "transX_", "transY_", "rotation_", "opacity_", "scale_", "zValue_", "traceKeyFrame_", KeyFrame.class, "keyFrame_", KeyFrame.class, "ttsAudioIds_", "ttsId_", "lastAnimationId_", "leftTopPoint_", "rightTopPoint_", "fancyWordLicPath_", "fancyWordTextColor_", "anchorPoint_", "drawBackgroundColor_", "ttsSelected_", "recognitionSources_", Recognition.class, "packagePath_", "licensePath_", "sourceType_", "captionType_", "canReplace_", "lastUgcTemplateTtsId_", "textVerticalAlignment_", "textFrameOriginRect_", "shadowColor_", "shadowOffset_", "shadowFeather_", "drawShadowColor_", "underline_", "isVerticalLayout_", "isFrameCaption_", "materialType_", "recycle_", "templateFxFrom_", "bubblePath_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CaptionFx.class) {
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

    public Point getAnchorPoint() {
        Point point = this.anchorPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getApplyTextColor() {
        return this.applyTextColor_;
    }

    public Color getBackgroundColor() {
        Color color = this.backgroundColor_;
        Color defaultInstance = color;
        if (color == null) {
            defaultInstance = Color.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getBubblePath() {
        LocalPath localPath = this.bubblePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getCanReplace() {
        return this.canReplace_;
    }

    public int getCaptionType() {
        return this.captionType_;
    }

    public boolean getDrawBackgroundColor() {
        return this.drawBackgroundColor_;
    }

    public boolean getDrawOutline() {
        return this.drawOutline_;
    }

    public boolean getDrawShadowColor() {
        return this.drawShadowColor_;
    }

    public String getFancyWordFormat() {
        return this.fancyWordFormat_;
    }

    public ByteString getFancyWordFormatBytes() {
        return ByteString.copyFromUtf8(this.fancyWordFormat_);
    }

    public LocalPath getFancyWordId() {
        LocalPath localPath = this.fancyWordId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getFancyWordLicPath() {
        LocalPath localPath = this.fancyWordLicPath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getFancyWordPath() {
        LocalPath localPath = this.fancyWordPath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Color getFancyWordTextColor() {
        Color color = this.fancyWordTextColor_;
        Color defaultInstance = color;
        if (color == null) {
            defaultInstance = Color.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getFontId() {
        LocalPath localPath = this.fontId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getFontPath() {
        LocalPath localPath = this.fontPath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getFontSize() {
        return this.fontSize_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public long getInAnimationDuration() {
        return this.inAnimationDuration_;
    }

    public LocalPath getInAnimationId() {
        LocalPath localPath = this.inAnimationId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getInAnimationPath() {
        LocalPath localPath = this.inAnimationPath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getInPoint() {
        return this.inPoint_;
    }

    public boolean getIsFrameCaption() {
        return this.isFrameCaption_;
    }

    public boolean getIsVerticalLayout() {
        return this.isVerticalLayout_;
    }

    public KeyFrame getKeyFrame(int i7) {
        return (KeyFrame) this.keyFrame_.get(i7);
    }

    public int getKeyFrameCount() {
        return this.keyFrame_.size();
    }

    public List<KeyFrame> getKeyFrameList() {
        return this.keyFrame_;
    }

    public q getKeyFrameOrBuilder(int i7) {
        return (q) this.keyFrame_.get(i7);
    }

    public List<? extends q> getKeyFrameOrBuilderList() {
        return this.keyFrame_;
    }

    public String getLastAnimationId() {
        return this.lastAnimationId_;
    }

    public ByteString getLastAnimationIdBytes() {
        return ByteString.copyFromUtf8(this.lastAnimationId_);
    }

    public String getLastUgcTemplateTtsId() {
        return this.lastUgcTemplateTtsId_;
    }

    public ByteString getLastUgcTemplateTtsIdBytes() {
        return ByteString.copyFromUtf8(this.lastUgcTemplateTtsId_);
    }

    public Point getLeftTopPoint() {
        Point point = this.leftTopPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getLetterSpacing() {
        return this.letterSpacing_;
    }

    public LocalPath getLicensePath() {
        LocalPath localPath = this.licensePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getLineSpacing() {
        return this.lineSpacing_;
    }

    public long getLoopAnimationDuration() {
        return this.loopAnimationDuration_;
    }

    public LocalPath getLoopAnimationId() {
        LocalPath localPath = this.loopAnimationId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getLoopAnimationPath() {
        LocalPath localPath = this.loopAnimationPath_;
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

    public float getOpacity() {
        return this.opacity_;
    }

    public long getOutAnimationDuration() {
        return this.outAnimationDuration_;
    }

    public LocalPath getOutAnimationId() {
        LocalPath localPath = this.outAnimationId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getOutAnimationPath() {
        LocalPath localPath = this.outAnimationPath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getOutPoint() {
        return this.outPoint_;
    }

    public Color getOutlineColor() {
        Color color = this.outlineColor_;
        Color defaultInstance = color;
        if (color == null) {
            defaultInstance = Color.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getOutlineWidth() {
        return this.outlineWidth_;
    }

    public LocalPath getPackagePath() {
        LocalPath localPath = this.packagePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Recognition getRecognitionSources(int i7) {
        return (Recognition) this.recognitionSources_.get(i7);
    }

    public int getRecognitionSourcesCount() {
        return this.recognitionSources_.size();
    }

    public List<Recognition> getRecognitionSourcesList() {
        return this.recognitionSources_;
    }

    public c getRecognitionSourcesOrBuilder(int i7) {
        return (c) this.recognitionSources_.get(i7);
    }

    public List<? extends c> getRecognitionSourcesOrBuilderList() {
        return this.recognitionSources_;
    }

    public boolean getRecycle() {
        return this.recycle_;
    }

    public Point getRightTopPoint() {
        Point point = this.rightTopPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getRotation() {
        return this.rotation_;
    }

    public int getRowInTrack() {
        return this.rowInTrack_;
    }

    public float getScale() {
        return this.scale_;
    }

    public Color getShadowColor() {
        Color color = this.shadowColor_;
        Color defaultInstance = color;
        if (color == null) {
            defaultInstance = Color.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getShadowFeather() {
        return this.shadowFeather_;
    }

    public Point getShadowOffset() {
        Point point = this.shadowOffset_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public SourceType getSourceType() {
        SourceType sourceTypeForNumber = SourceType.forNumber(this.sourceType_);
        SourceType sourceType = sourceTypeForNumber;
        if (sourceTypeForNumber == null) {
            sourceType = SourceType.UNRECOGNIZED;
        }
        return sourceType;
    }

    public int getSourceTypeValue() {
        return this.sourceType_;
    }

    public String getStyleFormat() {
        return this.styleFormat_;
    }

    public ByteString getStyleFormatBytes() {
        return ByteString.copyFromUtf8(this.styleFormat_);
    }

    public StyleOption getStyleOption() {
        StyleOption styleOptionForNumber = StyleOption.forNumber(this.styleOption_);
        StyleOption styleOption = styleOptionForNumber;
        if (styleOptionForNumber == null) {
            styleOption = StyleOption.UNRECOGNIZED;
        }
        return styleOption;
    }

    public int getStyleOptionValue() {
        return this.styleOption_;
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

    public LocalPath getTemplateId() {
        LocalPath localPath = this.templateId_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public LocalPath getTemplatePath() {
        LocalPath localPath = this.templatePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getText() {
        return this.text_;
    }

    public TextAlignment getTextAlignment() {
        TextAlignment textAlignmentForNumber = TextAlignment.forNumber(this.textAlignment_);
        TextAlignment textAlignment = textAlignmentForNumber;
        if (textAlignmentForNumber == null) {
            textAlignment = TextAlignment.UNRECOGNIZED;
        }
        return textAlignment;
    }

    public int getTextAlignmentValue() {
        return this.textAlignment_;
    }

    public boolean getTextBold() {
        return this.textBold_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public Color getTextColor() {
        Color color = this.textColor_;
        Color defaultInstance = color;
        if (color == null) {
            defaultInstance = Color.getDefaultInstance();
        }
        return defaultInstance;
    }

    public int getTextColorSource() {
        return this.textColorSource_;
    }

    public Rect getTextFrameOriginRect() {
        Rect rect = this.textFrameOriginRect_;
        Rect defaultInstance = rect;
        if (rect == null) {
            defaultInstance = Rect.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getTextItalic() {
        return this.textItalic_;
    }

    public TextAlignment getTextVerticalAlignment() {
        TextAlignment textAlignmentForNumber = TextAlignment.forNumber(this.textVerticalAlignment_);
        TextAlignment textAlignment = textAlignmentForNumber;
        if (textAlignmentForNumber == null) {
            textAlignment = TextAlignment.UNRECOGNIZED;
        }
        return textAlignment;
    }

    public int getTextVerticalAlignmentValue() {
        return this.textVerticalAlignment_;
    }

    public KeyFrame getTraceKeyFrame(int i7) {
        return (KeyFrame) this.traceKeyFrame_.get(i7);
    }

    public int getTraceKeyFrameCount() {
        return this.traceKeyFrame_.size();
    }

    public List<KeyFrame> getTraceKeyFrameList() {
        return this.traceKeyFrame_;
    }

    public q getTraceKeyFrameOrBuilder(int i7) {
        return (q) this.traceKeyFrame_.get(i7);
    }

    public List<? extends q> getTraceKeyFrameOrBuilderList() {
        return this.traceKeyFrame_;
    }

    public float getTransX() {
        return this.transX_;
    }

    public float getTransY() {
        return this.transY_;
    }

    public String getTtsAudioIds(int i7) {
        return (String) this.ttsAudioIds_.get(i7);
    }

    public ByteString getTtsAudioIdsBytes(int i7) {
        return ByteString.copyFromUtf8((String) this.ttsAudioIds_.get(i7));
    }

    public int getTtsAudioIdsCount() {
        return this.ttsAudioIds_.size();
    }

    public List<String> getTtsAudioIdsList() {
        return this.ttsAudioIds_;
    }

    public String getTtsId() {
        return this.ttsId_;
    }

    public ByteString getTtsIdBytes() {
        return ByteString.copyFromUtf8(this.ttsId_);
    }

    public boolean getTtsSelected() {
        return this.ttsSelected_;
    }

    public boolean getUnderline() {
        return this.underline_;
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public int getWordMaxLength() {
        return this.wordMaxLength_;
    }

    public float getZValue() {
        return this.zValue_;
    }

    public boolean hasAnchorPoint() {
        return this.anchorPoint_ != null;
    }

    public boolean hasBackgroundColor() {
        return this.backgroundColor_ != null;
    }

    public boolean hasBubblePath() {
        return this.bubblePath_ != null;
    }

    public boolean hasFancyWordId() {
        return this.fancyWordId_ != null;
    }

    public boolean hasFancyWordLicPath() {
        return this.fancyWordLicPath_ != null;
    }

    public boolean hasFancyWordPath() {
        return this.fancyWordPath_ != null;
    }

    public boolean hasFancyWordTextColor() {
        return this.fancyWordTextColor_ != null;
    }

    public boolean hasFontId() {
        return this.fontId_ != null;
    }

    public boolean hasFontPath() {
        return this.fontPath_ != null;
    }

    public boolean hasInAnimationId() {
        return this.inAnimationId_ != null;
    }

    public boolean hasInAnimationPath() {
        return this.inAnimationPath_ != null;
    }

    public boolean hasLeftTopPoint() {
        return this.leftTopPoint_ != null;
    }

    public boolean hasLicensePath() {
        return this.licensePath_ != null;
    }

    public boolean hasLoopAnimationId() {
        return this.loopAnimationId_ != null;
    }

    public boolean hasLoopAnimationPath() {
        return this.loopAnimationPath_ != null;
    }

    public boolean hasOutAnimationId() {
        return this.outAnimationId_ != null;
    }

    public boolean hasOutAnimationPath() {
        return this.outAnimationPath_ != null;
    }

    public boolean hasOutlineColor() {
        return this.outlineColor_ != null;
    }

    public boolean hasPackagePath() {
        return this.packagePath_ != null;
    }

    public boolean hasRightTopPoint() {
        return this.rightTopPoint_ != null;
    }

    public boolean hasShadowColor() {
        return this.shadowColor_ != null;
    }

    public boolean hasShadowOffset() {
        return this.shadowOffset_ != null;
    }

    public boolean hasTemplateId() {
        return this.templateId_ != null;
    }

    public boolean hasTemplatePath() {
        return this.templatePath_ != null;
    }

    public boolean hasTextColor() {
        return this.textColor_ != null;
    }

    public boolean hasTextFrameOriginRect() {
        return this.textFrameOriginRect_ != null;
    }
}
