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
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx.class */
public final class StickerFx extends GeneratedMessageLite<StickerFx, b> implements x {
    public static final int BINDCAPTIONID_FIELD_NUMBER = 27;
    public static final int CANREPLACE_FIELD_NUMBER = 31;
    public static final int CATID_FIELD_NUMBER = 11;
    public static final int CLIPID_FIELD_NUMBER = 5;
    public static final int COVER_FIELD_NUMBER = 8;
    public static final int CUTOUTCATEGORY_FIELD_NUMBER = 29;
    public static final int CUTOUT_FIELD_NUMBER = 28;
    public static final int DANMUTYPE_FIELD_NUMBER = 23;
    private static final StickerFx DEFAULT_INSTANCE;
    public static final int DOWNLOADURL_FIELD_NUMBER = 13;
    public static final int GIFPATH_FIELD_NUMBER = 32;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int IMAGEPATH_FIELD_NUMBER = 24;
    public static final int INPOINT_FIELD_NUMBER = 2;
    public static final int ISDANMU_FIELD_NUMBER = 22;
    public static final int ISFAV_FIELD_NUMBER = 9;
    public static final int KEYFRAME_FIELD_NUMBER = 21;
    public static final int LICENSEPATH_FIELD_NUMBER = 26;
    public static final int MATERIALID_FIELD_NUMBER = 12;
    public static final int MATERIALTYPE_FIELD_NUMBER = 33;
    public static final int NAME_FIELD_NUMBER = 6;
    public static final int OPACITY_FIELD_NUMBER = 17;
    public static final int OUTPOINT_FIELD_NUMBER = 3;
    public static final int PACKAGEPATH_FIELD_NUMBER = 25;
    private static volatile Parser<StickerFx> PARSER;
    public static final int RANK_FIELD_NUMBER = 10;
    public static final int RECYCLE_FIELD_NUMBER = 34;
    public static final int ROTATION_FIELD_NUMBER = 16;
    public static final int ROWINTRACK_FIELD_NUMBER = 4;
    public static final int SCALE_FIELD_NUMBER = 18;
    public static final int STICKERTYPE_FIELD_NUMBER = 7;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 35;
    public static final int THIRDPARTY_FIELD_NUMBER = 30;
    public static final int TRACEKEYFRAME_FIELD_NUMBER = 20;
    public static final int TRANSX_FIELD_NUMBER = 14;
    public static final int TRANSY_FIELD_NUMBER = 15;
    public static final int ZVALUE_FIELD_NUMBER = 19;
    private long bindCaptionId_;
    private boolean canReplace_;
    private int catId_;
    private LocalPath cover_;
    private int cutoutCategory_;
    private boolean cutout_;
    private int danmuType_;
    private LocalPath gifPath_;
    private LocalPath imagePath_;
    private long inPoint_;
    private boolean isDanmu_;
    private boolean isFav_;
    private LocalPath materialId_;
    private int materialType_;
    private float opacity_;
    private long outPoint_;
    private int rank_;
    private boolean recycle_;
    private float rotation_;
    private int rowInTrack_;
    private float scale_;
    private int stickerType_;
    private int templateFxFrom_;
    private boolean thirdParty_;
    private float transX_;
    private float transY_;
    private float zValue_;
    private String idString_ = "";
    private String clipId_ = "";
    private String name_ = "";
    private String downloadUrl_ = "";
    private Internal.ProtobufList<KeyFrame> traceKeyFrame_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<KeyFrame> keyFrame_ = GeneratedMessageLite.emptyProtobufList();
    private String packagePath_ = "";
    private String licensePath_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$CutoutCategory.class */
    public enum CutoutCategory implements Internal.EnumLite {
        CATEGORY_MAN(0),
        CATEGORY_CAT(1),
        CATEGORY_DOG(2),
        CATEGORY_OTHER(3),
        UNRECOGNIZED(-1);

