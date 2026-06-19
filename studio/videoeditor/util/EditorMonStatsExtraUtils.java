package com.bilibili.studio.videoeditor.util;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorMonStatsExtraUtils.class */
public final class EditorMonStatsExtraUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorMonStatsExtraUtils$SCENE.class */
    public static final class SCENE {
        private static final EnumEntries $ENTRIES;
        private static final SCENE[] $VALUES;
        public static final SCENE MAIN_EDITOR = new SCENE("MAIN_EDITOR", 0, 2);
        public static final SCENE SMART_TEMPLATE = new SCENE("SMART_TEMPLATE", 1, 4);
        private final int code;

        private static final /* synthetic */ SCENE[] $values() {
            return new SCENE[]{MAIN_EDITOR, SMART_TEMPLATE};
        }

        static {
            SCENE[] sceneArr$values = $values();
            $VALUES = sceneArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sceneArr$values);
        }

        private SCENE(String str, int i7, int i8) {
            this.code = i8;
        }

        @NotNull
        public static EnumEntries<SCENE> getEntries() {
            return $ENTRIES;
        }

        public static SCENE valueOf(String str) {
            return (SCENE) Enum.valueOf(SCENE.class, str);
        }

        public static SCENE[] values() {
            return (SCENE[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r6, @org.jetbrains.annotations.Nullable com.bilibili.studio.editor.timeline.i r7) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.EditorMonStatsExtraUtils.a(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.editor.timeline.i):void");
    }
}
