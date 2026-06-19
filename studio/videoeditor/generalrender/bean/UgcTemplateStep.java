package com.bilibili.studio.videoeditor.generalrender.bean;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/UgcTemplateStep.class */
public final class UgcTemplateStep {
    private static final EnumEntries $ENTRIES;
    private static final UgcTemplateStep[] $VALUES;
    public static final UgcTemplateStep UGC_TEMPLATE_LOAD_RESOURCE = new UgcTemplateStep("UGC_TEMPLATE_LOAD_RESOURCE", 0, "ugcTemplateLoadResource");
    public static final UgcTemplateStep UGC_TEMPLATE_PRE_PROCESS = new UgcTemplateStep("UGC_TEMPLATE_PRE_PROCESS", 1, "ugcTemplatePreprocess");
    public static final UgcTemplateStep UGC_TEMPLATE_RENDER_VIDEO = new UgcTemplateStep("UGC_TEMPLATE_RENDER_VIDEO", 2, "ugcTemplateRenderVideo");
    public static final UgcTemplateStep UGC_TEMPLATE_UPLOAD_VIDEO = new UgcTemplateStep("UGC_TEMPLATE_UPLOAD_VIDEO", 3, "ugcTemplateUploadVideo");

    @NotNull
    private String step;

    private static final /* synthetic */ UgcTemplateStep[] $values() {
        return new UgcTemplateStep[]{UGC_TEMPLATE_LOAD_RESOURCE, UGC_TEMPLATE_PRE_PROCESS, UGC_TEMPLATE_RENDER_VIDEO, UGC_TEMPLATE_UPLOAD_VIDEO};
    }

    static {
        UgcTemplateStep[] ugcTemplateStepArr$values = $values();
        $VALUES = ugcTemplateStepArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(ugcTemplateStepArr$values);
    }

    private UgcTemplateStep(String str, int i7, String str2) {
        this.step = str2;
    }

    @NotNull
    public static EnumEntries<UgcTemplateStep> getEntries() {
        return $ENTRIES;
    }

    public static UgcTemplateStep valueOf(String str) {
        return (UgcTemplateStep) Enum.valueOf(UgcTemplateStep.class, str);
    }

    public static UgcTemplateStep[] values() {
        return (UgcTemplateStep[]) $VALUES.clone();
    }

    @NotNull
    public final String getStep() {
        return this.step;
    }

    public final void setStep(@NotNull String str) {
        this.step = str;
    }
}
