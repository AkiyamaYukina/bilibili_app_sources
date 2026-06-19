package com.bilibili.lib.tribe.core.internal3.bundle;

import Gf0.m;
import Nf0.C2742a;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/DefaultBundleProcessor.class */
public final class DefaultBundleProcessor implements BundleActionExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BundleManager3 f64673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gson f64674b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/DefaultBundleProcessor$BundleAction.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/DefaultBundleProcessor$a.class */
    public static final class a extends TypeToken<C2742a> {
    }

    public DefaultBundleProcessor(@NotNull BundleManager3 bundleManager3, @NotNull Gson gson) {
        this.f64673a = bundleManager3;
        this.f64674b = gson;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f A[Catch: Exception -> 0x059a, TRY_ENTER, TryCatch #15 {Exception -> 0x059a, blocks: (B:3:0x0029, B:11:0x0068, B:11:0x0068, B:20:0x00a8, B:21:0x00ab, B:10:0x005f), top: B:229:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0630  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a b(@org.jetbrains.annotations.NotNull com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.SourceFrom r16, @org.jetbrains.annotations.NotNull java.io.File r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal3.bundle.DefaultBundleProcessor.b(com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor$SourceFrom, java.io.File, boolean):com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a c(@org.jetbrains.annotations.NotNull java.io.File r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal3.bundle.DefaultBundleProcessor.c(java.io.File):com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor$a");
    }

    public final C2742a d(File file) {
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("meta.json");
            if (entry == null) {
                throw new IllegalBundleException("Don't found meta.json in " + file + UtilsKt.DOT, null, 2, null);
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                C2742a c2742aE = e(inputStream);
                CloseableKt.closeFinally(inputStream, (Throwable) null);
                CloseableKt.closeFinally(zipFile, (Throwable) null);
                return c2742aE;
            } finally {
            }
        } finally {
        }
    }

    public final C2742a e(InputStream inputStream) throws IOException {
        try {
            return (C2742a) this.f64674b.fromJson(new InputStreamReader(inputStream, Charsets.UTF_8), new a().getType());
        } catch (RuntimeException e7) {
            throw new IOException("Parse meta.json failed.", e7);
        }
    }

    public final BundleActionExecutor.BundleStatus f(File file) throws IllegalBundleException {
        BundleActionExecutor.BundleStatus bundleStatusA;
        File file2 = new File(file, "extras.json");
        if (!file2.isFile()) {
            throw new IllegalBundleException(androidx.core.content.b.b(file2, "Extra file not found:"), null, 2, null);
        }
        FileChannel channel = new RandomAccessFile(m.c(file), "rw").getChannel();
        try {
            FileLock fileLockLock = channel.lock(1L, 2L, true);
            try {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8);
                    try {
                        com.bilibili.lib.tribe.core.internal3.bundle.a aVar = (com.bilibili.lib.tribe.core.internal3.bundle.a) this.f64674b.fromJson(inputStreamReader, com.bilibili.lib.tribe.core.internal3.bundle.a.class);
                        if (aVar == null || (bundleStatusA = aVar.a()) == null) {
                            throw new IllegalBundleException("status is null: " + aVar, null, 2, null);
                        }
                        CloseableKt.closeFinally(inputStreamReader, (Throwable) null);
                        AutoCloseableKt.closeFinally(fileLockLock, (Throwable) null);
                        CloseableKt.closeFinally(channel, (Throwable) null);
                        return bundleStatusA;
                    } catch (RuntimeException e7) {
                        throw new IllegalBundleException("Illegal status file content", e7);
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final void g(@NotNull File file, @NotNull BundleActionExecutor.BundleStatus bundleStatus) {
        FileChannel channel = new RandomAccessFile(m.c(file), "rw").getChannel();
        try {
            FileLock fileLockLock = channel.lock(1L, 2L, false);
            try {
                h(file, bundleStatus);
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(fileLockLock, (Throwable) null);
                CloseableKt.closeFinally(channel, (Throwable) null);
            } finally {
            }
        } finally {
        }
    }

    public final void h(File file, BundleActionExecutor.BundleStatus bundleStatus) {
        File file2 = new File(file, "extras.json");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2), Charsets.UTF_8);
        try {
            this.f64674b.toJson(new com.bilibili.lib.tribe.core.internal3.bundle.a(bundleStatus), outputStreamWriter);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStreamWriter, (Throwable) null);
        } finally {
        }
    }
}
