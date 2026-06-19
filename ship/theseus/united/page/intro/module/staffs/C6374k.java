package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.view.View;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/k.class */
public final /* synthetic */ class C6374k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaffsNewComponent.a f101876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StaffsNewComponent.b f101877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StaffsNewComponent f101878d;

    public /* synthetic */ C6374k(long j7, StaffsNewComponent.a aVar, StaffsNewComponent.b bVar, StaffsNewComponent staffsNewComponent) {
        this.f101875a = j7;
        this.f101876b = aVar;
        this.f101877c = bVar;
        this.f101878d = staffsNewComponent;
    }

    public final Object invoke(Object obj) {
        ((Long) obj).getClass();
        StaffsNewComponent.a aVar = this.f101876b;
        long authorId = aVar.f101813b.getAuthorId();
        long j7 = this.f101875a;
        if (j7 == authorId) {
            View view = aVar.f101814c;
            this.f101877c.getClass();
            view.setVisibility(8);
            this.f101878d.f101810k.put(Long.valueOf(j7), StaffsNewComponent.FollowButtonState.CHANGE_TO_HIDDEN);
        }
        return Unit.INSTANCE;
    }
}
