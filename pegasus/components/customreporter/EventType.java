package com.bilibili.pegasus.components.customreporter;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/EventType.class */
public final class EventType {
    private static final EnumEntries $ENTRIES;
    private static final EventType[] $VALUES;

    @NotNull
    private final String configKey;

    @NotNull
    private final String value;
    public static final EventType CARD_CREATE = new EventType("CARD_CREATE", 0, "card_create");
    public static final EventType CARD_BIND = new EventType("CARD_BIND", 1, "card_bind");
    public static final EventType PAGE = new EventType("PAGE", 2, MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE);
    public static final EventType PAGE_PERFORMANCE = new EventType("PAGE_PERFORMANCE", 3, "page_performance");
    public static final EventType ACTION = new EventType("ACTION", 4, "action");
    public static final EventType DISCARD_CARD = new EventType("DISCARD_CARD", 5, "discard_card");
    public static final EventType FRAME_MONITOR = new EventType("FRAME_MONITOR", 6, "frame_monitor");

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{CARD_CREATE, CARD_BIND, PAGE, PAGE_PERFORMANCE, ACTION, DISCARD_CARD, FRAME_MONITOR};
    }

    static {
        EventType[] eventTypeArr$values = $values();
        $VALUES = eventTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(eventTypeArr$values);
    }

    private EventType(String str, int i7, String str2) {
        this.value = str2;
        this.configKey = C4496a.a("pegasus.custom_reporter_", str2);
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

    @NotNull
    public final String getConfigKey() {
        return this.configKey;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
