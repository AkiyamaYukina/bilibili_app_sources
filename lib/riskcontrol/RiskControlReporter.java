package com.bilibili.lib.riskcontrol;

import java.util.HashMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/RiskControlReporter.class */
public final class RiskControlReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/RiskControlReporter$EventType.class */
    public static final class EventType {
        private static final EnumEntries $ENTRIES;
        private static final EventType[] $VALUES;
        private final int code;
        public static final EventType START = new EventType("START", 0, 1);
        public static final EventType ALREADY_SHOWING = new EventType("ALREADY_SHOWING", 1, 2);
        public static final EventType START_SHOW = new EventType("START_SHOW", 2, 3);
        public static final EventType H5_REQUEST_PARAMS = new EventType("H5_REQUEST_PARAMS", 3, 4);
        public static final EventType H5_CALLBACK_TOKEN = new EventType("H5_CALLBACK_TOKEN", 4, 5);
        public static final EventType CLOSE_CAPTCHA = new EventType("CLOSE_CAPTCHA", 5, 6);
        public static final EventType CAPTCHA_CALLBACK_TOKEN = new EventType("CAPTCHA_CALLBACK_TOKEN", 6, 7);
        public static final EventType RISK_CALLBACK_TOKEN = new EventType("RISK_CALLBACK_TOKEN", 7, 8);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{START, ALREADY_SHOWING, START_SHOW, H5_REQUEST_PARAMS, H5_CALLBACK_TOKEN, CLOSE_CAPTCHA, CAPTCHA_CALLBACK_TOKEN, RISK_CALLBACK_TOKEN};
        }

        static {
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eventTypeArr$values);
        }

        private EventType(String str, int i7, int i8) {
            this.code = i8;
        }

        @NotNull
        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    @JvmStatic
    public static final void a(@NotNull EventType eventType, @NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        HashMap mapA = W.a("session_id", str, "tag", str2);
        mapA.put("event_type", String.valueOf(eventType.getCode()));
        mapA.put("event_result", String.valueOf(num));
        if (str3 != null) {
            mapA.put("event_error_info", str3);
        }
        if (str4 != null) {
            mapA.put("riskcontrol_result", str4);
        }
        if (str5 != null) {
            mapA.put("riskcontrol_token", str5);
        }
        if (str6 != null) {
            mapA.put("riskcontrol_error_code", str6);
        }
        if (str7 != null) {
            mapA.put("riskcontrol_error_message", str7);
        }
        if (str8 != null) {
            mapA.put("event_extra_info", str8);
        }
        if (str9 != null) {
            mapA.put("riskcontrol_version", str9);
        }
        NeuronDelegate tracker = BiliRiskControlConfig.INSTANCE.getTracker();
        if (tracker != null) {
            tracker.trackT(false, "infra.riskcontrol.process.event", mapA);
        }
    }

    public static /* synthetic */ void b(EventType eventType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i7) {
        if ((i7 & 32) != 0) {
            str3 = null;
        }
        if ((i7 & 64) != 0) {
            str4 = null;
        }
        if ((i7 & 128) != 0) {
            str5 = null;
        }
        if ((i7 & 256) != 0) {
            str6 = null;
        }
        a(eventType, str, str2, 1, null, str3, str4, str5, str6, null, str7);
    }

    public static void c(EventType eventType, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i7) {
        if ((i7 & 8) != 0) {
            num = 1;
        }
        if ((i7 & 16) != 0) {
            str3 = null;
        }
        if ((i7 & 32) != 0) {
            str4 = null;
        }
        if ((i7 & 64) != 0) {
            str5 = null;
        }
        if ((i7 & 128) != 0) {
            str6 = null;
        }
        if ((i7 & 256) != 0) {
            str7 = null;
        }
        a(eventType, str, str2, num, str3, str4, str5, str6, str7, null, "2.0");
    }
}
