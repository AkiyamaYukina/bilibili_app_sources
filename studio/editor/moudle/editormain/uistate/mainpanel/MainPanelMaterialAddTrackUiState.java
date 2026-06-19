package com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel;

import Ly0.K;
import androidx.compose.animation.z;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelMaterialAddTrackUiState.class */
public final class MainPanelMaterialAddTrackUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f107110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function1<Boolean, Unit> f107111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f107112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RecognitionState f107113e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/uistate/mainpanel/MainPanelMaterialAddTrackUiState$RecognitionState.class */
    public static final class RecognitionState {
        private static final EnumEntries $ENTRIES;
        private static final RecognitionState[] $VALUES;

        @NotNull
        private final String msg;
        public static final RecognitionState IDLE = new RecognitionState("IDLE", 0, "未开始");
        public static final RecognitionState SHOW_BTN = new RecognitionState("SHOW_BTN", 1, "展示语音识别按钮");
        public static final RecognitionState HIDE_BTN = new RecognitionState("HIDE_BTN", 2, "隐藏语音识别按钮");

        private static final /* synthetic */ RecognitionState[] $values() {
            return new RecognitionState[]{IDLE, SHOW_BTN, HIDE_BTN};
        }

        static {
            RecognitionState[] recognitionStateArr$values = $values();
            $VALUES = recognitionStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(recognitionStateArr$values);
        }

        private RecognitionState(String str, int i7, String str2) {
            this.msg = str2;
        }

        @NotNull
        public static EnumEntries<RecognitionState> getEntries() {
            return $ENTRIES;
        }

        public static RecognitionState valueOf(String str) {
            return (RecognitionState) Enum.valueOf(RecognitionState.class, str);
        }

        public static RecognitionState[] values() {
            return (RecognitionState[]) $VALUES.clone();
        }

        @NotNull
        public final String getMsg() {
            return this.msg;
        }
    }

    public /* synthetic */ MainPanelMaterialAddTrackUiState() {
        this(true, null, null, false, RecognitionState.IDLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainPanelMaterialAddTrackUiState(boolean z6, @Nullable Function0<Unit> function0, @Nullable Function1<? super Boolean, Unit> function1, boolean z7, @NotNull RecognitionState recognitionState) {
        this.f107109a = z6;
        this.f107110b = function0;
        this.f107111c = function1;
        this.f107112d = z7;
        this.f107113e = recognitionState;
    }

    public static MainPanelMaterialAddTrackUiState a(MainPanelMaterialAddTrackUiState mainPanelMaterialAddTrackUiState, boolean z6, Function0 function0, K k7, boolean z7, RecognitionState recognitionState, int i7) {
        if ((i7 & 1) != 0) {
            z6 = mainPanelMaterialAddTrackUiState.f107109a;
        }
        if ((i7 & 2) != 0) {
            function0 = mainPanelMaterialAddTrackUiState.f107110b;
        }
        Function1<Boolean, Unit> function1 = k7;
        if ((i7 & 4) != 0) {
            function1 = mainPanelMaterialAddTrackUiState.f107111c;
        }
        if ((i7 & 16) != 0) {
            recognitionState = mainPanelMaterialAddTrackUiState.f107113e;
        }
        return new MainPanelMaterialAddTrackUiState(z6, function0, function1, z7, recognitionState);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPanelMaterialAddTrackUiState)) {
            return false;
        }
        MainPanelMaterialAddTrackUiState mainPanelMaterialAddTrackUiState = (MainPanelMaterialAddTrackUiState) obj;
        return this.f107109a == mainPanelMaterialAddTrackUiState.f107109a && Intrinsics.areEqual(this.f107110b, mainPanelMaterialAddTrackUiState.f107110b) && Intrinsics.areEqual(this.f107111c, mainPanelMaterialAddTrackUiState.f107111c) && this.f107112d == mainPanelMaterialAddTrackUiState.f107112d && this.f107113e == mainPanelMaterialAddTrackUiState.f107113e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f107109a);
        int iHashCode2 = 0;
        Function0<Unit> function0 = this.f107110b;
        int iHashCode3 = function0 == null ? 0 : function0.hashCode();
        Function1<Boolean, Unit> function1 = this.f107111c;
        if (function1 != null) {
            iHashCode2 = function1.hashCode();
        }
        return this.f107113e.hashCode() + z.a(((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31, 31, this.f107112d);
    }

    @NotNull
    public final String toString() {
        return "MainPanelMaterialAddTrackUiState(show=" + this.f107109a + ", onMaterialAddClick=" + this.f107110b + ", onMaterialRecognitionClick=" + this.f107111c + ", isUpdateTrackType=" + this.f107112d + ", recognitionState=" + this.f107113e + ")";
    }
}
