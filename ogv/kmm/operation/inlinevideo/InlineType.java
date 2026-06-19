package com.bilibili.ogv.kmm.operation.inlinevideo;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/InlineType.class */
@Serializable(with = f.class)
public final class InlineType {
    private static final EnumEntries $ENTRIES;
    private static final InlineType[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final InlineType TYPE_UNKNOWN = new InlineType("TYPE_UNKNOWN", 0);
    public static final InlineType TYPE_WHOLE = new InlineType("TYPE_WHOLE", 1);
    public static final InlineType TYPE_HE_CLIP = new InlineType("TYPE_HE_CLIP", 2);
    public static final InlineType TYPE_PREVIEW = new InlineType("TYPE_PREVIEW", 3);

    private static final /* synthetic */ InlineType[] $values() {
        return new InlineType[]{TYPE_UNKNOWN, TYPE_WHOLE, TYPE_HE_CLIP, TYPE_PREVIEW};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ogv.kmm.operation.inlinevideo.InlineType$a] */
    static {
        InlineType[] inlineTypeArr$values = $values();
        $VALUES = inlineTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(inlineTypeArr$values);
        Companion = new Object() { // from class: com.bilibili.ogv.kmm.operation.inlinevideo.InlineType.a
            @NotNull
            public final KSerializer<InlineType> serializer() {
                return f.f68494c;
            }
        };
    }

    private InlineType(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<InlineType> getEntries() {
        return $ENTRIES;
    }

    public static InlineType valueOf(String str) {
        return (InlineType) Enum.valueOf(InlineType.class, str);
    }

    public static InlineType[] values() {
        return (InlineType[]) $VALUES.clone();
    }
}
