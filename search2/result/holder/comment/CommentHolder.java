package com.bilibili.search2.result.holder.comment;

import Bl.W;
import Xs0.b;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bplus.followinglist.page.opus.onlyfans.a;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.lib.avatar.layers.LayerAvatarView;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.holder.comment.CommentHolder;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.extension.c;
import dt0.AbstractC6843f;
import ft0.j;
import ft0.k;
import ht0.e;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.SearchTagLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comment/CommentHolder.class */
@StabilityInferred(parameters = 0)
public final class CommentHolder extends AbstractC6843f<k> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Companion f88123d = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final W f88124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View[] f88126c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comment/CommentHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final CommentHolder create(@NotNull ViewGroup viewGroup) {
            return new CommentHolder(W.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), true);
        }
    }

    @JvmOverloads
    public CommentHolder(@NotNull W w7, boolean z6) {
        super(w7.a);
        this.f88124a = w7;
        this.f88125b = z6;
        this.f88126c = new View[]{w7.c, w7.i, w7.j, w7.g, w7.h, w7.e};
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final CommentHolder create(@NotNull ViewGroup viewGroup) {
        return f88123d.create(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        String uri = ((k) getData()).getUri();
        Uri uri2 = uri != null ? Uri.parse(uri) : null;
        boolean z6 = this.f88125b;
        String str = z6 ? "read.column-search.0.0" : "search.search-result.0.0";
        Uri uriBuild = uri2;
        if (uri2 != null) {
            if (TextUtils.isEmpty("from_spmid")) {
                uriBuild = uri2;
            } else {
                try {
                    uriBuild = uri2.buildUpon().appendQueryParameter("from_spmid", str).build();
                } catch (Exception e7) {
                    uriBuild = uri2;
                }
            }
        }
        final Uri uri3 = uriBuild;
        this.itemView.setOnClickListener(new View.OnClickListener(uri3, this) { // from class: ft0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f119364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CommentHolder f119365b;

            {
                this.f119364a = uri3;
                this.f119365b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comment.CommentHolder, dt0.f] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri uri4 = this.f119364a;
                ?? r02 = this.f119365b;
                if (uri4 != null) {
                    CommentHolder.Companion companion = CommentHolder.f88123d;
                    Os0.e.g(Os0.e.f18030a, r02.itemView.getContext(), uri4.toString());
                }
                String str2 = r02.f88125b ? "read.column-search.search-card.all.click" : "search.search-result.search-card.all.click";
                String linkType = ((k) r02.getData()).getLinkType();
                String str3 = linkType;
                if (linkType == null) {
                    str3 = "comment";
                }
                Xs0.b.i(str2, null, str3, (BaseSearchItem) r02.getData(), null, null, r02.f88125b ? android.support.v4.media.a.a("read.column-search.", ((k) r02.getData()).getLinkType(), ".0") : Xs0.b.d((BaseSearchItem) r02.getData(), "0", null, 2), null, null, null, false, null, 8112);
                r02.clickWithRefreshStatusViews(r02.f88126c);
            }
        });
        W w7 = this.f88124a;
        final int i7 = 0;
        w7.b.setOnClickListener(new View.OnClickListener(this, i7) { // from class: ft0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f119366a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f119367b;

            {
                this.f119366a = i7;
                this.f119367b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f119366a) {
                    case 0:
                        ExposeItem exposeItem = (CommentHolder) this.f119367b;
                        CommentHolder.Companion companion = CommentHolder.f88123d;
                        B.r(exposeItem.itemView.getContext(), ((k) exposeItem.getData()).z());
                        break;
                    default:
                        SearchTagLayout.SearchTagView searchTagView = (SearchTagLayout.SearchTagView) this.f119367b;
                        if (searchTagView.d != null) {
                            searchTagView.setState(0);
                            Object tag = searchTagView.getTag(1593835520);
                            searchTagView.d.onTagClick(searchTagView, tag instanceof Integer ? ((Integer) tag).intValue() : -1, searchTagView.e);
                        }
                        break;
                }
            }
        });
        TintTextView tintTextView = w7.i;
        tintTextView.setOnClickListener(new a(3, this));
        final Uri uri4 = uriBuild;
        w7.d.setOnClickListener(new View.OnClickListener(uri4, this) { // from class: ft0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f119368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CommentHolder f119369b;

            {
                this.f119368a = uri4;
                this.f119369b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comment.CommentHolder, dt0.f] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri uri5 = this.f119368a;
                ?? r02 = this.f119369b;
                if (uri5 != null) {
                    CommentHolder.Companion companion = CommentHolder.f88123d;
                    Os0.e.g(Os0.e.f18030a, r02.itemView.getContext(), uri5.toString());
                }
                String str2 = r02.f88125b ? "read.column-search.search-card.all.click" : "search.search-result.search-card.all.click";
                String linkType = ((k) r02.getData()).getLinkType();
                String str3 = linkType;
                if (linkType == null) {
                    str3 = "comment";
                }
                Xs0.b.i(str2, null, str3, (BaseSearchItem) r02.getData(), null, null, r02.f88125b ? android.support.v4.media.a.a("read.column-search.", ((k) r02.getData()).getLinkType(), ".extra_link") : Xs0.b.d((BaseSearchItem) r02.getData(), "extra_link", null, 2), null, null, null, false, null, 8112);
                r02.clickWithRefreshStatusViews(r02.f88126c);
            }
        });
        o10.a avatarInfo = ((k) getData()).getAvatarInfo();
        if (avatarInfo != null) {
            LayerAvatarView.show$default(w7.b, avatarInfo, (Map) null, 2, (Object) null);
        }
        tintTextView.setText(((k) getData()).getName());
        w7.h.setText(((k) getData()).w());
        String strS = ((k) getData()).s();
        if (strS != null) {
            int iU = ((k) getData()).u();
            TintTextView tintTextView2 = w7.c;
            if (iU > 0) {
                tintTextView2.setMaxLines(((k) getData()).u());
            }
            CharSequence charSequenceA = com.bilibili.search2.result.column.a.a(this.itemView.getContext(), strS);
            CharSequence charSequence = charSequenceA;
            if (charSequenceA == null) {
                charSequence = "";
            }
            CharSequence charSequence2 = charSequence;
            if (!z6) {
                String badge = ((k) getData()).getBadge();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                charSequence2 = spannableStringBuilder;
                if (badge != null) {
                    if (StringsKt.isBlank(badge)) {
                        charSequence2 = spannableStringBuilder;
                    } else {
                        int colorById = ThemeUtils.getColorById(this.itemView.getContext(), 2131103591);
                        int colorById2 = ThemeUtils.getColorById(this.itemView.getContext(), 2131103284);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(badge.concat(" "));
                        spannableStringBuilder2.append(charSequence);
                        spannableStringBuilder2.setSpan(new e(colorById, ListExtentionsKt.toPx(10), ListExtentionsKt.toPx(2), ListExtentionsKt.toPx(2), ListExtentionsKt.toPx(0.5d), colorById2, ListExtentionsKt.toPx(2), ListExtentionsKt.toPx(0.5d)), 0, badge.length(), 17);
                        charSequence2 = spannableStringBuilder2;
                    }
                }
            }
            tintTextView2.setText(charSequence2);
            OneShotPreDrawListener.add(tintTextView2, new j(tintTextView2, charSequence2, ((k) getData()).u()));
        }
        c.a(w7.e, GarbManager.getCurGarb().isNight() ? ((k) getData()).getIconNight() : ((k) getData()).getIcon(), null, false, null, null, 0, 0, 254);
        w7.f.setText(NumberFormat_androidKt.format$default(Long.valueOf(((k) getData()).v()), (String) null, 0, 3, (Object) null));
        String from = ((k) getData()).getFrom();
        if (from != null) {
            w7.j.setText(com.bilibili.search2.result.column.a.a(this.itemView.getContext(), from));
        }
        w7.g.setText(((k) getData()).getPrefix());
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View[] getClickStatusViewArray() {
        return this.f88126c;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((k) getData()).isExposed()) {
            k kVar = (k) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            kVar.setAtFirstScreen(z6);
        }
        String str = this.f88125b ? "read.column-search.search-card.all.show" : "search.search-result.search-card.all.show";
        String linkType = ((k) getData()).getLinkType();
        String str2 = linkType;
        if (linkType == null) {
            str2 = "comment";
        }
        b.k(str, str2, (BaseSearchItem) getData(), null, null, false, null, null, null, 1016);
    }
}
