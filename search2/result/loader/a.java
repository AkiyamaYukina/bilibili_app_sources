package com.bilibili.search2.result.loader;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import at0.C4907b;
import com.bapis.bilibili.polymer.app.search.v1.SearchReserveInfo;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/loader/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    public static void a(@NotNull SearchReserveInfo searchReserveInfo, @Nullable LifecycleOwner lifecycleOwner, @NotNull C4907b.a aVar) {
        LifecycleCoroutineScope lifecycleScope;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SearchOrderLoader$cancelOrder$1(searchReserveInfo, aVar, null), 3, (Object) null);
    }

    public static void b(@NotNull SearchReserveInfo searchReserveInfo, @Nullable LifecycleOwner lifecycleOwner, @NotNull C4907b.C0294b c0294b) {
        LifecycleCoroutineScope lifecycleScope;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SearchOrderLoader$doOrder$1(searchReserveInfo, c0294b, null), 3, (Object) null);
    }
}
