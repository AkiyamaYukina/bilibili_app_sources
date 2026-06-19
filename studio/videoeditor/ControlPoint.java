package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Point;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ControlPoint.class */
public final class ControlPoint extends GeneratedMessageLite<ControlPoint, b> implements MessageLiteOrBuilder {
    public static final int BACKWARDCONTROLPOINT_FIELD_NUMBER = 1;
    public static final int BACKWARDTYPE_FIELD_NUMBER = 5;
    public static final int CUSTOMUIBACKWARDCONTROLPOINT_FIELD_NUMBER = 4;
    public static final int CUSTOMUIFORWARDCONTROLPOINT_FIELD_NUMBER = 3;
    private static final ControlPoint DEFAULT_INSTANCE;
    public static final int FORWARDCONTROLPOINT_FIELD_NUMBER = 2;
    public static final int FORWARDTYPE_FIELD_NUMBER = 6;
    private static volatile Parser<ControlPoint> PARSER;
    private Point backwardControlPoint_;
    private int backwardType_;
    private Point customUIBackwardControlPoint_;
    private Point customUIForwardControlPoint_;
    private Point forwardControlPoint_;
    private int forwardType_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ControlPoint$BezierType.class */
    public enum BezierType implements Internal.EnumLite {
        NORAL(0),
        CUSTOM(1),
        EASEIN(2),
        EASEOUT(3),
        EASEINOUT(4),
        FLASHINOUT(5),
        EASING(6),
        EASEIN2(7),
        UNRECOGNIZED(-1);

        public static final int CUSTOM_VALUE = 1;
        public static final int EASEIN2_VALUE = 7;
        public static final int EASEINOUT_VALUE = 4;
        public static final int EASEIN_VALUE = 2;
        public static final int EASEOUT_VALUE = 3;
        public static final int EASING_VALUE = 6;
        public static final int FLASHINOUT_VALUE = 5;
        public static final int NORAL_VALUE = 0;
        private static final Internal.EnumLiteMap<BezierType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ControlPoint$BezierType$a.class */
        public final class a implements Internal.EnumLiteMap<BezierType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return BezierType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ControlPoint$BezierType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108853a = new Object();

            public final boolean isInRange(int i7) {
                return BezierType.forNumber(i7) != null;
            }
        }

        BezierType(int i7) {
            this.value = i7;
        }

