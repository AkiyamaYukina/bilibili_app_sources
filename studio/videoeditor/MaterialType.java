package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MaterialType.class */
public enum MaterialType implements Internal.EnumLite {
    local(0),
    head(1),
    tail(2),
    global(3),
    UNRECOGNIZED(-1);

    public static final int global_VALUE = 3;
    public static final int head_VALUE = 1;
    private static final Internal.EnumLiteMap<MaterialType> internalValueMap = new Object();
    public static final int local_VALUE = 0;
    public static final int tail_VALUE = 2;
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MaterialType$a.class */
    public final class a implements Internal.EnumLiteMap<MaterialType> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return MaterialType.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MaterialType$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108872a = new Object();

        public final boolean isInRange(int i7) {
            return MaterialType.forNumber(i7) != null;
        }
    }

    MaterialType(int i7) {
        this.value = i7;
    }

    public static MaterialType forNumber(int i7) {
        if (i7 == 0) {
            return local;
        }
        if (i7 == 1) {
            return head;
        }
        if (i7 == 2) {
            return tail;
        }
        if (i7 != 3) {
            return null;
        }
        return global;
    }

    public static Internal.EnumLiteMap<MaterialType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108872a;
    }

    @Deprecated
    public static MaterialType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
