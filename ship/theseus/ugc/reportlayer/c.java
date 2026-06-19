package com.bilibili.ship.theseus.ugc.reportlayer;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.fastjson.JSONArray;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.vip.cashier2.o;
import com.bilibili.vip.cashier2.p;
import com.mall.ui.page.collect.MallCollectFragment;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kntr.app.tribee.invite.viewmodel.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f98494b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f98493a = i7;
        this.f98494b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f98493a) {
            case 0:
                UgcReporterCoverService ugcReporterCoverService = (UgcReporterCoverService) this.f98494b;
                Job job = ugcReporterCoverService.f98481o;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                PageReportService.g(ugcReporterCoverService.f98474g, "player.player.report-av-entry.click.player", O4.b.c("button_name", "show_ugc"), 4);
                break;
            case 1:
                List list = (List) this.f98494b;
                ((LazyListScope) obj).items(list.size(), null, new o(new J50.a(3), list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new p(list)));
                break;
            case 2:
                JSONArray jSONArray = (JSONArray) obj;
                vP0.a aVar = ((MallCollectFragment) this.f98494b).e;
                if (aVar != null) {
                    HashMap map = new HashMap();
                    map.put("item_ids", jSONArray);
                    aVar.l = map;
                }
                break;
            default:
                ((Function1) this.f98494b).invoke(new g.a((String) obj));
                break;
        }
        return Unit.INSTANCE;
    }
}
