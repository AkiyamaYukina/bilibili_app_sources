package com.bilibili.search2.stardust.recommend;

import Bl.s;
import Bl.y1;
import HG0.ViewOnClickListenerC2102p0;
import S51.l;
import Vt0.C2958c;
import Vt0.C2960e;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.biligame.ui.pay.PayDialogV2;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.FeedbackItem;
import com.bilibili.search2.api.NegativeFeedback;
import com.bilibili.search2.stardust.recommend.RecommendBottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/RecommendBottomSheetDialog.class */
@StabilityInferred(parameters = 0)
public final class RecommendBottomSheetDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1 f88771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2958c f88772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f88773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f88774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ArrayList<FeedbackSearchWord> f88775f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public NegativeFeedback f88777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Qt0.d f88778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f88779k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f88782n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88776g = ListExtentionsKt.toPx(536);
    public final int h = ListExtentionsKt.toPx(100);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f88780l = new a(new l(this, 1));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final b f88781m = new b(new C2960e(this, 0));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/RecommendBottomSheetDialog$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final l f88783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<FeedbackSearchWord> f88784b = new ArrayList<>();

        public a(@Nullable l lVar) {
            this.f88783a = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f88784b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            d dVar = (d) viewHolder;
            FeedbackSearchWord feedbackSearchWord = this.f88784b.get(i7);
            dVar.getClass();
            String str = feedbackSearchWord.f88767a;
            s sVar = dVar.f88789a;
            if (str != null) {
                sVar.b.setText(str);
            }
            if (feedbackSearchWord.f88770d) {
                sVar.b.setTextColor(ResourcesCompat.getColor(sVar.a.getContext().getResources(), R$color.Brand_pink, null));
                TextViewCompat.setTextAppearance(sVar.b, 2131887519);
            } else {
                sVar.b.setTextColor(ResourcesCompat.getColor(sVar.a.getContext().getResources(), R$color.Text1, null));
                TextViewCompat.setTextAppearance(sVar.b, 2131887513);
            }
            sVar.a.setOnClickListener(new ViewOnClickListenerC2102p0(dVar, 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new d(s.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f88783a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/RecommendBottomSheetDialog$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.Adapter<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final C2960e f88785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<FeedbackItem> f88786b = new ArrayList<>();

        public b(@Nullable C2960e c2960e) {
            this.f88785a = c2960e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f88786b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            final c cVar = (c) viewHolder;
            FeedbackItem feedbackItem = this.f88786b.get(i7);
            cVar.getClass();
            String text = feedbackItem.getText();
            s sVar = cVar.f88787a;
            if (text != null) {
                sVar.b.setText(text);
            }
            if (feedbackItem.isSelected()) {
                sVar.b.setTextColor(ResourcesCompat.getColor(sVar.a.getContext().getResources(), R$color.Brand_pink, null));
                TextViewCompat.setTextAppearance(sVar.b, 2131887519);
            } else {
                sVar.b.setTextColor(ResourcesCompat.getColor(sVar.a.getContext().getResources(), R$color.Text1, null));
                TextViewCompat.setTextAppearance(sVar.b, 2131887513);
            }
            final int i8 = 0;
            sVar.a.setOnClickListener(new View.OnClickListener(cVar, i8) { // from class: Vt0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f25738a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f25739b;

                {
                    this.f25738a = i8;
                    this.f25739b = cVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f25738a) {
                        case 0:
                            RecommendBottomSheetDialog.c cVar2 = (RecommendBottomSheetDialog.c) this.f25739b;
                            C2960e c2960e = cVar2.f88788b;
                            if (c2960e != null) {
                                c2960e.invoke(Integer.valueOf(cVar2.getBindingAdapterPosition()));
                            }
                            break;
                        default:
                            ((PayDialogV2) this.f25739b).jf();
                            break;
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new c(s.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f88785a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/RecommendBottomSheetDialog$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final s f88787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final C2960e f88788b;

        public c(@NotNull s sVar, @Nullable C2960e c2960e) {
            super(sVar.a);
            this.f88787a = sVar;
            this.f88788b = c2960e;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/RecommendBottomSheetDialog$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final s f88789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final l f88790b;

        public d(@NotNull s sVar, @Nullable l lVar) {
            super(sVar.a);
            this.f88789a = sVar;
            this.f88790b = lVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/RecommendBottomSheetDialog$e.class */
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88791a;

        static {
            int[] iArr = new int[FeedbackSearchWordType.values().length];
            try {
                iArr[FeedbackSearchWordType.SEARCH_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FeedbackSearchWordType.SEARCH_RECOMMEND.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f88791a = iArr;
        }
    }

    @NotNull
    public final y1 hf() {
        y1 y1Var = this.f88771b;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m8793if() {
        FeedbackSearchWord feedbackSearchWord;
        Object next;
        Object next2;
        ArrayList<FeedbackSearchWord> arrayList = this.f88775f;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (((FeedbackSearchWord) next2).f88770d) {
                        break;
                    }
                }
            }
            feedbackSearchWord = (FeedbackSearchWord) next2;
        } else {
            feedbackSearchWord = null;
        }
        boolean z6 = feedbackSearchWord != null;
        NegativeFeedback negativeFeedback = this.f88777i;
        FeedbackItem feedbackItem = null;
        if (negativeFeedback != null) {
            List<FeedbackItem> feedbackList = negativeFeedback.getFeedbackList();
            feedbackItem = null;
            if (feedbackList != null) {
                Iterator<T> it2 = feedbackList.iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((FeedbackItem) next).isSelected());
                feedbackItem = (FeedbackItem) next;
            }
        }
        boolean z7 = feedbackItem != null;
        if (z6 && z7) {
            hf().l.setEnabled(true);
            hf().l.setBackgroundTintList(R$color.Brand_pink);
            hf().l.invalidate();
        } else {
            hf().l.setEnabled(false);
            hf().l.setBackgroundTintList(2131104823);
            hf().l.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        } else {
            setStyle(0, 2131888957);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f88771b = y1.inflate(layoutInflater, viewGroup, false);
        this.f88772c = new C2958c(hf().a.getContext());
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("negative_feedback") : null;
        this.f88777i = serializable instanceof NegativeFeedback ? (NegativeFeedback) serializable : null;
        Bundle arguments2 = getArguments();
        ArrayList<FeedbackSearchWord> parcelableArrayList = null;
        if (arguments2 != null) {
            parcelableArrayList = arguments2.getParcelableArrayList("arg_items");
        }
        this.f88775f = parcelableArrayList;
        return hf().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        List<FeedbackItem> feedbackList;
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        NegativeFeedback negativeFeedback = this.f88777i;
        if (negativeFeedback == null || (feedbackList = negativeFeedback.getFeedbackList()) == null) {
            return;
        }
        Iterator<T> it = feedbackList.iterator();
        while (it.hasNext()) {
            ((FeedbackItem) it.next()).setSelected(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        Window window;
        final View decorView;
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onResume();
        final View view = getView();
        if (view != null) {
            final int i7 = 0;
            view.post(new Runnable(i7, this, view) { // from class: Vt0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f25728a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f25729b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f25730c;

                {
                    this.f25728a = i7;
                    this.f25729b = this;
                    this.f25730c = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f25728a) {
                        case 0:
                            BottomSheetDialogFragment bottomSheetDialogFragment = (RecommendBottomSheetDialog) this.f25729b;
                            View view2 = (View) this.f25730c;
                            if (bottomSheetDialogFragment.isAdded() && !bottomSheetDialogFragment.isDetached() && view2.isAttachedToWindow()) {
                                ViewCompat.requestApplyInsets(view2);
                                break;
                            }
                            break;
                        default:
                            com.hihonor.push.sdk.d.c((com.hihonor.push.sdk.d) this.f25729b, (com.hihonor.push.sdk.f) this.f25730c);
                            break;
                    }
                }
            });
        }
        BottomSheetDialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? dialog : null;
        if (bottomSheetDialog == null || (window = bottomSheetDialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener(decorView, this) { // from class: Vt0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f25731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RecommendBottomSheetDialog f25732b;

            {
                this.f25731a = decorView;
                this.f25732b = this;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                View view3 = this.f25731a;
                boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
                int i8 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
                int i9 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
                int i10 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
                int iCoerceAtLeast = RangesKt.coerceAtLeast(i9, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()).bottom);
                int i11 = TR.n.a(view3).heightPixels;
                RecommendBottomSheetDialog recommendBottomSheetDialog = this.f25732b;
                ConstraintLayout.LayoutParams layoutParams = null;
                if (zIsVisible) {
                    NestedScrollView nestedScrollView = recommendBottomSheetDialog.hf().k;
                    ViewGroup.LayoutParams layoutParams2 = recommendBottomSheetDialog.hf().k.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams3 = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        layoutParams3.matchConstraintMaxHeight = (((i11 - i8) - iCoerceAtLeast) - i10) - recommendBottomSheetDialog.h;
                        layoutParams = layoutParams3;
                    }
                    nestedScrollView.setLayoutParams(layoutParams);
                    ListExtentionsKt.gone(recommendBottomSheetDialog.hf().b);
                } else {
                    NestedScrollView nestedScrollView2 = recommendBottomSheetDialog.hf().k;
                    ViewGroup.LayoutParams layoutParams4 = recommendBottomSheetDialog.hf().k.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams5 = layoutParams4 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams4 : null;
                    ConstraintLayout.LayoutParams layoutParams6 = null;
                    if (layoutParams5 != null) {
                        layoutParams5.matchConstraintMaxHeight = recommendBottomSheetDialog.f88776g;
                        layoutParams6 = layoutParams5;
                    }
                    nestedScrollView2.setLayoutParams(layoutParams6);
                    ListExtentionsKt.visible(recommendBottomSheetDialog.hf().b);
                }
                return windowInsetsCompat;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        Dialog dialog;
        Window window;
        Context context;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        if (!com.bilibili.search2.component.a.b() || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null || (context = getContext()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels / displayMetrics.density <= 600.0f) {
            window.setLayout(-1, -2);
            return;
        }
        int i7 = displayMetrics.heightPixels;
        int px = ListExtentionsKt.toPx(WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
        this.f88776g = RangesKt.coerceAtMost((int) (i7 * 0.6f), ListExtentionsKt.toPx(580)) - this.h;
        window.setLayout(px, -2);
        window.setGravity(81);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.stardust.recommend.RecommendBottomSheetDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super/*androidx.fragment.app.DialogFragment*/.show(fragmentManager, str);
        } catch (IllegalStateException e7) {
            BLog.e("RecommendBottomSheetDialog", "ListBottomSheetDialog show failed");
        }
    }
}
