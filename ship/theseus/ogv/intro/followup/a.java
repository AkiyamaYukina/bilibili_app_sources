package com.bilibili.ship.theseus.ogv.intro.followup;

import android.content.Context;
import com.bilibili.community.follow.f;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ship.theseus.ogv.intro.followup.c;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvGuideOfFollowUpperService f93069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvGuideOfFollowUpperData f93070b;

    public /* synthetic */ a(OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService, OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData) {
        this.f93069a = ogvGuideOfFollowUpperService;
        this.f93070b = ogvGuideOfFollowUpperData;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        final c.a aVar = (c.a) obj;
        final OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService = this.f93069a;
        if (ogvGuideOfFollowUpperService.f93051c.isLogin()) {
            OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData = this.f93070b;
            PageReportService.g(ogvGuideOfFollowUpperService.f93052d, "united.player-video-detail.video-information-ogv.follow-up-button.click", ogvGuideOfFollowUpperData.f93047c, 4);
            Upper upperB = ogvGuideOfFollowUpperData.b();
            if (upperB != null) {
                f fVar = f.a;
                final long j7 = upperB.f93060a;
                Boolean bool = (Boolean) f.c.c(f.f(j7));
                if (bool != null ? bool.booleanValue() : false) {
                    Context context = ogvGuideOfFollowUpperService.f93050b;
                    jO.c cVar = new jO.c(context, "confirm", context.getString(2131847192));
                    jO.a aVar2 = new jO.a(ogvGuideOfFollowUpperService.f93050b);
                    aVar2.a = ogvGuideOfFollowUpperService.f93050b.getString(2131847608);
                    aVar2.a(cVar);
                    aVar2.g = new kO.a(ogvGuideOfFollowUpperService, j7, aVar) { // from class: com.bilibili.ship.theseus.ogv.intro.followup.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OgvGuideOfFollowUpperService f93071a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final long f93072b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final c.a f93073c;

                        {
                            this.f93071a = ogvGuideOfFollowUpperService;
                            this.f93072b = j7;
                            this.f93073c = aVar;
                        }

                        public final void c(jO.c cVar2) {
                            String str = cVar2.d;
                            if (str.hashCode() == 951117504 && str.equals("confirm")) {
                                OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService2 = this.f93071a;
                                ogvGuideOfFollowUpperService2.getClass();
                                BuildersKt.launch$default(ogvGuideOfFollowUpperService2.f93049a, (CoroutineContext) null, (CoroutineStart) null, new OgvGuideOfFollowUpperService$requestFollowUpper$1(this.f93072b, ogvGuideOfFollowUpperService2, this.f93073c, null), 3, (Object) null);
                            }
                        }
                    };
                    aVar2.c();
                } else {
                    BuildersKt.launch$default(ogvGuideOfFollowUpperService.f93049a, (CoroutineContext) null, (CoroutineStart) null, new OgvGuideOfFollowUpperService$requestFollowUpper$1(j7, ogvGuideOfFollowUpperService, aVar, null), 3, (Object) null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = Unit.INSTANCE;
            }
        } else {
            BLRouter.routeTo(ec.c.a("bilibili://login"), ogvGuideOfFollowUpperService.f93050b);
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
