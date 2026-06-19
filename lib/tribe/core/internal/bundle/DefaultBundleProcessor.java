package com.bilibili.lib.tribe.core.internal.bundle;

import Ff0.C1888e;
import Gf0.C1971f;
import Gf0.m;
import Nf0.C2742a;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.lib.tribe.core.internal.exceptions.DeleteDirectoryException;
import com.bilibili.lib.tribe.core.internal.report.ReporterService;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/DefaultBundleProcessor.class */
public final class DefaultBundleProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BundleManager f64636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gson f64637b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/DefaultBundleProcessor$BundleAction.class */
    public static final class BundleAction {
        private static final EnumEntries $ENTRIES;
        private static final BundleAction[] $VALUES;
        public static final BundleAction INSTALL = new BundleAction("INSTALL", 0);
        public static final BundleAction UNINSTALL = new BundleAction("UNINSTALL", 1);
        public static final BundleAction ACTIVATE = new BundleAction("ACTIVATE", 2);
        public static final BundleAction LOAD = new BundleAction("LOAD", 3);

        private static final /* synthetic */ BundleAction[] $values() {
            return new BundleAction[]{INSTALL, UNINSTALL, ACTIVATE, LOAD};
        }

        static {
            BundleAction[] bundleActionArr$values = $values();
            $VALUES = bundleActionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(bundleActionArr$values);
        }

        private BundleAction(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<BundleAction> getEntries() {
            return $ENTRIES;
        }

        public static BundleAction valueOf(String str) {
            return (BundleAction) Enum.valueOf(BundleAction.class, str);
        }

        public static BundleAction[] values() {
            return (BundleAction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/DefaultBundleProcessor$a.class */
    public static final class a extends TypeToken<C2742a> {
    }

    public DefaultBundleProcessor(@NotNull BundleManager bundleManager, @NotNull Gson gson) {
        this.f64636a = bundleManager;
        this.f64637b = gson;
    }

    public static void e(File file, String str, long j7, File file2) {
        try {
            File file3 = new File(file.getParentFile().getParent(), "incremental" + File.separatorChar + str);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            File file4 = new File(file3, j7 + ".apk");
            if (file4.exists()) {
                return;
            }
            FilesKt.e(file2, file4, false, 6);
        } catch (Exception e7) {
            Log.w("Tribe", "copy apk to incremental dir failed", e7);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0291  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Gf0.x a(@org.jetbrains.annotations.NotNull com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$ActivateStage r16, @org.jetbrains.annotations.NotNull java.io.File r17, @org.jetbrains.annotations.NotNull Nf0.C2742a r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.bundle.DefaultBundleProcessor.a(com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$ActivateStage, java.io.File, Nf0.a, boolean):Gf0.x");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[Catch: Exception -> 0x05ce, TRY_ENTER, TryCatch #2 {Exception -> 0x05ce, blocks: (B:3:0x0029, B:11:0x006c, B:11:0x006c, B:20:0x00ae, B:21:0x00b1, B:10:0x0063), top: B:213:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0664  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<Nf0.C2742a, java.io.File> b(@org.jetbrains.annotations.NotNull com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$SourceFrom r16, @org.jetbrains.annotations.NotNull java.io.File r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.bundle.DefaultBundleProcessor.b(com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$SourceFrom, java.io.File, boolean):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0368  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Nf0.C2742a c(@org.jetbrains.annotations.NotNull java.io.File r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.bundle.DefaultBundleProcessor.c(java.io.File):Nf0.a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0960, code lost:
    
        h(com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$UninstallReason.ILLEGAL, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020d, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0215, code lost:
    
        e(r8, r0.h(), r0.longValue(), Gf0.m.b(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0229, code lost:
    
        h(com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$UninstallReason.FORCE_HOST, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        r27 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x023f, code lost:
    
        android.util.Log.w("Tribe", "do failed", r27);
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Triple d(@org.jetbrains.annotations.NotNull java.io.File r8, boolean r9, @org.jetbrains.annotations.NotNull java.util.Set r10, @org.jetbrains.annotations.Nullable java.lang.Long r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.bundle.DefaultBundleProcessor.d(java.io.File, boolean, java.util.Set, java.lang.Long):kotlin.Triple");
    }

    public final C2742a f(File file) {
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("meta.json");
            if (entry == null) {
                throw new IOException("Don't found meta.json in " + file + UtilsKt.DOT);
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                C2742a c2742aG = g(inputStream);
                CloseableKt.closeFinally(inputStream, (Throwable) null);
                CloseableKt.closeFinally(zipFile, (Throwable) null);
                return c2742aG;
            } finally {
            }
        } finally {
        }
    }

    public final C2742a g(InputStream inputStream) throws IOException {
        try {
            return (C2742a) this.f64637b.fromJson(new InputStreamReader(inputStream, Charsets.UTF_8), new a().getType());
        } catch (RuntimeException e7) {
            throw new IOException("Parse meta.json failed.", e7);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void h(@NotNull BundleProcessor$UninstallReason bundleProcessor$UninstallReason, @NotNull File file, @Nullable Throwable th) throws Exception {
        String str;
        long jLongValue;
        String str2;
        long j7;
        Exception e7;
        BundleAction bundleAction = BundleAction.UNINSTALL;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList();
        ReporterService.Result result = ReporterService.Result.NONE;
        if (th != null) {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            j7 = -1;
            try {
                arrayList.add(th);
            } catch (Exception e8) {
                e7 = e8;
                str = str2;
                jLongValue = j7;
            }
        }
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
                Pair pairB = C1971f.b(m.c(file), Long.MAX_VALUE, false);
                try {
                    boolean z6 = C1888e.f6133a;
                    if (!FilesKt.deleteRecursively(file)) {
                        throw new DeleteDirectoryException(file);
                    }
                    Unit unit = Unit.INSTANCE;
                    C1971f.a(pairB);
                } catch (Throwable th2) {
                    C1971f.a(pairB);
                    throw th2;
                }
            } catch (DeleteDirectoryException e9) {
                throw e9;
            } catch (IOException e10) {
                File fileC = m.c(file);
                StringBuilder sb = new StringBuilder("Lock ");
                sb.append(fileC);
                sb.append(" failed.");
                IOException iOException = new IOException(sb.toString(), e10);
                throw iOException;
            }
        } else {
            boolean z7 = C1888e.f6133a;
            if (!FilesKt.deleteRecursively(file)) {
                throw new DeleteDirectoryException(file);
            }
        }
        e7 = Unit.INSTANCE;
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        boolean z8 = e7 instanceof Exception;
        com.bilibili.lib.tribe.core.internal.report.a aVar = this.f64636a.f64622d;
        if (!z8) {
            aVar.c(result.or(ReporterService.Result.SUCCESS), jLongValue, jUptimeMillis2, bundleAction.name(), str, "", "DYNAMIC", null, null, bundleProcessor$UninstallReason != null ? bundleProcessor$UninstallReason.name() : null, null);
            return;
        }
        boolean z9 = C1888e.f6133a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(e7, (Throwable) it.next());
        }
        String strName = bundleAction.name();
        int iOr = result.or(ReporterService.Result.FAILURE);
        Exception exc = e7;
        aVar.c(iOr, jLongValue, jUptimeMillis2, strName, str, "", "DYNAMIC", C1888e.c(exc), null, bundleProcessor$UninstallReason != null ? bundleProcessor$UninstallReason.name() : null, null);
        throw exc;
    }
}
