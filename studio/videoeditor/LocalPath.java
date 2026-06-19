package com.bilibili.studio.videoeditor;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath.class */
public final class LocalPath extends GeneratedMessageLite<LocalPath, b> implements r {
    private static final LocalPath DEFAULT_INSTANCE;
    public static final int FULLPATH_FIELD_NUMBER = 3;
    public static final int MATERIALID_FIELD_NUMBER = 5;
    public static final int PACKAGEID_FIELD_NUMBER = 4;
    private static volatile Parser<LocalPath> PARSER;
    public static final int PATHTYPE_FIELD_NUMBER = 1;
    public static final int RELATIVEPATH_FIELD_NUMBER = 2;
    public static final int REMOTEPATH_FIELD_NUMBER = 6;
    public static final int SOURCEFROM_FIELD_NUMBER = 7;
    private int pathType_;
    private int sourceFrom_;
    private String relativePath_ = "";
    private String fullPath_ = "";
    private String packageId_ = "";
    private String materialId_ = "";
    private String remotePath_ = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$PathType.class */
    public enum PathType implements Internal.EnumLite {
        Unknown(0),
        Bundle(1),
        SandBox(2),
        Package(3),
        UNRECOGNIZED(-1);

        public static final int Bundle_VALUE = 1;
        public static final int Package_VALUE = 3;
        public static final int SandBox_VALUE = 2;
        public static final int Unknown_VALUE = 0;
        private static final Internal.EnumLiteMap<PathType> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$PathType$a.class */
        public final class a implements Internal.EnumLiteMap<PathType> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return PathType.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$PathType$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108869a = new Object();

            public final boolean isInRange(int i7) {
                return PathType.forNumber(i7) != null;
            }
        }

        PathType(int i7) {
            this.value = i7;
        }

        public static PathType forNumber(int i7) {
            if (i7 == 0) {
                return Unknown;
            }
            if (i7 == 1) {
                return Bundle;
            }
            if (i7 == 2) {
                return SandBox;
            }
            if (i7 != 3) {
                return null;
            }
            return Package;
        }

