package com.bilibili.search2.result.holder.chatgpt;

import G3.I0;
import G3.P0;
import G3.Q0;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager2.PageDialogManager;
import com.bilibili.base.ipc.IPCAppStateManager;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.fasthybrid.biz.debug.Z;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.holder.chatgpt.api.Disclaimers;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatGptItem;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6843f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder.class */
@StabilityInferred(parameters = 0)
public final class SearchChatGptHolder extends AbstractC6843f<SearchChatGptItem> implements Et0.a, Os0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static int f87921A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f87922q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public static final String f87923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public static final String f87924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public static final String f87925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f87926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f87927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f87928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f87929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f87930y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f87931z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bl.o f87932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.o f87933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.j f87934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f87935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f87936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public SearchChatResultItem f87937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87938g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f87939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f87940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f87941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final c f87942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final s f87943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f87944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f87945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f87946p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$a.class */
    public static final class a {
        public static final int a() {
            int i7;
            a aVar = SearchChatGptHolder.f87922q;
            try {
                String str = SearchChatGptHolder.f87923r;
                i7 = 150;
                if (str != null) {
                    i7 = Integer.parseInt(str);
                }
            } catch (NumberFormatException e7) {
                c(null, e7.toString());
                i7 = 150;
            }
            return i7;
        }

        public static void c(@Nullable Object obj, @NotNull String str) {
            BLog.e("SearchChatGptHolder", "[" + (obj != null ? Integer.valueOf(obj.hashCode()) : null) + "]:" + str);
        }

        public final long b() {
            long j7;
            try {
                String str = SearchChatGptHolder.f87924s;
                j7 = 60;
                if (str != null) {
                    j7 = Long.parseLong(str);
                }
            } catch (NumberFormatException e7) {
                c(null, e7.toString());
                j7 = 60;
            }
            return j7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$b.class */
    public static final class b implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchChatGptHolder f87947a;

        public b(SearchChatGptHolder searchChatGptHolder) {
            this.f87947a = searchChatGptHolder;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f87947a.s0(false);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SearchChatGptHolder$c.class */
    public static final class c extends IPCAppStateManager.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SearchChatGptHolder f87948b;

        public c(SearchChatGptHolder searchChatGptHolder) {
            this.f87948b = searchChatGptHolder;
        }

        public final void a() {
            ((SearchChatGptItem) this.f87948b.getData()).setTimeAbnormal(1);
        }

        public final void b() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder$a, java.lang.Object] */
    static {
        ConfigManager.Companion companion = ConfigManager.Companion;
        f87923r = (String) companion.config().get("search.search_gpt_rv_scroll_time", "150");
        f87924s = (String) companion.config().get("search.search_gpt_anim_step", "60");
        f87925t = (String) companion.config().get("search.search_gpt_retry_timeout", "30000");
        f87926u = ListExtentionsKt.lazyUnsafe(new I0(9));
        f87927v = ListExtentionsKt.lazyUnsafe(new P0(7));
        f87928w = ListExtentionsKt.lazyUnsafe(new Q0(10));
        f87929x = ListExtentionsKt.toPx(10);
        ListExtentionsKt.toPx(10);
        f87930y = ListExtentionsKt.toPx(10);
        f87931z = 8L;
        f87921A = 13;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.bilibili.search2.result.holder.chatgpt.s] */
    public SearchChatGptHolder(@NotNull Bl.o oVar) {
        super(oVar.a);
        this.f87932a = oVar;
        this.f87933b = ((com.bilibili.search2.result.t) com.bilibili.search2.result.t.f88516c.getValue()).f88518b;
        this.f87935d = "";
        this.f87942l = new c(this);
        TintTextView tintTextView = oVar.k;
        int i7 = f87930y;
        B.j(tintTextView, i7, i7, i7, i7);
        B.j(oVar.f, i7, i7, i7, i7);
        B.j(oVar.c, i7, i7, i7, i7);
        B.j(oVar.i, i7, i7, i7, i7);
        this.f87943m = new View.OnClickListener(this) { // from class: com.bilibili.search2.result.holder.chatgpt.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchChatGptHolder f88044a;

            {
                this.f88044a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Fragment fragment;
                LifecycleOwner viewLifecycleOwner;
                LifecycleCoroutineScope lifecycleScope;
                SearchChatGptHolder searchChatGptHolder = this.f88044a;
                searchChatGptHolder.B0();
                searchChatGptHolder.v0();
                searchChatGptHolder.x0("retry");
                searchChatGptHolder.z0(searchChatGptHolder.f87944n, true);
                String keyword = ((SearchChatGptItem) searchChatGptHolder.getData()).getKeyword();
                String sessionId = ((SearchChatGptItem) searchChatGptHolder.getData()).getSessionId();
                if (keyword == null || sessionId == null || (fragment = searchChatGptHolder.getFragment()) == null || (viewLifecycleOwner = fragment.getViewLifecycleOwner()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) == null) {
                    return;
                }
                lifecycleScope.launchWhenCreated(new SearchChatGptHolder$retryListener$1$1$1(searchChatGptHolder, keyword, sessionId, null));
            }
        };
        this.f87944n = 1;
        this.f87945o = 2;
        this.f87946p = 3;
    }

    public static void D0(Bl.p pVar, int i7, int i8, j jVar, List list, long j7) {
        Objects.toString(jVar);
        Objects.toString(list);
        pVar.c.setExactHeight(i7);
        if (i7 == i8) {
            ListExtentionsKt.visible(pVar.e);
            ListExtentionsKt.visible(pVar.d);
        } else if (i7 > i8) {
            ListExtentionsKt.visible(pVar.f);
        }
        jVar.f88018e = j7;
        if (list.isEmpty()) {
            return;
        }
        ((SearchChatResultItem.Bubble) list.get(0)).getAnimStartShow().setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q0(com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder r7, java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder.q0(com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r0(com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder.r0(com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u0(SearchChatGptHolder searchChatGptHolder) {
        int currentState = ((SearchChatGptItem) searchChatGptHolder.getData()).getCurrentState();
        searchChatGptHolder.getClass();
        boolean z6 = true;
        int i7 = currentState;
        if (currentState == 4) {
            i7 = 1;
        }
        BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
        Bl.o oVar = searchChatGptHolder.f87932a;
        ImageRequestBuilder imageRequestBuilderUrl = biliImageLoader.with(oVar.a.getContext()).url(((SearchChatGptItem) searchChatGptHolder.getData()).getLoadingIcon(MultipleThemeUtils.isNightTheme(searchChatGptHolder.itemView.getContext()), i7));
        if (i7 != 0) {
            z6 = false;
        }
        ImageRequestBuilder.enableAutoPlayAnimation$default(imageRequestBuilderUrl, z6, false, 2, (Object) null).placeholderImageResId(2131239136, ScaleType.FIT_XY).actualImageScaleType(ScaleType.CENTER_CROP).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null)).into(oVar.e);
    }

    public final void A0() {
        ((SearchChatGptItem) getData()).setCurrentState(4);
        Job job = this.f87936e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        z0(this.f87946p, true);
        v0();
    }

    public final void B0() {
        Job job = this.f87936e;
        if (job == null || !job.isActive()) {
            ((SearchChatGptItem) getData()).setCurrentState(0);
            Fragment fragment = getFragment();
            Job jobLaunchWhenCreated = null;
            if (fragment != null) {
                LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
                jobLaunchWhenCreated = null;
                if (viewLifecycleOwner != null) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
                    jobLaunchWhenCreated = null;
                    if (lifecycleScope != null) {
                        jobLaunchWhenCreated = lifecycleScope.launchWhenCreated(new SearchChatGptHolder$retryTimer$1(this, null));
                    }
                }
            }
            this.f87936e = jobLaunchWhenCreated;
        }
    }

    public final void C0() {
        FragmentActivity fragmentActivityP3;
        FragmentManager supportFragmentManager;
        Object obj;
        Disclaimers disclaimer = ((SearchChatGptItem) getData()).getDisclaimer();
        if (disclaimer != null) {
            int[] iArr = new int[2];
            this.f87932a.f.getLocationInWindow(iArr);
            PageDialogManager pageDialogManagerFind = PageDialogManager.Companion.find(getFragment());
            int i7 = iArr[0];
            int i8 = iArr[1];
            Z z6 = new Z(1, pageDialogManagerFind, this);
            DisclaimerDialogFragment disclaimerDialogFragment = new DisclaimerDialogFragment();
            Bundle bundleA = com.bilibili.biligame.router.k.a(i7, i8, "locationX", "locationY");
            bundleA.putParcelable("disclaimers", disclaimer);
            disclaimerDialogFragment.f87916d = z6;
            disclaimerDialogFragment.setArguments(bundleA);
            Fragment fragment = getFragment();
            if (fragment == null || (fragmentActivityP3 = fragment.p3()) == null || (supportFragmentManager = fragmentActivityP3.getSupportFragmentManager()) == null) {
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                if (pageDialogManagerFind != null) {
                    pageDialogManagerFind.block("DisclaimerDialogFragment");
                }
                disclaimerDialogFragment.show(supportFragmentManager, "disclaimer_dialog_tag");
                x0("disclaimer-expand");
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) == null || pageDialogManagerFind == null) {
                return;
            }
            pageDialogManagerFind.unlock("DisclaimerDialogFragment");
        }
    }

    public final void E0() {
        SearchChatResultItem searchChatResultItem = this.f87937f;
        if (searchChatResultItem != null) {
            Job job = this.f87936e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f87941k = false;
            this.f87932a.a.post(new EO0.c(1, this, searchChatResultItem));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x019d  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder.bind():void");
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        MutableLiveData<Boolean> mutableLiveData;
        Lifecycle lifecycle;
        super.bindFragment(fragment);
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new b(this));
        }
        if (fragment != null) {
            com.bilibili.search2.result.j jVar = (com.bilibili.search2.result.j) new ViewModelProvider(fragment).get(com.bilibili.search2.result.j.class);
            this.f87934c = jVar;
            if (jVar == null || (mutableLiveData = jVar.f88254a) == null) {
                return;
            }
            mutableLiveData.observe(fragment, new x(new Ki1.a(this, 4)));
        }
    }

    @Override // Os0.a
    public final void invisible() {
        this.f87940j = false;
    }

    @Override // Et0.a
    public final boolean isNeedDrawDivider() {
        return false;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (Intrinsics.areEqual(((SearchChatGptItem) getData()).getGoTo(), "chat_gpt")) {
            z0(this.f87944n, false);
        }
    }

    public final void s0(boolean z6) {
        String str = this.f87939i;
        if (str != null) {
            if (this.f87937f == null) {
                BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new SearchChatGptHolder$destroy$1$1(str, this, null), 2, (Object) null);
            }
            com.bilibili.search2.result.o oVar = this.f87933b;
            oVar.f88256b.remove(str);
            oVar.f88255a.remove(str);
            oVar.f88257c.remove(str);
        }
        IPCAppStateManager.getInstance().removeIPCActivityStateCallback(this.f87942l);
        if (z6) {
            Job job = this.f87936e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f87936e = null;
            this.f87937f = null;
            this.f87938g = false;
            this.h = false;
            this.f87939i = null;
            ((SearchChatGptItem) getData()).setTimeAbnormal(2);
            ((SearchChatGptItem) getData()).setWaitTimeout(false);
            Bl.o oVar2 = this.f87932a;
            oVar2.d.removeAllViews();
            ListExtentionsKt.visible(oVar2.a);
            ListExtentionsKt.gone(oVar2.h);
            ListExtentionsKt.gone(oVar2.c);
            ListExtentionsKt.gone(oVar2.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(Bl.o oVar, boolean z6) {
        RoundingParams roundingParamsFromCornersRadius = z6 ? RoundingParams.Companion.fromCornersRadius(ListExtentionsKt.toPx(8)) : RoundingParams.Companion.fromCornersRadii(ListExtentionsKt.toPx(8), ListExtentionsKt.toPx(8), 0.0f, 0.0f);
        String backgroundNight = MultipleThemeUtils.isNightTheme(this.itemView.getContext()) ? ((SearchChatGptItem) getData()).getBackgroundNight() : ((SearchChatGptItem) getData()).getBackgroundLight();
        if (backgroundNight != null) {
            BiliImageLoader.INSTANCE.with(oVar.a.getContext()).url(backgroundNight).placeholderImageResId(2131239137, ScaleType.FIT_XY).actualImageScaleType(ScaleType.CENTER_CROP).roundingParams(roundingParamsFromCornersRadius).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null)).into(oVar.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0() {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder.v0():void");
    }

    @Override // Os0.a
    public final void visible() {
        this.f87940j = true;
        E0();
    }

    public final void w0(String str) {
        com.bilibili.search2.result.o oVar = this.f87933b;
        if (!oVar.f88256b.containsKey(str)) {
            oVar.f88256b.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
        SearchChatResultItem searchChatResultItem = (SearchChatResultItem) ((LinkedHashMap) oVar.f88255a).get(str);
        this.f87937f = searchChatResultItem;
        if (searchChatResultItem != null || this.h) {
            y0(this.f87945o, 0L);
            return;
        }
        this.h = true;
        oVar.f88257c.put(str, new EN.b<>(2, str, this));
    }

    public final void x0(@Nullable String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gpt_sessionid", ((SearchChatGptItem) getData()).getSessionId());
        Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchChatGptItem) getData()).getLinkType(), (BaseSearchItem) getData(), null, null, Xs0.b.d((BaseSearchItem) getData(), str, null, 2), null, null, linkedHashMap, false, null, 7088);
    }

    public final void y0(int i7, Long l7) {
        if (((SearchChatGptItem) getData()).getWaitTimeout()) {
            return;
        }
        ((SearchChatGptItem) getData()).setExposed(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(i7));
        if (l7 != null) {
            linkedHashMap.put("loading_time", String.valueOf(l7.longValue()));
        }
        linkedHashMap.put("time_abnormal", String.valueOf(((SearchChatGptItem) getData()).getTimeAbnormal()));
        linkedHashMap.put("gpt_sessionid", ((SearchChatGptItem) getData()).getSessionId());
        String linkType = ((SearchChatGptItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "";
        }
        Xs0.b.k("community.public-community.chat-loading.0.show", str, (SearchChatGptItem) getData(), "search.search-result.0.0", linkedHashMap, false, null, null, null, 992);
    }

    public final void z0(int i7, boolean z6) {
        if (z6) {
            ((SearchChatGptItem) getData()).setExposed(false);
        }
        if (!((SearchChatGptItem) getData()).isExposed()) {
            SearchChatGptItem searchChatGptItem = (SearchChatGptItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z7 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z7 = true;
            }
            searchChatGptItem.setAtFirstScreen(z7);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, String.valueOf(i7));
        if (i7 != this.f87944n) {
            linkedHashMap.put("gpt_sessionid", ((SearchChatGptItem) getData()).getSessionId());
        }
        String linkType = ((SearchChatGptItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, (BaseSearchItem) getData(), null, linkedHashMap, false, null, null, null, 1000);
    }
}
