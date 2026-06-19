package com.bilibili.ogv.community;

import com.bilibili.lib.accounts.BiliAccountsKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/b.class */
public final class b {
    @NotNull
    public static final void a(@NotNull a aVar) {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.drop(BiliAccountsKt.a(com.bilibili.ogv.infra.account.a.f67852b), 1), new BehaviorRepositoryHelperKt$resetOnLoginStateChange$1(aVar, null)), GlobalScope.INSTANCE);
    }
}
