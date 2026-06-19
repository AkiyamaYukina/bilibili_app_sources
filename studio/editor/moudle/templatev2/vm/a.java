package com.bilibili.studio.editor.moudle.templatev2.vm;

import J3.C2374r0;
import com.bilibili.lib.dd.DeviceDecision;
import com.tencent.connect.common.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f108153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f108154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f108155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f108156d;

    static {
        DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
        f108153a = com.bilibili.studio.videoeditor.extension.k.b(deviceDecision.dd("uper.edit_tpl_music_config", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ));
        f108154b = deviceDecision.getBoolean("uper.edit_tpl_new_ui", true);
        deviceDecision.getBoolean("uper.enable_edit_top_view_show", true);
        f108155c = LazyKt.lazy(new C2374r0(9));
        f108156d = new AtomicBoolean(false);
    }
}
