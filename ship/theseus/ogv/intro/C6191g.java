package com.bilibili.ship.theseus.ogv.intro;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.app.comment3.ui.nextholderexp3.handle.CommentNextExperiment3ContentRichTextHandler;
import com.bilibili.app.comment3.ui.widget.CommentPictureListWidget;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.filmlist.Film;
import com.bilibili.ship.theseus.ogv.intro.filmlist.OgvFilms;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/g.class */
public final /* synthetic */ class C6191g implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eu0.A f93085a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        final OgvFilms ogvFilms = (OgvFilms) JsonUtilKt.parseJson(Pj0.e.a(mVar.f124400a.getPlayList()), new C6203t().getType());
        final Eu0.A a7 = this.f93085a;
        a7.getClass();
        Eu0.o oVar = new Eu0.o(0, a7, ogvFilms);
        com.bilibili.bplus.followinglist.opus.manager.y yVar = com.bilibili.ship.theseus.united.report.a.f104837a;
        final ExposureEntry exposureEntry = new ExposureEntry(yVar, oVar);
        final ExposureEntry exposureEntry2 = new ExposureEntry(yVar, new Eu0.p(0, a7, ogvFilms));
        final ExposureEntry exposureEntry3 = new ExposureEntry(yVar, new Eu0.q(0, a7, ogvFilms));
        List<Film> listB = ogvFilms.b();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
        for (final Film film : listB) {
            final int i7 = 0;
            arrayList.add(new ExposureEntry(yVar, new Function0(i7, a7, film) { // from class: Eu0.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f4757a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f4758b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f4759c;

                {
                    this.f4757a = i7;
                    this.f4758b = a7;
                    this.f4759c = film;
                }

                public final Object invoke() {
                    switch (this.f4757a) {
                        case 0:
                            PageReportService.i(((A) this.f4758b).f4714d, "united.player-video-detail.playlist.card.show", ((Film) this.f4759c).f92668g, 4);
                            break;
                        default:
                            CommentPictureListWidget commentPictureListWidget = (CommentPictureListWidget) this.f4758b;
                            commentPictureListWidget.performHapticFeedback(0);
                            bk.g gVar = ((CommentNextExperiment3ContentRichTextHandler) this.f4759c).c;
                            if (gVar != null) {
                                gVar.invoke(commentPictureListWidget.getContext(), (Object) null);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        mVar.a(new RunningUIComponent(new Eu0.e(ComposableLambdaKt.composableLambdaInstance(-1821007443, true, new Function2(a7, exposureEntry, ogvFilms, exposureEntry2, arrayList, exposureEntry3) { // from class: Eu0.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final A f4760a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ExposureEntry f4761b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final OgvFilms f4762c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ExposureEntry f4763d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final List f4764e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final ExposureEntry f4765f;

            {
                this.f4760a = a7;
                this.f4761b = exposureEntry;
                this.f4762c = ogvFilms;
                this.f4763d = exposureEntry2;
                this.f4764e = arrayList;
                this.f4765f = exposureEntry3;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0184  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x02f9  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x03b0  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16) {
                /*
                    Method dump skipped, instruction units count: 1044
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: Eu0.s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        })), 0, (Function1) null, 6));
    }
}
