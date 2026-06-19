package com.bilibili.music.podcast.moss;

import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderUIComponentService;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f66876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f66877d;

    public /* synthetic */ b(Object obj, int i7, Object obj2, Object obj3) {
        this.f66874a = i7;
        this.f66875b = obj;
        this.f66876c = obj2;
        this.f66877d = obj3;
    }

    public final Object invoke() {
        Unit unit;
        switch (this.f66874a) {
            case 0:
                if (((a) this.f66875b).isCancel()) {
                    unit = Unit.INSTANCE;
                } else {
                    Object obj = this.f66877d;
                    a aVar = (a) this.f66876c;
                    aVar.onDataSuccess(aVar.d(obj));
                    unit = Unit.INSTANCE;
                }
                return unit;
            default:
                ((OgvReserveReminderUIComponentService) this.f66875b).f((OgvReserveReminderVo) this.f66876c, ((Boolean) ((MutableStateFlow) this.f66877d).getValue()).booleanValue());
                return Unit.INSTANCE;
        }
    }
}
