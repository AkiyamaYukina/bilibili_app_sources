package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6979B;
import eu0.C6983b;
import eu0.C6990i;
import eu0.C6993l;
import eu0.C6997p;
import fu0.C7191m;
import fu0.C7192n;
import fu0.C7194p;
import fu0.C7200w;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$1.class */
final class CheeseCatalogTabFragment$flowDataState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCatalogTabFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogTabFragment$flowDataState$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final CheeseCatalogTabFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogTabFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i7;
            int i8;
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c cVar = (c) this.L$0;
            if (cVar != null) {
                CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
                C7200w c7200w = cheeseCatalogTabFragment.f89138j;
                FrameLayout frameLayout = c7200w != null ? c7200w.f119626f : null;
                FrameLayout frameLayout2 = c7200w != null ? c7200w.f119624d : null;
                FrameLayout frameLayout3 = c7200w != null ? c7200w.h : null;
                View view = c7200w != null ? c7200w.f119625e : null;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                if (frameLayout3 != null) {
                    frameLayout3.removeAllViews();
                }
                boolean z6 = cVar.f89162e;
                C6983b c6983b = cVar.f89164g;
                boolean z7 = z6 && c6983b.f117504b.f117562e == 2;
                boolean zA = cVar.a();
                C6990i c6990i = cVar.f89163f;
                C6993l c6993l = cVar.h;
                boolean z8 = zA || c6990i.f117540b.length() > 0 || c6993l.f117549a;
                boolean z9 = cVar.b() || !c6983b.f117503a.isEmpty();
                if (z7 && frameLayout != null) {
                    C7191m c7191mInflate = C7191m.inflate(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
                    bu0.h hVar = new bu0.h(c7191mInflate, cheeseCatalogTabFragment);
                    ConstraintLayout constraintLayout = c7191mInflate.f119565a;
                    if (c6983b != null) {
                        C6997p c6997p = c6983b.f117504b;
                        hVar.f57046b.setText(new SpannableStringBuilder(c6997p.f117559b));
                        String str = c6997p.f117561d;
                        if (str.length() > 0) {
                            hVar.f57048d.setVisibility(0);
                            hVar.f57048d.setText(str);
                        }
                        LottieAnimationView lottieAnimationView = hVar.f57047c;
                        lottieAnimationView.setAnimation(MultipleThemeUtils.isNightTheme(lottieAnimationView.getContext()) ? "theseus_detail_playing_night.json" : "theseus_detail_playing.json");
                        lottieAnimationView.setVisibility(0);
                        lottieAnimationView.playAnimation();
                        constraintLayout.setOnClickListener(hVar);
                    }
                    frameLayout.addView(constraintLayout);
                }
                if (z8) {
                    if (frameLayout2 != null) {
                        int i9 = bu0.e.f57027k;
                        C7194p c7194pInflate = C7194p.inflate(LayoutInflater.from(frameLayout2.getContext()), frameLayout2, false);
                        bu0.e eVar = new bu0.e(c7194pInflate, c7194pInflate.f119575a, cheeseCatalogTabFragment);
                        boolean z10 = cheeseCatalogTabFragment.f89140l;
                        RelativeLayout relativeLayout = eVar.f57030c;
                        if (cVar.a()) {
                            PageReportService.i(cheeseCatalogTabFragment.f89131b.f89119o, "pugv.detail.playlist.courseware-top.show", MapsKt.emptyMap(), 4);
                            Unit unit = Unit.INSTANCE;
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        relativeLayout.setVisibility(i7);
                        RelativeLayout relativeLayout2 = eVar.f57031d;
                        if (c6990i.f117540b.length() > 0) {
                            PageReportService.i(cheeseCatalogTabFragment.f89131b.f89119o, "pugv.detail.add-service.1.show", MapsKt.emptyMap(), 4);
                            Unit unit2 = Unit.INSTANCE;
                            i8 = 0;
                        } else {
                            i8 = 8;
                        }
                        relativeLayout2.setVisibility(i8);
                        eVar.f57030c.setOnClickListener(eVar);
                        eVar.f57031d.setOnClickListener(eVar);
                        RelativeLayout relativeLayout3 = eVar.f57033f;
                        Iterator<T> it = cVar.f89158a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!((C6979B) next).f117495d.isEmpty()) {
                                break;
                            }
                        }
                        relativeLayout3.setVisibility(next != null ? 0 : 8);
                        eVar.f57032e.setOnCheckedChangeListener(null);
                        eVar.f57032e.setChecked(z10);
                        eVar.f57032e.setOnCheckedChangeListener(eVar.f57036j);
                        eVar.f57034g.setVisibility(c6993l.f117549a ? 0 : 8);
                        eVar.h.setVisibility(c6993l.f117550b ? 0 : 8);
                        eVar.f57034g.setOnClickListener(eVar);
                        Iterator it2 = SequencesKt.take(ViewGroupKt.getChildren(eVar.f57029b), 3).iterator();
                        int i10 = 0;
                        while (it2.hasNext()) {
                            if (((View) it2.next()).getVisibility() == 0) {
                                int i11 = i10 + 1;
                                i10 = i11;
                                if (i11 < 0) {
                                    CollectionsKt.throwCountOverflow();
                                    i10 = i11;
                                }
                            }
                        }
                        eVar.f57035i.setVisibility(i10 <= 1 ? 4 : 8);
                        frameLayout2.addView(eVar.itemView);
                    }
                    if (c6993l.f117549a) {
                        PageReportService.i(cheeseCatalogTabFragment.f89135f, "pugv.detail.study-reward.0.show", MapsKt.mapOf(TuplesKt.to("isreddotshow", c6993l.f117550b ? "1" : "0")), 4);
                    }
                }
                if (z9 && frameLayout3 != null) {
                    int iIntValue = ((Number) cheeseCatalogTabFragment.h.f100021b.getValue()).intValue();
                    C7192n c7192nInflate = C7192n.inflate(LayoutInflater.from(frameLayout3.getContext()), frameLayout3, false);
                    bu0.o oVar = new bu0.o(c7192nInflate, cheeseCatalogTabFragment, iIntValue);
                    oVar.f57089c.setPadding(DimenUtilsKt.dpToPx(iIntValue), oVar.f57089c.getPaddingTop(), oVar.f57089c.getPaddingRight(), oVar.f57089c.getPaddingBottom());
                    oVar.f57089c.setText(c7192nInflate.f119569a.getContext().getString(cVar.b() ? 2131848838 : 2131848813));
                    c7192nInflate.f119569a.setTag(2131313228, cVar);
                    frameLayout3.addView(c7192nInflate.f119569a);
                }
                if (z7 || z8 || z9) {
                    if (!z9) {
                        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = Lh1.b.b(12.0f);
                        }
                        if (view != null) {
                            view.setVisibility(0);
                        }
                    }
                } else if (view != null) {
                    view.setVisibility(8);
                }
                this.this$0.f89141m.Q(cVar, !r0.f89140l);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogTabFragment$flowDataState$1(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super CheeseCatalogTabFragment$flowDataState$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogTabFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogTabFragment$flowDataState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
            MutableStateFlow<c> mutableStateFlow = cheeseCatalogTabFragment.f89131b.f89127w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCatalogTabFragment, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
