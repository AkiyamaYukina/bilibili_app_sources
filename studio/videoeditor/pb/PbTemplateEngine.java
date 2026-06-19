package com.bilibili.studio.videoeditor.pb;

import VC0.C2925a;
import VC0.C2926b;
import VC0.C2930f;
import VC0.D;
import VC0.H;
import VC0.I;
import VC0.o;
import VC0.r;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.CaptionTrack;
import com.bilibili.studio.videoeditor.TimeLine;
import com.bilibili.studio.videoeditor.TimeLineConfig;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.video.story.X;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/pb/PbTemplateEngine.class */
public final class PbTemplateEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public D f109861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public H f109862b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/pb/PbTemplateEngine$Scene.class */
    public static final class Scene {
        private static final EnumEntries $ENTRIES;
        private static final Scene[] $VALUES;

        @NotNull
        private final String des;
        public static final Scene UNDEFINED = new Scene("UNDEFINED", 0, "未定义");
        public static final Scene PRE_DOWNLOAD = new Scene("PRE_DOWNLOAD", 1, "兜底模板预下载");
        public static final Scene INTELLIGENCE = new Scene("INTELLIGENCE", 2, "智能成片");
        public static final Scene SWITCH_REC_TEMPLATE = new Scene("SWITCH_REC_TEMPLATE", 3, "模板列表切换推荐智能模板");
        public static final Scene SWITCH_TEMPLATE = new Scene("SWITCH_TEMPLATE", 4, "模板列表切换模板");
        public static final Scene KING_HONOUR = new Scene("KING_HONOUR", 5, "王者战报");

        private static final /* synthetic */ Scene[] $values() {
            return new Scene[]{UNDEFINED, PRE_DOWNLOAD, INTELLIGENCE, SWITCH_REC_TEMPLATE, SWITCH_TEMPLATE, KING_HONOUR};
        }

        static {
            Scene[] sceneArr$values = $values();
            $VALUES = sceneArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sceneArr$values);
        }

        private Scene(String str, int i7, String str2) {
            this.des = str2;
        }

        @NotNull
        public static EnumEntries<Scene> getEntries() {
            return $ENTRIES;
        }

        public static Scene valueOf(String str) {
            return (Scene) Enum.valueOf(Scene.class, str);
        }

        public static Scene[] values() {
            return (Scene[]) $VALUES.clone();
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/pb/PbTemplateEngine$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public EditVideoInfo f109863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public EditorTemplateTabItemBean f109864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ArrayList<CaptionInfo> f109865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ArrayList<EditTtsInfo> f109866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f109867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f109868f;
        public boolean h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public TimeLine f109872k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public Bgm f109874m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f109869g = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public String f109870i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f109871j = "";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public ArrayList<CaptionInfo> f109873l = new ArrayList<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f109875n = 6;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public Scene f109876o = Scene.UNDEFINED;

        /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.pb.PbTemplateEngine$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/pb/PbTemplateEngine$a$a.class */
        public static final /* synthetic */ class C1209a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f109877a;

            static {
                int[] iArr = new int[Scene.values().length];
                try {
                    iArr[Scene.SWITCH_TEMPLATE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Scene.INTELLIGENCE.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f109877a = iArr;
            }
        }

        public final boolean a() {
            int i7 = C1209a.f109877a[this.f109876o.ordinal()];
            boolean z6 = true;
            if (i7 != 1) {
                z6 = true;
                if (i7 != 2) {
                    z6 = false;
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/pb/PbTemplateEngine$b.class */
    public static final class b implements D.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2926b.a f109878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PbTemplateEngine f109879b;

        public b(C2926b.a aVar, PbTemplateEngine pbTemplateEngine) {
            this.f109878a = aVar;
            this.f109879b = pbTemplateEngine;
        }

        @Override // VC0.D.a
        public final void a(EditorTemplateTabItemBean editorTemplateTabItemBean, String str) {
            this.f109878a.c(editorTemplateTabItemBean, "onTemplateSwitchCancel, " + str);
        }

        @Override // VC0.D.a
        public final void b(EditorTemplateTabItemBean editorTemplateTabItemBean) {
            this.f109878a.a(editorTemplateTabItemBean);
        }

        @Override // VC0.D.a
        public final void c(a aVar, EditorTemplateTabItemBean editorTemplateTabItemBean) {
            C2926b.a aVar2 = this.f109878a;
            this.f109879b.getClass();
            PbTemplateEngine.b(aVar, aVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x1226  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x1592  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021b A[PHI: r20 r21
  0x021b: PHI (r20v1 float) = (r20v0 float), (r20v10 float) binds: [B:69:0x0232, B:65:0x0213] A[DONT_GENERATE, DONT_INLINE]
  0x021b: PHI (r21v1 float) = (r21v0 float), (r21v9 float) binds: [B:69:0x0232, B:65:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [VC0.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(@org.jetbrains.annotations.NotNull com.bilibili.studio.videoeditor.pb.PbTemplateEngine.a r18, @org.jetbrains.annotations.NotNull VC0.C2926b.a r19) {
        /*
            Method dump skipped, instruction units count: 7037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.pb.PbTemplateEngine.b(com.bilibili.studio.videoeditor.pb.PbTemplateEngine$a, VC0.b$a):void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [VC0.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [VC0.a, VC0.r] */
    /* JADX WARN: Type inference failed for: r1v9, types: [VC0.f, VC0.j] */
    public final void a(@NotNull Activity activity, @NotNull BiliTemplateEngineManager biliTemplateEngineManager, @NotNull a aVar, @NotNull H.a aVar2) {
        defpackage.a.b("loadTemplateOnly, ", aVar.f109876o.getDes(), "TemplateActionOnly");
        if (TextUtils.isEmpty(aVar.f109867e) || TextUtils.isEmpty(aVar.f109871j)) {
            aVar2.c(aVar.f109867e, "templateId or downloadUrl is empty");
            return;
        }
        ?? obj = new Object();
        this.f109862b = obj;
        obj.f25325c = 0;
        obj.f25326d = aVar2;
        obj.f25323a = new C2930f(aVar);
        obj.f25324b = new C2925a(aVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        final r rVar = obj.f25324b;
        if (rVar != null) {
            final I i7 = new I(jCurrentTimeMillis, obj);
            if (TextUtils.isEmpty(rVar.f25335d)) {
                i7.a("mTemplateId is empty");
                return;
            }
            rVar.e();
            String str = rVar.f25337f.f109871j;
            if (TextUtils.isEmpty(str)) {
                rVar.d(2001);
                i7.a("downloadUrl is empty");
                return;
            }
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            Bundle bundleA = X.a("bbs_key_template_sdk_montage", true);
            o oVar = new o(0);
            Function3 function3 = new Function3(rVar, jCurrentTimeMillis2, i7) { // from class: VC0.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final r f25386a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f25387b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final I f25388c;

                {
                    this.f25386a = rVar;
                    this.f25387b = jCurrentTimeMillis2;
                    this.f25388c = i7;
                }

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Unit unit;
                    int videoWidth;
                    int videoHeight;
                    String str2 = (String) obj2;
                    byte[] bArr = (byte[]) obj3;
                    Integer num = (Integer) obj4;
                    BLog.e("TemplateActionOnly", "loadTimeline 成功 ");
                    long length = bArr != null ? bArr.length : -1L;
                    r rVar2 = this.f25386a;
                    if (rVar2.f25338g) {
                        BLog.e("TemplateAction", "loadPBTimeline...is cancel now");
                        unit = Unit.INSTANCE;
                    } else {
                        BLog.ifmt("TemplateAction", androidx.compose.ui.input.pointer.k.a(System.currentTimeMillis() - this.f25387b, "loadPBTimeline...time=", ",templatePath = %s, timelineType = %s, timelineByteArray.length = %s"), new Object[]{str2, num, Long.valueOf(length)});
                        TimeLine from = bArr == null ? null : TimeLine.parseFrom(bArr);
                        I i8 = this.f25388c;
                        if (from != null) {
                            C2925a.f(rVar2, 0L, null, null, 7);
                            v0.b(System.currentTimeMillis() - i8.f25327a, "PbLoadOnlyAction onPbLoadSuccess,time=", "TemplateActionOnly");
                            H h = i8.f25328b;
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            TimeLineConfig config = from.getConfig();
                            if (config != null) {
                                videoWidth = (int) config.getVideoWidth();
                                videoHeight = (int) config.getVideoHeight();
                            } else {
                                videoWidth = 1920;
                                videoHeight = 1080;
                            }
                            C2934j c2934j = h.f25323a;
                            if (c2934j != null) {
                                List<CaptionTrack> captionTracksList = from.getCaptionTracksList();
                                new Size(videoWidth, videoHeight);
                                c2934j.j(captionTracksList, new J(jCurrentTimeMillis3, h, from));
                            }
                        } else {
                            rVar2.d(2002);
                            i8.a("createPBTimeline failed");
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            };
            Function1 function1 = new Function1(rVar, i7) { // from class: VC0.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final r f25389a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final I f25390b;

                {
                    this.f25389a = rVar;
                    this.f25390b = i7;
                }

                public final Object invoke(Object obj2) {
                    Throwable th = (Throwable) obj2;
                    BLog.wfmt("TemplateAction", "loadPBTimeline...e = %s", new Object[]{th.fillInStackTrace()});
                    this.f25389a.d(2002);
                    this.f25390b.a(th.getMessage());
                    return Unit.INSTANCE;
                }
            };
            String str2 = rVar.f25335d;
            biliTemplateEngineManager.getClass();
            biliTemplateEngineManager.b(false, false, false, new com.bilibili.studio.videoeditor.template.H(6, activity, bundleA, biliTemplateEngineManager, str2, str, function1, oVar, function3));
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [VC0.D, java.lang.Object] */
    public final void c(@NotNull Activity activity, @NotNull BiliTemplateEngineManager biliTemplateEngineManager, @NotNull a aVar, @NotNull C2926b.a aVar2) {
        defpackage.a.b("switchPbTemplate, ", aVar.f109876o.getDes(), "TemplateAction");
        if (aVar.f109863a == null || aVar.f109864b == null) {
            aVar2.c(aVar.f109864b, "editVideoInfo is null");
            return;
        }
        D d7 = this.f109861a;
        if (d7 != null) {
            d7.c();
        }
        ?? obj = new Object();
        this.f109861a = obj;
        obj.e(activity, biliTemplateEngineManager, aVar, new b(aVar2, this));
    }
}
