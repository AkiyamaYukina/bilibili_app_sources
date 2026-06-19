package com.bilibili.studio.videoeditor;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TemplateFxFrom.class */
public enum TemplateFxFrom implements Internal.EnumLite {
    TemplateFxFromDefault(0),
    TemplateFxFromOnekeyTemplate(1),
    TemplateFxFromUGCTemplate(2),
    UNRECOGNIZED(-1);

    public static final int TemplateFxFromDefault_VALUE = 0;
    public static final int TemplateFxFromOnekeyTemplate_VALUE = 1;
    public static final int TemplateFxFromUGCTemplate_VALUE = 2;
    private static final Internal.EnumLiteMap<TemplateFxFrom> internalValueMap = new Object();
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TemplateFxFrom$a.class */
    public final class a implements Internal.EnumLiteMap<TemplateFxFrom> {
        public final Internal.EnumLite findValueByNumber(int i7) {
            return TemplateFxFrom.forNumber(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/TemplateFxFrom$b.class */
    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f108883a = new Object();

        public final boolean isInRange(int i7) {
            return TemplateFxFrom.forNumber(i7) != null;
        }
    }

    TemplateFxFrom(int i7) {
        this.value = i7;
    }

    public static TemplateFxFrom forNumber(int i7) {
        if (i7 == 0) {
            return TemplateFxFromDefault;
        }
        if (i7 == 1) {
            return TemplateFxFromOnekeyTemplate;
        }
        if (i7 != 2) {
            return null;
        }
        return TemplateFxFromUGCTemplate;
    }

    public static Internal.EnumLiteMap<TemplateFxFrom> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f108883a;
    }

    @Deprecated
    public static TemplateFxFrom valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
