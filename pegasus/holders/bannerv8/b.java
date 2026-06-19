package com.bilibili.pegasus.holders.bannerv8;

import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f77721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f77723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77724d;

    public /* synthetic */ b(c cVar, int i7, int i8, String str) {
        this.f77721a = cVar;
        this.f77722b = i7;
        this.f77723c = i8;
        this.f77724d = str;
    }

    public final Object invoke(Object obj) {
        JSONObjectCreator jSONObjectCreator = (JSONObjectCreator) obj;
        jSONObjectCreator.to("banner_type", this.f77721a.f77731g);
        jSONObjectCreator.to("is_selected", Integer.valueOf(this.f77722b));
        jSONObjectCreator.to("selected_from", Integer.valueOf(this.f77723c));
        jSONObjectCreator.to("topview_id", this.f77724d);
        return Unit.INSTANCE;
    }
}
