package com.bilibili.ship.theseus.united.page;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.accounts.BiliAccountInfoKt;
import com.bilibili.lib.accounts.BiliAccountInfoKt$special$;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.BiliAccountsKt;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ReloadOnAccountInfoChangeService.class */
@StabilityInferred(parameters = 0)
public final class ReloadOnAccountInfoChangeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f98797a = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f98798b;

    @Inject
    public ReloadOnAccountInfoChangeService(@NotNull Lifecycle lifecycle, @NotNull BiliAccounts biliAccounts) {
        this.f98798b = FlowKt.mapLatest(FlowKt.drop(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(FlowKt.combine(BiliAccountsKt.a(biliAccounts), FlowKt.distinctUntilChanged(new BiliAccountInfoKt$special$.inlined.map.1(BiliAccountInfoKt.a(biliAccounts))), FlowKt.distinctUntilChanged(new BiliAccountInfoKt$special$.inlined.map.2(BiliAccountInfoKt.a(biliAccounts))), ReloadOnAccountInfoChangeService$reloadRequestFlow$3.INSTANCE), lifecycle, Lifecycle.State.RESUMED)), 1), new ReloadOnAccountInfoChangeService$reloadRequestFlow$4(this, null));
    }
}
