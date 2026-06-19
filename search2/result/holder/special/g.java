package com.bilibili.search2.result.holder.special;

import Bl.E0;
import Ps0.C2794o;
import android.graphics.PorterDuff;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchSpecialItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.s;
import dt0.AbstractC6843f;
import java.util.List;
import kntr.app.mall.product.details.page.vm.PageViewModel;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kntr.base.router.Router;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/special/g.class */
@StabilityInferred(parameters = 0)
public final class g extends AbstractC6843f<SearchSpecialItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final E0 f88220a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull E0 e02) {
        super(e02.a);
        this.f88220a = e02;
        this.itemView.setOnClickListener(new XD.b(this, 3));
        e02.e.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.result.holder.special.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f88217a;

            {
                this.f88217a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.special.g, dt0.b] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleCoroutineScope lifecycleScope;
                LifecycleCoroutineScope lifecycleScope2;
                ?? r02 = this.f88217a;
                C2794o reserveInfo = ((SearchSpecialItem) r02.getData()).getReserveInfo();
                if (reserveInfo == null || !reserveInfo.a()) {
                    return;
                }
                if (!o.b()) {
                    Os0.e.f18030a.d(r02.itemView.getContext());
                    return;
                }
                if (reserveInfo.f19229c == 1) {
                    Fragment fragment = r02.getFragment();
                    LifecycleOwner viewLifecycleOwner = fragment != null ? fragment.getViewLifecycleOwner() : null;
                    e eVar = new e(r02);
                    if (viewLifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                        BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new SpecialSOrderHelper$cancelOrder$1(reserveInfo.f19227a, reserveInfo.f19230d, eVar, null), 3, (Object) null);
                    }
                    Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchSpecialItem) r02.getData()).getLinkType(), (BaseSearchItem) r02.getData(), null, null, Xs0.b.d((BaseSearchItem) r02.getData(), "unfollow", null, 2), null, null, null, false, null, 8064);
                    return;
                }
                Fragment fragment2 = r02.getFragment();
                LifecycleOwner viewLifecycleOwner2 = fragment2 != null ? fragment2.getViewLifecycleOwner() : null;
                f fVar = new f(r02);
                if (viewLifecycleOwner2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SpecialSOrderHelper$doOrder$1(reserveInfo.f19227a, reserveInfo.f19230d, fVar, null), 3, (Object) null);
                }
                Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchSpecialItem) r02.getData()).getLinkType(), (BaseSearchItem) r02.getData(), null, null, Xs0.b.d((BaseSearchItem) r02.getData(), "follow", null, 2), null, null, null, false, null, 8064);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        q0();
        final E0 e02 = this.f88220a;
        Tag tag = null;
        e02.f.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchSpecialItem) getData()).getTitle(), 0, 4, (Object) null));
        List<Tag> newRecTagsV2 = ((SearchSpecialItem) getData()).getNewRecTagsV2();
        if (newRecTagsV2 != null) {
            tag = (Tag) CollectionsKt.getOrNull(newRecTagsV2, 0);
        }
        final int i7 = 0;
        B.i(e02.c, tag, null, ((SearchSpecialItem) getData()).getDesc(), new Function0(i7, e02, this) { // from class: com.bilibili.search2.result.holder.special.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f88214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f88215b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f88216c;

            {
                this.f88214a = i7;
                this.f88215b = e02;
                this.f88216c = this;
            }

            public final Object invoke() {
                Unit unit;
                switch (this.f88214a) {
                    case 0:
                        ((E0) this.f88215b).c.setText(((SearchSpecialItem) ((g) this.f88216c).getData()).getDesc());
                        return Unit.INSTANCE;
                    case 1:
                        ILogger kLog = KLog_androidKt.getKLog();
                        Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f88215b;
                        kLog.e("wbw_detail_good", "Result: onResume, pageFirsLoad: " + booleanRef.element);
                        if (booleanRef.element) {
                            booleanRef.element = false;
                            unit = Unit.INSTANCE;
                        } else {
                            ((PageViewModel) this.f88216c).o1(false);
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    default:
                        ((MutableState) this.f88216c).setValue(null);
                        ((Router) this.f88215b).launch(Uri.Companion.parse("/user_center/auth/realname"));
                        return Unit.INSTANCE;
                }
            }
        }, null, false, null, 2032);
        ListPlaceHolderImageView listPlaceHolderImageView = e02.b;
        s.c(listPlaceHolderImageView, this.itemView.getContext(), null, true, false, true, 22);
        com.bilibili.search2.utils.extension.c.a(listPlaceHolderImageView, ((SearchSpecialItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View getClickStatusView() {
        return this.f88220a.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() {
        boolean zHasOrderButton = ((SearchSpecialItem) getData()).hasOrderButton();
        E0 e02 = this.f88220a;
        if (!zHasOrderButton) {
            ListExtentionsKt.gone(e02.e);
            e02.c.setMaxLines(2);
            return;
        }
        ListExtentionsKt.visible(e02.e);
        boolean z6 = true;
        e02.c.setMaxLines(1);
        C2794o reserveInfo = ((SearchSpecialItem) getData()).getReserveInfo();
        if (reserveInfo != null) {
            TintLinearLayout tintLinearLayout = e02.e;
            ListExtentionsKt.visible(tintLinearLayout);
            TintTextView tintTextView = e02.g;
            ListExtentionsKt.visible(tintTextView);
            String str = reserveInfo.f19228b;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            tintTextView.setText(str2);
            if (reserveInfo.h != 1) {
                z6 = false;
            }
            BiliImageView biliImageView = e02.d;
            if (!z6) {
                ListExtentionsKt.gone(biliImageView);
                tintTextView.setTextColorById(R$color.Text3);
                tintLinearLayout.setBackgroundResource(2131239921);
                return;
            }
            ListExtentionsKt.visible(biliImageView);
            if (MultipleThemeUtils.isNightTheme(this.itemView.getContext())) {
                com.bilibili.search2.utils.extension.c.a(biliImageView, reserveInfo.f19232f, null, false, null, null, 0, 0, 254);
            } else {
                com.bilibili.search2.utils.extension.c.a(biliImageView, reserveInfo.f19231e, null, false, null, null, 0, 0, 254);
            }
            tintTextView.setTextColorById(R$color.Text_white);
            BiliImageView.setImageTint$default(biliImageView, R$color.Text_white, (PorterDuff.Mode) null, 2, (Object) null);
            tintLinearLayout.setBackgroundResource(2131239964);
        }
    }
}
