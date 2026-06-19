package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Color;
import com.bilibili.studio.videoeditor.LocalPath;
import com.bilibili.studio.videoeditor.Rect;
import com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip.class */
public final class VideoClip extends GeneratedMessageLite<VideoClip, b> implements C {
    public static final int AUDIOSEPARATE_FIELD_NUMBER = 14;
    public static final int AVATARRECT_FIELD_NUMBER = 52;
    public static final int AVATARROLL_FIELD_NUMBER = 53;
    public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 58;
    public static final int BACKORIGINALCLIPFILEPATH_FIELD_NUMBER = 33;
    public static final int BIZFROM_FIELD_NUMBER = 34;
    public static final int BLENDINGMODE_FIELD_NUMBER = 23;
    public static final int BRIEF_FIELD_NUMBER = 35;
    public static final int CANREPLACE_FIELD_NUMBER = 36;
    public static final int CLIPTYPE_FIELD_NUMBER = 2;
    public static final int COMPOUNDANIM_FIELD_NUMBER = 32;
    public static final int CORRESPONDINGID_FIELD_NUMBER = 47;
    public static final int CURVESTRING_FIELD_NUMBER = 18;
    public static final int CURVETYPE_FIELD_NUMBER = 17;
    public static final int CUSTOMTAPS_FIELD_NUMBER = 26;
    private static final VideoClip DEFAULT_INSTANCE;
    public static final int DETECTMODE_FIELD_NUMBER = 46;
    public static final int EXTRAATTACHAUDIOID_FIELD_NUMBER = 41;
    public static final int EXTRAATTACHAUDIOPATH_FIELD_NUMBER = 44;
    public static final int EXTRAATTACHCLIPCOVER_FIELD_NUMBER = 42;
    public static final int EXTRAATTACHTEMPLATEAUDIOID_FIELD_NUMBER = 40;
    public static final int EXTRAATTACHVIRTUALIDOLID_FIELD_NUMBER = 43;
    public static final int EXTRAGAMENAME_FIELD_NUMBER = 39;
    public static final int EXTRAPARAMSAUDIOINFO_FIELD_NUMBER = 45;
    public static final int EXTRAVIDEOFROM_FIELD_NUMBER = 38;
    public static final int EXTRAVIDEOROTATION_FIELD_NUMBER = 24;
    public static final int FROMTYPE_FIELD_NUMBER = 29;
    public static final int FXS_FIELD_NUMBER = 20;
    public static final int GAMEHIGHLIGHTPOINTS_FIELD_NUMBER = 54;
    public static final int HIGHLIGHTPOINTS_FIELD_NUMBER = 25;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int INANIM_FIELD_NUMBER = 30;
    public static final int INPOINT_FIELD_NUMBER = 4;
    public static final int ISREVERSED_FIELD_NUMBER = 22;
    public static final int KEEPAUDIOPITCH_FIELD_NUMBER = 16;
    public static final int MATERIALID_FIELD_NUMBER = 3;
    public static final int MATERIALTYPE_FIELD_NUMBER = 56;
    public static final int MEDIAFROM_FIELD_NUMBER = 11;
    public static final int MEDIATYPE_FIELD_NUMBER = 10;
    public static final int MUTE_FIELD_NUMBER = 15;
    public static final int OPACITY_FIELD_NUMBER = 9;
    public static final int ORIGINALFILEPATH_FIELD_NUMBER = 28;
    public static final int ORIGINALVIDEOHEIGHT_FIELD_NUMBER = 49;
    public static final int ORIGINALVIDEOWIDTH_FIELD_NUMBER = 48;
    public static final int OUTANIM_FIELD_NUMBER = 31;
    public static final int OUTPOINT_FIELD_NUMBER = 5;
    private static volatile Parser<VideoClip> PARSER;
    public static final int PIXELIMAGEMATTINGFILTER_FIELD_NUMBER = 21;
    public static final int PLAYSTYLEFROM_FIELD_NUMBER = 55;
    public static final int PLAYSTYLEID_FIELD_NUMBER = 50;
    public static final int PLAYSTYLESOURCETYPE_FIELD_NUMBER = 51;
    public static final int RECYCLE_FIELD_NUMBER = 57;
    public static final int ROWINTRACK_FIELD_NUMBER = 8;
    public static final int SOURCEPATH_FIELD_NUMBER = 12;
    public static final int SPEED_FIELD_NUMBER = 19;
    public static final int TRIMIN_FIELD_NUMBER = 6;
    public static final int TRIMOUT_FIELD_NUMBER = 7;
    public static final int VIRTUALIDOLINFO_FIELD_NUMBER = 37;
    public static final int VOLUMEBEFOREAUDIOSEPARATE_FIELD_NUMBER = 13;
    public static final int VSNOTE_FIELD_NUMBER = 27;
    private boolean audioSeparate_;
    private Rect avatarRect_;
    private float avatarRoll_;
    private LocalPath backOriginalClipFilePath_;
    private Color backgroundColor_;
    private int bizFrom_;
    private int blendingMode_;
    private boolean canReplace_;
    private int clipType_;
    private Animation compoundAnim_;
    private int curveType_;
    private int detectMode_;
    private int extraVideoFrom_;
    private int extraVideoRotation_;
    private int fromType_;
    private Animation inAnim_;
    private long inPoint_;
    private boolean isReversed_;
    private boolean keepAudioPitch_;
    private LocalPath materialId_;
    private int materialType_;
    private int mediaFrom_;
    private int mediaType_;
    private boolean mute_;
    private float opacity_;
    private LocalPath originalFilePath_;
    private float originalVideoHeight_;
    private float originalVideoWidth_;
    private Animation outAnim_;
    private long outPoint_;
    private VideoClipPixelImageMattingFilter pixelImageMattingFilter_;
    private int playStyleFrom_;
    private int playStyleSourceType_;
    private boolean recycle_;
    private int rowInTrack_;
    private LocalPath sourcePath_;
    private double speed_;
    private long trimIn_;
    private long trimOut_;
    private float volumeBeforeAudioSeparate_;
    private int highLightPointsMemoizedSerializedSize = -1;
    private int customTapsMemoizedSerializedSize = -1;
    private String idString_ = "";
    private String curveString_ = "";
    private Internal.ProtobufList<VideoClipFx> fxs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.LongList highLightPoints_ = GeneratedMessageLite.emptyLongList();
    private Internal.LongList customTaps_ = GeneratedMessageLite.emptyLongList();
    private String vsNote_ = "";
    private String brief_ = "";
    private String virtualIdolInfo_ = "";
    private String extraGameName_ = "";
    private String extraAttachTemplateAudioId_ = "";
    private String extraAttachAudioId_ = "";
    private String extraAttachClipCover_ = "";
    private String extraAttachVirtualIdolId_ = "";
    private String extraAttachAudioPath_ = "";
    private String extraParamsAudioInfo_ = "";
    private String correspondingId_ = "";
    private String playStyleId_ = "";
    private Internal.ProtobufList<GameHighLightPoint> gameHighLightPoints_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$Animation.class */
    public static final class Animation extends GeneratedMessageLite<Animation, a> implements MessageLiteOrBuilder {
        private static final Animation DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PACKAGEPATH_FIELD_NUMBER = 3;
        private static volatile Parser<Animation> PARSER;
        private int duration_;
        private int id_;
        private LocalPath packagePath_;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$Animation$a.class */
        public static final class a extends GeneratedMessageLite.Builder<Animation, a> implements MessageLiteOrBuilder {
            public a() {
                super(Animation.DEFAULT_INSTANCE);
            }
        }

