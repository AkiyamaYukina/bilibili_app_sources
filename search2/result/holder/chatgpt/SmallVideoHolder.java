package com.bilibili.search2.result.holder.chatgpt;

import Bl.N0;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Barrier;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.TagsView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.commons.StringUtils;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.result.holder.chatgpt.api.SearchSmallVideoItem;
import java.util.List;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SmallVideoHolder.class */
@StabilityInferred(parameters = 0)
public final class SmallVideoHolder extends a<SearchSmallVideoItem> implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Companion f87962l = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final N0 f87963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SearchChatGptHolder f87964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f87965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TintTextView f87966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final VectorTextView f87967g;

    @Nullable
    public final VectorTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final VectorTextView f87968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TagTintTextView f87969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TagsView f87970k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SmallVideoHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final SmallVideoHolder create(@NotNull ViewGroup viewGroup, @NotNull SearchChatGptHolder searchChatGptHolder) {
            return new SmallVideoHolder(N0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), searchChatGptHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmallVideoHolder(@NotNull N0 n02, @NotNull SearchChatGptHolder searchChatGptHolder) {
        super(n02.a);
        this.f87963c = n02;
        this.f87964d = searchChatGptHolder;
        this.f87965e = n02.b;
        this.f87966f = n02.e;
        this.f87967g = n02.i;
        this.h = n02.f;
        this.f87968i = n02.d;
        this.f87969j = n02.g;
        this.f87970k = n02.c;
        n02.a.setOnClickListener(this);
        ((Barrier) this.itemView.findViewById(2131303632)).setReferencedIds(new int[]{2131308948, 2131299886});
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final SmallVideoHolder create(@NotNull ViewGroup viewGroup, @NotNull SearchChatGptHolder searchChatGptHolder) {
        return f87962l.create(viewGroup, searchChatGptHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        TagTintTextView tagTintTextView;
        com.bilibili.search2.utils.extension.c.a(this.f87965e, ((SearchSmallVideoItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        this.f87963c.h.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchSmallVideoItem) getData()).getTitle(), 0, 4, (Object) null));
        if (TextUtils.isEmpty(((SearchSmallVideoItem) getData()).getAuthor())) {
            this.f87967g.setVisibility(8);
        } else {
            this.f87967g.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchSmallVideoItem) getData()).getAuthor(), 0, 4, (Object) null));
            this.f87967g.setVisibility(0);
        }
        if (StringUtils.isEmpty(((SearchSmallVideoItem) getData()).getDuration())) {
            this.f87966f.setVisibility(8);
        } else {
            this.f87966f.setText(((SearchSmallVideoItem) getData()).getDuration());
            this.f87966f.setVisibility(0);
        }
        TagsView tagsView = this.f87970k;
        List<Tag> badges = ((SearchSmallVideoItem) getData()).getBadges();
        List<Tag> list = badges;
        if (list == null || list.isEmpty()) {
            tagsView.setVisibility(8);
        } else {
            TagsView.clearTagList$default(tagsView, false, 1, (Object) null);
            TagsView.TagBuilder tagBuilder = tagsView.tagBuilder();
            for (Tag tag : badges) {
                TagsView.TagBuilder.appendTag$default(tagBuilder.setTagText(tag.getText()).setTagTextColor(tag.getTextColor()).setTagNightTextColor(tag.getTextColorNight()).setTagBackgroundColor(tag.getBgColor()).setTagNightBackgroundColor(tag.getBgColorNight()).setTagBorderColor(tag.getBorderColor()).setTagNightBorderColor(tag.getBorderColorNight()).setTagBackgroundStyle(tag.getBgStyle()), false, false, false, 7, (Object) null);
            }
            tagBuilder.applyToView();
            tagsView.setVisibility(0);
        }
        SearchSmallVideoItem searchSmallVideoItem = (SearchSmallVideoItem) getData();
        if (this.f87969j != null && this.h != null && this.f87968i != null) {
            if (searchSmallVideoItem.getRecTags() == null || !(!r0.isEmpty())) {
                ListExtentionsKt.gone(this.f87969j);
            } else {
                List<Tag> recTags = searchSmallVideoItem.getRecTags();
                List<Tag> list2 = recTags;
                if (list2 != null && !list2.isEmpty()) {
                    TagTintTextView.TagBuilder tagBuilder2 = this.f87969j.tagBuilder();
                    if (recTags.get(0) != null) {
                        Tag tag2 = recTags.get(0);
                        if (!TextUtils.isEmpty(tag2.getText())) {
                            TagTintTextView.TagBuilder.appendTag$default(tagBuilder2.setTagText(tag2.getText()).setTagTextColor(tag2.getTextColor()).setTagNightTextColor(tag2.getTextColorNight()).setTagBackgroundColor(tag2.getBgColor()).setTagNightBackgroundColor(tag2.getBgColorNight()).setTagBorderColor(tag2.getBorderColor()).setTagNightBorderColor(tag2.getBorderColorNight()).setTagBackgroundStyle(tag2.getBgStyle()), false, false, 3, (Object) null);
                            tagBuilder2.applyToView();
                        }
                    } else {
                        tagBuilder2.applyToView();
                    }
                }
                ListExtentionsKt.visible(this.f87969j);
            }
            ListExtentionsKt.setTextWithIcon$default(this.h, ((SearchSmallVideoItem) getData()).getViewContent(), ((SearchSmallVideoItem) getData()).getIconType(), R$color.Graph_medium, 0.0f, 0.0f, 48, (Object) null);
            ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f87968i.getLayoutParams();
            if (StringUtils.isBlank(searchSmallVideoItem.getShowCardDesc2())) {
                ListExtentionsKt.gone(this.f87968i);
            } else {
                layoutParams.width = -2;
                this.f87968i.setText(searchSmallVideoItem.getShowCardDesc2());
                this.f87968i.setLeftCompoundDrawable(0, 0, 0, 0);
                marginLayoutParams.setMarginStart(ListExtentionsKt.toPx(4));
            }
            this.h.setLayoutParams(layoutParams);
        }
        TagTintTextView tagTintTextView2 = this.f87969j;
        if (tagTintTextView2 != null && tagTintTextView2.getVisibility() == 0) {
            this.f87970k.setVisibility(8);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f87967g.getLayoutParams();
        if (this.f87970k.getVisibility() == 0 || ((tagTintTextView = this.f87969j) != null && tagTintTextView.getVisibility() == 0)) {
            this.f87967g.setLeftCompoundDrawable(0, 0, 0, 0);
            marginLayoutParams2.leftMargin = ListExtentionsKt.toPx(6);
        } else {
            int px = ListExtentionsKt.toPx(16);
            this.f87967g.setLeftCompoundDrawable(2131236748, R$color.Ga5, px, px);
            marginLayoutParams2.leftMargin = 0;
        }
        this.f87967g.setLayoutParams(marginLayoutParams2);
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f87963c.h;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Uri uriBuild;
        String uri = TextUtils.isEmpty(null) ? ((SearchSmallVideoItem) getData()).getUri() : null;
        if (!TextUtils.isEmpty(uri)) {
            if (TextUtils.isEmpty(uri)) {
                uriBuild = null;
            } else {
                try {
                    Uri.Builder builderBuildUpon = Uri.parse(uri).buildUpon();
                    builderBuildUpon.appendQueryParameter("from_spmid", "search.search-result.0.0");
                    builderBuildUpon.appendQueryParameter("jumpFrom", "3");
                    uriBuild = builderBuildUpon.build();
                } catch (Exception e7) {
                    BLog.e("SearchSpmidConstants", e7);
                    uriBuild = null;
                }
            }
            if (uriBuild != null) {
                Os0.e.f(this.itemView.getContext(), uriBuild);
            }
        }
        this.f87964d.x0("video");
        clickWithRefreshStatus(this.f87963c.h);
    }
}
