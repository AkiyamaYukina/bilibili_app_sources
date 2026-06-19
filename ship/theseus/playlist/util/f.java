package com.bilibili.ship.theseus.playlist.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.videodownloader.model.OfflinePermissionCode;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BiliAccounts f96126a = BiliAccounts.get(FoundationAlias.getFapp());

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/f$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.util.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/f$a$a.class */
        public static final /* synthetic */ class C0805a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f96127a;

            static {
                int[] iArr = new int[OfflinePermissionCode.values().length];
                try {
                    iArr[OfflinePermissionCode.ChargeError.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[OfflinePermissionCode.Vip.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[OfflinePermissionCode.Dolby.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f96127a = iArr;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.bilibili.ship.theseus.playlist.PlaylistRepository.d a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.playlist.api.MultiTypeMedia r5, @org.jetbrains.annotations.Nullable Ou0.c r6) {
            /*
                Method dump skipped, instruction units count: 499
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.util.f.a.a(com.bilibili.ship.theseus.playlist.api.MultiTypeMedia, Ou0.c):com.bilibili.ship.theseus.playlist.PlaylistRepository$d");
        }
    }
}