        static {
            Animation animation = new Animation();
            DEFAULT_INSTANCE = animation;
            GeneratedMessageLite.registerDefaultInstance(Animation.class, animation);
        }

        private Animation() {
        }

        private void clearDuration() {
            this.duration_ = 0;
        }

        private void clearId() {
            this.id_ = 0;
        }

        private void clearPackagePath() {
            this.packagePath_ = null;
        }

        public static Animation getDefaultInstance() {
            return DEFAULT_INSTANCE;
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

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(Animation animation) {
            return (a) DEFAULT_INSTANCE.createBuilder(animation);
        }

        public static Animation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Animation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Animation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Animation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Animation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Animation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Animation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Animation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Animation parseFrom(InputStream inputStream) throws IOException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Animation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Animation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Animation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Animation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Animation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<Animation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDuration(int i7) {
            this.duration_ = i7;
        }

        private void setId(int i7) {
            this.id_ = i7;
        }

        private void setPackagePath(LocalPath localPath) {
            localPath.getClass();
            this.packagePath_ = localPath;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f108897a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Animation();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\t", new Object[]{"id_", "duration_", "packagePath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Animation.class) {
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

        public int getDuration() {
            return this.duration_;
        }

        public int getId() {
            return this.id_;
        }

        public LocalPath getPackagePath() {
            LocalPath localPath = this.packagePath_;
            LocalPath defaultInstance = localPath;
            if (localPath == null) {
                defaultInstance = LocalPath.getDefaultInstance();
            }
            return defaultInstance;
        }

        public boolean hasPackagePath() {
            return this.packagePath_ != null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$GameHighLightPoint.class */
    public static final class GameHighLightPoint extends GeneratedMessageLite<GameHighLightPoint, a> implements c {
        private static final GameHighLightPoint DEFAULT_INSTANCE;
        public static final int GAMETYPE_FIELD_NUMBER = 3;
        private static volatile Parser<GameHighLightPoint> PARSER;
        public static final int TAG_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 1;
        private int gameType_;
        private String tag_ = "";
        private long time_;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$GameHighLightPoint$a.class */
        public static final class a extends GeneratedMessageLite.Builder<GameHighLightPoint, a> implements c {
            public a() {
                super(GameHighLightPoint.DEFAULT_INSTANCE);
            }
        }

        static {
            GameHighLightPoint gameHighLightPoint = new GameHighLightPoint();
            DEFAULT_INSTANCE = gameHighLightPoint;
            GeneratedMessageLite.registerDefaultInstance(GameHighLightPoint.class, gameHighLightPoint);
        }

        private GameHighLightPoint() {
        }

        private void clearGameType() {
            this.gameType_ = 0;
        }

        private void clearTag() {
            this.tag_ = getDefaultInstance().getTag();
        }

        private void clearTime() {
            this.time_ = 0L;
        }

        public static GameHighLightPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(GameHighLightPoint gameHighLightPoint) {
            return (a) DEFAULT_INSTANCE.createBuilder(gameHighLightPoint);
        }

        public static GameHighLightPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GameHighLightPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GameHighLightPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GameHighLightPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GameHighLightPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GameHighLightPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GameHighLightPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GameHighLightPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static GameHighLightPoint parseFrom(InputStream inputStream) throws IOException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GameHighLightPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GameHighLightPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static GameHighLightPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GameHighLightPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GameHighLightPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GameHighLightPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<GameHighLightPoint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setGameType(GameType gameType) {
            this.gameType_ = gameType.getNumber();
        }

        private void setGameTypeValue(int i7) {
            this.gameType_ = i7;
        }

        private void setTag(String str) {
            str.getClass();
            this.tag_ = str;
        }

        private void setTagBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tag_ = byteString.toStringUtf8();
        }

        private void setTime(long j7) {
            this.time_ = j7;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f108897a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GameHighLightPoint();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\f", new Object[]{"time_", "tag_", "gameType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (GameHighLightPoint.class) {
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

        public GameType getGameType() {
            GameType gameTypeForNumber = GameType.forNumber(this.gameType_);
            GameType gameType = gameTypeForNumber;
            if (gameTypeForNumber == null) {
                gameType = GameType.UNRECOGNIZED;
            }
            return gameType;
        }

        public int getGameTypeValue() {
            return this.gameType_;
        }

        public String getTag() {
            return this.tag_;
        }

        public ByteString getTagBytes() {
            return ByteString.copyFromUtf8(this.tag_);
        }

        public long getTime() {
            return this.time_;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$GameType.class */
    public enum GameType implements Internal.EnumLite {
        None(0),
        Pinganjing(1),
        Fifth(2),
        HuangYe(3),
        Peace(4),
        Wzry(5),
        LOLM(6),
        PeaceOtherModes(7),
        WzryOtherModes(8),
        LoLMOtherModes(9),
        Other(200),
        UNRECOGNIZED(-1);

        public static final int Fifth_VALUE = 2;
        public static final int HuangYe_VALUE = 3;
        public static final int LOLM_VALUE = 6;
        public static final int LoLMOtherModes_VALUE = 9;
        public static final int None_VALUE = 0;
        public static final int Other_VALUE = 200;
        public static final int PeaceOtherModes_VALUE = 7;
        public static final int Peace_VALUE = 4;
        public static final int Pinganjing_VALUE = 1;
        public static final int WzryOtherModes_VALUE = 8;
        public static final int Wzry_VALUE = 5;
        private static final Internal.EnumLiteMap<GameType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$GameType$a.class */
        public final class a implements Internal.EnumLiteMap<GameType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return GameType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$GameType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108891a = new Object();

            public final boolean isInRange(int i7) {
                return GameType.forNumber(i7) != null;
            }
        }

        GameType(int i7) {
            this.value = i7;
        }

        public static GameType forNumber(int i7) {
            if (i7 == 200) {
                return Other;
            }
            switch (i7) {
                case 0:
                    return None;
                case 1:
                    return Pinganjing;
                case 2:
                    return Fifth;
                case 3:
                    return HuangYe;
                case 4:
                    return Peace;
                case 5:
                    return Wzry;
                case 6:
                    return LOLM;
                case 7:
                    return PeaceOtherModes;
                case 8:
                    return WzryOtherModes;
                case 9:
                    return LoLMOtherModes;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<GameType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108891a;
        }

        @Deprecated
        public static GameType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$PlayStyleFromType.class */
    public enum PlayStyleFromType implements Internal.EnumLite {
        DefaultStyle(0),
        ThreeD(1),
        AI(2),
        UNRECOGNIZED(-1);

        public static final int AI_VALUE = 2;
        public static final int DefaultStyle_VALUE = 0;
        public static final int ThreeD_VALUE = 1;
        private static final Internal.EnumLiteMap<PlayStyleFromType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$PlayStyleFromType$a.class */
        public final class a implements Internal.EnumLiteMap<PlayStyleFromType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return PlayStyleFromType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$PlayStyleFromType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108892a = new Object();

            public final boolean isInRange(int i7) {
                return PlayStyleFromType.forNumber(i7) != null;
            }
        }

        PlayStyleFromType(int i7) {
            this.value = i7;
        }

        public static PlayStyleFromType forNumber(int i7) {
            if (i7 == 0) {
                return DefaultStyle;
            }
            if (i7 == 1) {
                return ThreeD;
            }
            if (i7 != 2) {
                return null;
            }
            return AI;
        }

        public static Internal.EnumLiteMap<PlayStyleFromType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108892a;
        }

        @Deprecated
        public static PlayStyleFromType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$PlayStyleSourceType.class */
    public enum PlayStyleSourceType implements Internal.EnumLite {
        UNDEFINE(0),
        IMAGE(1),
        VIDEO(2),
        BOTH(3),
        UNRECOGNIZED(-1);

        public static final int BOTH_VALUE = 3;
        public static final int IMAGE_VALUE = 1;
        public static final int UNDEFINE_VALUE = 0;
        public static final int VIDEO_VALUE = 2;
        private static final Internal.EnumLiteMap<PlayStyleSourceType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$PlayStyleSourceType$a.class */
        public final class a implements Internal.EnumLiteMap<PlayStyleSourceType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return PlayStyleSourceType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$PlayStyleSourceType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108893a = new Object();

            public final boolean isInRange(int i7) {
                return PlayStyleSourceType.forNumber(i7) != null;
            }
        }

        PlayStyleSourceType(int i7) {
            this.value = i7;
        }

        public static PlayStyleSourceType forNumber(int i7) {
            if (i7 == 0) {
                return UNDEFINE;
            }
            if (i7 == 1) {
                return IMAGE;
            }
            if (i7 == 2) {
                return VIDEO;
            }
            if (i7 != 3) {
                return null;
            }
            return BOTH;
        }

        public static Internal.EnumLiteMap<PlayStyleSourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108893a;
        }

        @Deprecated
        public static PlayStyleSourceType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$SourceFromType.class */
    public enum SourceFromType implements Internal.EnumLite {
        DefaultType(0),
        CurrentProject(1),
        PhotosVideo(2),
        PhotosImage(3),
        MyMaterial(4),
        MaterialsLibrary(5),
        Others(6),
        ReplayLocal(7),
        ReplayLOLM(8),
        UNRECOGNIZED(-1);

        public static final int CurrentProject_VALUE = 1;
        public static final int DefaultType_VALUE = 0;
        public static final int MaterialsLibrary_VALUE = 5;
        public static final int MyMaterial_VALUE = 4;
        public static final int Others_VALUE = 6;
        public static final int PhotosImage_VALUE = 3;
        public static final int PhotosVideo_VALUE = 2;
        public static final int ReplayLOLM_VALUE = 8;
        public static final int ReplayLocal_VALUE = 7;
        private static final Internal.EnumLiteMap<SourceFromType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$SourceFromType$a.class */
        public final class a implements Internal.EnumLiteMap<SourceFromType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return SourceFromType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$SourceFromType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108894a = new Object();

            public final boolean isInRange(int i7) {
                return SourceFromType.forNumber(i7) != null;
            }
        }

        SourceFromType(int i7) {
            this.value = i7;
        }

        public static SourceFromType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return DefaultType;
                case 1:
                    return CurrentProject;
                case 2:
                    return PhotosVideo;
                case 3:
                    return PhotosImage;
                case 4:
                    return MyMaterial;
                case 5:
                    return MaterialsLibrary;
                case 6:
                    return Others;
                case 7:
                    return ReplayLocal;
                case 8:
                    return ReplayLOLM;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<SourceFromType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108894a;
        }

        @Deprecated
        public static SourceFromType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$Type.class */
    public enum Type implements Internal.EnumLite {
        Default(0),
        Header(1),
        Trailer(2),
        Template(3),
        Punchline(4),
        Avatar(5),
        Blank(6),
        PlaceHolder(7),
        UNRECOGNIZED(-1);

        public static final int Avatar_VALUE = 5;
        public static final int Blank_VALUE = 6;
        public static final int Default_VALUE = 0;
        public static final int Header_VALUE = 1;
        public static final int PlaceHolder_VALUE = 7;
        public static final int Punchline_VALUE = 4;
        public static final int Template_VALUE = 3;
        public static final int Trailer_VALUE = 2;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$Type$a.class */
        public final class a implements Internal.EnumLiteMap<Type> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return Type.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$Type$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108895a = new Object();

            public final boolean isInRange(int i7) {
                return Type.forNumber(i7) != null;
            }
        }

        Type(int i7) {
            this.value = i7;
        }

        public static Type forNumber(int i7) {
            switch (i7) {
                case 0:
                    return Default;
                case 1:
                    return Header;
                case 2:
                    return Trailer;
                case 3:
                    return Template;
                case 4:
                    return Punchline;
                case 5:
                    return Avatar;
                case 6:
                    return Blank;
                case 7:
                    return PlaceHolder;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108895a;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$VideoDetectMode.class */
    public enum VideoDetectMode implements Internal.EnumLite {
        NONE(0),
        PORTRAIT(1),
        HEAD_PORTRAIT(2),
        UNRECOGNIZED(-1);

        public static final int HEAD_PORTRAIT_VALUE = 2;
        public static final int NONE_VALUE = 0;
        public static final int PORTRAIT_VALUE = 1;
        private static final Internal.EnumLiteMap<VideoDetectMode> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$VideoDetectMode$a.class */
        public final class a implements Internal.EnumLiteMap<VideoDetectMode> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return VideoDetectMode.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$VideoDetectMode$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108896a = new Object();

            public final boolean isInRange(int i7) {
                return VideoDetectMode.forNumber(i7) != null;
            }
        }

        VideoDetectMode(int i7) {
            this.value = i7;
        }

        public static VideoDetectMode forNumber(int i7) {
            if (i7 == 0) {
                return NONE;
            }
            if (i7 == 1) {
                return PORTRAIT;
            }
            if (i7 != 2) {
                return null;
            }
            return HEAD_PORTRAIT;
        }

        public static Internal.EnumLiteMap<VideoDetectMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108896a;
        }

        @Deprecated
        public static VideoDetectMode valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108897a;

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
                com.bilibili.studio.videoeditor.VideoClip.a.f108897a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClip.a.f108897a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClip.a.f108897a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClip.a.f108897a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClip.a.f108897a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClip.a.f108897a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClip.a.f108897a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.VideoClip.a.m10367clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$b.class */
    public static final class b extends GeneratedMessageLite.Builder<VideoClip, b> implements C {
        public b() {
            super(VideoClip.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClip$c.class */
    public interface c extends MessageLiteOrBuilder {
    }

    static {
        VideoClip videoClip = new VideoClip();
        DEFAULT_INSTANCE = videoClip;
        GeneratedMessageLite.registerDefaultInstance(VideoClip.class, videoClip);
    }

    private VideoClip() {
    }

    private void addAllCustomTaps(Iterable<? extends Long> iterable) {
        ensureCustomTapsIsMutable();
        AbstractMessageLite.addAll(iterable, this.customTaps_);
    }

    private void addAllFxs(Iterable<? extends VideoClipFx> iterable) {
        ensureFxsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fxs_);
    }

    private void addAllGameHighLightPoints(Iterable<? extends GameHighLightPoint> iterable) {
        ensureGameHighLightPointsIsMutable();
        AbstractMessageLite.addAll(iterable, this.gameHighLightPoints_);
    }

    private void addAllHighLightPoints(Iterable<? extends Long> iterable) {
        ensureHighLightPointsIsMutable();
        AbstractMessageLite.addAll(iterable, this.highLightPoints_);
    }

    private void addCustomTaps(long j7) {
        ensureCustomTapsIsMutable();
        this.customTaps_.addLong(j7);
    }

    private void addFxs(int i7, VideoClipFx videoClipFx) {
        videoClipFx.getClass();
        ensureFxsIsMutable();
        this.fxs_.add(i7, videoClipFx);
    }

    private void addFxs(VideoClipFx videoClipFx) {
        videoClipFx.getClass();
        ensureFxsIsMutable();
        this.fxs_.add(videoClipFx);
    }

    private void addGameHighLightPoints(int i7, GameHighLightPoint gameHighLightPoint) {
        gameHighLightPoint.getClass();
        ensureGameHighLightPointsIsMutable();
        this.gameHighLightPoints_.add(i7, gameHighLightPoint);
    }

    private void addGameHighLightPoints(GameHighLightPoint gameHighLightPoint) {
        gameHighLightPoint.getClass();
        ensureGameHighLightPointsIsMutable();
        this.gameHighLightPoints_.add(gameHighLightPoint);
    }

    private void addHighLightPoints(long j7) {
        ensureHighLightPointsIsMutable();
        this.highLightPoints_.addLong(j7);
    }

    private void clearAudioSeparate() {
        this.audioSeparate_ = false;
    }

    private void clearAvatarRect() {
        this.avatarRect_ = null;
    }

    private void clearAvatarRoll() {
        this.avatarRoll_ = 0.0f;
    }

    private void clearBackOriginalClipFilePath() {
        this.backOriginalClipFilePath_ = null;
    }

    private void clearBackgroundColor() {
        this.backgroundColor_ = null;
    }

    private void clearBizFrom() {
        this.bizFrom_ = 0;
    }

    private void clearBlendingMode() {
        this.blendingMode_ = 0;
    }

    private void clearBrief() {
        this.brief_ = getDefaultInstance().getBrief();
    }

    private void clearCanReplace() {
        this.canReplace_ = false;
    }

    private void clearClipType() {
        this.clipType_ = 0;
    }

    private void clearCompoundAnim() {
        this.compoundAnim_ = null;
    }

    private void clearCorrespondingId() {
        this.correspondingId_ = getDefaultInstance().getCorrespondingId();
    }

    private void clearCurveString() {
        this.curveString_ = getDefaultInstance().getCurveString();
    }

    private void clearCurveType() {
        this.curveType_ = 0;
    }

    private void clearCustomTaps() {
        this.customTaps_ = GeneratedMessageLite.emptyLongList();
    }

    private void clearDetectMode() {
        this.detectMode_ = 0;
    }

    private void clearExtraAttachAudioId() {
        this.extraAttachAudioId_ = getDefaultInstance().getExtraAttachAudioId();
    }

    private void clearExtraAttachAudioPath() {
        this.extraAttachAudioPath_ = getDefaultInstance().getExtraAttachAudioPath();
    }

    private void clearExtraAttachClipCover() {
        this.extraAttachClipCover_ = getDefaultInstance().getExtraAttachClipCover();
    }

    private void clearExtraAttachTemplateAudioId() {
        this.extraAttachTemplateAudioId_ = getDefaultInstance().getExtraAttachTemplateAudioId();
    }

    private void clearExtraAttachVirtualIdolId() {
        this.extraAttachVirtualIdolId_ = getDefaultInstance().getExtraAttachVirtualIdolId();
    }

    private void clearExtraGameName() {
        this.extraGameName_ = getDefaultInstance().getExtraGameName();
    }

    private void clearExtraParamsAudioInfo() {
        this.extraParamsAudioInfo_ = getDefaultInstance().getExtraParamsAudioInfo();
    }

    private void clearExtraVideoFrom() {
        this.extraVideoFrom_ = 0;
    }

    private void clearExtraVideoRotation() {
        this.extraVideoRotation_ = 0;
    }

    private void clearFromType() {
        this.fromType_ = 0;
    }

    private void clearFxs() {
        this.fxs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearGameHighLightPoints() {
        this.gameHighLightPoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearHighLightPoints() {
        this.highLightPoints_ = GeneratedMessageLite.emptyLongList();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearInAnim() {
        this.inAnim_ = null;
    }

    private void clearInPoint() {
        this.inPoint_ = 0L;
    }

    private void clearIsReversed() {
        this.isReversed_ = false;
    }

    private void clearKeepAudioPitch() {
        this.keepAudioPitch_ = false;
    }

    private void clearMaterialId() {
        this.materialId_ = null;
    }

    private void clearMaterialType() {
        this.materialType_ = 0;
    }

    private void clearMediaFrom() {
        this.mediaFrom_ = 0;
    }

    private void clearMediaType() {
        this.mediaType_ = 0;
    }

    private void clearMute() {
        this.mute_ = false;
    }

    private void clearOpacity() {
        this.opacity_ = 0.0f;
    }

    private void clearOriginalFilePath() {
        this.originalFilePath_ = null;
    }

    private void clearOriginalVideoHeight() {
        this.originalVideoHeight_ = 0.0f;
    }

    private void clearOriginalVideoWidth() {
        this.originalVideoWidth_ = 0.0f;
    }

    private void clearOutAnim() {
        this.outAnim_ = null;
    }

    private void clearOutPoint() {
        this.outPoint_ = 0L;
    }

    private void clearPixelImageMattingFilter() {
        this.pixelImageMattingFilter_ = null;
    }

    private void clearPlayStyleFrom() {
        this.playStyleFrom_ = 0;
    }

    private void clearPlayStyleId() {
        this.playStyleId_ = getDefaultInstance().getPlayStyleId();
    }

    private void clearPlayStyleSourceType() {
        this.playStyleSourceType_ = 0;
    }

    private void clearRecycle() {
        this.recycle_ = false;
    }

    private void clearRowInTrack() {
        this.rowInTrack_ = 0;
    }

    private void clearSourcePath() {
        this.sourcePath_ = null;
    }

    private void clearSpeed() {
        this.speed_ = 0.0d;
    }

    private void clearTrimIn() {
        this.trimIn_ = 0L;
    }

    private void clearTrimOut() {
        this.trimOut_ = 0L;
    }

    private void clearVirtualIdolInfo() {
        this.virtualIdolInfo_ = getDefaultInstance().getVirtualIdolInfo();
    }

    private void clearVolumeBeforeAudioSeparate() {
        this.volumeBeforeAudioSeparate_ = 0.0f;
    }

    private void clearVsNote() {
        this.vsNote_ = getDefaultInstance().getVsNote();
    }

    private void ensureCustomTapsIsMutable() {
        Internal.LongList longList = this.customTaps_;
        if (longList.isModifiable()) {
            return;
        }
        this.customTaps_ = GeneratedMessageLite.mutableCopy(longList);
    }

    private void ensureFxsIsMutable() {
        Internal.ProtobufList<VideoClipFx> protobufList = this.fxs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fxs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureGameHighLightPointsIsMutable() {
        Internal.ProtobufList<GameHighLightPoint> protobufList = this.gameHighLightPoints_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.gameHighLightPoints_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureHighLightPointsIsMutable() {
        Internal.LongList longList = this.highLightPoints_;
        if (longList.isModifiable()) {
            return;
        }
        this.highLightPoints_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static VideoClip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAvatarRect(Rect rect) {
        rect.getClass();
        Rect rect2 = this.avatarRect_;
        if (rect2 == null || rect2 == Rect.getDefaultInstance()) {
            this.avatarRect_ = rect;
        } else {
            this.avatarRect_ = (Rect) ((Rect.b) Rect.newBuilder(this.avatarRect_).mergeFrom(rect)).buildPartial();
        }
    }

    private void mergeBackOriginalClipFilePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.backOriginalClipFilePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.backOriginalClipFilePath_ = localPath;
        } else {
            this.backOriginalClipFilePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.backOriginalClipFilePath_).mergeFrom(localPath)).buildPartial();
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

    private void mergeCompoundAnim(Animation animation) {
        animation.getClass();
        Animation animation2 = this.compoundAnim_;
        if (animation2 == null || animation2 == Animation.getDefaultInstance()) {
            this.compoundAnim_ = animation;
        } else {
            this.compoundAnim_ = (Animation) ((Animation.a) Animation.newBuilder(this.compoundAnim_).mergeFrom(animation)).buildPartial();
        }
    }

    private void mergeInAnim(Animation animation) {
        animation.getClass();
        Animation animation2 = this.inAnim_;
        if (animation2 == null || animation2 == Animation.getDefaultInstance()) {
            this.inAnim_ = animation;
        } else {
            this.inAnim_ = (Animation) ((Animation.a) Animation.newBuilder(this.inAnim_).mergeFrom(animation)).buildPartial();
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

    private void mergeOriginalFilePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.originalFilePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.originalFilePath_ = localPath;
        } else {
            this.originalFilePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.originalFilePath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeOutAnim(Animation animation) {
        animation.getClass();
        Animation animation2 = this.outAnim_;
        if (animation2 == null || animation2 == Animation.getDefaultInstance()) {
            this.outAnim_ = animation;
        } else {
            this.outAnim_ = (Animation) ((Animation.a) Animation.newBuilder(this.outAnim_).mergeFrom(animation)).buildPartial();
        }
    }

    private void mergePixelImageMattingFilter(VideoClipPixelImageMattingFilter videoClipPixelImageMattingFilter) {
        videoClipPixelImageMattingFilter.getClass();
        VideoClipPixelImageMattingFilter videoClipPixelImageMattingFilter2 = this.pixelImageMattingFilter_;
        if (videoClipPixelImageMattingFilter2 == null || videoClipPixelImageMattingFilter2 == VideoClipPixelImageMattingFilter.getDefaultInstance()) {
            this.pixelImageMattingFilter_ = videoClipPixelImageMattingFilter;
        } else {
            this.pixelImageMattingFilter_ = (VideoClipPixelImageMattingFilter) ((VideoClipPixelImageMattingFilter.b) VideoClipPixelImageMattingFilter.newBuilder(this.pixelImageMattingFilter_).mergeFrom(videoClipPixelImageMattingFilter)).buildPartial();
        }
    }

    private void mergeSourcePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.sourcePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.sourcePath_ = localPath;
        } else {
            this.sourcePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.sourcePath_).mergeFrom(localPath)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(VideoClip videoClip) {
        return (b) DEFAULT_INSTANCE.createBuilder(videoClip);
    }

    public static VideoClip parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoClip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClip parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoClip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoClip parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoClip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static VideoClip parseFrom(InputStream inputStream) throws IOException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClip parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VideoClip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoClip parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoClip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<VideoClip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFxs(int i7) {
        ensureFxsIsMutable();
        this.fxs_.remove(i7);
    }

    private void removeGameHighLightPoints(int i7) {
        ensureGameHighLightPointsIsMutable();
        this.gameHighLightPoints_.remove(i7);
    }

    private void setAudioSeparate(boolean z6) {
        this.audioSeparate_ = z6;
    }

    private void setAvatarRect(Rect rect) {
        rect.getClass();
        this.avatarRect_ = rect;
    }

    private void setAvatarRoll(float f7) {
        this.avatarRoll_ = f7;
    }

    private void setBackOriginalClipFilePath(LocalPath localPath) {
        localPath.getClass();
        this.backOriginalClipFilePath_ = localPath;
    }

    private void setBackgroundColor(Color color) {
        color.getClass();
        this.backgroundColor_ = color;
    }

    private void setBizFrom(int i7) {
        this.bizFrom_ = i7;
    }

    private void setBlendingMode(int i7) {
        this.blendingMode_ = i7;
    }

    private void setBrief(String str) {
        str.getClass();
        this.brief_ = str;
    }

    private void setBriefBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.brief_ = byteString.toStringUtf8();
    }

    private void setCanReplace(boolean z6) {
        this.canReplace_ = z6;
    }

    private void setClipType(Type type) {
        this.clipType_ = type.getNumber();
    }

    private void setClipTypeValue(int i7) {
        this.clipType_ = i7;
    }

    private void setCompoundAnim(Animation animation) {
        animation.getClass();
        this.compoundAnim_ = animation;
    }

    private void setCorrespondingId(String str) {
        str.getClass();
        this.correspondingId_ = str;
    }

    private void setCorrespondingIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.correspondingId_ = byteString.toStringUtf8();
    }

    private void setCurveString(String str) {
        str.getClass();
        this.curveString_ = str;
    }

    private void setCurveStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.curveString_ = byteString.toStringUtf8();
    }

    private void setCurveType(CurveType curveType) {
        this.curveType_ = curveType.getNumber();
    }

    private void setCurveTypeValue(int i7) {
        this.curveType_ = i7;
    }

    private void setCustomTaps(int i7, long j7) {
        ensureCustomTapsIsMutable();
        this.customTaps_.setLong(i7, j7);
    }

    private void setDetectMode(VideoDetectMode videoDetectMode) {
        this.detectMode_ = videoDetectMode.getNumber();
    }

    private void setDetectModeValue(int i7) {
        this.detectMode_ = i7;
    }

    private void setExtraAttachAudioId(String str) {
        str.getClass();
        this.extraAttachAudioId_ = str;
    }

    private void setExtraAttachAudioIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraAttachAudioId_ = byteString.toStringUtf8();
    }

    private void setExtraAttachAudioPath(String str) {
        str.getClass();
        this.extraAttachAudioPath_ = str;
    }

    private void setExtraAttachAudioPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraAttachAudioPath_ = byteString.toStringUtf8();
    }

    private void setExtraAttachClipCover(String str) {
        str.getClass();
        this.extraAttachClipCover_ = str;
    }

    private void setExtraAttachClipCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraAttachClipCover_ = byteString.toStringUtf8();
    }

    private void setExtraAttachTemplateAudioId(String str) {
        str.getClass();
        this.extraAttachTemplateAudioId_ = str;
    }

    private void setExtraAttachTemplateAudioIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraAttachTemplateAudioId_ = byteString.toStringUtf8();
    }

    private void setExtraAttachVirtualIdolId(String str) {
        str.getClass();
        this.extraAttachVirtualIdolId_ = str;
    }

    private void setExtraAttachVirtualIdolIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraAttachVirtualIdolId_ = byteString.toStringUtf8();
    }

    private void setExtraGameName(String str) {
        str.getClass();
        this.extraGameName_ = str;
    }

    private void setExtraGameNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraGameName_ = byteString.toStringUtf8();
    }

    private void setExtraParamsAudioInfo(String str) {
        str.getClass();
        this.extraParamsAudioInfo_ = str;
    }

    private void setExtraParamsAudioInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraParamsAudioInfo_ = byteString.toStringUtf8();
    }

    private void setExtraVideoFrom(int i7) {
        this.extraVideoFrom_ = i7;
    }

    private void setExtraVideoRotation(int i7) {
        this.extraVideoRotation_ = i7;
    }

    private void setFromType(SourceFromType sourceFromType) {
        this.fromType_ = sourceFromType.getNumber();
    }

    private void setFromTypeValue(int i7) {
        this.fromType_ = i7;
    }

    private void setFxs(int i7, VideoClipFx videoClipFx) {
        videoClipFx.getClass();
        ensureFxsIsMutable();
        this.fxs_.set(i7, videoClipFx);
    }

    private void setGameHighLightPoints(int i7, GameHighLightPoint gameHighLightPoint) {
        gameHighLightPoint.getClass();
        ensureGameHighLightPointsIsMutable();
        this.gameHighLightPoints_.set(i7, gameHighLightPoint);
    }

    private void setHighLightPoints(int i7, long j7) {
        ensureHighLightPointsIsMutable();
        this.highLightPoints_.setLong(i7, j7);
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setInAnim(Animation animation) {
        animation.getClass();
        this.inAnim_ = animation;
    }

    private void setInPoint(long j7) {
        this.inPoint_ = j7;
    }

    private void setIsReversed(boolean z6) {
        this.isReversed_ = z6;
    }

    private void setKeepAudioPitch(boolean z6) {
        this.keepAudioPitch_ = z6;
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

    private void setMediaFrom(MediaFrom mediaFrom) {
        this.mediaFrom_ = mediaFrom.getNumber();
    }

    private void setMediaFromValue(int i7) {
        this.mediaFrom_ = i7;
    }

    private void setMediaType(MediaType mediaType) {
        this.mediaType_ = mediaType.getNumber();
    }

    private void setMediaTypeValue(int i7) {
        this.mediaType_ = i7;
    }

    private void setMute(boolean z6) {
        this.mute_ = z6;
    }

    private void setOpacity(float f7) {
        this.opacity_ = f7;
    }

    private void setOriginalFilePath(LocalPath localPath) {
        localPath.getClass();
        this.originalFilePath_ = localPath;
    }

    private void setOriginalVideoHeight(float f7) {
        this.originalVideoHeight_ = f7;
    }

    private void setOriginalVideoWidth(float f7) {
        this.originalVideoWidth_ = f7;
    }

    private void setOutAnim(Animation animation) {
        animation.getClass();
        this.outAnim_ = animation;
    }

    private void setOutPoint(long j7) {
        this.outPoint_ = j7;
    }

    private void setPixelImageMattingFilter(VideoClipPixelImageMattingFilter videoClipPixelImageMattingFilter) {
        videoClipPixelImageMattingFilter.getClass();
        this.pixelImageMattingFilter_ = videoClipPixelImageMattingFilter;
    }

    private void setPlayStyleFrom(PlayStyleFromType playStyleFromType) {
        this.playStyleFrom_ = playStyleFromType.getNumber();
    }

    private void setPlayStyleFromValue(int i7) {
        this.playStyleFrom_ = i7;
    }

    private void setPlayStyleId(String str) {
        str.getClass();
        this.playStyleId_ = str;
    }

    private void setPlayStyleIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playStyleId_ = byteString.toStringUtf8();
    }

    private void setPlayStyleSourceType(PlayStyleSourceType playStyleSourceType) {
        this.playStyleSourceType_ = playStyleSourceType.getNumber();
    }

    private void setPlayStyleSourceTypeValue(int i7) {
        this.playStyleSourceType_ = i7;
    }

    private void setRecycle(boolean z6) {
        this.recycle_ = z6;
    }

    private void setRowInTrack(int i7) {
        this.rowInTrack_ = i7;
    }

    private void setSourcePath(LocalPath localPath) {
        localPath.getClass();
        this.sourcePath_ = localPath;
    }

    private void setSpeed(double d7) {
        this.speed_ = d7;
    }

    private void setTrimIn(long j7) {
        this.trimIn_ = j7;
    }

    private void setTrimOut(long j7) {
        this.trimOut_ = j7;
    }

    private void setVirtualIdolInfo(String str) {
        str.getClass();
        this.virtualIdolInfo_ = str;
    }

    private void setVirtualIdolInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.virtualIdolInfo_ = byteString.toStringUtf8();
    }

    private void setVolumeBeforeAudioSeparate(float f7) {
        this.volumeBeforeAudioSeparate_ = f7;
    }

    private void setVsNote(String str) {
        str.getClass();
        this.vsNote_ = str;
    }

    private void setVsNoteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vsNote_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108897a[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoClip();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000:\u0000\u0000\u0001::\u0000\u0004\u0000\u0001Ȉ\u0002\f\u0003\t\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0004\t\u0001\n\f\u000b\f\f\t\r\u0001\u000e\u0007\u000f\u0007\u0010\u0007\u0011\f\u0012Ȉ\u0013\u0000\u0014\u001b\u0015\t\u0016\u0007\u0017\u0004\u0018\u0004\u0019%\u001a%\u001bȈ\u001c\t\u001d\f\u001e\t\u001f\t \t!\t\"\u0004#Ȉ$\u0007%Ȉ&\u0004'Ȉ(Ȉ)Ȉ*Ȉ+Ȉ,Ȉ-Ȉ.\f/Ȉ0\u00011\u00012Ȉ3\f4\t5\u00016\u001b7\f8\f9\u0007:\t", new Object[]{"idString_", "clipType_", "materialId_", "inPoint_", "outPoint_", "trimIn_", "trimOut_", "rowInTrack_", "opacity_", "mediaType_", "mediaFrom_", "sourcePath_", "volumeBeforeAudioSeparate_", "audioSeparate_", "mute_", "keepAudioPitch_", "curveType_", "curveString_", "speed_", "fxs_", VideoClipFx.class, "pixelImageMattingFilter_", "isReversed_", "blendingMode_", "extraVideoRotation_", "highLightPoints_", "customTaps_", "vsNote_", "originalFilePath_", "fromType_", "inAnim_", "outAnim_", "compoundAnim_", "backOriginalClipFilePath_", "bizFrom_", "brief_", "canReplace_", "virtualIdolInfo_", "extraVideoFrom_", "extraGameName_", "extraAttachTemplateAudioId_", "extraAttachAudioId_", "extraAttachClipCover_", "extraAttachVirtualIdolId_", "extraAttachAudioPath_", "extraParamsAudioInfo_", "detectMode_", "correspondingId_", "originalVideoWidth_", "originalVideoHeight_", "playStyleId_", "playStyleSourceType_", "avatarRect_", "avatarRoll_", "gameHighLightPoints_", GameHighLightPoint.class, "playStyleFrom_", "materialType_", "recycle_", "backgroundColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (VideoClip.class) {
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

    public boolean getAudioSeparate() {
        return this.audioSeparate_;
    }

    public Rect getAvatarRect() {
        Rect rect = this.avatarRect_;
        Rect defaultInstance = rect;
        if (rect == null) {
            defaultInstance = Rect.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getAvatarRoll() {
        return this.avatarRoll_;
    }

    public LocalPath getBackOriginalClipFilePath() {
        LocalPath localPath = this.backOriginalClipFilePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Color getBackgroundColor() {
        Color color = this.backgroundColor_;
        Color defaultInstance = color;
        if (color == null) {
            defaultInstance = Color.getDefaultInstance();
        }
        return defaultInstance;
    }

    public int getBizFrom() {
        return this.bizFrom_;
    }

    public int getBlendingMode() {
        return this.blendingMode_;
    }

    public String getBrief() {
        return this.brief_;
    }

    public ByteString getBriefBytes() {
        return ByteString.copyFromUtf8(this.brief_);
    }

    public boolean getCanReplace() {
        return this.canReplace_;
    }

    public Type getClipType() {
        Type typeForNumber = Type.forNumber(this.clipType_);
        Type type = typeForNumber;
        if (typeForNumber == null) {
            type = Type.UNRECOGNIZED;
        }
        return type;
    }

    public int getClipTypeValue() {
        return this.clipType_;
    }

    public Animation getCompoundAnim() {
        Animation animation = this.compoundAnim_;
        Animation defaultInstance = animation;
        if (animation == null) {
            defaultInstance = Animation.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getCorrespondingId() {
        return this.correspondingId_;
    }

    public ByteString getCorrespondingIdBytes() {
        return ByteString.copyFromUtf8(this.correspondingId_);
    }

    public String getCurveString() {
        return this.curveString_;
    }

    public ByteString getCurveStringBytes() {
        return ByteString.copyFromUtf8(this.curveString_);
    }

    public CurveType getCurveType() {
        CurveType curveTypeForNumber = CurveType.forNumber(this.curveType_);
        CurveType curveType = curveTypeForNumber;
        if (curveTypeForNumber == null) {
            curveType = CurveType.UNRECOGNIZED;
        }
        return curveType;
    }

    public int getCurveTypeValue() {
        return this.curveType_;
    }

    public long getCustomTaps(int i7) {
        return this.customTaps_.getLong(i7);
    }

    public int getCustomTapsCount() {
        return this.customTaps_.size();
    }

    public List<Long> getCustomTapsList() {
        return this.customTaps_;
    }

    public VideoDetectMode getDetectMode() {
        VideoDetectMode videoDetectModeForNumber = VideoDetectMode.forNumber(this.detectMode_);
        VideoDetectMode videoDetectMode = videoDetectModeForNumber;
        if (videoDetectModeForNumber == null) {
            videoDetectMode = VideoDetectMode.UNRECOGNIZED;
        }
        return videoDetectMode;
    }

    public int getDetectModeValue() {
        return this.detectMode_;
    }

    public String getExtraAttachAudioId() {
        return this.extraAttachAudioId_;
    }

    public ByteString getExtraAttachAudioIdBytes() {
        return ByteString.copyFromUtf8(this.extraAttachAudioId_);
    }

    public String getExtraAttachAudioPath() {
        return this.extraAttachAudioPath_;
    }

    public ByteString getExtraAttachAudioPathBytes() {
        return ByteString.copyFromUtf8(this.extraAttachAudioPath_);
    }

    public String getExtraAttachClipCover() {
        return this.extraAttachClipCover_;
    }

    public ByteString getExtraAttachClipCoverBytes() {
        return ByteString.copyFromUtf8(this.extraAttachClipCover_);
    }

    public String getExtraAttachTemplateAudioId() {
        return this.extraAttachTemplateAudioId_;
    }

    public ByteString getExtraAttachTemplateAudioIdBytes() {
        return ByteString.copyFromUtf8(this.extraAttachTemplateAudioId_);
    }

    public String getExtraAttachVirtualIdolId() {
        return this.extraAttachVirtualIdolId_;
    }

    public ByteString getExtraAttachVirtualIdolIdBytes() {
        return ByteString.copyFromUtf8(this.extraAttachVirtualIdolId_);
    }

    public String getExtraGameName() {
        return this.extraGameName_;
    }

    public ByteString getExtraGameNameBytes() {
        return ByteString.copyFromUtf8(this.extraGameName_);
    }

    public String getExtraParamsAudioInfo() {
        return this.extraParamsAudioInfo_;
    }

    public ByteString getExtraParamsAudioInfoBytes() {
        return ByteString.copyFromUtf8(this.extraParamsAudioInfo_);
    }

    public int getExtraVideoFrom() {
        return this.extraVideoFrom_;
    }

    public int getExtraVideoRotation() {
        return this.extraVideoRotation_;
    }

    public SourceFromType getFromType() {
        SourceFromType sourceFromTypeForNumber = SourceFromType.forNumber(this.fromType_);
        SourceFromType sourceFromType = sourceFromTypeForNumber;
        if (sourceFromTypeForNumber == null) {
            sourceFromType = SourceFromType.UNRECOGNIZED;
        }
        return sourceFromType;
    }

    public int getFromTypeValue() {
        return this.fromType_;
    }

    public VideoClipFx getFxs(int i7) {
        return (VideoClipFx) this.fxs_.get(i7);
    }

    public int getFxsCount() {
        return this.fxs_.size();
    }

    public List<VideoClipFx> getFxsList() {
        return this.fxs_;
    }

    public B getFxsOrBuilder(int i7) {
        return (B) this.fxs_.get(i7);
    }

    public List<? extends B> getFxsOrBuilderList() {
        return this.fxs_;
    }

    public GameHighLightPoint getGameHighLightPoints(int i7) {
        return (GameHighLightPoint) this.gameHighLightPoints_.get(i7);
    }

    public int getGameHighLightPointsCount() {
        return this.gameHighLightPoints_.size();
    }

    public List<GameHighLightPoint> getGameHighLightPointsList() {
        return this.gameHighLightPoints_;
    }

    public c getGameHighLightPointsOrBuilder(int i7) {
        return (c) this.gameHighLightPoints_.get(i7);
    }

    public List<? extends c> getGameHighLightPointsOrBuilderList() {
        return this.gameHighLightPoints_;
    }

    public long getHighLightPoints(int i7) {
        return this.highLightPoints_.getLong(i7);
    }

    public int getHighLightPointsCount() {
        return this.highLightPoints_.size();
    }

    public List<Long> getHighLightPointsList() {
        return this.highLightPoints_;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public Animation getInAnim() {
        Animation animation = this.inAnim_;
        Animation defaultInstance = animation;
        if (animation == null) {
            defaultInstance = Animation.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getInPoint() {
        return this.inPoint_;
    }

    public boolean getIsReversed() {
        return this.isReversed_;
    }

    public boolean getKeepAudioPitch() {
        return this.keepAudioPitch_;
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

    public MediaFrom getMediaFrom() {
        MediaFrom mediaFromForNumber = MediaFrom.forNumber(this.mediaFrom_);
        MediaFrom mediaFrom = mediaFromForNumber;
        if (mediaFromForNumber == null) {
            mediaFrom = MediaFrom.UNRECOGNIZED;
        }
        return mediaFrom;
    }

    public int getMediaFromValue() {
        return this.mediaFrom_;
    }

    public MediaType getMediaType() {
        MediaType mediaTypeForNumber = MediaType.forNumber(this.mediaType_);
        MediaType mediaType = mediaTypeForNumber;
        if (mediaTypeForNumber == null) {
            mediaType = MediaType.UNRECOGNIZED;
        }
        return mediaType;
    }

    public int getMediaTypeValue() {
        return this.mediaType_;
    }

    public boolean getMute() {
        return this.mute_;
    }

    public float getOpacity() {
        return this.opacity_;
    }

    public LocalPath getOriginalFilePath() {
        LocalPath localPath = this.originalFilePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getOriginalVideoHeight() {
        return this.originalVideoHeight_;
    }

    public float getOriginalVideoWidth() {
        return this.originalVideoWidth_;
    }

    public Animation getOutAnim() {
        Animation animation = this.outAnim_;
        Animation defaultInstance = animation;
        if (animation == null) {
            defaultInstance = Animation.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getOutPoint() {
        return this.outPoint_;
    }

    public VideoClipPixelImageMattingFilter getPixelImageMattingFilter() {
        VideoClipPixelImageMattingFilter videoClipPixelImageMattingFilter = this.pixelImageMattingFilter_;
        VideoClipPixelImageMattingFilter defaultInstance = videoClipPixelImageMattingFilter;
        if (videoClipPixelImageMattingFilter == null) {
            defaultInstance = VideoClipPixelImageMattingFilter.getDefaultInstance();
        }
        return defaultInstance;
    }

    public PlayStyleFromType getPlayStyleFrom() {
        PlayStyleFromType playStyleFromTypeForNumber = PlayStyleFromType.forNumber(this.playStyleFrom_);
        PlayStyleFromType playStyleFromType = playStyleFromTypeForNumber;
        if (playStyleFromTypeForNumber == null) {
            playStyleFromType = PlayStyleFromType.UNRECOGNIZED;
        }
        return playStyleFromType;
    }

    public int getPlayStyleFromValue() {
        return this.playStyleFrom_;
    }

    public String getPlayStyleId() {
        return this.playStyleId_;
    }

    public ByteString getPlayStyleIdBytes() {
        return ByteString.copyFromUtf8(this.playStyleId_);
    }

    public PlayStyleSourceType getPlayStyleSourceType() {
        PlayStyleSourceType playStyleSourceTypeForNumber = PlayStyleSourceType.forNumber(this.playStyleSourceType_);
        PlayStyleSourceType playStyleSourceType = playStyleSourceTypeForNumber;
        if (playStyleSourceTypeForNumber == null) {
            playStyleSourceType = PlayStyleSourceType.UNRECOGNIZED;
        }
        return playStyleSourceType;
    }

    public int getPlayStyleSourceTypeValue() {
        return this.playStyleSourceType_;
    }

    public boolean getRecycle() {
        return this.recycle_;
    }

    public int getRowInTrack() {
        return this.rowInTrack_;
    }

    public LocalPath getSourcePath() {
        LocalPath localPath = this.sourcePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public double getSpeed() {
        return this.speed_;
    }

    public long getTrimIn() {
        return this.trimIn_;
    }

    public long getTrimOut() {
        return this.trimOut_;
    }

    public String getVirtualIdolInfo() {
        return this.virtualIdolInfo_;
    }

    public ByteString getVirtualIdolInfoBytes() {
        return ByteString.copyFromUtf8(this.virtualIdolInfo_);
    }

    public float getVolumeBeforeAudioSeparate() {
        return this.volumeBeforeAudioSeparate_;
    }

    public String getVsNote() {
        return this.vsNote_;
    }

    public ByteString getVsNoteBytes() {
        return ByteString.copyFromUtf8(this.vsNote_);
    }

    public boolean hasAvatarRect() {
        return this.avatarRect_ != null;
    }

    public boolean hasBackOriginalClipFilePath() {
        return this.backOriginalClipFilePath_ != null;
    }

    public boolean hasBackgroundColor() {
        return this.backgroundColor_ != null;
    }

    public boolean hasCompoundAnim() {
        return this.compoundAnim_ != null;
    }

    public boolean hasInAnim() {
        return this.inAnim_ != null;
    }

    public boolean hasMaterialId() {
        return this.materialId_ != null;
    }

    public boolean hasOriginalFilePath() {
        return this.originalFilePath_ != null;
    }

    public boolean hasOutAnim() {
        return this.outAnim_ != null;
    }

    public boolean hasPixelImageMattingFilter() {
        return this.pixelImageMattingFilter_ != null;
    }

    public boolean hasSourcePath() {
        return this.sourcePath_ != null;
    }
}
