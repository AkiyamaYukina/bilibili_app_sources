package com.bilibili.ship.theseus.united.page.castscreen;

import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/c.class */
public final class c extends ProjectionDataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BusinessCastScreenService.b f99145b;

    public c(BusinessCastScreenService.b bVar) {
        this.f99145b = bVar;
    }

    @Override // com.bilibili.lib.projection.datasource.ProjectionDataSource
    public final IProjectionItem getItem(int i7) {
        return this.f99145b.getItem(i7);
    }

    @Override // com.bilibili.lib.projection.datasource.ProjectionDataSource
    public final int getItemCount() {
        return this.f99145b.getItemCount();
    }

    @Override // com.bilibili.lib.projection.datasource.ProjectionDataSource
    public final ProjectionDataSource.b next(int i7) {
        return this.f99145b.b(i7) ? super.next(i7) : null;
    }
}
