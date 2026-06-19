package com.bilibili.lib.ui;

import Vf0.C2951n;
import android.app.Activity;
import com.bilibili.lib.ui.permission.PermissionBiz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/B.class */
public final /* synthetic */ class B implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionBiz f64704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f64706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f64708e;

    public /* synthetic */ B(PermissionBiz permissionBiz, String str, Activity activity, int i7, String[] strArr) {
        this.f64704a = permissionBiz;
        this.f64705b = str;
        this.f64706c = activity;
        this.f64707d = i7;
        this.f64708e = strArr;
    }

    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        PermissionRequestUtils permissionRequestUtils = PermissionRequestUtils.INSTANCE;
        if (zBooleanValue) {
            C2951n.b(this.f64704a, this.f64705b, true);
        }
        this.f64706c.onRequestPermissionsResult(this.f64707d, this.f64708e, zBooleanValue ? new int[]{0} : new int[]{-1});
        return Unit.INSTANCE;
    }
}
