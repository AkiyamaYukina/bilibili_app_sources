package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MediaFrom.class */
public enum MediaFrom implements Internal.EnumLite {
    Asset(0),
    File(1),
    UNRECOGNIZED(-1);

    public static final int Asset_VALUE = 0;
    public static final int File_VALUE = 1;
    private static final Internal.EnumLiteMap<MediaFrom> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MediaFrom$a.class */
    public final class a implements Internal.EnumLiteMap<MediaFrom> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return MediaFrom.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/MediaFrom$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108873a = new Object();

        public final boolean isInRange(int i7) {
            return MediaFrom.forNumber(i7) != null;
        }
    }

    MediaFrom(int i7) {
        this.value = i7;
    }

    public static MediaFrom forNumber(int i7) {
        if (i7 == 0) {
            return Asset;
        }
        if (i7 != 1) {
            return null;
        }
        return File;
    }

    public static Internal.EnumLiteMap<MediaFrom> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108873a;
    }

    @Deprecated
    public static MediaFrom valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
