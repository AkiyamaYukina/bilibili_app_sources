package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MediaType.class */
public enum MediaType implements Internal.EnumLite {
    Video(0),
    Image(1),
    UNRECOGNIZED(-1);

    public static final int Image_VALUE = 1;
    public static final int Video_VALUE = 0;
    private static final Internal.EnumLiteMap<MediaType> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MediaType$a.class */
    public final class a implements Internal.EnumLiteMap<MediaType> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return MediaType.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MediaType$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108874a = new Object();

        public final boolean isInRange(int i7) {
            return MediaType.forNumber(i7) != null;
        }
    }

    MediaType(int i7) {
        this.value = i7;
    }

    public static MediaType forNumber(int i7) {
        if (i7 == 0) {
            return Video;
        }
        if (i7 != 1) {
            return null;
        }
        return Image;
    }

    public static Internal.EnumLiteMap<MediaType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108874a;
    }

    @Deprecated
    public static MediaType valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
