package com.bilibili.ship.theseus.ogv.intro.role;

import android.content.Context;
import android.net.Uri;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/d.class */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Role f93454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreateOgvRoleUIComponent f93455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f93456c;

    public /* synthetic */ d(CreateOgvRoleUIComponent createOgvRoleUIComponent, Role role, boolean z6) {
        this.f93454a = role;
        this.f93455b = createOgvRoleUIComponent;
        this.f93456c = z6;
    }

    public final Object invoke() {
        Role role = this.f93454a;
        String str = role.h;
        CreateOgvRoleUIComponent createOgvRoleUIComponent = this.f93455b;
        if (str == null || str.length() == 0) {
            RouteRequest.Builder builder = new RouteRequest.Builder("bilibili://pgc/role_detail");
            Qj0.g.b(builder, "role_id", String.valueOf(role.f93428a));
            BLRouter.routeTo$default(builder.build(), (Context) null, 2, (Object) null);
        } else {
            Qj0.g.e(createOgvRoleUIComponent.f93416a, Uri.parse(role.h));
        }
        PageReportService.g(createOgvRoleUIComponent.f93420e, this.f93456c ? "united.player-video-detail.character_flow.icon.click" : "united.player-video-detail.character_lineup.icon.click", role.f93435i, 4);
        return Unit.INSTANCE;
    }
}
