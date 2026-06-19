package com.bilibili.studio.editor.timeline;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/UpperEngineScene.class */
public final class UpperEngineScene {
    private static final EnumEntries $ENTRIES;
    private static final UpperEngineScene[] $VALUES;

    @NotNull
    private final String contextType;

    @NotNull
    private String coreType;

    @NotNull
    private Map<String, String> extra;
    public static final UpperEngineScene MAIN_DEFAULT = new UpperEngineScene("MAIN_DEFAULT", 0, "StudioMon", "main", null, 4, null);
    public static final UpperEngineScene MAIN_ENGINE = new UpperEngineScene("MAIN_ENGINE", 1, "StudioMon", "main", null, 4, null);
    public static final UpperEngineScene CAPTURE_PREVIEW = new UpperEngineScene("CAPTURE_PREVIEW", 2, "StudioMon", "main", null, 4, null);
    public static final UpperEngineScene KING_HONOUR = new UpperEngineScene("KING_HONOUR", 3, "StudioMon", "main", null, 4, null);
    public static final UpperEngineScene COMPILE_SDK = new UpperEngineScene("COMPILE_SDK", 4, "StudioMon", "main", null, 4, null);
    public static final UpperEngineScene PUBLISH = new UpperEngineScene("PUBLISH", 5, "StudioMon", "auxiliary", null, 4, null);
    public static final UpperEngineScene PUBLISH_COVER_CROP = new UpperEngineScene("PUBLISH_COVER_CROP", 6, "StudioMon", "auxiliary", null, 4, null);
    public static final UpperEngineScene PUBLISH_COVER_CROP_169 = new UpperEngineScene("PUBLISH_COVER_CROP_169", 7, "StudioMon", "auxiliary", null, 4, null);
    public static final UpperEngineScene PUBLISH_MULTI_COVER_CROP_MAIN = new UpperEngineScene("PUBLISH_MULTI_COVER_CROP_MAIN", 8, "StudioMon", "main", null, 4, null);
    public static final UpperEngineScene PUBLISH_MULTI_COVER_CROP_SUB = new UpperEngineScene("PUBLISH_MULTI_COVER_CROP_SUB", 9, "StudioMon", "auxiliary", null, 4, null);

    private static final /* synthetic */ UpperEngineScene[] $values() {
        return new UpperEngineScene[]{MAIN_DEFAULT, MAIN_ENGINE, CAPTURE_PREVIEW, KING_HONOUR, COMPILE_SDK, PUBLISH, PUBLISH_COVER_CROP, PUBLISH_COVER_CROP_169, PUBLISH_MULTI_COVER_CROP_MAIN, PUBLISH_MULTI_COVER_CROP_SUB};
    }

    static {
        UpperEngineScene[] upperEngineSceneArr$values = $values();
        $VALUES = upperEngineSceneArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(upperEngineSceneArr$values);
    }

    private UpperEngineScene(String str, int i7, String str2, String str3, Map map) {
        this.coreType = str2;
        this.contextType = str3;
        this.extra = map;
    }

    public /* synthetic */ UpperEngineScene(String str, int i7, String str2, String str3, Map map, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7, str2, str3, (i8 & 4) != 0 ? new LinkedHashMap() : map);
    }

    @NotNull
    public static EnumEntries<UpperEngineScene> getEntries() {
        return $ENTRIES;
    }

    public static UpperEngineScene valueOf(String str) {
        return (UpperEngineScene) Enum.valueOf(UpperEngineScene.class, str);
    }

    public static UpperEngineScene[] values() {
        return (UpperEngineScene[]) $VALUES.clone();
    }

    @NotNull
    public final String getContextType() {
        return this.contextType;
    }

    @NotNull
    public final String getCoreType() {
        return this.coreType;
    }

    @NotNull
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getInfo() {
        String strName = name();
        String str = this.coreType;
        String str2 = this.contextType;
        StringBuilder sbA = G0.b.a("name: ", strName, " coreType: ", str, " contextType: ");
        sbA.append(str2);
        return sbA.toString();
    }

    @Nullable
    public final String getInitFrom() {
        return this.extra.get("init_from");
    }

    public final boolean isAuxiliaryContext() {
        return Intrinsics.areEqual(this.contextType, "auxiliary");
    }

    public final void setCoreType(@NotNull String str) {
        this.coreType = str;
    }

    public final void setExtra(@NotNull Map<String, String> map) {
        this.extra = map;
    }

    @NotNull
    public final UpperEngineScene setInitFrom(@NotNull String str) {
        this.extra.put("init_from", str);
        return this;
    }
}
