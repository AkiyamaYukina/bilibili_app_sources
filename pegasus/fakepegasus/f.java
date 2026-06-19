package com.bilibili.pegasus.fakepegasus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.widget.image.AutoTintBiliImageView;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Avatar;
import com.bilibili.pegasus.api.modelv2.SmallCoverV2Item;
import com.bilibili.pegasus.api.modelv2.Tag;
import com.bilibili.pegasus.utils.x;
import gl.J;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/f.class */
@StabilityInferred(parameters = 0)
public final class f extends RecyclerView.Adapter<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FakePegasusFragment f77449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<BasicIndexItem> f77450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public n f77451c;

    public f(@NotNull FakePegasusFragment fakePegasusFragment, @NotNull List<? extends BasicIndexItem> list) {
        this.f77449a = fakePegasusFragment;
        this.f77450b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f77450b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        i iVar = (i) viewHolder;
        Object orNull = CollectionsKt.getOrNull(this.f77450b, i7);
        SmallCoverV2Item smallCoverV2Item = orNull instanceof SmallCoverV2Item ? (SmallCoverV2Item) orNull : null;
        n nVar = this.f77451c;
        if (smallCoverV2Item == null) {
            iVar.getClass();
            return;
        }
        iVar.f77462d = smallCoverV2Item;
        iVar.f77463e = this.f77449a;
        iVar.f77464f = i7;
        J j7 = iVar.f77459a;
        if (nVar != null) {
            j7.m.setTextSize(2, nVar.f77472d);
            VectorTextView vectorTextView = j7.d;
            float f7 = nVar.f77473e;
            vectorTextView.setTextSize(2, f7);
            j7.e.setTextSize(2, f7);
            j7.f.setTextSize(2, f7);
        }
        j7.k.setGoneChildSpaceTooSmall(false);
        VectorTextView vectorTextView2 = j7.d;
        vectorTextView2.setContentDescription(smallCoverV2Item.coverLeftText1ContentDesc);
        VectorTextView vectorTextView3 = j7.e;
        vectorTextView3.setContentDescription(smallCoverV2Item.coverLeftText2ContentDesc);
        TagTintTextView tagTintTextView = j7.f;
        tagTintTextView.setContentDescription(smallCoverV2Item.coverRightTextContentDesc);
        String str = ((BasicIndexItem) smallCoverV2Item).title;
        TintTextView tintTextView = j7.m;
        tintTextView.setContentDescription(str);
        ListExtentionsKt.setTextWithIcon$default(vectorTextView2, smallCoverV2Item.coverLeftText1, smallCoverV2Item.coverLeftIcon1, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(vectorTextView3, smallCoverV2Item.coverLeftText2, smallCoverV2Item.coverLeftIcon2, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        x.s(tagTintTextView, smallCoverV2Item.coverRightText, smallCoverV2Item.coverRightBackgroundColor, smallCoverV2Item.coverRightIcon, R$color.Wh0_u);
        ViewStub viewStub = iVar.f77461c;
        View view = iVar.itemView;
        StoryCardIcon storyCardIcon = smallCoverV2Item.storyCardIcon;
        if (storyCardIcon == null) {
            viewStub.setVisibility(8);
        } else {
            viewStub.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            layoutParams.width = ListExtentionsKt.toPx(storyCardIcon.iconWidth);
            layoutParams.height = ListExtentionsKt.toPx(storyCardIcon.iconHeight);
            viewStub.setLayoutParams(layoutParams);
            AutoTintBiliImageView autoTintBiliImageViewFindViewById = view.findViewById(2131312414);
            if (autoTintBiliImageViewFindViewById != null) {
                autoTintBiliImageViewFindViewById.setIconUrl(storyCardIcon.iconUrl);
                autoTintBiliImageViewFindViewById.setNightUrl(storyCardIcon.iconNightUrl);
                autoTintBiliImageViewFindViewById.setUrlGetter(x.f78893a);
                autoTintBiliImageViewFindViewById.startLoad();
            }
        }
        int i8 = smallCoverV2Item.coverBlur;
        ListPlaceHolderImageView listPlaceHolderImageView = j7.l;
        ListPlaceHolderImageView listPlaceHolderImageView2 = j7.c;
        if (i8 == 1) {
            x.e(listPlaceHolderImageView2, ((BasicIndexItem) smallCoverV2Item).cover);
            x.i(listPlaceHolderImageView, ((BasicIndexItem) smallCoverV2Item).cover);
            listPlaceHolderImageView.setVisibility(0);
        } else {
            listPlaceHolderImageView.setVisibility(8);
            x.h(listPlaceHolderImageView2, ((BasicIndexItem) smallCoverV2Item).cover, smallCoverV2Item.coverGif, "pegasus-android-v2", k.f77467a, k.f77468b, iVar.f77460b, new j(iVar), 128);
        }
        tintTextView.setText(((BasicIndexItem) smallCoverV2Item).title);
        Tag tag = smallCoverV2Item.badgeStyle;
        TagView tagView = j7.b;
        boolean zK = x.k(tagView, tag, null, null, 30);
        Tag tag2 = smallCoverV2Item.rcmdReason;
        String str2 = smallCoverV2Item.desc;
        com.bilibili.campus.hometab.rcmdtop.k kVar = new com.bilibili.campus.hometab.rcmdtop.k(1, smallCoverV2Item, iVar);
        TagTintTextView tagTintTextView2 = j7.g;
        boolean zL = x.l(tagTintTextView2, tag2, str2, kVar, false, 1016);
        tagTintTextView2.setPadding(tagTintTextView2.getPaddingLeft(), tagTintTextView2.getPaddingTop(), tagTintTextView2.getPaddingRight(), (!zK || zL) ? 0 : 1);
        x.b(tagView, zK, zL);
        j7.j.setVisibility(8);
        Avatar avatar = smallCoverV2Item.avatar;
        String str3 = avatar != null ? avatar.cover : null;
        BiliImageView biliImageView = j7.h;
        if (str3 == null || StringsKt.isBlank(str3)) {
            biliImageView.setVisibility(8);
        } else {
            biliImageView.setVisibility(0);
            Avatar avatar2 = smallCoverV2Item.avatar;
            x.d(biliImageView, avatar2 != null ? avatar2.cover : null, avatar2 != null ? Integer.valueOf(avatar2.type) : null, ListExtentionsKt.toPx(4.0f), 0, 0, 24);
        }
        String str4 = ((BasicIndexItem) smallCoverV2Item).subtitle;
        TintTextView tintTextView2 = j7.i;
        if (str4 == null || str4.length() == 0) {
            tintTextView.setMaxLines(2);
            tintTextView2.setVisibility(8);
        } else {
            tintTextView.setMaxLines(1);
            tintTextView2.setVisibility(0);
            tintTextView2.setText(((BasicIndexItem) smallCoverV2Item).subtitle);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new i(J.inflate(LayoutInflater.from(viewGroup.getContext())));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        i iVar = (i) viewHolder;
        super.onViewRecycled(iVar);
        iVar.f77462d = null;
        iVar.f77463e = null;
    }
}
