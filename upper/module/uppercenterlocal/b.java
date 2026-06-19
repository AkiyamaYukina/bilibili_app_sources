package com.bilibili.upper.module.uppercenterlocal;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bilibili.adcommon.utils.i;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.upper.api.bean.center.UpperMainUpToolsSectionBeanV3;
import com.bilibili.upper.api.bean.centerv4.UpperCenterIndexResV4;
import com.bilibili.upper.api.bean.centerv4.UpperMainCommonServiceBean;
import com.bilibili.upper.api.bean.centerv4.UpperMainUpInfoBean;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<FragmentActivity> f114243a;

    public b(@NotNull FragmentActivity fragmentActivity) {
        this.f114243a = new WeakReference<>(fragmentActivity);
    }

    public static void a(String str, List list) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (StringsKt.Z(str, "http://") || StringsKt.Z(str, "https://")) {
            ((ArrayList) list).add(str);
        }
    }

    public static Object b(Class cls, String str) {
        Object object = null;
        if (str != null) {
            if (str.length() == 0) {
                object = null;
            } else {
                try {
                    object = JSON.parseObject(str, (Class<Object>) cls);
                } catch (Exception e7) {
                    i.a("parseData failed for ", cls.getSimpleName(), ": ", e7.getMessage(), "UpperCenterImageFetcher");
                    object = null;
                }
            }
        }
        return object;
    }

    public final void c(@NotNull UpperCenterIndexResV4 upperCenterIndexResV4) {
        List list;
        FragmentActivity fragmentActivity = this.f114243a.get();
        if (fragmentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<UpperCenterIndexResV4.UpperCenterCard> modules = upperCenterIndexResV4.getModules();
        if (modules != null) {
            for (UpperCenterIndexResV4.UpperCenterCard upperCenterCard : modules) {
                int type = upperCenterCard.getType();
                if (type != 1 && type != 1007) {
                    if (type == 6) {
                        UpperMainCommonServiceBean upperMainCommonServiceBean = (UpperMainCommonServiceBean) b(UpperMainCommonServiceBean.class, upperCenterCard.getData());
                        if (upperMainCommonServiceBean != null && (list = upperMainCommonServiceBean.list) != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                a(((UpperMainUpToolsSectionBeanV3) it.next()).icon, arrayList);
                            }
                        }
                    } else if (type == 7 || type == 2007 || type == 2008) {
                    }
                }
                UpperMainUpInfoBean upperMainUpInfoBean = (UpperMainUpInfoBean) b(UpperMainUpInfoBean.class, upperCenterCard.getData());
                if (upperMainUpInfoBean != null) {
                    a(upperMainUpInfoBean.getAvatar(), arrayList);
                    if (MultipleThemeUtils.isNightTheme(fragmentActivity.getApplication())) {
                        a(upperMainUpInfoBean.getBackgroundPicNight(), arrayList);
                    } else {
                        a(upperMainUpInfoBean.getBackgroundPicDay(), arrayList);
                    }
                }
            }
        }
        List<String> listDistinct = CollectionsKt.distinct(arrayList);
        if (listDistinct.isEmpty()) {
            return;
        }
        com.bilibili.ad.adview.pegasus.banner.toplive.b.a(listDistinct.size(), "prefetch ", " images", "UpperCenterImageFetcher");
        for (String str : listDistinct) {
            try {
                com.bilibili.lib.image2.i iVarAsEncodedImage = BiliImageLoader.INSTANCE.acquire(fragmentActivity).useRaw().asEncodedImage();
                iVarAsEncodedImage.b = Uri.parse(str);
                iVarAsEncodedImage.a().subscribe(new a(str));
            } catch (Exception e7) {
                i.a("prefetchSingle error url=", str, " ", e7.getMessage(), "UpperCenterImageFetcher");
            }
        }
    }
}
