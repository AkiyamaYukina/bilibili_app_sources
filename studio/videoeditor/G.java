package com.bilibili.studio.videoeditor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.FileInfo;
import com.bilibili.studio.videoeditor.gamemaker.GameSchemeBean;
import com.bilibili.upper.module.gamemaker.GameMakerRouterActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/G.class */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile G f108863b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f108864a;

    public static IndependentCaptureFragment a(LB0.a aVar, @Nullable String str, yB0.d dVar, yB0.b bVar) {
        int i7 = IndependentCaptureFragment.f109161L;
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("JUMP_PARAMS", str);
        }
        IndependentCaptureFragment independentCaptureFragmentA = IndependentCaptureFragment.a.a(bundle, false, "", false);
        Yv0.c cVar = ((BaseVMFragment) independentCaptureFragmentA).b;
        if (cVar == null) {
            independentCaptureFragmentA.f109170I = aVar;
        } else {
            ((IndependentCaptureViewModel) cVar).f109304q = aVar;
        }
        independentCaptureFragmentA.f109108g = dVar;
        independentCaptureFragmentA.h = bVar;
        H.a().f108866a = aVar.f116374b;
        H.a().f108867b = 4;
        return independentCaptureFragmentA;
    }

    public static G b() {
        G g7;
        synchronized (G.class) {
            try {
                if (f108863b == null) {
                    G g8 = new G();
                    g8.f108864a = new D();
                    f108863b = g8;
                }
                g7 = f108863b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g7;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, rC0.a] */
    public final boolean c(GameMakerRouterActivity gameMakerRouterActivity, final GameSchemeBean gameSchemeBean) {
        if (gameMakerRouterActivity == null || TextUtils.isEmpty(gameSchemeBean.uri)) {
            return false;
        }
        final EditVideoInfo editVideoInfo = new EditVideoInfo();
        editVideoInfo.setCaller("contribution");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FileInfo(gameSchemeBean.uri));
        editVideoInfo.setVideoList(arrayList);
        final vC0.a aVar = new vC0.a(gameMakerRouterActivity, gameSchemeBean);
        aVar.setIsNewUI(true);
        this.f108864a = aVar;
        ?? obj = new Object();
        ((rC0.a) obj).a = editVideoInfo.m10450clone();
        AC0.i.a(gameMakerRouterActivity.getApplicationContext());
        mC0.a.a(((rC0.a) obj).a.getEditVideoGrayControl());
        rC0.b.a().a = null;
        rC0.b.a().a = obj;
        H.a().f108866a = ((rC0.a) obj).a.getCaller();
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/editor_main/")).extras(new Function1(aVar, editVideoInfo, gameSchemeBean) { // from class: com.bilibili.studio.videoeditor.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final vC0.a f108860a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final EditVideoInfo f108861b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final GameSchemeBean f108862c;

            {
                this.f108860a = aVar;
                this.f108861b = editVideoInfo;
                this.f108862c = gameSchemeBean;
            }

            public final Object invoke(Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_new_ui", this.f108860a.isNewUI());
                bundle.putInt("key_editor_mode_v2", this.f108861b.getEditorMode());
                bundle.putSerializable("gamemaker_data", this.f108862c);
                ((MutableBundleLike) obj2).put("param_control", bundle);
                return null;
            }
        }).build(), gameMakerRouterActivity);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rC0.a] */
    public final void d(Context context, EditVideoInfo editVideoInfo, @Nullable D d7, int i7) {
        ?? obj = new Object();
        ((rC0.a) obj).a = editVideoInfo.m10450clone();
        AC0.i.a(context.getApplicationContext());
        mC0.a.a(((rC0.a) obj).a.getEditVideoGrayControl());
        rC0.b.a().a = null;
        rC0.b.a().a = obj;
        H.a().f108866a = ((rC0.a) obj).a.getCaller();
        Bundle bundle = new Bundle();
        if (d7 != null) {
            this.f108864a = d7;
            bundle.putBoolean("auto_play", ((rC0.a) obj).a.autoPlay);
            bundle.putInt("key_editor_mode_v2", ((rC0.a) obj).a.getEditorMode());
            bundle.putBoolean("is_new_ui", d7.isNewUI());
            bundle.putBoolean("recommend_music", d7.isRecommendMusic());
            bundle.putBoolean("need_open_template_panel", d7.isNeedOpenTemplatePanel());
        }
        if (i7 == 10) {
            bundle.putBoolean("return_edit_data", true);
        }
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/editor_main/")).extras(new com.bilibili.bililive.biz.pkv2.adapter.container.e(bundle, 3)).requestCode(i7).build(), context);
    }
}
