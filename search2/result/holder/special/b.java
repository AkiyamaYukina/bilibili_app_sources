package com.bilibili.search2.result.holder.special;

import Bl.D0;
import Ps0.C2794o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchSpecialItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.result.holder.special.b;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.CoverAspectRatio;
import com.bilibili.search2.utils.s;
import dt0.AbstractC6843f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/special/b.class */
@StabilityInferred(parameters = 0)
public final class b extends AbstractC6843f<SearchSpecialItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextView f88205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliImageView f88206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView f88207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView f88208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ViewGroup f88209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliImageView f88210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintTextView f88211g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/special/b$a.class */
    public static final class a extends BiliApiDataCallback<C2794o> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f88212b;

        public a(b bVar) {
            this.f88212b = bVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v3, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.special.b] */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(C2794o c2794o) throws NoWhenBranchMatchedException {
            C2794o c2794o2 = c2794o;
            ?? r02 = this.f88212b;
            Context context = r02.itemView.getContext();
            if (context == null) {
                return;
            }
            ((SearchSpecialItem) r02.getData()).setReserveInfo(c2794o2);
            r02.q0();
            if (c2794o2 == null || !c2794o2.a()) {
                ToastHelper.showToastShort(context, context.getString(2131847908));
            } else {
                ToastHelper.showToastShort(context, context.getString(2131847842));
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            Context context = this.f88212b.itemView.getContext();
            if (context == null) {
                return;
            }
            ToastHelper.showToastShort(context, context.getString(2131847724));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.holder.special.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/special/b$b.class */
    public static final class C0596b extends BiliApiDataCallback<C2794o> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f88213b;

        public C0596b(b bVar) {
            this.f88213b = bVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v3, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.special.b] */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(C2794o c2794o) throws NoWhenBranchMatchedException {
            C2794o c2794o2 = c2794o;
            ?? r02 = this.f88213b;
            Context context = r02.itemView.getContext();
            if (context == null) {
                return;
            }
            ((SearchSpecialItem) r02.getData()).setReserveInfo(c2794o2);
            r02.q0();
            if (c2794o2 == null || !c2794o2.a()) {
                ToastHelper.showToastShort(context, context.getString(2131847908));
            } else {
                ToastHelper.showToastShort(context, context.getString(2131847694));
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            Context context = this.f88213b.itemView.getContext();
            if (context == null) {
                return;
            }
            ToastHelper.showToastShort(context, context.getString(2131847724));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull D0 d02) {
        super(d02.a);
        this.f88205a = (TextView) this.itemView.findViewById(2131308958);
        this.f88206b = this.itemView.findViewById(2131298941);
        this.f88207c = this.itemView.findViewById(2131299190);
        this.f88208d = this.itemView.findViewById(2131312878);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(2131308390);
        this.f88209e = viewGroup;
        this.f88210f = this.itemView.findViewById(2131304386);
        this.f88211g = (TintTextView) this.itemView.findViewById(2131314930);
        viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.result.holder.special.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f88204a;

            {
                this.f88204a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleCoroutineScope lifecycleScope;
                LifecycleCoroutineScope lifecycleScope2;
                b bVar = this.f88204a;
                C2794o reserveInfo = ((SearchSpecialItem) bVar.getData()).getReserveInfo();
                if (reserveInfo == null || !reserveInfo.a()) {
                    return;
                }
                if (!o.b()) {
                    Os0.e.f18030a.d(view.getContext());
                    return;
                }
                if (reserveInfo.f19229c == 1) {
                    Fragment fragment = bVar.getFragment();
                    LifecycleOwner viewLifecycleOwner = fragment != null ? fragment.getViewLifecycleOwner() : null;
                    b.a aVar = new b.a(bVar);
                    if (viewLifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                        BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new SpecialSOrderHelper$cancelOrder$1(reserveInfo.f19227a, reserveInfo.f19230d, aVar, null), 3, (Object) null);
                    }
                    Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchSpecialItem) bVar.getData()).getLinkType(), (BaseSearchItem) bVar.getData(), null, null, Xs0.b.d((BaseSearchItem) bVar.getData(), "unfollow", null, 2), null, null, null, false, null, 8064);
                    return;
                }
                Fragment fragment2 = bVar.getFragment();
                LifecycleOwner viewLifecycleOwner2 = fragment2 != null ? fragment2.getViewLifecycleOwner() : null;
                b.C0596b c0596b = new b.C0596b(bVar);
                if (viewLifecycleOwner2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SpecialSOrderHelper$doOrder$1(reserveInfo.f19227a, reserveInfo.f19230d, c0596b, null), 3, (Object) null);
                }
                Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchSpecialItem) bVar.getData()).getLinkType(), (BaseSearchItem) bVar.getData(), null, null, Xs0.b.d((BaseSearchItem) bVar.getData(), "follow", null, 2), null, null, null, false, null, 8064);
            }
        });
        this.itemView.setOnClickListener(new Sr0.a(this, 6));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        q0();
        Tag tag = null;
        this.f88205a.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchSpecialItem) getData()).getTitle(), 0, 4, (Object) null));
        ListExtentionsKt.gone(this.f88208d);
        List<Tag> newRecTagsV2 = ((SearchSpecialItem) getData()).getNewRecTagsV2();
        if (newRecTagsV2 != null) {
            tag = (Tag) CollectionsKt.getOrNull(newRecTagsV2, 0);
        }
        B.i(this.f88207c, tag, null, ((SearchSpecialItem) getData()).getDesc(), new QJ.b(this, 3), null, false, null, 2032);
        com.bilibili.search2.utils.extension.c.a(this.f88206b, ((SearchSpecialItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View getClickStatusView() {
        return this.f88205a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() throws NoWhenBranchMatchedException {
        if (!((SearchSpecialItem) getData()).hasOrderButton()) {
            ListExtentionsKt.gone(this.f88209e);
            r0(false);
            return;
        }
        r0(true);
        C2794o reserveInfo = ((SearchSpecialItem) getData()).getReserveInfo();
        if (reserveInfo != null) {
            ListExtentionsKt.visible(this.f88209e);
            String str = reserveInfo.f19228b;
            TintTextView tintTextView = this.f88211g;
            B.A(tintTextView, str);
            long j7 = reserveInfo.h;
            boolean z6 = j7 == 1;
            BiliImageView biliImageView = this.f88210f;
            if (z6) {
                ListExtentionsKt.visible(biliImageView);
                if (MultipleThemeUtils.isNightTheme(this.itemView.getContext())) {
                    com.bilibili.search2.utils.extension.c.a(this.f88210f, reserveInfo.f19232f, null, false, null, null, 0, 0, 254);
                } else {
                    com.bilibili.search2.utils.extension.c.a(this.f88210f, reserveInfo.f19231e, null, false, null, null, 0, 0, 254);
                }
                tintTextView.setTextColorById(R$color.Text_white);
                this.f88209e.setBackgroundResource(2131239964);
                return;
            }
            boolean z7 = false;
            if (j7 == 1) {
                z7 = true;
            }
            if (z7) {
                return;
            }
            ListExtentionsKt.gone(biliImageView);
            tintTextView.setTextColorById(R$color.Text3);
            this.f88209e.setBackgroundResource(2131239921);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(boolean z6) throws NoWhenBranchMatchedException {
        Pair pairA = s.a(this.itemView.getContext(), z6 ? CoverAspectRatio.RATIO_1_1 : CoverAspectRatio.RATIO_16_9, !z6, z6, 2);
        int iIntValue = pairA != null ? ((Number) pairA.getFirst()).intValue() : z6 ? ListExtentionsKt.toPx(82) : ListExtentionsKt.toPx(172);
        int iIntValue2 = pairA != null ? ((Number) pairA.getSecond()).intValue() : z6 ? ListExtentionsKt.toPx(82) : ListExtentionsKt.toPx(97);
        BiliImageView biliImageView = this.f88206b;
        ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        biliImageView.setLayoutParams(layoutParams);
    }
}
