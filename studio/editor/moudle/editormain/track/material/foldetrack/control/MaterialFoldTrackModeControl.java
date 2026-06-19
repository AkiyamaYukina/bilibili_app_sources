package com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/control/MaterialFoldTrackModeControl.class */
public final class MaterialFoldTrackModeControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f106207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f106208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f106209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public TrackMode f106211e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/control/MaterialFoldTrackModeControl$TrackMode.class */
    public static final class TrackMode {
        private static final EnumEntries $ENTRIES;
        private static final TrackMode[] $VALUES;
        public static final TrackMode MODE_EDIT = new TrackMode("MODE_EDIT", 0);
        public static final TrackMode MODE_WEAK_SELECT = new TrackMode("MODE_WEAK_SELECT", 1);
        public static final TrackMode MODE_SHOW = new TrackMode("MODE_SHOW", 2);

        private static final /* synthetic */ TrackMode[] $values() {
            return new TrackMode[]{MODE_EDIT, MODE_WEAK_SELECT, MODE_SHOW};
        }

        static {
            TrackMode[] trackModeArr$values = $values();
            $VALUES = trackModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(trackModeArr$values);
        }

        private TrackMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<TrackMode> getEntries() {
            return $ENTRIES;
        }

        public static TrackMode valueOf(String str) {
            return (TrackMode) Enum.valueOf(TrackMode.class, str);
        }

        public static TrackMode[] values() {
            return (TrackMode[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/control/MaterialFoldTrackModeControl$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f106212a;

        static {
            int[] iArr = new int[TrackMode.values().length];
            try {
                iArr[TrackMode.MODE_EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[TrackMode.MODE_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[TrackMode.MODE_WEAK_SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f106212a = iArr;
        }
    }
}
