package com.bilibili.lib.tribe.core.internal.report;

import Ef0.InterfaceC1646e;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/report/ReporterService.class */
public interface ReporterService {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/report/ReporterService$ReflectionType.class */
    public static final class ReflectionType {
        private static final EnumEntries $ENTRIES;
        private static final ReflectionType[] $VALUES;
        public static final ReflectionType RES_N = new ReflectionType("RES_N", 0);

        private static final /* synthetic */ ReflectionType[] $values() {
            return new ReflectionType[]{RES_N};
        }

        static {
            ReflectionType[] reflectionTypeArr$values = $values();
            $VALUES = reflectionTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(reflectionTypeArr$values);
        }

        private ReflectionType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ReflectionType> getEntries() {
            return $ENTRIES;
        }

        public static ReflectionType valueOf(String str) {
            return (ReflectionType) Enum.valueOf(ReflectionType.class, str);
        }

        public static ReflectionType[] values() {
            return (ReflectionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/report/ReporterService$Result.class */
    public static final class Result {
        private static final EnumEntries $ENTRIES;
        private static final Result[] $VALUES;
        public static final Result SUCCESS = new Result(BCGToken.SCHEDULE_STATUS_SUCCESS, 0);
        public static final Result FAILURE = new Result("FAILURE", 1);
        public static final Result ABORT = new Result("ABORT", 2);
        public static final Result NONE = new Result("NONE", 3);

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{SUCCESS, FAILURE, ABORT, NONE};
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(resultArr$values);
        }

        private Result(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Result> getEntries() {
            return $ENTRIES;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }

        public final int or(@NotNull Result result) {
            return this == NONE ? result.ordinal() : ordinal();
        }
    }

    void a(@NotNull InterfaceC1646e interfaceC1646e);
}
