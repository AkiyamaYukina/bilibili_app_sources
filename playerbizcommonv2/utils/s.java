package com.bilibili.playerbizcommonv2.utils;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/s.class */
public final class s {
    public static void a(@NotNull Context context, @NotNull t tVar, boolean z6) {
        RouteRequest.Builder builder = new RouteRequest.Builder(LJ0.c.a(LogReportStrategy.TAG_DEFAULT, "podcast").appendQueryParameter("oid", String.valueOf(tVar.f81945a)).appendQueryParameter("sid", String.valueOf(tVar.f81946b)).appendQueryParameter("from_spmid", tVar.f81947c).appendQueryParameter("from_module", tVar.f81948d).appendQueryParameter("track_id", tVar.f81949e).appendQueryParameter("from_type", String.valueOf(tVar.f81950f)).appendQueryParameter("start_progress", String.valueOf(tVar.f81951g)).appendQueryParameter("start_speed", String.valueOf(tVar.h)).appendQueryParameter("share_id", String.valueOf(tVar.f81952i)).appendQueryParameter("enter_transition", String.valueOf(tVar.f81953j)).appendQueryParameter("expand_top_car", String.valueOf(tVar.f81954k)).appendQueryParameter("from_route", tVar.f81955l).appendQueryParameter("next", tVar.f81956m).build());
        if (z6) {
            builder.requestCode(557);
        }
        BLRouter.routeTo(builder.build(), context);
    }
}
