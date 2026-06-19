package com.bilibili.pegasus.channel.detail;

import J3.C2326b;
import Nn0.e;
import Nn0.f;
import Nn0.g;
import Nn0.i;
import Nn0.s;
import Nn0.t;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.supermenu.core.IMenu;
import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.comm.supermenu.core.MenuImpl;
import com.bilibili.app.comm.supermenu.core.MenuItemImpl;
import com.bilibili.app.comm.supermenu.share.v2.MenuItemHandler;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.VideoHandler;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pegasus.api.model.ChannelDataItem;
import com.bilibili.pegasus.channel.detail.ChannelDetailActivity;
import com.bilibili.pegasus.channel.detail.ChannelDetailFragment;
import com.bilibili.pegasus.utils.AbstractC5760d;
import com.bilibili.pegasus.utils.AbstractC5763g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SpacesItemDecoration;
import tv.danmaku.bili.widget.statefulbutton.StatefulButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailActivity.class */
@StabilityInferred(parameters = 0)
public final class ChannelDetailActivity extends BaseAppCompatActivity implements PassportObserver, pc1.b, t, GarbWatcher.Observer {

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final int f74845Z0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Garb f74846B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public TintImageView f74848D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public View f74849E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public FrameLayout f74850F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public AppBarLayout f74851G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public CoordinatorLayout f74852H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public TintToolbar f74853I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public CollapsingToolbarLayout f74854J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public TextView f74855K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public RelativeLayout f74856L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public TextView f74857M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public StatefulButton f74858N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public TintImageView f74859O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public BiliImageView f74860P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public TextView f74861Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public TextView f74862R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public TextView f74863S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public StatefulButton f74864T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public ColorDrawable f74865U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public RecyclerView f74867W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public s f74870Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public String f74872Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ChannelDataItem f74873a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f74874c0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public e f74875p0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Bus f74847C = new Bus(GameCenterBottomTabConfig.TAB_TYPE_ACT);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final Lazy f74866V = LazyKt.lazy(new f(this, 0));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @NotNull
    public final Lazy f74868X = LazyKt.lazy(new C2326b(3));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final eg.a f74876r0 = new eg.a(9, (String) null);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @NotNull
    public final b f74877v0 = new b(this);

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @NotNull
    public final c f74869X0 = new c(this);

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @NotNull
    public final Lazy f74871Y0 = LazyKt.lazy(new g(this, 0));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailActivity$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74878a;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f74878a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailActivity$b.class */
    public static final class b extends AbstractC5760d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivity f74879a;

        public b(ChannelDetailActivity channelDetailActivity) {
            this.f74879a = channelDetailActivity;
        }

        public final void a(View view) {
            ChannelDetailActivity channelDetailActivity = this.f74879a;
            eg.a aVar = channelDetailActivity.f74876r0;
            ChannelDataItem channelDataItem = channelDetailActivity.f74873a0;
            ChannelDataItem channelDataItem2 = channelDataItem;
            if (channelDataItem == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem2 = null;
            }
            long j7 = channelDataItem2.a;
            ChannelDataItem channelDataItem3 = this.f74879a.f74873a0;
            if (channelDataItem3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem3 = null;
            }
            boolean z6 = true;
            if (channelDataItem3.c != 1) {
                z6 = false;
            }
            eg.a.b(aVar, j7, z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailActivity$c.class */
    public static final class c extends MenuItemHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivity f74880a;

        public c(ChannelDetailActivity channelDetailActivity) {
            this.f74880a = channelDetailActivity;
        }

        public final boolean handleClick(IMenuItem iMenuItem) {
            String itemId = iMenuItem.getItemId();
            if (itemId == null) {
                return false;
            }
            int iHashCode = itemId.hashCode();
            ChannelDetailActivity channelDetailActivity = this.f74880a;
            if (iHashCode == 1002702747) {
                if (!itemId.equals(SocializeMedia.BILI_DYNAMIC) || BiliAccounts.get(channelDetailActivity).isLogin()) {
                    return false;
                }
                Qp0.c.b(channelDetailActivity);
                return true;
            }
            if (iHashCode != 1376326177 || !itemId.equals("channel_detail_menu_publish")) {
                return false;
            }
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"bili_more", "click", "2", "70", "channel"});
            ChannelDetailFragment.a aVar = ChannelDetailFragment.f74882X;
            ChannelDataItem channelDataItem = channelDetailActivity.f74873a0;
            ChannelDataItem channelDataItem2 = channelDataItem;
            if (channelDataItem == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem2 = null;
            }
            String str = channelDataItem2.b;
            aVar.getClass();
            ChannelDetailFragment.a.a(channelDetailActivity, str);
            return true;
        }

