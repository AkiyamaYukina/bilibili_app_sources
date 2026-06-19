package com.bilibili.music.podcast.view;

import Vi0.C2955b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicRecommendTopCard;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.InterfaceC5427g;
import gi0.C7316U;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicTopCarLayout.class */
public final class MusicTopCarLayout extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f67124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f67125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f67126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MusicPagerReportData f67127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7316U f67128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.music.podcast.utils.l<MusicRecommendTopCard> f67129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f67130g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicTopCarLayout$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicTopCarLayout f67131a;

        public a(MusicTopCarLayout musicTopCarLayout) {
            this.f67131a = musicTopCarLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            c cVar = this.f67131a.f67130g;
            if (i7 == 0) {
                cVar.f67134b.f67129f.b();
            } else {
                cVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            c cVar = this.f67131a.f67130g;
            RecyclerView recyclerView2 = cVar.f67134b.f67124a;
            RecyclerView recyclerView3 = recyclerView2;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                recyclerView3 = null;
            }
            C2955b.a(recyclerView3, cVar.f67133a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicTopCarLayout$b.class */
    public static final class b implements InterfaceC5426f<MusicRecommendTopCard> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicTopCarLayout f67132a;

        public b(MusicTopCarLayout musicTopCarLayout) {
            this.f67132a = musicTopCarLayout;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final /* bridge */ /* synthetic */ boolean a(MusicRecommendTopCard musicRecommendTopCard) {
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(com.bilibili.music.podcast.data.MusicRecommendTopCard r8) {
            /*
                r7 = this;
                r0 = r8
                com.bilibili.music.podcast.data.MusicRecommendTopCard r0 = (com.bilibili.music.podcast.data.MusicRecommendTopCard) r0
                r14 = r0
                r0 = r7
                com.bilibili.music.podcast.view.MusicTopCarLayout r0 = r0.f67132a
                com.bilibili.music.podcast.data.MusicPagerReportData r0 = r0.f67127d
                r8 = r0
                r0 = 0
                r12 = r0
                r0 = r8
                if (r0 == 0) goto L1d
                r0 = r8
                java.lang.String r0 = r0.f66423b
                r8 = r0
                goto L1f
            L1d:
                r0 = 0
                r8 = r0
            L1f:
                r0 = r14
                int r0 = r0.getAdapterBindPosition()
                r10 = r0
                r0 = r14
                int r0 = r0.reportCarType()
                r9 = r0
                r0 = r14
                com.bapis.bilibili.app.listener.v1.TopCard r0 = r0.getTopCar()
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L47
                r0 = r11
                java.lang.String r0 = r0.getTitle()
                r13 = r0
                r0 = r13
                r11 = r0
                r0 = r13
                if (r0 != 0) goto L4b
            L47:
                java.lang.String r0 = ""
                r11 = r0
            L4b:
                r0 = r14
                com.bapis.bilibili.app.listener.v1.EventTracking r0 = r0.getEventTracking()
                r14 = r0
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r13 = r0
                java.lang.String r0 = "from_spmid"
                r1 = r8
                r2 = r13
                Vi0.C2954a.a(r0, r1, r2)
                java.lang.String r0 = "pos"
                r1 = r10
                r2 = 1
                int r1 = r1 + r2
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = r13
                Vi0.C2954a.a(r0, r1, r2)
                java.lang.String r0 = "card_type"
                r1 = r9
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = r13
                Vi0.C2954a.a(r0, r1, r2)
                java.lang.String r0 = "card_name"
                r1 = r11
                r2 = r13
                Vi0.C2954a.a(r0, r1, r2)
                r0 = r14
                if (r0 == 0) goto L92
                r0 = r14
                java.lang.String r0 = r0.getEntityType()
                r8 = r0
                goto L94
            L92:
                r0 = 0
                r8 = r0
            L94:
                java.lang.String r0 = "entity"
                r1 = r8
                r2 = r13
                Vi0.C2954a.a(r0, r1, r2)
                r0 = r12
                r8 = r0
                r0 = r14
                if (r0 == 0) goto Laa
                r0 = r14
                java.lang.String r0 = r0.getEntityId()
                r8 = r0
            Laa:
                java.lang.String r0 = "entity_id"
                r1 = r8
                r2 = r13
                Vi0.C2954a.a(r0, r1, r2)
                r0 = 1
                java.lang.String r1 = "listen.audio-detail.head-entry.entry.show"
                r2 = r13
                r3 = 0
                r4 = 8
                r5 = 0
                com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.MusicTopCarLayout.b.b(java.lang.Object):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicTopCarLayout$c.class */
    public static final class c implements com.bilibili.music.podcast.utils.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f67133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicTopCarLayout f67134b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicTopCarLayout$c$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicTopCarLayout f67135a;

            public a(MusicTopCarLayout musicTopCarLayout) {
                this.f67135a = musicTopCarLayout;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                MusicTopCarLayout musicTopCarLayout = this.f67135a;
                musicTopCarLayout.f67129f.a(musicTopCarLayout.f67128e.N(i7, i8));
            }
        }

        public c(MusicTopCarLayout musicTopCarLayout) {
            this.f67134b = musicTopCarLayout;
            this.f67133a = new a(musicTopCarLayout);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicTopCarLayout musicTopCarLayout = this.f67134b;
            RecyclerView recyclerView = musicTopCarLayout.f67124a;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                recyclerView2 = null;
            }
            C2955b.a(recyclerView2, this.f67133a);
            musicTopCarLayout.f67129f.b();
        }
    }

    public MusicTopCarLayout(@NotNull Context context) {
        this(context, null);
    }

    public MusicTopCarLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C7316U c7316u = new C7316U();
        this.f67128e = c7316u;
        this.f67129f = new com.bilibili.music.podcast.utils.l<>(new b(this));
        c cVar = new c(this);
        this.f67130g = cVar;
        a aVar = new a(this);
        LayoutInflater.from(context).inflate(2131499552, (ViewGroup) this, true);
        ViewConfiguration.get(context).getScaledTouchSlop();
        RecyclerView recyclerView = (RecyclerView) findViewById(2131310050);
        this.f67124a = recyclerView;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new s(this));
        RecyclerView recyclerView3 = this.f67124a;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setAdapter(c7316u);
        c7316u.f120194c = cVar;
        RecyclerView recyclerView5 = this.f67124a;
        RecyclerView recyclerView6 = recyclerView5;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView6 = null;
        }
        recyclerView6.addOnScrollListener(aVar);
        this.f67126c = findViewById(2131311417);
        View viewFindViewById = findViewById(2131308541);
        this.f67125b = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutTouchView");
            viewFindViewById = null;
        }
        viewFindViewById.setOnTouchListener(this);
        setVisibility(8);
    }

    public final void a(float f7, boolean z6) {
        View view = this.f67126c;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmallExpandBack");
            view2 = null;
        }
        view2.setAlpha(f7);
        View view3 = this.f67126c;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSmallExpandBack");
            view3 = null;
        }
        view3.setVisibility(z6 ? 0 : 8);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        return false;
    }

    public final void setData(@Nullable List<MusicRecommendTopCard> list) {
        this.f67128e.O(list);
    }

    public final void setOutTouchViewColor(@ColorInt int i7) {
        View view = this.f67125b;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutTouchView");
            view2 = null;
        }
        view2.setBackgroundColor(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPagerReportData(@org.jetbrains.annotations.Nullable com.bilibili.music.podcast.data.MusicPagerReportData r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            r0.f67127d = r1
            r0 = r3
            gi0.U r0 = r0.f67128e
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r4
            java.lang.String r0 = r0.f66423b
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L1c
        L19:
            java.lang.String r0 = ""
            r4 = r0
        L1c:
            r0 = r6
            r1 = r4
            r0.f120195d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.MusicTopCarLayout.setPagerReportData(com.bilibili.music.podcast.data.MusicPagerReportData):void");
    }

    public final void setRecycleViewAlpha(float f7) {
        RecyclerView recyclerView = this.f67124a;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setAlpha(f7);
    }

    public final void setRecycleViewMarginTop(int i7) {
        RecyclerView recyclerView = this.f67124a;
        RecyclerView recyclerView2 = null;
        RecyclerView recyclerView3 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView3 = null;
        }
        RecyclerView recyclerView4 = this.f67124a;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView2.getLayoutParams();
        marginLayoutParams.topMargin = i7;
        recyclerView3.setLayoutParams(marginLayoutParams);
    }

    public final void setTopCarListener(@Nullable com.bilibili.music.podcast.utils.t tVar) {
        this.f67128e.f120193b = tVar;
    }
}
