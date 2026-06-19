package com.bilibili.lib.tribe.core.internal3.bundle;

import Ff0.C1888e;
import Gf0.C1971f;
import Gf0.m;
import Gf0.x;
import Nf0.C2742a;
import android.os.SystemClock;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.lib.tribe.core.internal.exceptions.DeleteDirectoryException;
import com.bilibili.lib.tribe.core.internal.report.ReporterService;
import com.bilibili.lib.tribe.core.internal3.bundle.DefaultBundleProcessor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.FilesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleActionExecutor.class */
public interface BundleActionExecutor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleActionExecutor$ActivateStage.class */
    public static final class ActivateStage {
        private static final EnumEntries $ENTRIES;
        private static final ActivateStage[] $VALUES;
        public static final ActivateStage BOOTSTRAP = new ActivateStage("BOOTSTRAP", 0);
        public static final ActivateStage ON_INSTALL = new ActivateStage("ON_INSTALL", 1);
        public static final ActivateStage ON_CONTROL = new ActivateStage("ON_CONTROL", 2);
        public static final ActivateStage WARM_UP = new ActivateStage("WARM_UP", 3);

        private static final /* synthetic */ ActivateStage[] $values() {
            return new ActivateStage[]{BOOTSTRAP, ON_INSTALL, ON_CONTROL, WARM_UP};
        }

        static {
            ActivateStage[] activateStageArr$values = $values();
            $VALUES = activateStageArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(activateStageArr$values);
        }

        private ActivateStage(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ActivateStage> getEntries() {
            return $ENTRIES;
        }

        public static ActivateStage valueOf(String str) {
            return (ActivateStage) Enum.valueOf(ActivateStage.class, str);
        }

        public static ActivateStage[] values() {
            return (ActivateStage[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleActionExecutor$BundleStatus.class */
    public static final class BundleStatus {
        private static final EnumEntries $ENTRIES;
        private static final BundleStatus[] $VALUES;
        public static final BundleStatus ACTIVE = new BundleStatus("ACTIVE", 0);
        public static final BundleStatus PENDING_ACTIVE = new BundleStatus("PENDING_ACTIVE", 1);
        public static final BundleStatus INACTIVE = new BundleStatus("INACTIVE", 2);

        private static final /* synthetic */ BundleStatus[] $values() {
            return new BundleStatus[]{ACTIVE, PENDING_ACTIVE, INACTIVE};
        }

        static {
            BundleStatus[] bundleStatusArr$values = $values();
            $VALUES = bundleStatusArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(bundleStatusArr$values);
        }

        private BundleStatus(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<BundleStatus> getEntries() {
            return $ENTRIES;
        }

        public static BundleStatus valueOf(String str) {
            return (BundleStatus) Enum.valueOf(BundleStatus.class, str);
        }

        public static BundleStatus[] values() {
            return (BundleStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleActionExecutor$SourceFrom.class */
    public static final class SourceFrom {
        private static final EnumEntries $ENTRIES;
        private static final SourceFrom[] $VALUES;
        public static final SourceFrom STASH_DIR = new SourceFrom("STASH_DIR", 0);
        public static final SourceFrom RUNTIME_API = new SourceFrom("RUNTIME_API", 1);

        private static final /* synthetic */ SourceFrom[] $values() {
            return new SourceFrom[]{STASH_DIR, RUNTIME_API};
        }

        static {
            SourceFrom[] sourceFromArr$values = $values();
            $VALUES = sourceFromArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sourceFromArr$values);
        }

        private SourceFrom(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<SourceFrom> getEntries() {
            return $ENTRIES;
        }

        public static SourceFrom valueOf(String str) {
            return (SourceFrom) Enum.valueOf(SourceFrom.class, str);
        }

        public static SourceFrom[] values() {
            return (SourceFrom[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleActionExecutor$UninstallReason.class */
    public static final class UninstallReason {
        private static final EnumEntries $ENTRIES;
        private static final UninstallReason[] $VALUES;
        public static final UninstallReason DISABLED = new UninstallReason("DISABLED", 0);
        public static final UninstallReason ILLEGAL = new UninstallReason("ILLEGAL", 1);
        public static final UninstallReason INCOMPATIBLE = new UninstallReason("INCOMPATIBLE", 2);
        public static final UninstallReason FORCE_HOST = new UninstallReason("FORCE_HOST", 3);
        public static final UninstallReason OVERRIDE = new UninstallReason("OVERRIDE", 4);
        public static final UninstallReason FOUND_NEW = new UninstallReason("FOUND_NEW", 5);
        public static final UninstallReason AUTO_CLEAR = new UninstallReason("AUTO_CLEAR", 6);

        private static final /* synthetic */ UninstallReason[] $values() {
            return new UninstallReason[]{DISABLED, ILLEGAL, INCOMPATIBLE, FORCE_HOST, OVERRIDE, FOUND_NEW, AUTO_CLEAR};
        }

        static {
            UninstallReason[] uninstallReasonArr$values = $values();
            $VALUES = uninstallReasonArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(uninstallReasonArr$values);
        }

        private UninstallReason(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<UninstallReason> getEntries() {
            return $ENTRIES;
        }

        public static UninstallReason valueOf(String str) {
            return (UninstallReason) Enum.valueOf(UninstallReason.class, str);
        }

        public static UninstallReason[] values() {
            return (UninstallReason[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleActionExecutor$a.class */
    public interface a {
        @NotNull
        File a();

        void b(@NotNull UninstallReason uninstallReason) throws IOException;

        @NotNull
        x c(@NotNull ActivateStage activateStage) throws IOException, ClassNotFoundException;

        void enable(boolean z6) throws IOException;

        @NotNull
        C2742a getMeta();

        @NotNull
        BundleStatus getStatus();
    }

    /* JADX WARN: Finally extract failed */
    static void a(DefaultBundleProcessor defaultBundleProcessor, UninstallReason uninstallReason, File file) throws IOException {
        String str;
        long jLongValue;
        DefaultBundleProcessor.BundleAction bundleAction = DefaultBundleProcessor.BundleAction.UNINSTALL;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList();
        ReporterService.Result result = ReporterService.Result.NONE;
        String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        long j7 = -1;
        try {
            File parentFile = file.getParentFile();
            str = EnvironmentCompat.MEDIA_UNKNOWN;
            if (parentFile != null) {
                String name = parentFile.getName();
                str = EnvironmentCompat.MEDIA_UNKNOWN;
                if (name != null) {
                    str = name;
                }
            }
            Long longOrNull = StringsKt.toLongOrNull(file.getName());
            jLongValue = -1;
            if (longOrNull != null) {
                jLongValue = longOrNull.longValue();
            }
            if (m.b(file).exists()) {
                str2 = str;
                j7 = jLongValue;
                try {
                    Pair pairB = C1971f.b(m.c(file), 1L, false);
                    try {
                        boolean z6 = C1888e.f6133a;
                        if (!FilesKt.deleteRecursively(file)) {
                            throw new DeleteDirectoryException(file);
                        }
                        Unit unit = Unit.INSTANCE;
                        C1971f.a(pairB);
                    } catch (Throwable th) {
                        C1971f.a(pairB);
                        throw th;
                    }
                } catch (DeleteDirectoryException e7) {
                    throw e7;
                } catch (IOException e8) {
                    File fileC = m.c(file);
                    StringBuilder sb = new StringBuilder("Lock ");
                    sb.append(fileC);
                    sb.append(" failed.");
                    IOException iOException = new IOException(sb.toString(), e8);
                    throw iOException;
                }
            } else {
                boolean z7 = C1888e.f6133a;
                if (!FilesKt.deleteRecursively(file)) {
                    throw new DeleteDirectoryException(file);
                }
            }
            e = Unit.INSTANCE;
        } catch (Exception e9) {
            e = e9;
            str = str2;
            jLongValue = j7;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        boolean z8 = e instanceof Exception;
        com.bilibili.lib.tribe.core.internal.report.a aVar = defaultBundleProcessor.f64673a.f64660d;
        if (!z8) {
            aVar.c(result.or(ReporterService.Result.SUCCESS), jLongValue, jUptimeMillis2, bundleAction.name(), str, "", "DYNAMIC", null, null, uninstallReason != null ? uninstallReason.name() : null, null);
            return;
        }
        boolean z9 = C1888e.f6133a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(e, (Throwable) it.next());
        }
        String strName = bundleAction.name();
        int iOr = result.or(ReporterService.Result.FAILURE);
        Exception exc = e;
        aVar.c(iOr, jLongValue, jUptimeMillis2, strName, str, "", "DYNAMIC", C1888e.c(exc), null, uninstallReason != null ? uninstallReason.name() : null, null);
        throw exc;
    }
}
