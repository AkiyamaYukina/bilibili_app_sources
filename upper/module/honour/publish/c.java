package com.bilibili.upper.module.honour.publish;

import com.bilibili.upper.module.honour.ui.KingHonourPublishActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/c.class */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f113182a;

    public /* synthetic */ c(e eVar) {
        this.f113182a = eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        e eVar = this.f113182a;
        KingHonourPublishActivity.b bVar = eVar.h;
        if (bVar != null) {
            bVar.a(str, zBooleanValue);
        }
        eVar.h = null;
        return Unit.INSTANCE;
    }
}
