package com.bilibili.studio.videoeditor;

import com.bilibili.studio.videoeditor.ControlPoint;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/KeyFrame.class */
public final class KeyFrame extends GeneratedMessageLite<KeyFrame, b> implements q {
    public static final int CONTROLPOINTFORROTATION_FIELD_NUMBER = 11;
    public static final int CONTROLPOINTFORSCALEX_FIELD_NUMBER = 7;
    public static final int CONTROLPOINTFORSCALEY_FIELD_NUMBER = 8;
    public static final int CONTROLPOINTFORTRANSX_FIELD_NUMBER = 9;
    public static final int CONTROLPOINTFORTRANSY_FIELD_NUMBER = 10;
    private static final KeyFrame DEFAULT_INSTANCE;
    public static final int OPACITY_FIELD_NUMBER = 5;
    private static volatile Parser<KeyFrame> PARSER;
    public static final int ROTATION_FIELD_NUMBER = 4;
    public static final int SCALE_FIELD_NUMBER = 6;
    public static final int TIMEPOSITION_FIELD_NUMBER = 1;
    public static final int TRANSX_FIELD_NUMBER = 2;
    public static final int TRANSY_FIELD_NUMBER = 3;
    private ControlPoint controlPointForRotation_;
    private ControlPoint controlPointForScaleX_;
    private ControlPoint controlPointForScaleY_;
    private ControlPoint controlPointForTransX_;
    private ControlPoint controlPointForTransY_;
    private float opacity_;
    private float rotation_;
    private float scale_;
    private long timePosition_;
    private float transX_;
    private float transY_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/KeyFrame$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108868a;

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
                com.bilibili.studio.videoeditor.KeyFrame.a.f108868a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.KeyFrame.a.f108868a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.KeyFrame.a.f108868a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.KeyFrame.a.f108868a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.KeyFrame.a.f108868a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.KeyFrame.a.f108868a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.KeyFrame.a.f108868a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.KeyFrame.a.m10305clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/KeyFrame$b.class */
    public static final class b extends GeneratedMessageLite.Builder<KeyFrame, b> implements q {
        public b() {
            super(KeyFrame.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyFrame keyFrame = new KeyFrame();
        DEFAULT_INSTANCE = keyFrame;
        GeneratedMessageLite.registerDefaultInstance(KeyFrame.class, keyFrame);
    }

    private KeyFrame() {
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

    private void clearOpacity() {
        this.opacity_ = 0.0f;
    }

    private void clearRotation() {
        this.rotation_ = 0.0f;
    }

    private void clearScale() {
        this.scale_ = 0.0f;
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

    public static KeyFrame getDefaultInstance() {
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

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(KeyFrame keyFrame) {
        return (b) DEFAULT_INSTANCE.createBuilder(keyFrame);
    }

    public static KeyFrame parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeyFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyFrame parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyFrame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KeyFrame parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KeyFrame parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KeyFrame parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static KeyFrame parseFrom(InputStream inputStream) throws IOException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyFrame parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KeyFrame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KeyFrame parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KeyFrame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyFrame parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KeyFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<KeyFrame> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    private void setOpacity(float f7) {
        this.opacity_ = f7;
    }

    private void setRotation(float f7) {
        this.rotation_ = f7;
    }

    private void setScale(float f7) {
        this.scale_ = f7;
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

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108868a[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyFrame();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\t\b\t\t\t\n\t\u000b\t", new Object[]{"timePosition_", "transX_", "transY_", "rotation_", "opacity_", "scale_", "controlPointForScaleX_", "controlPointForScaleY_", "controlPointForTransX_", "controlPointForTransY_", "controlPointForRotation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (KeyFrame.class) {
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

    public float getOpacity() {
        return this.opacity_;
    }

    public float getRotation() {
        return this.rotation_;
    }

    public float getScale() {
        return this.scale_;
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
}
