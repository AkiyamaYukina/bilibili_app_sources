package com.bilibili.search2.main;

import Bl.x1;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatAuthItem;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.main.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/b.class */
@StabilityInferred(parameters = 0)
public final class C6035b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public x1 f86745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SearchPageStateModel f86746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SearchChatAuthItem f86747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f86748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86749e = a(BiliContext.application());

    public static boolean a(Context context) {
        boolean z6 = true;
        if (context != null) {
            if (GarbManager.getCurGarb().isPure() && (MultipleThemeUtils.isWhiteTheme(context) || MultipleThemeUtils.isNightTheme(context))) {
                z6 = !MultipleThemeUtils.isNightTheme(context);
            } else {
                GarbManager.getCurGarb().isPure();
                z6 = true;
            }
        }
        return z6;
    }

    public final void b(boolean z6) {
        this.f86749e = z6;
        x1 x1Var = this.f86745a;
        SearchChatAuthItem searchChatAuthItem = this.f86747c;
        if (x1Var == null || searchChatAuthItem == null) {
            return;
        }
        com.bilibili.search2.utils.extension.c.a(x1Var.e, z6 ? searchChatAuthItem.getIcon() : searchChatAuthItem.getIconNight(), null, false, null, null, 0, 0, 254);
    }
}
