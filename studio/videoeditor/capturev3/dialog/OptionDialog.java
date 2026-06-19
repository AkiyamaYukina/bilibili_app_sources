package com.bilibili.studio.videoeditor.capturev3.dialog;

import Bm.e;
import Cm.d;
import HG0.O0;
import TB0.C2882n;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.bililive.room.ui.chronosguidecard.view.j;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/OptionDialog.class */
public final class OptionDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KProperty<Object>[] f109140e = {new PropertyReference1Impl(OptionDialog.class, "binding", "getBinding()Lcom/bilibili/studio/videoeditor/databinding/BiliAppDialogOptionBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f109141b = d.a(this, (Function1) new Object(), UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f109142c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public O0 f109143d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/OptionDialog$a.class */
    public interface a {
        void a(int i7, @NotNull String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/OptionDialog$b.class */
    public static final class b extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public a f109145b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<String> f109144a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f109146c = -1;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/OptionDialog$b$a.class */
        public static final class a extends RecyclerView.ViewHolder implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final a f109147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Lazy f109148b;

            public a(@NotNull View view, @Nullable a aVar) {
                super(view);
                this.f109147a = aVar;
                Lazy lazy = LazyKt.lazy(new j(view, 3));
                this.f109148b = lazy;
                ((TextView) lazy.getValue()).setOnClickListener(this);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(@Nullable View view) {
                a aVar;
                Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
                if (numValueOf == null || numValueOf.intValue() != 2131313994 || (aVar = this.f109147a) == null) {
                    return;
                }
                aVar.a(getAbsoluteAdapterPosition(), "");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f109144a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            a aVar = (a) viewHolder;
            ((TextView) aVar.f109148b.getValue()).setText((CharSequence) ((ArrayList) this.f109144a).get(i7));
            ((TextView) aVar.f109148b.getValue()).setSelected(this.f109146c == i7);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new a(p.a(viewGroup, 2131494350, viewGroup, false), this.f109145b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/OptionDialog$c.class */
    public static final class c implements Function1<OptionDialog, C2882n> {
        public final Object invoke(Object obj) {
            return C2882n.bind(((Fragment) obj).requireView());
        }
    }

    public final void hf(@NotNull String[] strArr) {
        b bVar = this.f109142c;
        List list = ArraysKt.toList(strArr);
        ((ArrayList) bVar.f109144a).clear();
        List<String> list2 = bVar.f109144a;
        ((ArrayList) list2).addAll(list);
        bVar.notifyItemRangeChanged(0, list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        setStyle(2, 2131886814);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
        }
        return layoutInflater.inflate(2131493930, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Drawable drawable;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        C2882n c2882n = (C2882n) this.f109141b.getValue(this, f109140e[0]);
        c2882n.f23880b.setLayoutManager(new LinearLayoutManager(getContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), 1);
        Context context = getContext();
        if (context != null && (drawable = ContextCompat.getDrawable(context, 2131233587)) != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        RecyclerView recyclerView = c2882n.f23880b;
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(this.f109142c);
        c2882n.f23881c.setOnClickListener(new Zj.b(this, 2));
    }
}
