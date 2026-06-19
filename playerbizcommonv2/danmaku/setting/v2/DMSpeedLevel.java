package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import androidx.annotation.StringRes;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMSpeedLevel.class */
public final class DMSpeedLevel {
    private static final EnumEntries $ENTRIES;
    private static final DMSpeedLevel[] $VALUES;

    @NotNull
    public static final a Companion;
    private final float duration;
    private final int level;
    private final float speed;
    public static final DMSpeedLevel SLOWEST = new DMSpeedLevel("SLOWEST", 0, 10.0f, 2131845940, 10.0f);
    public static final DMSpeedLevel SLOWER = new DMSpeedLevel("SLOWER", 1, 20.0f, 2131845941, 8.5f);
    public static final DMSpeedLevel NORMAL = new DMSpeedLevel("NORMAL", 2, 30.0f, 2131845942, 7.0f);
    public static final DMSpeedLevel FASTER = new DMSpeedLevel("FASTER", 3, 40.0f, 2131845943, 5.5f);
    public static final DMSpeedLevel FASTEST = new DMSpeedLevel("FASTEST", 4, 50.0f, 2131845946, 4.0f);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DMSpeedLevel$a.class */
    public static final class a {
        @NotNull
        public static DMSpeedLevel a(float f7) {
            DMSpeedLevel dMSpeedLevel = DMSpeedLevel.SLOWEST;
            if (f7 != dMSpeedLevel.getDuration()) {
                dMSpeedLevel = DMSpeedLevel.SLOWER;
                if (f7 != dMSpeedLevel.getDuration()) {
                    dMSpeedLevel = DMSpeedLevel.FASTER;
                    if (f7 != dMSpeedLevel.getDuration()) {
                        dMSpeedLevel = DMSpeedLevel.FASTEST;
                        if (f7 != dMSpeedLevel.getDuration()) {
                            dMSpeedLevel = DMSpeedLevel.NORMAL;
                        }
                    }
                }
            }
            return dMSpeedLevel;
        }

        @NotNull
        public static DMSpeedLevel b(float f7) {
            DMSpeedLevel dMSpeedLevel = DMSpeedLevel.SLOWEST;
            if (f7 != dMSpeedLevel.getSpeed()) {
                dMSpeedLevel = DMSpeedLevel.SLOWER;
                if (f7 != dMSpeedLevel.getSpeed()) {
                    dMSpeedLevel = DMSpeedLevel.FASTER;
                    if (f7 != dMSpeedLevel.getSpeed()) {
                        dMSpeedLevel = DMSpeedLevel.FASTEST;
                        if (f7 != dMSpeedLevel.getSpeed()) {
                            dMSpeedLevel = DMSpeedLevel.NORMAL;
                        }
                    }
                }
            }
            return dMSpeedLevel;
        }
    }

    private static final /* synthetic */ DMSpeedLevel[] $values() {
        return new DMSpeedLevel[]{SLOWEST, SLOWER, NORMAL, FASTER, FASTEST};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMSpeedLevel$a, java.lang.Object] */
    static {
        DMSpeedLevel[] dMSpeedLevelArr$values = $values();
        $VALUES = dMSpeedLevelArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dMSpeedLevelArr$values);
        Companion = new Object();
    }

    private DMSpeedLevel(String str, @StringRes int i7, float f7, int i8, float f8) {
        this.speed = f7;
        this.level = i8;
        this.duration = f8;
    }

    @NotNull
    public static EnumEntries<DMSpeedLevel> getEntries() {
        return $ENTRIES;
    }

    public static DMSpeedLevel valueOf(String str) {
        return (DMSpeedLevel) Enum.valueOf(DMSpeedLevel.class, str);
    }

    public static DMSpeedLevel[] values() {
        return (DMSpeedLevel[]) $VALUES.clone();
    }

    public final float getDuration() {
        return this.duration;
    }

    public final int getLevel() {
        return this.level;
    }

    public final float getSpeed() {
        return this.speed;
    }
}
