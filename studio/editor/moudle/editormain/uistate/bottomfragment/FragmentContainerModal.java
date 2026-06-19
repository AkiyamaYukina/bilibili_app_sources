package com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/bottomfragment/FragmentContainerModal.class */
public final class FragmentContainerModal {
    private static final EnumEntries $ENTRIES;
    private static final FragmentContainerModal[] $VALUES;
    public static final FragmentContainerModal MODAL_HALF_LESS = new FragmentContainerModal("MODAL_HALF_LESS", 0);
    public static final FragmentContainerModal MODAL_HALF = new FragmentContainerModal("MODAL_HALF", 1);
    public static final FragmentContainerModal MODAL_ALL = new FragmentContainerModal("MODAL_ALL", 2);
    public static final FragmentContainerModal MODAL_FULL_SCREEN = new FragmentContainerModal("MODAL_FULL_SCREEN", 3);
    public static final FragmentContainerModal MODAL_LOADING = new FragmentContainerModal("MODAL_LOADING", 4);

    private static final /* synthetic */ FragmentContainerModal[] $values() {
        return new FragmentContainerModal[]{MODAL_HALF_LESS, MODAL_HALF, MODAL_ALL, MODAL_FULL_SCREEN, MODAL_LOADING};
    }

    static {
        FragmentContainerModal[] fragmentContainerModalArr$values = $values();
        $VALUES = fragmentContainerModalArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fragmentContainerModalArr$values);
    }

    private FragmentContainerModal(String str, int i7) {
    }

    @NotNull
    public static EnumEntries<FragmentContainerModal> getEntries() {
        return $ENTRIES;
    }

    public static FragmentContainerModal valueOf(String str) {
        return (FragmentContainerModal) Enum.valueOf(FragmentContainerModal.class, str);
    }

    public static FragmentContainerModal[] values() {
        return (FragmentContainerModal[]) $VALUES.clone();
    }
}
