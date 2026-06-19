package com.bilibili.ogv.misc.follow;

import Ua.a0;
import Xv.g;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.ogv.misc.follow.BangumiWantMangerBottomSheet;
import com.bilibili.ogv.misc.follow.api.entity.ItemData;
import com.bilibili.video.story.action.widget.Z;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pk0.C8330y;
import qk0.s;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiWantMangerBottomSheet.class */
@StabilityInferred(parameters = 0)
public final class BangumiWantMangerBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextView f69061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f69062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f69063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CheckBox f69064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f69065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69066g;

    @Nullable
    public ArrayList<ItemData> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f69067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f69068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f69069k = new CompositeDisposable();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiWantMangerBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<ItemData> f69070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public e f69071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BangumiWantMangerBottomSheet f69072c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet, List<? extends ItemData> list) {
            this.f69072c = bangumiWantMangerBottomSheet;
            this.f69070a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<ItemData> list = this.f69070a;
            return list != null ? list.size() : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            s sVar = (s) viewHolder;
            List<ItemData> list = this.f69070a;
            sVar.s0(list != null ? list.get(i7) : null);
            sVar.f126147g = this.f69071b;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.bilibili.ogv.misc.follow.BangumiWantMangerBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            int i8 = s.f126141s;
            ?? r02 = this.f69072c;
            return new s(p.a(viewGroup, 2131493169, viewGroup, false), r02.f69066g, r02.getChildFragmentManager());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiWantMangerBottomSheet$b.class */
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetBehavior<View> f69073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiWantMangerBottomSheet f69074b;

        public b(BottomSheetBehavior<View> bottomSheetBehavior, BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet) {
            this.f69073a = bottomSheetBehavior;
            this.f69074b = bangumiWantMangerBottomSheet;
        }

        public final void onSlide(View view, float f7) {
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 4) {
                this.f69073a.setState(5);
            } else {
                if (i7 != 5) {
                    return;
                }
                this.f69074b.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiWantMangerBottomSheet$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiWantMangerBottomSheet f69075a;

        public c(BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet) {
            this.f69075a = bangumiWantMangerBottomSheet;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.bilibili.ogv.misc.follow.BangumiWantMangerBottomSheet, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
        public final void accept(Object obj) {
            ?? r02 = this.f69075a;
            ToastHelper.showToastShort(r02.getContext(), 2131821910);
            r02.dismissAllowingStateLoss();
            Lazy lazy = C8330y.f125459a;
            C8330y.f125460b.onNext(Integer.valueOf(r02.f69066g));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiWantMangerBottomSheet$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiWantMangerBottomSheet f69076a;

        public d(BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet) {
            this.f69076a = bangumiWantMangerBottomSheet;
        }

        public final void accept(Object obj) {
            ToastHelper.showToastShort(this.f69076a.getContext(), 2131832113);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiWantMangerBottomSheet$e.class */
    public static final class e implements s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiWantMangerBottomSheet f69077a;

        public e(BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet) {
            this.f69077a = bangumiWantMangerBottomSheet;
        }

        @Override // qk0.s.a
        public final void a() {
            BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet = this.f69077a;
            ArrayList<ItemData> arrayList = bangumiWantMangerBottomSheet.h;
            if (arrayList != null) {
                Iterator<ItemData> it = arrayList.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    if (it.next().f69140o) {
                        i7++;
                    }
                }
                if (i7 == arrayList.size()) {
                    CheckBox checkBox = bangumiWantMangerBottomSheet.f69064e;
                    if (checkBox != null) {
                        checkBox.setChecked(true);
                        return;
                    }
                    return;
                }
            }
            bangumiWantMangerBottomSheet.f69068j = true;
            CheckBox checkBox2 = bangumiWantMangerBottomSheet.f69064e;
            if (checkBox2 != null) {
                checkBox2.setChecked(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f69066g = arguments != null ? arguments.getInt("type") : 0;
        Bundle arguments2 = getArguments();
        ArrayList<ItemData> parcelableArrayList = arguments2 != null ? arguments2.getParcelableArrayList("list") : null;
        this.h = parcelableArrayList;
        if (parcelableArrayList != null) {
            Iterator<ItemData> it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                it.next().f69140o = true;
            }
        }
        this.f69067i = new a(this, this.h);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493137, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        this.f69069k.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        Window window;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Context contextRequireContext = requireContext();
        int i7 = contextRequireContext.getResources().getDisplayMetrics().heightPixels;
        int iB = Uj0.c.b(60.0f, contextRequireContext);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
        }
        Dialog dialog2 = getDialog();
        BottomSheetBehavior bottomSheetBehaviorFrom = null;
        View viewFindViewById = dialog2 != null ? dialog2.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLayoutParams().height = i7 - iB;
        }
        if (viewFindViewById != null) {
            bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
        }
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setPeekHeight(0);
        }
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setState(3);
        }
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setBottomSheetCallback(new b(bottomSheetBehaviorFrom, this));
        }
        View view = getView();
        if (view != null) {
            view.post(new g(view, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        this.f69061b = (TextView) view.findViewById(2131310619);
        this.f69062c = (TextView) view.findViewById(2131309705);
        this.f69063d = (RecyclerView) view.findViewById(2131310742);
        this.f69064e = (CheckBox) view.findViewById(2131298553);
        this.f69065f = (TextView) view.findViewById(2131314134);
        CheckBox checkBox = this.f69064e;
        if (checkBox != null) {
            checkBox.setAlpha(Cj0.a.a(requireContext()) ? 0.7f : 1.0f);
        }
        TextView textView = this.f69062c;
        if (textView != null) {
            textView.setOnClickListener(new Z(this, 1));
        }
        TextView textView2 = this.f69061b;
        if (textView2 != null) {
            Context context = getContext();
            if (context != null) {
                ArrayList<ItemData> arrayList = this.h;
                string = context.getString(2131821900, String.valueOf(arrayList != null ? Integer.valueOf(arrayList.size()) : null));
            } else {
                string = null;
            }
            textView2.setText(string);
        }
        CheckBox checkBox2 = this.f69064e;
        if (checkBox2 != null) {
            checkBox2.setChecked(true);
        }
        TextView textView3 = this.f69065f;
        if (textView3 != null) {
            Context context2 = getContext();
            String string2 = null;
            if (context2 != null) {
                string2 = context2.getString(2131821913);
            }
            textView3.setText(string2);
        }
        TextView textView4 = this.f69065f;
        if (textView4 != null) {
            textView4.setOnClickListener(new a0(this, 2));
        }
        CheckBox checkBox3 = this.f69064e;
        if (checkBox3 != null) {
            checkBox3.setOnTouchListener(new View.OnTouchListener(this) { // from class: pk0.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiWantMangerBottomSheet f125452a;

                {
                    this.f125452a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    this.f125452a.f69068j = false;
                    return false;
                }
            });
        }
        CheckBox checkBox4 = this.f69064e;
        if (checkBox4 != null) {
            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: pk0.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiWantMangerBottomSheet f125453a;

                {
                    this.f125453a = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    BangumiWantMangerBottomSheet.a aVar;
                    BangumiWantMangerBottomSheet bangumiWantMangerBottomSheet = this.f125453a;
                    if (z6) {
                        BangumiWantMangerBottomSheet.a aVar2 = bangumiWantMangerBottomSheet.f69067i;
                        if (aVar2 != null) {
                            List<ItemData> list = aVar2.f69070a;
                            if (list != null) {
                                Iterator<ItemData> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next().f69140o = true;
                                }
                            }
                            aVar2.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    if (!bangumiWantMangerBottomSheet.f69068j && (aVar = bangumiWantMangerBottomSheet.f69067i) != null) {
                        List<ItemData> list2 = aVar.f69070a;
                        if (list2 != null) {
                            Iterator<ItemData> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                it2.next().f69140o = false;
                            }
                        }
                        aVar.notifyDataSetChanged();
                    }
                    bangumiWantMangerBottomSheet.f69068j = false;
                }
            });
        }
        a aVar = this.f69067i;
        if (aVar != null) {
            aVar.f69071b = new e(this);
        }
        RecyclerView recyclerView = this.f69063d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f69063d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f69067i);
        }
        a aVar2 = this.f69067i;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }
}
