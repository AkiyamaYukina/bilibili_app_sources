package com.bilibili.pegasus.components.interest;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import aq0.U0;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kp0.C7781d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/InterestChoseDialogG.class */
@StabilityInferred(parameters = 0)
public final class InterestChoseDialogG extends BaseInterestChooseDialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final KProperty<Object>[] f76271n = {new PropertyReference1Impl(InterestChoseDialogG.class, "mBinding", "getMBinding()Lcom/bilibili/pegasusBiz/databinding/LayoutPegasusInterestChoseDialogGBinding;", 0)};

    @Nullable
    public n h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f76272i = ReflectionFragmentViewBindings.viewBindingFragment(this, U0.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f76273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f76274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f76275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f76276m;

    public final InterestChooseAge jf() {
        Object tag;
        String string;
        View view = this.f76275l;
        Integer intOrNull = (view == null || (tag = view.getTag(2131312910)) == null || (string = tag.toString()) == null) ? null : StringsKt.toIntOrNull(string);
        InterestChooseAge interestChooseAge = null;
        if (intOrNull != null) {
            int iIntValue = intOrNull.intValue();
            InterestChoose interestChoose = this.f76374d;
            interestChooseAge = null;
            if (interestChoose != null) {
                List<InterestChooseAge> listC = interestChoose.c();
                interestChooseAge = null;
                if (listC != null) {
                    interestChooseAge = (InterestChooseAge) CollectionsKt.getOrNull(listC, iIntValue);
                }
            }
        }
        return interestChooseAge;
    }

    public final InterestChooseGender kf() {
        Object tag;
        String string;
        View view = this.f76273j;
        Integer intOrNull = (view == null || (tag = view.getTag(2131312911)) == null || (string = tag.toString()) == null) ? null : StringsKt.toIntOrNull(string);
        InterestChooseGender interestChooseGender = null;
        if (intOrNull != null) {
            int iIntValue = intOrNull.intValue();
            InterestChoose interestChoose = this.f76374d;
            interestChooseGender = null;
            if (interestChoose != null) {
                List<InterestChooseGender> listQ = interestChoose.q();
                interestChooseGender = null;
                if (listQ != null) {
                    interestChooseGender = (InterestChooseGender) CollectionsKt.getOrNull(listQ, iIntValue);
                }
            }
        }
        return interestChooseGender;
    }

    public final U0 lf() {
        return (U0) this.f76272i.getValue(this, f76271n[0]);
    }

    public final void mf() {
        n nVar = this.h;
        List<InterestChooseItem> list = nVar != null ? nVar.f76334d : null;
        if (!(list == null || list.isEmpty()) && this.f76274k && this.f76276m) {
            lf().f53882d.setSelected(true);
            TintTextView tintTextView = lf().f53882d;
            InterestChoose interestChoose = this.f76374d;
            String strH = null;
            if (interestChoose != null) {
                strH = interestChoose.h();
            }
            tintTextView.setText(strH);
            return;
        }
        lf().f53882d.setSelected(false);
        TintTextView tintTextView2 = lf().f53882d;
        InterestChoose interestChoose2 = this.f76374d;
        String strI = null;
        if (interestChoose2 != null) {
            strI = interestChoose2.i();
        }
        tintTextView2.setText(strI);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        return lf().f53879a;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        String strP;
        super.onDismiss(dialogInterface);
        m mVar = this.f76372b;
        if (mVar != null) {
            boolean z6 = this.f76376f;
            InterestChoose interestChoose = this.f76374d;
            long jO = interestChoose != null ? interestChoose.O() : 0L;
            n nVar = this.h;
            List<InterestChooseItem> list = nVar != null ? nVar.f76334d : null;
            if (nVar != null) {
                List<InterestChooseItem> list2 = nVar.f76333c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((InterestChooseItem) it.next()).getId()));
                }
                strP = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
            } else {
                strP = null;
            }
            mVar.a(z6, new kp0.f(jO, list, strP, kf(), jf(), null, false, 96));
        }
        if (this.f76375e) {
            InterestChoose interestChoose2 = this.f76374d;
            int iD = interestChoose2 != null ? interestChoose2.D() : 0;
            InterestChoose interestChoose3 = this.f76374d;
            long jO2 = 0;
            if (interestChoose3 != null) {
                jO2 = interestChoose3.O();
            }
            e.f(this.f76373c, jO2, iD, false, 16);
        }
        m8033if();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        final InterestChoose interestChoose = this.f76374d;
        if (interestChoose == null) {
            dismissAllowingStateLoss();
            return;
        }
        this.f76374d = interestChoose;
        lf().f53882d.setText(interestChoose.i());
        String strD = interestChoose.d();
        if (strD == null || StringsKt.isBlank(strD)) {
            ListExtentionsKt.gone(lf().f53888k);
        } else {
            ListExtentionsKt.visible(lf().f53888k);
            lf().f53888k.setText(interestChoose.d());
            lf().f53888k.setOnClickListener(new View.OnClickListener(this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChoseDialogG f76335a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final InterestChoose f76336b;

                {
                    this.f76335a = this;
                    this.f76336b = interestChoose;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterestChoseDialogG interestChoseDialogG = this.f76335a;
                    InterestChoose interestChoose2 = this.f76336b;
                    KProperty<Object>[] kPropertyArr = InterestChoseDialogG.f76271n;
                    interestChoseDialogG.f76375e = false;
                    interestChoseDialogG.dismissAllowingStateLoss();
                    e.f(null, interestChoose2.O(), interestChoose2.D(), true, 24);
                }
            });
            e.m(interestChoose.D(), interestChoose.O());
        }
        lf().f53887j.setText(interestChoose.getTitle());
        lf().f53886i.setText(interestChoose.F());
        lf().f53884f.setText(interestChoose.o());
        List<InterestChooseGender> listQ = interestChoose.q();
        if (listQ != null) {
            LinearLayout linearLayout = lf().f53883e;
            final k kVar = new k(this, interestChoose);
            int i7 = 0;
            for (Object obj : listQ) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                InterestChooseGender interestChooseGender = (InterestChooseGender) obj;
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(2131498153, (ViewGroup) linearLayout, false);
                viewInflate.setTag(2131312911, Integer.valueOf(i7));
                ImageExtentionKt.displayImage$default(viewInflate.findViewById(2131302148), interestChooseGender.c(), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
                ((TextView) viewInflate.findViewById(2131302149)).setText(interestChooseGender.getTitle());
                final int i8 = i7;
                viewInflate.setOnClickListener(new View.OnClickListener(kVar, i8) { // from class: com.bilibili.pegasus.components.interest.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final k f76349a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f76350b;

                    {
                        this.f76349a = kVar;
                        this.f76350b = i8;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0195 A[LOOP:0: B:56:0x018b->B:58:0x0195, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onClick(android.view.View r10) {
                        /*
                            Method dump skipped, instruction units count: 469
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.o.onClick(android.view.View):void");
                    }
                });
                linearLayout.addView(viewInflate);
                i7++;
            }
        }
        List<InterestChooseGender> listQ2 = interestChoose.q();
        if (listQ2 != null) {
            Iterator<T> it = listQ2.iterator();
            int i9 = 0;
            while (true) {
                int i10 = i9;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                InterestChooseGender interestChooseGender2 = (InterestChooseGender) next;
                e.j(interestChoose.D(), interestChoose.O(), interestChooseGender2.getId(), interestChoose.o(), i11, interestChooseGender2.getTitle(), null, false, 192);
                i9 = i11;
            }
        }
        if (C7781d.f(interestChoose)) {
            lf().f53881c.setText(interestChoose.b());
            List<InterestChooseAge> listC = interestChoose.c();
            if (listC != null) {
                LinearLayout linearLayout2 = lf().f53880b;
                final com.bilibili.app.authorspace.ui.nft.ui.adapter.j jVar = new com.bilibili.app.authorspace.ui.nft.ui.adapter.j(this, interestChoose);
                if (!listC.isEmpty()) {
                    int i12 = (listC.size() & 1) == 1 ? 3 : 2;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    int i13 = 0;
                    for (Object obj2 : listC) {
                        if (i13 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        InterestChooseAge interestChooseAge = (InterestChooseAge) obj2;
                        int i14 = i13 % i12;
                        if (i14 == 0) {
                            LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
                            linearLayout3.setWeightSum(i12);
                            objectRef.element = linearLayout3;
                        }
                        LinearLayout linearLayout4 = (LinearLayout) objectRef.element;
                        if (linearLayout4 != null) {
                            View viewInflate2 = LayoutInflater.from(linearLayout2.getContext()).inflate(2131500149, (ViewGroup) linearLayout2, false);
                            viewInflate2.setTag(2131312910, Integer.valueOf(i13));
                            ((TextView) viewInflate2.findViewById(2131296692)).setText(interestChooseAge.getTitle());
                            final int i15 = i13;
                            viewInflate2.setOnClickListener(new View.OnClickListener(jVar, i15) { // from class: com.bilibili.pegasus.components.interest.a

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final com.bilibili.app.authorspace.ui.nft.ui.adapter.j f76324a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final int f76325b;

                                {
                                    this.f76324a = jVar;
                                    this.f76325b = i15;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    ImageView imageView;
                                    ImageView imageView2;
                                    List<InterestChooseAge> listC2;
                                    com.bilibili.app.authorspace.ui.nft.ui.adapter.j jVar2 = this.f76324a;
                                    int i16 = this.f76325b;
                                    InterestChoseDialogG interestChoseDialogG = (InterestChoseDialogG) jVar2.a;
                                    interestChoseDialogG.f76276m = true;
                                    if (!Intrinsics.areEqual(view2, interestChoseDialogG.f76275l)) {
                                        InterestChoose interestChoose2 = interestChoseDialogG.f76374d;
                                        String title = null;
                                        InterestChooseAge interestChooseAge2 = (interestChoose2 == null || (listC2 = interestChoose2.c()) == null) ? null : (InterestChooseAge) CollectionsKt.getOrNull(listC2, i16);
                                        InterestChoose interestChoose3 = (InterestChoose) jVar2.b;
                                        int iD = interestChoose3.D();
                                        long jO = interestChoose3.O();
                                        long id = interestChooseAge2 != null ? interestChooseAge2.getId() : 0L;
                                        InterestChoose interestChoose4 = interestChoseDialogG.f76374d;
                                        String strB = interestChoose4 != null ? interestChoose4.b() : null;
                                        if (interestChooseAge2 != null) {
                                            title = interestChooseAge2.getTitle();
                                        }
                                        e.h(iD, i16 + 1, jO, id, strB, title, com.bilibili.pegasus.request.b.g() ? "1" : "2");
                                        if (view2 != null && (imageView2 = (ImageView) view2.findViewById(2131298242)) != null) {
                                            imageView2.setVisibility(ListExtentionsKt.toVisibility(true));
                                            imageView2.setSelected(true);
                                        }
                                        if (view2 != null) {
                                            view2.setSelected(true);
                                        }
                                        View view3 = interestChoseDialogG.f76275l;
                                        if (view3 != null && (imageView = (ImageView) view3.findViewById(2131298242)) != null) {
                                            imageView.setVisibility(ListExtentionsKt.toVisibility(false));
                                            imageView.setSelected(false);
                                        }
                                        if (view3 != null) {
                                            view3.setSelected(false);
                                        }
                                        interestChoseDialogG.f76275l = view2;
                                    }
                                    interestChoseDialogG.mf();
                                }
                            });
                            linearLayout4.addView(viewInflate2);
                        }
                        if (i14 == i12 - 1) {
                            linearLayout2.addView((View) objectRef.element, new LinearLayout.LayoutParams(-1, -2));
                        }
                        i13++;
                    }
                    int size = listC.size() % i12;
                    if (i12 == 3 && size != 0) {
                        for (int i16 = 0; i16 < i12 - size; i16++) {
                            LinearLayout linearLayout5 = (LinearLayout) objectRef.element;
                            if (linearLayout5 != null) {
                                View viewInflate3 = LayoutInflater.from(linearLayout2.getContext()).inflate(2131500149, (ViewGroup) linearLayout2, false);
                                viewInflate3.setVisibility(4);
                                linearLayout5.addView(viewInflate3);
                            }
                        }
                        linearLayout2.addView((View) objectRef.element, new LinearLayout.LayoutParams(-1, -2));
                    }
                }
            }
            List<InterestChooseAge> listC2 = interestChoose.c();
            if (listC2 != null) {
                Iterator<T> it2 = listC2.iterator();
                int i17 = 0;
                while (true) {
                    int i18 = i17;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    InterestChooseAge interestChooseAge2 = (InterestChooseAge) next2;
                    e.j(interestChoose.D(), interestChoose.O(), interestChooseAge2.getId(), interestChoose.b(), i19, interestChooseAge2.getTitle(), null, false, 192);
                    i17 = i19;
                }
            }
        } else {
            ListExtentionsKt.gone(lf().f53881c);
            ListExtentionsKt.gone(lf().f53880b);
            this.f76276m = true;
        }
        lf().f53885g.setText(interestChoose.s());
        lf().h.setLayoutManager(new GridLayoutManager(getContext(), 2, 1, false));
        final n nVar = new n(interestChoose, new i(this));
        lf().h.setAdapter(nVar);
        lf().f53882d.setOnClickListener(new View.OnClickListener(this, interestChoose, nVar) { // from class: com.bilibili.pegasus.components.interest.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChoseDialogG f76338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChoose f76339b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final n f76340c;

            {
                this.f76338a = this;
                this.f76339b = interestChoose;
                this.f76340c = nVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterestChoseDialogG interestChoseDialogG = this.f76338a;
                InterestChoose interestChoose2 = this.f76339b;
                n nVar2 = this.f76340c;
                if (!interestChoseDialogG.f76274k) {
                    ToastHelper.showToastShort(view2.getContext(), 2131845104);
                    return;
                }
                if (!interestChoseDialogG.f76276m) {
                    ToastHelper.showToastShort(view2.getContext(), 2131845174);
                    return;
                }
                n nVar3 = interestChoseDialogG.h;
                List<InterestChooseItem> list = nVar3 != null ? nVar3.f76334d : null;
                if (list == null || list.isEmpty()) {
                    ToastHelper.showToastShort(view2.getContext(), 2131845118);
                    return;
                }
                interestChoseDialogG.f76375e = false;
                interestChoseDialogG.f76376f = true;
                interestChoseDialogG.dismissAllowingStateLoss();
                int iD = interestChoose2.D();
                long jO = interestChoose2.O();
                List<InterestChooseItem> list2 = nVar2.f76334d;
                String strO = interestChoose2.o();
                InterestChooseGender interestChooseGenderKf = interestChoseDialogG.kf();
                Pair pair = TuplesKt.to(strO, interestChooseGenderKf != null ? interestChooseGenderKf.getTitle() : null);
                String strB = interestChoose2.b();
                InterestChooseAge interestChooseAgeJf = interestChoseDialogG.jf();
                String title = null;
                if (interestChooseAgeJf != null) {
                    title = interestChooseAgeJf.getTitle();
                }
                JSONObject jSONObject = new JSONObject((Map<String, Object>) MapsKt.mapOf(new Pair[]{pair, TuplesKt.to(strB, title)}));
                List<InterestChooseItem> list3 = nVar2.f76334d;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Integer.valueOf(((InterestChooseItem) it3.next()).getListPosition() + 1));
                }
                e.c(iD, jO, list2, jSONObject, CollectionsKt.p(arrayList, ",", "[", "]", (Function1) null, 56), null, null, null, 0, null, null, null, null, null, null, null, 524256);
            }
        });
        this.h = nVar;
        int iPx2dip = ScreenUtil.px2dip(view.getContext(), ScreenUtil.getScreenHeight(r0));
        if (iPx2dip != 0) {
            int px = iPx2dip <= 667 ? ListExtentionsKt.toPx(10.0f) : ListExtentionsKt.toPx(25.0f);
            int px2 = iPx2dip <= 667 ? ListExtentionsKt.toPx(30.0f) : ListExtentionsKt.toPx(60.0f);
            TintTextView tintTextView = lf().f53887j;
            ViewGroup.LayoutParams layoutParams = lf().f53887j.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, px, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
            } else {
                marginLayoutParams2 = null;
            }
            tintTextView.setLayoutParams(marginLayoutParams2);
            TintTextView tintTextView2 = lf().f53882d;
            ViewGroup.LayoutParams layoutParams2 = lf().f53882d.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, px2);
                marginLayoutParams = marginLayoutParams3;
            }
            tintTextView2.setLayoutParams(marginLayoutParams);
        }
        int iD = interestChoose.D();
        long jO = interestChoose.O();
        String strB = interestChoose.B();
        String str = strB;
        if (strB == null) {
            str = "";
        }
        e.g(iD, jO, str);
    }
}
