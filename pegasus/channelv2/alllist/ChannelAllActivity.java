package com.bilibili.pegasus.channelv2.alllist;

import Gd.m;
import I3.F0;
import I3.G0;
import Qn0.i;
import Rn0.c;
import Vn0.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.biligame.ui.homecontainer.v2.HomeContainerFragmentV2;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.room.biz.shopping.beans.LiveGoodsCardDetail;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingRecommendCardGoodsDetail;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingReserveCalendarInfo;
import com.bilibili.bililive.room.biz.shopping.service.LiveRoomShoppingBusinessService;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.M0;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.P0;
import com.bilibili.bus.Violet;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pegasus.api.model.ChannelCategoryItem;
import com.bilibili.pegasus.channelv2.alllist.ChannelAllActivity;
import com.bilibili.pegasus.channelv2.alllist.ChannelAllListFragment;
import com.bilibili.pegasus.channelv2.alllist.subscribe.ChannelSubscribeFragment;
import com.bilibili.pegasus.channelv2.api.ChannelV2ApiService;
import com.bilibili.pegasus.utils.AbstractC5763g;
import com.bilibili.pvtracker.IPvTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro0.p;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllActivity.class */
@StabilityInferred(parameters = 0)
public final class ChannelAllActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f74932X = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public FrameLayout f74933D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public View f74934E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public BiliImageView f74935F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public TextView f74936G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TextView f74937H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public View f74938I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public RecyclerView f74939J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public c f74940K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public Vn0.c f74941L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public f f74942M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public String f74946Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public Fragment f74947R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public List<? extends ChannelCategoryItem> f74948S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public eg.a f74949T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @Nullable
    public i f74951V;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f74943N = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public String f74944O = "";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final AtomicLong f74945P = new AtomicLong(0);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final Handler f74950U = new Handler();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public final b f74952W = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllActivity$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74953a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f74953a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllActivity$b.class */
    public static final class b extends AbstractC5763g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelAllActivity f74954a;

        public b(ChannelAllActivity channelAllActivity) {
            this.f74954a = channelAllActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x02c2  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x02d1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(java.util.Map<java.lang.Long, gg.b> r9) {
            /*
                Method dump skipped, instruction units count: 926
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.alllist.ChannelAllActivity.b.b(java.util.Map):void");
        }

        @Override // com.bilibili.pegasus.utils.AbstractC5763g
        public final Context c() {
            return this.f74954a;
        }
    }

    public final void Q6() {
        Vn0.c cVar = this.f74941L;
        if (cVar == null || cVar.f25604i) {
            return;
        }
        cVar.f25604i = true;
        MutableLiveData<Resource<List<ChannelCategoryItem>>> mutableLiveData = cVar.f25598b;
        Resource.a aVar = Resource.Companion;
        List<? extends ChannelCategoryItem> list = cVar.f25605j;
        aVar.getClass();
        mutableLiveData.postValue(Resource.a.b(list));
        ((ChannelV2ApiService) ServiceGenerator.createService(ChannelV2ApiService.class)).getAllChannelTab(BiliAccounts.get(cVar.getApplication()).getAccessKey()).enqueue(new Vn0.b(cVar));
    }

    public final void R6() {
        Object next;
        Vn0.c cVar = this.f74941L;
        if (cVar != null) {
            long j7 = this.f74945P.get();
            Iterator<T> it = cVar.f25605j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((ChannelCategoryItem) next).tab_type == 1) {
                        break;
                    }
                }
            }
            ChannelCategoryItem channelCategoryItem = (ChannelCategoryItem) next;
            if (channelCategoryItem != null) {
                channelCategoryItem.count = j7;
            }
            cVar.M0(cVar.f25605j);
        }
    }

    public final void S6() {
        int i7;
        int i8;
        if (Intrinsics.areEqual("subscribe", this.f74944O)) {
            this.f74944O = "";
            Vn0.c cVar = this.f74941L;
            if (cVar != null) {
                Iterator<? extends ChannelCategoryItem> it = cVar.f25605j.iterator();
                int i9 = 0;
                while (true) {
                    i8 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().tab_type == 1) {
                        i8 = i9;
                        break;
                    }
                    i9++;
                }
                if (i8 >= 0) {
                    cVar.N0(i8);
                    return;
                } else {
                    cVar.N0(0);
                    return;
                }
            }
            return;
        }
        Vn0.c cVar2 = this.f74941L;
        if (cVar2 != null) {
            long j7 = this.f74943N;
            Iterator<? extends ChannelCategoryItem> it2 = cVar2.f25605j.iterator();
            int i10 = 0;
            while (true) {
                i7 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().id == j7) {
                    i7 = i10;
                    break;
                }
                i10++;
            }
            if (i7 >= 0) {
                cVar2.N0(i7);
            } else {
                cVar2.N0(0);
            }
        }
    }

    public final void T6(List<? extends ChannelCategoryItem> list) {
        c cVar = this.f74940K;
        if (cVar != null) {
            List<? extends ChannelCategoryItem> list2 = cVar.f20927c;
            cVar.f20927c = list;
            DiffUtil.calculateDiff(new Rn0.b(list2, cVar)).dispatchUpdatesTo(cVar);
        }
        this.f74948S = list;
        Vn0.c cVar2 = this.f74941L;
        MutableLiveData<Pair<Integer, ChannelCategoryItem>> mutableLiveData = cVar2 != null ? cVar2.f25600d : null;
        if (mutableLiveData == null || mutableLiveData.getValue() != null) {
            return;
        }
        S6();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return Op0.b.b("traffic.discovery-channel.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v97, types: [Rn0.c, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r1v46, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        p<Void> pVar;
        RecyclerView recyclerView;
        RecyclerView.ItemAnimator itemAnimator;
        MutableLiveData<Resource<List<ChannelCategoryItem>>> mutableLiveData;
        Resource<List<ChannelCategoryItem>> value;
        MutableLiveData<Pair<Integer, ChannelCategoryItem>> mutableLiveData2;
        MutableLiveData<Resource<List<ChannelCategoryItem>>> mutableLiveData3;
        super.onCreate(bundle);
        setContentView(2131494522);
        if (bundle == null) {
            Intent intent = getIntent();
            extras = intent != null ? intent.getExtras() : null;
        } else {
            extras = bundle;
        }
        if (extras != null) {
            this.f74943N = zO.a.j(extras, "tab_id", -1L);
            Object obj = extras.get("tab_target");
            Object obj2 = obj;
            if (obj == null) {
                obj2 = "";
            }
            this.f74944O = String.valueOf(obj2);
        }
        this.f74933D = (FrameLayout) findViewById(2131301943);
        this.f74934E = findViewById(2131313342);
        this.f74935F = findViewById(2131313340);
        this.f74936G = (TextView) findViewById(2131313361);
        this.f74937H = (TextView) findViewById(2131313355);
        this.f74938I = findViewById(2131310889);
        this.f74939J = (RecyclerView) findViewById(2131311321);
        ensureToolbar();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(getResources().getString(2131845113));
        }
        showBackButton();
        if (bundle != null) {
            this.f74946Q = bundle.getString("current_fragment_tag");
            this.f74947R = getSupportFragmentManager().findFragmentByTag(this.f74946Q);
        }
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.Companion;
        this.f74941L = (Vn0.c) new ViewModelProvider(this, companion.getInstance(getApplication())).get(Vn0.c.class);
        this.f74942M = (f) new ViewModelProvider(this, companion.getInstance(getApplication())).get(f.class);
        Vn0.c cVar = this.f74941L;
        if (cVar != null && (mutableLiveData3 = cVar.f25598b) != null) {
            mutableLiveData3.observe(this, new Observer(this) { // from class: Qn0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChannelAllActivity f20071a;

                {
                    this.f20071a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v18, types: [Qn0.i, java.lang.Runnable] */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj3) {
                    Object next;
                    Resource resource = (Resource) obj3;
                    int i7 = ChannelAllActivity.f74932X;
                    Status status = resource.getStatus();
                    int i8 = status == null ? -1 : ChannelAllActivity.a.f74953a[status.ordinal()];
                    ChannelAllActivity channelAllActivity = this.f20071a;
                    if (i8 == 1) {
                        List list = (List) resource.getData();
                        if (list == null || list.isEmpty()) {
                            View view = channelAllActivity.f74934E;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            ?? r02 = new Runnable(channelAllActivity) { // from class: Qn0.i

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final ChannelAllActivity f20082a;

                                {
                                    this.f20082a = channelAllActivity;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChannelAllActivity channelAllActivity2 = this.f20082a;
                                    int i9 = ChannelAllActivity.f74932X;
                                    i iVar = channelAllActivity2.f74951V;
                                    if (iVar != null) {
                                        channelAllActivity2.f74950U.removeCallbacks(iVar);
                                    }
                                    channelAllActivity2.f74951V = null;
                                    View view2 = channelAllActivity2.f74934E;
                                    if (view2 != null) {
                                        view2.setVisibility(0);
                                    }
                                    RecyclerView recyclerView2 = channelAllActivity2.f74939J;
                                    if (recyclerView2 != null) {
                                        recyclerView2.setVisibility(8);
                                    }
                                    FrameLayout frameLayout = channelAllActivity2.f74933D;
                                    if (frameLayout != null) {
                                        frameLayout.setVisibility(8);
                                    }
                                    BiliImageView biliImageView = channelAllActivity2.f74935F;
                                    if (biliImageView != null) {
                                        ImageExtentionKt.displayImage$default(biliImageView, AppResUtil.getImageUrl("img_holder_loading_style1.webp"), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                                    }
                                    TextView textView = channelAllActivity2.f74936G;
                                    if (textView != null) {
                                        textView.setVisibility(0);
                                    }
                                    TextView textView2 = channelAllActivity2.f74936G;
                                    if (textView2 != null) {
                                        textView2.setText(2131845785);
                                    }
                                    TextView textView3 = channelAllActivity2.f74937H;
                                    if (textView3 != null) {
                                        textView3.setVisibility(8);
                                    }
                                    View view3 = channelAllActivity2.f74938I;
                                    if (view3 != null) {
                                        view3.setVisibility(8);
                                    }
                                }
                            };
                            channelAllActivity.f74951V = r02;
                            channelAllActivity.f74950U.postDelayed(r02, 800L);
                            return;
                        }
                        return;
                    }
                    if (i8 != 2) {
                        if (i8 != 3) {
                            return;
                        }
                        i iVar = channelAllActivity.f74951V;
                        if (iVar != null) {
                            channelAllActivity.f74950U.removeCallbacks(iVar);
                        }
                        channelAllActivity.f74951V = null;
                        FrameLayout frameLayout = channelAllActivity.f74933D;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                        RecyclerView recyclerView2 = channelAllActivity.f74939J;
                        if (recyclerView2 != null) {
                            recyclerView2.setVisibility(8);
                        }
                        View view2 = channelAllActivity.f74934E;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        BiliImageView biliImageView = channelAllActivity.f74935F;
                        if (biliImageView != null) {
                            biliImageView.setImageResource(2131235614);
                        }
                        TextView textView = channelAllActivity.f74936G;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        TextView textView2 = channelAllActivity.f74937H;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        }
                        View view3 = channelAllActivity.f74938I;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    List<? extends ChannelCategoryItem> list2 = (List) resource.getData();
                    List<? extends ChannelCategoryItem> list3 = list2;
                    if (list3 == null || list3.isEmpty()) {
                        return;
                    }
                    i iVar2 = channelAllActivity.f74951V;
                    if (iVar2 != null) {
                        channelAllActivity.f74950U.removeCallbacks(iVar2);
                    }
                    channelAllActivity.f74951V = null;
                    FrameLayout frameLayout2 = channelAllActivity.f74933D;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                    }
                    RecyclerView recyclerView3 = channelAllActivity.f74939J;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(0);
                    }
                    View view4 = channelAllActivity.f74934E;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    View view5 = channelAllActivity.f74938I;
                    if (view5 != null) {
                        view5.setVisibility(0);
                    }
                    channelAllActivity.T6(list2);
                    AtomicLong atomicLong = channelAllActivity.f74945P;
                    Iterator<T> it = list2.iterator();
                    do {
                        next = null;
                        if (!it.hasNext()) {
                            break;
                        } else {
                            next = it.next();
                        }
                    } while (!((ChannelCategoryItem) next).isMySubChannel());
                    ChannelCategoryItem channelCategoryItem = (ChannelCategoryItem) next;
                    atomicLong.set(channelCategoryItem != null ? channelCategoryItem.count : 0L);
                }
            });
        }
        Vn0.c cVar2 = this.f74941L;
        if (cVar2 != null && (mutableLiveData2 = cVar2.f25600d) != null) {
            mutableLiveData2.observe(this, new Observer(this) { // from class: Qn0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChannelAllActivity f20072a;

                {
                    this.f20072a = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj3) {
                    Vn0.c cVar3;
                    HashMap<String, Fragment.SavedState> map;
                    HashMap<String, Fragment.SavedState> map2;
                    Pair pair = (Pair) obj3;
                    int i7 = ChannelAllActivity.f74932X;
                    if (pair != null) {
                        int iIntValue = ((Number) pair.getFirst()).intValue();
                        ChannelCategoryItem channelCategoryItem = (ChannelCategoryItem) pair.getSecond();
                        ChannelAllActivity channelAllActivity = this.f20072a;
                        FrameLayout frameLayout = channelAllActivity.f74933D;
                        if (frameLayout != null && iIntValue >= 0 && channelCategoryItem != null) {
                            StringBuilder sb = new StringBuilder("fragment_");
                            if (channelCategoryItem.isMySubChannel()) {
                                sb.append("mysub");
                            } else {
                                sb.append("category");
                            }
                            sb.append("_");
                            sb.append(channelCategoryItem.id);
                            String string = sb.toString();
                            Fragment fragmentFindFragmentByTag = channelAllActivity.getSupportFragmentManager().findFragmentByTag(string);
                            if (fragmentFindFragmentByTag == null || !Intrinsics.areEqual(fragmentFindFragmentByTag, channelAllActivity.f74947R)) {
                                FragmentTransaction fragmentTransactionBeginTransaction = channelAllActivity.getSupportFragmentManager().beginTransaction();
                                Fragment fragment = channelAllActivity.f74947R;
                                Fragment channelSubscribeFragment = channelCategoryItem.isMySubChannel() ? new ChannelSubscribeFragment() : new ChannelAllListFragment();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("key_channel_id", String.valueOf(channelCategoryItem.id));
                                bundle2.putString("key_channel_name", channelCategoryItem.name);
                                channelSubscribeFragment.setArguments(bundle2);
                                Vn0.c cVar4 = channelAllActivity.f74941L;
                                channelSubscribeFragment.setInitialSavedState((cVar4 == null || (map2 = cVar4.f25602f) == null) ? null : map2.get(string));
                                fragmentTransactionBeginTransaction.add(frameLayout.getId(), channelSubscribeFragment, string);
                                channelAllActivity.f74947R = channelSubscribeFragment;
                                channelAllActivity.f74946Q = string;
                                if (fragment != null) {
                                    Fragment.SavedState savedStateSaveFragmentInstanceState = channelAllActivity.getSupportFragmentManager().saveFragmentInstanceState(fragment);
                                    if (savedStateSaveFragmentInstanceState != null && (cVar3 = channelAllActivity.f74941L) != null && (map = cVar3.f25602f) != null) {
                                        String tag = fragment.getTag();
                                        String str = tag;
                                        if (tag == null) {
                                            str = "";
                                        }
                                        map.put(str, savedStateSaveFragmentInstanceState);
                                    }
                                    fragmentTransactionBeginTransaction.remove(fragment);
                                }
                                fragmentTransactionBeginTransaction.commit();
                            }
                        }
                        int iIntValue2 = ((Number) pair.getFirst()).intValue();
                        RecyclerView recyclerView2 = channelAllActivity.f74939J;
                        if (recyclerView2 != null) {
                            recyclerView2.smoothScrollToPosition(iIntValue2);
                        }
                    }
                }
            });
        }
        TextView textView = this.f74937H;
        if (textView != null) {
            textView.setOnClickListener(new m(this));
        }
        View view = this.f74938I;
        if (view != 0) {
            view.setOnClickListener(new Object());
        }
        ViewCompat.setElevation(getToolbar(), 0.0f);
        Vn0.c cVar3 = this.f74941L;
        this.f74948S = (cVar3 == null || (mutableLiveData = cVar3.f25598b) == null || (value = mutableLiveData.getValue()) == null) ? null : (List) value.getData();
        if (this.f74940K == null) {
            ?? adapter = new RecyclerView.Adapter();
            adapter.f20927c = CollectionsKt.emptyList();
            this.f74940K = adapter;
            adapter.f20926b = new ChannelAllActivity$setupSideList$1(this);
        }
        RecyclerView recyclerView2 = this.f74939J;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f74940K);
        }
        RecyclerView recyclerView3 = this.f74939J;
        if (recyclerView3 != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(50L);
        }
        RecyclerView recyclerView4 = this.f74939J;
        if ((recyclerView4 != null ? recyclerView4.getLayoutManager() : null) == null && (recyclerView = this.f74939J) != null) {
            recyclerView.setLayoutManager(new ChannelAllSideListManager(this));
        }
        List<? extends ChannelCategoryItem> list = this.f74948S;
        if (list == null || list.isEmpty()) {
            Q6();
        } else {
            List<? extends ChannelCategoryItem> list2 = this.f74948S;
            if (list2 != null) {
                T6(list2);
            }
        }
        eg.a aVar = new eg.a(103, (String) null);
        this.f74949T = aVar;
        aVar.c(this, this.f74952W);
        final int i7 = 0;
        this.f74941L.f25599c.observe(this, new Observer(this, i7) { // from class: Qn0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f20073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f20074b;

            {
                this.f20073a = i7;
                this.f20074b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj3) {
                String str;
                String str2;
                Object obj4 = this.f20074b;
                switch (this.f20073a) {
                    case 0:
                        Un0.b bVar = (Un0.b) obj3;
                        if (bVar == null) {
                            int i8 = ChannelAllActivity.f74932X;
                        } else {
                            eg.a aVar2 = ((ChannelAllActivity) obj4).f74949T;
                            if (aVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("channelManager");
                                aVar2 = null;
                            }
                            eg.a.b(aVar2, bVar.f24783a, bVar.f24784b);
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj3;
                        if (pair != null) {
                            LiveGoodsCardDetail liveGoodsCardDetail = (LiveGoodsCardDetail) pair.getFirst();
                            boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
                            boolean zDataInValid = liveGoodsCardDetail.dataInValid();
                            LiveRoomShoppingBusinessService liveRoomShoppingBusinessService = (LiveRoomShoppingBusinessService) obj4;
                            if (!zDataInValid) {
                                LiveLog.Companion companion2 = LiveLog.Companion;
                                liveRoomShoppingBusinessService.getClass();
                                if (companion2.matchLevel(3)) {
                                    try {
                                        str = "updateGoodsCard, " + liveRoomShoppingBusinessService.D;
                                    } catch (Exception e7) {
                                        BLog.e("LiveLog", "getLogMessage", e7);
                                        str = null;
                                    }
                                    str2 = str != null ? str : "";
                                    LiveLogDelegate logDelegate = companion2.getLogDelegate();
                                    if (logDelegate != null) {
                                        LiveLogDelegate.onLog$default(logDelegate, 3, "LiveRoomShoppingBusinessService", str2, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i("LiveRoomShoppingBusinessService", str2);
                                }
                                LiveRoomShoppingBusinessService.ShoppingViewType shoppingViewType = liveRoomShoppingBusinessService.D;
                                int i9 = shoppingViewType == null ? -1 : LiveRoomShoppingBusinessService.b.a[shoppingViewType.ordinal()];
                                if (i9 == 1) {
                                    liveRoomShoppingBusinessService.s(LiveRoomShoppingBusinessService.ShoppingViewType.SHOPPING_VIEW_EXPLAIN_CARD, liveGoodsCardDetail, (LiveShoppingRecommendCardGoodsDetail) null, new com.bilibili.bililive.room.biz.shopping.service.p(liveRoomShoppingBusinessService, liveGoodsCardDetail), (Function0) null);
                                    break;
                                } else if (i9 == 2) {
                                    if (!zBooleanValue) {
                                        LiveGoodsCardDetail liveGoodsCardDetail2 = liveRoomShoppingBusinessService.z;
                                        if (!Intrinsics.areEqual(liveGoodsCardDetail2 != null ? liveGoodsCardDetail2.goodsId : null, liveGoodsCardDetail.goodsId)) {
                                        }
                                    }
                                    liveRoomShoppingBusinessService.w();
                                    liveRoomShoppingBusinessService.s(LiveRoomShoppingBusinessService.ShoppingViewType.SHOPPING_VIEW_EXPLAIN_CARD, liveGoodsCardDetail, (LiveShoppingRecommendCardGoodsDetail) null, (Function0) null, (Function0) null);
                                    liveRoomShoppingBusinessService.z = liveGoodsCardDetail;
                                    break;
                                } else if (i9 == 3) {
                                    liveRoomShoppingBusinessService.s(LiveRoomShoppingBusinessService.ShoppingViewType.SHOPPING_VIEW_EXPLAIN_CARD, liveGoodsCardDetail, (LiveShoppingRecommendCardGoodsDetail) null, new com.bilibili.bililive.room.biz.shopping.service.q(0, liveRoomShoppingBusinessService, liveGoodsCardDetail), (Function0) null);
                                    break;
                                }
                                break;
                            } else {
                                LiveLog.Companion companion3 = LiveLog.Companion;
                                liveRoomShoppingBusinessService.getClass();
                                if (companion3.matchLevel(3)) {
                                    str2 = "add or replace goods card is null data" != 0 ? "add or replace goods card is null data" : "";
                                    LiveLogDelegate logDelegate2 = companion3.getLogDelegate();
                                    if (logDelegate2 != null) {
                                        LiveLogDelegate.onLog$default(logDelegate2, 3, "LiveRoomShoppingBusinessService", str2, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i("LiveRoomShoppingBusinessService", str2);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (((Boolean) obj3) != null) {
                            ((M0) obj4).q();
                        }
                        break;
                }
            }
        });
        this.f74942M.f25614d.observe(this, new Observer(this) { // from class: Qn0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelAllActivity f20075a;

            {
                this.f20075a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj3) {
                Un0.b bVar = (Un0.b) obj3;
                if (bVar == null) {
                    int i8 = ChannelAllActivity.f74932X;
                    return;
                }
                eg.a aVar2 = this.f20075a.f74949T;
                eg.a aVar3 = aVar2;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channelManager");
                    aVar3 = null;
                }
                eg.a.b(aVar3, bVar.f24783a, bVar.f24784b);
            }
        });
        final int i8 = 0;
        this.f74942M.f25615e.observe(this, new Observer(this, i8) { // from class: Qn0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f20076a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f20077b;

            {
                this.f20076a = i8;
                this.f20077b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj3) {
                Object obj4 = this.f20077b;
                switch (this.f20076a) {
                    case 0:
                        if (((Boolean) obj3) == null) {
                            int i9 = ChannelAllActivity.f74932X;
                        } else {
                            ChannelAllActivity channelAllActivity = (ChannelAllActivity) obj4;
                            channelAllActivity.f74945P.decrementAndGet();
                            channelAllActivity.R6();
                        }
                        break;
                    case 1:
                        Pair pair = (Pair) obj3;
                        if (pair != null) {
                            boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                            LiveRoomShoppingBusinessService liveRoomShoppingBusinessService = (LiveRoomShoppingBusinessService) obj4;
                            if (!zBooleanValue) {
                                ((kG.j) liveRoomShoppingBusinessService.G.getValue()).c((LiveShoppingReserveCalendarInfo) pair.getSecond(), new G0(7));
                            } else {
                                ((kG.j) liveRoomShoppingBusinessService.G.getValue()).a((LiveShoppingReserveCalendarInfo) pair.getSecond(), new F0(6));
                            }
                            break;
                        }
                        break;
                    default:
                        ((HomeContainerFragmentV2) obj4).kf("3");
                        break;
                }
            }
        });
        final int i9 = 0;
        this.f74942M.f25616f.observe(this, new Observer(this, i9) { // from class: Qn0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f20078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f20079b;

            {
                this.f20078a = i9;
                this.f20079b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onChanged(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 605
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: Qn0.g.onChanged(java.lang.Object):void");
            }
        });
        f fVar = this.f74942M;
        if (fVar == null || (pVar = fVar.f25617g) == null) {
            return;
        }
        final int i10 = 0;
        pVar.observe(this, new Observer(i10, this) { // from class: Qn0.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f20080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LifecycleOwner f20081b;

            {
                this.f20080a = i10;
                this.f20081b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj3) {
                P0 p02 = this.f20081b;
                switch (this.f20080a) {
                    case 0:
                        eg.a aVar2 = ((ChannelAllActivity) p02).f74949T;
                        eg.a aVar3 = aVar2;
                        if (aVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("channelManager");
                            aVar3 = null;
                        }
                        aVar3.getClass();
                        LongSparseArray longSparseArray = gg.a.a;
                        Violet.INSTANCE.setValue(new gg.b(-233L, false, Status.SUCCESS, aVar3.a, aVar3.b, (Throwable) null));
                        break;
                    default:
                        if (((Integer) obj3) != null) {
                            p02.s();
                        }
                        break;
                }
            }
        });
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        RecyclerView.RecycledViewPool recycledViewPool;
        super.onDestroy();
        Vn0.c cVar = this.f74941L;
        if (cVar == null || (recycledViewPool = cVar.f25601e) == null) {
            return;
        }
        recycledViewPool.clear();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f74943N = zO.a.j(extras, "tab_id", -1L);
            Object obj = extras.get("tab_target");
            Object obj2 = obj;
            if (obj == null) {
                obj2 = "";
            }
            this.f74944O = String.valueOf(obj2);
        }
        S6();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("tab_id", this.f74943N);
        bundle.putString("tab_target", this.f74944O);
        bundle.putSerializable("current_fragment_tag", this.f74946Q);
    }
}
