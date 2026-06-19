package com.bilibili.teenagersmode.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.foundation.Foundation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/utils/TeenagersRouter.class */
@StabilityInferred(parameters = 1)
public final class TeenagersRouter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/utils/TeenagersRouter$SourceEvent.class */
    public static final class SourceEvent {
        private static final EnumEntries $ENTRIES;
        private static final SourceEvent[] $VALUES;

        @NotNull
        private final String value;
        public static final SourceEvent DAILY_DIALOG = new SourceEvent("DAILY_DIALOG", 0, "1");
        public static final SourceEvent USER_CENTER = new SourceEvent("USER_CENTER", 1, "2");
        public static final SourceEvent UNDER_FOURTEEN = new SourceEvent("UNDER_FOURTEEN", 2, "3");
        public static final SourceEvent OP_FORCE = new SourceEvent("OP_FORCE", 3, "4");
        public static final SourceEvent GUARDIAN_BIND = new SourceEvent("GUARDIAN_BIND", 4, "5");
        public static final SourceEvent OVERSEA_AGE_GATE = new SourceEvent("OVERSEA_AGE_GATE", 5, "6");

        private static final /* synthetic */ SourceEvent[] $values() {
            return new SourceEvent[]{DAILY_DIALOG, USER_CENTER, UNDER_FOURTEEN, OP_FORCE, GUARDIAN_BIND, OVERSEA_AGE_GATE};
        }

        static {
            SourceEvent[] sourceEventArr$values = $values();
            $VALUES = sourceEventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sourceEventArr$values);
        }

        private SourceEvent(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<SourceEvent> getEntries() {
            return $ENTRIES;
        }

        public static SourceEvent valueOf(String str) {
            return (SourceEvent) Enum.valueOf(SourceEvent.class, str);
        }

        public static SourceEvent[] values() {
            return (SourceEvent[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @NotNull
    public static final String a() {
        return (!Config.isDebuggable() || Intrinsics.areEqual(BiliGlobalPreferenceHelper.getBLKVSharedPreference(Foundation.Companion.instance().getApp()).getString("uat.env", "prod"), "prod")) ? "https://www.bilibili.com/h5/teenagers/guardian/verification" : "https://uat-www.bilibili.com/h5/teenagers/guardian/verification";
    }
}
