package com.bilibili.ship.theseus.ogv.playercontainer;

import Mu0.A;
import Mu0.y;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.player.feature.snapshot.PosterStyle;
import com.bilibili.app.gemini.player.widget.like.z;
import com.bilibili.app.gemini.share.SharePosition;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate;
import com.google.gson.JsonObject;
import d3.C6781b;
import javax.inject.Inject;
import kntr.app.mall.product.details.page.vm.PageViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.Material;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class OgvActionDelegate implements yk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f94258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f94260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f94263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final i f94264g;

    @NotNull
    public final CoroutineScope h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final UnitedGeminiPlayerCommonActionDelegate f94265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final y f94266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f94267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f94268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final k f94269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableState f94270n = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Inject
    public OgvActionDelegate(@NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull OgvSeason ogvSeason, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IPlayDirector iPlayDirector, @NotNull i iVar, @NotNull CoroutineScope coroutineScope, @NotNull UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, @NotNull y yVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull StateFlow<Boolean> stateFlow, @NotNull k kVar) {
        this.f94258a = absFunctionWidgetService;
        this.f94259b = ogvSeason;
        this.f94260c = aVar;
        this.f94261d = ogvCurrentEpisodeRepository;
        this.f94262e = iPlayerSettingService;
        this.f94263f = iPlayDirector;
        this.f94264g = iVar;
        this.h = coroutineScope;
        this.f94265i = unitedGeminiPlayerCommonActionDelegate;
        this.f94266j = yVar;
        this.f94267k = hVar;
        this.f94268l = stateFlow;
        this.f94269m = kVar;
    }

    public final boolean A() {
        this.f94265i.getClass();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final com.bilibili.app.gemini.share.i B(@NotNull SharePosition sharePosition) throws NoWhenBranchMatchedException {
        String str;
        y yVar = this.f94266j;
        yVar.getClass();
        JsonObject jsonObject = new JsonObject();
        OgvSeason ogvSeason = yVar.f16437b;
        jsonObject.addProperty("season_type", String.valueOf(ogvSeason.f94450b.f71782a));
        jsonObject.addProperty("season_id", String.valueOf(ogvSeason.f94449a));
        OgvEpisode ogvEpisodeC = yVar.f16439d.c();
        if (ogvEpisodeC != null) {
            jsonObject.addProperty("epid", String.valueOf(ogvEpisodeC.f93555a));
        }
        JsonObject jsonObject2 = new JsonObject();
        switch (y.a.f16440a[sharePosition.ordinal()]) {
            case 1:
                str = "ogv_video_detail_player_vertical_full_normal_share";
                break;
            case 2:
                str = "ogv_video_detail_player_landscape_full_normal_share";
                break;
            case 3:
                str = "ogv_video_detail_player_half_end_page_normal_share";
                break;
            case 4:
            case 5:
            case 6:
                str = "";
                break;
            case 7:
                str = "ogv_video_detail_player_landscape_full_end_page_normal_share";
                break;
            case 8:
                str = "ogv_video_detail_player_vertical_full_end_page_normal_share";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        jsonObject2.addProperty(BiliExtraBuilder.SHARE_FROM, str);
        return new com.bilibili.app.gemini.share.i(92, (Integer) null, jsonObject2.toString(), "united.player-video-detail.0.0", (String) null, (String) null, (String) null, jsonObject.toString());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Mu0.c] */
    @NotNull
    public final kntr.common.share.domain.model.e C(@NotNull String str) {
        final y yVar = this.f94266j;
        final OgvEpisode ogvEpisodeC = yVar.f16439d.c();
        final kntr.common.share.domain.model.a aVar = new kntr.common.share.domain.model.a((String) null, (String) null, 7);
        final OgvSeason ogvSeason = yVar.f16437b;
        ?? r02 = new Function1(ogvSeason, yVar, ogvEpisodeC, aVar) { // from class: Mu0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvSeason f16369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final y f16370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final OgvEpisode f16371c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final kntr.common.share.domain.model.a f16372d;

            {
                this.f16369a = ogvSeason;
                this.f16370b = yVar;
                this.f16371c = ogvEpisodeC;
                this.f16372d = aVar;
            }

            public final Object invoke(Object obj) {
                kntr.common.share.domain.model.f fVar = (kntr.common.share.domain.model.f) obj;
                kntr.common.share.common.handler.dynamic.f fVar2 = kntr.common.share.common.handler.dynamic.f.b;
                final OgvSeason ogvSeason2 = this.f16369a;
                final y yVar2 = this.f16370b;
                final OgvEpisode ogvEpisode = this.f16371c;
                fVar.a(fVar2, new Function0(yVar2, ogvEpisode, ogvSeason2) { // from class: Mu0.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OgvSeason f16418a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final y f16419b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final OgvEpisode f16420c;

                    {
                        this.f16418a = ogvSeason2;
                        this.f16419b = yVar2;
                        this.f16420c = ogvEpisode;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instruction units count: 611
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Mu0.q.invoke():java.lang.Object");
                    }
                });
                fVar.a(kntr.common.share.common.handler.im.panel.c.b, new Function0(yVar2, ogvEpisode, ogvSeason2) { // from class: Mu0.u

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final y f16427a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final OgvSeason f16428b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final OgvEpisode f16429c;

                    {
                        this.f16427a = yVar2;
                        this.f16428b = ogvSeason2;
                        this.f16429c = ogvEpisode;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0039 A[PHI: r17
  0x0039: PHI (r17v7 java.lang.String) = (r17v1 java.lang.String), (r17v8 java.lang.String) binds: [B:9:0x004b, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instruction units count: 263
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Mu0.u.invoke():java.lang.Object");
                    }
                });
                kntr.common.share.common.handler.web.bihuo.b bVar = kntr.common.share.common.handler.web.bihuo.b.b;
                final kntr.common.share.domain.model.a aVar2 = this.f16372d;
                fVar.a(bVar, new v(aVar2, 0));
                final int i7 = 0;
                fVar.a(y71.f.b, new Function0(aVar2, i7) { // from class: Mu0.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f16432a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f16433b;

                    {
                        this.f16432a = i7;
                        this.f16433b = aVar2;
                    }

                    public final Object invoke() {
                        switch (this.f16432a) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                View view = (View) ((com.mall.ui.page.home.adapter.holder.p) this.f16433b).o.getValue();
                                break;
                            case 3:
                                break;
                            case 4:
                                ((PageViewModel) this.f16433b).o1(false);
                                break;
                            default:
                                ((Function0) this.f16433b).invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                fVar.a(kntr.common.share.common.handler.wx.j.b, new x(aVar2, 0));
                fVar.a(kntr.common.share.common.handler.wx.c.b, new CF.c(aVar2, 1));
                fVar.a(kntr.common.share.common.handler.qq.i.b, new CF.d(aVar2, 1));
                fVar.a(kntr.common.share.common.handler.qq.k.b, new CF.e(aVar2, 1));
                fVar.a(kntr.common.share.common.handler.sina.g.b, new CF.g(aVar2, 1));
                fVar.a(kntr.common.share.common.handler.copy.e.b, new CF.h(aVar2, 1));
                fVar.a(kntr.common.share.common.handler.facebook.e.b, new r(aVar2, 0));
                fVar.a(kntr.common.share.common.handler.whatsapp.f.b, new s(aVar2, 0));
                fVar.a(kntr.common.share.common.handler.x.f.b, new t(aVar2, 0));
                return Unit.INSTANCE;
            }
        };
        kntr.common.share.domain.model.g gVar = new kntr.common.share.domain.model.g();
        r02.invoke(gVar);
        return new kntr.common.share.domain.model.e(gVar.a);
    }

    public final boolean D() {
        this.f94265i.getClass();
        return false;
    }

    @Nullable
    public final StateFlow<Long> E() {
        return this.f94265i.E();
    }

    @Nullable
    public final Function3<Modifier, Composer, Integer, Unit> F() {
        return (Function3) this.f94270n.getValue();
    }

    @Nullable
    public final StateFlow<Boolean> H() {
        return this.f94265i.f104707c.f103998f;
    }

    @Nullable
    public final StateFlow<Long> I() {
        return this.f94265i.I();
    }

    @Nullable
    public final Deferred<Boolean> J() {
        return this.f94265i.f104708d.f100330g;
    }

    public final boolean K() {
        return this.f94265i.f104713j.b();
    }

    public final void L() {
        this.f94265i.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Type inference failed for: r0v42, types: [Mu0.i] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kntr.common.share.domain.model.e M(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<android.graphics.Bitmap> r13, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<java.lang.String> r14) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate.M(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):kntr.common.share.domain.model.e");
    }

    @NotNull
    public final String N() {
        this.f94265i.getClass();
        return "";
    }

    @Nullable
    public final StateFlow<Long> O() {
        return this.f94265i.O();
    }

    @NotNull
    public final String P() {
        OgvEpisode ogvEpisodeC = this.f94261d.c();
        String strValueOf = ogvEpisodeC != null ? String.valueOf(ogvEpisodeC.f93561g) : null;
        String str = strValueOf;
        if (strValueOf == null) {
            str = "";
        }
        return str;
    }

    public final boolean Q() {
        return this.f94265i.Q();
    }

    public final boolean R() {
        this.f94265i.getClass();
        return false;
    }

    @NotNull
    public final StateFlow<com.bilibili.app.gemini.player.widget.selector.f> S() {
        final OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = this.f94261d.f92119v;
        return FlowKt.stateIn(new Flow<com.bilibili.app.gemini.player.widget.selector.f>(ogvCurrentEpisodeRepository$special$$inlined$map$1, this) { // from class: com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f94271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvActionDelegate f94272b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f94273a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final OgvActionDelegate f94274b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, OgvActionDelegate ogvActionDelegate) {
                    this.f94273a = flowCollector;
                    this.f94274b = ogvActionDelegate;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) throws kotlin.NoWhenBranchMatchedException {
                    /*
                        Method dump skipped, instruction units count: 965
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f94271a = ogvCurrentEpisodeRepository$special$$inlined$map$1;
                this.f94272b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f94271a.collect(new AnonymousClass2(flowCollector, this.f94272b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, this.h, SharingStarted.Companion.getEagerly(), (Object) null);
    }

    public final void T() {
        this.f94265i.getClass();
    }

    @NotNull
    public final PosterStyle U() {
        return PosterStyle.STYLE_WITH_SUBTITLE;
    }

    public final void V(@NotNull com.bilibili.app.gemini.player.widget.selector.g gVar, int i7) {
        i iVar = this.f94264g;
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = iVar.f94322b;
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        OgvEpisode ogvEpisode = (OgvEpisode) CollectionsKt.getOrNull(ogvCurrentEpisodeRepository.e(), i7);
        if (ogvEpisode == null) {
            return;
        }
        if (ogvEpisodeC == null || ogvEpisodeC.f93555a != ogvEpisode.f93555a) {
            OgvCurrentEpisodeRepository.h(iVar.f94322b, ogvEpisode, null, null, null, 0, 14);
        }
    }

    @NotNull
    public final String W() {
        JsonObject jsonObject = new JsonObject();
        OgvEpisode ogvEpisodeC = this.f94261d.c();
        jsonObject.addProperty("epid", ogvEpisodeC != null ? String.valueOf(ogvEpisodeC.f93555a) : null);
        jsonObject.addProperty("season_id", String.valueOf(this.f94259b.f94449a));
        return JsonUtilKt.toJson(jsonObject);
    }

    @Nullable
    public final StateFlow<Boolean> X() {
        return this.f94265i.f104707c.f103999g;
    }

    @Nullable
    public final String Y() {
        return this.f94265i.Y();
    }

    public final void Z() {
        this.f94265i.getClass();
    }

    @Nullable
    public final z a() {
        return this.f94265i.a();
    }

    public final boolean a0() {
        return this.f94265i.a0();
    }

    @Nullable
    public final Drawable b() {
        return this.f94265i.b();
    }

    @NotNull
    public final String b0() {
        OgvEpisode ogvEpisodeC = this.f94261d.c();
        if (ogvEpisodeC != null) {
            String str = ogvEpisodeC.f93567n;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        String str2 = this.f94259b.f94464q;
        if (str2 == null) {
            return "";
        }
        String str3 = null;
        if (!StringsKt.isBlank(str2)) {
            str3 = str2;
        }
        return str3 != null ? str3 : "";
    }

    public final boolean c() {
        this.f94265i.getClass();
        return true;
    }

    @NotNull
    public final String c0() {
        this.f94265i.getClass();
        return "";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String d(@NotNull SharePosition sharePosition) throws NoWhenBranchMatchedException {
        String str;
        this.f94266j.getClass();
        switch (y.a.f16440a[sharePosition.ordinal()]) {
            case 1:
            case 8:
                str = "new_ogv_vertical";
                break;
            case 2:
            case 3:
            case 7:
                str = "new_ogv";
                break;
            case 4:
                str = "new_ogv6";
                break;
            case 5:
                str = "new_ogv4";
                break;
            case 6:
                str = "new_ogv3";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final void d0() {
        this.f94265i.getClass();
    }

    @Nullable
    public final StateFlow<PlayNetworkEnv> e() {
        return this.f94265i.e();
    }

    public final boolean e0() {
        return true;
    }

    @Nullable
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        return this.f94265i.f();
    }

    @Nullable
    public final StateFlow<Boolean> f0() {
        return this.f94265i.f104707c.f104002k;
    }

    public final void g() {
        int i7 = this.f94262e.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f94261d;
        if (i7 != 4 || ogvCurrentEpisodeRepository.g()) {
            OgvCurrentEpisodeRepository.o(ogvCurrentEpisodeRepository, 0);
        } else {
            OgvCurrentEpisodeRepository.m(ogvCurrentEpisodeRepository, 0);
        }
    }

    @Nullable
    public final StateFlow<Long> g0() {
        return this.f94265i.g0();
    }

    @NotNull
    public final String getArcTitle() {
        return this.f94259b.f94453e;
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        return this.f94265i.getCoinStyle();
    }

    @Nullable
    public final Drawable getLikeIcon() {
        return this.f94265i.getLikeIcon();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f94265i.f104708d.a();
    }

    public final int getTemplateId() {
        this.f94265i.getClass();
        return 0;
    }

    public final long getTypeId() {
        this.f94265i.getClass();
        return 0L;
    }

    public final void h() {
        int i7 = this.f94262e.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f94261d;
        if (i7 != 4 || ogvCurrentEpisodeRepository.f()) {
            OgvCurrentEpisodeRepository.n(ogvCurrentEpisodeRepository, 0);
        } else {
            OgvCurrentEpisodeRepository.l(ogvCurrentEpisodeRepository, 0);
        }
    }

    @NotNull
    public final ShareContentProvider h0(@NotNull String str) {
        y yVar = this.f94266j;
        return new Mu0.z(yVar, yVar.f16439d.c(), yVar.f16437b);
    }

    @Nullable
    public final StateFlow<Boolean> i() {
        return this.f94265i.i();
    }

    public final boolean i0() {
        this.f94265i.getClass();
        return false;
    }

    @Nullable
    public final Pair<Class<? extends AbsFunctionWidget>, AbsFunctionWidget.Configuration> j(@NotNull String str) {
        this.f94265i.getClass();
        return null;
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f94265i.f104705a;
    }

    @NotNull
    public final ShareContentProvider k(@NotNull String str, @NotNull Function0<String> function0) {
        y yVar = this.f94266j;
        return new A(yVar, yVar.f16437b, yVar.f16439d.c(), function0, str);
    }

    public final void k0(@NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
        layoutParams.setFunctionType(0);
        layoutParams.setEnterAnim(-1);
        layoutParams.setExitAnim(-1);
        layoutParams.setLayoutType(11);
        layoutParams.touchOutsideDismiss(false);
        BuildersKt.launch$default(this.h, (CoroutineContext) null, (CoroutineStart) null, new OgvActionDelegate$handleOperationWidgetBizEvent$1(this, this.f94269m.a(material, function1), layoutParams, null), 3, (Object) null);
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.f94265i.l(str, str2, str3);
    }

    public final boolean l0() {
        this.f94265i.getClass();
        return false;
    }

    @Nullable
    public final String m() {
        this.f94265i.getClass();
        return "";
    }

    @NotNull
    public final String m0() {
        y yVar = this.f94266j;
        OgvSeason ogvSeason = yVar.f16437b;
        String str = ogvSeason.f94456i.a().f93587d;
        String str2 = ogvSeason.f94456i.f94495a;
        com.bilibili.ogv.pub.season.a aVarC = ogvSeason.c();
        return C6781b.a(str, "·", str2, com.bilibili.ogv.pub.season.b.a(aVarC) ? yVar.f16436a.getString(2131854853) : Intrinsics.areEqual(aVarC, com.bilibili.ogv.pub.season.a.h) ? yVar.f16436a.getString(2131857028) : yVar.f16436a.getString(2131846020));
    }

    @Nullable
    public final MutableSharedFlow<yk.e> n() {
        return this.f94265i.f104721r;
    }

    @Nullable
    public final Integer n0(@Nullable String str) {
        this.f94265i.getClass();
        return null;
    }

    public final boolean o() {
        this.f94265i.getClass();
        return false;
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        return this.f94265i.o0();
    }

    @NotNull
    public final String p() {
        return this.f94260c.b();
    }

    public final boolean p0() {
        return !((Boolean) this.f94268l.getValue()).booleanValue();
    }

    public final int q() {
        return this.f94265i.q();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String q0(@NotNull SharePosition sharePosition) throws NoWhenBranchMatchedException {
        this.f94266j.getClass();
        int i7 = y.a.f16440a[sharePosition.ordinal()];
        String str = "pgc.pgc-video-detail.player-endpage.share.click";
        switch (i7) {
            case 1:
            case 2:
                str = "player.player.share.0.player";
                break;
            case 3:
                str = "pgc.pgc-video-detail.player-half-endpage.share.click";
                break;
            case 4:
            case 5:
            case 6:
                str = "player.player.shots.0.player";
                break;
            case 7:
            case 8:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final boolean r() {
        this.f94265i.getClass();
        return false;
    }

    @Nullable
    public final Integer s() {
        return this.f94265i.s();
    }

    public final boolean t() {
        this.f94265i.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f94267k
            com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L22
            r0 = r3
            com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = r0.f()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L22
            r0 = r3
            java.lang.String r0 = r0.getTitle()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L25
        L22:
            java.lang.String r0 = ""
            r3 = r0
        L25:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate.u():java.lang.String");
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        this.f94265i.v(str, pageType);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        return this.f94265i.w(view);
    }

    @Nullable
    public final StateFlow<wk.a> x() {
        return this.f94265i.f104722s;
    }

    @Nullable
    public final String y() {
        GeminiCommonPlayableParams currentPlayableParams = this.f94263f.getCurrentPlayableParams();
        String title = null;
        GeminiCommonPlayableParams geminiCommonPlayableParams = currentPlayableParams instanceof GeminiCommonPlayableParams ? currentPlayableParams : null;
        if (geminiCommonPlayableParams != null) {
            title = geminiCommonPlayableParams.getTitle();
        }
        return title;
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        this.f94265i.z(str, pageType);
        return true;
    }
}
