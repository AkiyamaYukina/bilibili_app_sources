package com.bilibili.ship.theseus.ogv.intro.kingposition;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.gestures.o0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.share.d;
import com.bilibili.app.gemini.share.f;
import com.bilibili.app.gemini.share.g;
import com.bilibili.app.gemini.share.i;
import com.bilibili.app.gemini.share.t;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.menu.CheckMenuItem;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.OgvShareMenuChatService;
import com.bilibili.ship.theseus.ogv.dubbing.n;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.download.service.OgvDownloadService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.utils.q;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.common.share.domain.model.ShareParams;
import kntr.common.share.domain.model.e;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qv0.C8487a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.ForegroundRelativeLayout;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService.class */
@StabilityInferred(parameters = 0)
public final class OgvKingPositionShareService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f93190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.autofloat.a f93192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RelationRepository f93193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8487a f93194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7893a f93195g;

    @NotNull
    public final h h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvDownloadService f93196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f93197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.b f93199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final n f93200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f93201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final BackgroundPlayService f93202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final d f93203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final OgvShareMenuChatService f93204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f93205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final yk.c f93206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f93207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public t f93208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public f f93209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Map<Float, String> f93210w = MapsKt.mapOf(new Pair[]{TuplesKt.to(Float.valueOf(0.5f), "1"), TuplesKt.to(Float.valueOf(0.75f), "2"), TuplesKt.to(Float.valueOf(1.0f), "3"), TuplesKt.to(Float.valueOf(1.25f), "4"), TuplesKt.to(Float.valueOf(1.5f), "5"), TuplesKt.to(Float.valueOf(2.0f), "6")});

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Map<Integer, String> f93211x = MapsKt.mapOf(new Pair[]{TuplesKt.to(0, "1"), TuplesKt.to(1, "2"), TuplesKt.to(2, "3"), TuplesKt.to(4, "4")});

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final float[] f93212y = {2.0f, 1.5f, 1.25f, 1.0f, 0.75f, 0.5f};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final ArrayList<CheckMenuItem> f93213z = new ArrayList<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final ArrayList<CheckMenuItem> f93184A = new ArrayList<>();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Integer> f93185B = new HashMap<>();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final b f93186C = new b(this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final a f93187D = new a(this);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final c f93188E = new c(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvKingPositionShareService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$1$1.class */
        public static final class C07041 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final OgvKingPositionShareService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07041(OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super C07041> continuation) {
                super(2, continuation);
                this.this$0 = ogvKingPositionShareService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07041(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("OgvKingPositionShareService$1$1-invokeSuspend", "[theseus-ogv-OgvKingPositionShareService$1$1-invokeSuspend] click share");
                OgvKingPositionShareService.a(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvKingPositionShareService;
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
                OgvKingPositionShareService ogvKingPositionShareService = this.this$0;
                SharedFlow<Unit> sharedFlow = ogvKingPositionShareService.f93194f.f126352c;
                C07041 c07041 = new C07041(ogvKingPositionShareService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c07041, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvKingPositionShareService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final OgvKingPositionShareService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvKingPositionShareService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("OgvKingPositionShareService$2$1-invokeSuspend", "[theseus-ogv-OgvKingPositionShareService$2$1-invokeSuspend] auto share");
                OgvKingPositionShareService.a(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvKingPositionShareService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvKingPositionShareService ogvKingPositionShareService = this.this$0;
                SharedFlow<Unit> sharedFlow = ogvKingPositionShareService.f93192d.f98982f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvKingPositionShareService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvKingPositionShareService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            final Ref.LongRef $lastCid;
            Object L$0;
            int label;
            final OgvKingPositionShareService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.LongRef longRef, OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$lastCid = longRef;
                this.this$0 = ogvKingPositionShareService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lastCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                OgvKingPositionShareService ogvKingPositionShareService;
                f fVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                if (c1318a == null) {
                    return Unit.INSTANCE;
                }
                long j7 = this.$lastCid.element;
                C7893a.C1318a.C1319a c1319a = c1318a.f123395a;
                if (j7 != c1319a.f123398b && (fVar = (ogvKingPositionShareService = this.this$0).f93209v) != null) {
                    fVar.b();
                    ogvKingPositionShareService.f93209v = null;
                }
                this.$lastCid.element = c1319a.f123398b;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvKingPositionShareService ogvKingPositionShareService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvKingPositionShareService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.LongRef longRefB = o0.b(obj);
                OgvKingPositionShareService ogvKingPositionShareService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = ogvKingPositionShareService.f93195g.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(longRefB, ogvKingPositionShareService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$a.class */
    public static final class a implements CheckMenuItem.OnMenuClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvKingPositionShareService f93214a;

        public a(OgvKingPositionShareService ogvKingPositionShareService) {
            this.f93214a = ogvKingPositionShareService;
        }

        @Override // com.bilibili.lib.ui.menu.CheckMenuItem.OnMenuClickListener
        public final void onMenuClick(View view) {
            int iIntValue;
            if (view == null) {
                return;
            }
            OgvKingPositionShareService ogvKingPositionShareService = this.f93214a;
            ArrayList<CheckMenuItem> arrayList = ogvKingPositionShareService.f93184A;
            IPlayerSettingService iPlayerSettingService = ogvKingPositionShareService.f93197j;
            Iterator<CheckMenuItem> it = arrayList.iterator();
            while (true) {
                iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                } else {
                    it.next().setCheck(false);
                }
            }
            if (view instanceof ForegroundRelativeLayout) {
                TextView textView = (TextView) view.findViewById(2131307409);
                ((ImageView) view.findViewById(2131307368)).setVisibility(0);
                try {
                    String string = textView.getText().toString();
                    int i7 = iPlayerSettingService.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                    Integer num = ogvKingPositionShareService.f93185B.get(string);
                    if (num != null && i7 == num.intValue()) {
                        return;
                    }
                    Integer num2 = ogvKingPositionShareService.f93185B.get(string);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                    q.c(string);
                    iPlayerSettingService.putInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, iIntValue);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$b.class */
    public static final class b implements CheckMenuItem.OnMenuClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvKingPositionShareService f93215a;

        public b(OgvKingPositionShareService ogvKingPositionShareService) {
            this.f93215a = ogvKingPositionShareService;
        }

        @Override // com.bilibili.lib.ui.menu.CheckMenuItem.OnMenuClickListener
        public final void onMenuClick(View view) {
            if (view == null) {
                return;
            }
            OgvKingPositionShareService ogvKingPositionShareService = this.f93215a;
            h hVar = ogvKingPositionShareService.h;
            Iterator<CheckMenuItem> it = ogvKingPositionShareService.f93213z.iterator();
            while (it.hasNext()) {
                it.next().setCheck(false);
            }
            if (view instanceof ForegroundRelativeLayout) {
                TextView textView = (TextView) view.findViewById(2131307409);
                ((ImageView) view.findViewById(2131307368)).setVisibility(0);
                try {
                    Float floatOrNull = StringsKt.toFloatOrNull(textView.getText().toString());
                    if (floatOrNull != null) {
                        float fFloatValue = floatOrNull.floatValue();
                        if (hVar.f91108b.b() == fFloatValue) {
                            return;
                        }
                        hVar.r(fFloatValue);
                        q.c(fFloatValue + "X");
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/OgvKingPositionShareService$c.class */
    public static final class c implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvKingPositionShareService f93216a;

        public c(OgvKingPositionShareService ogvKingPositionShareService) {
            this.f93216a = ogvKingPositionShareService;
        }

        public final String[] a() {
            ArrayList arrayList = new ArrayList();
            CollectionsKt.e(arrayList, f.m);
            OgvKingPositionShareService ogvKingPositionShareService = this.f93216a;
            ogvKingPositionShareService.getClass();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("PLAY_RATE");
            arrayList2.add("PLAY_SETTING");
            arrayList2.add("VIDEO_DOWNLOAD");
            if (ogvKingPositionShareService.f93197j.getCloudConfig().K()) {
                arrayList2.add("PLAY_MODE");
            }
            arrayList2.add("WATCH_TOGETHER");
            arrayList2.add("WATCH_TOGETHER_BETA");
            arrayList2.add("FAN_LIKE");
            arrayList2.add("SUGGESTION");
            arrayList2.add("WATCH_TOGETHER");
            arrayList2.add("WATCH_TOGETHER_BETA");
            arrayList2.add("SWITCH_DUBBING");
            arrayList.addAll(arrayList2);
            return (String[]) arrayList.toArray(new String[0]);
        }

        public final boolean d(String str, g gVar) {
            return OgvKingPositionShareService.b(this.f93216a, str);
        }

        public final IMenuItem f(IMenuItem iMenuItem) {
            int iHashCode;
            String itemId = iMenuItem.getItemId();
            if (itemId != null && ((iHashCode = itemId.hashCode()) == -1364951698 ? itemId.equals("PLAY_MINISCREEN") : !(iHashCode != 1825622809 || !itemId.equals("PLAY_BACKGROUND")))) {
                OgvKingPositionShareService ogvKingPositionShareService = this.f93216a;
                ogvKingPositionShareService.getClass();
                String itemId2 = iMenuItem.getItemId();
                if (itemId2 != null) {
                    int iHashCode2 = itemId2.hashCode();
                    if (iHashCode2 != -1364951698) {
                        if (iHashCode2 == 1825622809 && itemId2.equals("PLAY_BACKGROUND")) {
                            if (ogvKingPositionShareService.d() && ogvKingPositionShareService.f93202o.isAvailable()) {
                                iMenuItem.setTextColor(ContextCompat.getColor(ogvKingPositionShareService.f93190b, R$color.Pi5_u));
                            } else if (!ogvKingPositionShareService.d()) {
                                iMenuItem.setTextColor(ContextCompat.getColor(ogvKingPositionShareService.f93190b, 2131099808));
                            }
                        }
                    } else if (itemId2.equals("PLAY_MINISCREEN") && ogvKingPositionShareService.f93199l.d()) {
                        iMenuItem.setTextColor(ContextCompat.getColor(ogvKingPositionShareService.f93190b, 2131099808));
                    }
                }
            }
            return iMenuItem;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final String g(String str) {
            String str2;
            int iHashCode = str.hashCode();
            str2 = "3";
            OgvKingPositionShareService ogvKingPositionShareService = this.f93216a;
            switch (iHashCode) {
                case -1364951698:
                    if (str.equals("PLAY_MINISCREEN")) {
                        return ogvKingPositionShareService.f93199l.d() ? "2" : "1";
                    }
                    return "";
                case -58555412:
                    if (str.equals("VIDEO_DOWNLOAD")) {
                        return ogvKingPositionShareService.f93196i.b() ? "1" : "2";
                    }
                    return "";
                case 938428366:
                    if (!str.equals("PLAY_MODE")) {
                        return "";
                    }
                    int i7 = ogvKingPositionShareService.f93197j.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                    String str3 = "1";
                    if (ogvKingPositionShareService.f93211x.containsKey(Integer.valueOf(i7))) {
                        str3 = ogvKingPositionShareService.f93211x.get(Integer.valueOf(i7));
                        if (str3 == null) {
                            str3 = "1";
                        }
                    }
                    return str3;
                case 938564363:
                    if (!str.equals("PLAY_RATE")) {
                        return "";
                    }
                    float fA = ogvKingPositionShareService.h.f91108b.a();
                    String str4 = str2;
                    if (ogvKingPositionShareService.f93210w.containsKey(Float.valueOf(fA))) {
                        str4 = ogvKingPositionShareService.f93210w.get(Float.valueOf(fA));
                        if (str4 == null) {
                            str4 = str2;
                        }
                    }
                    return str4;
                case 1618981219:
                    if (!str.equals("FAN_LIKE")) {
                        return "";
                    }
                    long j7 = ogvKingPositionShareService.f93191c.f94449a;
                    com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                    com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
                    com.bilibili.community.follow.b bVar2 = bVar;
                    if (bVar == null) {
                        bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                    }
                    boolean zA = com.bilibili.ogv.pub.season.b.a(ogvKingPositionShareService.f93191c.f94450b);
                    boolean z6 = bVar2.a;
                    return (z6 && zA) ? "2" : (z6 || !zA) ? (z6 || zA) ? "4" : str2 : "1";
                case 1825622809:
                    if (str.equals("PLAY_BACKGROUND")) {
                        return ogvKingPositionShareService.d() ? ogvKingPositionShareService.f93202o.isAvailable() ? "2" : "1" : "3";
                    }
                    return "";
                default:
                    return "";
            }
        }

        public final void onShareSuccess() {
            OgvKingPositionShareService ogvKingPositionShareService = this.f93216a;
            ogvKingPositionShareService.f93193e.p();
            ogvKingPositionShareService.f93194f.a();
        }
    }

    @Inject
    public OgvKingPositionShareService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull OgvSeason ogvSeason, @NotNull j jVar, @NotNull com.bilibili.ship.theseus.united.page.autofloat.a aVar, @NotNull RelationRepository relationRepository, @NotNull C8487a c8487a, @NotNull C7893a c7893a, @NotNull h hVar, @NotNull OgvDownloadService ogvDownloadService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.b bVar, @NotNull n nVar, @NotNull BiliAccounts biliAccounts, @NotNull BackgroundPlayService backgroundPlayService, @NotNull d dVar, @NotNull OgvShareMenuChatService ogvShareMenuChatService, @NotNull IPlayDirector iPlayDirector, @NotNull yk.c cVar, @NotNull IControlContainerService iControlContainerService) {
        this.f93189a = coroutineScope;
        this.f93190b = context;
        this.f93191c = ogvSeason;
        this.f93192d = aVar;
        this.f93193e = relationRepository;
        this.f93194f = c8487a;
        this.f93195g = c7893a;
        this.h = hVar;
        this.f93196i = ogvDownloadService;
        this.f93197j = iPlayerSettingService;
        this.f93198k = ogvCurrentEpisodeRepository;
        this.f93199l = bVar;
        this.f93200m = nVar;
        this.f93201n = biliAccounts;
        this.f93202o = backgroundPlayService;
        this.f93203p = dVar;
        this.f93204q = ogvShareMenuChatService;
        this.f93205r = iPlayDirector;
        this.f93206s = cVar;
        this.f93207t = iControlContainerService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(BiliExtraBuilder.SHARE_FROM, "ogv_video_detail_action_normal_share");
        jVar.f103397a = jsonObject.toString();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static final void a(OgvKingPositionShareService ogvKingPositionShareService) {
        ogvKingPositionShareService.getClass();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(BiliExtraBuilder.SHARE_FROM, "ogv_video_detail_action_normal_share");
        IPlayerSettingService iPlayerSettingService = ogvKingPositionShareService.f93197j;
        boolean z6 = iPlayerSettingService.getCloudConfig().z();
        PlayDubbingInfo playDubbingInfoB = ogvKingPositionShareService.f93200m.b();
        JsonObject jsonObject2 = new JsonObject();
        OgvSeason ogvSeason = ogvKingPositionShareService.f93191c;
        jsonObject2.addProperty("season_type", String.valueOf(ogvSeason.f94450b.f71782a));
        jsonObject2.addProperty("season_id", String.valueOf(ogvSeason.f94449a));
        OgvEpisode ogvEpisodeC = ogvKingPositionShareService.f93198k.c();
        if (ogvEpisodeC != null) {
            jsonObject2.addProperty("epid", String.valueOf(ogvEpisodeC.f93555a));
        }
        jsonObject2.addProperty("dubbing_support", Boolean.valueOf(z6));
        jsonObject2.addProperty("background_audio", Boolean.valueOf(playDubbingInfoB != null));
        boolean z7 = false;
        if (playDubbingInfoB != null) {
            z7 = true;
        }
        jsonObject2.addProperty("role_audio_list", Boolean.valueOf(z7));
        i iVar = new i(94, (Integer) null, jsonObject.toString(), (String) null, (String) null, (String) null, (String) null, jsonObject2.toString());
        List list = t.f;
        if (!kntr.common.share.core.b.a()) {
            f fVarF = ogvKingPositionShareService.f93203p.f("pgc.pgc-video-detail.interaction.share.click", "new_ogv", iVar, ogvKingPositionShareService.f93188E);
            if (fVarF == null) {
                BLog.i("OgvKingPositionShareService-createSharePanel", "[theseus-ogv-OgvKingPositionShareService-createSharePanel] create share panel, geminiShare is null");
                return;
            } else {
                fVarF.d();
                ogvKingPositionShareService.f93209v = fVarF;
                return;
            }
        }
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(ogvKingPositionShareService.f93190b);
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return;
        }
        GeminiCommonPlayableParams currentPlayableParams = ogvKingPositionShareService.f93205r.getCurrentPlayableParams();
        GeminiCommonPlayableParams geminiCommonPlayableParams = currentPlayableParams instanceof GeminiCommonPlayableParams ? currentPlayableParams : null;
        if (geminiCommonPlayableParams == null) {
            return;
        }
        yk.c cVar = ogvKingPositionShareService.f93206s;
        String strP = cVar.p();
        String strP2 = cVar.P();
        String spmid = geminiCommonPlayableParams.getSpmid();
        String str = spmid;
        if (spmid == null) {
            str = "";
        }
        String jumpFrom = geminiCommonPlayableParams.getJumpFrom();
        String fromSpmid = geminiCommonPlayableParams.getFromSpmid();
        String string = jsonObject.toString();
        String string2 = jsonObject2.toString();
        List list2 = t.f;
        List listMutableListOf = CollectionsKt.mutableListOf(new String[]{"PLAY_RATE", "PLAY_SETTING", "VIDEO_DOWNLOAD", "WATCH_TOGETHER", "WATCH_TOGETHER_BETA", "FAN_LIKE", "SUGGESTION", "SWITCH_DUBBING"});
        if (iPlayerSettingService.getCloudConfig().K()) {
            listMutableListOf.add("PLAY_MODE");
        }
        List listPlus = CollectionsKt.plus(list2, listMutableListOf);
        e eVarC = cVar.C("new_ogv");
        SessionManager sessionManager = SessionManager.INSTANCE;
        sessionManager.generateSessionId();
        t tVar = new t(fragmentActivityFindFragmentActivityOrNull, new kntr.common.share.domain.model.h(new ShareParams("pgc.pgc-video-detail.interaction.share.click", strP, "new_ogv", strP2, new ShareParams.PageInfo(str, jumpFrom, fromSpmid, string2, string), listPlus), sessionManager.getSessionId()), eVarC);
        ogvKingPositionShareService.f93208u = tVar;
        t.d(tVar, new com.bilibili.ship.theseus.ogv.intro.kingposition.b(ogvKingPositionShareService, iVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService.b(com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService.c(com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.playerbizcommon.features.background.BackgroundPlayService r0 = r0.f93202o
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto L29
            r0 = r3
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f93197j
            Oi1.d r0 = r0.getCloudConfig()
            z50.a r0 = r0.a
            A50.a r0 = r0.getBackgroundPlayConf()
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r5
            r1 = 1
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r0 = 0
            r4 = r0
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.kingposition.OgvKingPositionShareService.d():boolean");
    }
}
