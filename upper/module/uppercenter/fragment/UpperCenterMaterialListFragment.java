package com.bilibili.upper.module.uppercenter.fragment;

import TE0.b;
import YI0.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.room.B;
import bF0.D0;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.upper.api.bean.centerv4.BCutToolsTab;
import com.bilibili.upper.module.bcut.network.bean.Bgm;
import com.bilibili.upper.module.bcut.network.bean.MaterialItem;
import e4.c;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterMaterialListFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterMaterialListFragment extends BaseVMFragment<com.bilibili.upper.module.uppercenter.model.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f114099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f114100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114101g;

    @Nullable
    public Integer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<BCutSoleBean> f114102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<MaterialItem> f114103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<Bgm> f114104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public List<MaterialItem> f114105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public D0 f114106m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterMaterialListFragment$BCutSoleBean.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class BCutSoleBean {
        public static final int $stable = 8;

        @Nullable
        private List<String> covers;

        @Nullable
        private String desc;

        @Nullable
        private String name;

        @Nullable
        private Integer type;

        @Nullable
        private String url;

        public BCutSoleBean() {
            this(null, null, null, null, null, 31, null);
        }

        public BCutSoleBean(@Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            this.covers = list;
            this.desc = str;
            this.name = str2;
            this.url = str3;
            this.type = num;
        }

        public /* synthetic */ BCutSoleBean(List list, String str, String str2, String str3, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BCutSoleBean copy$default(BCutSoleBean bCutSoleBean, List list, String str, String str2, String str3, Integer num, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = bCutSoleBean.covers;
            }
            if ((i7 & 2) != 0) {
                str = bCutSoleBean.desc;
            }
            if ((i7 & 4) != 0) {
                str2 = bCutSoleBean.name;
            }
            if ((i7 & 8) != 0) {
                str3 = bCutSoleBean.url;
            }
            if ((i7 & 16) != 0) {
                num = bCutSoleBean.type;
            }
            return bCutSoleBean.copy(list, str, str2, str3, num);
        }

        @Nullable
        public final List<String> component1() {
            return this.covers;
        }

        @Nullable
        public final String component2() {
            return this.desc;
        }

        @Nullable
        public final String component3() {
            return this.name;
        }

        @Nullable
        public final String component4() {
            return this.url;
        }

        @Nullable
        public final Integer component5() {
            return this.type;
        }

        @NotNull
        public final BCutSoleBean copy(@Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            return new BCutSoleBean(list, str, str2, str3, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BCutSoleBean)) {
                return false;
            }
            BCutSoleBean bCutSoleBean = (BCutSoleBean) obj;
            return Intrinsics.areEqual(this.covers, bCutSoleBean.covers) && Intrinsics.areEqual(this.desc, bCutSoleBean.desc) && Intrinsics.areEqual(this.name, bCutSoleBean.name) && Intrinsics.areEqual(this.url, bCutSoleBean.url) && Intrinsics.areEqual(this.type, bCutSoleBean.type);
        }

        @Nullable
        public final List<String> getCovers() {
            return this.covers;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            List<String> list = this.covers;
            int iHashCode = 0;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            String str = this.desc;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.name;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.url;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            Integer num = this.type;
            if (num != null) {
                iHashCode = num.hashCode();
            }
            return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
        }

        public final void setCovers(@Nullable List<String> list) {
            this.covers = list;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setType(@Nullable Integer num) {
            this.type = num;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        @NotNull
        public String toString() {
            List<String> list = this.covers;
            String str = this.desc;
            String str2 = this.name;
            String str3 = this.url;
            Integer num = this.type;
            StringBuilder sb = new StringBuilder("BCutSoleBean(covers=");
            sb.append(list);
            sb.append(", desc=");
            sb.append(str);
            sb.append(", name=");
            B.a(str2, ", url=", str3, ", type=", sb);
            return c.a(sb, num, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterMaterialListFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f114107a;

        public a(k kVar) {
            this.f114107a = kVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f114107a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f114107a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void initView() {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenter.fragment.UpperCenterMaterialListFragment.initView():void");
    }

    @Nullable
    public final View jf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        D0 d0Inflate = D0.inflate(layoutInflater, viewGroup, false);
        this.f114106m = d0Inflate;
        return d0Inflate != null ? d0Inflate.f54683a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lf() {
        List<BCutToolsTab> list;
        BCutToolsTab bCutToolsTab;
        List<BCutSoleBean> array;
        List<MaterialItem> array2;
        List<Bgm> array3;
        List<MaterialItem> array4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i7 = arguments.getInt("tab_position");
            com.bilibili.upper.module.uppercenter.model.a aVar = (com.bilibili.upper.module.uppercenter.model.a) ((BaseVMFragment) this).b;
            this.f114101g = aVar != null ? aVar.f114116c : 0;
            this.h = aVar != null ? aVar.f114117d : null;
            if (aVar == null || (list = aVar.f114118e) == null || (bCutToolsTab = (BCutToolsTab) CollectionsKt.getOrNull(list, i7)) == null) {
                return;
            }
            this.f114099e = bCutToolsTab.getId();
            this.f114100f = bCutToolsTab.getName();
            String list2 = bCutToolsTab.getList();
            String str = list2;
            if (list2 == null) {
                str = "";
            }
            long j7 = this.f114099e;
            if (j7 == 1) {
                try {
                    array = JSON.parseArray(str, BCutSoleBean.class);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    array = null;
                }
                this.f114102i = array;
                return;
            }
            if (j7 == 2) {
                try {
                    array2 = JSON.parseArray(str, MaterialItem.class);
                } catch (Exception e8) {
                    e8.printStackTrace();
                    array2 = null;
                }
                this.f114103j = array2;
                return;
            }
            if (j7 == 3) {
                try {
                    array3 = JSON.parseArray(str, Bgm.class);
                } catch (Exception e9) {
                    e9.printStackTrace();
                    array3 = null;
                }
                this.f114104k = array3;
                return;
            }
            if (j7 == 4) {
                try {
                    array4 = JSON.parseArray(str, MaterialItem.class);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    array4 = null;
                }
                this.f114105l = array4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Yv0.c mf() {
        FragmentActivity fragmentActivityP3 = p3();
        return fragmentActivityP3 == null ? null : (com.bilibili.upper.module.uppercenter.model.a) R0.k.a(fragmentActivityP3, com.bilibili.upper.module.uppercenter.model.a.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void of() {
        MutableLiveData<Integer> mutableLiveData;
        com.bilibili.upper.module.uppercenter.model.a aVar = (com.bilibili.upper.module.uppercenter.model.a) ((BaseVMFragment) this).b;
        if (aVar == null || (mutableLiveData = aVar.f114119f) == null) {
            return;
        }
        mutableLiveData.observe(getViewLifecycleOwner(), new a(new k(this, 0)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f114106m = null;
    }

    public final void rf(long j7) {
        long j8 = this.f114099e;
        int i7 = j8 == 2 ? 46 : j8 == 3 ? 3 : j8 == 4 ? 19 : 0;
        b bVar = b.f24088a;
        int i8 = this.f114101g;
        String str = this.f114100f;
        Integer num = this.h;
        HashMap mapA = VF0.b.a(bVar);
        mapA.put("is_newup", String.valueOf(i8));
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        P4.a.a(i7, "material_type", str2, "material_type_id", mapA);
        mapA.put("material_id", String.valueOf(j7));
        if (num != null) {
            mapA.put("up_type", String.valueOf(num.intValue()));
        }
        Neurons.reportClick(false, "creation.creation-new-subsequent.material-toolbox.material.click", mapA);
    }
}
