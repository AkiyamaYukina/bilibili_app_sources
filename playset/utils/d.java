package com.bilibili.playset.utils;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.extra.BLRouterExtraKt;
import com.bilibili.lib.blrouter.extra.FragmentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.s;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/d.class */
public final class d {
    public static final void a(@NotNull Context context, @NotNull Uri uri, @NotNull String str) {
        BLRouter.routeTo(new RouteRequest.Builder(uri).extras(new Pb.d(str, 2)).requestCode(-1).build(), context);
    }

    public static void b(Fragment fragment, RouteRequest routeRequest, int i7, FragmentManager fragmentManager, String str, Function1 function1, Function0 function0) {
        try {
            FragmentActivity fragmentActivityP3 = fragment.p3();
            ViewGroup viewGroup = fragmentActivityP3 != null ? (ViewGroup) fragmentActivityP3.findViewById(i7) : null;
            if (viewGroup == null) {
                function0.invoke();
                return;
            }
            FragmentInfo fragmentInfoFindFragment = BLRouterExtraKt.findFragment(BLRouter.INSTANCE, routeRequest);
            if (fragmentInfoFindFragment != null) {
                Fragment fragmentInstantiate = fragment.getContext() != null ? fragmentManager.getFragmentFactory().instantiate(fragmentInfoFindFragment.getClazz().getClassLoader(), fragmentInfoFindFragment.getClazz().getName()) : null;
                if (function1 != null) {
                    function1.invoke(fragmentInfoFindFragment.getArgs());
                }
                if (fragmentInstantiate != null) {
                    fragmentInstantiate.setArguments(fragmentInfoFindFragment.getArgs());
                }
                Unit unit = null;
                if (fragmentInstantiate != null) {
                    FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                    fragmentTransactionBeginTransaction.setReorderingAllowed(true);
                    fragmentTransactionBeginTransaction.replace(viewGroup.getId(), fragmentInstantiate, str);
                    fragmentTransactionBeginTransaction.setCustomAnimations(2130772508, 2130772509);
                    fragmentTransactionBeginTransaction.addToBackStack(str);
                    fragmentTransactionBeginTransaction.commit();
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            function0.invoke();
            Unit unit2 = Unit.INSTANCE;
        } catch (Exception e7) {
            e7.printStackTrace();
            function0.invoke();
        }
    }

    public static final void c(@Nullable Context context, @Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        s.b(context, str);
    }
}
