package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter;

import DJ.k;
import DK0.j;
import OC0.h;
import SC0.a;
import TB0.e0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.collection.LruCache;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.utils.i;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.b;
import com.bilibili.studio.editor.moudle.music.view.MarqueeTextView;
import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import com.bilibili.studio.videoeditor.widgets.EditCircleProgressBar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import mw0.C8045a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/adapter/b.class */
public final class b extends RecyclerView.Adapter<C1191b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Context f107041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public k f107042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public j f107043c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TransitionSelectItem f107045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TransitionSelectItem f107046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SC0.a f107047g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<TransitionSelectItem> f107044d = new ArrayList<>();

    @NotNull
    public final Map<TransitionSelectItem, a> h = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/adapter/b$a.class */
    public final class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TransitionSelectItem f107048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public FunctionReferenceImpl f107049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f107050c;

        public a(@NotNull b bVar, TransitionSelectItem transitionSelectItem) {
            this.f107050c = bVar;
            this.f107048a = transitionSelectItem;
        }

        public final void a(boolean z6) {
            b bVar = this.f107050c;
            TransitionSelectItem transitionSelectItem = bVar.f107046f;
            TransitionSelectItem transitionSelectItem2 = this.f107048a;
            if (Intrinsics.areEqual(transitionSelectItem2, transitionSelectItem)) {
                if (z6) {
                    k kVar = bVar.f107042b;
                    if (kVar != null) {
                        kVar.invoke(transitionSelectItem2);
                    }
                } else {
                    ToastHelper.showToastShort(bVar.f107041a, 2131842055);
                }
            }
            bVar.h.remove(transitionSelectItem2);
            this.f107049b = null;
        }

        @Override // SC0.a.b
        public final void onFail() {
            TransitionSelectItem transitionSelectItem = this.f107048a;
            transitionSelectItem.resState = -1;
            FunctionReferenceImpl functionReferenceImpl = this.f107049b;
            if (functionReferenceImpl != null) {
                functionReferenceImpl.invoke(transitionSelectItem, 0);
            }
            a(false);
        }

        @Override // SC0.a.b
        public final void onProgress(int i7) {
            FunctionReferenceImpl functionReferenceImpl = this.f107049b;
            if (functionReferenceImpl != null) {
                functionReferenceImpl.invoke(this.f107048a, Integer.valueOf(i7));
            }
        }

        @Override // SC0.a.b
        public final void onSuccess(@Nullable String str) {
            if (str != null && str.length() != 0) {
                String strM = h.m(str, ".videotransition");
                String strM2 = h.m(str, ".lic");
                if (strM != null && strM.length() != 0) {
                    TransitionSelectItem transitionSelectItem = this.f107048a;
                    transitionSelectItem.transitionFile = strM;
                    transitionSelectItem.transitionFileLic = strM2;
                    LruCache<String, Pair<String, String>> lruCache = C8045a.f123886a;
                    C8045a.d(transitionSelectItem.id, strM, transitionSelectItem.name);
                    String strF = WC0.a.f(transitionSelectItem.transitionFile, transitionSelectItem.transitionFileLic);
                    if (strF != null && strF.length() != 0) {
                        transitionSelectItem.uuid = strF;
                        transitionSelectItem.resState = 0;
                        FunctionReferenceImpl functionReferenceImpl = this.f107049b;
                        if (functionReferenceImpl != null) {
                            functionReferenceImpl.invoke(transitionSelectItem, 100);
                        }
                        a(true);
                        return;
                    }
                    i.a("installTransition Failed, ", transitionSelectItem.name, ", ", transitionSelectItem.transitionFile, "BiliEditorTransitionRepository");
                }
            }
            onFail();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/adapter/b$b.class */
    public static final class C1191b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final e0 f107051a;

        public C1191b(@NotNull e0 e0Var) {
            super(e0Var.f23767a);
            this.f107051a = e0Var;
            e0Var.f23773g.setProgressFormatter(null);
        }

        public final void p0(@NotNull TransitionSelectItem transitionSelectItem, int i7) {
            e0 e0Var = this.f107051a;
            e0Var.f23768b.setVisibility(transitionSelectItem.resState == -1 ? 0 : 8);
            EditCircleProgressBar editCircleProgressBar = e0Var.f23773g;
            int i8 = 8;
            if (transitionSelectItem.resState == 1) {
                i8 = 0;
            }
            editCircleProgressBar.setVisibility(i8);
            if (transitionSelectItem.resState == 1) {
                e0Var.f23773g.setProgress(i7);
            }
        }
    }

    public b(@Nullable Context context) {
        this.f107041a = context;
        this.f107047g = new SC0.a(this.f107041a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f107044d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        final C1191b c1191b = (C1191b) viewHolder;
        final TransitionSelectItem transitionSelectItem = this.f107044d.get(i7);
        MarqueeTextView marqueeTextView = c1191b.f107051a.h;
        String str = transitionSelectItem.name;
        if (str == null) {
            str = "";
        }
        marqueeTextView.setText(str);
        ImageRequestBuilder imageRequestBuilderEnableAutoPlayAnimation$default = ImageRequestBuilder.enableAutoPlayAnimation$default(ImageRequestBuilder.enableAnimate$default(BiliImageLoader.INSTANCE.with(c1191b.itemView.getContext()).url(transitionSelectItem.coverUrl), true, (Boolean) null, 2, (Object) null), true, false, 2, (Object) null);
        e0 e0Var = c1191b.f107051a;
        imageRequestBuilderEnableAutoPlayAnimation$default.into(e0Var.f23770d);
        e0Var.f23771e.setImageResource(transitionSelectItem.isNoneItem() ? 2131242758 : 2131242757);
        e0Var.f23772f.setImageResource(transitionSelectItem.isNoneItem() ? 2131242761 : 2131242760);
        e0Var.f23769c.setVisibility(transitionSelectItem.isNoneItem() ? 0 : 8);
        boolean zAreEqual = Intrinsics.areEqual(this.f107045e, transitionSelectItem);
        e0Var.f23772f.setSelected(zAreEqual);
        e0Var.h.setSelected(zAreEqual);
        ImageView imageView = e0Var.f23771e;
        int i8 = 8;
        if (zAreEqual) {
            i8 = 0;
        }
        imageView.setVisibility(i8);
        c1191b.p0(transitionSelectItem, 0);
        if (transitionSelectItem.resState == 1) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            Object obj = linkedHashMap.get(transitionSelectItem);
            Object aVar = obj;
            if (obj == null) {
                aVar = new a(this, transitionSelectItem);
                linkedHashMap.put(transitionSelectItem, aVar);
            }
            ((a) aVar).f107049b = new BiliEditorTransItemAdapter$onBindViewHolder$1(c1191b);
        }
        c1191b.itemView.setOnClickListener(new View.OnClickListener(this, transitionSelectItem, c1191b) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f107038a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TransitionSelectItem f107039b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b.C1191b f107040c;

            {
                this.f107038a = this;
                this.f107039b = transitionSelectItem;
                this.f107040c = c1191b;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i9;
                b bVar = this.f107038a;
                TransitionSelectItem transitionSelectItem2 = this.f107039b;
                b.C1191b c1191b2 = this.f107040c;
                bVar.f107046f = transitionSelectItem2;
                j jVar = bVar.f107043c;
                if (jVar != null) {
                    jVar.invoke(transitionSelectItem2);
                }
                if (transitionSelectItem2.isNoneItem() || (i9 = transitionSelectItem2.resState) == 0) {
                    k kVar = bVar.f107042b;
                    if (kVar != null) {
                        kVar.invoke(transitionSelectItem2);
                        return;
                    }
                    return;
                }
                if (i9 == -1) {
                    transitionSelectItem2.resState = 1;
                    c1191b2.p0(transitionSelectItem2, 0);
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) bVar.h;
                    Object obj2 = linkedHashMap2.get(transitionSelectItem2);
                    Object aVar2 = obj2;
                    if (obj2 == null) {
                        aVar2 = new b.a(bVar, transitionSelectItem2);
                        linkedHashMap2.put(transitionSelectItem2, aVar2);
                    }
                    b.a aVar3 = (b.a) aVar2;
                    bVar.f107047g.a(transitionSelectItem2, aVar3);
                    aVar3.f107049b = new BiliEditorTransItemAdapter$onBindViewHolder$2$1(c1191b2);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
        C1191b c1191b = (C1191b) viewHolder;
        if (!Intrinsics.areEqual(CollectionsKt.firstOrNull(list), 2233)) {
            super.onBindViewHolder(c1191b, i7, list);
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f107045e, this.f107044d.get(i7));
        e0 e0Var = c1191b.f107051a;
        e0Var.f23772f.setSelected(zAreEqual);
        e0Var.h.setSelected(zAreEqual);
        e0Var.f23771e.setVisibility(zAreEqual ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new C1191b(e0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        a aVar;
        TransitionSelectItem transitionSelectItem = this.f107044d.get(((C1191b) viewHolder).getAbsoluteAdapterPosition());
        if (transitionSelectItem.resState != 1 || (aVar = (a) ((LinkedHashMap) this.h).get(transitionSelectItem)) == null) {
            return;
        }
        aVar.f107049b = null;
    }
}
