package com.bilibili.ogv.infra.legacy.exposure;

import android.view.View;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/IExposureReporter.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
public interface IExposureReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/IExposureReporter$ReporterCheckerType.class */
    public static final class ReporterCheckerType {
        private static final EnumEntries $ENTRIES;
        private static final ReporterCheckerType[] $VALUES;
        public static final ReporterCheckerType DefaultChecker = new ReporterCheckerType("DefaultChecker", 0);
        public static final ReporterCheckerType CustomChecker = new ReporterCheckerType("CustomChecker", 1);
        public static final ReporterCheckerType ExtraChecker = new ReporterCheckerType("ExtraChecker", 2);

        private static final /* synthetic */ ReporterCheckerType[] $values() {
            return new ReporterCheckerType[]{DefaultChecker, CustomChecker, ExtraChecker};
        }

        static {
            ReporterCheckerType[] reporterCheckerTypeArr$values = $values();
            $VALUES = reporterCheckerTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(reporterCheckerTypeArr$values);
        }

        private ReporterCheckerType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ReporterCheckerType> getEntries() {
            return $ENTRIES;
        }

        public static ReporterCheckerType valueOf(String str) {
            return (ReporterCheckerType) Enum.valueOf(ReporterCheckerType.class, str);
        }

        public static ReporterCheckerType[] values() {
            return (ReporterCheckerType[]) $VALUES.clone();
        }
    }

    void Xa(int i7, @NotNull ReporterCheckerType reporterCheckerType, @Nullable View view);

    boolean ve(int i7, @NotNull ReporterCheckerType reporterCheckerType);
}
