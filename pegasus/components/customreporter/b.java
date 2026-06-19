package com.bilibili.pegasus.components.customreporter;

import android.app.Application;
import android.os.SystemClock;
import com.bilibili.ad.reward.activity.S;
import com.bilibili.base.BiliContext;
import com.mall.videodetail.vd.united.page.playlimitlayer.ActionType;
import com.mall.videodetail.vd.united.page.playlimitlayer.BannerVo;
import com.mall.videodetail.vd.united.page.playlimitlayer.GradientColorVo;
import com.mall.videodetail.vd.united.page.playlimitlayer.ReportVo;
import com.mall.videodetail.vd.united.page.playlimitlayer.TaskParamVo;
import com.mall.videodetail.vd.united.page.playlimitlayer.TextVo;
import java.util.Map;
import kntr.app.mall.product.details.page.ui.container.TopContainerKt;
import kntr.app.mall.product.details.page.ui.container.y;
import kntr.app.mall.product.details.page.vm.PageViewModel;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.util.DeviceUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f75923c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f75921a = i7;
        this.f75922b = obj;
        this.f75923c = obj2;
    }

    public final Object invoke() {
        Unit unit;
        String str = null;
        Object obj = this.f75923c;
        Object obj2 = this.f75922b;
        switch (this.f75921a) {
            case 0:
                long[] jArr = (long[]) obj2;
                if (jArr.length == 0) {
                    unit = Unit.INSTANCE;
                } else {
                    ArraysKt.sort(jArr);
                    EventType eventType = EventType.FRAME_MONITOR;
                    long j7 = jArr[jArr.length - 1];
                    c cVar = (c) obj;
                    Pair pair = TuplesKt.to("max_time", String.valueOf(j7 / ((long) cVar.f75928o)));
                    long j8 = jArr[(int) (jArr.length * 0.9f)];
                    int i7 = cVar.f75928o;
                    long j9 = i7;
                    Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, TuplesKt.to("90_time", String.valueOf(j8 / j9)), TuplesKt.to("80_time", String.valueOf(jArr[(int) (jArr.length * 0.8f)] / j9)), TuplesKt.to("50_time", String.valueOf(jArr[(int) (jArr.length * 0.5f)] / j9)), TuplesKt.to("average_time", String.valueOf(ArraysKt.average(jArr) / ((double) i7))), S.a(SystemClock.uptimeMillis(), cVar.f75929p, "start_duration")});
                    Lazy lazy = l.f75948a;
                    Application application = BiliContext.application();
                    if (application != null) {
                        mapMutableMapOf.putAll(DeviceUtil.getDeviceInfo(application));
                        mapMutableMapOf.put("level", DeviceUtil.getLevel(application).name());
                    }
                    j.a(eventType, mapMutableMapOf);
                    unit = Unit.INSTANCE;
                }
                break;
            case 1:
                BannerVo bannerVo = ((com.mall.videodetail.vd.united.page.playlimitlayer.f) obj).C;
                ReportVo reportVo = bannerVo != null ? bannerVo.d : null;
                if (bannerVo != null) {
                    str = bannerVo.a;
                }
                ((com.mall.videodetail.vd.united.page.playlimitlayer.c) obj2).a(new TextVo("", 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, reportVo, str, ActionType.VIP, (TextVo) null, (String) null, (TextVo) null, (Integer) null, (Integer) null, (GradientColorVo) null, (Map) null, (TaskParamVo) null, 261244));
                break;
            default:
                int i8 = TopContainerKt.b.a[((y) obj2).getIconType().ordinal()];
                PageViewModel pageViewModel = (PageViewModel) obj;
                if (i8 == 1) {
                    kntr.app.mall.product.details.page.vm.j.c(pageViewModel.t, "mall.mall-detail.topshare.0.show", (Map) null, false, 10);
                } else if (i8 == 2) {
                    kntr.app.mall.product.details.page.vm.j.c(pageViewModel.t, "mall.mall-detail.go-addcart.0.show", (Map) null, false, 10);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
