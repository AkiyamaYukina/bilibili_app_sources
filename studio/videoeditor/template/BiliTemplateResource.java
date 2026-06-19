package com.bilibili.studio.videoeditor.template;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/BiliTemplateResource.class */
public final class BiliTemplateResource {
    private static final EnumEntries $ENTRIES;
    private static final BiliTemplateResource[] $VALUES;
    public static final BiliTemplateResource Mod = new BiliTemplateResource("Mod", 0);
    public static final BiliTemplateResource Tribe = new BiliTemplateResource("Tribe", 1);
    public static final BiliTemplateResource TemplateUrl = new BiliTemplateResource("TemplateUrl", 2);
    public static final BiliTemplateResource TemplateMaterial = new BiliTemplateResource("TemplateMaterial", 3);
    public static final BiliTemplateResource UgcTemplate = new BiliTemplateResource("UgcTemplate", 4);

    private static final /* synthetic */ BiliTemplateResource[] $values() {
        return new BiliTemplateResource[]{Mod, Tribe, TemplateUrl, TemplateMaterial, UgcTemplate};
    }

    static {
        BiliTemplateResource[] biliTemplateResourceArr$values = $values();
        $VALUES = biliTemplateResourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biliTemplateResourceArr$values);
    }

    private BiliTemplateResource(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<BiliTemplateResource> getEntries() {
        return $ENTRIES;
    }

    public static BiliTemplateResource valueOf(String str) {
        return (BiliTemplateResource) Enum.valueOf(BiliTemplateResource.class, str);
    }

    public static BiliTemplateResource[] values() {
        return (BiliTemplateResource[]) $VALUES.clone();
    }
}
