package com.bilibili.studio.editor.moudle.intelligence.trace;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/trace/NodeType.class */
public final class NodeType {
    private static final EnumEntries $ENTRIES;
    private static final NodeType[] $VALUES;

    @NotNull
    private final String code;
    public static final NodeType NORMAL = new NodeType("NORMAL", 0, "0");
    public static final NodeType ERROR = new NodeType("ERROR", 1, "1");
    public static final NodeType RESULT = new NodeType("RESULT", 2, "2");

    private static final /* synthetic */ NodeType[] $values() {
        return new NodeType[]{NORMAL, ERROR, RESULT};
    }

    static {
        NodeType[] nodeTypeArr$values = $values();
        $VALUES = nodeTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(nodeTypeArr$values);
    }

    private NodeType(String str, int i7, String str2) {
        this.code = str2;
    }

    @NotNull
    public static EnumEntries<NodeType> getEntries() {
        return $ENTRIES;
    }

    public static NodeType valueOf(String str) {
        return (NodeType) Enum.valueOf(NodeType.class, str);
    }

    public static NodeType[] values() {
        return (NodeType[]) $VALUES.clone();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
