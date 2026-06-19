package com.bilibili.ship.theseus.ogv.intro;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent;
import com.bilibili.ship.theseus.ogv.intro.role.RoleGroup;
import com.bilibili.ship.theseus.ogv.intro.role.RolesData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/f.class */
public final /* synthetic */ class C6188f implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateOgvRoleUIComponent f92661a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Module module = mVar.f124400a;
        if (module.hasDeliveryData() && module.getDeliveryData().hasCharacters()) {
            RolesData rolesData = (RolesData) JsonUtilKt.parseJson(Pj0.e.a(module.getDeliveryData()), new B().getType());
            String str = rolesData.f93443b;
            List<RoleGroup> list = rolesData.a().f93439a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((RoleGroup) it.next()).a());
            }
            mVar.a(this.f92661a.c(new com.bilibili.ship.theseus.ogv.intro.role.t(str, rolesData.f93444c, arrayList)));
        }
    }
}
