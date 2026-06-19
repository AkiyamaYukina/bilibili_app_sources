package com.bilibili.studio.videoeditor.help.compiler.sdk;

import com.bilibili.lib.dd.DeviceDecision;
import com.tencent.connect.common.Constants;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f109688a = "0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f109689b;

    static {
        Lazy lazy = zw0.b.f130950a;
        DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
        String str = Constants.VIA_REPORT_TYPE_SET_AVATAR;
        String strDd = deviceDecision.dd("uper.copy_to_album_black_os_config", Constants.VIA_REPORT_TYPE_SET_AVATAR);
        if (strDd != null) {
            str = strDd;
        }
        f109689b = str;
    }
}
