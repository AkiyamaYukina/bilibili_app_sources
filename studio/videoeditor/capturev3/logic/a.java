package com.bilibili.studio.videoeditor.capturev3.logic;

import android.content.Context;
import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureBeautyEntity;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureCategoryFilterBean;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureMakeupEntity;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureTemplateEntity;
import com.bilibili.studio.videoeditor.capturev3.filter.FilterListItemV3;
import com.bilibili.studio.videoeditor.media.performance.BeautifyConfigV1;
import com.bilibili.studio.videoeditor.media.performance.BeautifyTemplate;
import com.bilibili.xpref.Xpref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final i f109196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f109197b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109200e;

    @Nullable
    public final ArrayList<sB0.a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ArrayList<CaptureBeautyEntity> f109203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ArrayList<CaptureTemplateEntity> f109204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final ArrayList<CaptureMakeupEntity> f109205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f109206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final HashMap<String, Integer> f109207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public FilterListItemV3 f109208n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f109201f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f109202g = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f109209o = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ArrayList<CaptureCategoryFilterBean> f109198c = new ArrayList<>();

    public a(@Nullable i iVar, @NotNull Context context) {
        this.f109196a = iVar;
        this.f109197b = context;
        ArrayList<sB0.a> arrayList = new ArrayList<>();
        this.h = arrayList;
        ArrayList<CaptureBeautyEntity> arrayList2 = new ArrayList<>();
        this.f109203i = arrayList2;
        this.f109205k = new ArrayList<>();
        this.f109207m = new HashMap<>();
        String string = context.getString(2131842155);
        int size = arrayList2.size();
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841866), "Shrink Face", 2131234853, false, 1.0f, NC0.b.b("Shrink Face"), string, true));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842244), "shrink jaw", 2131234850, false, 1.0f, NC0.b.b("shrink jaw"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842064), "narrow face", 2131234836, false, 1.0f, NC0.b.b("narrow face"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842028), "Chin Length Param", 2131234822, false, 1.0f, NC0.b.b("Chin Length Param"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841901), "sharp chin", 2131234847, false, 1.0f, NC0.b.b("sharp chin"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841991), "apple muscle", 2131234820, false, 1.0f, NC0.b.b("apple muscle"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842230), "shrink cheekbone", 2131234849, false, 1.0f, NC0.b.b("shrink cheekbone"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841748), "shrink under jaw", 2131234851, false, 1.0f, NC0.b.b("shrink under jaw"), string, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841910), "Hairline Height Param", 2131234832, false, 1.0f, NC0.b.b("Hairline Height Param"), string, false));
        arrayList.add(new sB0.a(string, size, arrayList2.size() - 1));
        String string2 = context.getString(2131842027);
        int size2 = arrayList2.size();
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841952), "Whitening", 2131234855, false, 1.0f, NC0.b.b("Whitening"), string2, true));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841937), "average skin color", 2131234826, false, 1.0f, NC0.b.b("average skin color"), string2, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842156), "Strength", 2131234852, false, 1.0f, NC0.b.b("Strength"), string2, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842435), "remove nasolabial folds", 2131234844, false, 1.0f, NC0.b.b("remove nasolabial folds"), string2, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842212), "sharpen", 2131234848, false, 1.0f, NC0.b.b("sharpen"), string2, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842138), "Reddening", 2131234842, false, 1.0f, NC0.b.b("Reddening"), string2, false));
        arrayList.add(new sB0.a(string2, size2, arrayList2.size() - 1));
        String string3 = context.getString(2131842445);
        int size3 = arrayList2.size();
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841947), "Eye Enlarging", 2131234825, false, 1.0f, NC0.b.b("Eye Enlarging"), string3, true));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841830), "eyes vertical move", 2131234829, false, 1.0f, NC0.b.b("eyes vertical move"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841842), "eye angle", 2131234823, false, 1.0f, NC0.b.b("eye angle"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842187), "remove dark circles", 2131234843, false, 1.0f, NC0.b.b("remove dark circles"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841986), "Bright Eye Param", 2131234821, false, 1.0f, NC0.b.b("Bright Eye Param"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842250), "eye distance", 2131234824, false, 1.0f, NC0.b.b("eye distance"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842124), "open canthus", 2131234838, false, 1.0f, NC0.b.b("open canthus"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842299), "outer canthus", 2131234839, false, 1.0f, NC0.b.b("outer canthus"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842015), "eyebrow", 2131234828, false, 1.0f, NC0.b.b("eyebrow"), string3, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842052), "round eye", 2131234846, false, 1.0f, NC0.b.b("round eye"), string3, false));
        arrayList.add(new sB0.a(string3, size3, arrayList2.size() - 1));
        String string4 = context.getString(2131841763);
        int size4 = arrayList2.size();
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841970), "Narrow Nose Param", 2131234837, false, 1.0f, NC0.b.b("Narrow Nose Param"), string4, true));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842024), "long nose", 2131234834, false, 1.0f, NC0.b.b("long nose"), string4, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842017), "wing of nose", 2131234856, false, 1.0f, NC0.b.b("wing of nose"), string4, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842031), "root of nose", 2131234830, false, 1.0f, NC0.b.b("root of nose"), string4, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841950), "bridge of nose", 2131234827, false, 1.0f, NC0.b.b("bridge of nose"), string4, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841820), "profile rhinoplasty", 2131234841, false, 1.0f, NC0.b.b("profile rhinoplasty"), string4, false));
        arrayList.add(new sB0.a(string4, size4, arrayList2.size() - 1));
        String string5 = context.getString(2131841821);
        int size5 = arrayList2.size();
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842137), "Mouth Size Param", 2131234835, false, 1.0f, NC0.b.b("Mouth Size Param"), string5, true));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131841770), "lip", 2131234833, false, 1.0f, NC0.b.b("lip"), string5, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842258), "philtrum", 2131234840, false, 1.0f, NC0.b.b("philtrum"), string5, false));
        arrayList2.add(new CaptureBeautyEntity(context, context.getString(2131842005), "White Teeth Param", 2131234854, false, 1.0f, NC0.b.b("White Teeth Param"), string5, false));
        arrayList.add(new sB0.a(string5, size5, arrayList2.size() - 1));
        for (CaptureBeautyEntity captureBeautyEntity : arrayList2) {
            float f7 = Xpref.getSharedPreferences(this.f109197b, "editor_config").getFloat(b(captureBeautyEntity.params, c()), captureBeautyEntity.defaultValue);
            captureBeautyEntity.currentValue = f7;
            captureBeautyEntity.progress = CaptureBeautyEntity.getProgress(f7, 100, captureBeautyEntity.maxValue);
        }
        ArrayList<sB0.a> arrayList3 = this.h;
        if (arrayList3 != null) {
            int i7 = 0;
            for (sB0.a aVar : arrayList3) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                aVar.d = i7 == 0;
                i7++;
            }
        }
        String string6 = Xpref.getSharedPreferences(this.f109197b, "editor_config").getString("beautify_beauty_select_params_v3", "Shrink Face");
        ArrayList<CaptureBeautyEntity> arrayList4 = this.f109203i;
        if (arrayList4 != null) {
            for (CaptureBeautyEntity captureBeautyEntity2 : arrayList4) {
                captureBeautyEntity2.isSelect = Intrinsics.areEqual(captureBeautyEntity2.params, string6);
            }
        }
    }

    public static String b(String str, String str2) {
        return B0.a.a(str, str2, " V4");
    }

    public static String c() {
        int iB;
        j jVarA = j.a(BiliContext.application());
        zB0.d dVarA = zB0.d.a();
        if (dVarA == null) {
            iB = jVarA.b("DeviceIndex", Integer.MIN_VALUE);
        } else if (dVarA.b) {
            iB = dVarA.a.getNowDeviceIndex();
        } else {
            iB = jVarA.b("DeviceIndex", dVarA.a.getNowDeviceIndex());
            dVarA.b(iB);
        }
        return iB == 1 ? " FRONT CAMERA" : " BACK CAMERA";
    }

    public final void a(int i7) {
        Object next;
        BeautifyConfigV1.BeautifyParams beautifyParams;
        ArrayList<CaptureBeautyEntity> arrayList;
        if (i7 == -1) {
            return;
        }
        Iterator<T> it = com.bilibili.studio.videoeditor.media.performance.a.e().c().templateParamsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((BeautifyTemplate.TemplateParams) next).id == i7) {
                    break;
                }
            }
        }
        BeautifyTemplate.TemplateParams templateParams = (BeautifyTemplate.TemplateParams) next;
        if (templateParams == null || (beautifyParams = templateParams.beautifyParams) == null || (arrayList = this.f109203i) == null) {
            return;
        }
        Iterator<CaptureBeautyEntity> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CaptureBeautyEntity next2 = it2.next();
            if (!TextUtils.isEmpty(next2.params)) {
                float fFloatValue = (i7 == 4 && Xpref.getSharedPreferences(this.f109197b, "editor_config").getInt("beautify_select_template", -1) != -1) ? Xpref.getSharedPreferences(this.f109197b, "editor_config").getFloat(b(next2.params, c()), next2.defaultValue) : beautifyParams.getBeautifyValue(next2.params).floatValue();
                next2.currentValue = fFloatValue;
                i iVar = this.f109196a;
                String str = next2.params;
                LC0.a aVar = iVar.f109252a;
                if (aVar != null) {
                    aVar.o0(fFloatValue, str);
                }
            }
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    @Nullable
    public final HashMap<String, Integer> d() {
        HashMap<String, Integer> map;
        ArrayList<CaptureBeautyEntity> arrayList = this.f109203i;
        if (arrayList != null) {
            for (CaptureBeautyEntity captureBeautyEntity : arrayList) {
                if (!Intrinsics.areEqual(captureBeautyEntity.params, "") && (map = this.f109207m) != null) {
                    map.put(captureBeautyEntity.params, Integer.valueOf((int) (captureBeautyEntity.currentValue * 100)));
                }
            }
        }
        return this.f109207m;
    }

    public final int e() {
        ArrayList<CaptureMakeupEntity> arrayList = this.f109205k;
        if (arrayList == null) {
            return 0;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (arrayList.get(i7).isSelect) {
                return arrayList.get(i7).id;
            }
        }
        return 0;
    }
}
