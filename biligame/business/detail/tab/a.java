package com.bilibili.biligame.business.detail.tab;

import Ir.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.biligame.adapters.BaseExposeSectionAdapter;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.BookAward;
import com.bilibili.biligame.api.NoticeInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameOfficialAccount;
import com.bilibili.biligame.api.bean.gamedetail.GamePlatformGrade;
import com.bilibili.biligame.api.bean.gamedetail.GameRole;
import com.bilibili.biligame.api.bean.gamedetail.GameTestRecruitInfo;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.api.bean.gamedetail.SimpleGame;
import com.bilibili.biligame.api.bean.gamedetail.VideoPage;
import com.bilibili.biligame.business.detail.widget.NoticeViewSwitcher;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.utils.Utils;
import com.bilibili.biligame.widget.BiligameExpandableTextView;
import com.bilibili.biligame.widget.viewholder.BaseExposeViewHolder;
import com.bilibili.biligame.widget.viewholder.BaseListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import wo.C;
import wo.C8904c;
import wo.D;
import wo.h;
import wo.l;
import wo.s;
import wo.t;
import wo.u;
import wo.v;
import wo.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/a.class */
@StabilityInferred(parameters = 0)
public final class a extends BaseExposeSectionAdapter implements d.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LayoutInflater f62561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f62562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public GameDetailContent f62563g;

    @Nullable
    public GameDetailInfo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public GamePlatformGrade f62564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<? extends SimpleGame> f62565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<? extends BiligameMainGame> f62566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public List<? extends GameRole> f62567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public List<? extends RecommendComment> f62568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public VideoPage f62569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public GameOfficialAccount f62570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public GameTestRecruitInfo f62571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @JvmField
    @Nullable
    public GameOfficialAccount f62572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public List<? extends NoticeInfo> f62573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public BookAward f62574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f62576u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f62578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public ReportExtra f62579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, Boolean> f62580y;

    /* JADX INFO: renamed from: com.bilibili.biligame.business.detail.tab.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0344a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Paint f62583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Drawable f62584d;

        public C0344a(@NotNull Context context) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131165605);
            this.f62582b = dimensionPixelOffset;
            context.getResources().getDimensionPixelOffset(2131165647);
            this.f62581a = context.getResources().getDimensionPixelOffset(2131165611);
            Paint paint = new Paint();
            this.f62583c = paint;
            float f7 = dimensionPixelOffset;
            paint.setStrokeWidth(f7);
            paint.setColor(ContextCompat.getColor(context, 2131100105));
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            paint2.setStrokeWidth(f7);
            paint2.setColor(ContextCompat.getColor(context, 2131100105));
            paint2.setAntiAlias(true);
            this.f62584d = ContextCompat.getDrawable(context, 2131232960);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (childViewHolder == null) {
                return;
            }
            int itemViewType = childViewHolder.getItemViewType();
            int i7 = this.f62581a;
            if (itemViewType != 8 && itemViewType != 10) {
                rect.top = i7;
            }
            if (childViewHolder.getAdapterPosition() == state.getItemCount() - 1) {
                rect.bottom = i7;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            int adapterPosition;
            BaseSectionAdapter.Section section;
            super.onDrawOver(canvas, recyclerView, state);
            if (recyclerView.getAdapter() instanceof BaseSectionAdapter) {
                BaseSectionAdapter adapter = recyclerView.getAdapter();
                int childCount = recyclerView.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    Ir.d childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i7));
                    if ((childViewHolder instanceof Ir.d) && (section = adapter.getSection((adapterPosition = childViewHolder.getAdapterPosition()))) != null) {
                        if ((adapterPosition - section.start) - (section.headerViewType > 0 ? 1 : 0) > 0) {
                            canvas.drawRect(r0.getLeft(), r0.getTop() - this.f62582b, r0.getRight(), r0.getTop(), this.f62583c);
                        }
                    }
                }
            }
        }
    }

    public a(@NotNull LayoutInflater layoutInflater) {
        this.f62561e = layoutInflater;
        new RecyclerView.RecycledViewPool();
        this.f62580y = new ArrayMap<>();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, vo.a] */
    public final void O(@Nullable BookAward bookAward) {
        this.f62574s = bookAward;
        if (!Utils.isEmpty(bookAward.rewardList)) {
            List<BookAward.BookAwardInfo> list = this.f62574s.rewardList;
            final ?? obj = new Object();
            Collections.sort(list, new Comparator(obj) { // from class: vo.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f128316a;

                {
                    this.f128316a = obj;
                }

                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((Number) this.f128316a.invoke(obj2, obj3)).intValue();
                }
            });
        }
        notifySectionData();
    }

    public final void P(@Nullable GameDetailInfo gameDetailInfo, @Nullable GameDetailContent gameDetailContent) {
        if (gameDetailInfo == null || gameDetailContent == null) {
            return;
        }
        this.h = gameDetailInfo;
        this.f62563g = gameDetailContent;
        this.f62576u = gameDetailInfo.showRecruit;
        GameTestRecruitInfo gameTestRecruitInfo = gameDetailInfo.gameTestRecruitInfo;
        this.f62571p = gameTestRecruitInfo;
        if (gameTestRecruitInfo != null) {
            gameTestRecruitInfo.setBooked(gameDetailInfo.booked);
        }
        GameTestRecruitInfo gameTestRecruitInfo2 = this.f62571p;
        if (gameTestRecruitInfo2 != null) {
            gameTestRecruitInfo2.setGameName(gameDetailInfo.mainGameName);
        }
        notifySectionData();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x046a  */
    /* JADX WARN: Type inference failed for: r0v77, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object, wo.s] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bindHolder(@org.jetbrains.annotations.NotNull tv.danmaku.bili.widget.section.holder.BaseViewHolder r8, int r9, @org.jetbrains.annotations.NotNull android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 2562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.tab.a.bindHolder(tv.danmaku.bili.widget.section.holder.BaseViewHolder, int, android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [com.bilibili.biligame.widget.viewholder.BaseExposeViewHolder, wo.g] */
    @NotNull
    public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
        BaseViewHolder baseExposeViewHolder;
        Resources resources = viewGroup.getResources();
        HashMap map = null;
        switch (i7) {
            case 0:
                baseExposeViewHolder = new BaseExposeViewHolder(this.f62561e.inflate(2131497042, viewGroup, false), this);
                baseExposeViewHolder.f128761g = (TextView) baseExposeViewHolder.itemView.findViewById(2131309771);
                break;
            case 1:
                LayoutInflater layoutInflater = this.f62561e;
                View viewInflate = layoutInflater.inflate(2131497074, viewGroup, false);
                baseExposeViewHolder = new BaseExposeViewHolder(viewInflate, this);
                ((TextView) viewInflate.findViewById(2131310619)).setText(2131823383);
                baseExposeViewHolder.h = (LinearLayout) viewInflate.findViewById(2131305583);
                baseExposeViewHolder.f128709g = layoutInflater;
                break;
            case 2:
                View viewInflate2 = this.f62561e.inflate(2131497045, viewGroup, false);
                baseExposeViewHolder = new BaseExposeViewHolder(viewInflate2, this);
                NoticeViewSwitcher noticeViewSwitcher = (NoticeViewSwitcher) viewInflate2;
                baseExposeViewHolder.f128870j = noticeViewSwitcher;
                v.a aVar = new v.a(baseExposeViewHolder);
                baseExposeViewHolder.f128869i = aVar;
                noticeViewSwitcher.setAdapter(aVar);
                break;
            case 3:
                View viewInflate3 = this.f62561e.inflate(2131497041, viewGroup, false);
                baseExposeViewHolder = new BaseExposeViewHolder(viewInflate3, this);
                BiligameExpandableTextView biligameExpandableTextViewFindViewById = viewInflate3.findViewById(2131301282);
                baseExposeViewHolder.f128823g = biligameExpandableTextViewFindViewById;
                biligameExpandableTextViewFindViewById.setLines(3);
                View viewFindViewById = viewInflate3.findViewById(2131304821);
                baseExposeViewHolder.f128826k = viewFindViewById;
                BiligameExpandableTextView biligameExpandableTextViewFindViewById2 = viewFindViewById.findViewById(2131301283);
                baseExposeViewHolder.h = biligameExpandableTextViewFindViewById2;
                biligameExpandableTextViewFindViewById2.setLines(4);
                baseExposeViewHolder.f128827l = (TextView) viewInflate3.findViewById(2131314467);
                RecyclerView recyclerView = (RecyclerView) viewInflate3.findViewById(2131310736);
                baseExposeViewHolder.f128828m = recyclerView;
                recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate3.getContext(), 0, false));
                recyclerView.setNestedScrollingEnabled(false);
                break;
            case 4:
                baseExposeViewHolder = new BaseExposeViewHolder(this.f62561e.inflate(2131497049, viewGroup, false), this);
                break;
            case 5:
                LayoutInflater layoutInflater2 = this.f62561e;
                resources.getString(2131823742);
                int i8 = u.h;
                View viewInflate4 = layoutInflater2.inflate(2131497050, viewGroup, false);
                baseExposeViewHolder = new BaseExposeViewHolder(viewInflate4, this);
                ((TextView) viewInflate4.findViewById(2131310619)).setText(2131823742);
                RecyclerView recyclerView2 = (RecyclerView) viewInflate4.findViewById(2131306595);
                recyclerView2.setLayoutManager(new LinearLayoutManager(viewInflate4.getContext(), 0, false));
                BaseAdapter baseListAdapter = new BaseListAdapter(layoutInflater2);
                baseExposeViewHolder.f128865g = baseListAdapter;
                recyclerView2.setAdapter(baseListAdapter);
                baseListAdapter.setHandleClickListener(((BaseAdapter) this).mHandleClickListener);
                recyclerView2.addItemDecoration(new t(viewInflate4.getResources().getDimensionPixelOffset(2131165611)));
                break;
            case 6:
                LayoutInflater layoutInflater3 = this.f62561e;
                String string = resources.getString(2131823516);
                baseExposeViewHolder = new BaseExposeViewHolder(layoutInflater3.inflate(2131497061, viewGroup, false), this);
                ((TextView) baseExposeViewHolder.itemView.findViewById(2131310619)).setText(string);
                BiligameExpandableTextView biligameExpandableTextViewFindViewById3 = baseExposeViewHolder.itemView.findViewById(2131301281);
                baseExposeViewHolder.f128876g = biligameExpandableTextViewFindViewById3;
                biligameExpandableTextViewFindViewById3.setLines(2);
                baseExposeViewHolder.h = (TextView) baseExposeViewHolder.itemView.findViewById(2131315461);
                baseExposeViewHolder.f128877i = (TextView) baseExposeViewHolder.itemView.findViewById(2131315458);
                break;
            case 7:
                LayoutInflater layoutInflater4 = this.f62561e;
                boolean z6 = this.f62577v;
                View viewInflate5 = layoutInflater4.inflate(2131497054, viewGroup, false);
                baseExposeViewHolder = new BaseExposeViewHolder(viewInflate5, this);
                ViewGroup viewGroup2 = (ViewGroup) viewInflate5;
                baseExposeViewHolder.f128857g = viewGroup2;
                View viewFindViewById2 = viewGroup2.findViewById(2131304834);
                ?? baseExposeViewHolder2 = new BaseExposeViewHolder(viewFindViewById2, this);
                baseExposeViewHolder2.f128811g = viewFindViewById2.findViewById(2131304586);
                baseExposeViewHolder2.h = (TextView) viewFindViewById2.findViewById(2131315486);
                baseExposeViewHolder2.f128812i = (TextView) viewFindViewById2.findViewById(2131315492);
                baseExposeViewHolder2.f128813j = (TextView) viewFindViewById2.findViewById(2131314558);
                baseExposeViewHolder2.f128814k = (ImageView) viewFindViewById2.findViewById(2131304598);
                baseExposeViewHolder.f128861l = baseExposeViewHolder2;
                baseExposeViewHolder.f128859j = layoutInflater4;
                baseExposeViewHolder.f128862m = viewGroup2.getResources().getDisplayMetrics().widthPixels;
                baseExposeViewHolder.f128863n = z6;
                break;
            case 8:
                baseExposeViewHolder = new y(this.f62561e, viewGroup, this);
                break;
            case 9:
            case 13:
            case 18:
            default:
                baseExposeViewHolder = null;
                break;
            case 10:
                baseExposeViewHolder = new C8904c(this.f62561e, viewGroup, this, this.h.commentCount);
                break;
            case 11:
                baseExposeViewHolder = new l(viewGroup, this, resources.getString(2131823734), i7);
                break;
            case 12:
                baseExposeViewHolder = new l(viewGroup, this, resources.getString(2131823644), i7);
                break;
            case 14:
                LayoutInflater layoutInflater5 = this.f62561e;
                View viewInflate6 = layoutInflater5.inflate(2131496753, viewGroup, false);
                baseExposeViewHolder = new BaseExposeViewHolder(viewInflate6, this);
                baseExposeViewHolder.f128815g = (ProgressBar) viewInflate6.findViewById(2131306078);
                RecyclerView recyclerView3 = (RecyclerView) viewInflate6.findViewById(2131306595);
                recyclerView3.setLayoutManager(new LinearLayoutManager(viewInflate6.getContext(), 1, false));
                BaseAdapter bVar = new h.b(baseExposeViewHolder, layoutInflater5);
                baseExposeViewHolder.h = bVar;
                recyclerView3.setAdapter(bVar);
                recyclerView3.setNestedScrollingEnabled(false);
                bVar.setHandleClickListener(((BaseAdapter) this).mHandleClickListener);
                break;
            case 15:
                baseExposeViewHolder = new com.bilibili.biligame.widget.viewholder.a(this.f62561e, viewGroup, this);
                break;
            case 16:
                int i9 = C.f128734i;
                LayoutInflater layoutInflater6 = this.f62561e;
                baseExposeViewHolder = new C(layoutInflater6, layoutInflater6.inflate(2131497062, viewGroup, false), this, this.f62563g.supportLanguage);
                break;
            case 17:
                baseExposeViewHolder = new BaseExposeViewHolder(this.f62561e.inflate(2131497079, viewGroup, false), this);
                baseExposeViewHolder.f128715g = (TextView) baseExposeViewHolder.itemView.findViewById(2131312742);
                baseExposeViewHolder.h = (RatingBar) baseExposeViewHolder.itemView.findViewById(2131308360);
                baseExposeViewHolder.f128716i = (RatingBar) baseExposeViewHolder.itemView.findViewById(2131309865);
                baseExposeViewHolder.f128717j = (TextView) baseExposeViewHolder.itemView.findViewById(2131314992);
                baseExposeViewHolder.f128718k = (TextView) baseExposeViewHolder.itemView.findViewById(2131315295);
                baseExposeViewHolder.f128719l = (TextView) baseExposeViewHolder.itemView.findViewById(2131315296);
                baseExposeViewHolder.f128720m = (TextView) baseExposeViewHolder.itemView.findViewById(2131315297);
                baseExposeViewHolder.f128721n = (TextView) baseExposeViewHolder.itemView.findViewById(2131315298);
                baseExposeViewHolder.f128722o = (TextView) baseExposeViewHolder.itemView.findViewById(2131315299);
                baseExposeViewHolder.f128723p = (TextView) baseExposeViewHolder.itemView.findViewById(2131314585);
                baseExposeViewHolder.f128724q = (TextView) baseExposeViewHolder.itemView.findViewById(2131315290);
                baseExposeViewHolder.f128725r = (TextView) baseExposeViewHolder.itemView.findViewById(2131315291);
                baseExposeViewHolder.f128726s = (TextView) baseExposeViewHolder.itemView.findViewById(2131315292);
                baseExposeViewHolder.f128727t = (TextView) baseExposeViewHolder.itemView.findViewById(2131315293);
                baseExposeViewHolder.f128728u = (TextView) baseExposeViewHolder.itemView.findViewById(2131315294);
                baseExposeViewHolder.f128729v = baseExposeViewHolder.itemView.findViewById(2131300281);
                baseExposeViewHolder.f128730w = (ConstraintLayout) baseExposeViewHolder.itemView.findViewById(2131316120);
                baseExposeViewHolder.f128731x = (ConstraintLayout) baseExposeViewHolder.itemView.findViewById(2131305584);
                baseExposeViewHolder.f128732y = (ProgressBar) baseExposeViewHolder.itemView.findViewById(2131307964);
                baseExposeViewHolder.f128733z = (ProgressBar) baseExposeViewHolder.itemView.findViewById(2131307965);
                baseExposeViewHolder.f128710A = (ProgressBar) baseExposeViewHolder.itemView.findViewById(2131307966);
                baseExposeViewHolder.f128711B = (ProgressBar) baseExposeViewHolder.itemView.findViewById(2131307967);
                baseExposeViewHolder.f128712C = (ProgressBar) baseExposeViewHolder.itemView.findViewById(2131307968);
                baseExposeViewHolder.f128713D = (LinearLayout) baseExposeViewHolder.itemView.findViewById(2131304594);
                baseExposeViewHolder.f128714E = (LinearLayout) baseExposeViewHolder.itemView.findViewById(2131304595);
                break;
            case 19:
                baseExposeViewHolder = new D(p.a(viewGroup, 2131496776, viewGroup, false), this);
                break;
        }
        BaseViewHolder baseViewHolder = baseExposeViewHolder != null ? baseExposeViewHolder : null;
        if (baseViewHolder != null) {
            ReportExtra reportExtra = this.f62579x;
            if (reportExtra != null) {
                map = reportExtra.toMap();
            }
            baseViewHolder.setExtra(map);
        }
        return baseExposeViewHolder;
    }

    public final void fillSectionList(@NotNull BaseSectionAdapter.SectionManager sectionManager) {
        GameDetailContent gameDetailContent;
        if (this.h == null || (gameDetailContent = this.f62563g) == null) {
            return;
        }
        if (!TextUtils.isEmpty(gameDetailContent.activityImage) && !TextUtils.isEmpty(this.f62563g.activityUrl)) {
            sectionManager.addSectionWithNone(1, 15);
        }
        if (!Utils.isEmpty(this.f62573r)) {
            sectionManager.addSectionWithNone(1, 2);
        }
        BookAward bookAward = this.f62574s;
        if (bookAward != null && !Utils.isEmpty(bookAward.rewardList)) {
            sectionManager.addSectionWithNone(1, 14);
        }
        if (!TextUtils.isEmpty(this.f62563g.bookGuideContent) && this.f62563g.mainGameBaseId > 0) {
            sectionManager.addSectionWithNone(1, 0);
        }
        if (this.h.source == 3 && !Utils.isEmpty(this.f62563g.sellInfo)) {
            sectionManager.addSectionWithNone(1, 16);
        }
        if (this.h.source == 3 && !Utils.isEmpty(this.f62563g.scoreList)) {
            sectionManager.addSectionWithNone(1, 1);
        }
        if (this.f62575t) {
            sectionManager.addSectionWithNone(1, 4);
        }
        if (this.f62576u && this.f62571p != null) {
            sectionManager.addSectionWithNone(1, 19);
        }
        if (!TextUtils.isEmpty(this.f62563g.desc)) {
            sectionManager.addSectionWithNone(1, 3);
        }
        VideoPage videoPage = this.f62569n;
        if (videoPage != null && !Utils.isEmpty(videoPage.list)) {
            sectionManager.addSectionWithNone(1, 8);
        }
        if (this.f62564i != null) {
            sectionManager.addSectionWithNone(1, 17);
        }
        if (!Utils.isEmpty(this.f62567l)) {
            sectionManager.addSectionWithNone(1, 5);
        }
        if (!TextUtils.isEmpty(this.f62563g.latestUpdate)) {
            sectionManager.addSectionWithNone(1, 6);
        }
        if (!Utils.isEmpty(this.f62568m)) {
            sectionManager.addSectionWithNone(1, 10);
        }
        if (!Utils.isEmpty(this.f62566k)) {
            sectionManager.addSectionWithNone(1, 12);
        }
        if (!Utils.isEmpty(this.f62565j)) {
            sectionManager.addSectionWithNone(1, 11);
        }
        sectionManager.addSectionWithNone(1, 7);
    }

    @Override // com.bilibili.biligame.adapters.BaseExposeSectionAdapter
    @NotNull
    public final String getExposeId() {
        return String.valueOf(this.h.gameBaseId);
    }

    @Override // com.bilibili.biligame.adapters.BaseExposeSectionAdapter
    @NotNull
    public final String getExposeType() {
        return "game_detail";
    }

    public final boolean isExpanded(@Nullable String str) {
        return this.f62580y.containsKey(str);
    }

    @Override // com.bilibili.biligame.adapters.BaseExposeSectionAdapter
    public final boolean isStartExpose(@NotNull BaseViewHolder baseViewHolder) {
        return this.f62578w;
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f62562f = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
        s sVar = (BaseViewHolder) viewHolder;
        if (list.isEmpty()) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onBindViewHolder(sVar, i7, list);
        } else if (sVar instanceof s) {
            sVar.p0(this.f62570o);
        }
    }

    public final void onExpandChanged(@NotNull RecommendComment recommendComment, boolean z6) {
        ArrayMap<String, Boolean> arrayMap = this.f62580y;
        Boolean bool = arrayMap.get(recommendComment.commentNo);
        if (!z6) {
            arrayMap.remove(recommendComment.commentNo);
        } else if (bool == null || !bool.booleanValue()) {
            arrayMap.put(recommendComment.commentNo, Boolean.TRUE);
        }
    }

    @Override // com.bilibili.biligame.adapters.BaseExposeSectionAdapter
    public final void onViewAttachedToWindow(@NotNull BaseViewHolder baseViewHolder) {
        super.onViewAttachedToWindow(baseViewHolder);
        if (baseViewHolder instanceof v) {
            NoticeViewSwitcher noticeViewSwitcher = ((v) baseViewHolder).f128870j;
            noticeViewSwitcher.f62712a.removeMessages(0);
            NoticeViewSwitcher.a aVar = noticeViewSwitcher.f62714c;
            if (aVar != null) {
                ArrayList<NoticeInfo> arrayList = ((v.a) aVar).f128872a;
                if ((arrayList == null ? 0 : arrayList.size()) <= 1) {
                    return;
                }
                noticeViewSwitcher.f62712a.sendEmptyMessageDelayed(0, noticeViewSwitcher.f62713b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        v vVar = (BaseViewHolder) viewHolder;
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(vVar);
        if (vVar instanceof v) {
            vVar.f128870j.f62712a.removeMessages(0);
        }
    }
}
