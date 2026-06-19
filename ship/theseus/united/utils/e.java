package com.bilibili.ship.theseus.united.utils;

import android.app.Application;
import androidx.media3.common.PlaybackException;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import kotlin.random.Random;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/e.class */
public final class e {
    public static final boolean a(boolean z6) {
        boolean z7;
        Application fapp = FoundationAlias.getFapp();
        if (BiliAccounts.get(fapp).isLogin()) {
            z7 = true;
        } else {
            if (z6) {
                PlayerRouteUris.Routers.toMainLogin$default(PlayerRouteUris.Routers.INSTANCE, fapp, (String) null, 2, (Object) null);
            } else {
                PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, fapp, 1024, (String) null, 4, (Object) null);
            }
            z7 = false;
        }
        return z7;
    }

    @NotNull
    public static final String b() {
        return ByteString.Companion.encodeUtf8(BuvidHelper.getBuvid() + System.currentTimeMillis() + Random.Default.nextInt(PlaybackException.CUSTOM_ERROR_CODE_BASE)).sha1().hex();
    }

    public static final long c() {
        return BiliAccounts.get(FoundationAlias.getFapp()).mid();
    }
}