        public static final int CATEGORY_CAT_VALUE = 1;
        public static final int CATEGORY_DOG_VALUE = 2;
        public static final int CATEGORY_MAN_VALUE = 0;
        public static final int CATEGORY_OTHER_VALUE = 3;
        private static final Internal.EnumLiteMap<CutoutCategory> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$CutoutCategory$a.class */
        public final class a implements Internal.EnumLiteMap<CutoutCategory> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return CutoutCategory.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$CutoutCategory$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108878a = new Object();

            public final boolean isInRange(int i7) {
                return CutoutCategory.forNumber(i7) != null;
            }
        }

        CutoutCategory(int i7) {
            this.value = i7;
        }

        public static CutoutCategory forNumber(int i7) {
            if (i7 == 0) {
                return CATEGORY_MAN;
            }
            if (i7 == 1) {
                return CATEGORY_CAT;
            }
            if (i7 == 2) {
                return CATEGORY_DOG;
            }
            if (i7 != 3) {
                return null;
            }
            return CATEGORY_OTHER;
        }

        public static Internal.EnumLiteMap<CutoutCategory> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108878a;
        }

        @Deprecated
        public static CutoutCategory valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$DanmuType.class */
    public enum DanmuType implements Internal.EnumLite {
        DANMU_MERGE(0),
        DANMU_TRIPLE_OPERATION(1),
        DANMU_SUBSCRIBE(2),
        UNRECOGNIZED(-1);

        public static final int DANMU_MERGE_VALUE = 0;
        public static final int DANMU_SUBSCRIBE_VALUE = 2;
        public static final int DANMU_TRIPLE_OPERATION_VALUE = 1;
        private static final Internal.EnumLiteMap<DanmuType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$DanmuType$a.class */
        public final class a implements Internal.EnumLiteMap<DanmuType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return DanmuType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$DanmuType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108879a = new Object();

            public final boolean isInRange(int i7) {
                return DanmuType.forNumber(i7) != null;
            }
        }

        DanmuType(int i7) {
            this.value = i7;
        }

        public static DanmuType forNumber(int i7) {
            if (i7 == 0) {
                return DANMU_MERGE;
            }
            if (i7 == 1) {
                return DANMU_TRIPLE_OPERATION;
            }
            if (i7 != 2) {
                return null;
            }
            return DANMU_SUBSCRIBE;
        }

        public static Internal.EnumLiteMap<DanmuType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108879a;
        }

        @Deprecated
        public static DanmuType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$StickerType.class */
    public enum StickerType implements Internal.EnumLite {
        Custom(0),
        Animation(1),
        UNRECOGNIZED(-1);

        public static final int Animation_VALUE = 1;
        public static final int Custom_VALUE = 0;
        private static final Internal.EnumLiteMap<StickerType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$StickerType$a.class */
        public final class a implements Internal.EnumLiteMap<StickerType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return StickerType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$StickerType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108880a = new Object();

            public final boolean isInRange(int i7) {
                return StickerType.forNumber(i7) != null;
            }
        }

        StickerType(int i7) {
            this.value = i7;
        }

        public static StickerType forNumber(int i7) {
            if (i7 == 0) {
                return Custom;
            }
            if (i7 != 1) {
                return null;
            }
            return Animation;
        }

        public static Internal.EnumLiteMap<StickerType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108880a;
        }

        @Deprecated
        public static StickerType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108881a;

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
                com.bilibili.studio.videoeditor.StickerFx.a.f108881a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.StickerFx.a.f108881a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.StickerFx.a.f108881a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.StickerFx.a.f108881a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.StickerFx.a.f108881a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.StickerFx.a.f108881a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.StickerFx.a.f108881a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.StickerFx.a.m10332clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/StickerFx$b.class */
    public static final class b extends GeneratedMessageLite.Builder<StickerFx, b> implements x {
        public b() {
            super(StickerFx.DEFAULT_INSTANCE);
        }
    }

    static {
        StickerFx stickerFx = new StickerFx();
        DEFAULT_INSTANCE = stickerFx;
        GeneratedMessageLite.registerDefaultInstance(StickerFx.class, stickerFx);
    }

    private StickerFx() {
    }

    private void addAllKeyFrame(Iterable<? extends KeyFrame> iterable) {
        ensureKeyFrameIsMutable();
        AbstractMessageLite.addAll(iterable, this.keyFrame_);
    }

    private void addAllTraceKeyFrame(Iterable<? extends KeyFrame> iterable) {
        ensureTraceKeyFrameIsMutable();
        AbstractMessageLite.addAll(iterable, this.traceKeyFrame_);
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

    private void clearBindCaptionId() {
        this.bindCaptionId_ = 0L;
    }

    private void clearCanReplace() {
        this.canReplace_ = false;
    }

    private void clearCatId() {
        this.catId_ = 0;
    }

    private void clearClipId() {
        this.clipId_ = getDefaultInstance().getClipId();
    }

    private void clearCover() {
        this.cover_ = null;
    }

    private void clearCutout() {
        this.cutout_ = false;
    }

    private void clearCutoutCategory() {
        this.cutoutCategory_ = 0;
    }

    private void clearDanmuType() {
        this.danmuType_ = 0;
    }

    private void clearDownloadUrl() {
        this.downloadUrl_ = getDefaultInstance().getDownloadUrl();
    }

    private void clearGifPath() {
        this.gifPath_ = null;
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearImagePath() {
        this.imagePath_ = null;
    }

    private void clearInPoint() {
        this.inPoint_ = 0L;
    }

    private void clearIsDanmu() {
        this.isDanmu_ = false;
    }

    private void clearIsFav() {
        this.isFav_ = false;
    }

    private void clearKeyFrame() {
        this.keyFrame_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLicensePath() {
        this.licensePath_ = getDefaultInstance().getLicensePath();
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

    private void clearOpacity() {
        this.opacity_ = 0.0f;
    }

    private void clearOutPoint() {
        this.outPoint_ = 0L;
    }

    private void clearPackagePath() {
        this.packagePath_ = getDefaultInstance().getPackagePath();
    }

    private void clearRank() {
        this.rank_ = 0;
    }

    private void clearRecycle() {
        this.recycle_ = false;
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

    private void clearStickerType() {
        this.stickerType_ = 0;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void clearThirdParty() {
        this.thirdParty_ = false;
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

    private void ensureTraceKeyFrameIsMutable() {
        Internal.ProtobufList<KeyFrame> protobufList = this.traceKeyFrame_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.traceKeyFrame_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static StickerFx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCover(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.cover_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.cover_ = localPath;
        } else {
            this.cover_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.cover_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeGifPath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.gifPath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.gifPath_ = localPath;
        } else {
            this.gifPath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.gifPath_).mergeFrom(localPath)).buildPartial();
        }
    }

    private void mergeImagePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.imagePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.imagePath_ = localPath;
        } else {
            this.imagePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.imagePath_).mergeFrom(localPath)).buildPartial();
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

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(StickerFx stickerFx) {
        return (b) DEFAULT_INSTANCE.createBuilder(stickerFx);
    }

    public static StickerFx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StickerFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StickerFx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StickerFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StickerFx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StickerFx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StickerFx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StickerFx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static StickerFx parseFrom(InputStream inputStream) throws IOException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StickerFx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StickerFx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static StickerFx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StickerFx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StickerFx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StickerFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<StickerFx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeKeyFrame(int i7) {
        ensureKeyFrameIsMutable();
        this.keyFrame_.remove(i7);
    }

    private void removeTraceKeyFrame(int i7) {
        ensureTraceKeyFrameIsMutable();
        this.traceKeyFrame_.remove(i7);
    }

    private void setBindCaptionId(long j7) {
        this.bindCaptionId_ = j7;
    }

    private void setCanReplace(boolean z6) {
        this.canReplace_ = z6;
    }

    private void setCatId(int i7) {
        this.catId_ = i7;
    }

    private void setClipId(String str) {
        str.getClass();
        this.clipId_ = str;
    }

    private void setClipIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clipId_ = byteString.toStringUtf8();
    }

    private void setCover(LocalPath localPath) {
        localPath.getClass();
        this.cover_ = localPath;
    }

    private void setCutout(boolean z6) {
        this.cutout_ = z6;
    }

    private void setCutoutCategory(CutoutCategory cutoutCategory) {
        this.cutoutCategory_ = cutoutCategory.getNumber();
    }

    private void setCutoutCategoryValue(int i7) {
        this.cutoutCategory_ = i7;
    }

    private void setDanmuType(DanmuType danmuType) {
        this.danmuType_ = danmuType.getNumber();
    }

    private void setDanmuTypeValue(int i7) {
        this.danmuType_ = i7;
    }

    private void setDownloadUrl(String str) {
        str.getClass();
        this.downloadUrl_ = str;
    }

    private void setDownloadUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.downloadUrl_ = byteString.toStringUtf8();
    }

    private void setGifPath(LocalPath localPath) {
        localPath.getClass();
        this.gifPath_ = localPath;
    }

    private void setIdString(String str) {
        str.getClass();
        this.idString_ = str;
    }

    private void setIdStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idString_ = byteString.toStringUtf8();
    }

    private void setImagePath(LocalPath localPath) {
        localPath.getClass();
        this.imagePath_ = localPath;
    }

    private void setInPoint(long j7) {
        this.inPoint_ = j7;
    }

    private void setIsDanmu(boolean z6) {
        this.isDanmu_ = z6;
    }

    private void setIsFav(boolean z6) {
        this.isFav_ = z6;
    }

    private void setKeyFrame(int i7, KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureKeyFrameIsMutable();
        this.keyFrame_.set(i7, keyFrame);
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

    private void setOpacity(float f7) {
        this.opacity_ = f7;
    }

    private void setOutPoint(long j7) {
        this.outPoint_ = j7;
    }

    private void setPackagePath(String str) {
        str.getClass();
        this.packagePath_ = str;
    }

    private void setPackagePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packagePath_ = byteString.toStringUtf8();
    }

    private void setRank(int i7) {
        this.rank_ = i7;
    }

    private void setRecycle(boolean z6) {
        this.recycle_ = z6;
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

    private void setStickerType(StickerType stickerType) {
        this.stickerType_ = stickerType.getNumber();
    }

    private void setStickerTypeValue(int i7) {
        this.stickerType_ = i7;
    }

    private void setTemplateFxFrom(TemplateFxFrom templateFxFrom) {
        this.templateFxFrom_ = templateFxFrom.getNumber();
    }

    private void setTemplateFxFromValue(int i7) {
        this.templateFxFrom_ = i7;
    }

    private void setThirdParty(boolean z6) {
        this.thirdParty_ = z6;
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

    private void setZValue(float f7) {
        this.zValue_ = f7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108881a[methodToInvoke.ordinal()]) {
            case 1:
                return new StickerFx();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000#\u0000\u0000\u0001##\u0000\u0002\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\f\b\t\t\u0007\n\u0004\u000b\u0004\f\t\rȈ\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u001b\u0015\u001b\u0016\u0007\u0017\f\u0018\t\u0019Ȉ\u001aȈ\u001b\u0002\u001c\u0007\u001d\f\u001e\u0007\u001f\u0007 \t!\f\"\u0007#\f", new Object[]{"idString_", "inPoint_", "outPoint_", "rowInTrack_", "clipId_", "name_", "stickerType_", "cover_", "isFav_", "rank_", "catId_", "materialId_", "downloadUrl_", "transX_", "transY_", "rotation_", "opacity_", "scale_", "zValue_", "traceKeyFrame_", KeyFrame.class, "keyFrame_", KeyFrame.class, "isDanmu_", "danmuType_", "imagePath_", "packagePath_", "licensePath_", "bindCaptionId_", "cutout_", "cutoutCategory_", "thirdParty_", "canReplace_", "gifPath_", "materialType_", "recycle_", "templateFxFrom_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (StickerFx.class) {
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

    public long getBindCaptionId() {
        return this.bindCaptionId_;
    }

    public boolean getCanReplace() {
        return this.canReplace_;
    }

    public int getCatId() {
        return this.catId_;
    }

    public String getClipId() {
        return this.clipId_;
    }

    public ByteString getClipIdBytes() {
        return ByteString.copyFromUtf8(this.clipId_);
    }

    public LocalPath getCover() {
        LocalPath localPath = this.cover_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public boolean getCutout() {
        return this.cutout_;
    }

    public CutoutCategory getCutoutCategory() {
        CutoutCategory cutoutCategoryForNumber = CutoutCategory.forNumber(this.cutoutCategory_);
        CutoutCategory cutoutCategory = cutoutCategoryForNumber;
        if (cutoutCategoryForNumber == null) {
            cutoutCategory = CutoutCategory.UNRECOGNIZED;
        }
        return cutoutCategory;
    }

    public int getCutoutCategoryValue() {
        return this.cutoutCategory_;
    }

    public DanmuType getDanmuType() {
        DanmuType danmuTypeForNumber = DanmuType.forNumber(this.danmuType_);
        DanmuType danmuType = danmuTypeForNumber;
        if (danmuTypeForNumber == null) {
            danmuType = DanmuType.UNRECOGNIZED;
        }
        return danmuType;
    }

    public int getDanmuTypeValue() {
        return this.danmuType_;
    }

    public String getDownloadUrl() {
        return this.downloadUrl_;
    }

    public ByteString getDownloadUrlBytes() {
        return ByteString.copyFromUtf8(this.downloadUrl_);
    }

    public LocalPath getGifPath() {
        LocalPath localPath = this.gifPath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public String getIdString() {
        return this.idString_;
    }

    public ByteString getIdStringBytes() {
        return ByteString.copyFromUtf8(this.idString_);
    }

    public LocalPath getImagePath() {
        LocalPath localPath = this.imagePath_;
        LocalPath defaultInstance = localPath;
        if (localPath == null) {
            defaultInstance = LocalPath.getDefaultInstance();
        }
        return defaultInstance;
    }

    public long getInPoint() {
        return this.inPoint_;
    }

    public boolean getIsDanmu() {
        return this.isDanmu_;
    }

    public boolean getIsFav() {
        return this.isFav_;
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

    public float getOpacity() {
        return this.opacity_;
    }

    public long getOutPoint() {
        return this.outPoint_;
    }

    public String getPackagePath() {
        return this.packagePath_;
    }

    public ByteString getPackagePathBytes() {
        return ByteString.copyFromUtf8(this.packagePath_);
    }

    public int getRank() {
        return this.rank_;
    }

    public boolean getRecycle() {
        return this.recycle_;
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

    public StickerType getStickerType() {
        StickerType stickerTypeForNumber = StickerType.forNumber(this.stickerType_);
        StickerType stickerType = stickerTypeForNumber;
        if (stickerTypeForNumber == null) {
            stickerType = StickerType.UNRECOGNIZED;
        }
        return stickerType;
    }

    public int getStickerTypeValue() {
        return this.stickerType_;
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

    public boolean getThirdParty() {
        return this.thirdParty_;
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

    public float getZValue() {
        return this.zValue_;
    }

    public boolean hasCover() {
        return this.cover_ != null;
    }

    public boolean hasGifPath() {
        return this.gifPath_ != null;
    }

    public boolean hasImagePath() {
        return this.imagePath_ != null;
    }

    public boolean hasMaterialId() {
        return this.materialId_ != null;
    }
}
