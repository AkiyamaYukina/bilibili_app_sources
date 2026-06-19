package com.bilibili.music.podcast.legacy.fragment;

import Bi0.C1433c;
import Bi0.g;
import Bi0.h;
import Qi0.C2836f;
import ZS0.J1;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b60.r;
import bj0.AbstractC5110a;
import bj0.C5112c;
import bj0.ViewOnClickListenerC5111b;
import com.bilibili.app.comm.supermenu.SuperMenu;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.music.podcast.legacy.contribute.ContributePresenter;
import com.bilibili.music.podcast.legacy.data.ContributionPage;
import com.bilibili.music.podcast.legacy.fragment.ContributionsFragment;
import com.bilibili.music.podcast.view.LoadingErrorEmptyView;
import com.bilibili.music.podcast.view.dropdownmenu.DropDownMenuContent;
import com.bilibili.music.podcast.view.dropdownmenu.DropDownMenuHead;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SpacesItemDecoration;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import ui0.DialogC8736a;
import vi0.C8816f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/ContributionsFragment.class */
public final class ContributionsFragment extends BaseFragment implements SwipeRefreshLayout.OnRefreshListener, C1433c.a, SuperMenu.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DropDownMenuHead f66824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DropDownMenuContent f66825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f66826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LoadingErrorEmptyView f66827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DialogC8736a f66828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SwipeRefreshLayout f66829g;
    public String[] h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f66830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f66831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f66832k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContributePresenter f66834m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66836o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArrayList<ContributionPage.Contribution> f66833l = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f66835n = LazyKt.lazy(new J1(this, 7));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f66837p = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/ContributionsFragment$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContributionsFragment f66838a;

        public a(ContributionsFragment contributionsFragment) {
            this.f66838a = contributionsFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f66838a.f66833l.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            ContributionPage.Contribution contribution = this.f66838a.f66833l.get(i7);
            bVar.getClass();
            int status = contribution.getStatus();
            TextView textView = bVar.f66843e;
            int i8 = bVar.f66840b;
            int i9 = bVar.f66839a;
            textView.setVisibility((status == i9 || status == i8) ? 8 : 0);
            bVar.f66844f.setVisibility(status == i9 ? 0 : 8);
            View view = bVar.f66845g;
            int i10 = 8;
            if (status == i8) {
                i10 = 0;
            }
            view.setVisibility(i10);
            if (contribution.isContributor()) {
                g.b(bVar.f66842d, contribution.getTitle());
            } else {
                bVar.f66842d.setText(contribution.getTitle());
            }
            if (contribution.getReason() != null) {
                bVar.f66843e.setText(bVar.itemView.getContext().getString(2131831685, contribution.getReason()));
            }
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            BiliImageView biliImageView = bVar.f66841c;
            ImageRequestBuilder.placeholderImageResId$default(biliImageLoader.with(biliImageView.getContext()).url(contribution.getCoverUrl()), 2131238203, (ScaleType) null, 2, (Object) null).into(biliImageView);
            if (contribution.getStatus() == i8) {
                bVar.h.setText(h.a(contribution.getPlayNum()));
                bVar.f66846i.setText(h.a(contribution.getCommentNum()));
                bVar.f66847j.setText(h.a(contribution.getCollectNum()));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            final b bVar = new b(p.a(viewGroup, 2131499527, viewGroup, false));
            View view = bVar.itemView;
            final ContributionsFragment contributionsFragment = this.f66838a;
            view.setOnClickListener(new View.OnClickListener(contributionsFragment, bVar) { // from class: vi0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ContributionsFragment f128260a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ContributionsFragment.b f128261b;

                {
                    this.f128260a = contributionsFragment;
                    this.f128261b = bVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ContributionsFragment contributionsFragment2 = this.f128260a;
                    ContributionPage.Contribution contribution = contributionsFragment2.f66833l.get(this.f128261b.getAdapterPosition());
                    if (contribution.getStatus() == 2) {
                        Router.Companion.global().with(contributionsFragment2.getContext()).open("bilibili://music/detail/" + contribution.getId() + "?from=audiomanager");
                    }
                }
            });
            bVar.f66848k.setOnClickListener(new View.OnClickListener(contributionsFragment, bVar) { // from class: vi0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ContributionsFragment f128262a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ContributionsFragment.b f128263b;

                {
                    this.f128262a = contributionsFragment;
                    this.f128263b = bVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i8;
                    ContributionsFragment contributionsFragment2 = this.f128262a;
                    int adapterPosition = this.f128263b.getAdapterPosition();
                    contributionsFragment2.f66837p = adapterPosition;
                    if (adapterPosition >= contributionsFragment2.f66833l.size() || (i8 = contributionsFragment2.f66837p) == -1) {
                        return;
                    }
                    boolean z6 = contributionsFragment2.f66833l.get(i8).getStatus() == 2;
                    pj.a aVar = new pj.a(contributionsFragment2.getContext());
                    if (z6) {
                        aVar.b("copy_link", 2131238265, contributionsFragment2.getString(2131848168));
                        aVar.b("share", 2131238266, contributionsFragment2.getString(2131848219));
                    }
                    aVar.b("delete", 2131238264, contributionsFragment2.getString(2131848221));
                    SuperMenu.with(contributionsFragment2.p3()).addMenus(aVar.build()).itemClickListener(contributionsFragment2).scene("audioplay").show();
                }
            });
            bVar.f66843e.setOnClickListener(new View.OnClickListener(contributionsFragment, bVar) { // from class: vi0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ContributionsFragment f128264a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ContributionsFragment.b f128265b;

                {
                    this.f128264a = contributionsFragment;
                    this.f128265b = bVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uriBuild = Uri.parse("bilibili://music/contribution/err").buildUpon().appendQueryParameter("key_err_message", this.f128264a.f66833l.get(this.f128265b.getAdapterPosition()).getReason()).build();
                    Context context = view2.getContext();
                    if (uriBuild != null) {
                        C2836f.c(context, uriBuild.toString());
                    }
                }
            });
            return bVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/ContributionsFragment$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BiliImageView f66841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f66842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f66843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f66844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final View f66845g;
        public final TextView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f66846i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f66847j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final View f66848k;

        public b(@NotNull View view) {
            super(view);
            this.f66839a = 1;
            this.f66840b = 2;
            this.f66841c = this.itemView.findViewById(2131298941);
            this.f66842d = (TextView) this.itemView.findViewById(2131308958);
            this.f66843e = (TextView) this.itemView.findViewById(2131301140);
            this.f66844f = (TextView) this.itemView.findViewById(2131316104);
            this.f66845g = this.itemView.findViewById(2131316095);
            this.h = (TextView) this.itemView.findViewById(2131314762);
            this.f66846i = (TextView) this.itemView.findViewById(2131314317);
            this.f66847j = (TextView) this.itemView.findViewById(2131314540);
            this.f66848k = this.itemView.findViewById(2131307573);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/ContributionsFragment$c.class */
    public static final class c extends AbstractC5110a<C5112c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ArrayList<C5112c> f66849a;

        @Override // bj0.AbstractC5110a
        public final void N(@Nullable ArrayList<C5112c> arrayList) {
            this.f66849a = arrayList;
        }

        public final void bindHolder(@Nullable BaseViewHolder baseViewHolder, int i7, @Nullable View view) {
            if (baseViewHolder instanceof d) {
                d dVar = (d) baseViewHolder;
                ArrayList<C5112c> arrayList = this.f66849a;
                C5112c c5112c = arrayList != null ? arrayList.get(i7) : null;
                dVar.f66850b.setText(c5112c.f56689a);
                dVar.f66850b.setSelected(c5112c.f56690b);
            }
        }

        @NotNull
        public final BaseViewHolder createHolder(@Nullable ViewGroup viewGroup, int i7) {
            return new d(LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(2131499528, viewGroup, false), this);
        }

        public final int getItemCount() {
            ArrayList<C5112c> arrayList = this.f66849a;
            return arrayList != null ? arrayList.size() : 0;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/ContributionsFragment$d.class */
    public static final class d extends BaseViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f66850b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull View view, @NotNull c cVar) {
            super(view, cVar);
            this.f66850b = (TextView) this.itemView.findViewById(2131304923);
        }
    }

    @Override // Bi0.C1433c.a
    public final boolean hasNextPage() {
        return this.f66836o;
    }

    @Override // Bi0.C1433c.a
    public final boolean isLoading() {
        ContributePresenter contributePresenter = this.f66834m;
        ContributePresenter contributePresenter2 = contributePresenter;
        if (contributePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            contributePresenter2 = null;
        }
        return contributePresenter2.f66819e;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499513, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onItemClick(@org.jetbrains.annotations.NotNull com.bilibili.app.comm.supermenu.core.IMenuItem r7) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.legacy.fragment.ContributionsFragment.onItemClick(com.bilibili.app.comm.supermenu.core.IMenuItem):boolean");
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        ContributePresenter contributePresenter = this.f66834m;
        ContributePresenter contributePresenter2 = contributePresenter;
        if (contributePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            contributePresenter2 = null;
        }
        contributePresenter2.f66818d = 1;
        contributePresenter2.b(true);
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [bj0.a, tv.danmaku.bili.widget.section.adapter.BaseAdapter] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.app.Dialog, ui0.a] */
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
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String[] strArr;
        String str;
        super.onViewCreated(view, bundle);
        this.f66824b = (DropDownMenuHead) view.findViewById(2131300347);
        this.f66825c = (DropDownMenuContent) view.findViewById(2131300346);
        this.f66826d = (RecyclerView) view.findViewById(2131310064);
        this.f66827e = (LoadingErrorEmptyView) view.findViewById(2131301021);
        Context contextRequireContext = requireContext();
        String string = getString(2131831683);
        ?? dialog = new Dialog(contextRequireContext, 2131887170);
        dialog.setContentView(2131499549);
        ((TextView) dialog.findViewById(2131305845)).setText(string);
        this.f66828f = dialog;
        this.f66829g = (SwipeRefreshLayout) view.findViewById(2131312769);
        this.h = new String[]{getString(2131846311), getString(2131847024)};
        this.f66830i = new String[]{getString(2131846311), getString(2131847266), getString(2131841534), getString(2131846244)};
        this.f66831j = new String[]{getString(2131847024), getString(2131847024), getString(2131846044)};
        this.f66834m = new ContributePresenter(this, LifecycleOwnerKt.getLifecycleScope(this));
        this.f66832k = new a(this);
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = this.h;
        String[] strArr3 = strArr2;
        if (strArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMenuArray");
            strArr3 = null;
        }
        int length = strArr3.length;
        for (int i7 = 0; i7 < length; i7++) {
            C5112c c5112c = new C5112c();
            String[] strArr4 = this.h;
            String[] strArr5 = strArr4;
            if (strArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMenuArray");
                strArr5 = null;
            }
            c5112c.f56689a = strArr5[i7];
            arrayList.add(c5112c);
            c5112c.f56691c = new ArrayList();
            if (i7 == 0) {
                String[] strArr6 = this.f66830i;
                strArr = strArr6;
                if (strArr6 == null) {
                    str = "mSubMenuArray1";
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    strArr = null;
                }
            } else {
                String[] strArr7 = this.f66831j;
                strArr = strArr7;
                if (strArr7 == null) {
                    str = "mSubMenuArray2";
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                    strArr = null;
                }
            }
            int length2 = strArr.length;
            int i8 = 0;
            while (i8 < length2) {
                C5112c c5112c2 = new C5112c();
                c5112c2.f56689a = strArr[i8];
                c5112c2.f56690b = i8 == 0;
                ((ArrayList) c5112c.f56691c).add(c5112c2);
                i8++;
            }
        }
        DropDownMenuContent dropDownMenuContent = this.f66825c;
        DropDownMenuContent dropDownMenuContent2 = dropDownMenuContent;
        if (dropDownMenuContent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent2 = null;
        }
        dropDownMenuContent2.setSpanCount(12);
        DropDownMenuContent dropDownMenuContent3 = this.f66825c;
        DropDownMenuContent dropDownMenuContent4 = dropDownMenuContent3;
        if (dropDownMenuContent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent4 = null;
        }
        dropDownMenuContent4.setSpanLookUp(new C8816f(this));
        DropDownMenuContent dropDownMenuContent5 = this.f66825c;
        DropDownMenuContent dropDownMenuContent6 = dropDownMenuContent5;
        if (dropDownMenuContent5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent6 = null;
        }
        dropDownMenuContent6.setItemDecoration(new SpacesItemDecoration(getResources().getDimensionPixelSize(2131166076), 4));
        DropDownMenuContent dropDownMenuContent7 = this.f66825c;
        DropDownMenuContent dropDownMenuContent8 = dropDownMenuContent7;
        if (dropDownMenuContent7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent8 = null;
        }
        RecyclerView recyclerView = dropDownMenuContent8.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
        DropDownMenuHead dropDownMenuHead = this.f66824b;
        DropDownMenuHead dropDownMenuHead2 = dropDownMenuHead;
        if (dropDownMenuHead == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuHead");
            dropDownMenuHead2 = null;
        }
        DropDownMenuContent dropDownMenuContent9 = this.f66825c;
        DropDownMenuContent dropDownMenuContent10 = dropDownMenuContent9;
        if (dropDownMenuContent9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent10 = null;
        }
        ?? baseAdapter = new BaseAdapter();
        dropDownMenuHead2.getClass();
        if (dropDownMenuContent10 == null || dropDownMenuContent10.getRecyclerView() == null || dropDownMenuContent10.getMask() == null) {
            throw new IllegalStateException("DropDownMenuContent not exist !");
        }
        if (arrayList.size() == 0) {
            throw new IllegalStateException("menuItems can not be NULL or EMPTY !");
        }
        dropDownMenuHead2.f67202c = dropDownMenuContent10.getRecyclerView();
        int spanCount = dropDownMenuContent10.getSpanCount();
        if (spanCount != -1) {
            dropDownMenuHead2.f67223y = spanCount;
        }
        RecyclerView.ItemDecoration itemDecoration = dropDownMenuContent10.getItemDecoration();
        if (itemDecoration != null) {
            dropDownMenuHead2.f67202c.addItemDecoration(itemDecoration);
        } else {
            dropDownMenuHead2.f67202c.addItemDecoration(new SpacesItemDecoration(dropDownMenuHead2.getResources().getDimensionPixelSize(2131166076), dropDownMenuHead2.f67223y));
        }
        dropDownMenuHead2.f67221w = baseAdapter;
        baseAdapter.setHandleClickListener(dropDownMenuHead2);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(dropDownMenuHead2.getContext(), dropDownMenuHead2.f67223y);
        GridLayoutManager.SpanSizeLookup spanLookup = dropDownMenuContent10.getSpanLookup();
        if (spanLookup != null) {
            gridLayoutManager.setSpanSizeLookup(spanLookup);
        }
        dropDownMenuHead2.f67202c.setLayoutManager(gridLayoutManager);
        dropDownMenuHead2.f67202c.setAdapter(dropDownMenuHead2.f67221w);
        View mask = dropDownMenuContent10.getMask();
        dropDownMenuHead2.f67203d = mask;
        mask.setOnClickListener(new ViewOnClickListenerC5111b(dropDownMenuHead2));
        dropDownMenuHead2.f67205f.clear();
        dropDownMenuHead2.f67205f.addAll(arrayList);
        dropDownMenuHead2.f67200a.removeAllViews();
        dropDownMenuHead2.h = dropDownMenuHead2.f67205f.size();
        for (int i9 = 0; i9 < dropDownMenuHead2.h; i9++) {
            View viewInflate = View.inflate(dropDownMenuHead2.getContext(), 2131494568, null);
            viewInflate.setTag(Integer.valueOf(i9));
            viewInflate.setOnClickListener(new com.bilibili.music.podcast.view.dropdownmenu.a(dropDownMenuHead2));
            dropDownMenuHead2.f67200a.addView(viewInflate, i9, new LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        dropDownMenuHead2.d(true);
        DropDownMenuHead dropDownMenuHead3 = this.f66824b;
        DropDownMenuHead dropDownMenuHead4 = dropDownMenuHead3;
        if (dropDownMenuHead3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuHead");
            dropDownMenuHead4 = null;
        }
        dropDownMenuHead4.setOnSubMenuItemClickListener(new r(this));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            DropDownMenuHead dropDownMenuHead5 = this.f66824b;
            DropDownMenuHead dropDownMenuHead6 = dropDownMenuHead5;
            if (dropDownMenuHead5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuHead");
                dropDownMenuHead6 = null;
            }
            LinearLayout linearLayout = (LinearLayout) dropDownMenuHead6.findViewById(2131307369);
            View childAt = linearLayout != null ? linearLayout.getChildAt(i10) : null;
            TextView textView = childAt != null ? (TextView) childAt.findViewById(2131307359) : null;
            if (textView != null) {
                textView.setTextColor(ThemeUtils.getThemeColorStateList(getContext(), 2131103223));
            }
            if (textView != null) {
                textView.setTextSize(14.0f);
            }
        }
        SwipeRefreshLayout swipeRefreshLayout = this.f66829g;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRefreshView");
            swipeRefreshLayout2 = null;
        }
        swipeRefreshLayout2.setOnRefreshListener(this);
        RecyclerView recyclerView2 = this.f66826d;
        RecyclerView recyclerView3 = recyclerView2;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView3 = null;
        }
        a aVar = this.f66832k;
        a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContributionAdapter");
            aVar2 = null;
        }
        recyclerView3.setAdapter(aVar2);
        RecyclerView recyclerView4 = this.f66826d;
        RecyclerView recyclerView5 = recyclerView4;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView6 = this.f66826d;
        RecyclerView recyclerView7 = recyclerView6;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.addOnScrollListener(new C1433c(this));
        LoadingErrorEmptyView loadingErrorEmptyView = this.f66827e;
        LoadingErrorEmptyView loadingErrorEmptyView2 = loadingErrorEmptyView;
        if (loadingErrorEmptyView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLeeView");
            loadingErrorEmptyView2 = null;
        }
        loadingErrorEmptyView2.e();
        ContributePresenter contributePresenter = this.f66834m;
        if (contributePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            contributePresenter = null;
        }
        contributePresenter.c(0, 0);
    }

    @Override // Bi0.C1433c.a
    public final void w0() {
        ContributePresenter contributePresenter = this.f66834m;
        ContributePresenter contributePresenter2 = contributePresenter;
        if (contributePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            contributePresenter2 = null;
        }
        contributePresenter2.b(false);
    }
}
