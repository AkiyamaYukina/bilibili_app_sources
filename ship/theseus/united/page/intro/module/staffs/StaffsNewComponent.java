package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import Yt0.W;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.compose.foundation.text.C3778v1;
import androidx.compose.foundation.text.C3781w1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.analytics.RunnableC4676s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import dv0.C6870i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.videopage.common.widget.view.FlashTextView;
import tv.danmaku.bili.videopage.common.widget.view.VerifyLottieFollowButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent.class */
@StabilityInferred(parameters = 0)
public final class StaffsNewComponent extends com.bilibili.app.gemini.ui.m<C6870i0> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f101800m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StaffsService$createStaffs$state$1 f101801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f101802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101803c = DimenUtilsKt.dpToPx(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101804d = DimenUtilsKt.dpToPx(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101805e = DimenUtilsKt.dpToPx(12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f101806f = DimenUtilsKt.dpToPx(8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f101807g = DimenUtilsKt.dpToPx(6);
    public final int h = DimenUtilsKt.dpToPx(30);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f101808i = DimenUtilsKt.dpToPx(30);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f101809j = new b(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashMap<Long, FollowButtonState> f101810k = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f101811l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$FollowButtonState.class */
    public static final class FollowButtonState {
        private static final EnumEntries $ENTRIES;
        private static final FollowButtonState[] $VALUES;
        public static final FollowButtonState ANIMATION = new FollowButtonState("ANIMATION", 0);
        public static final FollowButtonState INIT_SHOW = new FollowButtonState("INIT_SHOW", 1);
        public static final FollowButtonState INIT_HIDDEN = new FollowButtonState("INIT_HIDDEN", 2);
        public static final FollowButtonState CHANGE_TO_SHOW = new FollowButtonState("CHANGE_TO_SHOW", 3);
        public static final FollowButtonState CHANGE_TO_HIDDEN = new FollowButtonState("CHANGE_TO_HIDDEN", 4);

        private static final /* synthetic */ FollowButtonState[] $values() {
            return new FollowButtonState[]{ANIMATION, INIT_SHOW, INIT_HIDDEN, CHANGE_TO_SHOW, CHANGE_TO_HIDDEN};
        }

        static {
            FollowButtonState[] followButtonStateArr$values = $values();
            $VALUES = followButtonStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(followButtonStateArr$values);
        }

        private FollowButtonState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<FollowButtonState> getEntries() {
            return $ENTRIES;
        }

        public static FollowButtonState valueOf(String str) {
            return (FollowButtonState) Enum.valueOf(FollowButtonState.class, str);
        }

        public static FollowButtonState[] values() {
            return (FollowButtonState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$StaffArea.class */
    public static final class StaffArea {
        private static final EnumEntries $ENTRIES;
        private static final StaffArea[] $VALUES;
        public static final StaffArea HEAD = new StaffArea("HEAD", 0);
        public static final StaffArea INFO = new StaffArea("INFO", 1);

        private static final /* synthetic */ StaffArea[] $values() {
            return new StaffArea[]{HEAD, INFO};
        }

        static {
            StaffArea[] staffAreaArr$values = $values();
            $VALUES = staffAreaArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(staffAreaArr$values);
        }

        private StaffArea(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<StaffArea> getEntries() {
            return $ENTRIES;
        }

        public static StaffArea valueOf(String str) {
            return (StaffArea) Enum.valueOf(StaffArea.class, str);
        }

        public static StaffArea[] values() {
            return (StaffArea[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f101812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final VerifyLottieFollowButton f101813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final View f101814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TintTextView f101815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FlashTextView f101816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public AnimatorSet f101817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Staff f101818g;

        @Nullable
        public CoroutineScope h;

        public a(@NotNull View view) {
            super(view);
            this.f101812a = view.findViewById(2131296796);
            this.f101813b = view.findViewById(2131301778);
            this.f101814c = view.findViewById(2131301661);
            this.f101815d = (TintTextView) view.findViewById(2131304923);
            this.f101816e = view.findViewById(2131302792);
        }

        @MainThread
        public final void p0() {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2 = this.h;
            if (coroutineScope2 == null || !CoroutineScopeKt.isActive(coroutineScope2) || (coroutineScope = this.h) == null) {
                return;
            }
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$b.class */
    public final class b extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ActivityColorRepository f101821c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final StaffsNewComponent f101824f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<Integer> f101819a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<Staff> f101820b = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final C3778v1 f101822d = new C3778v1(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final C3781w1 f101823e = new C3781w1(1);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$b$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f101825a;

            static {
                int[] iArr = new int[FollowButtonState.values().length];
                try {
                    iArr[FollowButtonState.ANIMATION.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[FollowButtonState.CHANGE_TO_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[FollowButtonState.CHANGE_TO_HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[FollowButtonState.INIT_HIDDEN.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[FollowButtonState.INIT_SHOW.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                f101825a = iArr;
            }
        }

        public b(StaffsNewComponent staffsNewComponent) {
            this.f101824f = staffsNewComponent;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f101820b.size();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0560  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0578  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 1940
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(p.a(viewGroup, 2131501183, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            a aVar = (a) viewHolder;
            super.onViewAttachedToWindow(aVar);
            CoroutineScope coroutineScope = aVar.h;
            if (coroutineScope == null || !CoroutineScopeKt.isActive(coroutineScope)) {
                aVar.h = X9.n.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            a aVar = (a) viewHolder;
            AnimatorSet animatorSet = aVar.f101817f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            aVar.p0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            a aVar = (a) viewHolder;
            super.onViewRecycled(aVar);
            aVar.p0();
        }
    }

    public StaffsNewComponent(@NotNull StaffsService$createStaffs$state$1 staffsService$createStaffs$state$1, @NotNull StateFlow stateFlow) {
        this.f101801a = staffsService$createStaffs$state$1;
        this.f101802b = stateFlow;
        this.f101811l = StateFlowKt.MutableStateFlow(Integer.valueOf(staffsService$createStaffs$state$1.f101860a.f101830E));
    }

    public static final void c(StaffsNewComponent staffsNewComponent, RecyclerView recyclerView) {
        b bVar = staffsNewComponent.f101809j;
        List<Staff> list = staffsNewComponent.f101801a.f101860a.f101855y;
        bVar.f101820b.clear();
        if (list != null) {
            bVar.f101820b.addAll(list);
        }
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new RunnableC4676s(staffsNewComponent, 3));
        } else {
            staffsNewComponent.f101809j.notifyDataSetChanged();
        }
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6870i0 c6870i0 = (C6870i0) viewBinding;
        TextView textView = c6870i0.f117021e;
        TextView textView2 = c6870i0.f117019c;
        StaffsService$createStaffs$state$1 staffsService$createStaffs$state$1 = this.f101801a;
        ActivityColorRepository activityColorRepository = staffsService$createStaffs$state$1.f101860a.f101842l;
        b bVar = this.f101809j;
        bVar.f101821c = activityColorRepository;
        RecyclerView recyclerView = c6870i0.f117020d;
        recyclerView.setAdapter(bVar);
        C6369f c6369f = staffsService$createStaffs$state$1.f101861b;
        int length = c6369f.f101866a.length();
        Group group = c6870i0.f117022f;
        TintImageView tintImageView = c6870i0.f117018b;
        StaffsService staffsService = staffsService$createStaffs$state$1.f101860a;
        if (length == 0) {
            group.setVisibility(8);
        } else {
            group.setVisibility(0);
            textView.setText(c6369f.f101866a);
            textView2.setText(staffsService.f101832a.getResources().getQuantityString(2131689589, ((ArrayList) staffsService.f101855y).size(), Integer.valueOf(((ArrayList) staffsService.f101855y).size())));
            textView.setOnClickListener(new W(this, 1));
            textView2.setOnClickListener(new QS0.d(this, 3));
            tintImageView.setOnClickListener(new On0.i(this, 3));
        }
        c(this, recyclerView);
        TextView textView3 = c6870i0.f117021e;
        Integer numH = staffsService.f101842l.h();
        ConstraintLayout constraintLayout = c6870i0.f117017a;
        textView3.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(constraintLayout.getContext(), R$color.Ga10));
        Integer numE = staffsService.f101842l.e();
        c6870i0.f117019c.setTextColor(numE != null ? numE.intValue() : ContextCompat.getColor(constraintLayout.getContext(), R$color.Ga5));
        Integer numE2 = staffsService.f101842l.e();
        tintImageView.setColorFilter(numE2 != null ? numE2.intValue() : ContextCompat.getColor(constraintLayout.getContext(), R$color.Ga5));
        staffsService.f101856z = new t(this, recyclerView);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new StaffsNewComponent$bind$6(this, textView, tintImageView, c6870i0, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C6870i0 c6870i0Inflate = C6870i0.inflate(layoutInflater, viewGroup, false);
        c6870i0Inflate.f117020d.setNestedScrollingEnabled(false);
        return c6870i0Inflate;
    }
}
