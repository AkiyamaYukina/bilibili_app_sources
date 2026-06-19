package com.bilibili.ship.theseus.united.page.intro.module.tags;

import G.p;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.weblayer.C6452a;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsService.class */
@StabilityInferred(parameters = 0)
public final class TagsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f101914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f101916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f101917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C6452a f101918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f101919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final i f101920g;

    @NotNull
    public final IntroContentSizeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f101922j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f101923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f101924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f101925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f101926d;

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z6) {
            this.f101923a = z6;
            this.f101924b = str;
            this.f101925c = str2;
            this.f101926d = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f101923a == aVar.f101923a && Intrinsics.areEqual(this.f101924b, aVar.f101924b) && Intrinsics.areEqual(this.f101925c, aVar.f101925c) && Intrinsics.areEqual(this.f101926d, aVar.f101926d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f101923a);
            int iHashCode2 = 0;
            String str = this.f101924b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f101925c;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f101926d;
            if (str3 != null) {
                iHashCode2 = str3.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PartyInfo(isParty=");
            sb.append(this.f101923a);
            sb.append(", textColor=");
            sb.append(this.f101924b);
            sb.append(", selectBgColor=");
            sb.append(this.f101925c);
            sb.append(", dividerColor=");
            return C8770a.a(sb, this.f101926d, ")");
        }
    }

    @Inject
    public TagsService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageReportService pageReportService, @NotNull C6452a c6452a, @NotNull WebFloatLayerService webFloatLayerService, @NotNull i iVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f101914a = context;
        this.f101915b = coroutineScope;
        this.f101916c = activityColorRepository;
        this.f101917d = pageReportService;
        this.f101918e = c6452a;
        this.f101919f = webFloatLayerService;
        this.f101920g = iVar;
        this.h = introContentSizeRepository;
        this.f101921i = aVar;
    }

    public final void a(@NotNull com.bilibili.ship.theseus.united.page.intro.module.tags.a aVar) {
        if (System.currentTimeMillis() - this.f101922j < 500) {
            return;
        }
        this.f101922j = System.currentTimeMillis();
        boolean zAreEqual = Intrinsics.areEqual(aVar.f101936g, CellType.BGM.getType());
        String str = aVar.f101935f;
        if (zAreEqual) {
            this.f101918e.f104244a.tryEmit(p.a(str, "&position_id=3"));
        } else {
            String type = JumpType.FLUID.getType();
            String str2 = aVar.f101940l;
            if (Intrinsics.areEqual(str2, type)) {
                BuildersKt.launch$default(this.f101915b, (CoroutineContext) null, (CoroutineStart) null, new TagsService$cellClick$1(this, aVar, null), 3, (Object) null);
            } else if (Intrinsics.areEqual(str2, JumpType.NEW_PAGE.getType())) {
                BLRouter.routeTo(RouteRequestKt.toRouteRequest(str), this.f101914a);
            }
        }
        HashMap map = new HashMap();
        map.put("tag_id", aVar.f101938j);
        map.put("tag_type", aVar.f101936g);
        map.put("url", str);
        for (Map.Entry<String, String> entry : aVar.f101944p.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                map.put(key, value);
            }
        }
        PageReportService.g(this.f101917d, "united.player-video-detail.middle-tag.0.click", map, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.Nullable java.util.List<com.bilibili.ship.theseus.united.page.intro.module.tags.a> r8) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsService.b(java.util.List):void");
    }

    @Nullable
    public final RunningUIComponent c() {
        g gVar;
        i iVar = this.f101920g;
        if (iVar.f101977d || (gVar = (g) iVar.f101975b.getValue()) == null) {
            return null;
        }
        if (gVar.f101972a.isEmpty() && !gVar.f101973b) {
            return null;
        }
        com.bilibili.ship.theseus.united.page.screensize.a aVar = this.f101921i;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(aVar.f() ? 375 : aVar.b().getMinWidthDp()));
        ActivityColorRepository activityColorRepository = this.f101916c;
        boolean z6 = activityColorRepository.f99182c;
        ActivityColorRepository.a aVarG = activityColorRepository.g();
        String str = aVarG != null ? aVarG.f99195b : null;
        ActivityColorRepository.a aVar2 = (ActivityColorRepository.a) activityColorRepository.f99185f.getValue();
        String str2 = aVar2 != null ? aVar2.f99195b : null;
        ActivityColorRepository.a aVar3 = (ActivityColorRepository.a) activityColorRepository.f99192n.getValue();
        return new RunningUIComponent(new f(iVar.f101976c, new a(str, str2, aVar3 != null ? aVar3.f99195b : null, z6), MutableStateFlow, this.h.f100020a, new com.bilibili.biligame.cloudgame.v2.ui.welfare.e(this, 1), new MD.a(this, 3)), 0, new TagsService$create$1(this, MutableStateFlow, null), 2);
    }
}
