package com.bilibili.opd.app.bizcommon.radar.ui.dynamicview;

import EH0.i;
import JS0.f;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import androidx.fragment.app.FragmentActivity;
import cn0.d;
import com.bilibili.ad.adview.story.c;
import com.bilibili.api.utils.FastJsonUtils;
import com.bilibili.dynamicview2.view.widget.DynamicViewContainer;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import in0.e;
import java.net.URLDecoder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qn0.C8462h;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/dynamicview/RadarDynamicScriptViewDialog.class */
@StabilityInferred(parameters = 0)
public final class RadarDynamicScriptViewDialog extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RadarTriggerContent f74450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f74451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f74452k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/dynamicview/RadarDynamicScriptViewDialog$Template.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Template {
        public static final int $stable = 8;

        @Nullable
        private String script;

        @Nullable
        private String template;

        public Template() {
            this(null, null, 3, null);
        }

        public Template(@Nullable String str, @Nullable String str2) {
            this.template = str;
            this.script = str2;
        }

        public /* synthetic */ Template(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Template copy$default(Template template, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = template.template;
            }
            if ((i7 & 2) != 0) {
                str2 = template.script;
            }
            return template.copy(str, str2);
        }

        @Nullable
        public final String component1() {
            return this.template;
        }

        @Nullable
        public final String component2() {
            return this.script;
        }

        @NotNull
        public final Template copy(@Nullable String str, @Nullable String str2) {
            return new Template(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Template)) {
                return false;
            }
            Template template = (Template) obj;
            return Intrinsics.areEqual(this.template, template.template) && Intrinsics.areEqual(this.script, template.script);
        }

        @Nullable
        public final String getScript() {
            return this.script;
        }

        @Nullable
        public final String getTemplate() {
            return this.template;
        }

        public int hashCode() {
            String str = this.template;
            int iHashCode = 0;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.script;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final void setScript(@Nullable String str) {
            this.script = str;
        }

        public final void setTemplate(@Nullable String str) {
            this.template = str;
        }

        @NotNull
        public String toString() {
            return p.a("Template(template=", this.template, ", script=", this.script, ")");
        }
    }

    public RadarDynamicScriptViewDialog(@NotNull RadarTriggerContent radarTriggerContent, @NotNull FragmentActivity fragmentActivity, @NotNull String str) {
        super(radarTriggerContent, fragmentActivity, str);
        this.f74450i = radarTriggerContent;
        this.f74451j = str;
        this.f74452k = LazyKt.lazy(new i(this, 3));
    }

    @Override // in0.e
    @Nullable
    public final View b() {
        return null;
    }

    @Override // in0.e
    public final void j() {
        d dVar = (d) c.a(BLRouter.INSTANCE, d.class, (String) null, 1, (Object) null);
        if (dVar != null) {
            String id = this.f74450i.getId();
            String str = id;
            if (id == null) {
                str = "";
            }
            dVar.b("dynamicViewV2", str, "", this.f74450i.getConvertReportMap(), this.f74450i.getAttachInfo());
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        j();
    }

    @Override // in0.e, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        String extra;
        String extra2;
        super.onCreate(bundle);
        setContentView(2131499191);
        setCancelable(true);
        String template = this.f74450i.getTemplate();
        if (template == null || template.length() == 0 || (extra = this.f74450i.getExtra()) == null || extra.length() == 0) {
            BLog.e("RadarDynamicScriptViewDialog=>data error....");
            dismiss();
            return;
        }
        String template2 = this.f74450i.getTemplate();
        if (template2 == null || (extra2 = this.f74450i.getExtra()) == null) {
            return;
        }
        try {
            Template template3 = (Template) FastJsonUtils.parse(template2, Template.class);
            JsonObject asJsonObject = JsonParser.parseString(extra2).getAsJsonObject();
            DynamicViewContainer dynamicViewContainer = (DynamicViewContainer) this.f74452k.getValue();
            String template4 = template3.getTemplate();
            String str = template4;
            if (template4 == null) {
                str = "";
            }
            String strDecode = URLDecoder.decode(str);
            String script = template3.getScript();
            if (script == null) {
                script = "";
            }
            C8462h.d(dynamicViewContainer, strDecode, URLDecoder.decode(script), asJsonObject, this.f74451j, this.f74450i, getContext(), new f(this, 6));
            dismiss();
        } catch (Exception e7) {
            e7.printStackTrace();
            dismiss();
            Unit unit = Unit.INSTANCE;
        }
    }
}
