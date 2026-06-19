package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/DraftType.class */
public enum DraftType implements Internal.EnumLite {
    Unknown(0),
    MainEditor(1),
    UNRECOGNIZED(-1);

    public static final int MainEditor_VALUE = 1;
    public static final int Unknown_VALUE = 0;
    private static final Internal.EnumLiteMap<DraftType> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/DraftType$a.class */
    public final class a implements Internal.EnumLiteMap<DraftType> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return DraftType.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/DraftType$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108858a = new Object();

        public final boolean isInRange(int i7) {
            return DraftType.forNumber(i7) != null;
        }
    }

    DraftType(int i7) {
        this.value = i7;
    }

    public static DraftType forNumber(int i7) {
        if (i7 == 0) {
            return Unknown;
        }
        if (i7 != 1) {
            return null;
        }
        return MainEditor;
    }

    public static Internal.EnumLiteMap<DraftType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108858a;
    }

    @Deprecated
    public static DraftType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
