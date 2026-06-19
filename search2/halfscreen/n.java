package com.bilibili.search2.halfscreen;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import javax.inject.Singleton;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/n.class */
@Singleton
@StabilityInferred(parameters = 1)
public final class n implements Ns0.d {
    @Override // Ns0.d
    @NotNull
    public final Ns0.g a(@Nullable String str) {
        SearchCoreHostFragment searchCoreHostFragment = new SearchCoreHostFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("arg_source_url", str);
        }
        searchCoreHostFragment.setArguments(bundle);
        int i7 = 0;
        Ns0.e eVar = new Ns0.e(0, 0);
        Ns0.e eVar2 = eVar;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                eVar2 = eVar;
            } else {
                try {
                    Uri uri = Uri.parse(str);
                    String queryParameter = uri.getQueryParameter("scroll_to_fullscreen");
                    Integer intOrNull = queryParameter != null ? StringsKt.toIntOrNull(queryParameter) : null;
                    int i8 = (intOrNull != null && intOrNull.intValue() == 1) ? 1 : 0;
                    String queryParameter2 = uri.getQueryParameter("half_screen_page_type");
                    Integer intOrNull2 = null;
                    if (queryParameter2 != null) {
                        intOrNull2 = StringsKt.toIntOrNull(queryParameter2);
                    }
                    if (intOrNull2 != null && intOrNull2.intValue() == 1) {
                        i7 = 1;
                    }
                    eVar2 = new Ns0.e(i8, i7);
                } catch (Exception e7) {
                    eVar2 = eVar;
                }
            }
        }
        return new Ns0.g(searchCoreHostFragment, eVar2, searchCoreHostFragment.f86548g, searchCoreHostFragment.f86549i, searchCoreHostFragment.f86551k);
    }

    @Override // Ns0.d
    public final boolean b(@NotNull Context context, @Nullable String str) {
        if (!KScreenAdjustUtilsKt.isNormal(ScreenAdjustUtilsKt.windowSize(context))) {
            return false;
        }
        boolean z6 = false;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                z6 = false;
            } else {
                try {
                    String queryParameter = Uri.parse(str).getQueryParameter("search_half_screen");
                    z6 = false;
                    if (queryParameter != null) {
                        Integer intOrNull = StringsKt.toIntOrNull(queryParameter);
                        if (intOrNull == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                            if (intOrNull.intValue() == 1) {
                                z6 = true;
                            }
                        }
                    }
                } catch (Exception e7) {
                    z6 = false;
                }
            }
        }
        return z6;
    }
}
