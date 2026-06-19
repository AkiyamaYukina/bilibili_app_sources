package com.bilibili.opd.app.bizcommon.mangapaysdk.reporter;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/reporter/MangaBuriedReporter.class */
public final class MangaBuriedReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Function0<? extends Map<String, String>> f74073a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/reporter/MangaBuriedReporter$MangaPayPanelBuried.class */
    public static final class MangaPayPanelBuried {
        private static final EnumEntries $ENTRIES;
        private static final MangaPayPanelBuried[] $VALUES;

        @NotNull
        private final String eventId;
        public static final MangaPayPanelBuried PanelExposurePv = new MangaPayPanelBuried("PanelExposurePv", 0, "bilibili-manga.opus-detail.manga-pay-panel.0.pv");
        public static final MangaPayPanelBuried PanelSureToBuyButtonClick = new MangaPayPanelBuried("PanelSureToBuyButtonClick", 1, "bilibili-manga.opus-detail.manga-pay-panel.pay-button.click");
        public static final MangaPayPanelBuried PanelPaySuccessCallbackPv = new MangaPayPanelBuried("PanelPaySuccessCallbackPv", 2, "bilibili-manga.opus-detail.manga-pay-panel.pay-success.pv");
        public static final MangaPayPanelBuried PanelPayFailureCallbackPv = new MangaPayPanelBuried("PanelPayFailureCallbackPv", 3, "bilibili-manga.opus-detail.manga-pay-panel.pay-fail.pv");
        public static final MangaPayPanelBuried PanelCloseClick = new MangaPayPanelBuried("PanelCloseClick", 4, "bilibili-manga.opus-detail.manga-pay-panel.close.click");
        public static final MangaPayPanelBuried PanelBulkButtonExposureShow = new MangaPayPanelBuried("PanelBulkButtonExposureShow", 5, "bilibili-manga.opus-detail.manga-pay-panel.bulk-buy.show");
        public static final MangaPayPanelBuried PanelBulkButtonClick = new MangaPayPanelBuried("PanelBulkButtonClick", 6, "bilibili-manga.opus-detail.manga-pay-panel.bulk-buy.click");
        public static final MangaPayPanelBuried PanelBulkCloseClick = new MangaPayPanelBuried("PanelBulkCloseClick", 7, "bilibili-manga.opus-detail.manga-pay-panel.bulk-buy-close.click");
        public static final MangaPayPanelBuried PanelMoreLevelExposureShow = new MangaPayPanelBuried("PanelMoreLevelExposureShow", 8, "bilibili-manga.opus-detail.manga-pay-panel.more_level.show");
        public static final MangaPayPanelBuried PanelMoreLevelClick = new MangaPayPanelBuried("PanelMoreLevelClick", 9, "bilibili-manga.opus-detail.manga-pay-panel.more_level.click");
        public static final MangaPayPanelBuried PanelBannerShow = new MangaPayPanelBuried("PanelBannerShow", 10, "manga.opus-detail.app-jump-banner.0.show");
        public static final MangaPayPanelBuried PanelBannerClick = new MangaPayPanelBuried("PanelBannerClick", 11, "manga.opus-detail.app-jump-banner.0.click");
        public static final MangaPayPanelBuried PanelBannerJumpSuccess = new MangaPayPanelBuried("PanelBannerJumpSuccess", 12, "manga.opus-detail.app-jump-banner.jump-success.show");

        private static final /* synthetic */ MangaPayPanelBuried[] $values() {
            return new MangaPayPanelBuried[]{PanelExposurePv, PanelSureToBuyButtonClick, PanelPaySuccessCallbackPv, PanelPayFailureCallbackPv, PanelCloseClick, PanelBulkButtonExposureShow, PanelBulkButtonClick, PanelBulkCloseClick, PanelMoreLevelExposureShow, PanelMoreLevelClick, PanelBannerShow, PanelBannerClick, PanelBannerJumpSuccess};
        }

        static {
            MangaPayPanelBuried[] mangaPayPanelBuriedArr$values = $values();
            $VALUES = mangaPayPanelBuriedArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(mangaPayPanelBuriedArr$values);
        }

        private MangaPayPanelBuried(String str, int i7, String str2) {
            this.eventId = str2;
        }

        @NotNull
        public static EnumEntries<MangaPayPanelBuried> getEntries() {
            return $ENTRIES;
        }

        public static MangaPayPanelBuried valueOf(String str) {
            return (MangaPayPanelBuried) Enum.valueOf(MangaPayPanelBuried.class, str);
        }

        public static MangaPayPanelBuried[] values() {
            return (MangaPayPanelBuried[]) $VALUES.clone();
        }

        @NotNull
        public final String getEventId() {
            return this.eventId;
        }
    }

    public MangaBuriedReporter() {
        this(null);
    }

    public MangaBuriedReporter(@Nullable Function0<? extends Map<String, String>> function0) {
        this.f74073a = function0;
    }

    public final void a(@Nullable Map<String, String> map) {
        d(MangaPayPanelBuried.PanelBannerClick, map);
    }

    public final void b(@Nullable Map<String, String> map) {
        e(MangaPayPanelBuried.PanelBannerJumpSuccess, map);
    }

    public final void c(@Nullable Map<String, String> map) {
        e(MangaPayPanelBuried.PanelBannerShow, map);
    }

    public final void d(MangaPayPanelBuried mangaPayPanelBuried, Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Function0<? extends Map<String, String>> function0 = this.f74073a;
        if (function0 != null) {
            linkedHashMap.putAll((Map) function0.invoke());
        }
        Neurons.reportClick(false, mangaPayPanelBuried.getEventId(), linkedHashMap);
    }

    public final void e(MangaPayPanelBuried mangaPayPanelBuried, Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Function0<? extends Map<String, String>> function0 = this.f74073a;
        if (function0 != null) {
            linkedHashMap.putAll((Map) function0.invoke());
        }
        Neurons.reportExposure$default(false, mangaPayPanelBuried.getEventId(), linkedHashMap, (List) null, 8, (Object) null);
    }

    public final void f(@Nullable Map<String, String> map) {
        d(MangaPayPanelBuried.PanelBulkButtonClick, map);
    }

    public final void g(@Nullable Map<String, String> map) {
        e(MangaPayPanelBuried.PanelBulkButtonExposureShow, map);
    }

    public final void h(@Nullable Map<String, String> map) {
        d(MangaPayPanelBuried.PanelBulkCloseClick, map);
    }

    public final void i(@Nullable Map<String, String> map) {
        d(MangaPayPanelBuried.PanelCloseClick, map);
    }

    public final void j(@Nullable Map<String, String> map) {
        o(MangaPayPanelBuried.PanelExposurePv, map);
    }

    public final void k(@Nullable Map<String, String> map) {
        d(MangaPayPanelBuried.PanelMoreLevelClick, map);
    }

    public final void l(@Nullable Map<String, String> map) {
        e(MangaPayPanelBuried.PanelMoreLevelExposureShow, map);
    }

    public final void m(@Nullable Map<String, String> map) {
        o(MangaPayPanelBuried.PanelPayFailureCallbackPv, map);
    }

    public final void n(@Nullable Map<String, String> map) {
        o(MangaPayPanelBuried.PanelPaySuccessCallbackPv, map);
    }

    public final void o(MangaPayPanelBuried mangaPayPanelBuried, Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Function0<? extends Map<String, String>> function0 = this.f74073a;
        if (function0 != null) {
            linkedHashMap.putAll((Map) function0.invoke());
        }
        Neurons.reportPageView(false, mangaPayPanelBuried.getEventId(), "", 0, 0L, linkedHashMap, 0L, 0L);
    }

    public final void p(@Nullable Map<String, String> map) {
        d(MangaPayPanelBuried.PanelSureToBuyButtonClick, map);
    }
}
