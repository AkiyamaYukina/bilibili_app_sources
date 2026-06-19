package com.bilibili.search2.result.ogv.aggregate;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.SearchOgvRelationItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6843f;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/p.class */
@StabilityInferred(parameters = 0)
public final class p extends AbstractC6843f<SearchOgvRelationItem.DetailsRelationItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.api.g f88393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f88394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliImageView f88395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VectorTextView f88396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f88397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f88398f;

    public p(@NotNull View view) {
        super(view);
        this.f88394b = view.findViewById(2131308238);
        this.f88395c = view.findViewById(2131308208);
        this.f88396d = view.findViewById(2131308207);
        this.f88397e = (TintTextView) view.findViewById(2131308209);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(2131308241);
        this.f88398f = view.findViewById(2131297891);
        constraintLayout.setOnClickListener(new XF0.p(2, this, view));
    }

    @Override // dt0.AbstractC6839b
    public final void bind() {
        String title = ((SearchOgvRelationItem.DetailsRelationItem) getData()).getTitle();
        TintTextView tintTextView = this.f88397e;
        B.A(tintTextView, title);
        ListExtentionsKt.setTextWithIcon$default(this.f88396d, ((SearchOgvRelationItem.DetailsRelationItem) getData()).getViewContent(), ((SearchOgvRelationItem.DetailsRelationItem) getData()).getIconType(), R$color.Graph_white, 0.0f, 0.0f, 48, (Object) null);
        tintTextView.setTextColorById(R$color.Text1);
        if (StringsKt.x(((SearchOgvRelationItem.DetailsRelationItem) getData()).getGoTo(), "comic")) {
            ListExtentionsKt.gone(this.f88398f);
            ListExtentionsKt.gone(this.f88396d);
        } else {
            ListExtentionsKt.visible(this.f88398f);
        }
        com.bilibili.search2.utils.extension.c.a(this.f88395c, ((SearchOgvRelationItem.DetailsRelationItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        Tag ogvTagV2 = ((SearchOgvRelationItem.DetailsRelationItem) getData()).getOgvTagV2();
        if (ogvTagV2 != null) {
            this.f88394b.tagBuilder().setTagText(ogvTagV2.getText()).setTagBackgroundColor(ogvTagV2.getBgColor()).setTagTextColor(ogvTagV2.getTextColor()).setTagTextSize(ListExtentionsKt.toPx(10)).applyToView(true);
        }
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f88397e;
    }
}
