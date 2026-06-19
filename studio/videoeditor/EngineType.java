package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EngineType.class */
public enum EngineType implements Internal.EnumLite {
    UNDEFINE(0),
    MEICAM(1),
    MONTAGE(2),
    UNRECOGNIZED(-1);

    public static final int MEICAM_VALUE = 1;
    public static final int MONTAGE_VALUE = 2;
    public static final int UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<EngineType> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EngineType$a.class */
    public final class a implements Internal.EnumLiteMap<EngineType> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return EngineType.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EngineType$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108859a = new Object();

        public final boolean isInRange(int i7) {
            return EngineType.forNumber(i7) != null;
        }
    }

    EngineType(int i7) {
        this.value = i7;
    }

    public static EngineType forNumber(int i7) {
        if (i7 == 0) {
            return UNDEFINE;
        }
        if (i7 == 1) {
            return MEICAM;
        }
        if (i7 != 2) {
            return null;
        }
        return MONTAGE;
    }

    public static Internal.EnumLiteMap<EngineType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108859a;
    }

    @Deprecated
    public static EngineType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
