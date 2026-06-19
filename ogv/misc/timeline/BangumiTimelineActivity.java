package com.bilibili.ogv.misc.timeline;

import Pb.F;
import Pb.G;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.ogv.misc.timeline.BangumiTimelineActivity;
import com.bilibili.ogv.misc.timeline.s;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineEntity;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.xpref.Xpref;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelineActivity.class */
@StabilityInferred(parameters = 0)
public final class BangumiTimelineActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f69394W = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f69395D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public RecyclerView f69396E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public a f69397F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public ViewPager f69398G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public ComposeView f69399H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public BangumiTimelinePagerAdapter f69400I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public View f69402K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public TextView f69403L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public PopupWindow f69404M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public RecyclerView f69405N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public c f69406O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public TintImageView f69407P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f69408Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public String f69409R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f69411T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f69412U;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final e f69401J = new e(this);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f69410S = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public String f69413V = MediaStrategyItem.SOURCE_FROM_ALL;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelineActivity$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<BangumiTimelineDay> f69414a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69415b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BangumiTimelineActivity f69416c;

        public a(BangumiTimelineActivity bangumiTimelineActivity) {
            this.f69416c = bangumiTimelineActivity;
        }

        public final void N(int i7, boolean z6) {
            int i8 = this.f69415b;
            if (i8 != i7) {
                this.f69415b = i7;
                notifyItemChanged(i8);
                notifyItemChanged(this.f69415b);
                int i9 = this.f69415b;
                BangumiTimelineActivity bangumiTimelineActivity = this.f69416c;
                ((LinearLayoutManager) bangumiTimelineActivity.f69396E.getLayoutManager()).scrollToPositionWithOffset(i9, bangumiTimelineActivity.f69395D);
                if (i7 != bangumiTimelineActivity.f69398G.getCurrentItem()) {
                    bangumiTimelineActivity.f69398G.setCurrentItem(i7, z6);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f69414a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            BangumiTimelineDay bangumiTimelineDay = (BangumiTimelineDay) ((ArrayList) this.f69414a).get(i7);
            boolean z6 = i7 == this.f69415b;
            bVar.f69418b.setText(bangumiTimelineDay.c());
            bVar.f69420d.setText(bVar.itemView.getResources().getStringArray(2130903096)[bangumiTimelineDay.i() % 7].toString());
            boolean zN = bangumiTimelineDay.n();
            TintImageView tintImageView = bVar.f69417a;
            if (zN) {
                if (MultipleThemeUtils.isWhiteTheme(bVar.f69420d.getContext())) {
                    Drawable drawableWrap = DrawableCompat.wrap(AppCompatResources.getDrawable(bVar.f69420d.getContext(), 2131231351));
                    DrawableCompat.setTint(drawableWrap.mutate(), ThemeUtils.getColorById(bVar.f69420d.getContext(), R$color.Pi5));
                    tintImageView.setImageDrawable(drawableWrap);
                }
                tintImageView.setVisibility(0);
            } else {
                tintImageView.setVisibility(8);
            }
            TintImageView tintImageView2 = bVar.f69419c;
            if (!z6) {
                if (MultipleThemeUtils.isWhiteTheme(bVar.f69420d.getContext())) {
                    TextView textView = bVar.f69420d;
                    textView.setTextColor(ContextCompat.getColor(textView.getContext(), 2131103914));
                } else {
                    TextView textView2 = bVar.f69420d;
                    textView2.setTextColor(ContextCompat.getColor(textView2.getContext(), R.color.white));
                }
                tintImageView2.setVisibility(8);
                return;
            }
            tintImageView2.setVisibility(0);
            if (!MultipleThemeUtils.isWhiteTheme(bVar.f69420d.getContext())) {
                bVar.f69420d.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), 2131103271));
                return;
            }
            bVar.f69420d.setTextColor(ThemeUtils.getColorById(bVar.itemView.getContext(), R.color.white));
            Drawable drawable = AppCompatResources.getDrawable(bVar.f69420d.getContext(), 2131231350);
            DrawableCompat.setTint(drawable, ThemeUtils.getColorById(bVar.f69420d.getContext(), R$color.Pi5));
            Drawable drawableWrap2 = DrawableCompat.wrap(drawable);
            DrawableCompat.setTint(drawableWrap2.mutate(), ThemeUtils.getColorById(bVar.f69420d.getContext(), R$color.Pi5));
            tintImageView2.setImageDrawable(drawableWrap2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            final b bVar = new b(p.a(viewGroup, 2131493199, viewGroup, false));
            final BangumiTimelineActivity bangumiTimelineActivity = this.f69416c;
            bVar.itemView.setOnClickListener(new View.OnClickListener(bangumiTimelineActivity, bVar) { // from class: com.bilibili.ogv.misc.timeline.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiTimelineActivity f69449a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BangumiTimelineActivity.b f69450b;

                {
                    this.f69449a = bangumiTimelineActivity;
                    this.f69450b = bVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BangumiTimelineActivity bangumiTimelineActivity2 = this.f69449a;
                    int bindingAdapterPosition = this.f69450b.getBindingAdapterPosition();
                    bangumiTimelineActivity2.f69400I.f69429d = bindingAdapterPosition;
                    bangumiTimelineActivity2.f69397F.N(bindingAdapterPosition, true);
                }
            });
            return bVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelineActivity$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TintImageView f69417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f69418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TintImageView f69419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f69420d;

        public b(@NotNull View view) {
            super(view);
            this.f69417a = (TintImageView) view.findViewById(2131299711);
            this.f69418b = (TextView) view.findViewById(2131299916);
            this.f69419c = (TintImageView) view.findViewById(2131311067);
            this.f69420d = (TextView) view.findViewById(2131299914);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelineActivity$c.class */
    public final class c extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BangumiTimelineActivity f69421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final List<BangumiTimelineEntity.Filter> f69422b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BangumiTimelineActivity f69423c;

        public c(@NotNull BangumiTimelineActivity bangumiTimelineActivity, BangumiTimelineActivity bangumiTimelineActivity2) {
            this.f69423c = bangumiTimelineActivity;
            this.f69421a = bangumiTimelineActivity2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f69422b).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            d dVar = (d) viewHolder;
            BangumiTimelineEntity.Filter filter = (BangumiTimelineEntity.Filter) ((ArrayList) this.f69422b).get(i7);
            if (filter == null) {
                dVar.getClass();
                return;
            }
            dVar.f69424a.setText(filter.a());
            if (filter.f69559c) {
                dVar.f69424a.setTextColor(ThemeUtils.getColorById(dVar.itemView.getContext(), 2131103284));
            } else {
                dVar.f69424a.setTextColor(ThemeUtils.getColorById(dVar.itemView.getContext(), R$color.Ga10));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            final d dVar = new d(p.a(viewGroup, 2131493274, viewGroup, false));
            final BangumiTimelineActivity bangumiTimelineActivity = this.f69423c;
            dVar.itemView.setOnClickListener(new View.OnClickListener(bangumiTimelineActivity, dVar, this) { // from class: com.bilibili.ogv.misc.timeline.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiTimelineActivity f69451a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BangumiTimelineActivity.d f69452b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final BangumiTimelineActivity.c f69453c;

                {
                    this.f69451a = bangumiTimelineActivity;
                    this.f69452b = dVar;
                    this.f69453c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<BangumiTimelineEntity.Filter> list;
                    BangumiTimelineActivity bangumiTimelineActivity2 = this.f69451a;
                    BangumiTimelineActivity.d dVar2 = this.f69452b;
                    BangumiTimelineActivity.c cVar = this.f69453c;
                    PopupWindow popupWindow = bangumiTimelineActivity2.f69404M;
                    if (popupWindow != null && popupWindow.isShowing()) {
                        PopupWindow popupWindow2 = bangumiTimelineActivity2.f69404M;
                        Contract contractAb = ConfigManager.Companion.ab();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                            Thread threadCurrentThread = Thread.currentThread();
                            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                                IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                            }
                        }
                        popupWindow2.dismiss();
                    }
                    int bindingAdapterPosition = dVar2.getBindingAdapterPosition();
                    List<BangumiTimelineEntity.Filter> list2 = cVar.f69422b;
                    if (list2 == null || bindingAdapterPosition >= ((ArrayList) list2).size()) {
                        return;
                    }
                    BangumiTimelineEntity.Filter filter = (BangumiTimelineEntity.Filter) ((ArrayList) cVar.f69422b).get(bindingAdapterPosition);
                    if (bangumiTimelineActivity2.f69412U == filter.b()) {
                        return;
                    }
                    bangumiTimelineActivity2.f69403L.setText(filter.a());
                    bangumiTimelineActivity2.f69412U = filter.b();
                    bangumiTimelineActivity2.f69413V = filter.a();
                    BangumiTimelineActivity.c cVar2 = bangumiTimelineActivity2.f69406O;
                    if (cVar2 != null && (list = cVar2.f69422b) != null) {
                        for (BangumiTimelineEntity.Filter filter2 : (ArrayList) list) {
                            filter2.f69559c = filter.b() == filter2.b();
                        }
                        bangumiTimelineActivity2.f69406O.notifyDataSetChanged();
                        BangumiTimelineActivity bangumiTimelineActivity3 = cVar.f69421a;
                        BiliGlobalPreferenceHelper.getInstance(bangumiTimelineActivity3).setInteger("sp_timeline_filter_type", bangumiTimelineActivity2.f69412U);
                        BiliGlobalPreferenceHelper.getInstance(bangumiTimelineActivity3).setString("sp_timeline_filter_desc", filter.a());
                    }
                    bangumiTimelineActivity2.Q6();
                    Neurons.reportClick(false, "pgc.bangumi-timeline.filter.0.click", MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("type", String.valueOf(filter.b()))}));
                }
            });
            return dVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelineActivity$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f69424a;

        public d(@NotNull View view) {
            super(view);
            this.f69424a = (TextView) view.findViewById(2131297186);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelineActivity$e.class */
    public static final class e implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiTimelineActivity f69425a;

        public e(BangumiTimelineActivity bangumiTimelineActivity) {
            this.f69425a = bangumiTimelineActivity;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            BangumiTimelineActivity bangumiTimelineActivity = this.f69425a;
            bangumiTimelineActivity.f69400I.f69429d = i7;
            bangumiTimelineActivity.f69397F.N(i7, true);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Q6() {
        ComposeView composeView;
        if (((ArrayList) this.f69397F.f69414a).isEmpty() && (composeView = this.f69399H) != null) {
            Tl0.f.a(composeView);
        }
        if (this.f69411T) {
            this.f69398G.setVisibility(8);
        }
        s.f69481a.getClass();
        Single<BangumiTimelineEntity> timeline = s.a.f69483b.getTimeline(this.f69409R, this.f69408Q ? 1 : 0, this.f69412U, 0);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(timeline.subscribe(new H60.o(this), new com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.G(this)), getLifecycle());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.bangumi-timeline.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 8010) {
            this.f69408Q = Xpref.getSharedPreferences(getApplicationContext(), "bili_main_settings_preferences").getBoolean(getString(2131833490), false);
            this.f69397F.f69415b = -1;
            this.f69411T = true;
            Q6();
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Integer intOrNull;
        super.onCreate(bundle);
        setContentView(2131493011);
        Intent intent = getIntent();
        this.f69409R = intent.getStringExtra("timeline_type");
        this.f69412U = BiliGlobalPreferenceHelper.getInstance(this).optInteger("sp_timeline_filter_type", 0);
        this.f69413V = BiliGlobalPreferenceHelper.getInstance(this).optString("sp_timeline_filter_desc", MediaStrategyItem.SOURCE_FROM_ALL);
        this.f69396E = (RecyclerView) findViewById(2131299921);
        this.f69398G = (ViewPager) findViewById(2131309627);
        RecyclerView recyclerView = this.f69396E;
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(ThemeUtils.getColorById(this, 2131103971));
        }
        this.f69399H = (ComposeView) findViewById(2131303626);
        this.f69407P = (TintImageView) findViewById(2131304226);
        this.f69395D = (getResources().getDisplayMetrics().widthPixels / 2) - (Uj0.c.b(48.0f, this) / 2);
        String stringExtra = intent.getStringExtra("timeline_delay_id");
        this.f69410S = (stringExtra == null || (intOrNull = StringsKt.toIntOrNull(stringExtra)) == null) ? 0 : intOrNull.intValue();
        this.f69408Q = Xpref.getSharedPreferences(getApplicationContext(), "bili_main_settings_preferences").getBoolean(getString(2131833490), false);
        ensureToolbar();
        showBackButton();
        View viewInflate = getLayoutInflater().inflate(2131493273, (ViewGroup) null);
        this.f69405N = (RecyclerView) viewInflate.findViewById(2131310766);
        PopupWindow popupWindow = new PopupWindow(this, (AttributeSet) null, 0);
        this.f69404M = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f69404M.setWidth(Uj0.c.b(160.0f, this));
        this.f69404M.setHeight(-2);
        this.f69404M.setBackgroundDrawable(new ColorDrawable(0));
        this.f69404M.setOutsideTouchable(true);
        this.f69403L = (TextView) findViewById(2131301553);
        View viewFindViewById = findViewById(2131301540);
        this.f69402K = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new Nn0.d(this, 1));
        }
        View view = this.f69402K;
        if (view != null) {
            view.setVisibility(0);
        }
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure()) {
            TintImageView tintImageView = this.f69407P;
            if (tintImageView != null) {
                tintImageView.setImageTintList(2131103911);
            }
            TextView textView = this.f69403L;
            if (textView != null) {
                textView.setTextColor(ThemeUtils.getColorById(this, 2131103914));
            }
        } else {
            TintImageView tintImageView2 = this.f69407P;
            if (tintImageView2 != null) {
                tintImageView2.setImageDrawable(ThemeUtils.tintDrawable(tintImageView2.getDrawable(), curGarb.getFontColor()));
            }
            TextView textView2 = this.f69403L;
            if (textView2 != null) {
                textView2.setTextColor(curGarb.getFontColor());
            }
        }
        if (com.bilibili.ogv.infra.account.a.f67852b.isLogin() || this.f69412U != 2) {
            return;
        }
        this.f69412U = 0;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        this.f69405N.setLayoutManager(new LinearLayoutManager(this, 1, false));
        c cVar = new c(this, this);
        this.f69406O = cVar;
        this.f69405N.setAdapter(cVar);
        this.f69396E.setLayoutManager(new LinearLayoutManager(this, 0, false));
        RecyclerView.ItemAnimator itemAnimator = this.f69396E.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
            itemAnimator.setChangeDuration(0L);
            itemAnimator.setMoveDuration(0L);
            itemAnimator.setRemoveDuration(0L);
            if (itemAnimator instanceof SimpleItemAnimator) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
        }
        a aVar = new a(this);
        this.f69397F = aVar;
        this.f69396E.setAdapter(aVar);
        BangumiTimelinePagerAdapter bangumiTimelinePagerAdapter = new BangumiTimelinePagerAdapter(getSupportFragmentManager());
        this.f69400I = bangumiTimelinePagerAdapter;
        this.f69398G.setAdapter(bangumiTimelinePagerAdapter);
        this.f69398G.addOnPageChangeListener(this.f69401J);
        Q6();
    }
}
