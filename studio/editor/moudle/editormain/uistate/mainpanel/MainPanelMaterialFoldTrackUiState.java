package com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel;

import androidx.compose.animation.z;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import java.util.List;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelMaterialFoldTrackUiState.class */
public final class MainPanelMaterialFoldTrackUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliEditorMaterialType f107120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final BiliEditorMaterialMultiInfo f107122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<BiliEditorMaterialMultiInfo> f107123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<BiliEditorMaterialMultiInfo, Unit> f107124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final UpdateMode f107125f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelMaterialFoldTrackUiState$UpdateMode.class */
    public static final class UpdateMode {
        private static final EnumEntries $ENTRIES;
        private static final UpdateMode[] $VALUES;
        public static final UpdateMode UPDATE = new UpdateMode("UPDATE", 0);
        public static final UpdateMode ALL = new UpdateMode("ALL", 1);

        private static final /* synthetic */ UpdateMode[] $values() {
            return new UpdateMode[]{UPDATE, ALL};
        }

        static {
            UpdateMode[] updateModeArr$values = $values();
            $VALUES = updateModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(updateModeArr$values);
        }

        private UpdateMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<UpdateMode> getEntries() {
            return $ENTRIES;
        }

        public static UpdateMode valueOf(String str) {
            return (UpdateMode) Enum.valueOf(UpdateMode.class, str);
        }

        public static UpdateMode[] values() {
            return (UpdateMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MainPanelMaterialFoldTrackUiState(BiliEditorMaterialType biliEditorMaterialType) {
        this(biliEditorMaterialType, false, null, null, null, UpdateMode.ALL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainPanelMaterialFoldTrackUiState(@NotNull BiliEditorMaterialType biliEditorMaterialType, boolean z6, @Nullable BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, @Nullable List<BiliEditorMaterialMultiInfo> list, @Nullable Function1<? super BiliEditorMaterialMultiInfo, Unit> function1, @NotNull UpdateMode updateMode) {
        this.f107120a = biliEditorMaterialType;
        this.f107121b = z6;
        this.f107122c = biliEditorMaterialMultiInfo;
        this.f107123d = list;
        this.f107124e = function1;
        this.f107125f = updateMode;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPanelMaterialFoldTrackUiState)) {
            return false;
        }
        MainPanelMaterialFoldTrackUiState mainPanelMaterialFoldTrackUiState = (MainPanelMaterialFoldTrackUiState) obj;
        return this.f107120a == mainPanelMaterialFoldTrackUiState.f107120a && this.f107121b == mainPanelMaterialFoldTrackUiState.f107121b && Intrinsics.areEqual(this.f107122c, mainPanelMaterialFoldTrackUiState.f107122c) && Intrinsics.areEqual(this.f107123d, mainPanelMaterialFoldTrackUiState.f107123d) && Intrinsics.areEqual(this.f107124e, mainPanelMaterialFoldTrackUiState.f107124e) && this.f107125f == mainPanelMaterialFoldTrackUiState.f107125f;
    }

    public final int hashCode() {
        int iA = z.a(this.f107120a.hashCode() * 31, 31, this.f107121b);
        int iHashCode = 0;
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo = this.f107122c;
        int iHashCode2 = biliEditorMaterialMultiInfo == null ? 0 : biliEditorMaterialMultiInfo.hashCode();
        List<BiliEditorMaterialMultiInfo> list = this.f107123d;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Function1<BiliEditorMaterialMultiInfo, Unit> function1 = this.f107124e;
        if (function1 != null) {
            iHashCode = function1.hashCode();
        }
        return this.f107125f.hashCode() + ((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        return "MainPanelMaterialFoldTrackUiState(materialType=" + this.f107120a + ", show=" + this.f107121b + ", selectMaterial=" + this.f107122c + ", materialList=" + this.f107123d + ", trackClickListener=" + this.f107124e + ", updateMode=" + this.f107125f + ")";
    }
}
