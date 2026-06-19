package com.bilibili.ship.theseus.ogv.castscreen;

import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/b.class */
public final class b implements BusinessCastScreenService.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ProjectionItemData> f91674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91676d;

    public b(int i7, List<ProjectionItemData> list, boolean z6, boolean z7) {
        this.f91673a = i7;
        this.f91674b = list;
        this.f91675c = z6;
        this.f91676d = z7;
    }

    @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
    public final boolean a() {
        return this.f91676d;
    }

    @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
    public final boolean b(int i7) {
        return i7 < this.f91674b.size();
    }

    @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
    public final boolean c() {
        return this.f91675c;
    }

    @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
    public final ProjectionItemData getItem(int i7) {
        return this.f91674b.get(i7);
    }

    @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
    public final int getItemCount() {
        return this.f91674b.size();
    }

    @Override // com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.b
    public final int getStartIndex() {
        int i7 = this.f91673a;
        if (i7 <= -1) {
            i7 = 0;
        }
        return i7;
    }
}
