package com.bilibili.lib.ui.mixin;

import Uf0.C2902a;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx_fragment_app_Fragment f64893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b> f64894b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64897e;

    /* JADX INFO: renamed from: com.bilibili.lib.ui.mixin.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/a$a.class */
    public interface InterfaceC0362a {
        void callFragmentHide(@NotNull Flag flag);

        void callFragmentShow(@NotNull Flag flag);

        @NotNull
        a getVisibleManager();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/a$b.class */
    public interface b {
        void a(boolean z6);
    }

    public a(@NotNull androidx_fragment_app_Fragment androidx_fragment_app_fragment, @NotNull Flag... flagArr) {
        this.f64893a = androidx_fragment_app_fragment;
        int iOrdinal = 0;
        for (Flag flag : flagArr) {
            Lazy lazy = C2902a.f24715a;
            iOrdinal |= 1 << flag.ordinal();
        }
        this.f64897e = iOrdinal;
    }

    public final void a(boolean z6, @NotNull Flag flag) {
        if (z6) {
            int i7 = this.f64897e;
            Lazy lazy = C2902a.f24715a;
            this.f64897e = i7 | (1 << flag.ordinal());
        } else {
            int i8 = this.f64897e;
            Lazy lazy2 = C2902a.f24715a;
            this.f64897e = i8 & ((1 << flag.ordinal()) ^ (-1));
        }
        int i9 = this.f64897e;
        Lazy lazy3 = C2902a.f24715a;
        int iIntValue = ((Number) lazy3.getValue()).intValue();
        int iIntValue2 = ((Number) lazy3.getValue()).intValue();
        androidx_fragment_app_Fragment androidx_fragment_app_fragment = this.f64893a;
        if ((i9 & iIntValue) != iIntValue2) {
            if (this.f64896d) {
                this.f64896d = false;
                Iterator it = ((ArrayList) this.f64894b).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a(false);
                }
                androidx_fragment_app_fragment.callFragmentHide(flag);
                this.f64895c = true;
                return;
            }
            return;
        }
        if (this.f64896d) {
            return;
        }
        this.f64896d = true;
        androidx_fragment_app_fragment.callFragmentShow(flag);
        boolean z7 = this.f64896d;
        Iterator it2 = ((ArrayList) this.f64894b).iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).a(z7);
        }
        this.f64895c = true;
    }
}
