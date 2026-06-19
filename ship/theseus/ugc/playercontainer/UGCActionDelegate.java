package com.bilibili.ship.theseus.ugc.playercontainer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.player.feature.snapshot.PosterStyle;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.app.gemini.player.feature.zoom.h;
import com.bilibili.app.gemini.player.widget.like.z;
import com.bilibili.app.gemini.share.SharePosition;
import com.bilibili.app.gemini.ugc.feature.D;
import com.bilibili.droid.BVCompat;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.C6266b;
import com.bilibili.ship.theseus.ugc.page.UGCScreenImmersionService;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.playingarea.PlayerHiddenScrollingViewBehavior;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.story.StoryEntranceService;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.StatData;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.C8509b;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.Material;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.MaterialBizType;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class UGCActionDelegate implements yk.c {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f98224J = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final StoryTransitionAnimService f98225A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final C8043a f98226B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f98227C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f98228D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f98229E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.interactvideo.e f98230F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f98231G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final FragmentManager f98232H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f98233I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.w f98236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f98237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f98239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f98240g;

    @NotNull
    public final List<C6353o> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Context f98241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.ugcheadline.p f98242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final E f98244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final UGCScreenImmersionService f98245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final RelationRepository f98247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ViewReply f98248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final a f98249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final UnitedGeminiPlayerCommonActionDelegate f98251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.play.schedule.k f98253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f98254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.t f98255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final StoryEntranceService f98256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final StoryEntranceService.a f98257y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final PageReportService f98258z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCActionDelegate this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$1$1.class */
        public static final class C09131 extends SuspendLambda implements Function2<PlayerHiddenScrollingViewBehavior.State, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCActionDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09131(UGCActionDelegate uGCActionDelegate, Continuation<? super C09131> continuation) {
                super(2, continuation);
                this.this$0 = uGCActionDelegate;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09131 c09131 = new C09131(this.this$0, continuation);
                c09131.L$0 = obj;
                return c09131;
            }

            public final Object invoke(PlayerHiddenScrollingViewBehavior.State state, Continuation<? super Unit> continuation) {
                return create(state, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((PlayerHiddenScrollingViewBehavior.State) this.L$0) == PlayerHiddenScrollingViewBehavior.State.STATE_HIDDEN) {
                    this.this$0.r0("5");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCActionDelegate uGCActionDelegate, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCActionDelegate;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCActionDelegate uGCActionDelegate = this.this$0;
                StateFlow<PlayerHiddenScrollingViewBehavior.State> stateFlow = uGCActionDelegate.f98229E.f103500j;
                C09131 c09131 = new C09131(uGCActionDelegate, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09131, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f98260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Long f98261c;

        public a(@Nullable Long l7, @Nullable String str, int i7) {
            this.f98259a = i7;
            this.f98260b = str;
            this.f98261c = l7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f98259a == aVar.f98259a && Intrinsics.areEqual(this.f98260b, aVar.f98260b) && Intrinsics.areEqual(this.f98261c, aVar.f98261c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f98259a);
            int iHashCode2 = 0;
            String str = this.f98260b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            Long l7 = this.f98261c;
            if (l7 != null) {
                iHashCode2 = l7.hashCode();
            }
            return Boolean.hashCode(true) + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(fullTextType=");
            sb.append(this.f98259a);
            sb.append(", fulltextToastText=");
            sb.append(this.f98260b);
            sb.append(", landingPositionMillis=");
            return com.bilibili.adcommon.utils.c.a(sb, this.f98261c, ", enableImmersion=true)");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.app.gemini.player.widget.selector.g f98262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f98263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f98264c;

        public b(@NotNull com.bilibili.app.gemini.player.widget.selector.g gVar, long j7, long j8) {
            this.f98262a = gVar;
            this.f98263b = j7;
            this.f98264c = j8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f98262a, bVar.f98262a) && this.f98263b == bVar.f98263b && this.f98264c == bVar.f98264c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f98264c) + C3554n0.a(this.f98262a.a.hashCode() * 31, 31, this.f98263b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LocalVideoItem(videoListItem=");
            sb.append(this.f98262a);
            sb.append(", avid=");
            sb.append(this.f98263b);
            sb.append(", cid=");
            return android.support.v4.media.session.a.a(sb, this.f98264c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f98266b;

        static {
            int[] iArr = new int[MaterialBizType.values().length];
            try {
                iArr[MaterialBizType.NEW_BGM.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MaterialBizType.GENERAL_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f98265a = iArr;
            int[] iArr2 = new int[SharePosition.values().length];
            try {
                iArr2[SharePosition.POSITION_FULLSCREEN_SNAPSHOT.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[SharePosition.POSITION_FULLSCREEN_GIF.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[SharePosition.POSITION_FULLSCREEN_SNAPSHOT_COMBINATION.ordinal()] = 3;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[SharePosition.POSITION_LAND_FULLSCREEN_SHARE_WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[SharePosition.POSITION_LAND_FULLSCREEN_END_PAGE_SHARE_WIDGET.ordinal()] = 5;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[SharePosition.POSITION_VERTICAL_FULLSCREEN_SHARE_WIDGET.ordinal()] = 6;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[SharePosition.POSITION_VERTICAL_FULLSCREEN_END_PAGE_SHARE_WIDGET.ordinal()] = 7;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr2[SharePosition.POSITION_HALF_SCREEN_END_PAGE_SHARE_WIDGET.ordinal()] = 8;
            } catch (NoSuchFieldError e16) {
            }
            f98266b = iArr2;
        }
    }

    @Inject
    public UGCActionDelegate(@NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull com.bilibili.ship.theseus.ugc.w wVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPlayDirector iPlayDirector, @NotNull List<Av0.a> list, @NotNull List<C6353o> list2, @NotNull Context context, @NotNull com.bilibili.ship.theseus.ugc.intro.ugcheadline.p pVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull E e7, @NotNull UGCScreenImmersionService uGCScreenImmersionService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull RelationRepository relationRepository, @NotNull ViewReply viewReply, @NotNull a aVar2, @NotNull CoroutineScope coroutineScope, @NotNull UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, @NotNull UGCPlaybackRepository uGCPlaybackRepository2, @NotNull com.bilibili.ship.theseus.ugc.play.schedule.k kVar, @NotNull rW0.a<InterfaceC7008a> aVar3, @NotNull com.bilibili.ship.theseus.united.page.view.t tVar, @NotNull StoryEntranceService storyEntranceService, @NotNull StoryEntranceService.a aVar4, @NotNull PageReportService pageReportService, @NotNull StoryTransitionAnimService storyTransitionAnimService, @NotNull C8043a c8043a, @NotNull ZoomContainerService zoomContainerService, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.interactvideo.e eVar, @NotNull FragmentActivity fragmentActivity, @NotNull FragmentManager fragmentManager) {
        this.f98234a = uGCPlaybackRepository;
        this.f98235b = aVar;
        this.f98236c = wVar;
        this.f98237d = iPlayerCoreService;
        this.f98238e = hVar;
        this.f98239f = iPlayDirector;
        this.f98240g = list;
        this.h = list2;
        this.f98241i = context;
        this.f98242j = pVar;
        this.f98243k = cVar;
        this.f98244l = e7;
        this.f98245m = uGCScreenImmersionService;
        this.f98246n = dVar;
        this.f98247o = relationRepository;
        this.f98248p = viewReply;
        this.f98249q = aVar2;
        this.f98250r = coroutineScope;
        this.f98251s = unitedGeminiPlayerCommonActionDelegate;
        this.f98252t = uGCPlaybackRepository2;
        this.f98253u = kVar;
        this.f98254v = aVar3;
        this.f98255w = tVar;
        this.f98256x = storyEntranceService;
        this.f98257y = aVar4;
        this.f98258z = pageReportService;
        this.f98225A = storyTransitionAnimService;
        this.f98226B = c8043a;
        this.f98227C = zoomContainerService;
        this.f98228D = unitedSeasonDetailRepository;
        this.f98229E = theseusPageUIStyleRepository;
        this.f98230F = eVar;
        this.f98231G = fragmentActivity;
        this.f98232H = fragmentManager;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        this.f98233I = new ArrayList<>();
    }

    public final boolean A() {
        this.f98251s.getClass();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final com.bilibili.app.gemini.share.i B(@NotNull SharePosition sharePosition) throws NoWhenBranchMatchedException {
        com.bilibili.app.gemini.share.i iVar;
        C6266b c6266b = (C6266b) this.f98242j.f97378i.getValue();
        com.bilibili.ship.theseus.ugc.intro.ugcheadline.d dVar = c6266b != null ? c6266b.f97304b : null;
        String str = (dVar == null || dVar.f97313a != 1) ? "" : "hot";
        int i7 = c.f98266b[sharePosition.ordinal()];
        C8043a c8043a = this.f98226B;
        switch (i7) {
            case 1:
            case 2:
            case 3:
                iVar = new com.bilibili.app.gemini.share.i(120, (Integer) null, str, c8043a.a().f123880b, "ugc_player", (String) null, (String) null, (String) null);
                break;
            case 4:
            case 6:
                iVar = new com.bilibili.app.gemini.share.i(120, (Integer) null, str, c8043a.a().f123880b, "ugc_player", (String) null, (String) null, (String) null);
                break;
            case 5:
            case 7:
            case 8:
                iVar = new com.bilibili.app.gemini.share.i(120, (Integer) null, str, c8043a.a().f123880b, "ugcplayer_end", (String) null, (String) null, (String) null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX WARN: Type inference failed for: r0v74, types: [com.bilibili.ship.theseus.ugc.playercontainer.d] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kntr.common.share.domain.model.e C(@org.jetbrains.annotations.NotNull java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.C(java.lang.String):kntr.common.share.domain.model.e");
    }

    public final boolean D() {
        com.bilibili.ship.theseus.united.page.view.r rVar = this.f98255w.f104126b.f104089d;
        return rVar != null ? rVar.f104120c : false;
    }

    @Nullable
    public final StateFlow<Long> E() {
        return this.f98251s.E();
    }

    @Nullable
    public final Function3<Modifier, Composer, Integer, Unit> F() {
        this.f98251s.getClass();
        return null;
    }

    @Nullable
    public final StateFlow<Boolean> H() {
        return this.f98251s.f104707c.f103998f;
    }

    @Nullable
    public final StateFlow<Long> I() {
        return this.f98251s.I();
    }

    @Nullable
    public final Deferred<Boolean> J() {
        return this.f98251s.f104708d.f100330g;
    }

    public final boolean K() {
        return this.f98251s.f104713j.b();
    }

    public final void L() {
        RelationRepository relationRepository = this.f98247o;
        relationRepository.z(relationRepository.q() + 1);
    }

    @NotNull
    public final kntr.common.share.domain.model.e M(@NotNull String str, @Nullable Function0<Bitmap> function0, @Nullable Function0<String> function02) {
        kntr.common.share.domain.model.e eVar;
        String string;
        GeminiCommonPlayableParams currentPlayableParams = this.f98239f.getCurrentPlayableParams();
        GeminiCommonPlayableParams geminiCommonPlayableParams = currentPlayableParams instanceof GeminiCommonPlayableParams ? currentPlayableParams : null;
        if (geminiCommonPlayableParams != null) {
            Context context = this.f98241i;
            D d7 = new D(function0, function02, context, geminiCommonPlayableParams, this.f98255w.f104125a.f104105b.f104092a);
            String author = geminiCommonPlayableParams.getAuthor();
            if (author == null) {
                author = "";
            }
            String title = geminiCommonPlayableParams.getTitle();
            if (title == null || StringsKt.isBlank(title)) {
                string = context.getString(2131841684);
            } else {
                String title2 = geminiCommonPlayableParams.getTitle();
                string = title2;
                if (title2 == null) {
                    string = "";
                }
            }
            int page = geminiCommonPlayableParams.getPage();
            String strValueOf = String.valueOf(geminiCommonPlayableParams.getAvid());
            String bvId = geminiCommonPlayableParams.getBvId();
            long cid = geminiCommonPlayableParams.getCid();
            String strA = C4496a.a("https://www.bilibili.com/video/", BVCompat.a(strValueOf, bvId));
            com.bilibili.app.gemini.ugc.feature.w wVar = new com.bilibili.app.gemini.ugc.feature.w(d7, string, author, strValueOf, bvId, new kntr.common.share.domain.model.a(string, string, strA), page, String.valueOf(cid), strA, new kntr.common.share.domain.model.a((String) null, (String) null, 7));
            kntr.common.share.domain.model.g gVar = new kntr.common.share.domain.model.g();
            wVar.invoke(gVar);
            eVar = new kntr.common.share.domain.model.e(gVar.a);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Unit unit = Unit.INSTANCE;
            eVar = new kntr.common.share.domain.model.e(linkedHashMap);
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String N() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.united.page.view.t r0 = r0.f98255w
            com.bilibili.ship.theseus.united.page.view.h r0 = r0.f104126b
            com.bilibili.ship.theseus.united.page.view.r r0 = r0.f104089d
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1a
            r0 = r3
            java.lang.String r0 = r0.f104119b
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1d
        L1a:
            java.lang.String r0 = ""
            r3 = r0
        L1d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.N():java.lang.String");
    }

    @Nullable
    public final StateFlow<Long> O() {
        return this.f98251s.O();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String P() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f98238e
            com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r4
            com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = r0.f()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r4
            long r0 = r0.getCid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L26
            goto L29
        L26:
            java.lang.String r0 = ""
            r4 = r0
        L29:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.P():java.lang.String");
    }

    public final boolean Q() {
        return this.f98251s.Q();
    }

    public final boolean R() {
        com.bilibili.ship.theseus.united.page.view.r rVar = this.f98255w.f104126b.f104089d;
        return rVar != null ? rVar.f104118a : false;
    }

    @NotNull
    public final StateFlow<com.bilibili.app.gemini.player.widget.selector.f> S() {
        final UGCPlaybackRepository$special$$inlined$map$1 uGCPlaybackRepository$special$$inlined$map$1 = this.f98234a.f98076u;
        return FlowKt.stateIn(new Flow<com.bilibili.app.gemini.player.widget.selector.f>(uGCPlaybackRepository$special$$inlined$map$1, this) { // from class: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCPlaybackRepository$special$$inlined$map$1 f98267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UGCActionDelegate f98268b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f98269a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UGCActionDelegate f98270b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, UGCActionDelegate uGCActionDelegate) {
                    this.f98269a = flowCollector;
                    this.f98270b = uGCActionDelegate;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L88
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        Av0.a r0 = (Av0.a) r0
                        r6 = r0
                        r0 = r5
                        com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate r0 = r0.f98270b
                        com.bilibili.app.gemini.player.widget.selector.f r0 = r0.s0()
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f98269a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L88
                        r0 = r9
                        return r0
                    L88:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate$getSelectorVideoListConfigFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f98267a = uGCPlaybackRepository$special$$inlined$map$1;
                this.f98268b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f98267a.collect(new AnonymousClass2(flowCollector, this.f98268b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, this.f98250r, SharingStarted.Companion.getEagerly(), s0());
    }

    public final void T() {
        UGCScreenImmersionService uGCScreenImmersionService = this.f98245m;
        IRenderContainerService iRenderContainerService = uGCScreenImmersionService.f97989c;
        AspectRatio aspectRatio = iRenderContainerService.getAspectRatio();
        iRenderContainerService.setAspectRatio(AspectRatio.RATIO_CENTER_CROP);
        uGCScreenImmersionService.f97992f = aspectRatio;
    }

    @NotNull
    public final PosterStyle U() {
        this.f98251s.getClass();
        return PosterStyle.STYLE_DEFAULT;
    }

    public final void V(@NotNull com.bilibili.app.gemini.player.widget.selector.g gVar, int i7) {
        b bVar = (b) CollectionsKt.getOrNull(this.f98233I, i7);
        if (bVar == null) {
            T7.a.a(i7, "can not found item, position: ", "UGCActionDelegate");
        } else if (this.f98228D.d()) {
            InterfaceC7008a.e((InterfaceC7008a) this.f98254v.get(), bVar.f98263b, bVar.f98264c, null, "united.player-video-detail.drama-player-episode.0", null, 0, null, false, 426);
        } else {
            UGCPlaybackRepository.g(this.f98252t, bVar.f98263b, bVar.f98264c, null, null, 0, 12);
        }
    }

    @NotNull
    public final String W() {
        this.f98251s.getClass();
        return "";
    }

    @Nullable
    public final StateFlow<Boolean> X() {
        return this.f98251s.f104707c.f103999g;
    }

    @Nullable
    public final String Y() {
        return this.f98251s.Y();
    }

    public final void Z() {
        r0("4");
    }

    @Nullable
    public final z a() {
        return this.f98251s.a();
    }

    public final boolean a0() {
        return this.f98251s.a0();
    }

    @Nullable
    public final Drawable b() {
        return this.f98251s.b();
    }

    @NotNull
    public final String b0() {
        String strA;
        String str = (String) this.f98236c.f98561c.getValue();
        int iB = this.f98234a.b() + 1;
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f98235b;
        String strA2 = BVCompat.a(Fp.c.b(aVar.f104038c.getValue(), "av"), (String) aVar.f104040e.getValue());
        if (str.length() > 0) {
            strA = str;
            if (iB > 1) {
                strA = C8509b.a(iB, str, "/p");
            }
        } else {
            strA = iB > 1 ? ID.a.a(iB, "https://www.bilibili.com/video/", strA2, "?p=") : C4496a.a("https://www.bilibili.com/video/", strA2);
        }
        return strA;
    }

    public final boolean c() {
        this.f98251s.getClass();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c0() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.united.page.view.t r0 = r0.f98255w
            com.bilibili.ship.theseus.united.page.view.h r0 = r0.f104126b
            com.bilibili.ship.theseus.united.page.view.r r0 = r0.f104089d
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1a
            r0 = r3
            java.lang.String r0 = r0.f104121d
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1d
        L1a:
            java.lang.String r0 = ""
            r3 = r0
        L1d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.c0():java.lang.String");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String d(@NotNull SharePosition sharePosition) throws NoWhenBranchMatchedException {
        String str;
        switch (c.f98266b[sharePosition.ordinal()]) {
            case 1:
                str = "1";
                break;
            case 2:
                str = "2";
                break;
            case 3:
                str = "5";
                break;
            case 4:
                str = "fullplayer_horizontal";
                break;
            case 5:
                str = "fullplayer_horizontal_playfinish";
                break;
            case 6:
                str = "fullplayer_vertical";
                break;
            case 7:
                str = "fullplayer_vertical_playfinish";
                break;
            case 8:
                str = "vinfo_playfinish";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final void d0() {
        BuildersKt.launch$default(this.f98250r, (CoroutineContext) null, (CoroutineStart) null, new UGCActionDelegate$onClickLandscapeComment$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final StateFlow<PlayNetworkEnv> e() {
        return this.f98251s.e();
    }

    public final boolean e0() {
        return this.f98248p.hasArc();
    }

    @Nullable
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        return this.f98251s.f();
    }

    @Nullable
    public final StateFlow<Boolean> f0() {
        return this.f98251s.f104707c.f104002k;
    }

    public final void g() {
        this.f98253u.d(0);
    }

    @Nullable
    public final StateFlow<Long> g0() {
        return this.f98251s.g0();
    }

    @NotNull
    public final String getArcTitle() {
        return this.f98242j.a();
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        return this.f98251s.getCoinStyle();
    }

    @Nullable
    public final Drawable getLikeIcon() {
        return this.f98251s.getLikeIcon();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f98251s.f104708d.a();
    }

    public final int getTemplateId() {
        this.f98251s.getClass();
        return 0;
    }

    public final long getTypeId() {
        return this.f98235b.f104047m;
    }

    public final void h() {
        this.f98253u.c(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider h0(@org.jetbrains.annotations.NotNull java.lang.String r16) {
        /*
            r15 = this;
            r0 = r15
            android.content.Context r0 = r0.f98241i
            r25 = r0
            r0 = r15
            com.bilibili.ship.theseus.united.page.view.a r0 = r0.f98235b
            r22 = r0
            r0 = r22
            java.lang.String r0 = r0.b()
            r23 = r0
            r0 = r22
            kotlinx.coroutines.flow.StateFlow<java.lang.String> r0 = r0.f104040e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r24 = r0
            r0 = r15
            com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository r0 = r0.f98234a
            r28 = r0
            r0 = r28
            Av0.a r0 = r0.c()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L41
            r0 = r16
            long r0 = r0.f591b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r16 = r0
            r0 = r16
            r21 = r0
            r0 = r16
            if (r0 != 0) goto L46
        L41:
            java.lang.String r0 = "0"
            r21 = r0
        L46:
            r0 = r22
            java.lang.String r0 = r0.f()
            r26 = r0
            r0 = r28
            int r0 = r0.b()
            r17 = r0
            r0 = r15
            com.bilibili.ship.theseus.united.page.view.d r0 = r0.f98246n
            r16 = r0
            r0 = r16
            long r0 = r0.f()
            r19 = r0
            r0 = r16
            java.lang.String r0 = r0.g()
            r27 = r0
            r0 = r22
            java.lang.String r0 = r0.f104046l
            r22 = r0
            r0 = r22
            if (r0 != 0) goto L77
            java.lang.String r0 = ""
            r22 = r0
            goto L77
        L77:
            r0 = r15
            com.bilibili.ship.theseus.united.page.screenstate.c r0 = r0.f98243k
            com.bilibili.ship.theseus.united.page.screenstate.c$a r0 = r0.h()
            boolean r0 = r0.f102987a
            r18 = r0
            r0 = r28
            Av0.a r0 = r0.c()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L96
            r0 = r16
            java.lang.String r0 = r0.f594e
            r16 = r0
            goto L98
        L96:
            r0 = 0
            r16 = r0
        L98:
            r0 = r16
            if (r0 != 0) goto La2
            java.lang.String r0 = ""
            r16 = r0
            goto La2
        La2:
            com.bilibili.app.gemini.ugc.feature.t r0 = new com.bilibili.app.gemini.ugc.feature.t
            r1 = r0
            r2 = r25
            r3 = r23
            r4 = r24
            r5 = r21
            r6 = r26
            r7 = r17
            r8 = 1
            int r7 = r7 + r8
            r8 = r19
            r9 = r27
            r10 = r22
            r11 = r18
            r12 = 1
            r11 = r11 ^ r12
            r12 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.h0(java.lang.String):com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider");
    }

    @Nullable
    public final StateFlow<Boolean> i() {
        return this.f98251s.i();
    }

    public final boolean i0() {
        this.f98251s.getClass();
        return false;
    }

    @NotNull
    public final Pair<Class<? extends AbsFunctionWidget>, AbsFunctionWidget.Configuration> j(@NotNull String str) {
        return new Pair<>(com.bilibili.app.gemini.player.feature.zoom.h.class, new h.a(str, 0, (Function1) null, false, false, false, (W2.e) null, (Map) null, 254));
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f98251s.f104705a;
    }

    @Nullable
    public final ShareContentProvider k(@NotNull String str, @NotNull Function0<String> function0) {
        GeminiCommonPlayableParams currentPlayableParams = this.f98239f.getCurrentPlayableParams();
        com.bilibili.app.gemini.ugc.feature.r rVar = null;
        GeminiCommonPlayableParams geminiCommonPlayableParams = currentPlayableParams instanceof GeminiCommonPlayableParams ? currentPlayableParams : null;
        if (geminiCommonPlayableParams != null) {
            rVar = new com.bilibili.app.gemini.ugc.feature.r(this.f98241i, geminiCommonPlayableParams, function0, this.f98255w.f104125a.f104105b.f104092a);
        }
        return rVar;
    }

    public final void k0(@NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        String url;
        MaterialBizType type = material.getType();
        int i7 = type == null ? -1 : c.f98265a[type.ordinal()];
        ZoomContainerService zoomContainerService = this.f98227C;
        if (i7 != 1) {
            if (i7 != 2 || (url = material.getUrl()) == null || StringsKt.isBlank(url)) {
                return;
            }
            zoomContainerService.s(url, PageType.H5, ZoomContainerService.Side.RIGHT, false);
            return;
        }
        String strA = G.p.a(material.getUrl(), "&position_id=2");
        if (strA == null || StringsKt.isBlank(strA)) {
            return;
        }
        zoomContainerService.s(strA, PageType.H5, ZoomContainerService.Side.RIGHT, false);
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.f98251s.l(str, str2, str3);
    }

    public final boolean l0() {
        if (this.h.isEmpty()) {
            return false;
        }
        this.f98244l.f101456e.tryEmit(Boolean.TRUE);
        return true;
    }

    @NotNull
    public final String m() {
        String strA;
        TimeFormater timeFormater = TimeFormater.INSTANCE;
        IPlayerCoreService iPlayerCoreService = this.f98237d;
        boolean z6 = false;
        String time = timeFormater.formatTime(iPlayerCoreService.getCurrentPosition(), false, false);
        String time2 = timeFormater.formatTime(iPlayerCoreService.getDuration(), false, false);
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f98235b;
        String strA2 = BVCompat.a(Fp.c.b(aVar.f104038c.getValue(), "av"), (String) aVar.f104040e.getValue());
        int iB = this.f98234a.b();
        if (this.f98240g.size() > 1) {
            z6 = true;
        }
        String strA3 = B0.a.a(time, "/", time2);
        if (z6) {
            strA = strA2 + " P" + (iB + 1) + " " + strA3;
        } else {
            strA = B0.a.a(strA2, " ", strA3);
        }
        return strA;
    }

    @NotNull
    public final String m0() {
        String quantityString;
        StatInfoData statInfoData;
        StatInfoData statInfoData2;
        StatInfoData statInfoDataB;
        StatData statData = (StatData) this.f98247o.f104004m.getValue();
        long j7 = statData != null ? statData.f104022d : 0L;
        if (statData == null || (statInfoDataB = statData.b()) == null) {
            quantityString = null;
        } else if (statInfoDataB.a()) {
            quantityString = statInfoDataB.f104029c;
        } else {
            Resources resources = this.f98241i.getResources();
            long j8 = statInfoDataB.f104027a;
            quantityString = resources.getQuantityString(2131689608, (int) j8, NumberFormat_androidKt.format$default(Long.valueOf(j8), "0", 0, 2, (Object) null));
        }
        return U1.i.a(quantityString, "·", this.f98241i.getResources().getQuantityString(2131689610, (int) j7, NumberFormat_androidKt.format$default(Long.valueOf(j7), "0", 0, 2, (Object) null)), "·", this.f98241i.getResources().getQuantityString(2131689612, (statData == null || (statInfoData2 = statData.f104020b) == null) ? 0 : (int) statInfoData2.f104027a, NumberFormat_androidKt.format$default((statData == null || (statInfoData = statData.f104020b) == null) ? null : Long.valueOf(statInfoData.f104027a), "0", 0, 2, (Object) null)));
    }

    @Nullable
    public final MutableSharedFlow<yk.e> n() {
        return this.f98251s.f104721r;
    }

    @Nullable
    public final Integer n0(@Nullable String str) {
        this.f98251s.getClass();
        return null;
    }

    public final boolean o() {
        this.f98251s.getClass();
        return false;
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        return this.f98251s.o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String p() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f98238e
            com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r4
            com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = r0.f()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L26
            r0 = r4
            long r0 = r0.getAvid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L26
            goto L29
        L26:
            java.lang.String r0 = ""
            r4 = r0
        L29:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.p():java.lang.String");
    }

    public final boolean p0() {
        this.f98251s.getClass();
        return true;
    }

    public final int q() {
        return this.f98251s.q();
    }

    @NotNull
    public final String q0(@NotNull SharePosition sharePosition) {
        int i7 = c.f98266b[sharePosition.ordinal()];
        return (i7 == 1 || i7 == 2 || i7 == 3) ? "player.player.shots.0.player" : "main.ugc-video-detail.0.0.pv";
    }

    public final boolean r() {
        this.f98249q.getClass();
        com.bilibili.ship.theseus.united.page.view.l lVar = this.f98255w.f104126b.f104091f;
        return lVar != null ? lVar.f104098a : false;
    }

    public final void r0(String str) {
        Long l7 = this.f98257y.f103038a;
        boolean z6 = l7 != null && l7.longValue() > 0;
        if (z6) {
            PageReportService.g(this.f98258z, "united.player-video-detail.story-back.type.click", MapsKt.mapOf(TuplesKt.to("back_way", "4")), 4);
        }
        BuildersKt.launch$default(this.f98250r, (CoroutineContext) null, (CoroutineStart) null, new UGCActionDelegate$fullscreen2Story$1(this, z6, str, null), 3, (Object) null);
    }

    @Nullable
    public final Integer s() {
        return this.f98251s.s();
    }

    public final com.bilibili.app.gemini.player.widget.selector.f s0() {
        com.bilibili.app.gemini.player.widget.selector.g gVar;
        ArrayList arrayList = new ArrayList();
        this.f98233I.clear();
        boolean zIsEmpty = this.h.isEmpty();
        UGCPlaybackRepository uGCPlaybackRepository = this.f98234a;
        com.bilibili.app.gemini.player.widget.selector.g gVar2 = null;
        if (!zIsEmpty) {
            Iterator<T> it = this.h.iterator();
            com.bilibili.app.gemini.player.widget.selector.g gVar3 = null;
            while (true) {
                gVar = gVar3;
                if (!it.hasNext()) {
                    break;
                }
                Iterator<T> it2 = ((C6353o) it.next()).h.iterator();
                com.bilibili.app.gemini.player.widget.selector.g gVar4 = gVar3;
                while (true) {
                    gVar3 = gVar4;
                    if (it2.hasNext()) {
                        Iterator<T> it3 = ((Z) it2.next()).f101648d.iterator();
                        while (true) {
                            com.bilibili.app.gemini.player.widget.selector.g gVar5 = gVar4;
                            gVar4 = gVar5;
                            if (it3.hasNext()) {
                                C6355q c6355q = (C6355q) it3.next();
                                com.bilibili.app.gemini.player.widget.selector.g gVar6 = new com.bilibili.app.gemini.player.widget.selector.g(c6355q.f101684d);
                                Av0.a aVarC = uGCPlaybackRepository.c();
                                gVar4 = gVar5;
                                if (aVarC != null) {
                                    gVar4 = gVar5;
                                    if (c6355q.f101683c == aVarC.f591b) {
                                        gVar4 = gVar6;
                                    }
                                }
                                arrayList.add(gVar6);
                                this.f98233I.add(new b(gVar6, c6355q.f101682b, c6355q.f101683c));
                            }
                        }
                    }
                }
            }
        } else {
            Iterator<T> it4 = this.f98240g.iterator();
            while (true) {
                gVar = gVar2;
                if (!it4.hasNext()) {
                    break;
                }
                Av0.a aVar = (Av0.a) it4.next();
                com.bilibili.app.gemini.player.widget.selector.g gVar7 = new com.bilibili.app.gemini.player.widget.selector.g(this.f98241i.getString(2131820867, Integer.valueOf(aVar.f592c), aVar.f593d));
                Av0.a aVarC2 = uGCPlaybackRepository.c();
                com.bilibili.app.gemini.player.widget.selector.g gVar8 = gVar2;
                if (aVarC2 != null) {
                    gVar8 = gVar2;
                    if (aVar.f591b == aVarC2.f591b) {
                        gVar8 = gVar7;
                    }
                }
                arrayList.add(gVar7);
                this.f98233I.add(new b(gVar7, aVar.f590a, aVar.f591b));
                gVar2 = gVar8;
            }
        }
        return new com.bilibili.app.gemini.player.widget.selector.f(arrayList, CollectionsKt.indexOf(arrayList, gVar));
    }

    public final boolean t() {
        this.f98251s.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ship.theseus.united.page.interactvideo.e r0 = r0.f98230F
            java.lang.String r0 = r0.f99967d
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            r4 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L49
        L17:
            r0 = r3
            java.util.List<Av0.a> r0 = r0.f98240g
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L2f
            r0 = r3
            com.bilibili.ship.theseus.united.page.view.a r0 = r0.f98235b
            java.lang.String r0 = r0.f()
            r4 = r0
            goto L49
        L2f:
            r0 = r3
            com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository r0 = r0.f98234a
            Av0.a r0 = r0.c()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L46
            r0 = r4
            java.lang.String r0 = r0.f593d
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L49
        L46:
            java.lang.String r0 = ""
            r4 = r0
        L49:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCActionDelegate.u():java.lang.String");
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        this.f98251s.v(str, pageType);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        return this.f98251s.w(view);
    }

    @Nullable
    public final StateFlow<wk.a> x() {
        return this.f98251s.f104722s;
    }

    @Nullable
    public final String y() {
        Av0.a aVarC = this.f98234a.c();
        return aVarC != null ? aVarC.f593d : null;
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        this.f98251s.z(str, pageType);
        return true;
    }
}
