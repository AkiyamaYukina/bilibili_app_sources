package com.bilibili.playset.note;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.bililive.room.ui.guide.cnyredpacket.j;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.playset.note.NoteListFragment;
import com.bilibili.playset.note.RspNoteList;
import com.bilibili.playset.note.d;
import com.bilibili.video.story.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import ns0.k;
import ns0.l;
import ns0.m;
import ns0.p;
import ns0.r;
import ns0.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/NoteListFragment.class */
@StabilityInferred(parameters = 0)
public final class NoteListFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f85127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RelativeLayout f85128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TintCheckBox f85129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f85130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f85131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public LinearLayout f85132g;

    @Nullable
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f85133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f85134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f85135k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f85138n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public e f85141q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f85136l = new a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final d f85137m = new d(new j(this, 3), new com.bilibili.app.imagepicker.d(this, 2), new Function3(this) { // from class: ns0.j

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListFragment f124375a;

        {
            this.f124375a = this;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            TintCheckBox tintCheckBox;
            TintCheckBox tintCheckBox2;
            ((Boolean) obj).booleanValue();
            int iIntValue = ((Integer) obj2).intValue();
            int iIntValue2 = ((Integer) obj3).intValue();
            NoteListFragment noteListFragment = this.f124375a;
            TextView textView = noteListFragment.f85131f;
            if (textView != null) {
                textView.setSelected(iIntValue != 0);
            }
            if (iIntValue == iIntValue2) {
                TintCheckBox tintCheckBox3 = noteListFragment.f85129d;
                if (tintCheckBox3 != null && !tintCheckBox3.isChecked() && (tintCheckBox2 = noteListFragment.f85129d) != null) {
                    tintCheckBox2.setChecked(true);
                }
            } else {
                TintCheckBox tintCheckBox4 = noteListFragment.f85129d;
                if (tintCheckBox4 != null && tintCheckBox4.isChecked() && (tintCheckBox = noteListFragment.f85129d) != null) {
                    tintCheckBox.setChecked(false);
                }
            }
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f85139o = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final k f85142r = new Observer(this) { // from class: ns0.k

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListFragment f124376a;

        {
            this.f124376a = this;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
        @Override // androidx.lifecycle.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onChanged(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 538
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ns0.k.onChanged(java.lang.Object):void");
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final l f85143s = new Observer(this) { // from class: ns0.l

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListFragment f124377a;

        {
            this.f124377a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Pair pair = (Pair) obj;
            int iIntValue = ((Number) pair.getFirst()).intValue();
            NoteListFragment noteListFragment = this.f124377a;
            boolean z6 = true;
            if (iIntValue == 0) {
                noteListFragment.f85138n = true;
                return;
            }
            if (iIntValue == 1) {
                noteListFragment.f85138n = false;
                noteListFragment.f85137m.O(4);
                return;
            }
            if (iIntValue != 2) {
                return;
            }
            noteListFragment.f85138n = false;
            List list = (List) pair.getSecond();
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                com.bilibili.playset.note.d dVar = noteListFragment.f85137m;
                ((ArrayList) dVar.f85152f).addAll(list2);
                dVar.notifyDataSetChanged();
            }
            if ((list != null ? list.size() : 0) < 20) {
                z6 = false;
            }
            noteListFragment.f85139o = z6;
            if (z6) {
                noteListFragment.f85137m.O(2);
            } else {
                noteListFragment.f85137m.O(3);
            }
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final m f85144t = new Observer(this) { // from class: ns0.m

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListFragment f124378a;

        {
            this.f124378a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            MutableLiveData mutableLiveData;
            int iIntValue = ((Integer) obj).intValue();
            NoteListFragment noteListFragment = this.f124378a;
            if (iIntValue == 0) {
                noteListFragment.f85134j = TintProgressDialog.show(noteListFragment.getContext(), null, noteListFragment.getResources().getString(2131842520), true, false);
                return;
            }
            if (iIntValue == 1) {
                TintProgressDialog tintProgressDialog = noteListFragment.f85134j;
                if (tintProgressDialog != null) {
                    tintProgressDialog.dismiss();
                }
                ToastHelper.showToastShort(noteListFragment.getContext(), 2131841692);
                return;
            }
            if (iIntValue != 2) {
                return;
            }
            TintProgressDialog tintProgressDialog2 = noteListFragment.f85134j;
            if (tintProgressDialog2 != null) {
                tintProgressDialog2.dismiss();
            }
            noteListFragment.lf();
            com.bilibili.playset.note.e eVar = noteListFragment.f85141q;
            if (eVar != null && (mutableLiveData = (MutableLiveData) eVar.f85169i.getValue()) != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_editing", noteListFragment.f85137m.f85153g);
                mutableLiveData.setValue(bundle);
            }
            noteListFragment.loadData();
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/NoteListFragment$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteListFragment f85145a;

        public a(NoteListFragment noteListFragment) {
            this.f85145a = noteListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            int childCount;
            if (i8 > 0 && (childCount = recyclerView.getChildCount()) > 0 && (recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount - 1)) instanceof d.a)) {
                NoteListFragment noteListFragment = this.f85145a;
                if (noteListFragment.f85138n) {
                    return;
                }
                d dVar = noteListFragment.f85137m;
                if (dVar.f85151e.f84073a == 4 || !noteListFragment.f85139o || dVar.f85153g) {
                    return;
                }
                noteListFragment.f85138n = true;
                noteListFragment.mf();
            }
        }
    }

    public final void kf() {
        this.mSwipeRefreshLayout.setEnabled(false);
        RelativeLayout relativeLayout = this.f85128c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        d dVar = this.f85137m;
        dVar.h.clear();
        dVar.f85153g = true;
        dVar.notifyDataSetChanged();
    }

    public final void lf() {
        this.mSwipeRefreshLayout.setEnabled(true);
        RecyclerView recyclerView = this.f85127b;
        if (recyclerView != null) {
            recyclerView.scrollBy(0, -CommonDialogUtilsKt.dp2px(45, this.mSwipeRefreshLayout.getContext()));
        }
        RelativeLayout relativeLayout = this.f85128c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        d dVar = this.f85137m;
        dVar.h.clear();
        dVar.f85153g = false;
        dVar.notifyDataSetChanged();
        TextView textView = this.f85131f;
        if (textView != null) {
            textView.setSelected(false);
        }
        TintCheckBox tintCheckBox = this.f85129d;
        if (tintCheckBox != null) {
            tintCheckBox.setChecked(false);
        }
    }

    public final void loadData() {
        this.f85140p = true;
        e eVar = this.f85141q;
        if (eVar != null) {
            eVar.f85163b = 1;
            ((MutableLiveData) eVar.f85164c.getValue()).setValue(TuplesKt.to(0, (Object) null));
            eVar.A(eVar.f85163b, new r(eVar));
        }
    }

    public final void mf() {
        e eVar = this.f85141q;
        if (eVar != null) {
            Lazy lazy = eVar.f85165d;
            Pair pair = (Pair) ((MutableLiveData) lazy.getValue()).getValue();
            if (pair == null || ((Number) pair.getFirst()).intValue() != 0) {
                ((MutableLiveData) lazy.getValue()).setValue(TuplesKt.to(0, (Object) null));
                eVar.k0(eVar.f85163b + 1, new s(eVar));
            }
        }
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499701, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        loadData();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f85140p) {
            return;
        }
        loadData();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull final View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final Ref.IntRef intRef = new Ref.IntRef();
        Bundle arguments = getArguments();
        if (arguments != null) {
            intRef.element = arguments.getInt("attr", 0);
            this.f85135k = arguments.getString("empty_hint", null);
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            int i7 = intRef.element;
            e eVar = (e) new ViewModelProvider(fragmentActivityP3, new p(i7)).get(String.valueOf(i7), e.class);
            ((MutableLiveData) eVar.f85164c.getValue()).observe(getViewLifecycleOwner(), this.f85142r);
            ((MutableLiveData) eVar.f85165d.getValue()).observe(getViewLifecycleOwner(), this.f85143s);
            ((MutableLiveData) eVar.f85166e.getValue()).observe(getViewLifecycleOwner(), this.f85144t);
            this.f85141q = eVar;
        }
        this.f85127b = (RecyclerView) view.findViewById(2131306595);
        this.f85128c = (RelativeLayout) view.findViewById(2131310379);
        this.f85129d = (TintCheckBox) view.findViewById(2131298745);
        this.f85130e = (TextView) view.findViewById(2131313689);
        this.f85131f = (TextView) view.findViewById(2131314418);
        this.f85132g = (LinearLayout) view.findViewById(2131305755);
        this.h = (ImageView) view.findViewById(2131304541);
        this.f85133i = (TextView) view.findViewById(2131310613);
        RecyclerView recyclerView = this.f85127b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f85127b;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.f85136l);
        }
        RecyclerView recyclerView3 = this.f85127b;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new com.bilibili.playset.playlist.helper.a(new com.bilibili.bililive.room.ui.guide.cnyredpacket.k(this, 2)));
        }
        RecyclerView recyclerView4 = this.f85127b;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.f85137m);
        }
        TintCheckBox tintCheckBox = this.f85129d;
        if (tintCheckBox != null) {
            tintCheckBox.setOnClickListener(new View.OnClickListener(this) { // from class: ns0.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoteListFragment f124379a;

                {
                    this.f124379a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoteListFragment noteListFragment = this.f124379a;
                    TintCheckBox tintCheckBox2 = noteListFragment.f85129d;
                    if (tintCheckBox2 != null) {
                        if (!tintCheckBox2.isChecked()) {
                            com.bilibili.playset.note.d dVar = noteListFragment.f85137m;
                            if (dVar.f85153g && dVar.h.size() != 0) {
                                dVar.h.clear();
                                dVar.notifyItemRangeChanged(0, dVar.getItemCount(), "payload_external_un_select_all");
                            }
                            TextView textView = noteListFragment.f85131f;
                            if (textView != null) {
                                textView.setSelected(false);
                                return;
                            }
                            return;
                        }
                        com.bilibili.playset.note.d dVar2 = noteListFragment.f85137m;
                        if (dVar2.f85153g && dVar2.h.size() != dVar2.getItemCount()) {
                            dVar2.h.clear();
                            dVar2.h.addAll(dVar2.f85152f);
                            dVar2.notifyItemRangeChanged(0, dVar2.getItemCount(), "payload_external_select_all");
                        }
                        TextView textView2 = noteListFragment.f85131f;
                        if (textView2 != null) {
                            textView2.setSelected(true);
                        }
                    }
                }
            });
        }
        TextView textView = this.f85130e;
        if (textView != null) {
            textView.setOnClickListener(new VL.e(this, 1));
        }
        TextView textView2 = this.f85131f;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener(this, view, intRef) { // from class: ns0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NoteListFragment f124380a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f124381b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Ref.IntRef f124382c;

                {
                    this.f124380a = this;
                    this.f124381b = view;
                    this.f124382c = intRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoteListFragment noteListFragment = this.f124380a;
                    View view3 = this.f124381b;
                    Ref.IntRef intRef2 = this.f124382c;
                    com.bilibili.playset.note.d dVar = noteListFragment.f85137m;
                    dVar.getClass();
                    if (new ArrayList(dVar.h).isEmpty()) {
                        return;
                    }
                    new AlertDialog.Builder(view3.getContext(), 2131887243).setTitle(2131842510).setNegativeButton(2131841494, new DialogInterface.OnClickListener(noteListFragment) { // from class: ns0.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final NoteListFragment f124374a;

                        {
                            this.f124374a = noteListFragment;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            MutableLiveData mutableLiveData;
                            MutableLiveData mutableLiveData2;
                            NoteListFragment noteListFragment2 = this.f124374a;
                            if (dialogInterface != null) {
                                dialogInterface.dismiss();
                            }
                            com.bilibili.playset.note.e eVar2 = noteListFragment2.f85141q;
                            if (eVar2 != null && (mutableLiveData2 = (MutableLiveData) eVar2.f85167f.getValue()) != null) {
                                Bundle bundleA = X.a("is_delete", false);
                                com.bilibili.playset.note.d dVar2 = noteListFragment2.f85137m;
                                dVar2.getClass();
                                bundleA.putParcelableArrayList("notes", new ArrayList<>(dVar2.h));
                                mutableLiveData2.setValue(bundleA);
                            }
                            noteListFragment2.lf();
                            com.bilibili.playset.note.e eVar3 = noteListFragment2.f85141q;
                            if (eVar3 == null || (mutableLiveData = (MutableLiveData) eVar3.f85169i.getValue()) == null) {
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("is_editing", false);
                            mutableLiveData.setValue(bundle2);
                        }
                    }).setPositiveButton(2131841356, new DialogInterface.OnClickListener(noteListFragment, intRef2) { // from class: ns0.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final NoteListFragment f124372a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Ref.IntRef f124373b;

                        {
                            this.f124372a = noteListFragment;
                            this.f124373b = intRef2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            MutableLiveData mutableLiveData;
                            NoteListFragment noteListFragment2 = this.f124372a;
                            Ref.IntRef intRef3 = this.f124373b;
                            if (dialogInterface != null) {
                                dialogInterface.dismiss();
                            }
                            com.bilibili.playset.note.d dVar2 = noteListFragment2.f85137m;
                            dVar2.getClass();
                            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(dVar2.h);
                            com.bilibili.playset.note.e eVar2 = noteListFragment2.f85141q;
                            if (eVar2 != null && (mutableLiveData = (MutableLiveData) eVar2.f85167f.getValue()) != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("is_delete", true);
                                bundle2.putParcelableArrayList("notes", arrayList);
                                mutableLiveData.setValue(bundle2);
                            }
                            com.bilibili.playset.note.e eVar3 = noteListFragment2.f85141q;
                            if (eVar3 != null) {
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                Iterator<? extends Parcelable> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    RspNoteList.NoteBean noteBean = (RspNoteList.NoteBean) it.next();
                                    arrayList2.add(Long.valueOf(intRef3.element == 0 ? noteBean.noteId : noteBean.cvid));
                                }
                                long[] longArray = CollectionsKt.toLongArray(arrayList2);
                                ((MutableLiveData) eVar3.f85166e.getValue()).setValue(0);
                                eVar3.s0(longArray, new q(eVar3));
                            }
                        }
                    }).show();
                }
            });
        }
    }
}
