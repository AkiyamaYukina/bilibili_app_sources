package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.tags.TagsService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import java.util.ArrayList;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService.class */
@StabilityInferred(parameters = 0)
public final class UgcHeadlineService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f97239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<TheseusCommentService.e> f97240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TagsService f97241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RelationRepository f97243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final p f97244g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.online.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f97245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f97246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f97248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.tags.i f97249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PageReportService f97250n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcHeadlineService f97251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6266b f97252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f97253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.BooleanRef f97254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f97255e;

        public a(UgcHeadlineService ugcHeadlineService, C6266b c6266b, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, boolean z6) {
            this.f97251a = ugcHeadlineService;
            this.f97252b = c6266b;
            this.f97253c = booleanRef;
            this.f97254d = booleanRef2;
            this.f97255e = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.ObjectRef<r> f97256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UgcHeadlineService f97257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bilibili.ship.theseus.ugc.intro.ugcheadline.c f97258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableStateFlow<String> f97259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Ref.IntRef f97260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.ObjectRef<i> f97261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Lazy<c> f97262g;
        public final Ref.BooleanRef h;

        public b(Ref.ObjectRef<r> objectRef, UgcHeadlineService ugcHeadlineService, com.bilibili.ship.theseus.ugc.intro.ugcheadline.c cVar, MutableStateFlow<String> mutableStateFlow, Ref.IntRef intRef, Ref.ObjectRef<i> objectRef2, Lazy<c> lazy, Ref.BooleanRef booleanRef) {
            this.f97256a = objectRef;
            this.f97257b = ugcHeadlineService;
            this.f97258c = cVar;
            this.f97259d = mutableStateFlow;
            this.f97260e = intRef;
            this.f97261f = objectRef2;
            this.f97262g = lazy;
            this.h = booleanRef;
        }

        public final long a() {
            return this.f97257b.f97242e.a();
        }

        public final String b() {
            return (String) this.f97257b.f97242e.f104040e.getValue();
        }

        public final void c(String str, boolean z6) {
            try {
                ((ClipboardManager) this.f97257b.f97239b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            if (z6) {
                com.bilibili.ship.theseus.united.utils.q.b(2131846878);
            } else {
                com.bilibili.ship.theseus.united.utils.q.b(2131845446);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String d() {
            /*
                r2 = this;
                r0 = r2
                com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService r0 = r0.f97257b
                com.bilibili.ship.theseus.united.page.view.RelationRepository r0 = r0.f97243f
                kotlinx.coroutines.flow.StateFlow<com.bilibili.ship.theseus.united.page.view.StatData> r0 = r0.f104004m
                java.lang.Object r0 = r0.getValue()
                com.bilibili.ship.theseus.united.page.view.StatData r0 = (com.bilibili.ship.theseus.united.page.view.StatData) r0
                r3 = r0
                r0 = r3
                if (r0 == 0) goto L2b
                r0 = r3
                com.bilibili.ship.theseus.united.page.view.StatInfoData r0 = r0.f104020b
                r3 = r0
                r0 = r3
                if (r0 == 0) goto L2b
                r0 = r3
                java.lang.String r0 = r0.f104028b
                r4 = r0
                r0 = r4
                r3 = r0
                r0 = r4
                if (r0 != 0) goto L2e
            L2b:
                java.lang.String r0 = ""
                r3 = r0
            L2e:
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService.b.d():java.lang.String");
        }

        public final void e(String str) {
            Context context = this.f97257b.f97239b;
            Uri uriBuild = Uri.parse("bilibili://video/").buildUpon().path(str).build();
            if (uriBuild != null) {
                sh1.j.a(context, uriBuild.toString());
            }
        }

        public final void f(String str) {
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
        }

        public final boolean g() {
            return this.f97257b.h.b();
        }

        public final void h(int i7, String str, boolean z6) {
            UgcHeadlineService ugcHeadlineService = this.f97257b;
            if (z6) {
                com.bilibili.ship.theseus.ugc.intro.ugcheadline.c cVar = this.f97258c;
                if (!cVar.f97305a.isEmpty()) {
                    if (((Boolean) ugcHeadlineService.f97244g.f97374d.getValue()).booleanValue()) {
                        for (g gVar : (ArrayList) cVar.f97305a) {
                            if (!gVar.f97330e) {
                                gVar.f97330e = true;
                                HashMap mapC = O4.b.c("tag_id", String.valueOf(gVar.f97326a));
                                Unit unit = Unit.INSTANCE;
                                PageReportService.i(ugcHeadlineService.f97250n, "united.player-video-detail.video-information.tag.show", mapC, 4);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            PageReportService pageReportService = ugcHeadlineService.f97250n;
            HashMap map = new HashMap();
            map.put("action_type", i7 == 2 ? "click" : "press");
            map.put("tag_id", str);
            Unit unit2 = Unit.INSTANCE;
            PageReportService.g(pageReportService, "united.player-video-detail.video-information.tag.click", map, 4);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.ObjectRef<r> f97263a;

        public c(Ref.ObjectRef<r> objectRef) {
            this.f97263a = objectRef;
        }
    }

    @Inject
    public UgcHeadlineService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull Flow<TheseusCommentService.e> flow, @NotNull TagsService tagsService, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull RelationRepository relationRepository, @NotNull p pVar, @NotNull com.bilibili.ship.theseus.united.page.online.a aVar2, @NotNull ActivityColorRepository activityColorRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar3, @NotNull com.bilibili.ship.theseus.united.page.intro.module.tags.i iVar, @NotNull PageReportService pageReportService) {
        this.f97238a = coroutineScope;
        this.f97239b = context;
        this.f97240c = flow;
        this.f97241d = tagsService;
        this.f97242e = aVar;
        this.f97243f = relationRepository;
        this.f97244g = pVar;
        this.h = aVar2;
        this.f97245i = activityColorRepository;
        this.f97246j = cVar;
        this.f97247k = introContentSizeRepository;
        this.f97248l = aVar3;
        this.f97249m = iVar;
        this.f97250n = pageReportService;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull C6266b c6266b) {
        Boolean bool = Boolean.FALSE;
        p pVar = this.f97244g;
        pVar.f97373c.setValue(bool);
        pVar.f97375e.setValue(bool);
        pVar.f97377g.setValue(bool);
        pVar.f97378i.setValue(c6266b);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        boolean z6 = this.f97246j.h().f102987a;
        Flow flowCombine = FlowKt.combine(pVar.f97374d, pVar.f97376f, pVar.h, new UgcHeadlineService$createHeadline$headlineFlow$1(null));
        com.bilibili.ship.theseus.united.page.screensize.a aVar = this.f97248l;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(aVar.f() ? 375 : aVar.b().getMinWidthDp()));
        return new RunningUIComponent(new m(c6266b, flowCombine, MutableStateFlow, this.f97247k.f100020a, new a(this, c6266b, booleanRef2, booleanRef, !z6)), 0, new UgcHeadlineService$createHeadline$1(this, MutableStateFlow, null), 2);
    }

    @NotNull
    public final RunningUIComponent b(@NotNull com.bilibili.ship.theseus.ugc.intro.ugcheadline.c cVar) {
        Boolean bool = Boolean.FALSE;
        p pVar = this.f97244g;
        pVar.f97373c.setValue(bool);
        pVar.f97375e.setValue(bool);
        pVar.f97377g.setValue(bool);
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(this.h.c().f102114b);
        return new RunningUIComponent(new UgcIntroductionComponent(new b(objectRef, this, cVar, MutableStateFlow, intRef, objectRef2, LazyKt.lazy(new com.bilibili.ad.adview.videodetail.panel.mall.m(objectRef, 1)), booleanRef), this.f97247k.f100020a), 0, new UgcHeadlineService$createIntroduction$1(this, intRef, objectRef, MutableStateFlow, null), 2);
    }
}
