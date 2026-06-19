package com.bilibili.search2.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.ui.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/z.class */
public final class z {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public static final x a(@NotNull Fragment fragment) {
        ?? r32;
        Fragment parentFragment = fragment.getParentFragment();
        while (true) {
            r32 = parentFragment;
            if (r32 == 0) {
                FragmentActivity fragmentActivityP3 = fragment.p3();
                FragmentActivity fragmentActivity = fragmentActivityP3;
                if (!(fragmentActivityP3 instanceof x)) {
                    fragmentActivity = null;
                }
                r32 = (x) fragmentActivity;
            } else {
                if (r32 instanceof x) {
                    break;
                }
                parentFragment = r32.getParentFragment();
            }
        }
        return (x) r32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public static final y b(@NotNull BaseFragment baseFragment) {
        ?? r32;
        Fragment parentFragment = baseFragment.getParentFragment();
        while (true) {
            r32 = parentFragment;
            if (r32 == 0) {
                FragmentActivity fragmentActivityP3 = baseFragment.p3();
                FragmentActivity fragmentActivity = fragmentActivityP3;
                if (!(fragmentActivityP3 instanceof y)) {
                    fragmentActivity = null;
                }
                r32 = (y) fragmentActivity;
            } else {
                if (r32 instanceof y) {
                    break;
                }
                parentFragment = r32.getParentFragment();
            }
        }
        return (y) r32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public static final Et0.c c(@NotNull BaseFragment baseFragment) {
        ?? r32;
        Fragment parentFragment = baseFragment.getParentFragment();
        while (true) {
            r32 = parentFragment;
            if (r32 == 0) {
                FragmentActivity fragmentActivityP3 = baseFragment.p3();
                FragmentActivity fragmentActivity = fragmentActivityP3;
                if (!(fragmentActivityP3 instanceof Et0.c)) {
                    fragmentActivity = null;
                }
                r32 = (Et0.c) fragmentActivity;
            } else {
                if (r32 instanceof Et0.c) {
                    break;
                }
                parentFragment = r32.getParentFragment();
            }
        }
        return (Et0.c) r32;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.search2.main.data.SearchPageStateModel d(@org.jetbrains.annotations.NotNull com.bilibili.lib.ui.BaseFragment r4) {
        /*
            r0 = r4
            com.bilibili.search2.main.y r0 = b(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L16
            r0 = r5
            com.bilibili.search2.main.data.SearchPageStateModel r0 = r0.V4()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L2a
        L16:
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r1 = r0
            r2 = r4
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            r1.<init>(r2)
            java.lang.Class<com.bilibili.search2.main.data.SearchPageStateModel> r1 = com.bilibili.search2.main.data.SearchPageStateModel.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            com.bilibili.search2.main.data.SearchPageStateModel r0 = (com.bilibili.search2.main.data.SearchPageStateModel) r0
            r5 = r0
        L2a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.z.d(com.bilibili.lib.ui.BaseFragment):com.bilibili.search2.main.data.SearchPageStateModel");
    }
}
