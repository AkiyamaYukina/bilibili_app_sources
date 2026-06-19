package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.Point;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo.class */
public final class VideoClipMaskRegionInfo extends GeneratedMessageLite<VideoClipMaskRegionInfo, b> implements MessageLiteOrBuilder {
    private static final VideoClipMaskRegionInfo DEFAULT_INSTANCE;
    private static volatile Parser<VideoClipMaskRegionInfo> PARSER;
    public static final int REGIONINFOS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<MaskSubRegionInfo> regionInfos_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo.class */
    public static final class MaskSubRegionInfo extends GeneratedMessageLite<MaskSubRegionInfo, a> implements c {
        private static final MaskSubRegionInfo DEFAULT_INSTANCE;
        public static final int ELLIPSE2D_FIELD_NUMBER = 3;
        public static final int MASKTYPE_FIELD_NUMBER = 1;
        private static volatile Parser<MaskSubRegionInfo> PARSER;
        public static final int REGIONPOINTARRAY_FIELD_NUMBER = 4;
        public static final int TRANSFORM2D_FIELD_NUMBER = 2;
        private Ellipse2D ellipse2D_;
        private int maskType_;
        private Internal.ProtobufList<Point> regionPointArray_ = GeneratedMessageLite.emptyProtobufList();
        private Transform2D transform2D_;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$Ellipse2D.class */
        public static final class Ellipse2D extends GeneratedMessageLite<Ellipse2D, a> implements MessageLiteOrBuilder {
            public static final int A_FIELD_NUMBER = 2;
            public static final int B_FIELD_NUMBER = 3;
            public static final int CENTER_FIELD_NUMBER = 1;
            private static final Ellipse2D DEFAULT_INSTANCE;
            private static volatile Parser<Ellipse2D> PARSER;
            public static final int THETA_FIELD_NUMBER = 4;
            private float a_;
            private float b_;
            private Point center_;
            private float theta_;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$Ellipse2D$a.class */
            public static final class a extends GeneratedMessageLite.Builder<Ellipse2D, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Ellipse2D.DEFAULT_INSTANCE);
                }
            }

            static {
                Ellipse2D ellipse2D = new Ellipse2D();
                DEFAULT_INSTANCE = ellipse2D;
                GeneratedMessageLite.registerDefaultInstance(Ellipse2D.class, ellipse2D);
            }

            private Ellipse2D() {
            }

            private void clearA() {
                this.a_ = 0.0f;
            }

            private void clearB() {
                this.b_ = 0.0f;
            }

            private void clearCenter() {
                this.center_ = null;
            }

            private void clearTheta() {
                this.theta_ = 0.0f;
            }

            public static Ellipse2D getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeCenter(Point point) {
                point.getClass();
                Point point2 = this.center_;
                if (point2 == null || point2 == Point.getDefaultInstance()) {
                    this.center_ = point;
                } else {
                    this.center_ = (Point) ((Point.b) Point.newBuilder(this.center_).mergeFrom(point)).buildPartial();
                }
            }

            public static a newBuilder() {
                return (a) DEFAULT_INSTANCE.createBuilder();
            }

            public static a newBuilder(Ellipse2D ellipse2D) {
                return (a) DEFAULT_INSTANCE.createBuilder(ellipse2D);
            }

            public static Ellipse2D parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ellipse2D) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ellipse2D parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ellipse2D) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ellipse2D parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Ellipse2D parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Ellipse2D parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Ellipse2D parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Ellipse2D parseFrom(InputStream inputStream) throws IOException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ellipse2D parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ellipse2D parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Ellipse2D parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Ellipse2D parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Ellipse2D parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ellipse2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Parser<Ellipse2D> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setA(float f7) {
                this.a_ = f7;
            }

            private void setB(float f7) {
                this.b_ = f7;
            }

            private void setCenter(Point point) {
                point.getClass();
                this.center_ = point;
            }

            private void setTheta(float f7) {
                this.theta_ = f7;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.f108904a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ellipse2D();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"center_", "a_", "b_", "theta_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Ellipse2D.class) {
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

            public float getA() {
                return this.a_;
            }

            public float getB() {
                return this.b_;
            }

            public Point getCenter() {
                Point point = this.center_;
                Point defaultInstance = point;
                if (point == null) {
                    defaultInstance = Point.getDefaultInstance();
                }
                return defaultInstance;
            }

            public float getTheta() {
                return this.theta_;
            }

            public boolean hasCenter() {
                return this.center_ != null;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$MaskType.class */
        public enum MaskType implements Internal.EnumLite {
            None(0),
            Line(1),
            Mirror(2),
            Rectangle(3),
            Cycle(4),
            UNRECOGNIZED(-1);

            public static final int Cycle_VALUE = 4;
            public static final int Line_VALUE = 1;
            public static final int Mirror_VALUE = 2;
            public static final int None_VALUE = 0;
            public static final int Rectangle_VALUE = 3;
            private static final Internal.EnumLiteMap<MaskType> internalValueMap = new Object();
            private final int value;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$MaskType$a.class */
            public final class a implements Internal.EnumLiteMap<MaskType> {
                public final Internal.EnumLite findValueByNumber(int i7) {
                    return MaskType.forNumber(i7);
                }
            }

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$MaskType$b.class */
            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f108903a = new Object();

                public final boolean isInRange(int i7) {
                    return MaskType.forNumber(i7) != null;
                }
            }

            MaskType(int i7) {
                this.value = i7;
            }

            public static MaskType forNumber(int i7) {
                if (i7 == 0) {
                    return None;
                }
                if (i7 == 1) {
                    return Line;
                }
                if (i7 == 2) {
                    return Mirror;
                }
                if (i7 == 3) {
                    return Rectangle;
                }
                if (i7 != 4) {
                    return null;
                }
                return Cycle;
            }

            public static Internal.EnumLiteMap<MaskType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f108903a;
            }

            @Deprecated
            public static MaskType valueOf(int i7) {
                return forNumber(i7);
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$Transform2D.class */
        public static final class Transform2D extends GeneratedMessageLite<Transform2D, a> implements MessageLiteOrBuilder {
            public static final int ANCHOR_FIELD_NUMBER = 1;
            private static final Transform2D DEFAULT_INSTANCE;
            private static volatile Parser<Transform2D> PARSER;
            public static final int ROTATION_FIELD_NUMBER = 4;
            public static final int SCALE_FIELD_NUMBER = 2;
            public static final int TRANSLATION_FIELD_NUMBER = 3;
            private Point anchor_;
            private float rotation_;
            private Point scale_;
            private Point translation_;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$Transform2D$a.class */
            public static final class a extends GeneratedMessageLite.Builder<Transform2D, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Transform2D.DEFAULT_INSTANCE);
                }
            }

            static {
                Transform2D transform2D = new Transform2D();
                DEFAULT_INSTANCE = transform2D;
                GeneratedMessageLite.registerDefaultInstance(Transform2D.class, transform2D);
            }

            private Transform2D() {
            }

            private void clearAnchor() {
                this.anchor_ = null;
            }

            private void clearRotation() {
                this.rotation_ = 0.0f;
            }

            private void clearScale() {
                this.scale_ = null;
            }

            private void clearTranslation() {
                this.translation_ = null;
            }

            public static Transform2D getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAnchor(Point point) {
                point.getClass();
                Point point2 = this.anchor_;
                if (point2 == null || point2 == Point.getDefaultInstance()) {
                    this.anchor_ = point;
                } else {
                    this.anchor_ = (Point) ((Point.b) Point.newBuilder(this.anchor_).mergeFrom(point)).buildPartial();
                }
            }

            private void mergeScale(Point point) {
                point.getClass();
                Point point2 = this.scale_;
                if (point2 == null || point2 == Point.getDefaultInstance()) {
                    this.scale_ = point;
                } else {
                    this.scale_ = (Point) ((Point.b) Point.newBuilder(this.scale_).mergeFrom(point)).buildPartial();
                }
            }

            private void mergeTranslation(Point point) {
                point.getClass();
                Point point2 = this.translation_;
                if (point2 == null || point2 == Point.getDefaultInstance()) {
                    this.translation_ = point;
                } else {
                    this.translation_ = (Point) ((Point.b) Point.newBuilder(this.translation_).mergeFrom(point)).buildPartial();
                }
            }

            public static a newBuilder() {
                return (a) DEFAULT_INSTANCE.createBuilder();
            }

            public static a newBuilder(Transform2D transform2D) {
                return (a) DEFAULT_INSTANCE.createBuilder(transform2D);
            }

            public static Transform2D parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Transform2D) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Transform2D parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Transform2D) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Transform2D parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Transform2D parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Transform2D parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Transform2D parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }

            public static Transform2D parseFrom(InputStream inputStream) throws IOException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Transform2D parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Transform2D parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Transform2D parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Transform2D parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Transform2D parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Transform2D) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Parser<Transform2D> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAnchor(Point point) {
                point.getClass();
                this.anchor_ = point;
            }

            private void setRotation(float f7) {
                this.rotation_ = f7;
            }

            private void setScale(Point point) {
                point.getClass();
                this.scale_ = point;
            }

            private void setTranslation(Point point) {
                point.getClass();
                this.translation_ = point;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.f108904a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Transform2D();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\u0001", new Object[]{"anchor_", "scale_", "translation_", "rotation_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Transform2D.class) {
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

            public Point getAnchor() {
                Point point = this.anchor_;
                Point defaultInstance = point;
                if (point == null) {
                    defaultInstance = Point.getDefaultInstance();
                }
                return defaultInstance;
            }

            public float getRotation() {
                return this.rotation_;
            }

            public Point getScale() {
                Point point = this.scale_;
                Point defaultInstance = point;
                if (point == null) {
                    defaultInstance = Point.getDefaultInstance();
                }
                return defaultInstance;
            }

            public Point getTranslation() {
                Point point = this.translation_;
                Point defaultInstance = point;
                if (point == null) {
                    defaultInstance = Point.getDefaultInstance();
                }
                return defaultInstance;
            }

            public boolean hasAnchor() {
                return this.anchor_ != null;
            }

            public boolean hasScale() {
                return this.scale_ != null;
            }

            public boolean hasTranslation() {
                return this.translation_ != null;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$MaskSubRegionInfo$a.class */
        public static final class a extends GeneratedMessageLite.Builder<MaskSubRegionInfo, a> implements c {
            public a() {
                super(MaskSubRegionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            MaskSubRegionInfo maskSubRegionInfo = new MaskSubRegionInfo();
            DEFAULT_INSTANCE = maskSubRegionInfo;
            GeneratedMessageLite.registerDefaultInstance(MaskSubRegionInfo.class, maskSubRegionInfo);
        }

        private MaskSubRegionInfo() {
        }

        private void addAllRegionPointArray(Iterable<? extends Point> iterable) {
            ensureRegionPointArrayIsMutable();
            AbstractMessageLite.addAll(iterable, this.regionPointArray_);
        }

        private void addRegionPointArray(int i7, Point point) {
            point.getClass();
            ensureRegionPointArrayIsMutable();
            this.regionPointArray_.add(i7, point);
        }

        private void addRegionPointArray(Point point) {
            point.getClass();
            ensureRegionPointArrayIsMutable();
            this.regionPointArray_.add(point);
        }

        private void clearEllipse2D() {
            this.ellipse2D_ = null;
        }

        private void clearMaskType() {
            this.maskType_ = 0;
        }

        private void clearRegionPointArray() {
            this.regionPointArray_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearTransform2D() {
            this.transform2D_ = null;
        }

        private void ensureRegionPointArrayIsMutable() {
            Internal.ProtobufList<Point> protobufList = this.regionPointArray_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.regionPointArray_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static MaskSubRegionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEllipse2D(Ellipse2D ellipse2D) {
            ellipse2D.getClass();
            Ellipse2D ellipse2D2 = this.ellipse2D_;
            if (ellipse2D2 == null || ellipse2D2 == Ellipse2D.getDefaultInstance()) {
                this.ellipse2D_ = ellipse2D;
            } else {
                this.ellipse2D_ = (Ellipse2D) ((Ellipse2D.a) Ellipse2D.newBuilder(this.ellipse2D_).mergeFrom(ellipse2D)).buildPartial();
            }
        }

        private void mergeTransform2D(Transform2D transform2D) {
            transform2D.getClass();
            Transform2D transform2D2 = this.transform2D_;
            if (transform2D2 == null || transform2D2 == Transform2D.getDefaultInstance()) {
                this.transform2D_ = transform2D;
            } else {
                this.transform2D_ = (Transform2D) ((Transform2D.a) Transform2D.newBuilder(this.transform2D_).mergeFrom(transform2D)).buildPartial();
            }
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static a newBuilder(MaskSubRegionInfo maskSubRegionInfo) {
            return (a) DEFAULT_INSTANCE.createBuilder(maskSubRegionInfo);
        }

        public static MaskSubRegionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MaskSubRegionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MaskSubRegionInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MaskSubRegionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MaskSubRegionInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MaskSubRegionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static MaskSubRegionInfo parseFrom(InputStream inputStream) throws IOException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MaskSubRegionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MaskSubRegionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static MaskSubRegionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MaskSubRegionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MaskSubRegionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MaskSubRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<MaskSubRegionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeRegionPointArray(int i7) {
            ensureRegionPointArrayIsMutable();
            this.regionPointArray_.remove(i7);
        }

        private void setEllipse2D(Ellipse2D ellipse2D) {
            ellipse2D.getClass();
            this.ellipse2D_ = ellipse2D;
        }

        private void setMaskType(MaskType maskType) {
            this.maskType_ = maskType.getNumber();
        }

        private void setMaskTypeValue(int i7) {
            this.maskType_ = i7;
        }

        private void setRegionPointArray(int i7, Point point) {
            point.getClass();
            ensureRegionPointArrayIsMutable();
            this.regionPointArray_.set(i7, point);
        }

        private void setTransform2D(Transform2D transform2D) {
            transform2D.getClass();
            this.transform2D_ = transform2D;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f108904a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MaskSubRegionInfo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002\t\u0003\t\u0004\u001b", new Object[]{"maskType_", "transform2D_", "ellipse2D_", "regionPointArray_", Point.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MaskSubRegionInfo.class) {
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

        public Ellipse2D getEllipse2D() {
            Ellipse2D ellipse2D = this.ellipse2D_;
            Ellipse2D defaultInstance = ellipse2D;
            if (ellipse2D == null) {
                defaultInstance = Ellipse2D.getDefaultInstance();
            }
            return defaultInstance;
        }

        public MaskType getMaskType() {
            MaskType maskTypeForNumber = MaskType.forNumber(this.maskType_);
            MaskType maskType = maskTypeForNumber;
            if (maskTypeForNumber == null) {
                maskType = MaskType.UNRECOGNIZED;
            }
            return maskType;
        }

        public int getMaskTypeValue() {
            return this.maskType_;
        }

        public Point getRegionPointArray(int i7) {
            return (Point) this.regionPointArray_.get(i7);
        }

        public int getRegionPointArrayCount() {
            return this.regionPointArray_.size();
        }

        public List<Point> getRegionPointArrayList() {
            return this.regionPointArray_;
        }

        public v getRegionPointArrayOrBuilder(int i7) {
            return (v) this.regionPointArray_.get(i7);
        }

        public List<? extends v> getRegionPointArrayOrBuilderList() {
            return this.regionPointArray_;
        }

        public Transform2D getTransform2D() {
            Transform2D transform2D = this.transform2D_;
            Transform2D defaultInstance = transform2D;
            if (transform2D == null) {
                defaultInstance = Transform2D.getDefaultInstance();
            }
            return defaultInstance;
        }

        public boolean hasEllipse2D() {
            return this.ellipse2D_ != null;
        }

        public boolean hasTransform2D() {
            return this.transform2D_ != null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108904a;

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
                com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.f108904a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo.a.m10384clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$b.class */
    public static final class b extends GeneratedMessageLite.Builder<VideoClipMaskRegionInfo, b> implements MessageLiteOrBuilder {
        public b() {
            super(VideoClipMaskRegionInfo.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/VideoClipMaskRegionInfo$c.class */
    public interface c extends MessageLiteOrBuilder {
    }

    static {
        VideoClipMaskRegionInfo videoClipMaskRegionInfo = new VideoClipMaskRegionInfo();
        DEFAULT_INSTANCE = videoClipMaskRegionInfo;
        GeneratedMessageLite.registerDefaultInstance(VideoClipMaskRegionInfo.class, videoClipMaskRegionInfo);
    }

    private VideoClipMaskRegionInfo() {
    }

    private void addAllRegionInfos(Iterable<? extends MaskSubRegionInfo> iterable) {
        ensureRegionInfosIsMutable();
        AbstractMessageLite.addAll(iterable, this.regionInfos_);
    }

    private void addRegionInfos(int i7, MaskSubRegionInfo maskSubRegionInfo) {
        maskSubRegionInfo.getClass();
        ensureRegionInfosIsMutable();
        this.regionInfos_.add(i7, maskSubRegionInfo);
    }

    private void addRegionInfos(MaskSubRegionInfo maskSubRegionInfo) {
        maskSubRegionInfo.getClass();
        ensureRegionInfosIsMutable();
        this.regionInfos_.add(maskSubRegionInfo);
    }

    private void clearRegionInfos() {
        this.regionInfos_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRegionInfosIsMutable() {
        Internal.ProtobufList<MaskSubRegionInfo> protobufList = this.regionInfos_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.regionInfos_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoClipMaskRegionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(VideoClipMaskRegionInfo videoClipMaskRegionInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(videoClipMaskRegionInfo);
    }

    public static VideoClipMaskRegionInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClipMaskRegionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClipMaskRegionInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VideoClipMaskRegionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoClipMaskRegionInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoClipMaskRegionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static VideoClipMaskRegionInfo parseFrom(InputStream inputStream) throws IOException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoClipMaskRegionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoClipMaskRegionInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VideoClipMaskRegionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoClipMaskRegionInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoClipMaskRegionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoClipMaskRegionInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<VideoClipMaskRegionInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRegionInfos(int i7) {
        ensureRegionInfosIsMutable();
        this.regionInfos_.remove(i7);
    }

    private void setRegionInfos(int i7, MaskSubRegionInfo maskSubRegionInfo) {
        maskSubRegionInfo.getClass();
        ensureRegionInfosIsMutable();
        this.regionInfos_.set(i7, maskSubRegionInfo);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108904a[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoClipMaskRegionInfo();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"regionInfos_", MaskSubRegionInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (VideoClipMaskRegionInfo.class) {
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

    public MaskSubRegionInfo getRegionInfos(int i7) {
        return (MaskSubRegionInfo) this.regionInfos_.get(i7);
    }

    public int getRegionInfosCount() {
        return this.regionInfos_.size();
    }

    public List<MaskSubRegionInfo> getRegionInfosList() {
        return this.regionInfos_;
    }

    public c getRegionInfosOrBuilder(int i7) {
        return (c) this.regionInfos_.get(i7);
    }

    public List<? extends c> getRegionInfosOrBuilderList() {
        return this.regionInfos_;
    }
}
