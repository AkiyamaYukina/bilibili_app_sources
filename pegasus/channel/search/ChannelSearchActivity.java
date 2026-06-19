package com.bilibili.pegasus.channel.search;

import On0.e;
import On0.o;
import On0.t;
import On0.z;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.room.ui.roomv3.player.LiveRoomPlayerViewModel;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.channel.search.ChannelSearchActivity;
import com.bilibili.pegasus.utils.AbstractC5763g;
import com.bilibili.pegasus.utils.AbstractC5764h;
import com.bilibili.pvtracker.PageViewTracker;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import po0.C8336a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchActivity.class */
@StabilityInferred(parameters = 0)
public final class ChannelSearchActivity extends BaseAppCompatActivity implements View.OnClickListener, PassportObserver {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f74905O = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SearchView f74906B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ListView f74907C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TintTextView f74908D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public o f74909E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public RecyclerView f74910F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public FrameLayout f74911G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LoadingImageView f74912H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public z f74913I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.channel.search.a f74914J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public String f74915K = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public String f74916L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final eg.a f74917M = new eg.a(105, "search-new-channel-result.0.0");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final e f74918N;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchActivity$a.class */
    public final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelSearchActivity f74919a;

        public a(ChannelSearchActivity channelSearchActivity) {
            this.f74919a = channelSearchActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
            ChannelSearchActivity channelSearchActivity;
            z zVar;
            z zVar2;
            int childCount = recyclerView.getChildCount();
            if (childCount <= 0 || (zVar = (channelSearchActivity = this.f74919a).f74913I) == null || !zVar.f17958d || zVar.f17959e) {
                return;
            }
            if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) < recyclerView.getAdapter().getItemCount() - 3 || (zVar2 = channelSearchActivity.f74913I) == null) {
                return;
            }
            zVar2.I0(channelSearchActivity.f74915K, false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchActivity$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74920a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f74920a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchActivity$c.class */
    public static final class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f74922b;

        public c(int i7, int i8) {
            this.f74921a = i7;
            this.f74922b = i8;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Drawable background;
            super.getItemOffsets(rect, view, recyclerView, state);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || layoutManager.getItemViewType(view) != 1001 || (background = view.getBackground()) == null) {
                return;
            }
            Rect rect2 = new Rect();
            background.getPadding(rect2);
            int i7 = rect2.left;
            int i8 = this.f74921a;
            rect.set(i8 - i7, (this.f74922b - rect2.top) - rect2.bottom, i8 - rect2.right, 0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ChannelSearchActivity$d.class */
    public static final class d extends AbstractC5763g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelSearchActivity f74923a;

        public d(ChannelSearchActivity channelSearchActivity) {
            this.f74923a = channelSearchActivity;
        }

        public final void b(Map<Long, gg.b> map) {
            o oVar = this.f74923a.f74909E;
            if (oVar != null) {
                DiffUtil.calculateDiff(new AbstractC5764h(oVar.f17919b, map)).dispatchUpdatesTo(oVar);
            }
        }

        @Override // com.bilibili.pegasus.utils.AbstractC5763g
        public final Context c() {
            return this.f74923a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [On0.e] */
    public ChannelSearchActivity() {
        final int i7 = 0;
        this.f74918N = new Observer(i7, this) { // from class: On0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LifecycleOwner f17904b;

            {
                this.f17903a = i7;
                this.f17904b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                com.bilibili.bililive.room.biz.player.a aVarC0;
                LiveRoomPlayerViewModel liveRoomPlayerViewModel = this.f17904b;
                switch (this.f17903a) {
                    case 0:
                        Resource resource = (Resource) obj;
                        int i8 = ChannelSearchActivity.f74905O;
                        Status status = resource.getStatus();
                        int i9 = status == null ? -1 : ChannelSearchActivity.b.f74920a[status.ordinal()];
                        ChannelSearchActivity channelSearchActivity = (ChannelSearchActivity) liveRoomPlayerViewModel;
                        if (i9 == 1) {
                            LoadingImageView loadingImageView = channelSearchActivity.f74912H;
                            LoadingImageView loadingImageView2 = loadingImageView;
                            if (loadingImageView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                                loadingImageView2 = null;
                            }
                            loadingImageView2.setRefreshComplete();
                            RelativeLayout relativeLayout = channelSearchActivity.f74912H;
                            if (relativeLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                                relativeLayout = null;
                            }
                            relativeLayout.setVisibility(8);
                            o oVar = channelSearchActivity.f74909E;
                            if (oVar != null) {
                                List<? extends C8336a<? extends Object>> list = (List) resource.getData();
                                List<? extends C8336a<? extends Object>> list2 = oVar.f17919b;
                                List<? extends C8336a<? extends Object>> listEmptyList = list;
                                if (list == null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                oVar.f17919b = listEmptyList;
                                DiffUtil.calculateDiff(new m(list2, oVar)).dispatchUpdatesTo(oVar);
                            }
                        } else if (i9 != 2) {
                            RelativeLayout relativeLayout2 = channelSearchActivity.f74912H;
                            RelativeLayout relativeLayout3 = relativeLayout2;
                            if (relativeLayout2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                                relativeLayout3 = null;
                            }
                            if (!relativeLayout3.isShown()) {
                                RelativeLayout relativeLayout4 = channelSearchActivity.f74912H;
                                RelativeLayout relativeLayout5 = relativeLayout4;
                                if (relativeLayout4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                                    relativeLayout5 = null;
                                }
                                relativeLayout5.setVisibility(0);
                            }
                            LoadingImageView loadingImageView3 = channelSearchActivity.f74912H;
                            LoadingImageView loadingImageView4 = loadingImageView3;
                            if (loadingImageView3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                                loadingImageView4 = null;
                            }
                            loadingImageView4.setImageResource(2131236934);
                            LoadingImageView loadingImageView5 = channelSearchActivity.f74912H;
                            if (loadingImageView5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
                                loadingImageView5 = null;
                            }
                            loadingImageView5.setRefreshError();
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (aVarC0 = liveRoomPlayerViewModel.C0()) != null) {
                            aVarC0.M(11, bool, false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final void P6(@NotNull String str) {
        o oVar = this.f74909E;
        if (oVar != null) {
            oVar.f17919b = CollectionsKt.emptyList();
            oVar.notifyDataSetChanged();
        }
        this.f74915K = str;
        RelativeLayout relativeLayout = this.f74912H;
        RelativeLayout relativeLayout2 = relativeLayout;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            relativeLayout2 = null;
        }
        relativeLayout2.setVisibility(0);
        LoadingImageView loadingImageView = this.f74912H;
        if (loadingImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingView");
            loadingImageView = null;
        }
        loadingImageView.setRefreshing();
        z zVar = this.f74913I;
        if (zVar != null) {
            zVar.I0(str, true);
        }
    }

    public final void Q6(boolean z6) {
        String strB = Op0.b.b("traffic.search-new-channel.0.0");
        String strB2 = Op0.b.b("traffic.search-new-channel-result.0.0");
        PageViewTracker.getInstance().onPageVisibleChange(strB, String.valueOf(hashCode()), 0, null, z6);
        PageViewTracker.getInstance().onPageVisibleChange(strB2, String.valueOf(hashCode()), 0, null, !z6);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void onChange(@Nullable Topic topic) {
        o oVar = this.f74909E;
        if (oVar != null) {
            oVar.f17919b = CollectionsKt.emptyList();
            oVar.notifyDataSetChanged();
        }
        z zVar = this.f74913I;
        if (zVar != null) {
            zVar.I0(this.f74915K, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131296364) {
            com.bilibili.pegasus.channel.search.a aVar = this.f74914J;
            if (aVar != null) {
                if (aVar.f74925b.getVisibility() == 0) {
                    aVar.d();
                }
                aVar.b();
            }
            onBackPressed();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        MutableLiveData<Resource<List<C8336a<? extends Object>>>> mutableLiveData;
        super.onCreate(bundle);
        setContentView(2131494523);
        this.f74906B = findViewById(2131310886);
        this.f74907C = (ListView) findViewById(2131312701);
        this.f74908D = (TintTextView) findViewById(2131296364);
        this.f74910F = (RecyclerView) findViewById(2131306580);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("query");
            String str = stringExtra;
            if (stringExtra == null) {
                str = "";
            }
            this.f74916L = str;
        }
        TintTextView tintTextView = this.f74908D;
        TintTextView tintTextView2 = tintTextView;
        if (tintTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionView");
            tintTextView2 = null;
        }
        tintTextView2.setOnClickListener(this);
        SearchView searchView = this.f74906B;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView = null;
        }
        ListView listView = this.f74907C;
        if (listView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("suggestionView");
            listView = null;
        }
        String str2 = this.f74916L;
        this.f74914J = new com.bilibili.pegasus.channel.search.a(searchView, listView, str2, StringsKt.isBlank(str2), this, this);
        int px = ListExtentionsKt.toPx(8.0f);
        int statusBarHeight = StatusBarCompat.getStatusBarHeight(this);
        int px2 = ListExtentionsKt.toPx(8.0f);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131310888);
        if (linearLayout != null) {
            linearLayout.setPadding(0, px2 + statusBarHeight, 0, px);
        }
        this.f74909E = new o(this);
        RecyclerView recyclerView = this.f74910F;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f74910F;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setAdapter(this.f74909E);
        RecyclerView recyclerView5 = this.f74910F;
        RecyclerView recyclerView6 = recyclerView5;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchRecyclerView");
            recyclerView6 = null;
        }
        recyclerView6.addOnScrollListener(new a(this));
        RecyclerView recyclerView7 = this.f74910F;
        RecyclerView recyclerView8 = recyclerView7;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchRecyclerView");
            recyclerView8 = null;
        }
        recyclerView8.addOnScrollListener(new RecyclerView.OnScrollListener());
        int px3 = ListExtentionsKt.toPx(16.0f);
        int px4 = ListExtentionsKt.toPx(12.0f);
        RecyclerView recyclerView9 = this.f74910F;
        RecyclerView recyclerView10 = recyclerView9;
        if (recyclerView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchRecyclerView");
            recyclerView10 = null;
        }
        recyclerView10.addItemDecoration(new c(px4, px3));
        FrameLayout frameLayout = (FrameLayout) findViewById(2131299392);
        this.f74911G = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentFrameLayout");
            frameLayout = null;
        }
        LoadingImageView loadingImageView = new LoadingImageView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = (int) TypedValue.applyDimension(1, 30.0f, frameLayout.getResources().getDisplayMetrics());
        loadingImageView.setLayoutParams(layoutParams);
        frameLayout.addView((View) loadingImageView, 0);
        this.f74912H = loadingImageView;
        if (this.f74913I == null) {
            this.f74913I = (z) new ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(getApplication())).get(z.class);
        }
        z zVar = this.f74913I;
        if (zVar != null && (mutableLiveData = zVar.f17956b) != null) {
            mutableLiveData.observe(this, this.f74918N);
        }
        Q6(true);
        BiliAccounts.get(this).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        this.f74917M.c(this, new d(this));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        com.bilibili.pegasus.channel.search.a aVar = this.f74914J;
        if (aVar != null && aVar.f74928e != null) {
            aVar.f74925b.setAdapter((ListAdapter) null);
            t tVar = aVar.f74928e;
            tVar.getClass();
            BLog.d("SuggestionsAdapter", "close()");
            tVar.b(null);
            tVar.f17943p = true;
        }
        BiliAccounts.get(this).unsubscribe(this, new Topic[]{Topic.SIGN_OUT, Topic.SIGN_IN});
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        com.bilibili.pegasus.channel.search.a aVar = this.f74914J;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBarPure(getWindow(), ThemeUtils.getThemeAttrColor(this, 2130968986));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!StringsKt.isBlank(this.f74916L)) {
            P6(this.f74916L);
        }
        this.f74916L = "";
    }
}