        public static Internal.EnumLiteMap<PathType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108869a;
        }

        @Deprecated
        public static PathType valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$SourceFrom.class */
    public enum SourceFrom implements Internal.EnumLite {
        Local(0),
        Material(1),
        Remote(2),
        UNRECOGNIZED(-1);

        public static final int Local_VALUE = 0;
        public static final int Material_VALUE = 1;
        public static final int Remote_VALUE = 2;
        private static final Internal.EnumLiteMap<SourceFrom> internalValueMap = new Object();
        private final int value;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$SourceFrom$a.class */
        public final class a implements Internal.EnumLiteMap<SourceFrom> {
            public final Internal.EnumLite findValueByNumber(int i7) {
                return SourceFrom.forNumber(i7);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$SourceFrom$b.class */
        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108870a = new Object();

            public final boolean isInRange(int i7) {
                return SourceFrom.forNumber(i7) != null;
            }
        }

        SourceFrom(int i7) {
            this.value = i7;
        }

        public static SourceFrom forNumber(int i7) {
            if (i7 == 0) {
                return Local;
            }
            if (i7 == 1) {
                return Material;
            }
            if (i7 != 2) {
                return null;
            }
            return Remote;
        }

        public static Internal.EnumLiteMap<SourceFrom> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f108870a;
        }

        @Deprecated
        public static SourceFrom valueOf(int i7) {
            return forNumber(i7);
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108871a;

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
                com.bilibili.studio.videoeditor.LocalPath.a.f108871a = r0
                r0 = r4
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L14:
                int[] r0 = com.bilibili.studio.videoeditor.LocalPath.a.f108871a     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L1f:
                int[] r0 = com.bilibili.studio.videoeditor.LocalPath.a.f108871a     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L2a:
                int[] r0 = com.bilibili.studio.videoeditor.LocalPath.a.f108871a     // Catch: java.lang.NoSuchFieldError -> L61 java.lang.NoSuchFieldError -> L65
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L65
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L65
            L35:
                int[] r0 = com.bilibili.studio.videoeditor.LocalPath.a.f108871a     // Catch: java.lang.NoSuchFieldError -> L65 java.lang.NoSuchFieldError -> L69
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L69
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L69
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L69
            L40:
                int[] r0 = com.bilibili.studio.videoeditor.LocalPath.a.f108871a     // Catch: java.lang.NoSuchFieldError -> L69 java.lang.NoSuchFieldError -> L6d
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L4c:
                int[] r0 = com.bilibili.studio.videoeditor.LocalPath.a.f108871a     // Catch: java.lang.NoSuchFieldError -> L6d java.lang.NoSuchFieldError -> L71
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.LocalPath.a.m10312clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/LocalPath$b.class */
    public static final class b extends GeneratedMessageLite.Builder<LocalPath, b> implements r {
        public b() {
            super(LocalPath.DEFAULT_INSTANCE);
        }
    }

    static {
        LocalPath localPath = new LocalPath();
        DEFAULT_INSTANCE = localPath;
        GeneratedMessageLite.registerDefaultInstance(LocalPath.class, localPath);
    }

    private LocalPath() {
    }

    private void clearFullPath() {
        this.fullPath_ = getDefaultInstance().getFullPath();
    }

    private void clearMaterialId() {
        this.materialId_ = getDefaultInstance().getMaterialId();
    }

    private void clearPackageId() {
        this.packageId_ = getDefaultInstance().getPackageId();
    }

    private void clearPathType() {
        this.pathType_ = 0;
    }

    private void clearRelativePath() {
        this.relativePath_ = getDefaultInstance().getRelativePath();
    }

    private void clearRemotePath() {
        this.remotePath_ = getDefaultInstance().getRemotePath();
    }

    private void clearSourceFrom() {
        this.sourceFrom_ = 0;
    }

    public static LocalPath getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static b newBuilder(LocalPath localPath) {
        return (b) DEFAULT_INSTANCE.createBuilder(localPath);
    }

    public static LocalPath parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocalPath) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalPath parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalPath) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocalPath parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LocalPath parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocalPath parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocalPath parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static LocalPath parseFrom(InputStream inputStream) throws IOException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalPath parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocalPath parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LocalPath parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocalPath parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocalPath parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalPath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<LocalPath> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFullPath(String str) {
        str.getClass();
        this.fullPath_ = str;
    }

    private void setFullPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fullPath_ = byteString.toStringUtf8();
    }

    private void setMaterialId(String str) {
        str.getClass();
        this.materialId_ = str;
    }

    private void setMaterialIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.materialId_ = byteString.toStringUtf8();
    }

    private void setPackageId(String str) {
        str.getClass();
        this.packageId_ = str;
    }

    private void setPackageIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packageId_ = byteString.toStringUtf8();
    }

    private void setPathType(PathType pathType) {
        this.pathType_ = pathType.getNumber();
    }

    private void setPathTypeValue(int i7) {
        this.pathType_ = i7;
    }

    private void setRelativePath(String str) {
        str.getClass();
        this.relativePath_ = str;
    }

    private void setRelativePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.relativePath_ = byteString.toStringUtf8();
    }

    private void setRemotePath(String str) {
        str.getClass();
        this.remotePath_ = str;
    }

    private void setRemotePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.remotePath_ = byteString.toStringUtf8();
    }

    private void setSourceFrom(SourceFrom sourceFrom) {
        this.sourceFrom_ = sourceFrom.getNumber();
    }

    private void setSourceFromValue(int i7) {
        this.sourceFrom_ = i7;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f108871a[methodToInvoke.ordinal()]) {
            case 1:
                return new LocalPath();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f", new Object[]{"pathType_", "relativePath_", "fullPath_", "packageId_", "materialId_", "remotePath_", "sourceFrom_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LocalPath.class) {
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

    public String getFullPath() {
        return this.fullPath_;
    }

    public ByteString getFullPathBytes() {
        return ByteString.copyFromUtf8(this.fullPath_);
    }

    public String getMaterialId() {
        return this.materialId_;
    }

    public ByteString getMaterialIdBytes() {
        return ByteString.copyFromUtf8(this.materialId_);
    }

    public String getPackageId() {
        return this.packageId_;
    }

    public ByteString getPackageIdBytes() {
        return ByteString.copyFromUtf8(this.packageId_);
    }

    public PathType getPathType() {
        PathType pathTypeForNumber = PathType.forNumber(this.pathType_);
        PathType pathType = pathTypeForNumber;
        if (pathTypeForNumber == null) {
            pathType = PathType.UNRECOGNIZED;
        }
        return pathType;
    }

    public int getPathTypeValue() {
        return this.pathType_;
    }

    public String getRelativePath() {
        return this.relativePath_;
    }

    public ByteString getRelativePathBytes() {
        return ByteString.copyFromUtf8(this.relativePath_);
    }

    public String getRemotePath() {
        return this.remotePath_;
    }

    public ByteString getRemotePathBytes() {
        return ByteString.copyFromUtf8(this.remotePath_);
    }

    public SourceFrom getSourceFrom() {
        SourceFrom sourceFromForNumber = SourceFrom.forNumber(this.sourceFrom_);
        SourceFrom sourceFrom = sourceFromForNumber;
        if (sourceFromForNumber == null) {
            sourceFrom = SourceFrom.UNRECOGNIZED;
        }
        return sourceFrom;
    }

    public int getSourceFromValue() {
        return this.sourceFrom_;
    }
}
