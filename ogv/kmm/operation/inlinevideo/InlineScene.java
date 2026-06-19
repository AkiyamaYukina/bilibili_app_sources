package com.bilibili.ogv.kmm.operation.inlinevideo;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/InlineScene.class */
@Serializable(with = e.class)
public final class InlineScene {
    private static final EnumEntries $ENTRIES;
    private static final InlineScene[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final InlineScene UNKNOWN = new InlineScene("UNKNOWN", 0);
    public static final InlineScene RELATED_EP = new InlineScene("RELATED_EP", 1);
    public static final InlineScene HIGH_LIGHT = new InlineScene("HIGH_LIGHT", 2);
    public static final InlineScene SKIP = new InlineScene("SKIP", 3);

    private static final /* synthetic */ InlineScene[] $values() {
        return new InlineScene[]{UNKNOWN, RELATED_EP, HIGH_LIGHT, SKIP};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ogv.kmm.operation.inlinevideo.InlineScene$a] */
    static {
        InlineScene[] inlineSceneArr$values = $values();
        $VALUES = inlineSceneArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(inlineSceneArr$values);
        Companion = new Object() { // from class: com.bilibili.ogv.kmm.operation.inlinevideo.InlineScene.a
            @NotNull
            public final KSerializer<InlineScene> serializer() {
                return e.f68493c;
            }
        };
    }

    private InlineScene(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<InlineScene> getEntries() {
        return $ENTRIES;
    }

    public static InlineScene valueOf(String str) {
        return (InlineScene) Enum.valueOf(InlineScene.class, str);
    }

    public static InlineScene[] values() {
        return (InlineScene[]) $VALUES.clone();
    }
}
