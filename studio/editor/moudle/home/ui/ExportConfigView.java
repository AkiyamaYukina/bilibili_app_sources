package com.bilibili.studio.editor.moudle.home.ui;

import TB0.C2889v;
import Yv0.d;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bilibili.ad.adview.pegasus.holders.inline.player.egg.tragger.slide.f;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.studio.videoeditor.util.ResolutionType;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ExportConfigView.class */
public final class ExportConfigView extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f107256i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ResolutionSeekBar f107257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f107258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ResolutionType f107259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public b f107260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f107261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c f107262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final HashMap<ResolutionType, String> f107263g;

    @NotNull
    public final C2889v h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ExportConfigView$a.class */
    public interface a {
        void onDismiss();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ExportConfigView$b.class */
    public interface b {
        void a(@NotNull ResolutionType resolutionType);

        void b(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/ui/ExportConfigView$c.class */
    public interface c {
        void onClick();
    }

    public ExportConfigView(@NotNull Context context) {
        this(context, null);
    }

    public ExportConfigView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        C2889v c2889vBind = C2889v.bind(LayoutInflater.from(context).inflate(2131493988, (ViewGroup) this, true));
        this.h = c2889vBind;
        setOrientation(1);
        View viewFindViewById = findViewById(2131297874);
        this.f107258b = viewFindViewById;
        viewFindViewById.setOnClickListener(new jz0.a(this));
        c2889vBind.f24010d.setOnClickListener(new com.bilibili.playset.playlist.edit.b(this, 2));
        ResolutionSeekBar resolutionSeekBar = (ResolutionSeekBar) findViewById(2131310951);
        this.f107257a = resolutionSeekBar;
        resolutionSeekBar.setIconsBitmap(new Bitmap[]{null, null, null, BitmapFactory.decodeResource(getResources(), 2131232182)});
        this.f107263g = MapsKt.hashMapOf(new Pair[]{new Pair(ResolutionType.RES_480, d.a(2131849556)), new Pair(ResolutionType.RES_720, d.a(2131849060)), new Pair(ResolutionType.RES_1080, d.a(2131850340)), new Pair(ResolutionType.RES_2160, d.a(2131849795))});
        resolutionSeekBar.setOnThumbIndexChangedListener(new jz0.b(this));
        c2889vBind.f24012f.setOnCheckedChangeListener(new jz0.c(this));
    }

    public static void a(ExportConfigView exportConfigView, int i7, String str, boolean z6) {
        f.a(bilibili.live.app.service.resolver.a.b(i7, "onThumbIndexChanged thumbIndex: ", ", thumbText: ", str, ", fromUser: "), z6, "ExportConfigView");
        ResolutionType resolutionType = exportConfigView.f107259c;
        if (resolutionType == null || i7 != resolutionType.ordinal()) {
            exportConfigView.f107259c = ResolutionType.valueOf(i7);
            exportConfigView.setConfigTips(ResolutionType.valueOf(i7));
            b bVar = exportConfigView.f107260d;
            if (bVar != null) {
                bVar.a(ResolutionType.valueOf(i7));
            }
        }
    }

    private final String[] getSectionTexts() {
        return getResources().getStringArray(2130903160);
    }

    private final void setConfigTips(ResolutionType resolutionType) {
        Activity activity = BiliContext.topActivity();
        boolean zIsActive = ActivityExtKt.isActive(activity);
        Context fapp = activity;
        if (!zIsActive) {
            fapp = FoundationAlias.getFapp();
        }
        String string = fapp.getString(2131850340);
        String str = this.f107263g.get(resolutionType);
        if (str == null) {
            str = string;
        }
        this.h.f24011e.setText(str);
    }

    public final void b(@NotNull ResolutionType resolutionType) {
        this.f107259c = resolutionType;
        this.f107257a.setCurrentThumbIndex(resolutionType.ordinal());
        setConfigTips(resolutionType);
    }

    public final void c(@NotNull ResolutionType resolutionType, boolean z6) {
        if (!z6) {
            this.f107257a.setSectionTexts(getSectionTexts());
        }
        if (z6 || resolutionType != ResolutionType.RES_2160) {
            b(resolutionType);
        } else {
            BLog.e("ExportConfigView", "showData error support4K=false,resolutionType=2160");
        }
    }

    public final void setOnClickHelpListener(@NotNull c cVar) {
        this.f107262f = cVar;
    }

    public final void setOnDismissListener(@NotNull a aVar) {
        this.f107261e = aVar;
    }

    public final void setOnExportConfigChangedListener(@NotNull b bVar) {
        this.f107260d = bVar;
    }
}
