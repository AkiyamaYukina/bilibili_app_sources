package com.bilibili.search2.eastereggs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.search2.api.SearchResultAll;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/EggDialogFragment.class */
@StabilityInferred(parameters = 0)
public abstract class EggDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f86492b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SearchResultAll.EasterEgg f86493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.eastereggs.a f86494d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/EggDialogFragment$a.class */
    public interface a {
        void onCloseClick();

        void onDismiss();
    }

    @LayoutRes
    public abstract int hf();

    @NotNull
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final SearchResultAll.EasterEgg m8670if() {
        SearchResultAll.EasterEgg easterEgg = this.f86493c;
        if (easterEgg != null) {
            return easterEgg;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEggItem");
        return null;
    }

    public abstract void initViews(@NotNull View view);

    public abstract void jf(@NotNull SearchResultAll.EasterEgg easterEgg);

    public final void kf() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("query", m8670if().getQuery());
        linkedHashMap.put("trackid", m8670if().getTrackId());
        linkedHashMap.put("moduleid", String.valueOf(m8670if().getId()));
        linkedHashMap.put("abtestid", m8670if().getAbtestId());
        Neurons.reportClick(false, "search.search-result.search-egg.all.click", linkedHashMap);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131886811);
        Bundle arguments = getArguments();
        SearchResultAll.EasterEgg easterEgg = null;
        SearchResultAll.EasterEgg easterEgg2 = arguments != null ? (SearchResultAll.EasterEgg) arguments.getParcelable("egg_obj") : null;
        if (easterEgg2 != null) {
            easterEgg = easterEgg2;
        }
        if (easterEgg == null) {
            return;
        }
        this.f86493c = easterEgg;
    }

    @Override // androidx.fragment.app.DialogFragment
    @CallSuper
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        setCancelable(false);
        StatusBarCompat.immersiveStatusBar(dialogOnCreateDialog.getWindow());
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(hf(), viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.search2.eastereggs.EggDialogFragment$a, com.bilibili.search2.eastereggs.a] */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ?? r02 = this.f86494d;
        if (r02 != 0) {
            r02.onDismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initViews(view);
        jf(m8670if());
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.bilibili.search2.eastereggs.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EggDialogFragment f86518a;

                {
                    this.f86518a = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                @Override // android.content.DialogInterface.OnKeyListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean onKey(android.content.DialogInterface r4, int r5, android.view.KeyEvent r6) {
                    /*
                        r3 = this;
                        r0 = r3
                        com.bilibili.search2.eastereggs.EggDialogFragment r0 = r0.f86518a
                        r4 = r0
                        r0 = r5
                        r1 = 4
                        if (r0 != r1) goto L1e
                        r0 = r6
                        int r0 = r0.getAction()
                        r5 = r0
                        r0 = 1
                        r7 = r0
                        r0 = r5
                        r1 = 1
                        if (r0 != r1) goto L1e
                        r0 = r4
                        r0.dismiss()
                        goto L21
                    L1e:
                        r0 = 0
                        r7 = r0
                    L21:
                        r0 = r7
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.eastereggs.i.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
                }
            });
        }
    }
}
