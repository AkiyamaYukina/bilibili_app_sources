package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.restrictionlayer.P;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f100699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f100700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f100701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f100702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f100703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Provider f100704g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.report.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f100705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f100706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f100707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PromptBarVo> f100708l = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f100709m = StateFlowKt.MutableStateFlow(Boolean.TRUE);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FrameLayout f100710a;

        public a(@NotNull FrameLayout frameLayout) {
            this.f100710a = frameLayout;
        }
    }

    @Inject
    public c(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull PageReportService pageReportService, @NotNull Provider provider, @NotNull com.bilibili.ship.theseus.united.page.report.d dVar2, @NotNull Flow flow, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull ChargeRepository chargeRepository, @NotNull PageAdRepository pageAdRepository) {
        this.f100698a = coroutineScope;
        this.f100699b = context;
        this.f100700c = dVar;
        this.f100701d = c8043a;
        this.f100702e = aVar;
        this.f100703f = pageReportService;
        this.f100704g = provider;
        this.h = dVar2;
        this.f100705i = hVar;
        this.f100706j = chargeRepository;
        this.f100707k = pageAdRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new IntroPromptBarService$1(flow, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new IntroPromptBarService$2(flow, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new IntroPromptBarService$3(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.intro.module.promptbar.c r11, android.view.ViewGroup r12, com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.promptbar.c.a(com.bilibili.ship.theseus.united.page.intro.module.promptbar.c, android.view.ViewGroup, com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(@NotNull TextVo textVo) {
        com.bilibili.ship.theseus.united.page.restrictionlayer.s rVar;
        com.bilibili.ship.theseus.united.page.restrictionlayer.s sVar = textVo.f102713j;
        if (sVar == null) {
            return;
        }
        if (sVar instanceof P) {
            rVar = P.a((P) sVar, null, "preview", false, 23);
        } else {
            rVar = sVar;
            if (sVar instanceof com.bilibili.ship.theseus.united.page.restrictionlayer.r) {
                rVar = new com.bilibili.ship.theseus.united.page.restrictionlayer.r(true);
            }
        }
        ((InterfaceC6388m) this.f100704g.get()).a(rVar);
    }

    public final void c(@NotNull TextVo textVo) {
        if (textVo.l() == null || textVo.l().b().length() <= 0) {
            return;
        }
        String strB = textVo.l().b();
        Map<String, String> mapC = textVo.l().c();
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(mapC);
        com.bilibili.ship.theseus.keel.player.h hVar = this.f100705i;
        mapCreateMapBuilder.put("view_type", hVar.f91107a.k() == PlayerAvailability.FORBIDDEN ? "2" : "1");
        C8043a c8043a = this.f100701d;
        mapCreateMapBuilder.put("track_id", c8043a.a().f123882d);
        mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
        mapCreateMapBuilder.put("up_mid", String.valueOf(this.f100700c.f()));
        mapCreateMapBuilder.put(GameCardButton.extraAvid, this.f100702e.b());
        com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
        mapCreateMapBuilder.put("player_progress", String.valueOf(jVarJ != null ? Duration.getInWholeSeconds-impl(jVarJ.F()) : 0L));
        String str = this.f100707k.f98946j;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        mapCreateMapBuilder.put("ad_track_id", str2);
        PageReportService.g(this.f100703f, strB, MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void d(String str, Map<String, String> map) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(map);
        mapCreateMapBuilder.put("view_type", this.f100705i.f91107a.k() == PlayerAvailability.FORBIDDEN ? "2" : "1");
        C8043a c8043a = this.f100701d;
        mapCreateMapBuilder.put("track_id", c8043a.a().f123882d);
        mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
        mapCreateMapBuilder.put("up_mid", String.valueOf(this.f100700c.f()));
        mapCreateMapBuilder.put(GameCardButton.extraAvid, this.f100702e.b());
        String str2 = this.f100707k.f98946j;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        mapCreateMapBuilder.put("ad_track_id", str3);
        PageReportService.i(this.f100703f, str, MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final GradientDrawable e(float[] fArr, int i7, int i8) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i7, i8});
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(Uj0.c.a(f7, this.f100699b)));
        }
        gradientDrawable.setCornerRadii(CollectionsKt.toFloatArray(arrayList));
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }
}
