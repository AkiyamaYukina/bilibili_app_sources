package com.bilibili.studio.comm.material.enums;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/enums/MaterialCollectScene.class */
public final class MaterialCollectScene {
    private static final EnumEntries $ENTRIES;
    private static final MaterialCollectScene[] $VALUES;

    @NotNull
    private final String value;
    public static final MaterialCollectScene SCENE_UP = new MaterialCollectScene("SCENE_UP", 0, "up_publish");
    public static final MaterialCollectScene SCENE_BACK = new MaterialCollectScene("SCENE_BACK", 1, "back_publish");
    public static final MaterialCollectScene SCENE_APP_INI = new MaterialCollectScene("SCENE_APP_INI", 2, "app_start");

    private static final /* synthetic */ MaterialCollectScene[] $values() {
        return new MaterialCollectScene[]{SCENE_UP, SCENE_BACK, SCENE_APP_INI};
    }

    static {
        MaterialCollectScene[] materialCollectSceneArr$values = $values();
        $VALUES = materialCollectSceneArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(materialCollectSceneArr$values);
    }

    private MaterialCollectScene(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MaterialCollectScene> getEntries() {
        return $ENTRIES;
    }

    public static MaterialCollectScene valueOf(String str) {
        return (MaterialCollectScene) Enum.valueOf(MaterialCollectScene.class, str);
    }

    public static MaterialCollectScene[] values() {
        return (MaterialCollectScene[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
