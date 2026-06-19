package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.ogv.activity.OgvActivityService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TaskOperationAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/K.class */
public final class K implements com.bilibili.ship.theseus.united.page.restrictionlayer.t<TaskOperationAction> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActivityService f92231a;

    public K(OgvActivityService ogvActivityService) {
        this.f92231a = ogvActivityService;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final void a(TaskOperationAction taskOperationAction) {
        this.f92231a.g(taskOperationAction.f102699b);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.t
    public final Class<TaskOperationAction> b() {
        return TaskOperationAction.class;
    }
}
