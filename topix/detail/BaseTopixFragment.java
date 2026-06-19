package com.bilibili.topix.detail;

import Bx0.h;
import Bx0.i;
import G.p;
import GO.m;
import ND0.f;
import Ob1.j;
import PD0.C2765g;
import SD0.k;
import UD0.o;
import UD0.s;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import bE0.C4941a;
import bE0.C4942b;
import cE0.C5230c;
import cE0.C5231d;
import cE0.InterfaceC5229b;
import com.alipay.sdk.app.PayTask;
import com.bapis.bilibili.broadcast.v1.RoomLeaveEvent;
import com.bapis.bilibili.broadcast.v1.RoomReq;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.app.comm.list.common.topix.TopixDynamicBubbleHideFor;
import com.bilibili.app.comm.list.common.utils.UriSafeKt;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.list.widget.statement.ErrorState;
import com.bilibili.app.comm.list.widget.statement.PlaceHolderState;
import com.bilibili.app.comm.list.widget.text.MessageString;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelWrapper;
import com.bilibili.bililive.room.ui.roomv3.player.container.y;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.fetcher.IInlineFetcher;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.card.z;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.topix.TopixType;
import com.bilibili.topix.detail.BaseTopixFragment;
import com.bilibili.topix.detail.TopixDetailViewModel;
import com.bilibili.topix.detail.X;
import com.bilibili.topix.detail.Y;
import com.bilibili.topix.detail.y;
import com.bilibili.topix.model.EventPageShowType;
import com.bilibili.topix.model.TopixDynamicOnline;
import com.bilibili.topix.model.TopixTimelineEvents;
import com.bilibili.topix.widget.BubbleDisplayCondition;
import com.bilibili.upper.module.contribute.up.goods.ManuscriptUpAddGoodsV2Activity;
import com.google.android.material.appbar.ChildScrollObserverBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseTopixFragment extends BaseFragment implements IPvTracker, InlinePage, Sh.c, PageAdapter.Page {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f112610G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C2765g f112613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public N f112614c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a0 f112617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112618g;

    @Nullable
    public ND0.f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View f112619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ExtendedFloatingActionButton f112620j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MG0.a f112626p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public y f112634x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public y f112615d = new y(TopixType.NORMAL);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f112616e = ListExtentionsKt.lazyUnsafe(new QY0.f(this, 9));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final f f112621k = new f(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f112622l = LazyKt.lazy(new GS0.b(this, 3));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f112623m = LazyKt.lazy(new GS0.c(this, 2));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f112624n = new h(this, 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final i f112625o = new i(this, 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.topix.detail.f f112627q = new com.bilibili.topix.detail.f(this, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.topix.detail.g f112628r = new com.bilibili.topix.detail.g(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final z f112629s = new z(this, 1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final h f112630t = new h(this, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.topix.detail.b f112631u = new com.bilibili.topix.detail.b(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.topix.detail.c f112632v = new com.bilibili.topix.detail.c(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.topix.detail.d f112633w = new com.bilibili.topix.detail.d(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final e f112635y = new e(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Bx0.a f112636z = new Bx0.a(this, 1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final c f112604A = new c(this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Rect f112605B = new Rect();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Rect f112606C = new Rect();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Rect f112607D = new Rect();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final XD0.d f112608E = new XD0.d(this, new g(this));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f112609F = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f112611H = LazyKt.lazy(new XR0.b(this, 5));

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final Lazy f112612I = LazyKt.lazy(new XR0.c(this, 3));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewModelProvider.Factory f112637a;

        public a(@NotNull ViewModelProvider.Factory factory) {
            this.f112637a = factory;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
            return cls.isAssignableFrom(com.bilibili.app.comm.list.common.topix.d.class) ? new TopixDetailViewModel() : (T) this.f112637a.create(cls);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f112638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f112639b;

        static {
            int[] iArr = new int[EventPageShowType.values().length];
            try {
                iArr[EventPageShowType.EVENT_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EventPageShowType.WEB_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[EventPageShowType.EVENT_BOTTOM_SHEET.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[EventPageShowType.WEB_BOTTOM_SHEET.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f112638a = iArr;
            int[] iArr2 = new int[TopixDynamicBubbleHideFor.values().length];
            try {
                iArr2[TopixDynamicBubbleHideFor.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[TopixDynamicBubbleHideFor.SLIDE_UP.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            f112639b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$c.class */
    public static final class c implements ChildScrollObserverBehavior.ChildScrollObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseTopixFragment f112640a;

        public c(BaseTopixFragment baseTopixFragment) {
            this.f112640a = baseTopixFragment;
        }

        public final void offsetChange(int i7, SparseArray<Integer> sparseArray) {
            BaseTopixFragment baseTopixFragment = this.f112640a;
            ND0.f fVar = baseTopixFragment.h;
            if (fVar != null) {
                fVar.c(i7, baseTopixFragment.f112618g);
            }
            if (baseTopixFragment.vf() == 3) {
                C5231d.a(BubbleDisplayCondition.ScrolledToScreenPercent, ((double) i7) >= ((double) baseTopixFragment.f112618g) * 0.75d, baseTopixFragment.qf());
            }
        }

        public final void offsetChangeIdle() {
            this.f112640a.lf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$d.class */
    public static final class d implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseTopixFragment f112641a;

        public d(BaseTopixFragment baseTopixFragment) {
            this.f112641a = baseTopixFragment;
        }

        public final void onTabReselected(TabLayout.Tab tab) {
        }

        public final void onTabSelected(TabLayout.Tab tab) {
            if (tab == null) {
                return;
            }
            this.f112641a.Cf(tab.getPosition());
        }

        public final void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$e.class */
    public static final class e implements TD0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseTopixFragment f112642a;

        public e(BaseTopixFragment baseTopixFragment) {
            this.f112642a = baseTopixFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:116:0x0377  */
        @Override // TD0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            /*
                Method dump skipped, instruction units count: 1058
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.detail.BaseTopixFragment.e.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.Map):void");
        }

        @Override // TD0.b
        public final void b(RecyclerView.ViewHolder viewHolder, Map<String, String> map) {
            Object tag;
            X.a aVarFf;
            X.a aVarFf2;
            X.a aVarFf3;
            String str;
            X.a aVarFf4;
            X.a aVarFf5;
            boolean z6 = viewHolder instanceof UD0.h;
            BaseTopixFragment baseTopixFragment = this.f112642a;
            if (z6) {
                Object tag2 = viewHolder.itemView.getTag();
                if (tag2 != null) {
                    Object obj = null;
                    if (tag2 instanceof bE0.h) {
                        obj = tag2;
                    }
                    bE0.h hVar = (bE0.h) obj;
                    if (hVar == null || (aVarFf5 = baseTopixFragment.Ff()) == null) {
                        return;
                    }
                    aVarFf5.c("function", "function-card");
                    aVarFf5.c.putAll(MapsKt.mapOf(new Pair[]{TuplesKt.to("card_entity_id", String.valueOf(hVar.f54516b)), TuplesKt.to("card_entity_name", hVar.f54517c), TuplesKt.to("card_entity", "game")}));
                    aVarFf5.d();
                    return;
                }
                return;
            }
            if (viewHolder instanceof s) {
                if (map == null || (str = map.get("area")) == null || (aVarFf4 = baseTopixFragment.Ff()) == null) {
                    return;
                }
                aVarFf4.c("timeline", str);
                String str2 = map.get("entity_id");
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                Pair pair = TuplesKt.to("entity_id", str3);
                Pair pair2 = TuplesKt.to("entity", str);
                String str4 = map.get("position");
                if (str4 == null) {
                    str4 = "";
                }
                MapsKt.putAll(aVarFf4.c, new Pair[]{pair, pair2, TuplesKt.to("position", str4)});
                aVarFf4.d();
                return;
            }
            if (viewHolder instanceof UD0.c) {
                Object tag3 = viewHolder.itemView.getTag();
                if (tag3 != null) {
                    Object obj2 = null;
                    if (tag3 instanceof C4941a) {
                        obj2 = tag3;
                    }
                    C4941a c4941a = (C4941a) obj2;
                    if (c4941a == null || (aVarFf3 = baseTopixFragment.Ff()) == null) {
                        return;
                    }
                    aVarFf3.b();
                    aVarFf3.c("function", "function-card");
                    aVarFf3.c.putAll(MapsKt.mapOf(TuplesKt.to("entity_name", c4941a.f54481b)));
                    aVarFf3.d();
                    return;
                }
                return;
            }
            if (viewHolder instanceof UD0.f) {
                X.a aVarFf6 = baseTopixFragment.Ff();
                if (aVarFf6 != null) {
                    aVarFf6.b();
                    aVarFf6.c("activity-list", "activity-card");
                    if (map == null) {
                        return;
                    }
                    aVarFf6.c.putAll(map);
                    aVarFf6.d();
                    return;
                }
                return;
            }
            if (viewHolder instanceof o) {
                X.a aVarFf7 = baseTopixFragment.Ff();
                if (aVarFf7 != null) {
                    aVarFf7.c("head-info", "inline-card");
                    if (map == null) {
                        return;
                    }
                    aVarFf7.c.putAll(map);
                    aVarFf7.d();
                    return;
                }
                return;
            }
            if (viewHolder instanceof RD0.e) {
                Object tag4 = viewHolder.itemView.getTag();
                if (tag4 != null) {
                    Object obj3 = null;
                    if (tag4 instanceof RD0.a) {
                        obj3 = tag4;
                    }
                    RD0.a aVar = (RD0.a) obj3;
                    if (aVar == null || (aVarFf2 = baseTopixFragment.Ff()) == null) {
                        return;
                    }
                    aVarFf2.c("head-subscribe", "0");
                    aVarFf2.c.putAll(MapsKt.mapOf(TuplesKt.to("card_entity_id", String.valueOf(aVar.f20703a))));
                    aVarFf2.d();
                    return;
                }
                return;
            }
            if (!(viewHolder instanceof k)) {
                if (!(viewHolder instanceof QD0.k) || (tag = viewHolder.itemView.getTag()) == null) {
                    return;
                }
                Object obj4 = null;
                if (tag instanceof QD0.e) {
                    obj4 = tag;
                }
                QD0.e eVar = (QD0.e) obj4;
                if (eVar == null || (aVarFf = baseTopixFragment.Ff()) == null) {
                    return;
                }
                aVarFf.b();
                aVarFf.c("head-info", "commerce-pic");
                aVarFf.c.putAll(MapsKt.mapOf(new Pair[]{TuplesKt.to("jump_url", CollectionsKt.p(eVar.f19796c, (CharSequence) null, (CharSequence) null, (CharSequence) null, new Hf1.h(1), 31)), TuplesKt.to("pic_url", CollectionsKt.p(eVar.f19796c, (CharSequence) null, (CharSequence) null, (CharSequence) null, new j(1), 31))}));
                aVarFf.d();
                return;
            }
            Object tag5 = viewHolder.itemView.getTag();
            if (tag5 != null) {
                Object obj5 = null;
                if (tag5 instanceof SD0.f) {
                    obj5 = tag5;
                }
                SD0.f fVar = (SD0.f) obj5;
                if (fVar == null) {
                    return;
                }
                o oVar = new o(baseTopixFragment, 0, fVar, fVar.f22824d);
                SD0.c cVar = fVar.f22823c;
                if (cVar != null) {
                    oVar.invoke(cVar);
                }
                Iterator<T> it = fVar.f22822b.iterator();
                while (it.hasNext()) {
                    oVar.invoke((SD0.c) it.next());
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$f.class */
    public static final class f implements InterfaceC5229b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseTopixFragment f112643a;

        public f(BaseTopixFragment baseTopixFragment) {
            this.f112643a = baseTopixFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // cE0.InterfaceC5229b
        public final void a() {
            TopixDetailViewModel topixDetailViewModelXf = this.f112643a.xf();
            if (topixDetailViewModelXf.o != null) {
                return;
            }
            bE0.j jVar = (bE0.j) topixDetailViewModelXf.g.getValue();
            topixDetailViewModelXf.o = BuildersKt.launch$default(ViewModelKt.getViewModelScope(topixDetailViewModelXf), (CoroutineContext) null, (CoroutineStart) null, new TopixDetailViewModel.startQueryDynamicPubEventsIfCould.1((jVar != null ? jVar.f54551Z : 10000L) - PayTask.f60018j, topixDetailViewModelXf, (Continuation) null), 3, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$g.class */
    public static final class g implements IInlineFetcher.IViewChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseTopixFragment f112644a;

        public g(BaseTopixFragment baseTopixFragment) {
            this.f112644a = baseTopixFragment;
        }

        public final boolean isViewVisible(View view) {
            boolean z6 = false;
            if (view == null) {
                return false;
            }
            BaseTopixFragment baseTopixFragment = this.f112644a;
            view.getGlobalVisibleRect(baseTopixFragment.f112606C);
            View view2 = baseTopixFragment.f112619i;
            if (view2 != null) {
                view2.getGlobalVisibleRect(baseTopixFragment.f112607D);
            }
            N n7 = baseTopixFragment.f112614c;
            if (n7 == null) {
                return false;
            }
            n7.i(baseTopixFragment.f112606C, baseTopixFragment.f112607D, baseTopixFragment.f112605B);
            if (baseTopixFragment.f112605B.height() >= ((double) view.getHeight()) * 0.5d) {
                z6 = true;
            }
            return z6;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.topix.detail.BaseTopixFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BaseTopixFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.topix.detail.BaseTopixFragment$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseTopixFragment f112645a;

            public a(BaseTopixFragment baseTopixFragment) {
                this.f112645a = baseTopixFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
                }
                Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                this.f112645a.yf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseTopixFragment baseTopixFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseTopixFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = this.this$0.xf().y;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.topix.detail.BaseTopixFragment$onViewCreated$16, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$onViewCreated$16.class */
    public static final class AnonymousClass16 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final BaseTopixFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.topix.detail.BaseTopixFragment$onViewCreated$16$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$onViewCreated$16$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseTopixFragment f112646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CoroutineScope f112647b;

            public a(BaseTopixFragment baseTopixFragment, CoroutineScope coroutineScope) {
                this.f112646a = baseTopixFragment;
                this.f112647b = coroutineScope;
            }

            public final Object emit(Object obj, Continuation continuation) {
                List<TopixTimelineEvents> list;
                bE0.i iVar = (bE0.i) obj;
                if (iVar != null && (list = iVar.f54525d) != null && (!list.isEmpty())) {
                    BaseTopixFragment baseTopixFragment = this.f112646a;
                    TopixDetailViewModel topixDetailViewModelXf = baseTopixFragment.xf();
                    boolean z6 = topixDetailViewModelXf.w;
                    topixDetailViewModelXf.w = false;
                    if (z6) {
                        BaseTopixFragment.kf(baseTopixFragment, iVar, String.valueOf(iVar.f54522a));
                    }
                }
                CoroutineScopeKt.cancel$default(this.f112647b, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(BaseTopixFragment baseTopixFragment, Continuation<? super AnonymousClass16> continuation) {
            super(2, continuation);
            this.this$0 = baseTopixFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass16 anonymousClass16 = new AnonymousClass16(this.this$0, continuation);
            anonymousClass16.L$0 = obj;
            return anonymousClass16;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowA = FlowLiveDataConversions.a(this.this$0.xf().g);
                a aVar = new a(this.this$0, coroutineScope);
                this.label = 1;
                Object objCollect = flowA.collect(new BaseTopixFragment$onViewCreated$16$invokeSuspend$$inlined$map$1$2(aVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r1v10, types: [MG0.a] */
    public BaseTopixFragment() {
        final int i7 = 1;
        this.f112626p = new View.OnClickListener(this, i7) { // from class: MG0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f16057a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f16058b;

            {
                this.f16057a = i7;
                this.f16058b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f16057a) {
                    case 0:
                        ManuscriptUpAddGoodsV2Activity.b7((ManuscriptUpAddGoodsV2Activity) this.f16058b);
                        break;
                    default:
                        BaseTopixFragment baseTopixFragment = (BaseTopixFragment) this.f16058b;
                        baseTopixFragment.yf(TuplesKt.to("action", "share"));
                        Y y6 = (Y) baseTopixFragment.f112623m.getValue();
                        bE0.j jVar = y6.b;
                        if (jVar != null) {
                            SharePanelWrapper.Companion.with(y6.a).shareOnlineParams(ListShareHelper.getShareOnlineParams$default(ListShareHelper.INSTANCE, "dt.topic-detail.head-info.topic-info.click", "share_button", String.valueOf(Long.valueOf(jVar.f54552a)), (String) null, false, false, 3, (Integer) null, 0, (String) null, (String) null, false, false, (String) null, 8120, (Object) null)).shareCallback(y6.d).shareContentProvider(y6.c).show();
                        } else {
                            BLog.e("TopixShare", "no topic data");
                        }
                        break;
                }
            }
        };
    }

    public static void Gf(BaseTopixFragment baseTopixFragment, PlaceHolderState.LoadingHolder loadingHolder, ErrorState.Empty empty, int i7) {
        if ((i7 & 1) != 0) {
            loadingHolder = PlaceHolderState.ErrorHolder.INSTANCE;
        }
        if ((i7 & 2) != 0) {
            empty = new ErrorState.OtherError(0, (MessageString) null, (MessageString) null, (MessageString) null, false, 31, (DefaultConstructorMarker) null);
        }
        C2765g c2765g = baseTopixFragment.f112613b;
        if (c2765g != null) {
            c2765g.f18736d.setVisibility(0);
            c2765g.h.setVisibility(8);
            ComposeView composeView = c2765g.f18737e;
            ListExtentionsKt.visible(composeView);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1740603620, true, new k(loadingHolder, empty)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void jf(com.bilibili.topix.detail.BaseTopixFragment r7, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8, ND0.g r9, ND0.e r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.detail.BaseTopixFragment.jf(com.bilibili.topix.detail.BaseTopixFragment, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, ND0.g, ND0.e, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [GO.m, java.lang.Object] */
    public static final void kf(BaseTopixFragment baseTopixFragment, bE0.i iVar, String str) {
        BottomSheetDialogFragment bottomSheetDialogFragmentA;
        X.a aVarFf = baseTopixFragment.Ff();
        if (aVarFf != null) {
            aVarFf.c("timeline", "more");
            MapsKt.putAll(aVarFf.c, new Pair[]{TuplesKt.to("entity_id", str), TuplesKt.to("entity", "timeline")});
            aVarFf.a();
        }
        Context context = baseTopixFragment.getContext();
        if (context != null) {
            ?? obj = new Object();
            long j7 = baseTopixFragment.xf().a;
            String str2 = X.b.a[baseTopixFragment.f112615d.a.ordinal()] == 1 ? "story" : "newtopic";
            long j8 = baseTopixFragment.xf().a;
            String str3 = iVar.f54523b;
            String string = (str3 == null || StringsKt.isBlank(str3)) ? baseTopixFragment.getResources().getString(2131854553) : iVar.f54523b;
            StringBuilder sbA = n.a(j7, "bilibili://following/new_topic_detail/timeline_dialog?topic_id=", "&page_entity=", str2);
            J1.z.a(j8, "&page_entity_id=", "&title=", sbA);
            sbA.append(string);
            ((m) obj).a = sbA.toString();
            bottomSheetDialogFragmentA = obj.a(context);
        } else {
            bottomSheetDialogFragmentA = null;
        }
        if (bottomSheetDialogFragmentA != null) {
            bottomSheetDialogFragmentA.show(baseTopixFragment.getChildFragmentManager(), "topic_timeline_sheet");
        }
    }

    public void Af(float f7, int i7) {
    }

    @Nullable
    public N Bf(@NotNull bE0.j jVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Cf(int i7) {
        C4942b c4942b;
        C4942b next;
        bE0.j jVar = (bE0.j) xf().g.getValue();
        long j7 = jVar != null ? jVar.f54573t : 0L;
        bE0.j jVarWf = wf();
        if (jVarWf == null || (c4942b = (C4942b) CollectionsKt.getOrNull(jVarWf.f54572s, i7)) == null) {
            return;
        }
        BubbleDisplayCondition bubbleDisplayCondition = BubbleDisplayCondition.OnTimeTab;
        long j8 = c4942b.f54487a;
        C5231d.a(bubbleDisplayCondition, j8 == 3, qf());
        TopixDetailViewModel topixDetailViewModelXf = xf();
        bE0.j jVar2 = (bE0.j) topixDetailViewModelXf.g.getValue();
        if (jVar2 != null) {
            jVar2.f54573t = j8;
        }
        if (topixDetailViewModelXf.O0(j8).getValue() == 0 || !topixDetailViewModelXf.z.a(j8).f) {
            topixDetailViewModelXf.c1(j8, true, false);
        }
        a0 a0Var = this.f112617f;
        if (a0Var != null) {
            a0Var.b(j8);
        }
        X.a aVarFf = Ff();
        if (aVarFf != null) {
            aVarFf.b();
            aVarFf.c("dt-feed", "feed-order");
            Pair pair = TuplesKt.to("action_text", c4942b.f54488b);
            Iterator<C4942b> it = jVarWf.f54572s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next.f54487a == j7) {
                        break;
                    }
                }
            }
            C4942b c4942b2 = next;
            String str = null;
            if (c4942b2 != null) {
                str = c4942b2.f54488b;
            }
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            MapsKt.putAll(aVarFf.c, new Pair[]{pair, TuplesKt.to("last_sort_text", str2), TuplesKt.to("action", "order")});
            aVarFf.a();
        }
    }

    public int Df() {
        return StatusBarCompat.getStatusBarHeight(requireContext());
    }

    public final void Ef(boolean z6) {
        pf().stopPlay();
        xf().c1(vf(), true, z6);
    }

    @Nullable
    public final X.a Ff() {
        X.a aVar;
        bE0.j jVarWf = wf();
        if (jVarWf != null) {
            Map<String, String> mapSf = sf(getArguments());
            X.a aVar2 = new X.a(jVarWf);
            aVar = aVar2;
            if (mapSf != null) {
                aVar2.c.putAll(mapSf);
                aVar = aVar2;
            }
        } else {
            aVar = null;
        }
        return aVar;
    }

    public void Hf(@NotNull Pair<Boolean, TopixDynamicOnline> pair) {
        TintTextView tintTextViewE;
        N n7 = this.f112614c;
        if (n7 == null || (tintTextViewE = n7.e()) == null) {
            return;
        }
        tintTextViewE.setVisibility(((Boolean) pair.getFirst()).booleanValue() ? 0 : 8);
        TopixDynamicOnline topixDynamicOnline = (TopixDynamicOnline) pair.getSecond();
        String onlineText = topixDynamicOnline != null ? topixDynamicOnline.getOnlineText() : null;
        if (onlineText != null && !StringsKt.isBlank(onlineText)) {
            tintTextViewE.setText(onlineText);
        }
        tintTextViewE.getVisibility();
    }

    public final void Wd() {
        BLog.i("BaseTopixFragment", "shouldPlayInline");
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            IInlineControl.startAutoPlay$default(pf(), false, 1, (Object) null);
        }
    }

    public final boolean canScrollUp() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return new a(super.getDefaultViewModelProviderFactory());
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public final IInlineControl getInlineControl() {
        return pf();
    }

    public final boolean getPageSwitchState() {
        return ((Sh.b) this.f112611H.getValue()).getPageSwitchState();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public String getPvEventId() {
        return p.a(X.a(this.f112615d, "0", "0"), ".pv");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        String strTakeIfNotBlank;
        Set<Map.Entry<String, String>> setEntrySet;
        Bundle bundle = new Bundle();
        bundle.putString("page_entity", X.b.a[this.f112615d.a.ordinal()] == 1 ? "story" : "newtopic");
        bundle.putString("page_entity_id", String.valueOf(xf().a));
        bundle.putString("is_homepage", xf().T0());
        Map<String, String> mapSf = sf(getArguments());
        if (mapSf != null && (setEntrySet = mapSf.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!StringsKt.isBlank((CharSequence) entry.getKey()) && !StringsKt.isBlank((CharSequence) entry.getValue())) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (xf().B.a == TopixType.STORY && (strTakeIfNotBlank = ListExtentionsKt.takeIfNotBlank(xf().c)) != null) {
            bundle.putString("from_avid", strTakeIfNotBlank);
        }
        return bundle;
    }

    public final void i8() {
        BLog.i("BaseTopixFragment", "shouldPlayInline");
        pf().stopPlay();
    }

    public final void lf() {
        bE0.j jVarWf = wf();
        boolean z6 = true;
        if (jVarWf != null && jVarWf.f54534I) {
            XD0.d dVar = this.f112608E;
            if (dVar.f28046c != null) {
                boolean z7 = dVar.fetchPlayableCard(null).size() > 0;
                if (z7) {
                    IInlineControl.startAutoPlay$default(pf(), false, 1, (Object) null);
                } else if (this.f112605B.height() <= 0) {
                    pf().stopPlay();
                } else {
                    pf().pausePlay();
                }
                MutableLiveData mutableLiveData = xf().i;
                if (z7 || (this.f112615d instanceof y.b)) {
                    z6 = false;
                }
                mutableLiveData.setValue(Boolean.valueOf(z6));
                return;
            }
        }
        xf().i.setValue(Boolean.valueOf(true ^ (this.f112615d instanceof y.b)));
    }

    public void mf(@NotNull bE0.j jVar) {
        TabLayout tabLayoutG;
        N n7 = this.f112614c;
        if (n7 != null) {
            n7.f(jVar);
        }
        N n8 = this.f112614c;
        if (n8 == null || (tabLayoutG = n8.g()) == null) {
            return;
        }
        tabLayoutG.clearOnTabSelectedListeners();
        tabLayoutG.removeAllTabs();
        for (C4942b c4942b : jVar.f54572s) {
            TintTextView tintTextView = new TintTextView(tabLayoutG.getContext());
            tintTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(ListExtentionsKt.toPx(50), ListExtentionsKt.toPx(24)));
            tintTextView.setTextColor(ResourcesCompat.getColorStateList(tintTextView.getResources(), 2131104035, null));
            tintTextView.setTextSize(13.0f);
            tintTextView.setGravity(17);
            tintTextView.setText(c4942b.f54488b);
            TabLayout.Tab customView = tabLayoutG.newTab().setCustomView(tintTextView);
            tabLayoutG.addTab(customView);
            if (jVar.f54573t == c4942b.f54487a) {
                customView.select();
                tabLayoutG.setScrollPosition(customView.getPosition(), 0.0f, false);
            }
        }
        tabLayoutG.addOnTabSelectedListener(new d(this));
    }

    @Nullable
    public ExtendedFloatingActionButton nf(@Nullable ND0.f fVar) {
        ViewGroup viewGroup;
        C2765g c2765g = this.f112613b;
        if (c2765g == null || (viewGroup = c2765g.h) == null) {
            return null;
        }
        View view = (ExtendedFloatingActionButton) viewGroup.findViewById(2131301733);
        if (view != null) {
            viewGroup.removeView(view);
        }
        if (fVar == null) {
            return null;
        }
        ExtendedFloatingActionButton extendedFloatingActionButtonFindViewById = (fVar instanceof f.g ? LayoutInflater.from(requireContext()).inflate(2131500581, viewGroup, true) : LayoutInflater.from(requireContext()).inflate(2131500582, viewGroup, true)).findViewById(2131301733);
        this.f112620j = extendedFloatingActionButtonFindViewById;
        return extendedFloatingActionButtonFindViewById;
    }

    @Nullable
    public List<TD0.c> of(@NotNull List<? extends TD0.c> list) {
        return CollectionsKt.toMutableList(list);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        TopixType topixType = Intrinsics.areEqual(arguments != null ? arguments.getString("page_from") : null, "story") ? TopixType.STORY : TopixType.NORMAL;
        Bundle arguments2 = getArguments();
        String str = null;
        if (arguments2 != null) {
            String string = arguments2.getString(RouteConstKt.BLROUTER_PUREURL);
            str = null;
            if (string != null) {
                str = (String) CollectionsKt.getOrNull(UriSafeKt.safetyPathSegments(Uri.parse(string)), 1);
            }
        }
        this.f112615d = Intrinsics.areEqual(str, "live") ? new y(topixType) : new y(topixType);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2765g c2765gInflate = C2765g.inflate(layoutInflater);
        this.f112613b = c2765gInflate;
        return c2765gInflate.f18733a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ND0.f fVar = this.h;
        if (fVar != null) {
            fVar.f17006i.removeCallbacksAndMessages(null);
        }
        BiliAccounts.get(requireContext()).unsubscribe(Topic.SIGN_IN, this.f112631u);
        TopixDetailViewModel topixDetailViewModelXf = xf();
        Job job = topixDetailViewModelXf.o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        topixDetailViewModelXf.o = null;
        I i7 = (I) topixDetailViewModelXf.l.getValue();
        MossResponseHandler<RoomReq> mossResponseHandler = i7.f112657d;
        if (mossResponseHandler == null) {
            return;
        }
        mossResponseHandler.onNext(RoomReq.newBuilder().setId("topicdetail://" + i7.f112654a).setLeave(RoomLeaveEvent.getDefaultInstance()).build());
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f112613b = null;
        this.f112617f = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        pf().stopPlay();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Intrinsics.areEqual(xf().j.getValue(), Boolean.TRUE)) {
            return;
        }
        IInlineControl.startAutoPlay$default(pf(), false, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01a0  */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.detail.BaseTopixFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final XD0.b pf() {
        return (XD0.b) this.f112612I.getValue();
    }

    public final C5230c qf() {
        return (C5230c) this.f112622l.getValue();
    }

    @Nullable
    public Float rf() {
        return null;
    }

    @Nullable
    public Map<String, String> sf(@Nullable Bundle bundle) {
        return null;
    }

    public final eQ.a tf() {
        a0 a0Var = this.f112617f;
        eQ.a aVar = null;
        if (a0Var != null) {
            Fragment fragmentA = a0Var.a(3L);
            aVar = null;
            if (fragmentA != null) {
                Fragment fragment = null;
                if (fragmentA instanceof eQ.a) {
                    fragment = fragmentA;
                }
                aVar = (eQ.a) fragment;
            }
        }
        return aVar;
    }

    public int uf() {
        TabLayout tabLayoutG;
        N n7 = this.f112614c;
        return (n7 == null || (tabLayoutG = n7.g()) == null) ? -1 : tabLayoutG.getSelectedTabPosition();
    }

    public final long vf() {
        long j7;
        bE0.j jVarWf = wf();
        if (jVarWf != null) {
            C4942b c4942b = (C4942b) CollectionsKt.getOrNull(jVarWf.f54572s, uf());
            j7 = c4942b != null ? c4942b.f54487a : jVarWf.f54573t;
        } else {
            j7 = 0;
        }
        return j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final bE0.j wf() {
        return (bE0.j) xf().g.getValue();
    }

    @NotNull
    public final TopixDetailViewModel xf() {
        return (TopixDetailViewModel) this.f112616e.getValue();
    }

    public final void yf(@NotNull Pair<String, String>... pairArr) {
        X.a aVarFf = Ff();
        if (aVarFf != null) {
            aVarFf.b();
            aVarFf.c("head-info", "topic-info");
            MapsKt.putAll(aVarFf.c, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            aVarFf.a();
        }
    }

    public final boolean zf() {
        bE0.j jVarWf = wf();
        ArrayList<C4942b> arrayList = jVarWf != null ? jVarWf.f54572s : null;
        return arrayList == null || arrayList.isEmpty() || vf() == 3;
    }
}
