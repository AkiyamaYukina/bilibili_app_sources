package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfResource.class */
public enum TfResource implements Internal.EnumLite {
    RES_UNSPECIFIED(0),
    RES_VIDEO(1),
    RES_VIDEO_UPLOAD(2),
    RES_RTMP(3),
    RES_RTMP_PUSH(4),
    RES_DANMAKU(5),
    RES_DANMAKU_MASK(6),
    RES_MUSIC(7),
    RES_FILE(8),
    RES_IMAGE(9),
    UNRECOGNIZED(-1);

    public static final int RES_DANMAKU_MASK_VALUE = 6;
    public static final int RES_DANMAKU_VALUE = 5;
    public static final int RES_FILE_VALUE = 8;
    public static final int RES_IMAGE_VALUE = 9;
    public static final int RES_MUSIC_VALUE = 7;
    public static final int RES_RTMP_PUSH_VALUE = 4;
    public static final int RES_RTMP_VALUE = 3;
    public static final int RES_UNSPECIFIED_VALUE = 0;
    public static final int RES_VIDEO_UPLOAD_VALUE = 2;
    public static final int RES_VIDEO_VALUE = 1;
    private static final Internal.EnumLiteMap<TfResource> internalValueMap = new Internal.EnumLiteMap<TfResource>() { // from class: com.bilibili.lib.tf.TfResource.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfResource m6823findValueByNumber(int i7) {
            return TfResource.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfResource$TfResourceVerifier.class */
    public static final class TfResourceVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfResourceVerifier();

        private TfResourceVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfResource.forNumber(i7) != null;
        }
    }

    TfResource(int i7) {
        this.value = i7;
    }

    public static TfResource forNumber(int i7) {
        switch (i7) {
            case 0:
                return RES_UNSPECIFIED;
            case 1:
                return RES_VIDEO;
            case 2:
                return RES_VIDEO_UPLOAD;
            case 3:
                return RES_RTMP;
            case 4:
                return RES_RTMP_PUSH;
            case 5:
                return RES_DANMAKU;
            case 6:
                return RES_DANMAKU_MASK;
            case 7:
                return RES_MUSIC;
            case 8:
                return RES_FILE;
            case 9:
                return RES_IMAGE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<TfResource> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfResourceVerifier.INSTANCE;
    }

    @Deprecated
    public static TfResource valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
