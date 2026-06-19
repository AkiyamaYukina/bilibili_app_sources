package com.bilibili.pegasus.holders.bannerv8;

import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.adcommon.data.model.Args;
import com.bilibili.adcommon.data.model.CreativeContent;
import com.bilibili.adcommon.data.model.FeedExtra;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.AvBannerData;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.LiveBannerData;
import com.bilibili.pegasus.data.component.ArgsData;
import ep0.C6963a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/v.class */
public final class v {
    public static final void a(gp0.d dVar) {
        if (dVar.getAdInfo() == null && dVar.isAdLoc()) {
            dVar.setAdInfo(new AdInfo(true, dVar.getSrcId(), dVar.getResourceId(), dVar.getRequestId(), dVar.getServerType(), dVar.getIp(), dVar.getIndex(), dVar.getCardIndex(), dVar.getId(), false, 0L, 0L, 0, (CreativeContent) null, (String) null, (String) null, 0, (FeedExtra) null, 0L, 0, 1048064, (DefaultConstructorMarker) null));
        }
    }

    @Nullable
    public static final AvBannerData b(@Nullable gp0.h hVar) {
        Long lValueOf = null;
        if (hVar == null) {
            return null;
        }
        String title = hVar.getTitle();
        String cover = hVar.getCover();
        String uri = hVar.getUri();
        ArgsData args = hVar.getArgs();
        Long lValueOf2 = args != null ? Long.valueOf(args.getOnline()) : null;
        ArgsData args2 = hVar.getArgs();
        String rname = args2 != null ? args2.getRname() : null;
        ArgsData args3 = hVar.getArgs();
        Long lValueOf3 = args3 != null ? Long.valueOf(args3.getRoomId()) : null;
        ArgsData args4 = hVar.getArgs();
        String tname = args4 != null ? args4.getTname() : null;
        ArgsData args5 = hVar.getArgs();
        Long lValueOf4 = args5 != null ? Long.valueOf(args5.getUpId()) : null;
        ArgsData args6 = hVar.getArgs();
        String upName = args6 != null ? args6.getUpName() : null;
        ArgsData args7 = hVar.getArgs();
        Long lValueOf5 = args7 != null ? Long.valueOf(args7.getRid()) : null;
        ArgsData args8 = hVar.getArgs();
        if (args8 != null) {
            lValueOf = Long.valueOf(args8.getTid());
        }
        return new AvBannerData(title, cover, uri, new Args(lValueOf2, rname, lValueOf3, tname, lValueOf4, upName, lValueOf5, lValueOf), hVar.getPendantAvatar(), hVar.getPlayerArgs(), hVar.getHideDanmakuSwitch(), hVar.getDisableDanmaku());
    }

    @Nullable
    public static final LiveBannerData c(@Nullable gp0.e eVar) {
        Long lValueOf = null;
        if (eVar == null) {
            return null;
        }
        String title = eVar.getTitle();
        String cover = eVar.getCover();
        String uri = eVar.getUri();
        String strG = eVar.g();
        ArgsData args = eVar.getArgs();
        Long lValueOf2 = args != null ? Long.valueOf(args.getOnline()) : null;
        ArgsData args2 = eVar.getArgs();
        String rname = args2 != null ? args2.getRname() : null;
        ArgsData args3 = eVar.getArgs();
        Long lValueOf3 = args3 != null ? Long.valueOf(args3.getRoomId()) : null;
        ArgsData args4 = eVar.getArgs();
        String tname = args4 != null ? args4.getTname() : null;
        ArgsData args5 = eVar.getArgs();
        Long lValueOf4 = args5 != null ? Long.valueOf(args5.getUpId()) : null;
        ArgsData args6 = eVar.getArgs();
        String upName = args6 != null ? args6.getUpName() : null;
        ArgsData args7 = eVar.getArgs();
        Long lValueOf5 = args7 != null ? Long.valueOf(args7.getRid()) : null;
        ArgsData args8 = eVar.getArgs();
        if (args8 != null) {
            lValueOf = Long.valueOf(args8.getTid());
        }
        return new LiveBannerData(title, cover, uri, strG, new Args(lValueOf2, rname, lValueOf3, tname, lValueOf4, upName, lValueOf5, lValueOf), eVar.getPendantAvatar(), eVar.getRightTopLiveBadge(), C6963a.e(eVar, false, true, eVar.f120591Z));
    }
}
