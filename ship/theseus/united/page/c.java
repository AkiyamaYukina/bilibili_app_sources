package com.bilibili.ship.theseus.united.page;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Class<? extends Fragment>, Function0<Fragment>> f99077a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/c$a.class */
    public static final class a extends FragmentFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f99078a;

        public a(c cVar) {
            this.f99078a = cVar;
        }

        @Override // androidx.fragment.app.FragmentFactory
        public final Fragment instantiate(ClassLoader classLoader, String str) {
            Function0 function0 = (Function0) ((LinkedHashMap) this.f99078a.f99077a).get(FragmentFactory.loadFragmentClass(classLoader, str));
            Fragment fragment = function0 != null ? (Fragment) function0.invoke() : null;
            Fragment fragmentInstantiate = fragment;
            if (fragment == null) {
                fragmentInstantiate = super.instantiate(classLoader, str);
            }
            return fragmentInstantiate;
        }
    }

    @Inject
    public c(@NotNull FragmentManager fragmentManager) {
        fragmentManager.setFragmentFactory(new a(this));
        this.f99077a = new LinkedHashMap();
    }

    public final <T extends Fragment> void a(@NotNull Class<T> cls, @NotNull Function0<? extends T> function0) {
        this.f99077a.put(cls, function0);
        defpackage.a.b("[theseus-united-TheseusFragmentFactoryRepository-registerFragmentCreator] ", "register fragment creator for ".concat(cls.getSimpleName()), "TheseusFragmentFactoryRepository-registerFragmentCreator");
    }

    public final <T extends Fragment> void b(@NotNull Class<T> cls) {
        this.f99077a.remove(cls);
        defpackage.a.b("[theseus-united-TheseusFragmentFactoryRepository-unregisterFragmentCreator] ", "unregister fragment creator for ".concat(cls.getSimpleName()), "TheseusFragmentFactoryRepository-unregisterFragmentCreator");
    }
}
