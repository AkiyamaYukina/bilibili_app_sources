package com.bilibili.search2.eastereggs;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.search2.api.SearchResultAll;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/x.class */
@StabilityInferred(parameters = 0)
public final class x extends a {
    @Override // com.bilibili.search2.eastereggs.a
    public final void a(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        Uri uri = Uri.parse(this.f86506a.getUrl());
        if (uri == null) {
            return;
        }
        Os0.e.g(Os0.e.f18030a, context, uri.toString());
    }

    @Override // com.bilibili.search2.eastereggs.a
    public final void b() {
    }

    @Override // com.bilibili.search2.eastereggs.a
    public final void c() {
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchLocalDataManager.i(this.f86506a.getId());
        g(0L);
    }

    @Override // com.bilibili.search2.eastereggs.a
    public final boolean d(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchResultAll.EasterEgg easterEgg = this.f86506a;
        int iG = SearchLocalDataManager.g(easterEgg.getId());
        String url = easterEgg.getUrl();
        return (url == null || StringsKt.isBlank(url) || iG >= easterEgg.getShowCount()) ? false : true;
    }
}