        public final void onMenuList(List<IMenu> list) {
            super.onMenuList(list);
            if (TypeIntrinsics.isMutableList(list)) {
                int size = list.size();
                ChannelDetailActivity channelDetailActivity = this.f74880a;
                if (size >= 2) {
                    ((IMenu) CollectionsKt.last(list)).getMenuItems().addAll(ChannelDetailActivity.P6(channelDetailActivity));
                    return;
                }
                MenuImpl menuImpl = new MenuImpl(channelDetailActivity);
                menuImpl.setMenuItems(ChannelDetailActivity.P6(channelDetailActivity));
                list.add(menuImpl);
            }
        }

        public final String[] registerActionMenuItems() {
            return new String[]{"channel_detail_menu_publish"};
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelDetailActivity$d.class */
    public static final class d extends AbstractC5763g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivity f74881a;

        public d(ChannelDetailActivity channelDetailActivity) {
            this.f74881a = channelDetailActivity;
        }

        public final void b(Map<Long, gg.b> map) {
            ChannelDetailActivity channelDetailActivity = this.f74881a;
            ChannelDataItem channelDataItem = channelDetailActivity.f74873a0;
            ChannelDataItem channelDataItem2 = channelDataItem;
            if (channelDataItem == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem2 = null;
            }
            gg.b bVar = map.get(Long.valueOf(channelDataItem2.a));
            if (bVar != null) {
                ChannelDataItem channelDataItem3 = channelDetailActivity.f74873a0;
                if (channelDataItem3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channel");
                    channelDataItem3 = null;
                }
                boolean z6 = bVar.b;
                channelDataItem3.c = z6 ? 1 : 0;
                for (StatefulButton statefulButton : (StatefulButton[]) channelDetailActivity.f74866V.getValue()) {
                    if (statefulButton != null) {
                        statefulButton.updateUI(z6);
                    }
                }
            }
        }

        @Override // com.bilibili.pegasus.utils.AbstractC5763g
        public final Context c() {
            return this.f74881a;
        }
    }

    public static final List P6(ChannelDetailActivity channelDetailActivity) {
        channelDetailActivity.getClass();
        ArrayList arrayList = new ArrayList();
        MenuItemImpl menuItemImpl = new MenuItemImpl(channelDetailActivity, "channel_detail_menu_publish", 2131236650, 2131845177);
        menuItemImpl.setIcon(ThemeUtils.tintDrawable(VectorDrawableCompat.create(channelDetailActivity.getResources(), 2131236650, null), channelDetailActivity.getResources().getColor(R$color.Ga5)));
        arrayList.add(menuItemImpl);
        return arrayList;
    }

    public final int Q6() {
        BiliImageView biliImageView = this.f74860P;
        float width = biliImageView != null ? biliImageView.getWidth() : 0;
        BiliImageView biliImageView2 = this.f74860P;
        return ((int) (width / (biliImageView2 != null ? biliImageView2.getAspectRatio() : 1.0f))) - ((Number) this.f74871Y0.getValue()).intValue();
    }

    public final void R6(@FloatRange(from = 0.0d, to = 1.0d) float f7) {
        StatefulButton statefulButton = this.f74858N;
        if (statefulButton != null) {
            statefulButton.setAlpha(f7);
        }
        TextView textView = this.f74855K;
        if (textView != null) {
            textView.setAlpha(f7);
        }
        TextView textView2 = this.f74857M;
        if (textView2 != null) {
            textView2.setAlpha(f7);
        }
    }

