package com.bilibili.ogv.misc.follow;

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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.ogv.misc.follow.BangumiGroupMangerBottomSheet;
import com.bilibili.ogv.misc.follow.api.entity.ItemData;
import com.bilibili.pegasus.channelv3.feed.holder.j;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pk0.C8330y;
import qk0.s;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiGroupMangerBottomSheet.class */
@StabilityInferred(parameters = 0)
public final class BangumiGroupMangerBottomSheet extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextView f69030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f69031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f69032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CheckBox f69033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f69034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69035g;

    @Nullable
    public ArrayList<ItemData> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f69036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f69037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f69038k = new CompositeDisposable();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiGroupMangerBottomSheet$a.class */
    public final class a extends RecyclerView.Adapter<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<ItemData> f69039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public e f69040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BangumiGroupMangerBottomSheet f69041c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet, List<? extends ItemData> list) {
            this.f69041c = bangumiGroupMangerBottomSheet;
            this.f69039a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<ItemData> list = this.f69039a;
            return list != null ? list.size() : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            s sVar = (s) viewHolder;
            List<ItemData> list = this.f69039a;
            sVar.s0(list != null ? list.get(i7) : null);
            sVar.f126147g = this.f69040b;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.bilibili.ogv.misc.follow.BangumiGroupMangerBottomSheet] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            int i8 = s.f126141s;
            ?? r02 = this.f69041c;
            return new s(p.a(viewGroup, 2131493169, viewGroup, false), r02.f69035g, r02.getChildFragmentManager());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiGroupMangerBottomSheet$b.class */
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetBehavior<View> f69042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiGroupMangerBottomSheet f69043b;

        public b(BottomSheetBehavior<View> bottomSheetBehavior, BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet) {
            this.f69042a = bottomSheetBehavior;
            this.f69043b = bangumiGroupMangerBottomSheet;
        }

        public final void onSlide(View view, float f7) {
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 4) {
                this.f69042a.setState(5);
            } else {
                if (i7 != 5) {
                    return;
                }
                this.f69043b.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiGroupMangerBottomSheet$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiGroupMangerBottomSheet f69044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<String> f69045b;

        public c(BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet, ArrayList<String> arrayList) {
            this.f69044a = bangumiGroupMangerBottomSheet;
            this.f69045b = arrayList;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.bilibili.ogv.misc.follow.BangumiGroupMangerBottomSheet, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
        public final void accept(Object obj) {
            ?? r02 = this.f69044a;
            Context context = r02.getContext();
            ToastHelper.showToastShort(r02.getContext(), context != null ? context.getString(2131821923, String.valueOf(this.f69045b.size())) : null);
            r02.dismissAllowingStateLoss();
            Lazy lazy = C8330y.f125459a;
            C8330y.f125460b.onNext(Integer.valueOf(r02.f69035g));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiGroupMangerBottomSheet$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiGroupMangerBottomSheet f69046a;

        public d(BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet) {
            this.f69046a = bangumiGroupMangerBottomSheet;
        }

        public final void accept(Object obj) {
            ToastHelper.showToastShort(this.f69046a.getContext(), 2131832113);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiGroupMangerBottomSheet$e.class */
    public static final class e implements s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiGroupMangerBottomSheet f69047a;

        public e(BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet) {
            this.f69047a = bangumiGroupMangerBottomSheet;
        }

        @Override // qk0.s.a
        public final void a() {
            BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet = this.f69047a;
            ArrayList<ItemData> arrayList = bangumiGroupMangerBottomSheet.h;
            if (arrayList != null) {
                Iterator<ItemData> it = arrayList.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    if (it.next().f69140o) {
                        i7++;
                    }
                }
                if (i7 == arrayList.size()) {
                    CheckBox checkBox = bangumiGroupMangerBottomSheet.f69033e;
                    if (checkBox != null) {
                        checkBox.setChecked(true);
                        return;
                    }
                    return;
                }
            }
            bangumiGroupMangerBottomSheet.f69037j = true;
            CheckBox checkBox2 = bangumiGroupMangerBottomSheet.f69033e;
            if (checkBox2 != null) {
                checkBox2.setChecked(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f69035g = arguments != null ? arguments.getInt("type") : 0;
        Bundle arguments2 = getArguments();
        ArrayList<ItemData> parcelableArrayList = arguments2 != null ? arguments2.getParcelableArrayList("list") : null;
        this.h = parcelableArrayList;
        if (parcelableArrayList != null) {
            Iterator<ItemData> it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                it.next().f69140o = true;
            }
        }
        this.f69036i = new a(this, this.h);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493137, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        this.f69038k.clear();
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
        final View view = getView();
        if (view != null) {
            view.post(new Runnable(view) { // from class: pk0.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f125445a;

                {
                    this.f125445a = view;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ((View) this.f125445a.getParent()).setBackgroundColor(0);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String string;
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        this.f69030b = (TextView) view.findViewById(2131310619);
        this.f69031c = (TextView) view.findViewById(2131309705);
        this.f69032d = (RecyclerView) view.findViewById(2131310742);
        this.f69033e = (CheckBox) view.findViewById(2131298553);
        this.f69034f = (TextView) view.findViewById(2131314134);
        CheckBox checkBox = this.f69033e;
        if (checkBox != null) {
            checkBox.setAlpha(Cj0.a.a(requireContext()) ? 0.7f : 1.0f);
        }
        TextView textView = this.f69031c;
        if (textView != null) {
            textView.setOnClickListener(new ZR.d(this, 5));
        }
        TextView textView2 = this.f69030b;
        if (textView2 != null) {
            Context context = getContext();
            if (context != null) {
                ArrayList<ItemData> arrayList = this.h;
                string = context.getString(2131821889, String.valueOf(arrayList != null ? Integer.valueOf(arrayList.size()) : null));
            } else {
                string = null;
            }
            textView2.setText(string);
        }
        CheckBox checkBox2 = this.f69033e;
        if (checkBox2 != null) {
            checkBox2.setChecked(true);
        }
        TextView textView3 = this.f69034f;
        if (textView3 != null) {
            Context context2 = getContext();
            String string2 = null;
            if (context2 != null) {
                string2 = context2.getString(2131821894);
            }
            textView3.setText(string2);
        }
        TextView textView4 = this.f69034f;
        if (textView4 != null) {
            textView4.setOnClickListener(new j(1, this));
        }
        CheckBox checkBox3 = this.f69033e;
        if (checkBox3 != null) {
            checkBox3.setOnTouchListener(new View.OnTouchListener(this) { // from class: pk0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiGroupMangerBottomSheet f125446a;

                {
                    this.f125446a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    this.f125446a.f69037j = false;
                    return false;
                }
            });
        }
        CheckBox checkBox4 = this.f69033e;
        if (checkBox4 != null) {
            checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: pk0.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiGroupMangerBottomSheet f125447a;

                {
                    this.f125447a = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                    BangumiGroupMangerBottomSheet.a aVar;
                    BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet = this.f125447a;
                    if (z6) {
                        BangumiGroupMangerBottomSheet.a aVar2 = bangumiGroupMangerBottomSheet.f69036i;
                        if (aVar2 != null) {
                            List<ItemData> list = aVar2.f69039a;
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
                    if (!bangumiGroupMangerBottomSheet.f69037j && (aVar = bangumiGroupMangerBottomSheet.f69036i) != null) {
                        List<ItemData> list2 = aVar.f69039a;
                        if (list2 != null) {
                            Iterator<ItemData> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                it2.next().f69140o = false;
                            }
                        }
                        aVar.notifyDataSetChanged();
                    }
                    bangumiGroupMangerBottomSheet.f69037j = false;
                }
            });
        }
        a aVar = this.f69036i;
        if (aVar != null) {
            aVar.f69040b = new e(this);
        }
        RecyclerView recyclerView = this.f69032d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f69032d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f69036i);
        }
        a aVar2 = this.f69036i;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            Class superclass = BangumiGroupMangerBottomSheet.class.getSuperclass();
            Field declaredField = null;
            Field declaredField2 = superclass != null ? superclass.getDeclaredField("mDismissed") : null;
            Class superclass2 = BangumiGroupMangerBottomSheet.class.getSuperclass();
            if (superclass2 != null) {
                declaredField = superclass2.getDeclaredField("mShownByMe");
            }
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            if (declaredField2 != null) {
                declaredField2.setBoolean(this, false);
            }
            if (declaredField != null) {
                declaredField.setBoolean(this, true);
            }
        } catch (IllegalAccessException e7) {
            e7.printStackTrace();
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        if (fragmentTransactionBeginTransaction != null) {
            fragmentTransactionBeginTransaction.add((Fragment) this, str);
        }
        if (fragmentTransactionBeginTransaction != null) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }
}
