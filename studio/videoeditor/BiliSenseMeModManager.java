package com.bilibili.studio.videoeditor;

import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/BiliSenseMeModManager.class */
public final class BiliSenseMeModManager {

    @NotNull
    public static final String MOD_NAME_BLIVE_CV_MODELS = "blive_cv_models";

    @NotNull
    public static final String POOL_NAME_UPER = "uper";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static BiliSenseMeModManager f108828g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f108835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f108836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f108837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final List<String> f108838r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f108839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f108840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f108841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OnSenseMeModResourceUpdateCallback f108842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final u f108843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f108844f;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static String h = ConfigV3.c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f108829i = ConfigV3.f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f108830j = ConfigV3.h();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f108831k = ConfigV3.j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static String f108832l = "android_aurora_thirdparty";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f108833m = ConfigV3.k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f108834n = ConfigV3.d();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/BiliSenseMeModManager$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object awaitModReady$default(Companion companion, Set set, Continuation continuation, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                List list = BiliSenseMeModManager.f108838r;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new s((String) it.next()));
                }
                set = CollectionsKt.toSet(arrayList);
            }
            return companion.awaitModReady(set, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object awaitModReady(@org.jetbrains.annotations.NotNull java.util.Set<com.bilibili.studio.videoeditor.s> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Set<com.bilibili.studio.videoeditor.s>> r8) {
            /*
                r6 = this;
                r0 = r8
                boolean r0 = r0 instanceof com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$1
                if (r0 == 0) goto L29
                r0 = r8
                com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$1 r0 = (com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$1) r0
                r10 = r0
                r0 = r10
                int r0 = r0.label
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r10
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r10
                r8 = r0
                goto L33
            L29:
                com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$1 r0 = new com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$1
                r1 = r0
                r2 = r6
                r3 = r8
                r1.<init>(r2, r3)
                r8 = r0
            L33:
                r0 = r8
                java.lang.Object r0 = r0.result
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r11 = r0
                r0 = r8
                int r0 = r0.label
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L69
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L5f
                r0 = r8
                java.lang.Object r0 = r0.L$0
                java.util.Set r0 = (java.util.Set) r0
                r7 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r10
                r8 = r0
                goto Lac
            L5f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L69:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                com.bilibili.studio.videoeditor.BiliSenseMeModManager r0 = r0.instance()
                r12 = r0
                r0 = r12
                com.bilibili.studio.videoeditor.u r0 = com.bilibili.studio.videoeditor.BiliSenseMeModManager.access$getStore$p(r0)
                kotlinx.coroutines.flow.StateFlow<com.bilibili.studio.videoeditor.t> r0 = r0.f110193b
                r10 = r0
                com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$3 r0 = new com.bilibili.studio.videoeditor.BiliSenseMeModManager$Companion$awaitModReady$3
                r1 = r0
                r2 = r12
                r3 = r7
                r4 = 0
                r1.<init>(r2, r3, r4)
                r12 = r0
                r0 = r8
                r1 = r7
                r0.L$0 = r1
                r0 = r8
                r1 = 1
                r0.label = r1
                r0 = r10
                r1 = r12
                r2 = r8
                java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1, r2)
                r10 = r0
                r0 = r10
                r8 = r0
                r0 = r10
                r1 = r11
                if (r0 != r1) goto Lac
                r0 = r11
                return r0
            Lac:
                r0 = r8
                com.bilibili.studio.videoeditor.t r0 = (com.bilibili.studio.videoeditor.t) r0
                java.util.Set<com.bilibili.studio.videoeditor.s> r0 = r0.f109903c
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = r7
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r0 = kotlin.collections.CollectionsKt.intersect(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.BiliSenseMeModManager.Companion.awaitModReady(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final String getBMM_BEAUTY_RES() {
            return BiliSenseMeModManager.f108837q;
        }

        @NotNull
        public final String getSO_NAME_AURORA_THIRD_PART() {
            return BiliSenseMeModManager.f108832l;
        }

        public final String getSO_NAME_BMM() {
            return BiliSenseMeModManager.f108829i;
        }

        public final String getSO_NAME_BMM_AURORA() {
            return BiliSenseMeModManager.h;
        }

        public final String getSO_NAME_BMM_EFFECT() {
            return BiliSenseMeModManager.f108834n;
        }

        public final String getSO_NAME_BMM_IMAGE_FILTER() {
            return BiliSenseMeModManager.f108835o;
        }

        public final String getSO_NAME_CV() {
            return BiliSenseMeModManager.f108830j;
        }

        public final String getSO_NAME_MON() {
            return BiliSenseMeModManager.f108831k;
        }

        public final String getSO_NAME_MON_THIRD_PART() {
            return BiliSenseMeModManager.f108833m;
        }

        @NotNull
        public final BiliSenseMeModManager instance() {
            if (BiliSenseMeModManager.f108828g == null) {
                synchronized (this) {
                    if (BiliSenseMeModManager.f108828g == null) {
                        BiliSenseMeModManager.f108828g = new BiliSenseMeModManager(null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return BiliSenseMeModManager.f108828g;
        }

        public final void setSO_NAME_AURORA_THIRD_PART(@NotNull String str) {
            BiliSenseMeModManager.f108832l = str;
        }

        public final void setSO_NAME_BMM(String str) {
            BiliSenseMeModManager.f108829i = str;
        }

        public final void setSO_NAME_BMM_AURORA(String str) {
            BiliSenseMeModManager.h = str;
        }

        public final void setSO_NAME_BMM_EFFECT(String str) {
            BiliSenseMeModManager.f108834n = str;
        }

        public final void setSO_NAME_BMM_IMAGE_FILTER(String str) {
            BiliSenseMeModManager.f108835o = str;
        }

        public final void setSO_NAME_CV(String str) {
            BiliSenseMeModManager.f108830j = str;
        }

        public final void setSO_NAME_MON(String str) {
            BiliSenseMeModManager.f108831k = str;
        }

        public final void setSO_NAME_MON_THIRD_PART(String str) {
            BiliSenseMeModManager.f108833m = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/BiliSenseMeModManager$OnSenseMeModResourceUpdateCallback.class */
    public interface OnSenseMeModResourceUpdateCallback {
        void onFailed(@Nullable String str, @Nullable String str2);

        void onProgress(@Nullable String str, @Nullable Float f7);

        void onSuccess();
    }

    static {
        String strE = ConfigV3.e();
        f108835o = strE;
        f108836p = "android_aurora_resources";
        f108837q = "BMM_BEAUTY_RES";
        f108838r = CollectionsKt.listOf(new String[]{h, f108829i, f108834n, strE, f108832l, f108830j, MOD_NAME_BLIVE_CV_MODELS, "android_cv_model_3", "android_aurora_resources"});
    }

    public BiliSenseMeModManager() {
        HashMap<String, String> map = new HashMap<>();
        this.f108839a = map;
        HashMap<String, String> map2 = new HashMap<>();
        this.f108840b = map2;
        HashMap<String, String> map3 = new HashMap<>();
        this.f108841c = map3;
        this.f108843e = new u();
        this.f108844f = new HashMap<>();
        String str = h;
        map.put(str, a(str, ""));
        String str2 = f108829i;
        map.put(str2, a(str2, ""));
        String str3 = f108834n;
        map.put(str3, a(str3, ""));
        String str4 = f108835o;
        map.put(str4, a(str4, ""));
        String str5 = f108832l;
        map.put(str5, a(str5, ""));
        String str6 = f108830j;
        map.put(str6, a(str6, ""));
        map2.put("android_cv_model_3", a("android_cv_model_3", ""));
        map2.put(MOD_NAME_BLIVE_CV_MODELS, a(MOD_NAME_BLIVE_CV_MODELS, ""));
        String str7 = f108836p;
        map3.put(str7, a(str7, ""));
        String str8 = f108831k;
        map.put(str8, a(str8, ""));
        String str9 = f108833m;
        map.put(str9, a(str9, ""));
    }

    public /* synthetic */ BiliSenseMeModManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String a(String str, String str2) throws NoWhenBranchMatchedException {
        ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), "uper", str);
        boolean zIsAvailable = modResource.isAvailable();
        u uVar = this.f108843e;
        if (zIsAvailable && FC0.a.a(modResource)) {
            uVar.a(new s(str), LoadStatus.SUCCESS);
            return B0.a.a(modResource.getResourceDirPath(), File.separator, str2);
        }
        s sVar = new s(str, str2);
        uVar.a(sVar, LoadStatus.Loading);
        ModResourceClient.getInstance().update(BiliContext.application(), new ModUpdateRequest.Builder("uper", str).isForce(true).isImmediate(true).build(), new C6602j(this, str, str2, sVar));
        return "";
    }

    @Nullable
    public final String getAuroraPath() {
        return this.f108839a.get(h);
    }

    @Nullable
    public final String getAuroraThirdPartSoPath() {
        return this.f108839a.get(f108832l);
    }

    @Nullable
    public final String getBMMEffectSoPath() {
        return this.f108839a.get(f108834n);
    }

    @Nullable
    public final String getBMMImageFilterSoPath() {
        return this.f108839a.get(f108835o);
    }

    @Nullable
    public final String getBMMSoPath() {
        return this.f108839a.get(f108829i);
    }

    @Nullable
    public final String getBeautyResMap() {
        return this.f108844f.get(f108837q);
    }

    @NotNull
    public final HashMap<String, String> getBiliResModResourceMap() {
        return this.f108841c;
    }

    @NotNull
    public final HashMap<String, String> getBiliSoModResourceMap() {
        return this.f108839a;
    }

    @Nullable
    public final String getCVModelPath(@NotNull String str) {
        return this.f108840b.get(str);
    }

    @NotNull
    public final HashMap<String, String> getCVModelsModResourceMap() {
        return this.f108840b;
    }

    @Nullable
    public final String getCVSoPath() {
        return this.f108839a.get(f108830j);
    }

    @Nullable
    public final String getMonSoPath() {
        return this.f108839a.get(f108831k);
    }

    @Nullable
    public final String getMonThirdPartSoPath() {
        return this.f108839a.get(f108833m);
    }

    @Nullable
    public final String getResPath() {
        return this.f108841c.get(f108836p);
    }

    public final boolean isSenseMeModResourcesExisted() {
        Iterator<Map.Entry<String, String>> it = this.f108839a.entrySet().iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next().getValue())) {
                return false;
            }
        }
        Iterator<Map.Entry<String, String>> it2 = this.f108840b.entrySet().iterator();
        while (it2.hasNext()) {
            if (TextUtils.isEmpty(it2.next().getValue())) {
                return false;
            }
        }
        Iterator<Map.Entry<String, String>> it3 = this.f108841c.entrySet().iterator();
        while (it3.hasNext()) {
            if (TextUtils.isEmpty(it3.next().getValue())) {
                return false;
            }
        }
        return true;
    }

    public final void removeModResourceUpdateCallback() {
        this.f108842d = null;
    }

    public final void setBeautyResMap(@NotNull String str) {
        this.f108844f.put(f108837q, str);
    }

    public final void setModResourceUpdateCallback(@NotNull OnSenseMeModResourceUpdateCallback onSenseMeModResourceUpdateCallback) {
        this.f108842d = onSenseMeModResourceUpdateCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void updateModResource(@NotNull String str) throws NoWhenBranchMatchedException {
        a(str, "");
    }
}
