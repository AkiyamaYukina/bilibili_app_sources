package com.bilibili.ship.theseus.united.page.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f102498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f102499b;

    @Inject
    public d(@NotNull PageReportService pageReportService, @NotNull BiliAccounts biliAccounts) {
        this.f102498a = pageReportService;
        this.f102499b = biliAccounts;
    }

    public final void a(@NotNull String str, @Nullable String str2, @Nullable Map map) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(this.f102498a.a(null));
        if (map != null) {
            mapCreateMapBuilder.putAll(map);
        }
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new OperationEventReportService$materialReport$1(this, str2, str, MapsKt.build(mapCreateMapBuilder), null), 3, (Object) null);
    }
}
