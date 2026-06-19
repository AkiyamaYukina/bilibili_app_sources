package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.LocalPath;
import com.bilibili.studio.videoeditor.Point;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CompoundCaptionFx.class */
public final class CompoundCaptionFx extends GeneratedMessageLite<CompoundCaptionFx, b> implements n {
    public static final int ANCHORPOINT_FIELD_NUMBER = 22;
    public static final int CANREPLACE_FIELD_NUMBER = 23;
    private static final CompoundCaptionFx DEFAULT_INSTANCE;
    public static final int FONTFILEPATH_FIELD_NUMBER = 21;
    public static final int FONTID_FIELD_NUMBER = 24;
    public static final int IDSTRING_FIELD_NUMBER = 1;
    public static final int INPOINT_FIELD_NUMBER = 2;
    public static final int KEYFRAME_FIELD_NUMBER = 15;
    public static final int LASTUGCTEMPLATETTSID_FIELD_NUMBER = 25;
    public static final int LICENSEPATH_FIELD_NUMBER = 7;
    public static final int MATERIALTYPE_FIELD_NUMBER = 26;
    public static final int OPACITY_FIELD_NUMBER = 11;
    public static final int OUTPOINT_FIELD_NUMBER = 3;
    public static final int PACKAGEPATH_FIELD_NUMBER = 6;
    private static volatile Parser<CompoundCaptionFx> PARSER;
    public static final int RECYCLE_FIELD_NUMBER = 27;
    public static final int ROTATION_FIELD_NUMBER = 10;
    public static final int ROWINTRACK_FIELD_NUMBER = 4;
    public static final int SCALE_FIELD_NUMBER = 12;
    public static final int TEMPLATEFXFROM_FIELD_NUMBER = 28;
    public static final int TEMPLATEID_FIELD_NUMBER = 5;
    public static final int TEXTCANREPLACE_FIELD_NUMBER = 19;
    public static final int TEXTCOLOR_FIELD_NUMBER = 20;
    public static final int TEXT_FIELD_NUMBER = 18;
    public static final int TRACEKEYFRAME_FIELD_NUMBER = 14;
    public static final int TRANSX_FIELD_NUMBER = 8;
    public static final int TRANSY_FIELD_NUMBER = 9;
    public static final int TTSAUDIOIDS_FIELD_NUMBER = 16;
    public static final int TTSSELECTED_FIELD_NUMBER = 17;
    public static final int ZVALUE_FIELD_NUMBER = 13;
    private Point anchorPoint_;
    private boolean canReplace_;
    private long inPoint_;
    private LocalPath licensePath_;
    private int materialType_;
    private float opacity_;
    private long outPoint_;
    private LocalPath packagePath_;
    private boolean recycle_;
    private float rotation_;
    private int rowInTrack_;
    private float scale_;
    private int templateFxFrom_;
    private LocalPath templateId_;
    private float transX_;
    private float transY_;
    private boolean ttsSelected_;
    private float zValue_;
    private int textCanReplaceMemoizedSerializedSize = -1;
    private String idString_ = "";
    private Internal.ProtobufList<KeyFrame> traceKeyFrame_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<KeyFrame> keyFrame_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> ttsAudioIds_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> text_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.BooleanList textCanReplace_ = GeneratedMessageLite.emptyBooleanList();
    private Internal.ProtobufList<Color> textColor_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> fontFilePath_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<LocalPath> fontId_ = GeneratedMessageLite.emptyProtobufList();
    private String lastUgcTemplateTtsId_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CompoundCaptionFx$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108851a;

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
                com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.CompoundCaptionFx.a.f108851a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.CompoundCaptionFx.a.m10287clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CompoundCaptionFx$b.class */
    public static final class b extends GeneratedMessageLite.Builder<CompoundCaptionFx, b> implements n {
        public b() {
            super(CompoundCaptionFx.DEFAULT_INSTANCE);
        }
    }

    static {
        CompoundCaptionFx compoundCaptionFx = new CompoundCaptionFx();
        DEFAULT_INSTANCE = compoundCaptionFx;
        GeneratedMessageLite.registerDefaultInstance(CompoundCaptionFx.class, compoundCaptionFx);
    }

    private CompoundCaptionFx() {
    }

    private void addAllFontFilePath(Iterable<String> iterable) {
        ensureFontFilePathIsMutable();
        AbstractMessageLite.addAll(iterable, this.fontFilePath_);
    }

