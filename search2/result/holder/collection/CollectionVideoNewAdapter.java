package com.bilibili.search2.result.holder.collection;

import Bl.T;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.AvItem;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.AbstractC6048b;
import com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6839b;
import dt0.AbstractC6843f;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.k;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/CollectionVideoNewAdapter.class */
@StabilityInferred(parameters = 0)
public final class CollectionVideoNewAdapter extends AbstractC6048b<AbstractC6843f<AvItem>, AvItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Os0.f f88053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public BaseSearchItem f88054c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/CollectionVideoNewAdapter$CollectionVideoHolderNew.class */
    public final class CollectionVideoHolderNew extends AbstractC6843f<AvItem> implements Os0.a {

        @NotNull
        private final T binding;
        final CollectionVideoNewAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CollectionVideoHolderNew(@NotNull final CollectionVideoNewAdapter collectionVideoNewAdapter, T t7) {
            super(t7.a);
            this.this$0 = collectionVideoNewAdapter;
            this.binding = t7;
            this.itemView.setOnClickListener(new View.OnClickListener(this, collectionVideoNewAdapter) { // from class: com.bilibili.search2.result.holder.collection.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CollectionVideoNewAdapter.CollectionVideoHolderNew f88077a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CollectionVideoNewAdapter f88078b;

                {
                    this.f88077a = this;
                    this.f88078b = collectionVideoNewAdapter;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CollectionVideoNewAdapter.CollectionVideoHolderNew._init_$lambda$0(this.f88077a, this.f88078b, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void _init_$lambda$0(com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter.CollectionVideoHolderNew r14, com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter r15, android.view.View r16) {
            /*
                r0 = r14
                java.lang.Object r0 = r0.getData()
                com.bilibili.search2.api.AvItem r0 = (com.bilibili.search2.api.AvItem) r0
                java.lang.String r0 = r0.getUri()
                r16 = r0
                r0 = r16
                if (r0 == 0) goto L76
                r0 = r16
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                r1 = 1
                r0 = r0 ^ r1
                r1 = 1
                if (r0 != r1) goto L76
                r0 = r14
                java.lang.Object r0 = r0.getData()
                com.bilibili.search2.api.AvItem r0 = (com.bilibili.search2.api.AvItem) r0
                java.lang.String r0 = r0.getUri()
                r16 = r0
                r0 = r16
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L30
            L2b:
                r0 = 0
                r16 = r0
                goto L5c
            L30:
                r0 = r16
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L52
                android.net.Uri$Builder r0 = r0.buildUpon()     // Catch: java.lang.Exception -> L52
                r16 = r0
                r0 = r16
                java.lang.String r1 = "from_spmid"
                java.lang.String r2 = "search.search-result.0.0"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)     // Catch: java.lang.Exception -> L52
                r0 = r16
                java.lang.String r1 = "jumpFrom"
                java.lang.String r2 = "3"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)     // Catch: java.lang.Exception -> L52
                r0 = r16
                android.net.Uri r0 = r0.build()     // Catch: java.lang.Exception -> L52
                r16 = r0
                goto L5c
            L52:
                r16 = move-exception
                java.lang.String r0 = "SearchSpmidConstants"
                r1 = r16
                tv.danmaku.android.log.BLog.e(r0, r1)
                goto L2b
            L5c:
                r0 = r16
                if (r0 == 0) goto L76
                r0 = r14
                android.view.View r0 = r0.itemView
                android.content.Context r0 = r0.getContext()
                r17 = r0
                Os0.e r0 = Os0.e.f18030a
                r1 = r17
                r2 = r16
                java.lang.String r2 = r2.toString()
                Os0.e.g(r0, r1, r2)
                goto L76
            L76:
                r0 = r14
                r0.clickWithRefreshStatus()
                r0 = r15
                com.bilibili.search2.api.BaseSearchItem r0 = r0.f88054c
                r15 = r0
                r0 = r15
                if (r0 == 0) goto Lc6
                r0 = r15
                java.lang.String r0 = r0.getLinkType()
                r18 = r0
                r0 = r14
                java.lang.Object r0 = r0.getData()
                com.bilibili.search2.api.AvItem r0 = (com.bilibili.search2.api.AvItem) r0
                java.lang.String r0 = r0.getParam()
                r17 = r0
                r0 = r14
                java.lang.Object r0 = r0.getData()
                com.bilibili.search2.api.AvItem r0 = (com.bilibili.search2.api.AvItem) r0
                java.lang.String r0 = r0.getGoTo()
                r16 = r0
                java.lang.String r0 = "search.search-result.search-card.all.click"
                r1 = 0
                r2 = r18
                r3 = r15
                r4 = r17
                r5 = r14
                java.lang.Object r5 = r5.getData()
                com.bilibili.search2.api.AvItem r5 = (com.bilibili.search2.api.AvItem) r5
                int r5 = r5.getServerPagePos()
                java.lang.String r5 = java.lang.String.valueOf(r5)
                r6 = r15
                java.lang.String r7 = "video-more"
                r8 = 0
                r9 = 2
                java.lang.String r6 = Xs0.b.d(r6, r7, r8, r9)
                r7 = 0
                r8 = r16
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 7808(0x1e80, float:1.0941E-41)
                Xs0.b.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            Lc6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter.CollectionVideoHolderNew._init_$lambda$0(com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter$CollectionVideoHolderNew, com.bilibili.search2.result.holder.collection.CollectionVideoNewAdapter, android.view.View):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Os0.a
        public void attach() {
            defpackage.a.a(getBindingAdapterPosition(), "attach: ", "SearchCollection");
            this.binding.e.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dt0.AbstractC6843f
        public void attachToWindow() {
            super.attachToWindow();
            defpackage.a.a(getBindingAdapterPosition(), "attachToWindow: ", "SearchCollection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dt0.AbstractC6839b
        public void bind() {
            T t7 = this.binding;
            com.bilibili.search2.utils.extension.c.a(t7.c, ((AvItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
            ListExtentionsKt.setTextWithIcon$default(t7.d, ((AvItem) getData()).getViewContent(), ((AvItem) getData()).getIconType(), R$color.Graph_white, 0.0f, 0.0f, 48, (Object) null);
            CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(this.itemView.getContext(), ((AvItem) getData()).getTitle(), 0, 4, (Object) null);
            TintFixedLineSpacingTextView tintFixedLineSpacingTextView = t7.e;
            tintFixedLineSpacingTextView.setText(charSequenceDecode$default);
            B.h(t7.b, ((AvItem) getData()).getCoverBadge());
            if (((AvItem) getData()).isInline()) {
                SpannableString spannableString = new SpannableString(" " + ((Object) charSequenceDecode$default));
                ConstraintLayout constraintLayout = t7.a;
                spannableString.setSpan(new k(constraintLayout.getContext(), ListExtentionsKt.toPx(12), ListExtentionsKt.toPx(4), ListExtentionsKt.toPx(1), tintFixedLineSpacingTextView, Integer.valueOf(constraintLayout.getContext().getResources().getColor(2131103284))), 0, 1, 17);
                tintFixedLineSpacingTextView.setText(spannableString);
                tintFixedLineSpacingTextView.setTextColor(constraintLayout.getResources().getColor(R$color.Brand_pink));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Os0.a
        public void detach() {
            defpackage.a.a(getBindingAdapterPosition(), "detach: ", "SearchCollection");
        }

        @Override // dt0.AbstractC6843f
        @Nullable
        public View getClickStatusView() {
            return !((AvItem) getData()).isInline() ? this.binding.e : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Os0.a
        public void invisible() {
            defpackage.a.a(getBindingAdapterPosition(), "invisible: ", "SearchCollection");
        }

        @Override // Os0.a
        public /* bridge */ /* synthetic */ void startScroll() {
        }

        @Override // Os0.a
        public /* bridge */ /* synthetic */ void stopScroll() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Os0.a
        public void visible() {
            defpackage.a.a(getBindingAdapterPosition(), "visible: ", "SearchCollection");
            this.binding.e.invalidate();
        }
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    public final AbstractC6839b P(int i7, ViewGroup viewGroup) {
        return new CollectionVideoHolderNew(this, T.inflate(LayoutInflater.from(viewGroup.getContext())));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Os0.f fVar = this.f88053b;
        if (fVar != null) {
            recyclerView.addOnScrollListener(fVar.f18035e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        Os0.f fVar = this.f88053b;
        if (fVar != null) {
            recyclerView.removeOnScrollListener(fVar.f18035e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Os0.f fVar;
        AbstractC6843f abstractC6843f = (AbstractC6843f) viewHolder;
        super.onViewAttachedToWindow(abstractC6843f);
        abstractC6843f.attachToWindow();
        if (!(abstractC6843f instanceof Os0.a) || (fVar = this.f88053b) == null) {
            return;
        }
        Os0.a aVar = (Os0.a) abstractC6843f;
        aVar.visible();
        aVar.attach();
        if (fVar.f18033c) {
            aVar.startScroll();
        }
        ((ArrayList) fVar.f18032b).add(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Os0.f fVar;
        ExposeItem exposeItem = (AbstractC6843f) viewHolder;
        super.onViewDetachedFromWindow(exposeItem);
        if (!(exposeItem instanceof Os0.a) || (fVar = this.f88053b) == null) {
            return;
        }
        Os0.a aVar = (Os0.a) exposeItem;
        aVar.invisible();
        aVar.detach();
        ((ArrayList) fVar.f18032b).remove(aVar);
    }
}
