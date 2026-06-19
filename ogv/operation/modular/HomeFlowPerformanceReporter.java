package com.bilibili.ogv.operation.modular;

import Hj0.a;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import com.bilibili.gripper.container.bpush.i;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/HomeFlowPerformanceReporter.class */
@StabilityInferred(parameters = 0)
public final class HomeFlowPerformanceReporter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f70299c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70301e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f70297a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<Event, Long> f70298b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70300d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public ResultEnum f70302f = ResultEnum.INVALID;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f70303g = a.a("ogv_modular_performance_report_enabled", true);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/HomeFlowPerformanceReporter$Event.class */
    public static final class Event {
        private static final EnumEntries $ENTRIES;
        private static final Event[] $VALUES;

        @NotNull
        private final String value;
        public static final Event DATA_REQUEST = new Event("DATA_REQUEST", 0, "data_request");
        public static final Event DATA_LOADED = new Event("DATA_LOADED", 1, "data_loaded");
        public static final Event DYNAMIC_RENDER = new Event("DYNAMIC_RENDER", 2, "dynamic_render");
        public static final Event LAYOUT_FINISH = new Event("LAYOUT_FINISH", 3, "layout_finish");

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{DATA_REQUEST, DATA_LOADED, DYNAMIC_RENDER, LAYOUT_FINISH};
        }

        static {
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(eventArr$values);
        }

        private Event(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/HomeFlowPerformanceReporter$ResultEnum.class */
    public static final class ResultEnum {
        private static final EnumEntries $ENTRIES;
        private static final ResultEnum[] $VALUES;
        private final int result;
        public static final ResultEnum SUCCESS = new ResultEnum(BCGToken.SCHEDULE_STATUS_SUCCESS, 0, 0);
        public static final ResultEnum FAIL = new ResultEnum("FAIL", 1, 1);
        public static final ResultEnum INVALID = new ResultEnum("INVALID", 2, -1);

        private static final /* synthetic */ ResultEnum[] $values() {
            return new ResultEnum[]{SUCCESS, FAIL, INVALID};
        }

        static {
            ResultEnum[] resultEnumArr$values = $values();
            $VALUES = resultEnumArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(resultEnumArr$values);
        }

        private ResultEnum(String str, int i7, int i8) {
            this.result = i8;
        }

        @NotNull
        public static EnumEntries<ResultEnum> getEntries() {
            return $ENTRIES;
        }

        public static ResultEnum valueOf(String str) {
            return (ResultEnum) Enum.valueOf(ResultEnum.class, str);
        }

        public static ResultEnum[] values() {
            return (ResultEnum[]) $VALUES.clone();
        }

        public final int getResult() {
            return this.result;
        }
    }

    public final void a(@NotNull ResultEnum resultEnum, @NotNull String str) {
        synchronized (this.f70297a) {
            if (this.f70299c) {
                this.f70299c = false;
                this.f70302f = resultEnum;
                SystemClock.elapsedRealtime();
                b(str);
                this.f70300d = false;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void b(String str) {
        Long l7 = this.f70298b.get(Event.LAYOUT_FINISH);
        HashMap mapHashMapOf = MapsKt.hashMapOf(new Pair[]{TuplesKt.to(ThirdPartyExtraBuilder.KEY_RESULT, String.valueOf(this.f70302f.getResult())), TuplesKt.to("total_time", String.valueOf(l7 != null ? l7.longValue() : SystemClock.elapsedRealtime() - this.f70301e)), TuplesKt.to("page_name", str), TuplesKt.to("dynamic", String.valueOf(this.f70298b.containsKey(Event.DYNAMIC_RENDER))), TuplesKt.to("first_request", String.valueOf(this.f70300d))});
        for (Map.Entry<Event, Long> entry : this.f70298b.entrySet()) {
            mapHashMapOf.put(C4496a.a("event_", entry.getKey().getValue()), String.valueOf(entry.getValue().longValue()));
        }
        Neurons.trackT$default(false, "ogv.pgc-home-flow.performance", mapHashMapOf, 0, new i(this.f70303g), 8, (Object) null);
    }

    public final void onEvent(@NotNull Event event, long j7) {
        synchronized (this.f70297a) {
            if (this.f70299c) {
                this.f70298b.put(event, Long.valueOf(j7 - this.f70301e));
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
