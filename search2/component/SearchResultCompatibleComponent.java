package com.bilibili.search2.component;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchResultCompatibleComponent.class */
@StabilityInferred(parameters = 0)
public final class SearchResultCompatibleComponent extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public BiliMainSearchResultFragment f86391a;

    public final void a() {
        BiliMainSearchResultFragment biliMainSearchResultFragment;
        if (a.b() && (biliMainSearchResultFragment = this.f86391a) != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(biliMainSearchResultFragment), (CoroutineContext) null, (CoroutineStart) null, new SearchResultCompatibleComponent$onCreate$1(biliMainSearchResultFragment, null), 3, (Object) null);
        }
    }
}
