package com.bilibili.ship.theseus.ugc.endpage.qoe;

import CR0.B;
import Vu0.C2965d;
import Vu0.L;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ugc.view.ReviewRatingBar;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.holders.ViewOnClickListenerC5711z0;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import com.bilibili.ship.theseus.ugc.endpage.qoe.q;
import com.mall.data.page.create.presale.PreSaleDataBean;
import com.mall.ui.page.base.MallBaseFragment;
import com.mall.ui.page.create2.PreSaleFragmentV2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q.class */
@StabilityInferred(parameters = 0)
public final class q implements UIComponent<com.bilibili.app.gemini.ui.n<L>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f96731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<UgcDmQoeComponent.State.a> f96732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<String> f96734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f96736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f96737g;

    @NotNull
    public final SharedFlow<b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f96738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f96739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f96740k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$a.class */
    public final class a implements RecyclerView.OnItemTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final GestureDetector f96741a;

        public a(@NotNull Context context) {
            this.f96741a = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean onInterceptTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
            return this.f96741a.onTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z6) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$b.class */
    @StabilityInferred(parameters = 1)
    public static abstract class b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f96742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f96743b;

            public a(@NotNull String str, int i7) {
                this.f96742a = str;
                this.f96743b = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f96742a, aVar.f96742a) && this.f96743b == aVar.f96743b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f96743b) + (this.f96742a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("OnClickButton(selectedItemDesc=");
                sb.append(this.f96742a);
                sb.append(", selectedPosition=");
                return C4277b.a(this.f96743b, ")", sb);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final w f96744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f96745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f96746c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList<UgcDmQoeComponent.State.a> f96747d = new ArrayList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public RecyclerView f96748e;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$c$a.class */
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final C2965d f96749a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<UgcDmQoeComponent.State.a> f96750b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final TintTextView f96751c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final Context f96752d;

            public a(@NotNull C2965d c2965d, @NotNull List list) {
                super(c2965d.f25887b);
                this.f96749a = c2965d;
                this.f96750b = list;
                TintTextView tintTextView = c2965d.f25888c;
                this.f96751c = tintTextView;
                this.f96752d = c2965d.f25887b.getContext();
                int size = ((ArrayList) list).size();
                ViewGroup.LayoutParams layoutParams = tintTextView.getLayoutParams();
                layoutParams.width = (NewPlayerUtilsKt.toPx(318) - (NewPlayerUtilsKt.toPx(8) * (size - 1))) / size;
                tintTextView.setLayoutParams(layoutParams);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$c$b.class */
        public final class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BiliImageView f96753a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final TintTextView f96754b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final Context f96755c;

            public b(@NotNull View view) {
                super(view);
                this.f96753a = view.findViewById(2131301546);
                this.f96754b = (TintTextView) view.findViewById(2131312912);
                this.f96755c = view.getContext();
            }
        }

        public c(@Nullable w wVar) {
            this.f96744a = wVar;
        }

        public final void N(final int i7, @NotNull final List<UgcDmQoeComponent.State.a> list, int i8, @Nullable final TintImageView tintImageView) {
            this.f96746c = i7;
            this.f96747d.clear();
            this.f96747d.addAll(list);
            this.f96745b = i8;
            notifyDataSetChanged();
            tintImageView.post(new Runnable(this, tintImageView, i7, list) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final q.c f96762a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TintImageView f96763b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f96764c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final List f96765d;

                {
                    this.f96762a = this;
                    this.f96763b = tintImageView;
                    this.f96764c = i7;
                    this.f96765d = list;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 214
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.qoe.s.run():void");
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f96747d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            int i8 = this.f96745b;
            int i9 = 1;
            if (i8 != 1) {
                i9 = 3;
                if (i8 != 3) {
                    return super.getItemViewType(i7);
                }
            }
            return i9;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f96748e = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, final int i7) {
            final UgcDmQoeComponent.State.a aVar = (UgcDmQoeComponent.State.a) CollectionsKt.getOrNull(this.f96747d, i7);
            if (aVar == null) {
                return;
            }
            boolean z6 = viewHolder instanceof b;
            String str = aVar.f96629b;
            if (z6) {
                b bVar = (b) viewHolder;
                BiliImageLoader.INSTANCE.with(bVar.f96753a.getContext()).url(aVar.f96630c).into(bVar.f96753a);
                TintTextView tintTextView = bVar.f96754b;
                tintTextView.setText(str);
                int i8 = this.f96746c;
                if (i8 != -1) {
                    if (i7 == i8) {
                        tintTextView.setTextColor(ContextCompat.getColor(bVar.f96755c, R$color.Brand_pink));
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bVar.itemView, "alpha", 0.5f, 1.0f);
                        objectAnimatorOfFloat.setDuration(250L);
                        objectAnimatorOfFloat.start();
                    } else {
                        tintTextView.setTextColor(ContextCompat.getColor(bVar.f96755c, R$color.Text2));
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bVar.itemView, "alpha", 1.0f, 0.5f);
                        objectAnimatorOfFloat2.setDuration(250L);
                        objectAnimatorOfFloat2.start();
                    }
                }
                bVar.itemView.setOnClickListener(new View.OnClickListener(this, i7, aVar) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final q.c f96760a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f96761b;

                    {
                        this.f96760a = this;
                        this.f96761b = i7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        q.c cVar = this.f96760a;
                        int i9 = this.f96761b;
                        w wVar = cVar.f96744a;
                        if (wVar != null) {
                            wVar.a(i9, cVar.f96746c);
                        }
                    }
                });
                return;
            }
            if (viewHolder instanceof a) {
                a aVar2 = (a) viewHolder;
                int size = ((ArrayList) aVar2.f96750b).size();
                C2965d c2965d = aVar2.f96749a;
                if (i7 < size - 1) {
                    InputExtensionsKt.updateMargin$default(c2965d.f25887b, 0, NewPlayerUtilsKt.toPx(8), 0, 0, 13, null);
                } else {
                    InputExtensionsKt.updateMargin$default(c2965d.f25887b, 0, 0, 0, 0, 13, null);
                }
                TintTextView tintTextView2 = aVar2.f96751c;
                tintTextView2.setText(str);
                int i9 = this.f96746c;
                if (i9 != -1) {
                    if (i7 == i9) {
                        tintTextView2.setSelected(true);
                        tintTextView2.setTextColor(ContextCompat.getColor(aVar2.f96752d, R$color.Brand_pink));
                    } else {
                        tintTextView2.setSelected(false);
                        tintTextView2.setTextColor(ContextCompat.getColor(aVar2.f96752d, R$color.Text1));
                    }
                }
                aVar2.itemView.setOnClickListener(new View.OnClickListener(this, i7, aVar) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final q.c f96766a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f96767b;

                    {
                        this.f96766a = this;
                        this.f96767b = i7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        q.c cVar = this.f96766a;
                        int i10 = this.f96767b;
                        w wVar = cVar.f96744a;
                        if (wVar != null) {
                            wVar.a(i10, cVar.f96746c);
                        }
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            return i7 == 1 ? new b(p.a(viewGroup, 2131500213, viewGroup, false)) : new a(C2965d.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f96747d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f96748e = null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$d.class */
    public final class d extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<String> f96756a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Set<Integer> f96757b = new LinkedHashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public RecyclerView f96758c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/q$d$a.class */
        public final class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final TextView f96759a;

            public a(@NotNull d dVar, View view) {
                super(view);
                this.f96759a = (TextView) view.findViewById(2131303935);
                view.setOnClickListener(new ViewOnClickListenerC5711z0(1, this, dVar));
            }
        }

        public final void N(final a aVar) {
            RecyclerView recyclerView = this.f96758c;
            if (recyclerView == null) {
                return;
            }
            int width = recyclerView.getWidth();
            if (width <= 0) {
                recyclerView.post(new Runnable(this, aVar) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.u

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final q.d f96768a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final q.d.a f96769b;

                    {
                        this.f96768a = this;
                        this.f96769b = aVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96768a.N(this.f96769b);
                    }
                });
                return;
            }
            int px = (width - NewPlayerUtilsKt.toPx(10)) / 2;
            ViewGroup.LayoutParams layoutParams = aVar.f96759a.getLayoutParams();
            layoutParams.width = px;
            aVar.f96759a.setLayoutParams(layoutParams);
        }

        public final void O(@NotNull List<String> list) {
            this.f96757b.clear();
            this.f96756a.clear();
            this.f96756a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f96756a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f96758c = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            a aVar = (a) viewHolder;
            String str = this.f96756a.get(i7);
            Context context = aVar.itemView.getContext();
            N(aVar);
            aVar.f96759a.setText(str);
            aVar.f96759a.setSelected(this.f96757b.contains(Integer.valueOf(i7)));
            aVar.f96759a.setTextColor(this.f96757b.contains(Integer.valueOf(i7)) ? ContextCompat.getColor(context, R$color.Brand_pink) : ContextCompat.getColor(context, R$color.Text1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(this, p.a(viewGroup, 2131500492, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f96758c = null;
        }
    }

    public q(@NotNull String str, @NotNull List<UgcDmQoeComponent.State.a> list, int i7, @NotNull List<String> list2, int i8, @Nullable String str2) {
        this.f96731a = str;
        this.f96732b = list;
        this.f96733c = i7;
        this.f96734d = list2;
        this.f96735e = i8;
        this.f96736f = str2;
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);
        this.f96737g = mutableSharedFlowMutableSharedFlow$default;
        this.h = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final L l7 = (L) ((com.bilibili.app.gemini.ui.n) viewEntry).a;
        l7.f25860j.setText(this.f96731a);
        int i7 = this.f96733c;
        this.f96738i = i7;
        View.OnClickListener qVar = new AK.q(l7, 2);
        ConstraintLayout constraintLayout = l7.h;
        constraintLayout.setOnClickListener(qVar);
        l7.f25855d.setOnClickListener(new Nr.b(1));
        final int i8 = 0;
        l7.f25854c.setOnClickListener(new View.OnClickListener(i8, this, l7) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f96729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f96730c;

            {
                this.f96728a = i8;
                this.f96729b = this;
                this.f96730c = l7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f96728a) {
                    case 0:
                        q qVar2 = (q) this.f96729b;
                        L l8 = (L) this.f96730c;
                        MutableSharedFlow<q.b> mutableSharedFlow = qVar2.f96737g;
                        q.d dVar = qVar2.f96740k;
                        q.d dVar2 = dVar;
                        if (dVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
                            dVar2 = null;
                        }
                        mutableSharedFlow.tryEmit(new q.b.a(CollectionsKt.p(dVar2.f96757b, ",", (CharSequence) null, (CharSequence) null, new Nr0.c(dVar2, 2), 30), qVar2.f96738i));
                        z.a(l8.h);
                        com.bilibili.ship.theseus.united.utils.q.c(qVar2.f96736f);
                        break;
                    default:
                        PreSaleDataBean preSaleDataBean = (PreSaleDataBean) this.f96729b;
                        yR0.e eVar = (yR0.e) this.f96730c;
                        List list = preSaleDataBean.moneyShowList;
                        if ((list != null ? list.size() : 0) != 0) {
                            B b7 = eVar.b;
                            MallBaseFragment mallBaseFragment = eVar.a;
                            if (b7 == null) {
                                B b8 = new B(mallBaseFragment);
                                eVar.b = b8;
                                b8.d = new yR0.d(eVar, preSaleDataBean);
                            }
                            B b9 = eVar.b;
                            if (b9 != null) {
                                b9.c(preSaleDataBean);
                            }
                            B b10 = eVar.b;
                            if (b10 != null) {
                                b10.e();
                            }
                            if (mallBaseFragment instanceof PreSaleFragmentV2) {
                                KQ0.e.c(2131830416, 2131830915);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.f96739j = new c(new w(this, l7));
        this.f96740k = new d();
        c cVar = this.f96739j;
        c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeItemsAdapter");
            cVar2 = null;
        }
        l7.f25856e.setAdapter(cVar2);
        d dVar = this.f96740k;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
            dVar2 = null;
        }
        RecyclerView recyclerView = l7.f25859i;
        recyclerView.setAdapter(dVar2);
        recyclerView.addOnItemTouchListener(new a(constraintLayout.getContext()));
        c cVar3 = this.f96739j;
        c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeItemsAdapter");
            cVar4 = null;
        }
        cVar4.N(i7, this.f96732b, this.f96735e, l7.f25853b);
        d dVar3 = this.f96740k;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
            dVar3 = null;
        }
        dVar3.O(this.f96734d);
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        final L lInflate = L.inflate(LayoutInflater.from(context), viewGroup, false);
        if (this.f96735e == 2) {
            ReviewRatingBar reviewRatingBar = lInflate.f25858g;
            lInflate.f25856e.setVisibility(8);
            reviewRatingBar.setVisibility(0);
            reviewRatingBar.setMode(1);
            reviewRatingBar.setRating(this.f96733c);
            reviewRatingBar.setOnRatingChangeListenerWithScore(new ReviewRatingBar.b(this, lInflate) { // from class: com.bilibili.ship.theseus.ugc.endpage.qoe.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final q f96726a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final L f96727b;

                {
                    this.f96726a = this;
                    this.f96727b = lInflate;
                }

                public final void a(int i7, boolean z6) {
                    if (z6) {
                        int i8 = i7 - 1;
                        q qVar = this.f96726a;
                        qVar.f96738i = i8;
                        ArrayList arrayList = new ArrayList(qVar.f96732b);
                        q.c cVar = qVar.f96739j;
                        q.c cVar2 = cVar;
                        if (cVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ugcQoeItemsAdapter");
                            cVar2 = null;
                        }
                        cVar2.N(i7, arrayList, qVar.f96735e, this.f96727b.f25853b);
                        List<String> list = ((UgcDmQoeComponent.State.a) arrayList.get(i8)).f96632e;
                        if (list != null) {
                            q.d dVar = qVar.f96740k;
                            if (dVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
                                dVar = null;
                            }
                            dVar.O(list);
                        }
                    }
                }
            });
        } else {
            ReviewRatingBar reviewRatingBar2 = lInflate.f25858g;
            RecyclerView recyclerView = lInflate.f25856e;
            recyclerView.setVisibility(0);
            reviewRatingBar2.setVisibility(8);
            recyclerView.setLayoutManager(new LinearLayoutManager(lInflate.h.getContext(), 0, false));
        }
        RecyclerView recyclerView2 = lInflate.f25859i;
        Context context2 = lInflate.h.getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(context2, 2));
        v vVar = new v(context2);
        vVar.setDrawable(new ColorDrawable(0));
        recyclerView2.addItemDecoration(vVar);
        return new com.bilibili.app.gemini.ui.n(lInflate);
    }
}
