package com.bilibili.ship.theseus.ugc.intro.uplikes;

import I.E;
import K7.M;
import Vu0.q;
import Vu0.r;
import Vu0.s;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.bilipay.ui.recharge.v2.n;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.upper.module.contribute.up.dialog.PublishChargeLevelDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent.class */
@StabilityInferred(parameters = 0)
public final class UgcUpLikesPanelComponent extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<q> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f97640r = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f97641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f97642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f97643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f97644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f97645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final c f97646q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$LoadingState.class */
    public static final class LoadingState {
        private static final EnumEntries $ENTRIES;
        private static final LoadingState[] $VALUES;
        public static final LoadingState LOADING = new LoadingState("LOADING", 0);
        public static final LoadingState SUCCEED = new LoadingState("SUCCEED", 1);
        public static final LoadingState EMPTY = new LoadingState("EMPTY", 2);
        public static final LoadingState ERROR = new LoadingState("ERROR", 3);

        private static final /* synthetic */ LoadingState[] $values() {
            return new LoadingState[]{LOADING, SUCCEED, EMPTY, ERROR};
        }

        static {
            LoadingState[] loadingStateArr$values = $values();
            $VALUES = loadingStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(loadingStateArr$values);
        }

        private LoadingState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<LoadingState> getEntries() {
            return $ENTRIES;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0884a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f97647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final User f97648b;

            public C0884a(int i7, @NotNull User user) {
                this.f97647a = i7;
                this.f97648b = user;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0884a)) {
                    return false;
                }
                C0884a c0884a = (C0884a) obj;
                return this.f97647a == c0884a.f97647a && Intrinsics.areEqual(this.f97648b, c0884a.f97648b);
            }

            public final int hashCode() {
                return this.f97648b.hashCode() + (Integer.hashCode(this.f97647a) * 31);
            }

            @NotNull
            public final String toString() {
                return "ItemChanged(index=" + this.f97647a + ", user=" + this.f97648b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f97649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final User f97650b;

            public b(int i7, @NotNull User user) {
                this.f97649a = i7;
                this.f97650b = user;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f97649a == bVar.f97649a && Intrinsics.areEqual(this.f97650b, bVar.f97650b);
            }

            public final int hashCode() {
                return this.f97650b.hashCode() + (Integer.hashCode(this.f97649a) * 31);
            }

            @NotNull
            public final String toString() {
                return "ItemClick(index=" + this.f97649a + ", user=" + this.f97650b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f97651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final User f97652b;

            public c(int i7, @NotNull User user) {
                this.f97651a = i7;
                this.f97652b = user;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f97651a == cVar.f97651a && Intrinsics.areEqual(this.f97652b, cVar.f97652b);
            }

            public final int hashCode() {
                return this.f97652b.hashCode() + (Integer.hashCode(this.f97651a) * 31);
            }

            @NotNull
            public final String toString() {
                return "ItemExpose(index=" + this.f97651a + ", user=" + this.f97652b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f97653a;

            public d() {
                this(false);
            }

            public d(boolean z6) {
                this.f97653a = z6;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f97653a == ((d) obj).f97653a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f97653a);
            }

            @NotNull
            public final String toString() {
                return androidx.appcompat.app.i.a(new StringBuilder("LoadListData(filterOnlyFans="), this.f97653a, ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<User> f97654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f97656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final LoadingState f97657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f97658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f97659f;

        public b(@NotNull List<User> list, boolean z6, long j7, @NotNull LoadingState loadingState, @NotNull String str, @NotNull String str2) {
            this.f97654a = list;
            this.f97655b = z6;
            this.f97656c = j7;
            this.f97657d = loadingState;
            this.f97658e = str;
            this.f97659f = str2;
        }

        public /* synthetic */ b(boolean z6, long j7, LoadingState loadingState, String str, String str2, int i7) {
            this((List<User>) CollectionsKt.emptyList(), (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? 0L : j7, loadingState, str, (i7 & 32) != 0 ? "" : str2);
        }

        public static b a(b bVar, List list, LoadingState loadingState, int i7) {
            if ((i7 & 1) != 0) {
                list = bVar.f97654a;
            }
            boolean z6 = bVar.f97655b;
            long j7 = bVar.f97656c;
            if ((i7 & 8) != 0) {
                loadingState = bVar.f97657d;
            }
            String str = bVar.f97658e;
            String str2 = bVar.f97659f;
            bVar.getClass();
            return new b((List<User>) list, z6, j7, loadingState, str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f97654a, bVar.f97654a) && this.f97655b == bVar.f97655b && this.f97656c == bVar.f97656c && this.f97657d == bVar.f97657d && Intrinsics.areEqual(this.f97658e, bVar.f97658e) && Intrinsics.areEqual(this.f97659f, bVar.f97659f);
        }

        public final int hashCode() {
            return this.f97659f.hashCode() + E.a((this.f97657d.hashCode() + C3554n0.a(z.a(this.f97654a.hashCode() * 31, 31, this.f97655b), 31, this.f97656c)) * 31, 31, this.f97658e);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbA = M.a("UgcUpLikesPanelState(userList=", ", onlyFans=", this.f97654a);
            sbA.append(this.f97655b);
            sbA.append(", totalLikes=");
            sbA.append(this.f97656c);
            sbA.append(", loadingState=");
            sbA.append(this.f97657d);
            sbA.append(", fromSpmid=");
            sbA.append(this.f97658e);
            sbA.append(", panelTitle=");
            return C8770a.a(sbA, this.f97659f, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$c.class */
    public final class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f97663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f97664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f97665d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f97667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final UgcUpLikesPanelComponent f97668g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<User> f97662a = new ArrayList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final HashSet<User> f97666e = new HashSet<>();

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$c$a.class */
        public final class a extends RecyclerView.ViewHolder {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$c$b.class */
        public final class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final s f97669a;

            public b(@NotNull s sVar) {
                super(sVar.f25966a);
                this.f97669a = sVar;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$c$c.class */
        public final class C0886c extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final r f97670a;

            public C0886c(@NotNull r rVar) {
                super(rVar.f25960a);
                this.f97670a = rVar;
            }
        }

        public c(UgcUpLikesPanelComponent ugcUpLikesPanelComponent) {
            this.f97668g = ugcUpLikesPanelComponent;
        }

        public static Drawable N(c cVar, int i7, boolean z6, boolean z7, boolean z8, boolean z9, int i8) {
            if ((i8 & 4) != 0) {
                z6 = false;
            }
            if ((i8 & 8) != 0) {
                z7 = false;
            }
            if ((i8 & 16) != 0) {
                z8 = false;
            }
            if ((i8 & 32) != 0) {
                z9 = false;
            }
            cVar.getClass();
            float fDpToPx = DimenUtilsKt.dpToPx(8);
            GradientDrawable gradientDrawable = new GradientDrawable();
            float f7 = z6 ? fDpToPx : 0.0f;
            float f8 = z6 ? fDpToPx : 0.0f;
            float f9 = z7 ? fDpToPx : 0.0f;
            float f10 = z7 ? fDpToPx : 0.0f;
            float f11 = z8 ? fDpToPx : 0.0f;
            float f12 = z8 ? fDpToPx : 0.0f;
            float f13 = z9 ? fDpToPx : 0.0f;
            if (!z9) {
                fDpToPx = 0.0f;
            }
            gradientDrawable.setCornerRadii(new float[]{f7, f8, f9, f10, f11, f12, f13, fDpToPx});
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(i7);
            return gradientDrawable;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int getItemCount() {
            /*
                r3 = this;
                r0 = r3
                java.util.ArrayList<com.bilibili.ship.theseus.ugc.intro.uplikes.User> r0 = r0.f97662a
                int r0 = r0.size()
                r5 = r0
                r0 = r3
                boolean r0 = r0.f97667f
                if (r0 == 0) goto L1f
                r0 = r5
                if (r0 <= 0) goto L1f
                r0 = 1
                r4 = r0
                r0 = r5
                r1 = 2
                int r0 = r0 % r1
                r1 = 1
                if (r0 != r1) goto L1f
                goto L21
            L1f:
                r0 = 0
                r4 = r0
            L21:
                r0 = r5
                r1 = r4
                int r0 = r0 + r1
                r1 = r3
                boolean r1 = r1.f97664c
                int r0 = r0 + r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent.c.getItemCount():int");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            int size = this.f97662a.size();
            return i7 < size ? 1 : ((this.f97667f && size > 0 && size % 2 == 1) && i7 == size) ? 3 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            this.f97665d = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, final int i7) {
            int i8 = 8;
            Context context = viewHolder.itemView.getContext();
            int color = ContextCompat.getColor(context, R$color.Bg1_float);
            if (!(viewHolder instanceof C0886c)) {
                if (viewHolder instanceof a) {
                    viewHolder.itemView.setBackground(N(this, color, false, false, true, false, 44));
                    return;
                } else {
                    if (viewHolder instanceof b) {
                        ((b) viewHolder).f97669a.f25967b.setText(context.getString(this.f97663b ? 2131849011 : 2131841726));
                        return;
                    }
                    return;
                }
            }
            final User user = (User) CollectionsKt.getOrNull(this.f97662a, i7);
            if (user == null) {
                return;
            }
            r rVar = ((C0886c) viewHolder).f97670a;
            rVar.f25963d.setText(user.f97690b);
            TextView textView = rVar.f25965f;
            boolean zA = user.a();
            String string = user.h;
            if (!zA) {
                string = context.getString(2131848994, string, NumberFormat_androidKt.format$default(Long.valueOf(user.f97692d), "0", 0, 2, (Object) null));
            }
            textView.setText(string);
            BiliImageView biliImageView = rVar.f25962c;
            String str = user.f97691c;
            if (str != null && str.length() != 0) {
                Context context2 = biliImageView.getContext();
                BiliImageLoader.INSTANCE.with(context2).url(str).roundingParams(RoundingParams.Companion.asCircle().setBorder(ThemeUtils.getColorById(context2, R$color.f64616Wh0), ScreenUtil.dip2px(context2, 1.0f))).into(biliImageView);
            }
            FollowButton followButton = rVar.f25961b;
            followButton.releaseFollowStatus();
            Context context3 = followButton.getContext();
            long jC = com.bilibili.ship.theseus.united.utils.e.c();
            long j7 = user.f97689a;
            final UgcUpLikesPanelComponent ugcUpLikesPanelComponent = this.f97668g;
            if (jC == j7 || user.a()) {
                Lazy lazy = p.f81943a;
                followButton.setVisibility(8);
            } else {
                Lazy lazy2 = p.f81943a;
                followButton.setVisibility(0);
                followButton.bind(new FollowButtonConfig.Builder(j7, user.f97693e == 1, 0, new g(this.f97668g, i7, user, context3, this)).setIsGuestAttention(user.f97695g == 1).setClickReportExtras(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("spmid", "united.player-video-detail.like-list.0"), TuplesKt.to("from_spmid", ((b) ugcUpLikesPanelComponent.f97641l.getValue()).f97658e), TuplesKt.to(EditCustomizeSticker.TAG_MID, String.valueOf(user.f97689a)), TuplesKt.to(EditCustomizeSticker.TAG_RANK, String.valueOf(i7))})).build());
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(ugcUpLikesPanelComponent, i7, user) { // from class: com.bilibili.ship.theseus.ugc.intro.uplikes.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UgcUpLikesPanelComponent f97723a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f97724b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final User f97725c;

                {
                    this.f97723a = ugcUpLikesPanelComponent;
                    this.f97724b = i7;
                    this.f97725c = user;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97723a.f97644o.tryEmit(new UgcUpLikesPanelComponent.a.b(this.f97724b, this.f97725c));
                }
            });
            if (!this.f97666e.contains(user)) {
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(followButton, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new Function0(ugcUpLikesPanelComponent, i7, user, this) { // from class: com.bilibili.ship.theseus.ugc.intro.uplikes.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcUpLikesPanelComponent f97726a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f97727b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final User f97728c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final UgcUpLikesPanelComponent.c f97729d;

                    {
                        this.f97726a = ugcUpLikesPanelComponent;
                        this.f97727b = i7;
                        this.f97728c = user;
                        this.f97729d = this;
                    }

                    public final Object invoke() {
                        MutableSharedFlow<UgcUpLikesPanelComponent.a> mutableSharedFlow = this.f97726a.f97644o;
                        User user2 = this.f97728c;
                        mutableSharedFlow.tryEmit(new UgcUpLikesPanelComponent.a.c(this.f97727b, user2));
                        this.f97729d.f97666e.add(user2);
                        return Unit.INSTANCE;
                    }
                }));
            }
            boolean z6 = this.f97667f;
            ConstraintLayout constraintLayout = rVar.f25960a;
            if (z6) {
                int size = this.f97662a.size();
                int i9 = size % 2 == 1 ? size + 1 : size;
                boolean z7 = i7 < 2;
                boolean z8 = i7 >= i9 - 2 && i7 < i9;
                int i10 = i7 % 2;
                boolean z9 = i10 == 0;
                boolean z10 = i10 == 1;
                constraintLayout.setBackground(size == 1 ? N(this, color, true, false, false, true, 24) : i9 == 2 ? z9 ? N(this, color, true, false, false, true, 24) : N(this, color, false, true, true, false, 36) : z7 ? N(this, color, z9, z10, false, false, 48) : z8 ? N(this, color, false, false, z10, z9, 12) : new ColorDrawable(color));
            } else if (this.f97662a.size() == 1) {
                constraintLayout.setBackground(p.f(color, 0.0f, 8, 0));
            } else if (i7 == 0) {
                constraintLayout.setBackground(p.o(color, 8));
            } else if (i7 == this.f97662a.size() - 1) {
                float fDpToPx = DimenUtilsKt.dpToPx(8);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDpToPx, fDpToPx, fDpToPx, fDpToPx});
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(color);
                constraintLayout.setBackground(gradientDrawable);
            } else {
                constraintLayout.setBackground(new ColorDrawable(color));
            }
            if (!this.f97667f) {
                View view = rVar.f25964e;
                if (i7 < this.f97662a.size() - 1) {
                    i8 = 0;
                }
                view.setVisibility(i8);
                return;
            }
            int size2 = this.f97662a.size();
            int i11 = size2;
            if (size2 % 2 == 1) {
                i11 = size2 + 1;
            }
            boolean z11 = i7 >= i11 - 2 && i7 < i11;
            View view2 = rVar.f25964e;
            if (!z11) {
                i8 = 0;
            }
            view2.setVisibility(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            RecyclerView.ViewHolder bVar;
            if (i7 == 2) {
                bVar = new b(s.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            } else if (i7 != 3) {
                bVar = new C0886c(r.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            } else {
                View view = new View(viewGroup.getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, DimenUtilsKt.dpToPx(64)));
                bVar = new RecyclerView.ViewHolder(view);
            }
            return bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
            super.onDetachedFromRecyclerView(recyclerView);
            this.f97665d = false;
        }
    }

    public UgcUpLikesPanelComponent(@NotNull StateFlow<b> stateFlow, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f97641l = stateFlow;
        this.f97642m = aVar;
        l(0.5625f);
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 5, (BufferOverflow) null, 5, (Object) null);
        this.f97644o = mutableSharedFlowMutableSharedFlow$default;
        this.f97645p = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f97646q = new c(this);
    }

    public static final void m(q qVar, boolean z6, boolean z7, boolean z8) {
        qVar.f25958f.setVisibility(z6 ? 0 : 8);
        qVar.f25956d.setVisibility(z7 ? 0 : 8);
        int i7 = 8;
        if (z8) {
            i7 = 0;
        }
        qVar.f25955c.setVisibility(i7);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        q qVar = (q) viewBinding;
        Context context = qVar.f25953a.getContext();
        qVar.f25957e.setAdapter(this.f97646q);
        boolean z6 = this.f97643n;
        final VectorTextView vectorTextView = qVar.f25959g;
        vectorTextView.setSelected(z6);
        final int i7 = 1;
        vectorTextView.setOnClickListener(new View.OnClickListener(i7, this, vectorTextView) { // from class: HG0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f8549c;

            {
                this.f8547a = i7;
                this.f8548b = this;
                this.f8549c = vectorTextView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f8547a) {
                    case 0:
                        PublishChargeLevelDialog.a aVar = (PublishChargeLevelDialog.a) this.f8548b;
                        PublishChargeLevelDialog.a.a aVar2 = (PublishChargeLevelDialog.a.a) this.f8549c;
                        if (aVar.d != aVar2.getAbsoluteAdapterPosition()) {
                            aVar.notifyItemChanged(aVar.d);
                            int absoluteAdapterPosition = aVar2.getAbsoluteAdapterPosition();
                            aVar.d = absoluteAdapterPosition;
                            aVar.notifyItemChanged(absoluteAdapterPosition);
                            break;
                        }
                        break;
                    default:
                        UgcUpLikesPanelComponent ugcUpLikesPanelComponent = (UgcUpLikesPanelComponent) this.f8548b;
                        VectorTextView vectorTextView2 = (VectorTextView) this.f8549c;
                        boolean z7 = !ugcUpLikesPanelComponent.f97643n;
                        ugcUpLikesPanelComponent.f97643n = z7;
                        vectorTextView2.setSelected(z7);
                        ugcUpLikesPanelComponent.f97644o.tryEmit(new UgcUpLikesPanelComponent.a.d(ugcUpLikesPanelComponent.f97643n));
                        break;
                }
            }
        });
        qVar.f25954b.setOnClickListener(new n(this, 1));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcUpLikesPanelComponent$bindContent$4(qVar, this, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q qVarInflate = q.inflate(LayoutInflater.from(context), viewGroup, false);
        this.f97644o.tryEmit(new a.d(false));
        return qVarInflate;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    @NotNull
    public final Drawable k(@NotNull Context context) {
        return ((Boolean) this.f99720d.getValue()).booleanValue() ? p.o(ContextCompat.getColor(context, R$color.Bg2_float), 8) : new ColorDrawable(ContextCompat.getColor(context, R$color.Bg2_float));
    }
}