    @NotNull
    public final Bus S3() {
        return this.f74847C;
    }

    public final void S6(boolean z6) {
        com.bilibili.app.comm.list.common.utils.b bVar = this.f74877v0;
        if (z6) {
            StatefulButton statefulButton = this.f74858N;
            if (statefulButton != null) {
                statefulButton.setOnClickListener(bVar);
            }
            StatefulButton statefulButton2 = this.f74864T;
            if (statefulButton2 != null) {
                statefulButton2.setOnClickListener(null);
                return;
            }
            return;
        }
        StatefulButton statefulButton3 = this.f74864T;
        if (statefulButton3 != null) {
            statefulButton3.setOnClickListener(bVar);
        }
        StatefulButton statefulButton4 = this.f74858N;
        if (statefulButton4 != null) {
            statefulButton4.setOnClickListener(null);
        }
    }

    public final void T6() {
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure()) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(this, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void onChange(@Nullable Topic topic) {
        if ((topic == null ? -1 : a.f74878a[topic.ordinal()]) == 1) {
            for (StatefulButton statefulButton : (StatefulButton[]) this.f74866V.getValue()) {
                if (statefulButton != null) {
                    statefulButton.updateUI(false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v83, types: [Nn0.e] */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        Bundle bundle2;
        Drawable drawableMutate;
        super.onCreate(bundle);
        this.f74846B = GarbManager.getCurGarb();
        GarbWatcher.INSTANCE.subscribe(this);
        this.f74847C.register(this);
        Intent intent = getIntent();
        ChannelDataItem parcelable = (intent == null || (extras = intent.getExtras()) == null || (bundle2 = extras.getBundle("default_extra_bundle")) == null) ? null : bundle2.getParcelable("channel_data");
        ChannelDataItem channelDataItem = parcelable;
        if (parcelable == null) {
            channelDataItem = new ChannelDataItem(zO.a.i(getIntent(), "tagId"), zO.a.k(getIntent(), "name", ""));
        }
        this.f74873a0 = channelDataItem;
        this.f74872Z = zO.a.k(getIntent(), "type", "default");
        BiliAccounts.get(this).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        ChannelDataItem channelDataItem2 = this.f74873a0;
        ChannelDataItem channelDataItem3 = channelDataItem2;
        if (channelDataItem2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelDataItem3 = null;
        }
        if (channelDataItem3.a == -1) {
            ChannelDataItem channelDataItem4 = this.f74873a0;
            ChannelDataItem channelDataItem5 = channelDataItem4;
            if (channelDataItem4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem5 = null;
            }
            String str = channelDataItem5.b;
            if (str == null || StringsKt.isBlank(str)) {
                PromoToast.showBottomToast(this, 2131845204);
                finish();
                return;
            }
        }
        setContentView(2131496156);
        TintToolbar tintToolbar = (TintToolbar) findViewById(2131304944);
        this.f74853I = tintToolbar;
        setSupportActionBar(tintToolbar);
        StatusBarCompat.immersiveStatusBar(this);
        StatusBarCompat.setHeightAndPadding(this, this.f74853I);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
        this.f74848D = (TintImageView) findViewById(2131302849);
        View viewFindViewById = findViewById(2131313478);
        this.f74849E = viewFindViewById;
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = ListExtentionsKt.toPx(49) + StatusBarCompat.getStatusBarHeight(this);
            } else {
                marginLayoutParams = null;
            }
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
        this.f74855K = (TextView) findViewById(2131308958);
        this.f74857M = (TextView) findViewById(2131312641);
        this.f74858N = findViewById(2131298203);
        this.f74859O = (TintImageView) findViewById(2131307359);
        this.f74850F = (FrameLayout) findViewById(2131299459);
        this.f74852H = (CoordinatorLayout) findViewById(2131299465);
        this.f74851G = findViewById(2131296646);
        this.f74854J = findViewById(2131299010);
        this.f74856L = (RelativeLayout) findViewById(2131302168);
        this.f74860P = findViewById(2131302595);
        this.f74861Q = (TextView) findViewById(2131302577);
        this.f74862R = (TextView) findViewById(2131302594);
        this.f74863S = (TextView) findViewById(2131302597);
        this.f74864T = findViewById(2131302589);
        this.f74867W = (RecyclerView) findViewById(2131310102);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        RecyclerView recyclerView = this.f74867W;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f74867W;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new SpacesItemDecoration(ListExtentionsKt.toPx(6.0f)));
        }
        ChannelDataItem channelDataItem6 = this.f74873a0;
        ChannelDataItem channelDataItem7 = channelDataItem6;
        if (channelDataItem6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelDataItem7 = null;
        }
        String str2 = channelDataItem7.b;
        TextView textView = this.f74855K;
        if (textView != null) {
            textView.setText(str2);
        }
        TextView textView2 = this.f74861Q;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putAll(getIntent().getExtras());
        bundle3.putString("type", this.f74872Z);
        Parcelable parcelable2 = this.f74873a0;
        Parcelable parcelable3 = parcelable2;
        if (parcelable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            parcelable3 = null;
        }
        bundle3.putParcelable("channel_data", parcelable3);
        bundle3.putString("from_spmid", zO.a.k(getIntent(), "from_spmid", ""));
        bundle3.putString("channel_converge_page_from", "traffic.channel-detail.0.0");
        Lazy lazy = this.f74868X;
        ((ChannelConvergeDetailFragment) lazy.getValue()).setArguments(bundle3);
        getSupportFragmentManager().beginTransaction().replace(2131299459, (ChannelConvergeDetailFragment) lazy.getValue(), "channel_detail_converge_fragment").commitNow();
        TintImageView tintImageView = this.f74848D;
        if (tintImageView != null) {
            tintImageView.setOnClickListener(new Nn0.d(this, 0));
        }
        this.f74865U = new ColorDrawable(ThemeUtils.getColorById(this, 2131103271));
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setBackgroundDrawable(this.f74865U);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = StatusBarCompat.getStatusBarHeight(this);
        this.f74875p0 = new AppBarLayout.OnOffsetChangedListener(this, intRef) { // from class: Nn0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelDetailActivity f17309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.IntRef f17310b;

            {
                this.f17309a = this;
                this.f17310b = intRef;
            }

            public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                CollapsingToolbarLayout collapsingToolbarLayout;
                int colorById;
                ChannelDetailActivity channelDetailActivity = this.f17309a;
                if (channelDetailActivity.f74874c0 && (collapsingToolbarLayout = channelDetailActivity.f74854J) != null) {
                    int height = collapsingToolbarLayout.getHeight();
                    if (channelDetailActivity.f74853I != null) {
                        float fMin = Math.min(1.0f, Math.max(0.0f, (-i7) / ((height - r0.getHeight()) - this.f17310b.element)));
                        CollapsingToolbarLayout collapsingToolbarLayout2 = channelDetailActivity.f74854J;
                        if (height + i7 >= (collapsingToolbarLayout2 != null ? collapsingToolbarLayout2.getScrimVisibleHeightTrigger() : 0)) {
                            channelDetailActivity.S6(false);
                            channelDetailActivity.R6(0.0f);
                            StatusBarCompat.tintStatusBar(channelDetailActivity, ContextCompat.getColor(channelDetailActivity, 2131100750));
                            TintImageView tintImageView2 = channelDetailActivity.f74848D;
                            Drawable drawable = tintImageView2 != null ? tintImageView2.getDrawable() : null;
                            TintImageView tintImageView3 = channelDetailActivity.f74848D;
                            Drawable drawableTintDrawable = ThemeUtils.tintDrawable(drawable, ThemeUtils.getColorById(tintImageView3 != null ? tintImageView3.getContext() : null, R$color.Wh0_u));
                            TintImageView tintImageView4 = channelDetailActivity.f74848D;
                            if (tintImageView4 != null) {
                                tintImageView4.setImageDrawable(drawableTintDrawable);
                            }
                            TintImageView tintImageView5 = channelDetailActivity.f74859O;
                            Drawable drawable2 = tintImageView5 != null ? tintImageView5.getDrawable() : null;
                            TintImageView tintImageView6 = channelDetailActivity.f74859O;
                            Context context = null;
                            if (tintImageView6 != null) {
                                context = tintImageView6.getContext();
                            }
                            Drawable drawableTintDrawable2 = ThemeUtils.tintDrawable(drawable2, ThemeUtils.getColorById(context, R$color.Wh0_u));
                            TintImageView tintImageView7 = channelDetailActivity.f74859O;
                            if (tintImageView7 != null) {
                                tintImageView7.setImageDrawable(drawableTintDrawable2);
                                return;
                            }
                            return;
                        }
                        channelDetailActivity.S6(true);
                        channelDetailActivity.R6(fMin);
                        Garb garb = channelDetailActivity.f74846B;
                        Garb garb2 = garb;
                        if (garb == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                            garb2 = null;
                        }
                        if (garb2.isPure()) {
                            colorById = ThemeUtils.getColorById(channelDetailActivity, 2131103971);
                        } else {
                            Garb garb3 = channelDetailActivity.f74846B;
                            Garb garb4 = garb3;
                            if (garb3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                                garb4 = null;
                            }
                            colorById = garb4.getSecondaryPageColor();
                        }
                        StatusBarCompat.tintStatusBar(channelDetailActivity, colorById);
                        Garb garb5 = channelDetailActivity.f74846B;
                        Garb garb6 = garb5;
                        if (garb5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                            garb6 = null;
                        }
                        if (garb6.isPure()) {
                            TintImageView tintImageView8 = channelDetailActivity.f74848D;
                            if (tintImageView8 != null) {
                                tintImageView8.setImageTintList(2131103911);
                            }
                            TintImageView tintImageView9 = channelDetailActivity.f74859O;
                            if (tintImageView9 != null) {
                                tintImageView9.setImageTintList(2131103911);
                                return;
                            }
                            return;
                        }
                        TintImageView tintImageView10 = channelDetailActivity.f74848D;
                        Drawable drawable3 = tintImageView10 != null ? tintImageView10.getDrawable() : null;
                        Garb garb7 = channelDetailActivity.f74846B;
                        Garb garb8 = garb7;
                        if (garb7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                            garb8 = null;
                        }
                        Drawable drawableTintDrawable3 = ThemeUtils.tintDrawable(drawable3, garb8.getFontColor());
                        TintImageView tintImageView11 = channelDetailActivity.f74848D;
                        if (tintImageView11 != null) {
                            tintImageView11.setImageDrawable(drawableTintDrawable3);
                        }
                        TintImageView tintImageView12 = channelDetailActivity.f74859O;
                        Drawable drawable4 = tintImageView12 != null ? tintImageView12.getDrawable() : null;
                        Garb garb9 = channelDetailActivity.f74846B;
                        if (garb9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                            garb9 = null;
                        }
                        Drawable drawableTintDrawable4 = ThemeUtils.tintDrawable(drawable4, garb9.getFontColor());
                        TintImageView tintImageView13 = channelDetailActivity.f74859O;
                        if (tintImageView13 != null) {
                            tintImageView13.setImageDrawable(drawableTintDrawable4);
                        }
                    }
                }
            }
        };
        TintImageView tintImageView2 = this.f74859O;
        if (tintImageView2 != null) {
            tintImageView2.setOnClickListener(new FR.a(this, 1));
        }
        this.f74874c0 = true;
        RelativeLayout relativeLayout = this.f74856L;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        ColorDrawable colorDrawable = this.f74865U;
        if (colorDrawable != null && (drawableMutate = colorDrawable.mutate()) != null) {
            drawableMutate.setAlpha(0);
        }
        R6(0.0f);
        S6(false);
        AppBarLayout appBarLayout = this.f74851G;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true, true);
        }
        ((ChannelConvergeDetailFragment) lazy.getValue()).setInitOffset(Q6());
        ChannelDataItem channelDataItem8 = this.f74873a0;
        if (channelDataItem8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelDataItem8 = null;
        }
        this.f74870Y = new s(channelDataItem8.a);
        this.f74876r0.c(this, new d(this));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        GarbWatcher.INSTANCE.unSubscribe(this);
        this.f74847C.unregister(this);
        BiliAccounts.get(this).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        AppBarLayout appBarLayout = this.f74851G;
        if (appBarLayout != null) {
            appBarLayout.removeOnOffsetChangedListener(this.f74875p0);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        int colorById = ThemeUtils.getColorById(this, 2131103971);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        T6();
        CoordinatorLayout coordinatorLayout = this.f74852H;
        if (coordinatorLayout != null) {
            coordinatorLayout.setStatusBarBackgroundColor(0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.f74854J;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setStatusBarScrimColor(colorById);
        }
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.f74854J;
        if (collapsingToolbarLayout2 != null) {
            collapsingToolbarLayout2.setContentScrimColor(colorById);
        }
        Garb garb = this.f74846B;
        Garb garb2 = garb;
        if (garb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb2 = null;
        }
        if (garb2.isPure()) {
            return;
        }
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.f74854J;
        if (collapsingToolbarLayout3 != null) {
            collapsingToolbarLayout3.setStatusBarScrimColor(garb2.getSecondaryPageColor());
        }
        CollapsingToolbarLayout collapsingToolbarLayout4 = this.f74854J;
        if (collapsingToolbarLayout4 != null) {
            collapsingToolbarLayout4.setContentScrimColor(garb2.getSecondaryPageColor());
        }
        TextView textView = this.f74855K;
        if (textView != null) {
            textView.setTextColor(ColorStateList.valueOf(garb2.getFontColor()));
        }
        TextView textView2 = this.f74857M;
        if (textView2 != null) {
            textView2.setTextColor(ColorStateList.valueOf(garb2.getFontColor()));
        }
        TintImageView tintImageView = this.f74848D;
        Drawable drawable = tintImageView != null ? tintImageView.getDrawable() : null;
        Garb garb3 = this.f74846B;
        Garb garb4 = garb3;
        if (garb3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb4 = null;
        }
        Drawable drawableTintDrawable = ThemeUtils.tintDrawable(drawable, garb4.getFontColor());
        TintImageView tintImageView2 = this.f74848D;
        if (tintImageView2 != null) {
            tintImageView2.setImageDrawable(drawableTintDrawable);
        }
        TintImageView tintImageView3 = this.f74859O;
        Drawable drawable2 = tintImageView3 != null ? tintImageView3.getDrawable() : null;
        Garb garb5 = this.f74846B;
        if (garb5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb5 = null;
        }
        Drawable drawableTintDrawable2 = ThemeUtils.tintDrawable(drawable2, garb5.getFontColor());
        TintImageView tintImageView4 = this.f74859O;
        if (tintImageView4 != null) {
            tintImageView4.setImageDrawable(drawableTintDrawable2);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        AppBarLayout appBarLayout = this.f74851G;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(this.f74875p0);
        }
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        if (garb.isPure()) {
            T6();
        } else {
            T6();
        }
    }

    @Override // Nn0.t
    public final void v0(@Nullable final ChannelDataItem channelDataItem, boolean z6) {
        final BiliImageView biliImageView;
        Sequence sequenceAsSequence;
        Sequence sequenceFilter;
        Lazy lazy = this.f74866V;
        if (channelDataItem == null || !z6) {
            PromoToast.showBottomToast(this, 2131845201);
            for (LinearLayout linearLayout : (StatefulButton[]) lazy.getValue()) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
            }
            TextView textView = this.f74857M;
            if (textView != null) {
                textView.setVisibility(4);
            }
            TextView textView2 = this.f74862R;
            if (textView2 != null) {
                textView2.setVisibility(4);
                return;
            }
            return;
        }
        if (channelDataItem.a > 0) {
            this.f74873a0 = channelDataItem;
            String str = channelDataItem.b;
            TextView textView3 = this.f74855K;
            if (textView3 != null) {
                textView3.setText(str);
            }
            TextView textView4 = this.f74861Q;
            if (textView4 != null) {
                textView4.setText(str);
            }
            String str2 = channelDataItem.g;
            TextView textView5 = this.f74863S;
            if (textView5 != null) {
                textView5.setText(str2);
            }
            long j7 = channelDataItem.d;
            Long lValueOf = Long.valueOf(j7);
            TextView textView6 = this.f74857M;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            TextView textView7 = this.f74862R;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            TextView textView8 = this.f74857M;
            if (textView8 != null) {
                textView8.setText(getResources().getQuantityString(2131689725, (int) j7, NumberFormat_androidKt.format$default(lValueOf, (String) null, 0, 3, (Object) null)));
            }
            TextView textView9 = this.f74862R;
            if (textView9 != null) {
                textView9.setText(getResources().getQuantityString(2131689725, (int) j7, NumberFormat_androidKt.format$default(lValueOf, (String) null, 0, 3, (Object) null)));
            }
            ChannelDataItem channelDataItem2 = this.f74873a0;
            ChannelDataItem channelDataItem3 = channelDataItem2;
            if (channelDataItem2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem3 = null;
            }
            channelDataItem3.d = j7;
            for (LinearLayout linearLayout2 : (StatefulButton[]) lazy.getValue()) {
                if (linearLayout2 != null) {
                    linearLayout2.setOnClickListener(this.f74877v0);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                if (linearLayout2 != null) {
                    linearLayout2.updateUI(channelDataItem.c == 1);
                }
            }
            ArrayList arrayList = channelDataItem.j;
            List<? extends ChannelDataItem> list = (arrayList == null || (sequenceAsSequence = CollectionsKt.asSequence(arrayList)) == null || (sequenceFilter = SequencesKt.filter(sequenceAsSequence, new i(0))) == null) ? null : SequencesKt.toList(sequenceFilter);
            if (list == null || list.isEmpty()) {
                RecyclerView recyclerView = this.f74867W;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    BiliImageView biliImageView2 = this.f74860P;
                    if (biliImageView2 != null) {
                        biliImageView2.setAspectRatio(1.9354838f);
                    }
                }
            } else {
                s sVar = this.f74870Y;
                s sVar2 = sVar;
                if (sVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("relatedChannelAdapter");
                    sVar2 = null;
                }
                sVar2.f17337b = list;
                RecyclerView recyclerView2 = this.f74867W;
                if (recyclerView2 != null) {
                    s sVar3 = this.f74870Y;
                    s sVar4 = sVar3;
                    if (sVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("relatedChannelAdapter");
                        sVar4 = null;
                    }
                    recyclerView2.setAdapter(sVar4);
                    s sVar5 = this.f74870Y;
                    if (sVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("relatedChannelAdapter");
                        sVar5 = null;
                    }
                    sVar5.notifyDataSetChanged();
                    recyclerView2.setVisibility(0);
                    BiliImageView biliImageView3 = this.f74860P;
                    if (biliImageView3 != null) {
                        biliImageView3.setAspectRatio(1.6666666f);
                    }
                }
            }
            ((ChannelConvergeDetailFragment) this.f74868X.getValue()).setInitOffset(Q6());
            String str3 = channelDataItem.h;
            if (str3 == null || StringsKt.isBlank(str3) || (biliImageView = this.f74860P) == null) {
                return;
            }
            final int i7 = 0;
            biliImageView.post(new Runnable(i7, biliImageView, channelDataItem) { // from class: Nn0.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f17315a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f17316b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f17317c;

                {
                    this.f17315a = i7;
                    this.f17316b = biliImageView;
                    this.f17317c = channelDataItem;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f17315a) {
                        case 0:
                            BiliImageView biliImageView4 = (BiliImageView) this.f17316b;
                            ChannelDataItem channelDataItem4 = (ChannelDataItem) this.f17317c;
                            int i8 = ChannelDetailActivity.f74845Z0;
                            ImageExtentionKt.displayImage$default(biliImageView4, channelDataItem4.h, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                            break;
                        default:
                            VideoHandler.S((VideoHandler) this.f17316b, (String) this.f17317c);
                            break;
                    }
                }
            });
        }
    }
}
