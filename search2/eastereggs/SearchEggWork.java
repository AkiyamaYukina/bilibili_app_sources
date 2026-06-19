package com.bilibili.search2.eastereggs;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bilibili.api.utils.FastJsonUtils;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.search2.api.SearchEasterEggConfig;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/SearchEggWork.class */
@StabilityInferred(parameters = 0)
public final class SearchEggWork extends Worker {
    public SearchEggWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    @NotNull
    public final ListenableWorker.a g() {
        BLog.e("SearchEggWork", "start do work");
        Object obj = ((HashMap) this.f53379b.f53393b.f53409a).get("search_egg_key");
        String str = obj instanceof String ? (String) obj : null;
        BLog.v("SearchEggWork", str);
        SearchEasterEggConfig searchEasterEggConfig = (SearchEasterEggConfig) FastJsonUtils.parse(str, SearchEasterEggConfig.class);
        if (searchEasterEggConfig == null) {
            BLog.e("SearchEggWork", "data is null");
            return new ListenableWorker.a.C0290a();
        }
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchLocalDataManager.k(searchEasterEggConfig);
        return new ListenableWorker.a.c();
    }
}
