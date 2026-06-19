package com.bilibili.ship.theseus.united.page.online;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.ship.theseus.united.page.view.t;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t f102108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f102110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f102111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f102112e;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.page.online.VideoOnlineNum r8, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.view.t r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.online.a.<init>(android.content.Context, com.bilibili.ship.theseus.united.page.online.VideoOnlineNum, com.bilibili.ship.theseus.united.page.view.t):void");
    }

    public final boolean a() {
        boolean z6 = false;
        if (b()) {
            z6 = false;
            if (c().f102113a) {
                SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
                z6 = false;
                if (bLKVSharedPreference != null ? bLKVSharedPreference.getBoolean("pref_player_full_screen_online_num_key", true) : false) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final boolean b() {
        return ((Boolean) this.f102110c.getValue()).booleanValue();
    }

    @NotNull
    public final b c() {
        return (b) this.f102112e.getValue();
    }
}
