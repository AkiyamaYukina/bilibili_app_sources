package com.bilibili.ship.theseus.united.di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.ModuleType;
import com.bapis.bilibili.app.viewunite.common.Staff;
import com.bapis.bilibili.app.viewunite.common.Staffs;
import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6369f;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6370g;
import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/w.class */
@StabilityInferred(parameters = 1)
@Module
public final class w {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/w$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<C6353o> f98783a;

        public a(@NotNull List<C6353o> list) {
            this.f98783a = list;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/w$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98784a;

        static {
            int[] iArr = new int[ModuleType.values().length];
            try {
                iArr[ModuleType.UGC_SEASON.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f98784a = iArr;
        }
    }

    @Provides
    @Nullable
    public static C6369f a(@Nullable IntroductionTab introductionTab) {
        Object next;
        C6369f c6369f = null;
        if (introductionTab != null) {
            List modulesList = introductionTab.getModulesList();
            c6369f = null;
            if (modulesList != null) {
                Iterator it = modulesList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((com.bapis.bilibili.app.viewunite.common.Module) next).getType() == ModuleType.STAFFS) {
                        break;
                    }
                }
                com.bapis.bilibili.app.viewunite.common.Module module = (com.bapis.bilibili.app.viewunite.common.Module) next;
                c6369f = null;
                if (module != null) {
                    Staffs staffs = module.getStaffs();
                    c6369f = null;
                    if (staffs != null) {
                        String title = staffs.getTitle();
                        List staffList = staffs.getStaffList();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(staffList, 10));
                        Iterator it2 = staffList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C6370g.a((Staff) it2.next()));
                        }
                        c6369f = new C6369f(title, arrayList);
                    }
                }
            }
        }
        return c6369f;
    }
}
