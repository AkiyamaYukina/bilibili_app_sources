package com.bilibili.ship.theseus.cheese.player.module;

import android.app.Activity;
import bolts.Task;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.playerbizcommonv2.utils.p;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.CheckAndGrantPermission;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/a.class */
public final class a implements ChronosRequestHandler<CheckAndGrantPermission.Request, CheckAndGrantPermission.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90662a = Reflection.typeOf(CheckAndGrantPermission.Request.class).isMarkedNullable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheeseChronosBusinessService f90663b;

    public a(CheeseChronosBusinessService cheeseChronosBusinessService) {
        this.f90663b = cheeseChronosBusinessService;
    }

    public final Class<CheckAndGrantPermission.Request> getRequestClass() {
        return CheckAndGrantPermission.Request.class;
    }

    public final boolean getRequestNullable() {
        return this.f90662a;
    }

    public final ChronosResponseWrapper<CheckAndGrantPermission.Response> handle(CheckAndGrantPermission.Request request) {
        CheckAndGrantPermission.Response response;
        CheckAndGrantPermission.Request request2 = request;
        String[] strArr = Intrinsics.areEqual(request2.getType(), "AUDIO_RECORD") ? PermissionsChecker.AUDIO_PERMISSION : null;
        if (strArr == null) {
            BLog.e("CheeseChronosBusinessService$addPermissionGrantHandler$$inlined$chronosRequestHandler$1-handle", "[theseus-cheese-CheeseChronosBusinessService$addPermissionGrantHandler$$inlined$chronosRequestHandler$1-handle] CheckAndGrantPermission permission is null, return", (Throwable) null);
            response = null;
        } else {
            CheeseChronosBusinessService cheeseChronosBusinessService = this.f90663b;
            Activity activity = cheeseChronosBusinessService.f90651l;
            String[] strArr2 = PermissionsChecker.AUDIO_PERMISSION;
            boolean zCheckSelfPermissions = PermissionsChecker.checkSelfPermissions(activity, strArr2);
            defpackage.a.b("[theseus-cheese-CheeseChronosBusinessService$addPermissionGrantHandler$$inlined$chronosRequestHandler$1-handle] ", "CheckAndGrantPermission request type: " + request2.getType() + " grant: " + request2.getGrant() + " checkResult: " + zCheckSelfPermissions, "CheeseChronosBusinessService$addPermissionGrantHandler$$inlined$chronosRequestHandler$1-handle");
            if (!zCheckSelfPermissions && Intrinsics.areEqual(request2.getGrant(), Boolean.TRUE)) {
                String str = (String) ArraysKt.firstOrNull(strArr);
                Activity activity2 = cheeseChronosBusinessService.f90651l;
                if (PermissionsChecker.isNotFirstAndNotRationale(activity2, str)) {
                    p.k(activity2.getString(2131855197));
                } else {
                    PermissionsChecker.grantPermission(activity2, cheeseChronosBusinessService.f90652m, strArr2, 1001, 2131825605, activity2.getString(2131832494)).continueWith(new b(request2, cheeseChronosBusinessService), Task.UI_THREAD_EXECUTOR);
                }
            }
            response = new CheckAndGrantPermission.Response();
            response.setGranted(Boolean.valueOf(zCheckSelfPermissions));
        }
        return new ChronosResponseWrapper.Success(response);
    }
}
