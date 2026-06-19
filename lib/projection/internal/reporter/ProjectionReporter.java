package com.bilibili.lib.projection.internal.reporter;

import ie0.InterfaceC7569h;
import ke0.InterfaceC7753a;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/reporter/ProjectionReporter.class */
public interface ProjectionReporter extends InterfaceC7753a<InterfaceC7569h> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/reporter/ProjectionReporter$ControlPageButtonType.class */
    public static final class ControlPageButtonType {
        private static final EnumEntries $ENTRIES;
        private static final ControlPageButtonType[] $VALUES;
        private final int type;
        public static final ControlPageButtonType LeftTopBackButton = new ControlPageButtonType("LeftTopBackButton", 0, 1);
        public static final ControlPageButtonType RightTopCloseButton = new ControlPageButtonType("RightTopCloseButton", 1, 2);
        public static final ControlPageButtonType SwitchDeviceButton = new ControlPageButtonType("SwitchDeviceButton", 2, 3);
        public static final ControlPageButtonType DamakuButton = new ControlPageButtonType("DamakuButton", 3, 4);
        public static final ControlPageButtonType VideoSpeedButton = new ControlPageButtonType("VideoSpeedButton", 4, 5);
        public static final ControlPageButtonType QualityButton = new ControlPageButtonType("QualityButton", 5, 6);
        public static final ControlPageButtonType ProgressBackButton = new ControlPageButtonType("ProgressBackButton", 6, 7);
        public static final ControlPageButtonType PlayPauseButton = new ControlPageButtonType("PlayPauseButton", 7, 8);
        public static final ControlPageButtonType ProgressForwardButton = new ControlPageButtonType("ProgressForwardButton", 8, 9);
        public static final ControlPageButtonType MoveSeekbar = new ControlPageButtonType("MoveSeekbar", 9, 10);
        public static final ControlPageButtonType SelectionButton = new ControlPageButtonType("SelectionButton", 10, 11);
        public static final ControlPageButtonType NextSelectionButton = new ControlPageButtonType("NextSelectionButton", 11, 12);
        public static final ControlPageButtonType HalfFullControlButton = new ControlPageButtonType("HalfFullControlButton", 12, 13);
        public static final ControlPageButtonType ReplayButton = new ControlPageButtonType("ReplayButton", 13, 14);

        private static final /* synthetic */ ControlPageButtonType[] $values() {
            return new ControlPageButtonType[]{LeftTopBackButton, RightTopCloseButton, SwitchDeviceButton, DamakuButton, VideoSpeedButton, QualityButton, ProgressBackButton, PlayPauseButton, ProgressForwardButton, MoveSeekbar, SelectionButton, NextSelectionButton, HalfFullControlButton, ReplayButton};
        }

        static {
            ControlPageButtonType[] controlPageButtonTypeArr$values = $values();
            $VALUES = controlPageButtonTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(controlPageButtonTypeArr$values);
        }

        private ControlPageButtonType(String str, int i7, int i8) {
            this.type = i8;
        }

        @NotNull
        public static EnumEntries<ControlPageButtonType> getEntries() {
            return $ENTRIES;
        }

        public static ControlPageButtonType valueOf(String str) {
            return (ControlPageButtonType) Enum.valueOf(ControlPageButtonType.class, str);
        }

        public static ControlPageButtonType[] values() {
            return (ControlPageButtonType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/reporter/ProjectionReporter$PanelMode.class */
    public static final class PanelMode {
        private static final EnumEntries $ENTRIES;
        private static final PanelMode[] $VALUES;

        @NotNull
        private final String type;
        public static final PanelMode Half = new PanelMode("Half", 0, "half");
        public static final PanelMode Full = new PanelMode("Full", 1, "full");

        private static final /* synthetic */ PanelMode[] $values() {
            return new PanelMode[]{Half, Full};
        }

        static {
            PanelMode[] panelModeArr$values = $values();
            $VALUES = panelModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(panelModeArr$values);
        }

        private PanelMode(String str, int i7, String str2) {
            this.type = str2;
        }

        @NotNull
        public static EnumEntries<PanelMode> getEntries() {
            return $ENTRIES;
        }

        public static PanelMode valueOf(String str) {
            return (PanelMode) Enum.valueOf(PanelMode.class, str);
        }

        public static PanelMode[] values() {
            return (PanelMode[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    static /* synthetic */ void C(ProjectionReporter projectionReporter, boolean z6, String str, String str2, String str3, int i7) {
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        projectionReporter.m(str, str2, str3, z6);
    }

    void m(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z6);
}
