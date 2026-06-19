package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Point;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipPixelImageMattingFilter.class */
public final class VideoClipPixelImageMattingFilter extends GeneratedMessageLite<VideoClipPixelImageMattingFilter, b> implements MessageLiteOrBuilder {
    public static final int BLURRADIUS_FIELD_NUMBER = 5;
    private static final VideoClipPixelImageMattingFilter DEFAULT_INSTANCE;
    private static volatile Parser<VideoClipPixelImageMattingFilter> PARSER;
    public static final int POSITIONCOLOR_FIELD_NUMBER = 1;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int SOFTNESS_FIELD_NUMBER = 4;
    public static final int TOLERANCE_FIELD_NUMBER = 2;
    private float blurRadius_;
    private PositionColor positionColor_;
    private Point position_;
    private float softness_;
    private float tolerance_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipPixelImageMattingFilter$PositionColor.class */
    public static final class PositionColor extends GeneratedMessageLite<PositionColor, a> implements MessageLiteOrBuilder {
        public static final int BLUE_FIELD_NUMBER = 3;
        private static final PositionColor DEFAULT_INSTANCE;
        public static final int GREEN_FIELD_NUMBER = 2;
        private static volatile Parser<PositionColor> PARSER;
        public static final int RED_FIELD_NUMBER = 1;
        private float blue_;
        private float green_;
        private float red_;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipPixelImageMattingFilter$PositionColor$a.class */
        public static final class a extends GeneratedMessageLite.Builder<PositionColor, a> implements MessageLiteOrBuilder {
            public a() {
                super(PositionColor.DEFAULT_INSTANCE);
            }
        }

        static {
            PositionColor positionColor = new PositionColor();
            DEFAULT_INSTANCE = positionColor;
            GeneratedMessageLite.registerDefaultInstance(PositionColor.class, positionColor);
        }

        private PositionColor() {
        }

        private void clearBlue() {
            this.blue_ = 0.0f;
        }

        private void clearGreen() {
            this.green_ = 0.0f;
        }

        private void clearRed() {
            this.red_ = 0.0f;
        }

        public static PositionColor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(PositionColor positionColor) {
            return (a) DEFAULT_INSTANCE.createBuilder(positionColor);
        }

        public static PositionColor parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PositionColor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PositionColor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PositionColor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PositionColor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PositionColor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PositionColor parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PositionColor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static PositionColor parseFrom(InputStream inputStream) throws IOException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PositionColor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PositionColor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PositionColor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PositionColor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PositionColor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PositionColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<PositionColor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBlue(float f7) {
            this.blue_ = f7;
        }

        private void setGreen(float f7) {
            this.green_ = f7;
        }

        private void setRed(float f7) {
            this.red_ = f7;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f108905a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PositionColor();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001", new Object[]{"red_", "green_", "blue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PositionColor.class) {
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

        public float getBlue() {
            return this.blue_;
        }

        public float getGreen() {
            return this.green_;
        }

        public float getRed() {
            return this.red_;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipPixelImageMattingFilter$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108905a;

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
                com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.f108905a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.VideoClipPixelImageMattingFilter.a.m10387clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipPixelImageMattingFilter$b.class */
    public static final class b extends GeneratedMessageLite.Builder<VideoClipPixelImageMattingFilter, b> implements MessageLiteOrBuilder {
        public b() {
            super(VideoClipPixelImageMattingFilter.DEFAULT_INSTANCE);
        }
    }

    static {
        VideoClipPixelImageMattingFilter videoClipPixelImageMattingFilter = new VideoClipPixelImageMattingFilter();
        DEFAULT_INSTANCE = videoClipPixelImageMattingFilter;
        GeneratedMessageLite.registerDefaultInstance(VideoClipPixelImageMattingFilter.class, videoClipPixelImageMattingFilter);
    }

    private VideoClipPixelImageMattingFilter() {
    }

    private void clearBlurRadius() {
        this.blurRadius_ = 0.0f;
    }

    private void clearPosition() {
        this.position_ = null;
    }

    private void clearPositionColor() {
        this.positionColor_ = null;
    }

    private void clearSoftness() {
        this.softness_ = 0.0f;
    }

    private void clearTolerance() {
        this.tolerance_ = 0.0f;
    }

    public static VideoClipPixelImageMattingFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergePosition(Point point) {
        point.getClass();
        Point point2 = this.position_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.position_ = point;
        } else {
            this.position_ = (Point) ((Point.b) Point.newBuilder(this.position_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergePositionColor(PositionColor positionColor) {
        positionColor.getClass();
        PositionColor positionColor2 = this.positionColor_;
        if (positionColor2 == null || positionColor2 == PositionColor.getDefaultInstance()) {
            this.positionColor_ = positionColor;
        } else {
            this.positionColor_ = (PositionColor) ((PositionColor.a) PositionColor.newBuilder(this.positionColor_).mergeFrom(positionColor)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(VideoClipPixelImageMattingFilter videoClipPixelImageMattingFilter) {
        return (b) DEFAULT_INSTANCE.createBuilder(videoClipPixelImageMattingFilter);
    }

    public static VideoClipPixelImageMattingFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClipPixelImageMattingFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(InputStream inputStream) throws IOException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoClipPixelImageMattingFilter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipPixelImageMattingFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<VideoClipPixelImageMattingFilter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBlurRadius(float f7) {
        this.blurRadius_ = f7;
    }

    private void setPosition(Point point) {
        point.getClass();
        this.position_ = point;
    }

    private void setPositionColor(PositionColor positionColor) {
        positionColor.getClass();
        this.positionColor_ = positionColor;
    }

    private void setSoftness(float f7) {
        this.softness_ = f7;
    }

    private void setTolerance(float f7) {
        this.tolerance_ = f7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108905a[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoClipPixelImageMattingFilter();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\u0001\u0003\t\u0004\u0001\u0005\u0001", new Object[]{"positionColor_", "tolerance_", "position_", "softness_", "blurRadius_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (VideoClipPixelImageMattingFilter.class) {
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

    public float getBlurRadius() {
        return this.blurRadius_;
    }

    public Point getPosition() {
        Point point = this.position_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public PositionColor getPositionColor() {
        PositionColor positionColor = this.positionColor_;
        PositionColor defaultInstance = positionColor;
        if (positionColor == null) {
            defaultInstance = PositionColor.getDefaultInstance();
        }
        return defaultInstance;
    }

    public float getSoftness() {
        return this.softness_;
    }

    public float getTolerance() {
        return this.tolerance_;
    }

    public boolean hasPosition() {
        return this.position_ != null;
    }

    public boolean hasPositionColor() {
        return this.positionColor_ != null;
    }
}