    private void addAllFontId(Iterable<? extends LocalPath> iterable) {
        ensureFontIdIsMutable();
        AbstractMessageLite.addAll(iterable, this.fontId_);
    }

    private void addAllKeyFrame(Iterable<? extends KeyFrame> iterable) {
        ensureKeyFrameIsMutable();
        AbstractMessageLite.addAll(iterable, this.keyFrame_);
    }

    private void addAllText(Iterable<String> iterable) {
        ensureTextIsMutable();
        AbstractMessageLite.addAll(iterable, this.text_);
    }

    private void addAllTextCanReplace(Iterable<? extends Boolean> iterable) {
        ensureTextCanReplaceIsMutable();
        AbstractMessageLite.addAll(iterable, this.textCanReplace_);
    }

    private void addAllTextColor(Iterable<? extends Color> iterable) {
        ensureTextColorIsMutable();
        AbstractMessageLite.addAll(iterable, this.textColor_);
    }

    private void addAllTraceKeyFrame(Iterable<? extends KeyFrame> iterable) {
        ensureTraceKeyFrameIsMutable();
        AbstractMessageLite.addAll(iterable, this.traceKeyFrame_);
    }

    private void addAllTtsAudioIds(Iterable<String> iterable) {
        ensureTtsAudioIdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.ttsAudioIds_);
    }

    private void addFontFilePath(String str) {
        str.getClass();
        ensureFontFilePathIsMutable();
        this.fontFilePath_.add(str);
    }

    private void addFontFilePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureFontFilePathIsMutable();
        this.fontFilePath_.add(byteString.toStringUtf8());
    }

    private void addFontId(int i7, LocalPath localPath) {
        localPath.getClass();
        ensureFontIdIsMutable();
        this.fontId_.add(i7, localPath);
    }

    private void addFontId(LocalPath localPath) {
        localPath.getClass();
        ensureFontIdIsMutable();
        this.fontId_.add(localPath);
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

    private void addText(String str) {
        str.getClass();
        ensureTextIsMutable();
        this.text_.add(str);
    }

    private void addTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTextIsMutable();
        this.text_.add(byteString.toStringUtf8());
    }

    private void addTextCanReplace(boolean z6) {
        ensureTextCanReplaceIsMutable();
        this.textCanReplace_.addBoolean(z6);
    }

    private void addTextColor(int i7, Color color) {
        color.getClass();
        ensureTextColorIsMutable();
        this.textColor_.add(i7, color);
    }

    private void addTextColor(Color color) {
        color.getClass();
        ensureTextColorIsMutable();
        this.textColor_.add(color);
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

    private void clearCanReplace() {
        this.canReplace_ = false;
    }

    private void clearFontFilePath() {
        this.fontFilePath_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearFontId() {
        this.fontId_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearIdString() {
        this.idString_ = getDefaultInstance().getIdString();
    }

    private void clearInPoint() {
        this.inPoint_ = 0L;
    }

    private void clearKeyFrame() {
        this.keyFrame_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearLastUgcTemplateTtsId() {
        this.lastUgcTemplateTtsId_ = getDefaultInstance().getLastUgcTemplateTtsId();
    }

    private void clearLicensePath() {
        this.licensePath_ = null;
    }

    private void clearMaterialType() {
        this.materialType_ = 0;
    }

    private void clearOpacity() {
        this.opacity_ = 0.0f;
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

    private void clearRotation() {
        this.rotation_ = 0.0f;
    }

    private void clearRowInTrack() {
        this.rowInTrack_ = 0;
    }

    private void clearScale() {
        this.scale_ = 0.0f;
    }

    private void clearTemplateFxFrom() {
        this.templateFxFrom_ = 0;
    }

    private void clearTemplateId() {
        this.templateId_ = null;
    }

    private void clearText() {
        this.text_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearTextCanReplace() {
        this.textCanReplace_ = GeneratedMessageLite.emptyBooleanList();
    }

    private void clearTextColor() {
        this.textColor_ = GeneratedMessageLite.emptyProtobufList();
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

    private void clearTtsSelected() {
        this.ttsSelected_ = false;
    }

    private void clearZValue() {
        this.zValue_ = 0.0f;
    }

    private void ensureFontFilePathIsMutable() {
        Internal.ProtobufList<String> protobufList = this.fontFilePath_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fontFilePath_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureFontIdIsMutable() {
        Internal.ProtobufList<LocalPath> protobufList = this.fontId_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fontId_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureKeyFrameIsMutable() {
        Internal.ProtobufList<KeyFrame> protobufList = this.keyFrame_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keyFrame_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTextCanReplaceIsMutable() {
        Internal.BooleanList booleanList = this.textCanReplace_;
        if (booleanList.isModifiable()) {
            return;
        }
        this.textCanReplace_ = GeneratedMessageLite.mutableCopy(booleanList);
    }

    private void ensureTextColorIsMutable() {
        Internal.ProtobufList<Color> protobufList = this.textColor_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.textColor_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTextIsMutable() {
        Internal.ProtobufList<String> protobufList = this.text_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.text_ = GeneratedMessageLite.mutableCopy(protobufList);
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

    public static CompoundCaptionFx getDefaultInstance() {
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

    private void mergeLicensePath(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.licensePath_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.licensePath_ = localPath;
        } else {
            this.licensePath_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.licensePath_).mergeFrom(localPath)).buildPartial();
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

    private void mergeTemplateId(LocalPath localPath) {
        localPath.getClass();
        LocalPath localPath2 = this.templateId_;
        if (localPath2 == null || localPath2 == LocalPath.getDefaultInstance()) {
            this.templateId_ = localPath;
        } else {
            this.templateId_ = (LocalPath) ((LocalPath.b) LocalPath.newBuilder(this.templateId_).mergeFrom(localPath)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(CompoundCaptionFx compoundCaptionFx) {
        return (b) DEFAULT_INSTANCE.createBuilder(compoundCaptionFx);
    }

    public static CompoundCaptionFx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CompoundCaptionFx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CompoundCaptionFx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CompoundCaptionFx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CompoundCaptionFx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CompoundCaptionFx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CompoundCaptionFx parseFrom(InputStream inputStream) throws IOException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CompoundCaptionFx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CompoundCaptionFx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CompoundCaptionFx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CompoundCaptionFx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CompoundCaptionFx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CompoundCaptionFx) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<CompoundCaptionFx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFontId(int i7) {
        ensureFontIdIsMutable();
        this.fontId_.remove(i7);
    }

    private void removeKeyFrame(int i7) {
        ensureKeyFrameIsMutable();
        this.keyFrame_.remove(i7);
    }

    private void removeTextColor(int i7) {
        ensureTextColorIsMutable();
        this.textColor_.remove(i7);
    }

    private void removeTraceKeyFrame(int i7) {
        ensureTraceKeyFrameIsMutable();
        this.traceKeyFrame_.remove(i7);
    }

    private void setAnchorPoint(Point point) {
        point.getClass();
        this.anchorPoint_ = point;
    }

    private void setCanReplace(boolean z6) {
        this.canReplace_ = z6;
    }

    private void setFontFilePath(int i7, String str) {
        str.getClass();
        ensureFontFilePathIsMutable();
        this.fontFilePath_.set(i7, str);
    }

    private void setFontId(int i7, LocalPath localPath) {
        localPath.getClass();
        ensureFontIdIsMutable();
        this.fontId_.set(i7, localPath);
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

    private void setKeyFrame(int i7, KeyFrame keyFrame) {
        keyFrame.getClass();
        ensureKeyFrameIsMutable();
        this.keyFrame_.set(i7, keyFrame);
    }

    private void setLastUgcTemplateTtsId(String str) {
        str.getClass();
        this.lastUgcTemplateTtsId_ = str;
    }

    private void setLastUgcTemplateTtsIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastUgcTemplateTtsId_ = byteString.toStringUtf8();
    }

    private void setLicensePath(LocalPath localPath) {
        localPath.getClass();
        this.licensePath_ = localPath;
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

    private void setRotation(float f7) {
        this.rotation_ = f7;
    }

    private void setRowInTrack(int i7) {
        this.rowInTrack_ = i7;
    }

    private void setScale(float f7) {
        this.scale_ = f7;
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

    private void setText(int i7, String str) {
        str.getClass();
        ensureTextIsMutable();
        this.text_.set(i7, str);
    }

    private void setTextCanReplace(int i7, boolean z6) {
        ensureTextCanReplaceIsMutable();
        this.textCanReplace_.setBoolean(i7, z6);
    }

    private void setTextColor(int i7, Color color) {
        color.getClass();
        ensureTextColorIsMutable();
        this.textColor_.set(i7, color);
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

    private void setTtsSelected(boolean z6) {
        this.ttsSelected_ = z6;
    }

    private void setZValue(float f7) {
        this.zValue_ = f7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108851a[methodToInvoke.ordinal()]) {
            case 1:
                return new CompoundCaptionFx();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001\u001c\u001c\u0000\b\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0004\u0005\t\u0006\t\u0007\t\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u001b\u000f\u001b\u0010Ț\u0011\u0007\u0012Ț\u0013*\u0014\u001b\u0015Ț\u0016\t\u0017\u0007\u0018\u001b\u0019Ȉ\u001a\f\u001b\u0007\u001c\f", new Object[]{"idString_", "inPoint_", "outPoint_", "rowInTrack_", "templateId_", "packagePath_", "licensePath_", "transX_", "transY_", "rotation_", "opacity_", "scale_", "zValue_", "traceKeyFrame_", KeyFrame.class, "keyFrame_", KeyFrame.class, "ttsAudioIds_", "ttsSelected_", "text_", "textCanReplace_", "textColor_", Color.class, "fontFilePath_", "anchorPoint_", "canReplace_", "fontId_", LocalPath.class, "lastUgcTemplateTtsId_", "materialType_", "recycle_", "templateFxFrom_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CompoundCaptionFx.class) {
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

    public boolean getCanReplace() {
        return this.canReplace_;
    }

    public String getFontFilePath(int i7) {
        return (String) this.fontFilePath_.get(i7);
    }

    public ByteString getFontFilePathBytes(int i7) {
        return ByteString.copyFromUtf8((String) this.fontFilePath_.get(i7));
    }

    public int getFontFilePathCount() {
        return this.fontFilePath_.size();
    }

    public List<String> getFontFilePathList() {
        return this.fontFilePath_;
    }

    public LocalPath getFontId(int i7) {
        return (LocalPath) this.fontId_.get(i7);
    }

    public int getFontIdCount() {
        return this.fontId_.size();
    }

    public List<LocalPath> getFontIdList() {
        return this.fontId_;
    }

    public r getFontIdOrBuilder(int i7) {
        return (r) this.fontId_.get(i7);
    }

    public List<? extends r> getFontIdOrBuilderList() {
        return this.fontId_;
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

    public String getLastUgcTemplateTtsId() {
        return this.lastUgcTemplateTtsId_;
    }

    public ByteString getLastUgcTemplateTtsIdBytes() {
        return ByteString.copyFromUtf8(this.lastUgcTemplateTtsId_);
    }

    public LocalPath getLicensePath() {
        LocalPath localPath = this.licensePath_;
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

    public float getRotation() {
        return this.rotation_;
    }

    public int getRowInTrack() {
        return this.rowInTrack_;
    }

    public float getScale() {
        return this.scale_;
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

    public String getText(int i7) {
        return (String) this.text_.get(i7);
    }

    public ByteString getTextBytes(int i7) {
        return ByteString.copyFromUtf8((String) this.text_.get(i7));
    }

    public boolean getTextCanReplace(int i7) {
        return this.textCanReplace_.getBoolean(i7);
    }

    public int getTextCanReplaceCount() {
        return this.textCanReplace_.size();
    }

    public List<Boolean> getTextCanReplaceList() {
        return this.textCanReplace_;
    }

    public Color getTextColor(int i7) {
        return (Color) this.textColor_.get(i7);
    }

    public int getTextColorCount() {
        return this.textColor_.size();
    }

    public List<Color> getTextColorList() {
        return this.textColor_;
    }

    public m getTextColorOrBuilder(int i7) {
        return (m) this.textColor_.get(i7);
    }

    public List<? extends m> getTextColorOrBuilderList() {
        return this.textColor_;
    }

    public int getTextCount() {
        return this.text_.size();
    }

    public List<String> getTextList() {
        return this.text_;
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

    public boolean getTtsSelected() {
        return this.ttsSelected_;
    }

    public float getZValue() {
        return this.zValue_;
    }

    public boolean hasAnchorPoint() {
        return this.anchorPoint_ != null;
    }

    public boolean hasLicensePath() {
        return this.licensePath_ != null;
    }

    public boolean hasPackagePath() {
        return this.packagePath_ != null;
    }

    public boolean hasTemplateId() {
        return this.templateId_ != null;
    }
}
