package com.bilibili.pegasus.utils;

import E2.C1612a;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.base.BiliContext;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.tencent.map.geolocation.TencentLocation;
import java.util.Map;
import kntr.common.ad.core.AdSlot;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/m.class */
@StabilityInferred(parameters = 0)
public class m extends com.bilibili.app.comm.list.common.api.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f78874b = com.bilibili.app.comm.list.common.api.d.a;

    public void addCommonParam(@Nullable Map<String, String> map) {
        super.addCommonParam(map);
        if (BiliContext.application() == null) {
            return;
        }
        String str = GAdCoreKt.getGAdExtra().get(AdSlot.PEGASUS_FEED);
        String strC = com.bilibili.pegasus.api.C.c();
        int i7 = (EnvironmentManager.getInstance().isFirstStart() && com.bilibili.pegasus.api.C.b) ? 1 : 0;
        boolean zEnablePlayUrlHTTPS = PlayerSettingHelper.enablePlayUrlHTTPS();
        boolean zF = Lh.n.f();
        String str2 = Build.MODEL;
        if (map != null) {
            map.put("column", String.valueOf(PegasusStyle.INSTANCE.getCurrentStyle().getValue()));
            map.put(TencentLocation.NETWORK_PROVIDER, strC);
            map.put("ad_extra", str);
            C1612a.c(i7, "device_name", str2, "device_type", map);
            map.put("https_url_req", String.valueOf(zEnablePlayUrlHTTPS ? 1 : 0));
            map.put("recsys_mode", String.valueOf(zF ? 1 : 0));
            map.put("autoplay_card", String.valueOf(PegasusInlineConfigKt.getReportInt((IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null))));
        }
        com.bilibili.pegasus.api.C.b = false;
    }
}
