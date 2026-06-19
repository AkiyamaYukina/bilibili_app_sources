package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/i.class */
@StabilityInferred(parameters = 0)
public final class C6384i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f102744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f102745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.report.d f102746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Function1<Map<String, String>, Unit> f102747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<s, s> f102748e;

    @Inject
    public C6384i(@NotNull PageReportService pageReportService, @NotNull InterfaceC6388m interfaceC6388m, @NotNull com.bilibili.ship.theseus.united.page.report.d dVar) {
        this(pageReportService, interfaceC6388m, dVar, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6384i(@NotNull PageReportService pageReportService, @NotNull InterfaceC6388m interfaceC6388m, @NotNull com.bilibili.ship.theseus.united.page.report.d dVar, @Nullable Function1<? super Map<String, String>, Unit> function1, @Nullable Function1<? super s, ? extends s> function12) {
        this.f102744a = pageReportService;
        this.f102745b = interfaceC6388m;
        this.f102746c = dVar;
        this.f102747d = function1;
        this.f102748e = function12;
    }
}
