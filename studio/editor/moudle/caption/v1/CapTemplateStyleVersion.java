package com.bilibili.studio.editor.moudle.caption.v1;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/CapTemplateStyleVersion.class */
public final class CapTemplateStyleVersion {
    private static final EnumEntries $ENTRIES;
    private static final CapTemplateStyleVersion[] $VALUES;
    public static final CapTemplateStyleVersion OLD_VERSION_NOT_PROPERTY = new CapTemplateStyleVersion("OLD_VERSION_NOT_PROPERTY", 0);
    public static final CapTemplateStyleVersion NEW_VERSION_HAS_PROPERTY = new CapTemplateStyleVersion("NEW_VERSION_HAS_PROPERTY", 1);
    public static final CapTemplateStyleVersion UNDEFINED_VERSION = new CapTemplateStyleVersion("UNDEFINED_VERSION", 2);

    private static final /* synthetic */ CapTemplateStyleVersion[] $values() {
        return new CapTemplateStyleVersion[]{OLD_VERSION_NOT_PROPERTY, NEW_VERSION_HAS_PROPERTY, UNDEFINED_VERSION};
    }

    static {
        CapTemplateStyleVersion[] capTemplateStyleVersionArr$values = $values();
        $VALUES = capTemplateStyleVersionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(capTemplateStyleVersionArr$values);
    }

    private CapTemplateStyleVersion(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<CapTemplateStyleVersion> getEntries() {
        return $ENTRIES;
    }

    public static CapTemplateStyleVersion valueOf(String str) {
        return (CapTemplateStyleVersion) Enum.valueOf(CapTemplateStyleVersion.class, str);
    }

    public static CapTemplateStyleVersion[] values() {
        return (CapTemplateStyleVersion[]) $VALUES.clone();
    }
}
