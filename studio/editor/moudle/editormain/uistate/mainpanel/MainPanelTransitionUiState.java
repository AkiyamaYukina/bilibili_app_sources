package com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelTransitionUiState.class */
public final class MainPanelTransitionUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UpdateMode f107126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<TransitionInfo> f107127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TransitionInfo f107129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f107130e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelTransitionUiState$UpdateMode.class */
    public static final class UpdateMode {
        private static final EnumEntries $ENTRIES;
        private static final UpdateMode[] $VALUES;
        public static final UpdateMode LIST = new UpdateMode("LIST", 0);
        public static final UpdateMode ITEM = new UpdateMode("ITEM", 1);
        public static final UpdateMode SELECT = new UpdateMode("SELECT", 2);

        private static final /* synthetic */ UpdateMode[] $values() {
            return new UpdateMode[]{LIST, ITEM, SELECT};
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

    public MainPanelTransitionUiState() {
        this(0);
    }

    public /* synthetic */ MainPanelTransitionUiState(int i7) {
        this(UpdateMode.LIST, null, -1, null, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainPanelTransitionUiState(@NotNull UpdateMode updateMode, @Nullable List<? extends TransitionInfo> list, int i7, @Nullable TransitionInfo transitionInfo, int i8) {
        this.f107126a = updateMode;
        this.f107127b = list;
        this.f107128c = i7;
        this.f107129d = transitionInfo;
        this.f107130e = i8;
    }

    public static MainPanelTransitionUiState a(MainPanelTransitionUiState mainPanelTransitionUiState, UpdateMode updateMode, List list, int i7, TransitionInfo transitionInfo, int i8, int i9) {
        if ((i9 & 2) != 0) {
            list = mainPanelTransitionUiState.f107127b;
        }
        if ((i9 & 4) != 0) {
            i7 = mainPanelTransitionUiState.f107128c;
        }
        if ((i9 & 8) != 0) {
            transitionInfo = mainPanelTransitionUiState.f107129d;
        }
        if ((i9 & 16) != 0) {
            i8 = mainPanelTransitionUiState.f107130e;
        }
        return new MainPanelTransitionUiState(updateMode, list, i7, transitionInfo, i8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPanelTransitionUiState)) {
            return false;
        }
        MainPanelTransitionUiState mainPanelTransitionUiState = (MainPanelTransitionUiState) obj;
        return this.f107126a == mainPanelTransitionUiState.f107126a && Intrinsics.areEqual(this.f107127b, mainPanelTransitionUiState.f107127b) && this.f107128c == mainPanelTransitionUiState.f107128c && Intrinsics.areEqual(this.f107129d, mainPanelTransitionUiState.f107129d) && this.f107130e == mainPanelTransitionUiState.f107130e;
    }

    public final int hashCode() {
        int iHashCode = this.f107126a.hashCode();
        List<TransitionInfo> list = this.f107127b;
        int iA = I.a(this.f107128c, ((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31, 31);
        TransitionInfo transitionInfo = this.f107129d;
        return Integer.hashCode(this.f107130e) + ((iA + (transitionInfo == null ? 0 : transitionInfo.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        List<TransitionInfo> list = this.f107127b;
        StringBuilder sb = new StringBuilder("MainPanelTransitionUiState(updateMode=");
        sb.append(this.f107126a);
        sb.append(", transitionList=");
        sb.append(list);
        sb.append(", updateIndex=");
        sb.append(this.f107128c);
        sb.append(", updateTransition=");
        sb.append(this.f107129d);
        sb.append(", selectIndex=");
        return C4277b.a(this.f107130e, ")", sb);
    }
}
