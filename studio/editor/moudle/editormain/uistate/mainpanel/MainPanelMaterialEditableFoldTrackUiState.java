package com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel;

import Ly0.B;
import Ux0.a;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelMaterialEditableFoldTrackUiState.class */
public final class MainPanelMaterialEditableFoldTrackUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliEditorMaterialType f107114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<BiliEditorMaterialMultiInfo> f107115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final BiliEditorMaterialMultiInfo f107116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final a f107117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final BiliEditorMaterialMultiInfo f107118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final UpdateMode f107119f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelMaterialEditableFoldTrackUiState$UpdateMode.class */
    public static final class UpdateMode {
        private static final EnumEntries $ENTRIES;
        private static final UpdateMode[] $VALUES;
        public static final UpdateMode ADD = new UpdateMode("ADD", 0);
        public static final UpdateMode DELETE = new UpdateMode("DELETE", 1);
        public static final UpdateMode UPDATE = new UpdateMode("UPDATE", 2);
        public static final UpdateMode SELECT = new UpdateMode("SELECT", 3);
        public static final UpdateMode ALL = new UpdateMode("ALL", 4);

        private static final /* synthetic */ UpdateMode[] $values() {
            return new UpdateMode[]{ADD, DELETE, UPDATE, SELECT, ALL};
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

    public MainPanelMaterialEditableFoldTrackUiState(@NotNull BiliEditorMaterialType biliEditorMaterialType, @Nullable List<BiliEditorMaterialMultiInfo> list, @Nullable BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, @Nullable a aVar, @Nullable BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2, @NotNull UpdateMode updateMode) {
        this.f107114a = biliEditorMaterialType;
        this.f107115b = list;
        this.f107116c = biliEditorMaterialMultiInfo;
        this.f107117d = aVar;
        this.f107118e = biliEditorMaterialMultiInfo2;
        this.f107119f = updateMode;
    }

    public static MainPanelMaterialEditableFoldTrackUiState a(MainPanelMaterialEditableFoldTrackUiState mainPanelMaterialEditableFoldTrackUiState, BiliEditorMaterialType biliEditorMaterialType, List list, BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, B b7, BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2, UpdateMode updateMode, int i7) {
        if ((i7 & 1) != 0) {
            biliEditorMaterialType = mainPanelMaterialEditableFoldTrackUiState.f107114a;
        }
        if ((i7 & 2) != 0) {
            list = mainPanelMaterialEditableFoldTrackUiState.f107115b;
        }
        if ((i7 & 4) != 0) {
            biliEditorMaterialMultiInfo = mainPanelMaterialEditableFoldTrackUiState.f107116c;
        }
        a aVar = b7;
        if ((i7 & 8) != 0) {
            aVar = mainPanelMaterialEditableFoldTrackUiState.f107117d;
        }
        if ((i7 & 16) != 0) {
            biliEditorMaterialMultiInfo2 = mainPanelMaterialEditableFoldTrackUiState.f107118e;
        }
        return new MainPanelMaterialEditableFoldTrackUiState(biliEditorMaterialType, list, biliEditorMaterialMultiInfo, aVar, biliEditorMaterialMultiInfo2, updateMode);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPanelMaterialEditableFoldTrackUiState)) {
            return false;
        }
        MainPanelMaterialEditableFoldTrackUiState mainPanelMaterialEditableFoldTrackUiState = (MainPanelMaterialEditableFoldTrackUiState) obj;
        return this.f107114a == mainPanelMaterialEditableFoldTrackUiState.f107114a && Intrinsics.areEqual(this.f107115b, mainPanelMaterialEditableFoldTrackUiState.f107115b) && Intrinsics.areEqual(this.f107116c, mainPanelMaterialEditableFoldTrackUiState.f107116c) && Intrinsics.areEqual(this.f107117d, mainPanelMaterialEditableFoldTrackUiState.f107117d) && Intrinsics.areEqual(this.f107118e, mainPanelMaterialEditableFoldTrackUiState.f107118e) && this.f107119f == mainPanelMaterialEditableFoldTrackUiState.f107119f;
    }

    public final int hashCode() {
        int iHashCode = this.f107114a.hashCode();
        List<BiliEditorMaterialMultiInfo> list = this.f107115b;
        int iHashCode2 = 0;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo = this.f107116c;
        int iHashCode4 = biliEditorMaterialMultiInfo == null ? 0 : biliEditorMaterialMultiInfo.hashCode();
        a aVar = this.f107117d;
        int iHashCode5 = aVar == null ? 0 : aVar.hashCode();
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 = this.f107118e;
        if (biliEditorMaterialMultiInfo2 != null) {
            iHashCode2 = biliEditorMaterialMultiInfo2.hashCode();
        }
        return this.f107119f.hashCode() + (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31);
    }

    @NotNull
    public final String toString() {
        return "MainPanelMaterialEditableFoldTrackUiState(materialType=" + this.f107114a + ", materialList=" + this.f107115b + ", selectMaterial=" + this.f107116c + ", listener=" + this.f107117d + ", actionMaterial=" + this.f107118e + ", updateMode=" + this.f107119f + ")";
    }
}
