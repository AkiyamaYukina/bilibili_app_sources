package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CurveType.class */
public enum CurveType implements Internal.EnumLite {
    None(0),
    Custom(1),
    Highlight(2),
    Bullet(3),
    Montage(4),
    Jump(5),
    FlashIn(6),
    FlashOut(7),
    UNRECOGNIZED(-1);

    public static final int Bullet_VALUE = 3;
    public static final int Custom_VALUE = 1;
    public static final int FlashIn_VALUE = 6;
    public static final int FlashOut_VALUE = 7;
    public static final int Highlight_VALUE = 2;
    public static final int Jump_VALUE = 5;
    public static final int Montage_VALUE = 4;
    public static final int None_VALUE = 0;
    private static final Internal.EnumLiteMap<CurveType> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CurveType$a.class */
    public final class a implements Internal.EnumLiteMap<CurveType> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return CurveType.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/CurveType$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108855a = new Object();

        public final boolean isInRange(int i7) {
            return CurveType.forNumber(i7) != null;
        }
    }

    CurveType(int i7) {
        this.value = i7;
    }

    public static CurveType forNumber(int i7) {
        switch (i7) {
            case 0:
                return None;
            case 1:
                return Custom;
            case 2:
                return Highlight;
            case 3:
                return Bullet;
            case 4:
                return Montage;
            case 5:
                return Jump;
            case 6:
                return FlashIn;
            case 7:
                return FlashOut;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<CurveType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108855a;
    }

    @Deprecated
    public static CurveType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
