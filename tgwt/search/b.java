package com.bilibili.tgwt.search;

import ES0.e0;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.ogv.filmlist.api.c;
import com.bilibili.ogv.operation3.module.followable.CreateFollowableMediaModel$invoke$1;
import com.bilibili.ogv.operation3.module.followable.k;
import com.bilibili.tgwt.api.MovieCardListVo;
import com.tencent.connect.common.Constants;
import it0.C7615a;
import java.util.Map;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentScope;
import kntr.common.router.RouterKt;
import kntr.common.router.UrisKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ml0.C8011b;
import wj0.C8890b;
import wj0.C8891c;
import xj0.C8982c;
import xj0.C8983d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/search/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f111850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f111851c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f111849a = i7;
        this.f111850b = obj;
        this.f111851c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f111849a) {
            case 0:
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                mutableBundleLike.put("seasonId", String.valueOf(((MovieCardListVo.Item) this.f111850b).c()));
                Integer num = (Integer) this.f111851c;
                if (num != null && num.intValue() == 1) {
                    mutableBundleLike.put("type", "1");
                } else if (num != null && num.intValue() == 4) {
                    mutableBundleLike.put("type", Constants.VIA_REPORT_TYPE_CHAT_AUDIO);
                    mutableBundleLike.put("need_open_share", "1");
                } else {
                    mutableBundleLike.put("type", "3");
                }
                return Unit.INSTANCE;
            default:
                KomponentScope komponentScope = (KomponentScope) obj;
                final Router router = (Router) komponentScope.getContext().getCompositionLocal(RouterKt.getLocalRouter());
                C8891c c8891c = (C8891c) this.f111850b;
                C8011b c8011b = c8891c.f128686a;
                final c.C0393c c0393c = (c.C0393c) this.f111851c;
                C7615a c7615aA = c8011b.a(komponentScope, c0393c, null);
                k kVarA = c0393c.f67667l ? c8891c.f128687b.a(komponentScope, c0393c) : new CreateFollowableMediaModel$invoke$1(c0393c, komponentScope, c8891c.f128688c);
                Map<String, String> map = c0393c.f67670o;
                e0 e0Var = new e0(kVarA, 9);
                C8983d c8983d = c8891c.f128689d;
                return komponentScope.__setContent(new C8890b(Unit.INSTANCE, komponentScope.getContext(), komponentScope, c0393c, kVarA, new C8982c(new Function0(router, c0393c) { // from class: wj0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Router f128671a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final c.C0393c f128672b;

                    {
                        this.f128671a = router;
                        this.f128672b = c0393c;
                    }

                    public final Object invoke() {
                        this.f128671a.launch(UrisKt.toUri(this.f128672b.f67669n));
                        return Unit.INSTANCE;
                    }
                }, c8983d, "pgc.operation-playlist.list.play.click", c0393c.f67670o, "pgc.operation-playlist.list.play.show"), new C8982c(e0Var, c8983d, "pgc.operation-playlist.list.follow.click", map, "pgc.operation-playlist.list.follow.show"), c7615aA));
        }
    }
}
