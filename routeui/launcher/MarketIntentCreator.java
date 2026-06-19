package com.bilibili.routeui.launcher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bilibili.lib.blrouter.IntentCreator;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.mobile.BLMobileHumanActionNative;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/launcher/MarketIntentCreator.class */
public final class MarketIntentCreator implements IntentCreator {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MARKET_BUNDLE = "market_bundle";

    @NotNull
    public static final String MARKET_PACKAGE_NAME = "market_package_name";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/launcher/MarketIntentCreator$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String getMarketPackageName$default(Companion companion, boolean z6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                z6 = false;
            }
            return companion.getMarketPackageName(z6);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getMarketPackageName(boolean r3) {
            /*
                r2 = this;
                boolean r0 = kntr.base.utils.foundation.RomUtils.isMiuiRom()
                if (r0 == 0) goto Lc
                java.lang.String r0 = "com.xiaomi.market"
                r4 = r0
                goto L62
            Lc:
                boolean r0 = kntr.base.utils.foundation.RomUtils.isHuaweiRom()
                if (r0 == 0) goto L18
                java.lang.String r0 = "com.huawei.appmarket"
                r4 = r0
                goto L62
            L18:
                boolean r0 = kntr.base.utils.foundation.RomUtils.isVivoRom()
                if (r0 == 0) goto L24
                java.lang.String r0 = "com.bbk.appstore"
                r4 = r0
                goto L62
            L24:
                boolean r0 = kntr.base.utils.foundation.RomUtils.isOppoRom()
                if (r0 == 0) goto L3a
                r0 = r3
                if (r0 == 0) goto L34
            L2e:
                java.lang.String r0 = "com.oppo.market"
                r4 = r0
                goto L62
            L34:
                java.lang.String r0 = "com.heytap.market"
                r4 = r0
                goto L62
            L3a:
                boolean r0 = kntr.base.utils.foundation.RomUtils.isSamsungRom()
                if (r0 == 0) goto L46
                java.lang.String r0 = "com.sec.android.app.samsungapps"
                r4 = r0
                goto L62
            L46:
                boolean r0 = kntr.base.utils.foundation.RomUtils.isMeizuRom()
                if (r0 == 0) goto L52
                java.lang.String r0 = "com.meizu.mstore"
                r4 = r0
                goto L62
            L52:
                boolean r0 = kntr.base.utils.foundation.RomUtils.isOnePlusRom()
                if (r0 == 0) goto L5f
                r0 = r3
                if (r0 == 0) goto L2e
                goto L34
            L5f:
                java.lang.String r0 = ""
                r4 = r0
            L62:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.routeui.launcher.MarketIntentCreator.Companion.getMarketPackageName(boolean):java.lang.String");
        }
    }

    @Nullable
    public Intent createIntent(@NotNull Context context, @NotNull RouteRequest routeRequest, @NotNull RouteInfo routeInfo) {
        Intent intent = new Intent("android.intent.action.VIEW", routeRequest.getPureUri());
        Bundle bundle = routeRequest.getExtras().getBundle(MARKET_BUNDLE);
        String str = (String) (bundle != null ? bundle.get(MARKET_PACKAGE_NAME) : null);
        if (str.length() > 0) {
            intent.setPackage(str);
        }
        intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
        return intent;
    }
}
