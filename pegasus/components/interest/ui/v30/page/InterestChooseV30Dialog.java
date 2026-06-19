package com.bilibili.pegasus.components.interest.ui.v30.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4872l0;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.pegasus.components.interest.InterestChainErrorCode;
import com.bilibili.pegasus.components.interest.InterestChainProcess;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30Dialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV30Dialog extends BottomSheetDialogFragment implements com.bilibili.pegasus.components.interest.ui.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public m f76559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f76560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterestChoose f76561d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76564g;

    @Nullable
    public C4872l0 h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76562e = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f76565i = ListExtentionsKt.toPx(668);

    public static void hf(View view, boolean z6) {
        if (view instanceof ViewGroup) {
            if (!(view instanceof RecyclerView)) {
                Iterator<View> it = ViewGroupKt.iterator((ViewGroup) view);
                while (it.hasNext()) {
                    hf(it.next(), z6);
                }
                return;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setNestedScrollingEnabled(z6);
            BLog.d("InterestChooseV30Dialog", recyclerView.getId() + " isNestedScrollingEnabled = " + z6);
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void T8(@NotNull final InterestChoose interestChoose, @NotNull final Fragment fragment) {
        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("pegasus_interest_chose", new MainDialogManager.IDialogInterface(fragment, this, interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v30.page.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Fragment f76570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseV30Dialog f76571b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterestChoose f76572c;

            {
                this.f76570a = fragment;
                this.f76571b = this;
                this.f76572c = interestChoose;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30Dialog, java.lang.Object] */
            public final void onShow() {
                InterestChoose interestChoose2 = this.f76572c;
                Fragment fragment2 = this.f76570a;
                boolean zIsDestroyed = fragment2.getChildFragmentManager().isDestroyed();
                ?? r02 = this.f76571b;
                if (zIsDestroyed) {
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.PAGE_INVISIBLE, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.PAGE_INVISIBLE, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "page_destroy")), null, 8);
                    m mVar = r02.f76559b;
                    if (mVar != null) {
                        mVar.a(false, null);
                    }
                    MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
                    return;
                }
                try {
                    FragmentManager childFragmentManager = fragment2.getChildFragmentManager();
                    r02.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key_interest_choose_data", interestChoose2);
                    r02.setArguments(bundle);
                    r02.show(childFragmentManager, "SubCategoryInterestChooseDialog");
                } catch (Exception e7) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.EXCEPTION, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, "after_dialog")), null, 8);
                    com.bilibili.pegasus.components.interest.e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DIALOG_CRASH, null, null, com.bilibili.pegasus.components.interest.e.a(), 24);
                    BLog.i("InterestChooseV30Dialog", "show dialog failed", e7);
                    m mVar2 = r02.f76559b;
                    if (mVar2 != null) {
                        mVar2.a(false, null);
                    }
                    MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
                }
            }
        }, 95, false), fragment.getContext());
        if (MainDialogManager.isDialogShowing("biz_block_dialog")) {
            MainDialogManager.showNextDialog("biz_block_dialog", false, fragment.getContext());
        }
        MainDialogManager.removeDialog("biz_block_dialog");
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void c1(@Nullable String str) {
        this.f76560c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void kc(@Nullable InterestPageCloseReason interestPageCloseReason) {
        InterestChoose interestChoose;
        if (interestPageCloseReason != null && (interestChoose = this.f76561d) != null && interestChoose.D() >= 35) {
            com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), interestPageCloseReason, InterestPageType.INFO, interestChoose.B());
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.bilibili.pegasus.components.interest.ui.c
    public final void o9(@Nullable m mVar) {
        this.f76559b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30Dialog.onCreate(android.os.Bundle):void");
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TintFrameLayout tintFrameLayout;
        C4872l0 c4872l0Inflate = C4872l0.inflate(layoutInflater);
        this.h = c4872l0Inflate;
        TintFrameLayout tintFrameLayout2 = null;
        if (c4872l0Inflate != null && (tintFrameLayout = c4872l0Inflate.f54084a) != null) {
            tintFrameLayout.setBackgroundDrawable(null);
        }
        C4872l0 c4872l0 = this.h;
        if (c4872l0 != null) {
            tintFrameLayout2 = c4872l0.f54084a;
        }
        return tintFrameLayout2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        e.f76574a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        String str;
        InterestChooseGender interestChooseGender;
        InterestChooseAge interestChooseAge;
        String str2;
        String strP;
        List<InterestChooseItem> listU;
        List<InterestChooseItem> listU2;
        String strP2;
        Object next;
        Object next2;
        String str3;
        Object next3;
        Object next4;
        StateFlow<InterestChoose> stateFlow;
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
        InterestChoose interestChoose = (interestChooseV30PageViewModel == null || (stateFlow = interestChooseV30PageViewModel.f76581b) == null) ? null : (InterestChoose) stateFlow.getValue();
        if (interestChoose == null) {
            MainDialogManager.showNextDialog("pegasus_interest_chose", false, (Context) null);
            return;
        }
        m mVar = this.f76559b;
        if (mVar != null) {
            boolean z6 = this.f76563f;
            long jO = interestChoose.O();
            List<InterestChooseGender> listQ = interestChoose.q();
            if (listQ != null) {
                Iterator<T> it = listQ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next4 = it.next();
                        if (((InterestChooseGender) next4).f77411g) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                interestChooseGender = (InterestChooseGender) next4;
            } else {
                interestChooseGender = null;
            }
            List<InterestChooseAge> listC = interestChoose.c();
            if (listC != null) {
                Iterator<T> it2 = listC.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next3 = it2.next();
                        if (((InterestChooseAge) next3).f77403e) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                interestChooseAge = (InterestChooseAge) next3;
            } else {
                interestChooseAge = null;
            }
            InterestChooseV30PageViewModel interestChooseV30PageViewModel2 = e.f76574a;
            if (interestChooseV30PageViewModel2 != null) {
                InterestChoose interestChoose2 = (InterestChoose) interestChooseV30PageViewModel2.f76581b.getValue();
                if (interestChoose2 == null || (listU2 = interestChoose2.u()) == null) {
                    str = "pegasus_interest_chose";
                    strP2 = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<InterestChooseItem> list = listU2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((InterestChooseItem) obj).isSelected()) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    String str4 = "pegasus_interest_chose";
                    while (true) {
                        Iterator it4 = it3;
                        if (!it4.hasNext()) {
                            break;
                        }
                        InterestChooseItem interestChooseItem = (InterestChooseItem) it4.next();
                        List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                        if (subItems == null || subItems.isEmpty()) {
                            arrayList.add(String.valueOf(interestChooseItem.getId()));
                            it3 = it4;
                        } else {
                            List<InterestChooseSubItem> subItems2 = interestChooseItem.getSubItems();
                            if (subItems2 != null) {
                                List<InterestChooseSubItem> list2 = subItems2;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (((InterestChooseSubItem) obj2).f77422g) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                Iterator it5 = arrayList3.iterator();
                                while (true) {
                                    str3 = str4;
                                    it3 = it4;
                                    if (!it5.hasNext()) {
                                        break;
                                    } else {
                                        V0.f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it5.next()).i(), arrayList);
                                    }
                                }
                            } else {
                                it3 = it4;
                                str3 = str4;
                            }
                            str4 = str3;
                        }
                    }
                    List<InterestChooseGender> listQ2 = interestChoose2.q();
                    if (listQ2 != null) {
                        Iterator<T> it6 = listQ2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (((InterestChooseGender) next2).f77411g) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        InterestChooseGender interestChooseGender2 = (InterestChooseGender) next2;
                        if (interestChooseGender2 != null) {
                            arrayList.add(String.valueOf(interestChooseGender2.getId()));
                        }
                    }
                    List<InterestChooseAge> listC2 = interestChoose2.c();
                    if (listC2 != null) {
                        Iterator<T> it7 = listC2.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                next = it7.next();
                                if (((InterestChooseAge) next).f77403e) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        InterestChooseAge interestChooseAge2 = (InterestChooseAge) next;
                        if (interestChooseAge2 != null) {
                            arrayList.add(String.valueOf(interestChooseAge2.getId()));
                        }
                    }
                    str = str4;
                    strP2 = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                }
                str2 = strP2;
            } else {
                str = "pegasus_interest_chose";
                str2 = null;
            }
            InterestChooseV30PageViewModel interestChooseV30PageViewModel3 = e.f76574a;
            if (interestChooseV30PageViewModel3 != null) {
                InterestChoose interestChoose3 = (InterestChoose) interestChooseV30PageViewModel3.f76581b.getValue();
                if (interestChoose3 == null || (listU = interestChoose3.u()) == null) {
                    strP = "";
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it8 = listU.iterator();
                    while (it8.hasNext()) {
                        InterestChooseItem interestChooseItem2 = (InterestChooseItem) it8.next();
                        List<InterestChooseSubItem> subItems3 = interestChooseItem2.getSubItems();
                        if (subItems3 == null || subItems3.isEmpty()) {
                            arrayList4.add(String.valueOf(interestChooseItem2.getId()));
                        } else {
                            List<InterestChooseSubItem> subItems4 = interestChooseItem2.getSubItems();
                            InterestChoose interestChoose4 = interestChoose;
                            Iterator it9 = it8;
                            if (subItems4 != null) {
                                Iterator<T> it10 = subItems4.iterator();
                                while (true) {
                                    interestChoose4 = interestChoose;
                                    it9 = it8;
                                    if (!it10.hasNext()) {
                                        break;
                                    } else {
                                        V0.f.b(interestChooseItem2.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it10.next()).i(), arrayList4);
                                    }
                                }
                            }
                            interestChoose = interestChoose4;
                            it8 = it9;
                        }
                    }
                    strP = CollectionsKt.p(arrayList4, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                }
            } else {
                strP = null;
            }
            mVar.a(z6, new kp0.f(jO, null, strP, interestChooseGender, interestChooseAge, str2, false, 66));
        } else {
            str = "pegasus_interest_chose";
        }
        if (this.f76562e) {
            com.bilibili.pegasus.components.interest.e.f(this.f76560c, interestChoose.O(), interestChoose.D(), this.f76564g, 16);
        }
        MainDialogManager.showNextDialog(str, false, (Context) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Dialog dialog = getDialog();
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(2131299837) : null;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = this.f76565i;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (viewFindViewById = dialog2.findViewById(2131313772)) != null) {
            viewFindViewById.setOnClickListener(new NH.b(this, 4));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.bilibili.pegasus.components.interest.ui.v30.page.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChooseV30Dialog f76568a;

                {
                    this.f76568a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    StateFlow<Integer> stateFlow;
                    InterestChooseV30Dialog interestChooseV30Dialog = this.f76568a;
                    boolean z6 = false;
                    if (i7 == 4) {
                        z6 = false;
                        if (keyEvent.getAction() == 1) {
                            InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
                            if (interestChooseV30PageViewModel == null || (stateFlow = interestChooseV30PageViewModel.h) == null || ((Number) stateFlow.getValue()).intValue() != 1) {
                                interestChooseV30Dialog.kc(null);
                            } else {
                                InterestChooseV30PageViewModel interestChooseV30PageViewModel2 = e.f76574a;
                                if (interestChooseV30PageViewModel2 != null) {
                                    interestChooseV30PageViewModel2.f76586g.setValue(0);
                                }
                            }
                            z6 = true;
                        }
                    }
                    return z6;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30Dialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
