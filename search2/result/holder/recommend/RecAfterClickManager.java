package com.bilibili.search2.result.holder.recommend;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.search2.api.SearchVideoItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/RecAfterClickManager.class */
@StabilityInferred(parameters = 0)
public final class RecAfterClickManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final String f88149a = (String) ConfigManager.Companion.config().get("search.rec_after_click_insert_time", "500");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static AtomicBoolean f88150b;

    public static void a(@NotNull Uri uri, int i7, @NotNull SearchVideoItem searchVideoItem, @NotNull SearchResultAllFragment searchResultAllFragment) {
        AtomicBoolean atomicBoolean = f88150b;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        f88150b = atomicBoolean2;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new RecAfterClickManager$onClick$1(searchResultAllFragment, uri, i7, searchVideoItem, atomicBoolean2, null), 3, (Object) null);
    }
}
