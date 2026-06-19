package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.BadgeInfo;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonRecommend;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonRecommendContent;
import com.bapis.bilibili.app.viewunite.common.PugvSeasonRecommendMore;
import com.bapis.bilibili.app.viewunite.common.StatInfo;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.bplus.im.conversation.E0;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.RecommendUIStyle;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.a;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.o;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.p;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import eu0.C6984c;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/n.class */
public final /* synthetic */ class C6129n implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.recommend.o f90409a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Object next;
        UIComponent iVar;
        PugvSeasonRecommend pugvSeasonRecommend = mVar.f124400a.getPugvSeasonRecommend();
        C7004w c7004wA = C6984c.a(pugvSeasonRecommend.getNav());
        List<PugvSeasonRecommendContent> contentsList = pugvSeasonRecommend.getContentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contentsList, 10));
        for (PugvSeasonRecommendContent pugvSeasonRecommendContent : contentsList) {
            String coverUrl = pugvSeasonRecommendContent.getCoverUrl();
            String title = pugvSeasonRecommendContent.getTitle();
            String subtitle = pugvSeasonRecommendContent.getSubtitle();
            String link = pugvSeasonRecommendContent.getLink();
            String desc = pugvSeasonRecommendContent.getDesc();
            long seasonId = pugvSeasonRecommendContent.getSeasonId();
            String author = pugvSeasonRecommendContent.getAuthor();
            StatInfo view = pugvSeasonRecommendContent.getView();
            com.bilibili.ship.theseus.cheese.biz.intro.primary.a0 a0Var = new com.bilibili.ship.theseus.cheese.biz.intro.primary.a0(view.getValue(), view.getText(), view.getPureText(), view.getIcon());
            BadgeInfo rcmdReason = pugvSeasonRecommendContent.getRcmdReason();
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.recommend.u(coverUrl, title, subtitle, link, desc, seasonId, author, a0Var, new C6302a(rcmdReason.getText(), rcmdReason.getTextColor(), rcmdReason.getTextColorNight(), rcmdReason.getBgColor(), rcmdReason.getBgColorNight(), rcmdReason.getBorderColor(), rcmdReason.getBorderColorNight(), rcmdReason.getBgStyle(), rcmdReason.getImg(), rcmdReason.getType(), 16, 2, 2048)));
        }
        PugvSeasonRecommendMore moreInfo = pugvSeasonRecommend.getMoreInfo();
        com.bilibili.ship.theseus.cheese.biz.intro.recommend.v vVar = new com.bilibili.ship.theseus.cheese.biz.intro.recommend.v(moreInfo.getTitle(), moreInfo.getLink(), moreInfo.getLinkText());
        RecommendUIStyle.a aVar = RecommendUIStyle.Companion;
        int showStyleValue = pugvSeasonRecommend.getShowStyleValue();
        aVar.getClass();
        Iterator it = RecommendUIStyle.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((RecommendUIStyle) next).getValue() == showStyleValue) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        RecommendUIStyle recommendUIStyle = (RecommendUIStyle) next;
        if (recommendUIStyle == null) {
            recommendUIStyle = RecommendUIStyle.PUGV_SEASON_RECOMMEND_SHOW_STYLE_MORE;
        }
        final com.bilibili.ship.theseus.cheese.biz.intro.recommend.t tVar = new com.bilibili.ship.theseus.cheese.biz.intro.recommend.t(c7004wA, arrayList, vVar, recommendUIStyle);
        int size = arrayList.size();
        E0 e02 = com.bilibili.ship.theseus.cheese.biz.report.c.f90463a;
        final com.bilibili.ship.theseus.cheese.biz.intro.recommend.o oVar = this.f90409a;
        if (size == 1) {
            oVar.getClass();
            mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.recommend.p(new p.a(StateFlowKt.MutableStateFlow(new com.bilibili.ship.theseus.cheese.biz.intro.recommend.w(tVar, new ExposureEntry(e02, new com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.U(1, oVar, tVar)), new Function1(oVar, tVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o f89972a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final t f89973b;

                {
                    this.f89972a = oVar;
                    this.f89973b = tVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r5) {
                    /*
                        r4 = this;
                        r0 = r5
                        com.bilibili.ship.theseus.cheese.biz.intro.recommend.s r0 = (com.bilibili.ship.theseus.cheese.biz.intro.recommend.s) r0
                        r7 = r0
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.biz.intro.recommend.s.b
                        r6 = r0
                        r0 = r4
                        com.bilibili.ship.theseus.cheese.biz.intro.recommend.t r0 = r0.f89973b
                        r5 = r0
                        r0 = r4
                        com.bilibili.ship.theseus.cheese.biz.intro.recommend.o r0 = r0.f89972a
                        r8 = r0
                        r0 = r6
                        if (r0 == 0) goto L22
                        r0 = r8
                        r1 = r5
                        r0.a(r1)
                        goto L63
                    L22:
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.biz.intro.recommend.s.a
                        if (r0 == 0) goto L63
                        r0 = r8
                        r1 = r5
                        java.util.List<com.bilibili.ship.theseus.cheese.biz.intro.recommend.u> r1 = r1.f89999b
                        r2 = 0
                        java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r1, r2)
                        com.bilibili.ship.theseus.cheese.biz.intro.recommend.u r1 = (com.bilibili.ship.theseus.cheese.biz.intro.recommend.u) r1
                        r2 = 0
                        r0.b(r1, r2)
                        r0 = r5
                        java.util.List<com.bilibili.ship.theseus.cheese.biz.intro.recommend.u> r0 = r0.f89999b
                        r1 = 0
                        java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
                        com.bilibili.ship.theseus.cheese.biz.intro.recommend.u r0 = (com.bilibili.ship.theseus.cheese.biz.intro.recommend.u) r0
                        r5 = r0
                        r0 = r5
                        if (r0 == 0) goto L55
                        r0 = r5
                        java.lang.String r0 = r0.f90005d
                        r7 = r0
                        r0 = r7
                        r5 = r0
                        r0 = r7
                        if (r0 != 0) goto L58
                    L55:
                        java.lang.String r0 = ""
                        r5 = r0
                    L58:
                        r0 = r8
                        android.content.Context r0 = r0.f89985f
                        r1 = r5
                        java.lang.String r2 = "pugv.detail.pugv-related.0"
                        qV.a.a(r0, r1, r2)
                    L63:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.recommend.l.invoke(java.lang.Object):java.lang.Object");
                }
            })), oVar.f89983d.f100021b)), 0, (Function1) null, 6));
        } else if (arrayList.size() > 1) {
            oVar.getClass();
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new com.bilibili.ship.theseus.cheese.biz.intro.recommend.w(tVar, new ExposureEntry(e02, new androidx.room.coroutines.c(2, oVar, tVar)), new com.bilibili.ship.theseus.cheese.biz.intro.recommend.m(0, oVar, tVar)));
            if (o.a.f89987a[recommendUIStyle.ordinal()] == 1) {
                IntroContentSizeRepository introContentSizeRepository = oVar.f89983d;
                iVar = new com.bilibili.ship.theseus.cheese.biz.intro.recommend.a(new a.d(MutableStateFlow, introContentSizeRepository.f100021b, introContentSizeRepository.f100022c));
            } else {
                iVar = new com.bilibili.ship.theseus.cheese.biz.intro.recommend.i(MutableStateFlow);
            }
            mVar.a(new RunningUIComponent(iVar, 0, (Function1) null, 6));
        }
    }
}
