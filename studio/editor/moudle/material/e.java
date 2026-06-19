package com.bilibili.studio.editor.moudle.material;

import G.p;
import android.app.Application;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.bilibili.aurorasdk.AuroraVersion;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.montage.MontageVersion;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.material.MaterialConfig;
import com.bilibili.studio.material.MaterialSdk;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.module.DefaultProcessor;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import j4.t;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import w8.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/e.class */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<String> f107890d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Pair<String, EditorMaterialEntity> f107891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f107892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public volatile CopyOnWriteArrayList<h> f107893c = new CopyOnWriteArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/e$a.class */
    public static final class a {
        public static void a(MaterialSdk materialSdk, MaterialType materialType, String str) {
            MaterialConfig.MaterialConfigBuilder finalDir = new MaterialConfig.MaterialConfigBuilder().filePath(str).getFinalDir(false);
            com.bilibili.studio.editor.timeline.d dVar = com.bilibili.studio.editor.timeline.d.f108285a;
            dVar.getClass();
            String auroraVersion = AuroraVersion.getAuroraVersion();
            String str2 = auroraVersion;
            if (auroraVersion == null) {
                str2 = "";
            }
            MaterialConfig.MaterialConfigBuilder materialConfigBuilderAuroraVersion = finalDir.auroraVersion(str2);
            dVar.getClass();
            MaterialConfig.MaterialConfigBuilder materialConfigBuilderMontageVersion = materialConfigBuilderAuroraVersion.montageVersion(MontageVersion.getVersion());
            if (Intrinsics.areEqual(MaterialType.CaptionTemplate.INSTANCE, materialType) || Intrinsics.areEqual(MaterialType.CaptionAnimation.INSTANCE, materialType) || Intrinsics.areEqual(MaterialType.Flower.INSTANCE, materialType)) {
                materialConfigBuilderMontageVersion.customBatchPreStrategy(new com.bilibili.studio.material.g<>());
            }
            materialSdk.addMaterialConfig(materialType, materialConfigBuilderMontageVersion.build());
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable com.bilibili.studio.editor.moudle.material.g r13) {
            /*
                com.bilibili.studio.material.internal.EngineType r0 = com.bilibili.studio.material.internal.EngineType.Montage
                r15 = r0
                r0 = r12
                int r0 = r0.hashCode()
                r14 = r0
                r0 = r14
                r1 = 3148879(0x300c4f, float:4.41252E-39)
                if (r0 == r1) goto L49
                r0 = r14
                r1 = 552573414(0x20ef99e6, float:4.0590016E-19)
                if (r0 == r1) goto L36
                r0 = r14
                r1 = 1860712128(0x6ee836c0, float:3.5933355E28)
                if (r0 == r1) goto L23
                goto L52
            L23:
                r0 = r12
                java.lang.String r1 = "fancy_word"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2f
                goto L52
            L2f:
                com.bilibili.studio.material.MaterialType$Flower r0 = com.bilibili.studio.material.MaterialType.Flower.INSTANCE
                r12 = r0
            L33:
                goto L60
            L36:
                r0 = r12
                java.lang.String r1 = "caption"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L42
                goto L52
            L42:
                com.bilibili.studio.material.MaterialType$CaptionTemplate r0 = com.bilibili.studio.material.MaterialType.CaptionTemplate.INSTANCE
                r12 = r0
                goto L33
            L49:
                r0 = r12
                java.lang.String r1 = "font"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L59
            L52:
                com.bilibili.studio.material.MaterialType$CaptionTemplate r0 = com.bilibili.studio.material.MaterialType.CaptionTemplate.INSTANCE
                r12 = r0
                goto L33
            L59:
                com.bilibili.studio.material.MaterialType$Font r0 = com.bilibili.studio.material.MaterialType.Font.INSTANCE
                r12 = r0
                goto L33
            L60:
                com.bilibili.studio.material.MaterialSdk r0 = com.bilibili.studio.material.MaterialSdk.INSTANCE
                r1 = r10
                r2 = r11
                r3 = r12
                java.lang.String r4 = "cover_editor"
                r5 = r15
                com.bilibili.studio.editor.moudle.material.c r6 = new com.bilibili.studio.editor.moudle.material.c
                r7 = r6
                r8 = r13
                r7.<init>(r8)
                com.bilibili.studio.material.MaterialTask r0 = r0.downloadSingleMaterialById(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.material.e.a.b(kotlinx.coroutines.CoroutineScope, java.lang.String, java.lang.String, com.bilibili.studio.editor.moudle.material.g):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.Nullable com.bilibili.studio.editor.moudle.material.g r13) {
            /*
                com.bilibili.studio.material.internal.EngineType r0 = com.bilibili.studio.material.internal.EngineType.Montage
                r14 = r0
                r0 = r12
                int r0 = r0.hashCode()
                switch(r0) {
                    case -1890252483: goto L70;
                    case 3148879: goto L5d;
                    case 552573414: goto L4a;
                    case 1860712128: goto L37;
                    default: goto L34;
                }
            L34:
                goto L79
            L37:
                r0 = r12
                java.lang.String r1 = "fancy_word"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L43
                goto L79
            L43:
                com.bilibili.studio.material.MaterialType$Flower r0 = com.bilibili.studio.material.MaterialType.Flower.INSTANCE
                r12 = r0
            L47:
                goto L87
            L4a:
                r0 = r12
                java.lang.String r1 = "caption"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L56
                goto L79
            L56:
                com.bilibili.studio.material.MaterialType$CaptionTemplate r0 = com.bilibili.studio.material.MaterialType.CaptionTemplate.INSTANCE
                r12 = r0
                goto L47
            L5d:
                r0 = r12
                java.lang.String r1 = "font"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L69
                goto L79
            L69:
                com.bilibili.studio.material.MaterialType$Font r0 = com.bilibili.studio.material.MaterialType.Font.INSTANCE
                r12 = r0
                goto L47
            L70:
                r0 = r12
                java.lang.String r1 = "sticker"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L80
            L79:
                com.bilibili.studio.material.MaterialType$CaptionTemplate r0 = com.bilibili.studio.material.MaterialType.CaptionTemplate.INSTANCE
                r12 = r0
                goto L47
            L80:
                com.bilibili.studio.material.MaterialType$Sticker r0 = com.bilibili.studio.material.MaterialType.Sticker.INSTANCE
                r12 = r0
                goto L47
            L87:
                com.bilibili.studio.material.MaterialSdk r0 = com.bilibili.studio.material.MaterialSdk.INSTANCE
                r1 = r10
                r2 = r11
                r3 = r12
                java.lang.String r4 = "cover_editor"
                r5 = r14
                com.bilibili.studio.editor.moudle.material.d r6 = new com.bilibili.studio.editor.moudle.material.d
                r7 = r6
                r8 = r13
                r7.<init>(r8)
                com.bilibili.studio.material.MaterialTask r0 = r0.downloadSingleMaterialByUrl(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.material.e.a.c(kotlinx.coroutines.CoroutineScope, java.lang.String, java.lang.String, com.bilibili.studio.editor.moudle.material.g):void");
        }

        @JvmStatic
        @NotNull
        public static String d() {
            return p.a(ConfigV3.a(), "aurora.captioncontext");
        }

        @JvmStatic
        public static void e() {
            Application application = BiliContext.application();
            if (application == null) {
                return;
            }
            MaterialSdk materialSdk = MaterialSdk.INSTANCE;
            if (materialSdk.isInitialized()) {
                materialSdk.reset();
            }
            b bVar = b.f107887c;
            MaterialSdk materialSdkAddMaterialProcessor = materialSdk.addMaterialProcessor(bVar, new DefaultProcessor());
            a(materialSdkAddMaterialProcessor, bVar, OC0.h.j(application));
            a(materialSdkAddMaterialProcessor, MaterialType.VideoAnimation.INSTANCE, OC0.h.w(application));
            a(materialSdkAddMaterialProcessor, MaterialType.Font.INSTANCE, OC0.h.i(application));
            a(materialSdkAddMaterialProcessor, MaterialType.CaptionTemplate.INSTANCE, OC0.h.i(application));
            a(materialSdkAddMaterialProcessor, MaterialType.Flower.INSTANCE, OC0.h.i(application) + "flower");
            a(materialSdkAddMaterialProcessor, MaterialType.CaptionAnimation.INSTANCE, OC0.h.h(application));
            a(materialSdkAddMaterialProcessor, MaterialType.Filter.INSTANCE, OC0.h.r(application));
            a(materialSdkAddMaterialProcessor, MaterialType.Transition.INSTANCE, OC0.h.v(application));
            a(materialSdkAddMaterialProcessor, MaterialType.Sticker.INSTANCE, OC0.h.t(application));
            materialSdkAddMaterialProcessor.addFilterDirBlackList("BVECache").addFilterDirBlackList(".idea").addFilterDirBlackList("__MACOSX").addMontageSupportMaterialTypes(e.f107890d).init(application);
        }
    }

    static {
        JSONArray jSONArray;
        try {
            jSONArray = JSON.parseArray((String) ConfigManager.Companion.config().get("material_download.support_montage_material_type", "[\"effect\",\"filter\",\"transition\",\"sticker\",\"fancy_word\",\"caption\",\"video_animation\",\"compound_caption\",\"caption_animation\"]"));
        } catch (Exception e7) {
            jSONArray = new JSONArray();
            CollectionsKt.e(jSONArray, new String[]{"effect", "filter", "transition", "sticker", "fancy_word", UtilsKt.CaptionPath, "video_animation", "compound_caption", "caption_animation"});
        }
        f107890d = CollectionsKt.toList(jSONArray);
    }

    public static final void a(e eVar, Throwable th) {
        eVar.getClass();
        M.b("handleError ", th.getMessage(), "EditorMaterialService");
        for (h hVar : eVar.f107893c) {
            Function0<Boolean> function0 = hVar.f107897c;
            if (function0 != null && ((Boolean) function0.invoke()).booleanValue()) {
                return;
            } else {
                hVar.f107895a.invoke(th);
            }
        }
        eVar.f107893c.clear();
    }

    public final void b(@NotNull h hVar) {
        EditorMaterialEntity editorMaterialEntity;
        EditorMaterialEntity editorMaterialEntityM10403clone;
        t.a("requestMaterialEntity useCache=true isProcessing=", "EditorMaterialService", this.f107892b);
        Pair<String, EditorMaterialEntity> pair = this.f107891a;
        if (pair != null && (editorMaterialEntity = (EditorMaterialEntity) pair.second) != null && (editorMaterialEntityM10403clone = editorMaterialEntity.m10403clone()) != null) {
            Function0<Boolean> function0 = hVar.f107897c;
            if (function0 != null) {
            }
            hVar.f107896b.invoke(editorMaterialEntityM10403clone);
            return;
        }
        this.f107891a = null;
        this.f107893c.add(hVar);
        if (this.f107892b) {
            return;
        }
        this.f107892b = true;
        TC0.i iVar = (TC0.i) ServiceGenerator.createService(TC0.i.class);
        String strA = y.a();
        com.bilibili.studio.editor.timeline.d dVar = com.bilibili.studio.editor.timeline.d.f108285a;
        dVar.getClass();
        String version = MontageVersion.getVersion();
        dVar.getClass();
        String auroraVersion = AuroraVersion.getAuroraVersion();
        String str = auroraVersion;
        if (auroraVersion == null) {
            str = "";
        }
        iVar.getEditorMaterialData(strA, "mon", version, str).enqueue(new f(this));
    }
}
