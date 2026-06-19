package com.bilibili.lib.tribe.core.internal3.bundle;

import Gf0.InterfaceC1968c;
import Gf0.InterfaceC1969d;
import Gf0.x;
import android.util.Log;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BundleManager3 f64690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DefaultBundleProcessor f64691b;

    public f(@NotNull BundleManager3 bundleManager3, @NotNull DefaultBundleProcessor defaultBundleProcessor) {
        this.f64690a = bundleManager3;
        this.f64691b = defaultBundleProcessor;
    }

    @NotNull
    public final d a(@Nullable InterfaceC1969d interfaceC1969d, @NotNull File file, boolean z6) {
        BundleActionExecutor.a aVarC;
        DefaultBundleProcessor defaultBundleProcessor = this.f64691b;
        d dVar = new d(file.getName(), interfaceC1969d);
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    Long longOrNull = StringsKt.toLongOrNull(file2.getName());
                    if (longOrNull == null) {
                        FilesKt.deleteRecursively(file2);
                    } else {
                        treeMap.put(longOrNull, file2);
                    }
                } else {
                    file2.delete();
                }
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            File file3 = (File) entry.getValue();
            try {
                aVarC = defaultBundleProcessor.c(file3);
                if (z6) {
                    aVarC.enable(false);
                }
            } catch (IllegalBundleException e7) {
                Log.w("Tribe", "Bundle in " + file3 + " is illegal, uninstall it.", e7);
                try {
                    BundleActionExecutor.a(defaultBundleProcessor, BundleActionExecutor.UninstallReason.ILLEGAL, file3);
                } catch (Exception e8) {
                    Log.w("Tribe", "do failed", e8);
                }
            } catch (IOException e9) {
                Log.w("Tribe", "Load " + file3 + " failed, ignore.", e9);
            }
            if (aVarC.getStatus() == BundleActionExecutor.BundleStatus.PENDING_ACTIVE) {
                InterfaceC1969d interfaceC1969d2 = dVar.f64682b;
                if (((interfaceC1969d2 instanceof InterfaceC1968c) && aVarC.getMeta().k() > ((InterfaceC1968c) interfaceC1969d2).getVersionCode()) || !(interfaceC1969d2 instanceof x)) {
                    ((ArrayList) dVar.f64683c).add(aVarC);
                    try {
                        dVar.f64682b = aVarC.c(BundleActionExecutor.ActivateStage.BOOTSTRAP);
                        Unit unit = Unit.INSTANCE;
                    } catch (IOException e10) {
                        Log.w("Tribe", "Activate " + aVarC.a() + " failed, just ignore.", e10);
                    }
                }
            }
            if (((ArrayList) dVar.f64683c).size() >= 2) {
                try {
                    aVarC.b(BundleActionExecutor.UninstallReason.FOUND_NEW);
                } catch (Exception e11) {
                    Log.w("Tribe", "do failed", e11);
                }
            } else {
                ((ArrayList) dVar.f64683c).add(aVarC);
            }
        }
        return dVar;
    }
}