        public static BezierType forNumber(int i7) {
            switch (i7) {
                case 0:
                    return NORAL;
                case 1:
                    return CUSTOM;
                case 2:
                    return EASEIN;
                case 3:
                    return EASEOUT;
                case 4:
                    return EASEINOUT;
                case 5:
                    return FLASHINOUT;
                case 6:
                    return EASING;
                case 7:
                    return EASEIN2;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<BezierType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108853a;
        }

        @Deprecated
        public static BezierType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ControlPoint$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108854a;

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
                com.bilibili.studio.videoeditor.ControlPoint.a.f108854a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.ControlPoint.a.f108854a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.ControlPoint.a.f108854a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.ControlPoint.a.f108854a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.ControlPoint.a.f108854a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.ControlPoint.a.f108854a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.ControlPoint.a.f108854a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.ControlPoint.a.m10293clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ControlPoint$b.class */
    public static final class b extends GeneratedMessageLite.Builder<ControlPoint, b> implements MessageLiteOrBuilder {
        public b() {
            super(ControlPoint.DEFAULT_INSTANCE);
        }
    }

    static {
        ControlPoint controlPoint = new ControlPoint();
        DEFAULT_INSTANCE = controlPoint;
        GeneratedMessageLite.registerDefaultInstance(ControlPoint.class, controlPoint);
    }

    private ControlPoint() {
    }

    private void clearBackwardControlPoint() {
        this.backwardControlPoint_ = null;
    }

    private void clearBackwardType() {
        this.backwardType_ = 0;
    }

    private void clearCustomUIBackwardControlPoint() {
        this.customUIBackwardControlPoint_ = null;
    }

    private void clearCustomUIForwardControlPoint() {
        this.customUIForwardControlPoint_ = null;
    }

    private void clearForwardControlPoint() {
        this.forwardControlPoint_ = null;
    }

    private void clearForwardType() {
        this.forwardType_ = 0;
    }

    public static ControlPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBackwardControlPoint(Point point) {
        point.getClass();
        Point point2 = this.backwardControlPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.backwardControlPoint_ = point;
        } else {
            this.backwardControlPoint_ = (Point) ((Point.b) Point.newBuilder(this.backwardControlPoint_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergeCustomUIBackwardControlPoint(Point point) {
        point.getClass();
        Point point2 = this.customUIBackwardControlPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.customUIBackwardControlPoint_ = point;
        } else {
            this.customUIBackwardControlPoint_ = (Point) ((Point.b) Point.newBuilder(this.customUIBackwardControlPoint_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergeCustomUIForwardControlPoint(Point point) {
        point.getClass();
        Point point2 = this.customUIForwardControlPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.customUIForwardControlPoint_ = point;
        } else {
            this.customUIForwardControlPoint_ = (Point) ((Point.b) Point.newBuilder(this.customUIForwardControlPoint_).mergeFrom(point)).buildPartial();
        }
    }

    private void mergeForwardControlPoint(Point point) {
        point.getClass();
        Point point2 = this.forwardControlPoint_;
        if (point2 == null || point2 == Point.getDefaultInstance()) {
            this.forwardControlPoint_ = point;
        } else {
            this.forwardControlPoint_ = (Point) ((Point.b) Point.newBuilder(this.forwardControlPoint_).mergeFrom(point)).buildPartial();
        }
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(ControlPoint controlPoint) {
        return (b) DEFAULT_INSTANCE.createBuilder(controlPoint);
    }

    public static ControlPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ControlPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ControlPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ControlPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ControlPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ControlPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ControlPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ControlPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ControlPoint parseFrom(InputStream inputStream) throws IOException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ControlPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ControlPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ControlPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ControlPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ControlPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ControlPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<ControlPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBackwardControlPoint(Point point) {
        point.getClass();
        this.backwardControlPoint_ = point;
    }

    private void setBackwardType(BezierType bezierType) {
        this.backwardType_ = bezierType.getNumber();
    }

    private void setBackwardTypeValue(int i7) {
        this.backwardType_ = i7;
    }

    private void setCustomUIBackwardControlPoint(Point point) {
        point.getClass();
        this.customUIBackwardControlPoint_ = point;
    }

    private void setCustomUIForwardControlPoint(Point point) {
        point.getClass();
        this.customUIForwardControlPoint_ = point;
    }

    private void setForwardControlPoint(Point point) {
        point.getClass();
        this.forwardControlPoint_ = point;
    }

    private void setForwardType(BezierType bezierType) {
        this.forwardType_ = bezierType.getNumber();
    }

    private void setForwardTypeValue(int i7) {
        this.forwardType_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108854a[methodToInvoke.ordinal()]) {
            case 1:
                return new ControlPoint();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\f\u0006\f", new Object[]{"backwardControlPoint_", "forwardControlPoint_", "customUIForwardControlPoint_", "customUIBackwardControlPoint_", "backwardType_", "forwardType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ControlPoint.class) {
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

    public Point getBackwardControlPoint() {
        Point point = this.backwardControlPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public BezierType getBackwardType() {
        BezierType bezierTypeForNumber = BezierType.forNumber(this.backwardType_);
        BezierType bezierType = bezierTypeForNumber;
        if (bezierTypeForNumber == null) {
            bezierType = BezierType.UNRECOGNIZED;
        }
        return bezierType;
    }

    public int getBackwardTypeValue() {
        return this.backwardType_;
    }

    public Point getCustomUIBackwardControlPoint() {
        Point point = this.customUIBackwardControlPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Point getCustomUIForwardControlPoint() {
        Point point = this.customUIForwardControlPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public Point getForwardControlPoint() {
        Point point = this.forwardControlPoint_;
        Point defaultInstance = point;
        if (point == null) {
            defaultInstance = Point.getDefaultInstance();
        }
        return defaultInstance;
    }

    public BezierType getForwardType() {
        BezierType bezierTypeForNumber = BezierType.forNumber(this.forwardType_);
        BezierType bezierType = bezierTypeForNumber;
        if (bezierTypeForNumber == null) {
            bezierType = BezierType.UNRECOGNIZED;
        }
        return bezierType;
    }

    public int getForwardTypeValue() {
        return this.forwardType_;
    }

    public boolean hasBackwardControlPoint() {
        return this.backwardControlPoint_ != null;
    }

    public boolean hasCustomUIBackwardControlPoint() {
        return this.customUIBackwardControlPoint_ != null;
    }

    public boolean hasCustomUIForwardControlPoint() {
        return this.customUIForwardControlPoint_ != null;
    }

    public boolean hasForwardControlPoint() {
        return this.forwardControlPoint_ != null;
    }
}
