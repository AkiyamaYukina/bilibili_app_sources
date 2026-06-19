package com.bilibili.lib.tribe.core.internal3.bundle;

import Gf0.x;
import Nf0.C2742a;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor;
import java.io.File;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/e.class */
public final class e implements BundleActionExecutor.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f64684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C2742a f64685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public BundleActionExecutor.BundleStatus f64686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DefaultBundleProcessor f64687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public x f64688e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/e$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64689a;

        static {
            int[] iArr = new int[BundleActionExecutor.BundleStatus.values().length];
            try {
                iArr[BundleActionExecutor.BundleStatus.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BundleActionExecutor.BundleStatus.PENDING_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BundleActionExecutor.BundleStatus.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f64689a = iArr;
        }
    }

    public e(@NotNull File file, @NotNull C2742a c2742a, @NotNull BundleActionExecutor.BundleStatus bundleStatus, @NotNull DefaultBundleProcessor defaultBundleProcessor) {
        this.f64684a = file;
        this.f64685b = c2742a;
        this.f64686c = bundleStatus;
        this.f64687d = defaultBundleProcessor;
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a
    @NotNull
    public final File a() {
        return this.f64684a;
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a
    public final void b(@NotNull BundleActionExecutor.UninstallReason uninstallReason) throws IOException {
        BundleActionExecutor.a(this.f64687d, uninstallReason, this.f64684a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306  */
    @Override // com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Gf0.x c(@org.jetbrains.annotations.NotNull com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.ActivateStage r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal3.bundle.e.c(com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor$ActivateStage):Gf0.x");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a
    public final void enable(boolean z6) throws NoWhenBranchMatchedException {
        int i7 = a.f64689a[this.f64686c.ordinal()];
        DefaultBundleProcessor defaultBundleProcessor = this.f64687d;
        if (i7 == 1) {
            if (z6) {
                defaultBundleProcessor.g(this.f64684a, BundleActionExecutor.BundleStatus.ACTIVE);
                this.f64686c = BundleActionExecutor.BundleStatus.PENDING_ACTIVE;
                return;
            }
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (z6) {
                return;
            }
            defaultBundleProcessor.g(this.f64684a, BundleActionExecutor.BundleStatus.INACTIVE);
            return;
        }
        if (z6) {
            return;
        }
        BundleActionExecutor.BundleStatus bundleStatus = BundleActionExecutor.BundleStatus.INACTIVE;
        this.f64686c = bundleStatus;
        defaultBundleProcessor.g(this.f64684a, bundleStatus);
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a
    @NotNull
    public final C2742a getMeta() {
        return this.f64685b;
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor.a
    @NotNull
    public final BundleActionExecutor.BundleStatus getStatus() {
        return this.f64686c;
    }
}
